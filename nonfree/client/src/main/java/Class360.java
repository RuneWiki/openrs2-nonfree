import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!un")
public final class Class360 implements Runnable {

	@OriginalMember(owner = "client!un", name = "b", descriptor = "Lclient!tt;")
	private Class345 aClass345_1;

	@OriginalMember(owner = "client!un", name = "g", descriptor = "J")
	private long aLong299;

	@OriginalMember(owner = "client!un", name = "c", descriptor = "[I")
	private final int[] anIntArray561 = new int[3];

	@OriginalMember(owner = "client!un", name = "e", descriptor = "[Lclient!jw;")
	private final Class5_Sub3[] aClass5_Sub3Array6 = new Class5_Sub3[8];

	@OriginalMember(owner = "client!un", name = "f", descriptor = "Z")
	private volatile boolean aBoolean727 = true;

	@OriginalMember(owner = "client!un", name = "a", descriptor = "Z")
	private volatile boolean aBoolean726 = true;

	@OriginalMember(owner = "client!un", name = "h", descriptor = "Z")
	private volatile boolean aBoolean728 = false;

	@OriginalMember(owner = "client!un", name = "i", descriptor = "I")
	private final int anInt9818;

	@OriginalMember(owner = "client!un", name = "d", descriptor = "Lclient!ha;")
	private final Class143 aClass143_14;

	@OriginalMember(owner = "client!un", name = "<init>", descriptor = "(ILclient!ha;)V")
	public Class360(@OriginalArg(0) int arg0, @OriginalArg(1) Class143 arg1) {
		this.anInt9818 = arg0;
		this.aClass143_14 = arg1;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "()V")
	public void method8170() {
		this.aBoolean727 = true;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "()V")
	public void method8171() {
		this.aBoolean727 = false;
		this.aBoolean726 = false;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!un", name = "c", descriptor = "()V")
	public void method8172() {
		this.aBoolean727 = false;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!un", name = "d", descriptor = "()V")
	private void method8173() {
		this.aClass143_14.method6218(this.anInt9818);
		while (!this.aBoolean727 && this.aBoolean726) {
			if (this.aClass345_1 == null || this.aClass345_1.method7945()) {
				this.aBoolean728 = false;
				this.aLong299 = Static515.aClass60_2.method3499();
				synchronized (this) {
					try {
						this.wait();
					} catch (@Pc(168) InterruptedException local168) {
					}
				}
			} else {
				this.aBoolean728 = true;
				@Pc(21) Class41 local21 = this.aClass345_1.method7953();
				if (local21 instanceof Class41_Sub1) {
					@Pc(27) Class41_Sub1 local27 = (Class41_Sub1) local21;
					if (local27.aBoolean763) {
						local27.method8662(Static267.aClass143_6);
					} else {
						Static534.method8659(local27, this.aClass5_Sub3Array6);
						if (Static140.aClass72_6 != null) {
							Static140.aClass72_6.method6925(local27.anInt10365, this.aClass345_1.aString102, local27.anInt10363, -16777216, -256);
						}
					}
				} else {
					@Pc(58) int local58 = ((Class41_Sub10) local21).anInt10203;
					if (local58 >= 1 && local58 <= 4) {
						@Pc(70) Class88 local70 = Static298.aClass88Array3[local58 - 1];
						for (@Pc(72) int local72 = 0; local72 < Static537.anInt10357 + Static537.anInt10357; local72++) {
							for (@Pc(75) int local75 = 0; local75 < Static537.anInt10357 + Static537.anInt10357; local75++) {
								if (Static630.aBooleanArrayArrayArray2[local58 - 1][local72][local75]) {
									@Pc(92) int local92 = Static281.anInt4404 + local72 - Static537.anInt10357;
									@Pc(98) int local98 = Static411.anInt7045 + local75 - Static537.anInt10357;
									if (local92 >= 0 && local92 < local70.anInt10541 && local98 >= 0 && local98 < local70.anInt10545) {
										Static267.aClass143_6.H(local92 << Static138.anInt2287, local70.method8749(local92, local98), local98 << Static138.anInt2287, this.anIntArray561);
										if (Static194.method8415(this.anIntArray561[0]) == this.anInt9818 - 1) {
											local70.method8750(local92, local98);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		this.aClass143_14.method6190(this.anInt9818);
		while (this.aBoolean727 && this.aBoolean726) {
			synchronized (this) {
				try {
					this.wait();
				} catch (@Pc(195) InterruptedException local195) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!un", name = "e", descriptor = "()Z")
	public boolean method8174() {
		return this.aClass345_1 == null || !this.aBoolean728 && this.aClass345_1.method7945();
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Lclient!tt;)V")
	public void method8175(@OriginalArg(0) Class345 arg0) {
		if (this.aClass345_1 != null) {
			this.aClass345_1.method7947((Class360) null);
		}
		this.aClass345_1 = arg0;
		if (this.aClass345_1 != null) {
			this.aClass345_1.method7947(this);
		}
	}

	@OriginalMember(owner = "client!un", name = "f", descriptor = "()J")
	public long method8176() {
		return this.aLong299;
	}

	@OriginalMember(owner = "client!un", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean726) {
			this.method8173();
		}
	}
}
