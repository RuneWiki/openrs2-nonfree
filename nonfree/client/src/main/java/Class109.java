import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fl")
public final class Class109 implements Runnable {

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "Lclient!gs;")
	private Class134 aClass134_1;

	@OriginalMember(owner = "client!fl", name = "e", descriptor = "J")
	private long aLong91;

	@OriginalMember(owner = "client!fl", name = "d", descriptor = "Z")
	private volatile boolean aBoolean247 = true;

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "Z")
	private volatile boolean aBoolean245 = true;

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "Z")
	private volatile boolean aBoolean246 = false;

	@OriginalMember(owner = "client!fl", name = "i", descriptor = "[I")
	private final int[] anIntArray268 = new int[3];

	@OriginalMember(owner = "client!fl", name = "h", descriptor = "[Lclient!qm;")
	private final Class14_Sub37[] aClass14_Sub37Array2 = new Class14_Sub37[8];

	@OriginalMember(owner = "client!fl", name = "f", descriptor = "I")
	private final int anInt3230;

	@OriginalMember(owner = "client!fl", name = "g", descriptor = "Lclient!ha;")
	private final Class137 aClass137_19;

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(ILclient!ha;)V")
	public Class109(@OriginalArg(0) int arg0, @OriginalArg(1) Class137 arg1) {
		this.anInt3230 = arg0;
		this.aClass137_19 = arg1;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "()V")
	public void method2652() {
		this.aBoolean247 = false;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!fl", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean245) {
			this.method2657();
		}
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "()J")
	public long method2653() {
		return this.aLong91;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lclient!gs;)V")
	public void method2654(@OriginalArg(0) Class134 arg0) {
		if (this.aClass134_1 != null) {
			this.aClass134_1.method3039((Class109) null);
		}
		this.aClass134_1 = arg0;
		if (this.aClass134_1 != null) {
			this.aClass134_1.method3039(this);
		}
	}

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "()V")
	public void method2655() {
		this.aBoolean247 = false;
		this.aBoolean245 = false;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!fl", name = "d", descriptor = "()V")
	public void method2656() {
		this.aBoolean247 = true;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!fl", name = "e", descriptor = "()V")
	private void method2657() {
		this.aClass137_19.method7926(this.anInt3230);
		while (!this.aBoolean247 && this.aBoolean245) {
			if (this.aClass134_1 == null || this.aClass134_1.method3036()) {
				this.aBoolean246 = false;
				this.aLong91 = Static247.aClass99_1.method5518();
				synchronized (this) {
					try {
						this.wait();
					} catch (@Pc(168) InterruptedException local168) {
					}
				}
			} else {
				this.aBoolean246 = true;
				@Pc(21) Class12 local21 = this.aClass134_1.method3033();
				if (local21 instanceof Class12_Sub2) {
					@Pc(27) Class12_Sub2 local27 = (Class12_Sub2) local21;
					if (local27.aBoolean757) {
						local27.method9164(Static533.aClass137_41);
					} else {
						Static138.method2200(local27, this.aClass14_Sub37Array2);
						if (Static163.aClass38_3 != null) {
							Static163.aClass38_3.method8985(this.aClass134_1.aString45, -256, -16777216, local27.anInt11001, local27.anInt11007);
						}
					}
				} else {
					@Pc(58) int local58 = ((Class12_Sub6) local21).anInt4165;
					if (local58 >= 1 && local58 <= 4) {
						@Pc(70) Class51 local70 = Static576.aClass51Array3[local58 - 1];
						for (@Pc(72) int local72 = 0; local72 < Static64.anInt1476 + Static64.anInt1476; local72++) {
							for (@Pc(75) int local75 = 0; local75 < Static64.anInt1476 + Static64.anInt1476; local75++) {
								if (Static256.aBooleanArrayArrayArray2[local58 - 1][local72][local75]) {
									@Pc(92) int local92 = Static358.anInt6609 + local72 - Static64.anInt1476;
									@Pc(98) int local98 = Static297.anInt5235 + local75 - Static64.anInt1476;
									if (local92 >= 0 && local92 < local70.anInt9511 && local98 >= 0 && local98 < local70.anInt9512) {
										Static533.aClass137_41.H(local92 << Static579.anInt9935, local70.method7857(local98, local92), local98 << Static579.anInt9935, this.anIntArray268);
										if (Static165.method2674(this.anIntArray268[0]) == this.anInt3230 - 1) {
											local70.method7865(local92, local98);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		this.aClass137_19.method7895(this.anInt3230);
		while (this.aBoolean247 && this.aBoolean245) {
			synchronized (this) {
				try {
					this.wait();
				} catch (@Pc(195) InterruptedException local195) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!fl", name = "f", descriptor = "()Z")
	public boolean method2658() {
		return this.aClass134_1 == null || !this.aBoolean246 && this.aClass134_1.method3036();
	}
}
