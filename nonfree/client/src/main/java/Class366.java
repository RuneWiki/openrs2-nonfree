import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!waa")
public final class Class366 implements Runnable {

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "J")
	private long aLong270;

	@OriginalMember(owner = "client!waa", name = "b", descriptor = "Lclient!cia;")
	private Class59 aClass59_1;

	@OriginalMember(owner = "client!waa", name = "g", descriptor = "[Lclient!ab;")
	private final Class2_Sub1[] aClass2_Sub1Array6 = new Class2_Sub1[8];

	@OriginalMember(owner = "client!waa", name = "f", descriptor = "[I")
	private final int[] anIntArray699 = new int[3];

	@OriginalMember(owner = "client!waa", name = "i", descriptor = "Z")
	private volatile boolean aBoolean733 = true;

	@OriginalMember(owner = "client!waa", name = "d", descriptor = "Z")
	private volatile boolean aBoolean732 = true;

	@OriginalMember(owner = "client!waa", name = "c", descriptor = "Z")
	private volatile boolean aBoolean731 = false;

	@OriginalMember(owner = "client!waa", name = "h", descriptor = "I")
	private final int anInt10784;

	@OriginalMember(owner = "client!waa", name = "e", descriptor = "Lclient!ha;")
	private final Class20 aClass20_15;

	@OriginalMember(owner = "client!waa", name = "<init>", descriptor = "(ILclient!ha;)V")
	public Class366(@OriginalArg(0) int arg0, @OriginalArg(1) Class20 arg1) {
		this.anInt10784 = arg0;
		this.aClass20_15 = arg1;
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "()J")
	public long method8988() {
		return this.aLong270;
	}

	@OriginalMember(owner = "client!waa", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean732) {
			this.method8991();
		}
	}

	@OriginalMember(owner = "client!waa", name = "b", descriptor = "()V")
	public void method8989() {
		this.aBoolean733 = false;
		this.aBoolean732 = false;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(Lclient!cia;)V")
	public void method8990(@OriginalArg(0) Class59 arg0) {
		if (this.aClass59_1 != null) {
			this.aClass59_1.method2124(null);
		}
		this.aClass59_1 = arg0;
		if (this.aClass59_1 != null) {
			this.aClass59_1.method2124(this);
		}
	}

	@OriginalMember(owner = "client!waa", name = "c", descriptor = "()V")
	private void method8991() {
		this.aClass20_15.method7262(this.anInt10784);
		while (!this.aBoolean733 && this.aBoolean732) {
			if (this.aClass59_1 == null || this.aClass59_1.method2128()) {
				this.aBoolean731 = false;
				this.aLong270 = Static386.aClass158_1.method6230();
				synchronized (this) {
					try {
						this.wait();
					} catch (@Pc(168) InterruptedException local168) {
					}
				}
			} else {
				this.aBoolean731 = true;
				@Pc(21) Class3 local21 = this.aClass59_1.method2130();
				if (local21 instanceof Class3_Sub1) {
					@Pc(27) Class3_Sub1 local27 = (Class3_Sub1) local21;
					if (local27.aBoolean705) {
						local27.method8611(Static194.aClass20_5);
					} else {
						Static237.method4459(local27, this.aClass2_Sub1Array6);
						if (Static151.aClass68_6 != null) {
							Static151.aClass68_6.method8107(this.aClass59_1.aString15, -256, local27.anInt10305, local27.anInt10309, -16777216);
						}
					}
				} else {
					@Pc(58) int local58 = ((Class3_Sub10) local21).anInt10676;
					if (local58 >= 1 && local58 <= 4) {
						@Pc(70) Class65 local70 = Static9.aClass65Array1[local58 - 1];
						for (@Pc(72) int local72 = 0; local72 < Static177.anInt4273 + Static177.anInt4273; local72++) {
							for (@Pc(75) int local75 = 0; local75 < Static177.anInt4273 + Static177.anInt4273; local75++) {
								if (Static359.aBooleanArrayArrayArray2[local58 - 1][local72][local75]) {
									@Pc(92) int local92 = Static120.anInt3199 + local72 - Static177.anInt4273;
									@Pc(98) int local98 = Static360.anInt7144 + local75 - Static177.anInt4273;
									if (local92 >= 0 && local92 < local70.anInt9615 && local98 >= 0 && local98 < local70.anInt9618) {
										Static194.aClass20_5.H(local92 << Static151.anInt3896, local70.method7995(local98, local92), local98 << Static151.anInt3896, this.anIntArray699);
										if (Static135.method3069(this.anIntArray699[0]) == this.anInt10784 - 1) {
											local70.method7992(local92, local98);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		this.aClass20_15.method7281(this.anInt10784);
		while (this.aBoolean733 && this.aBoolean732) {
			synchronized (this) {
				try {
					this.wait();
				} catch (@Pc(195) InterruptedException local195) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!waa", name = "d", descriptor = "()V")
	public void method8992() {
		this.aBoolean733 = true;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!waa", name = "e", descriptor = "()V")
	public void method8993() {
		this.aBoolean733 = false;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!waa", name = "f", descriptor = "()Z")
	public boolean method8994() {
		return this.aClass59_1 == null || !this.aBoolean731 && this.aClass59_1.method2128();
	}
}
