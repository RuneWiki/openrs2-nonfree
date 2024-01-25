import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class301 implements Runnable {

	@OriginalMember(owner = "client!re", name = "e", descriptor = "Lclient!ut;")
	private Class350 aClass350_1;

	@OriginalMember(owner = "client!re", name = "h", descriptor = "J")
	private long aLong221;

	@OriginalMember(owner = "client!re", name = "c", descriptor = "[I")
	private final int[] anIntArray652 = new int[3];

	@OriginalMember(owner = "client!re", name = "f", descriptor = "Z")
	private volatile boolean aBoolean694 = true;

	@OriginalMember(owner = "client!re", name = "b", descriptor = "Z")
	private volatile boolean aBoolean693 = true;

	@OriginalMember(owner = "client!re", name = "g", descriptor = "Z")
	private volatile boolean aBoolean695 = false;

	@OriginalMember(owner = "client!re", name = "i", descriptor = "[Lclient!tn;")
	private final Class5_Sub27[] aClass5_Sub27Array6 = new Class5_Sub27[8];

	@OriginalMember(owner = "client!re", name = "d", descriptor = "I")
	private final int anInt8319;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "Lclient!ha;")
	private final Class126 aClass126_18;

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "(ILclient!ha;)V")
	public Class301(@OriginalArg(0) int arg0, @OriginalArg(1) Class126 arg1) {
		this.anInt8319 = arg0;
		this.aClass126_18 = arg1;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "()V")
	public void method7144() {
		this.aBoolean694 = true;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!ut;)V")
	public void method7145(@OriginalArg(0) Class350 arg0) {
		if (this.aClass350_1 != null) {
			this.aClass350_1.method8256((Class301) null);
		}
		this.aClass350_1 = arg0;
		if (this.aClass350_1 != null) {
			this.aClass350_1.method8256(this);
		}
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "()V")
	private void method7146() {
		this.aClass126_18.method7049(this.anInt8319);
		while (!this.aBoolean694 && this.aBoolean693) {
			if (this.aClass350_1 == null || this.aClass350_1.method8251()) {
				this.aBoolean695 = false;
				this.aLong221 = Static18.aClass179_1.method7485();
				synchronized (this) {
					try {
						this.wait();
					} catch (@Pc(168) InterruptedException local168) {
					}
				}
			} else {
				this.aBoolean695 = true;
				@Pc(21) Class14 local21 = this.aClass350_1.method8254();
				if (local21 instanceof Class14_Sub1) {
					@Pc(27) Class14_Sub1 local27 = (Class14_Sub1) local21;
					if (local27.aBoolean760) {
						local27.method7997(Static480.aClass126_12);
					} else {
						Static362.method5664(local27, this.aClass5_Sub27Array6);
						if (Static154.aClass6_6 != null) {
							Static154.aClass6_6.method7214(local27.anInt9313, this.aClass350_1.aString132, local27.anInt9319, -16777216, -256);
						}
					}
				} else {
					@Pc(58) int local58 = ((Class14_Sub6) local21).anInt2308;
					if (local58 >= 1 && local58 <= 4) {
						@Pc(70) Class40 local70 = Static299.aClass40Array1[local58 - 1];
						for (@Pc(72) int local72 = 0; local72 < Static597.anInt9765 + Static597.anInt9765; local72++) {
							for (@Pc(75) int local75 = 0; local75 < Static597.anInt9765 + Static597.anInt9765; local75++) {
								if (Static563.aBooleanArrayArrayArray2[local58 - 1][local72][local75]) {
									@Pc(92) int local92 = Static484.anInt8046 + local72 - Static597.anInt9765;
									@Pc(98) int local98 = Static263.anInt4379 + local75 - Static597.anInt9765;
									if (local92 >= 0 && local92 < local70.anInt9920 && local98 >= 0 && local98 < local70.anInt9923) {
										Static480.aClass126_12.H(local92 << Static162.anInt2830, local70.method8442(local92, local98), local98 << Static162.anInt2830, this.anIntArray652);
										if (Static217.method3302(this.anIntArray652[0]) == this.anInt8319 - 1) {
											local70.method8445(local92, local98);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		this.aClass126_18.method7010(this.anInt8319);
		while (this.aBoolean694 && this.aBoolean693) {
			synchronized (this) {
				try {
					this.wait();
				} catch (@Pc(195) InterruptedException local195) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "()V")
	public void method7147() {
		this.aBoolean694 = false;
		this.aBoolean693 = false;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!re", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean693) {
			this.method7146();
		}
	}

	@OriginalMember(owner = "client!re", name = "d", descriptor = "()Z")
	public boolean method7148() {
		return this.aClass350_1 == null || !this.aBoolean695 && this.aClass350_1.method8251();
	}

	@OriginalMember(owner = "client!re", name = "e", descriptor = "()J")
	public long method7149() {
		return this.aLong221;
	}

	@OriginalMember(owner = "client!re", name = "f", descriptor = "()V")
	public void method7150() {
		this.aBoolean694 = false;
		synchronized (this) {
			this.notify();
		}
	}
}
