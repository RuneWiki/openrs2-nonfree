import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ls")
public final class Class220 implements Runnable {

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "J")
	private long aLong134;

	@OriginalMember(owner = "client!ls", name = "g", descriptor = "Lclient!jg;")
	private Class175 aClass175_1;

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "[Lclient!vt;")
	private final Class5_Sub11[] aClass5_Sub11Array6 = new Class5_Sub11[8];

	@OriginalMember(owner = "client!ls", name = "d", descriptor = "[I")
	private final int[] anIntArray293 = new int[3];

	@OriginalMember(owner = "client!ls", name = "i", descriptor = "Z")
	private volatile boolean aBoolean396 = true;

	@OriginalMember(owner = "client!ls", name = "h", descriptor = "Z")
	private volatile boolean aBoolean395 = true;

	@OriginalMember(owner = "client!ls", name = "f", descriptor = "Z")
	private volatile boolean aBoolean394 = false;

	@OriginalMember(owner = "client!ls", name = "c", descriptor = "I")
	private final int anInt5507;

	@OriginalMember(owner = "client!ls", name = "e", descriptor = "Lclient!ha;")
	private final Class133 aClass133_9;

	@OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(ILclient!ha;)V")
	public Class220(@OriginalArg(0) int arg0, @OriginalArg(1) Class133 arg1) {
		this.anInt5507 = arg0;
		this.aClass133_9 = arg1;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lclient!jg;)V")
	public void method4924(@OriginalArg(0) Class175 arg0) {
		if (this.aClass175_1 != null) {
			this.aClass175_1.method4193(null);
		}
		this.aClass175_1 = arg0;
		if (this.aClass175_1 != null) {
			this.aClass175_1.method4193(this);
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "()V")
	private void method4925() {
		this.aClass133_9.method7278(this.anInt5507);
		while (!this.aBoolean396 && this.aBoolean395) {
			if (this.aClass175_1 == null || this.aClass175_1.method4192()) {
				this.aBoolean394 = false;
				this.aLong134 = Static289.aClass86_1.method4810();
				synchronized (this) {
					try {
						this.wait();
					} catch (@Pc(168) InterruptedException local168) {
					}
				}
			} else {
				this.aBoolean394 = true;
				@Pc(21) Class4 local21 = this.aClass175_1.method4189();
				if (local21 instanceof Class4_Sub2) {
					@Pc(27) Class4_Sub2 local27 = (Class4_Sub2) local21;
					if (local27.aBoolean732) {
						local27.method8732(Static517.aClass133_13);
					} else {
						Static461.method6851(local27, this.aClass5_Sub11Array6);
						if (Static589.aClass55_9 != null) {
							Static589.aClass55_9.method6023(-256, local27.anInt10235, this.aClass175_1.aString48, local27.anInt10233, -16777216);
						}
					}
				} else {
					@Pc(58) int local58 = ((Class4_Sub5) local21).anInt2460;
					if (local58 >= 1 && local58 <= 4) {
						@Pc(70) Class61 local70 = Static11.aClass61Array1[local58 - 1];
						for (@Pc(72) int local72 = 0; local72 < Static51.anInt1064 + Static51.anInt1064; local72++) {
							for (@Pc(75) int local75 = 0; local75 < Static51.anInt1064 + Static51.anInt1064; local75++) {
								if (Static448.aBooleanArrayArrayArray1[local58 - 1][local72][local75]) {
									@Pc(92) int local92 = Static260.anInt4712 + local72 - Static51.anInt1064;
									@Pc(98) int local98 = Static598.anInt10044 + local75 - Static51.anInt1064;
									if (local92 >= 0 && local92 < local70.anInt10026 && local98 >= 0 && local98 < local70.anInt10029) {
										Static517.aClass133_13.H(local92 << Static115.anInt2156, local70.method8580(local98, local92), local98 << Static115.anInt2156, this.anIntArray293);
										if (Static554.method8075(this.anIntArray293[0]) == this.anInt5507 - 1) {
											local70.method8577(local92, local98);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		this.aClass133_9.method7242(this.anInt5507);
		while (this.aBoolean396 && this.aBoolean395) {
			synchronized (this) {
				try {
					this.wait();
				} catch (@Pc(195) InterruptedException local195) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "()V")
	public void method4926() {
		this.aBoolean396 = false;
		this.aBoolean395 = false;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!ls", name = "c", descriptor = "()J")
	public long method4927() {
		return this.aLong134;
	}

	@OriginalMember(owner = "client!ls", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean395) {
			this.method4925();
		}
	}

	@OriginalMember(owner = "client!ls", name = "d", descriptor = "()V")
	public void method4928() {
		this.aBoolean396 = true;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!ls", name = "e", descriptor = "()Z")
	public boolean method4929() {
		return this.aClass175_1 == null || !this.aBoolean394 && this.aClass175_1.method4192();
	}

	@OriginalMember(owner = "client!ls", name = "f", descriptor = "()V")
	public void method4930() {
		this.aBoolean396 = false;
		synchronized (this) {
			this.notify();
		}
	}
}
