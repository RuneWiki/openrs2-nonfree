import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ht")
public final class Class144 implements Runnable {

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "Lclient!iq;")
	private Class160 aClass160_1;

	@OriginalMember(owner = "client!ht", name = "c", descriptor = "J")
	private long aLong113;

	@OriginalMember(owner = "client!ht", name = "e", descriptor = "Z")
	private volatile boolean aBoolean312 = true;

	@OriginalMember(owner = "client!ht", name = "f", descriptor = "Z")
	private volatile boolean aBoolean313 = true;

	@OriginalMember(owner = "client!ht", name = "d", descriptor = "Z")
	private volatile boolean aBoolean311 = false;

	@OriginalMember(owner = "client!ht", name = "g", descriptor = "[Lclient!rc;")
	private final Class1_Sub18[] aClass1_Sub18Array4 = new Class1_Sub18[8];

	@OriginalMember(owner = "client!ht", name = "h", descriptor = "[I")
	private final int[] anIntArray320 = new int[3];

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "I")
	private final int anInt4031;

	@OriginalMember(owner = "client!ht", name = "i", descriptor = "Lclient!r;")
	private final Class134 aClass134_7;

	@OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(ILclient!r;)V")
	public Class144(@OriginalArg(0) int arg0, @OriginalArg(1) Class134 arg1) {
		this.anInt4031 = arg0;
		this.aClass134_7 = arg1;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "()V")
	public void method3248() {
		this.aBoolean312 = false;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "()V")
	public void method3249() {
		this.aBoolean312 = true;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!ht", name = "c", descriptor = "()Z")
	public boolean method3250() {
		return this.aClass160_1 == null || !this.aBoolean311 && this.aClass160_1.method3432();
	}

	@OriginalMember(owner = "client!ht", name = "d", descriptor = "()J")
	public long method3251() {
		return this.aLong113;
	}

	@OriginalMember(owner = "client!ht", name = "e", descriptor = "()V")
	public void method3252() {
		this.aBoolean312 = false;
		this.aBoolean313 = false;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(Lclient!iq;)V")
	public void method3253(@OriginalArg(0) Class160 arg0) {
		if (this.aClass160_1 != null) {
			this.aClass160_1.method3428(null);
		}
		this.aClass160_1 = arg0;
		if (this.aClass160_1 != null) {
			this.aClass160_1.method3428(this);
		}
	}

	@OriginalMember(owner = "client!ht", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean313) {
			this.method3254();
		}
	}

	@OriginalMember(owner = "client!ht", name = "f", descriptor = "()V")
	private void method3254() {
		this.aClass134_7.method6943(this.anInt4031);
		while (!this.aBoolean312 && this.aBoolean313) {
			if (this.aClass160_1 == null || this.aClass160_1.method3432()) {
				this.aBoolean311 = false;
				this.aLong113 = Static295.aClass286_1.method6485();
				synchronized (this) {
					try {
						this.wait();
					} catch (@Pc(168) InterruptedException local168) {
					}
				}
			} else {
				this.aBoolean311 = true;
				@Pc(21) Class8 local21 = this.aClass160_1.method3429();
				if (local21 instanceof Class8_Sub3) {
					@Pc(27) Class8_Sub3 local27 = (Class8_Sub3) local21;
					if (local27.aBoolean730) {
						local27.method7625(Static402.aClass134_11);
					} else {
						Static465.method6405(local27, this.aClass1_Sub18Array4);
						if (Static162.aClass64_6 != null) {
							Static162.aClass64_6.method6602(-256, this.aClass160_1.aString37, local27.anInt9368, -16777216, local27.anInt9366);
						}
					}
				} else {
					@Pc(58) int local58 = ((Class8_Sub10) local21).anInt8943;
					if (local58 >= 1 && local58 <= 4) {
						@Pc(70) Class47 local70 = Static199.aClass47Array1[local58 - 1];
						for (@Pc(72) int local72 = 0; local72 < Static240.anInt4447 + Static240.anInt4447; local72++) {
							for (@Pc(75) int local75 = 0; local75 < Static240.anInt4447 + Static240.anInt4447; local75++) {
								if (Static587.aBooleanArrayArrayArray2[local58 - 1][local72][local75]) {
									@Pc(92) int local92 = Static258.anInt4643 + local72 - Static240.anInt4447;
									@Pc(98) int local98 = Static312.anInt5339 + local75 - Static240.anInt4447;
									if (local92 >= 0 && local92 < local70.anInt9209 && local98 >= 0 && local98 < local70.anInt9210) {
										Static402.aClass134_11.MA(local92 << Static351.anInt5832, local70.method7545(local92, local98), local98 << Static351.anInt5832, this.anIntArray320);
										if (Static180.method4646(this.anIntArray320[0]) == this.anInt4031 - 1) {
											local70.method7549(local92, local98);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		this.aClass134_7.method6961(this.anInt4031);
		while (this.aBoolean312 && this.aBoolean313) {
			synchronized (this) {
				try {
					this.wait();
				} catch (@Pc(195) InterruptedException local195) {
				}
			}
		}
	}
}
