import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tw")
public final class Class334 implements Runnable {

	@OriginalMember(owner = "client!tw", name = "e", descriptor = "J")
	private long aLong248;

	@OriginalMember(owner = "client!tw", name = "i", descriptor = "Lclient!vba;")
	private Class352 aClass352_1;

	@OriginalMember(owner = "client!tw", name = "c", descriptor = "Z")
	private volatile boolean aBoolean658 = true;

	@OriginalMember(owner = "client!tw", name = "f", descriptor = "[I")
	private final int[] anIntArray580 = new int[3];

	@OriginalMember(owner = "client!tw", name = "d", descriptor = "[Lclient!raa;")
	private final Class6_Sub1[] aClass6_Sub1Array5 = new Class6_Sub1[8];

	@OriginalMember(owner = "client!tw", name = "g", descriptor = "Z")
	private volatile boolean aBoolean659 = true;

	@OriginalMember(owner = "client!tw", name = "b", descriptor = "Z")
	private volatile boolean aBoolean657 = false;

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "I")
	private final int anInt9555;

	@OriginalMember(owner = "client!tw", name = "h", descriptor = "Lclient!ha;")
	private final Class100 aClass100_14;

	@OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(ILclient!ha;)V")
	public Class334(@OriginalArg(0) int arg0, @OriginalArg(1) Class100 arg1) {
		this.anInt9555 = arg0;
		this.aClass100_14 = arg1;
	}

	@OriginalMember(owner = "client!tw", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean659) {
			this.method8107();
		}
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "()J")
	public long method8101() {
		return this.aLong248;
	}

	@OriginalMember(owner = "client!tw", name = "b", descriptor = "()V")
	public void method8102() {
		this.aBoolean658 = false;
		this.aBoolean659 = false;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!tw", name = "c", descriptor = "()V")
	public void method8103() {
		this.aBoolean658 = true;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(Lclient!vba;)V")
	public void method8104(@OriginalArg(0) Class352 arg0) {
		if (this.aClass352_1 != null) {
			this.aClass352_1.method8368((Class334) null);
		}
		this.aClass352_1 = arg0;
		if (this.aClass352_1 != null) {
			this.aClass352_1.method8368(this);
		}
	}

	@OriginalMember(owner = "client!tw", name = "d", descriptor = "()Z")
	public boolean method8105() {
		return this.aClass352_1 == null || !this.aBoolean657 && this.aClass352_1.method8370();
	}

	@OriginalMember(owner = "client!tw", name = "e", descriptor = "()V")
	public void method8106() {
		this.aBoolean658 = false;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!tw", name = "f", descriptor = "()V")
	private void method8107() {
		this.aClass100_14.method8805(this.anInt9555);
		while (!this.aBoolean658 && this.aBoolean659) {
			if (this.aClass352_1 == null || this.aClass352_1.method8370()) {
				this.aBoolean657 = false;
				this.aLong248 = Static34.aClass137_2.method5523();
				synchronized (this) {
					try {
						this.wait();
					} catch (@Pc(168) InterruptedException local168) {
					}
				}
			} else {
				this.aBoolean657 = true;
				@Pc(21) Class20 local21 = this.aClass352_1.method8365();
				if (local21 instanceof Class20_Sub2) {
					@Pc(27) Class20_Sub2 local27 = (Class20_Sub2) local21;
					if (local27.aBoolean728) {
						local27.method9016(Static565.aClass100_15);
					} else {
						Static242.method4189(local27, this.aClass6_Sub1Array5);
						if (Static155.aClass50_4 != null) {
							Static155.aClass50_4.method5736(-16777216, local27.anInt10726, this.aClass352_1.aString111, local27.anInt10723, -256);
						}
					}
				} else {
					@Pc(58) int local58 = ((Class20_Sub9) local21).anInt8115;
					if (local58 >= 1 && local58 <= 4) {
						@Pc(70) Class199 local70 = Static195.aClass199Array1[local58 - 1];
						for (@Pc(72) int local72 = 0; local72 < Static197.anInt10372 + Static197.anInt10372; local72++) {
							for (@Pc(75) int local75 = 0; local75 < Static197.anInt10372 + Static197.anInt10372; local75++) {
								if (Static431.aBooleanArrayArrayArray2[local58 - 1][local72][local75]) {
									@Pc(92) int local92 = Static162.anInt3371 + local72 - Static197.anInt10372;
									@Pc(98) int local98 = Static313.anInt5975 + local75 - Static197.anInt10372;
									if (local92 >= 0 && local92 < local70.anInt10111 && local98 >= 0 && local98 < local70.anInt10110) {
										Static565.aClass100_15.H(local92 << Static643.anInt10682, local70.method8532(local92, local98), local98 << Static643.anInt10682, this.anIntArray580);
										if (Static535.method7895(this.anIntArray580[0]) == this.anInt9555 - 1) {
											local70.method8528(local92, local98);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		this.aClass100_14.method8813(this.anInt9555);
		while (this.aBoolean658 && this.aBoolean659) {
			synchronized (this) {
				try {
					this.wait();
				} catch (@Pc(195) InterruptedException local195) {
				}
			}
		}
	}
}
