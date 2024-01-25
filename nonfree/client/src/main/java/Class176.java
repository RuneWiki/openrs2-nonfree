import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kj")
public final class Class176 implements Runnable {

	@OriginalMember(owner = "client!kj", name = "c", descriptor = "J")
	private long aLong141;

	@OriginalMember(owner = "client!kj", name = "h", descriptor = "Lclient!tb;")
	private Class311 aClass311_1;

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "Z")
	private volatile boolean aBoolean364 = true;

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "Z")
	private volatile boolean aBoolean363 = true;

	@OriginalMember(owner = "client!kj", name = "e", descriptor = "Z")
	private volatile boolean aBoolean365 = false;

	@OriginalMember(owner = "client!kj", name = "g", descriptor = "[Lclient!cp;")
	private final Class3_Sub9[] aClass3_Sub9Array4 = new Class3_Sub9[8];

	@OriginalMember(owner = "client!kj", name = "f", descriptor = "[I")
	private final int[] anIntArray252 = new int[3];

	@OriginalMember(owner = "client!kj", name = "i", descriptor = "I")
	private final int anInt5332;

	@OriginalMember(owner = "client!kj", name = "d", descriptor = "Lclient!r;")
	private final Class31 aClass31_9;

	@OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(ILclient!r;)V")
	public Class176(@OriginalArg(0) int arg0, @OriginalArg(1) Class31 arg1) {
		this.anInt5332 = arg0;
		this.aClass31_9 = arg1;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "()V")
	public void method4278() {
		this.aBoolean364 = false;
		this.aBoolean363 = false;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "()V")
	private void method4279() {
		this.aClass31_9.method8055(this.anInt5332);
		while (!this.aBoolean364 && this.aBoolean363) {
			if (this.aClass311_1 == null || this.aClass311_1.method6760()) {
				this.aBoolean365 = false;
				this.aLong141 = Static7.aClass29_1.method5617();
				synchronized (this) {
					try {
						this.wait();
					} catch (@Pc(168) InterruptedException local168) {
					}
				}
			} else {
				this.aBoolean365 = true;
				@Pc(21) Class25 local21 = this.aClass311_1.method6756();
				if (local21 instanceof Class25_Sub2) {
					@Pc(27) Class25_Sub2 local27 = (Class25_Sub2) local21;
					if (local27.aBoolean575) {
						local27.method6656(Static68.aClass31_4);
					} else {
						Static10.method95(local27, this.aClass3_Sub9Array4);
						if (Static386.aClass63_8 != null) {
							Static386.aClass63_8.method6881(this.aClass311_1.aString232, -16777216, local27.anInt8479, -256, local27.anInt8481);
						}
					}
				} else {
					@Pc(58) int local58 = ((Class25_Sub8) local21).anInt5128;
					if (local58 >= 1 && local58 <= 4) {
						@Pc(70) Class127 local70 = Static256.aClass127Array3[local58 - 1];
						for (@Pc(72) int local72 = 0; local72 < Static219.anInt4585 + Static219.anInt4585; local72++) {
							for (@Pc(75) int local75 = 0; local75 < Static219.anInt4585 + Static219.anInt4585; local75++) {
								if (Static205.aBooleanArrayArrayArray1[local58 - 1][local72][local75]) {
									@Pc(92) int local92 = Static261.anInt5023 + local72 - Static219.anInt4585;
									@Pc(98) int local98 = Static216.anInt4499 + local75 - Static219.anInt4585;
									if (local92 >= 0 && local92 < local70.anInt10004 && local98 >= 0 && local98 < local70.anInt10007) {
										Static68.aClass31_4.MA(local92 << Static385.anInt6657, local70.method7862(local98, local92), local98 << Static385.anInt6657, this.anIntArray252);
										if (Static67.method1644(this.anIntArray252[0]) == this.anInt5332 - 1) {
											local70.method7868(local92, local98);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		this.aClass31_9.method8051(this.anInt5332);
		while (this.aBoolean364 && this.aBoolean363) {
			synchronized (this) {
				try {
					this.wait();
				} catch (@Pc(195) InterruptedException local195) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!kj", name = "c", descriptor = "()Z")
	public boolean method4280() {
		return this.aClass311_1 == null || !this.aBoolean365 && this.aClass311_1.method6760();
	}

	@OriginalMember(owner = "client!kj", name = "d", descriptor = "()J")
	public long method4281() {
		return this.aLong141;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lclient!tb;)V")
	public void method4282(@OriginalArg(0) Class311 arg0) {
		if (this.aClass311_1 != null) {
			this.aClass311_1.method6759(null);
		}
		this.aClass311_1 = arg0;
		if (this.aClass311_1 != null) {
			this.aClass311_1.method6759(this);
		}
	}

	@OriginalMember(owner = "client!kj", name = "e", descriptor = "()V")
	public void method4283() {
		this.aBoolean364 = false;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!kj", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean363) {
			this.method4279();
		}
	}

	@OriginalMember(owner = "client!kj", name = "f", descriptor = "()V")
	public void method4284() {
		this.aBoolean364 = true;
		synchronized (this) {
			this.notify();
		}
	}
}
