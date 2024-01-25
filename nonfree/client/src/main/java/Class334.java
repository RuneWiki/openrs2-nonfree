import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tq")
public final class Class334 implements Runnable {

	@OriginalMember(owner = "client!tq", name = "i", descriptor = "J")
	private long aLong285;

	@OriginalMember(owner = "client!tq", name = "e", descriptor = "Lclient!dt;")
	private Class95 aClass95_1;

	@OriginalMember(owner = "client!tq", name = "g", descriptor = "[Lclient!uf;")
	private final Class5_Sub43[] aClass5_Sub43Array6 = new Class5_Sub43[8];

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "[I")
	private final int[] anIntArray540 = new int[3];

	@OriginalMember(owner = "client!tq", name = "h", descriptor = "Z")
	private volatile boolean aBoolean746 = true;

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "Z")
	private volatile boolean aBoolean748 = true;

	@OriginalMember(owner = "client!tq", name = "f", descriptor = "Z")
	private volatile boolean aBoolean747 = false;

	@OriginalMember(owner = "client!tq", name = "d", descriptor = "I")
	private final int anInt9738;

	@OriginalMember(owner = "client!tq", name = "c", descriptor = "Lclient!ha;")
	private final Class57 aClass57_13;

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(ILclient!ha;)V")
	public Class334(@OriginalArg(0) int arg0, @OriginalArg(1) Class57 arg1) {
		this.anInt9738 = arg0;
		this.aClass57_13 = arg1;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lclient!dt;)V")
	public void method8342(@OriginalArg(0) Class95 arg0) {
		if (this.aClass95_1 != null) {
			this.aClass95_1.method1681((Class334) null);
		}
		this.aClass95_1 = arg0;
		if (this.aClass95_1 != null) {
			this.aClass95_1.method1681(this);
		}
	}

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "()Z")
	public boolean method8343() {
		return this.aClass95_1 == null || !this.aBoolean747 && this.aClass95_1.method1676();
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "()V")
	public void method8344() {
		this.aBoolean746 = false;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!tq", name = "c", descriptor = "()V")
	public void method8345() {
		this.aBoolean746 = true;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!tq", name = "d", descriptor = "()V")
	private void method8346() {
		this.aClass57_13.method7671(this.anInt9738);
		while (!this.aBoolean746 && this.aBoolean748) {
			if (this.aClass95_1 == null || this.aClass95_1.method1676()) {
				this.aBoolean747 = false;
				this.aLong285 = Static498.aClass3_1.method7050();
				synchronized (this) {
					try {
						this.wait();
					} catch (@Pc(187) InterruptedException local187) {
					}
				}
			} else {
				this.aBoolean747 = true;
				@Pc(23) Class8 local23 = this.aClass95_1.method1684();
				if (local23 instanceof Class8_Sub1) {
					@Pc(29) Class8_Sub1 local29 = (Class8_Sub1) local23;
					if (local29.aBoolean770) {
						local29.method8907(0, Static205.aClass57_5);
					} else {
						Static525.method8041(local29, this.aClass5_Sub43Array6);
						if (Static660.aClass80_13 != null) {
							Static660.aClass80_13.method8780(-16777216, this.aClass95_1.aString34, local29.anInt10360, -256, local29.anInt10358);
						}
					}
				} else {
					@Pc(62) int local62 = ((Class8_Sub4) local23).anInt3716;
					if (local62 >= 1 && local62 <= 4) {
						@Pc(76) Class22 local76 = Static242.aClass22Array3[local62 - 1];
						for (@Pc(78) int local78 = 0; local78 < Static28.anInt9243 + Static28.anInt9243; local78++) {
							for (@Pc(81) int local81 = 0; local81 < Static28.anInt9243 + Static28.anInt9243; local81++) {
								if (Static535.aBooleanArrayArrayArray4[local62 - 1][local78][local81]) {
									@Pc(98) int local98 = Static128.anInt7021 + local78 - Static28.anInt9243;
									@Pc(104) int local104 = Static97.anInt1574 + local81 - Static28.anInt9243;
									if (local98 >= 0 && local98 < local76.anInt9376 && local104 >= 0 && local104 < local76.anInt9375) {
										Static205.aClass57_5.H(local98 << Static611.anInt10115, local76.method8038(local104, local98), local104 << Static611.anInt10115, this.anIntArray540);
										if (Static318.method4842(this.anIntArray540[0]) == this.anInt9738 - 1) {
											local76.method8033(local98, local104);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		this.aClass57_13.method7689(this.anInt9738);
		while (this.aBoolean746 && this.aBoolean748) {
			synchronized (this) {
				try {
					this.wait();
				} catch (@Pc(216) InterruptedException local216) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!tq", name = "f", descriptor = "()J")
	public long method8347() {
		return this.aLong285;
	}

	@OriginalMember(owner = "client!tq", name = "e", descriptor = "()V")
	public void method8348() {
		this.aBoolean746 = false;
		this.aBoolean748 = false;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!tq", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean748) {
			this.method8346();
		}
	}
}
