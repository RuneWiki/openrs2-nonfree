import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!km")
public final class Class180 implements Runnable {

	@OriginalMember(owner = "client!km", name = "e", descriptor = "Lclient!lr;")
	private Class203 aClass203_1;

	@OriginalMember(owner = "client!km", name = "i", descriptor = "J")
	private long aLong147;

	@OriginalMember(owner = "client!km", name = "f", descriptor = "Z")
	private volatile boolean aBoolean413 = true;

	@OriginalMember(owner = "client!km", name = "a", descriptor = "Z")
	private volatile boolean aBoolean412 = true;

	@OriginalMember(owner = "client!km", name = "h", descriptor = "Z")
	private volatile boolean aBoolean414 = false;

	@OriginalMember(owner = "client!km", name = "b", descriptor = "[I")
	private final int[] anIntArray298 = new int[3];

	@OriginalMember(owner = "client!km", name = "c", descriptor = "[Lclient!am;")
	private final Class4_Sub3[] aClass4_Sub3Array4 = new Class4_Sub3[8];

	@OriginalMember(owner = "client!km", name = "d", descriptor = "I")
	private final int anInt5756;

	@OriginalMember(owner = "client!km", name = "g", descriptor = "Lclient!r;")
	private final Class7 aClass7_11;

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "(ILclient!r;)V")
	public Class180(@OriginalArg(0) int arg0, @OriginalArg(1) Class7 arg1) {
		this.anInt5756 = arg0;
		this.aClass7_11 = arg1;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "()V")
	public void method4444() {
		this.aBoolean413 = false;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!km", name = "b", descriptor = "()V")
	private void method4445() {
		this.aClass7_11.method7839(this.anInt5756);
		while (!this.aBoolean413 && this.aBoolean412) {
			if (this.aClass203_1 == null || this.aClass203_1.method4823()) {
				this.aBoolean414 = false;
				this.aLong147 = Static518.aClass149_1.method6647();
				synchronized (this) {
					try {
						this.wait();
					} catch (@Pc(168) InterruptedException local168) {
					}
				}
			} else {
				this.aBoolean414 = true;
				@Pc(21) Class21 local21 = this.aClass203_1.method4817();
				if (local21 instanceof Class21_Sub1) {
					@Pc(27) Class21_Sub1 local27 = (Class21_Sub1) local21;
					if (local27.aBoolean714) {
						local27.method8233(Static299.aClass7_12);
					} else {
						Static214.method3482(local27, this.aClass4_Sub3Array4);
						if (Static386.aClass45_6 != null) {
							Static386.aClass45_6.method4843(local27.anInt10553, this.aClass203_1.aString122, -16777216, -256, local27.anInt10556);
						}
					}
				} else {
					@Pc(58) int local58 = ((Class21_Sub2) local21).anInt2287;
					if (local58 >= 1 && local58 <= 4) {
						@Pc(70) Class115 local70 = Static255.aClass115Array2[local58 - 1];
						for (@Pc(72) int local72 = 0; local72 < Static30.anInt1124 + Static30.anInt1124; local72++) {
							for (@Pc(75) int local75 = 0; local75 < Static30.anInt1124 + Static30.anInt1124; local75++) {
								if (Static375.aBooleanArrayArrayArray2[local58 - 1][local72][local75]) {
									@Pc(92) int local92 = Static465.anInt8858 + local72 - Static30.anInt1124;
									@Pc(98) int local98 = Static78.anInt1933 + local75 - Static30.anInt1124;
									if (local92 >= 0 && local92 < local70.anInt10330 && local98 >= 0 && local98 < local70.anInt10327) {
										Static299.aClass7_12.MA(local92 << Static392.anInt3635, local70.method8055(local98, local92), local98 << Static392.anInt3635, this.anIntArray298);
										if (Static418.method6590(this.anIntArray298[0]) == this.anInt5756 - 1) {
											local70.method8061(local92, local98);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		this.aClass7_11.method7810(this.anInt5756);
		while (this.aBoolean413 && this.aBoolean412) {
			synchronized (this) {
				try {
					this.wait();
				} catch (@Pc(195) InterruptedException local195) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!km", name = "c", descriptor = "()V")
	public void method4446() {
		this.aBoolean413 = false;
		this.aBoolean412 = false;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!km", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean412) {
			this.method4445();
		}
	}

	@OriginalMember(owner = "client!km", name = "d", descriptor = "()Z")
	public boolean method4447() {
		return this.aClass203_1 == null || !this.aBoolean414 && this.aClass203_1.method4823();
	}

	@OriginalMember(owner = "client!km", name = "e", descriptor = "()V")
	public void method4448() {
		this.aBoolean413 = true;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!km", name = "f", descriptor = "()J")
	public long method4449() {
		return this.aLong147;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Lclient!lr;)V")
	public void method4450(@OriginalArg(0) Class203 arg0) {
		if (this.aClass203_1 != null) {
			this.aClass203_1.method4818(null);
		}
		this.aClass203_1 = arg0;
		if (this.aClass203_1 != null) {
			this.aClass203_1.method4818(this);
		}
	}
}
