import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gu")
public final class Class127 implements Runnable {

	@OriginalMember(owner = "client!gu", name = "d", descriptor = "Lclient!gp;")
	private Class124 aClass124_1;

	@OriginalMember(owner = "client!gu", name = "f", descriptor = "J")
	private long aLong87;

	@OriginalMember(owner = "client!gu", name = "c", descriptor = "[Lclient!ul;")
	private final Class4_Sub24[] aClass4_Sub24Array3 = new Class4_Sub24[8];

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "Z")
	private volatile boolean aBoolean286 = true;

	@OriginalMember(owner = "client!gu", name = "g", descriptor = "[I")
	private final int[] anIntArray178 = new int[3];

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "Z")
	private volatile boolean aBoolean287 = true;

	@OriginalMember(owner = "client!gu", name = "h", descriptor = "Z")
	private volatile boolean aBoolean288 = false;

	@OriginalMember(owner = "client!gu", name = "i", descriptor = "I")
	private final int anInt3557;

	@OriginalMember(owner = "client!gu", name = "e", descriptor = "Lclient!r;")
	private final Class44 aClass44_9;

	@OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(ILclient!r;)V")
	public Class127(@OriginalArg(0) int arg0, @OriginalArg(1) Class44 arg1) {
		this.anInt3557 = arg0;
		this.aClass44_9 = arg1;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(Lclient!gp;)V")
	public void method3176(@OriginalArg(0) Class124 arg0) {
		if (this.aClass124_1 != null) {
			this.aClass124_1.method3124(null);
		}
		this.aClass124_1 = arg0;
		if (this.aClass124_1 != null) {
			this.aClass124_1.method3124(this);
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "()V")
	private void method3177() {
		this.aClass44_9.method5038(this.anInt3557);
		while (!this.aBoolean286 && this.aBoolean287) {
			if (this.aClass124_1 == null || this.aClass124_1.method3119()) {
				this.aBoolean288 = false;
				this.aLong87 = Static141.aClass65_1.method5484();
				synchronized (this) {
					try {
						this.wait();
					} catch (@Pc(168) InterruptedException local168) {
					}
				}
			} else {
				this.aBoolean288 = true;
				@Pc(21) Class1 local21 = this.aClass124_1.method3125();
				if (local21 instanceof Class1_Sub4) {
					@Pc(27) Class1_Sub4 local27 = (Class1_Sub4) local21;
					if (local27.aBoolean697) {
						local27.method8124(Static468.aClass44_7);
					} else {
						Static437.method6787(local27, this.aClass4_Sub24Array3);
						if (Static440.aClass58_12 != null) {
							Static440.aClass58_12.method8156(-16777216, -256, this.aClass124_1.aString29, local27.anInt9939, local27.anInt9937);
						}
					}
				} else {
					@Pc(58) int local58 = ((Class1_Sub7) local21).anInt5896;
					if (local58 >= 1 && local58 <= 4) {
						@Pc(70) Class83 local70 = Static499.aClass83Array3[local58 - 1];
						for (@Pc(72) int local72 = 0; local72 < Static579.anInt10075 + Static579.anInt10075; local72++) {
							for (@Pc(75) int local75 = 0; local75 < Static579.anInt10075 + Static579.anInt10075; local75++) {
								if (Static320.aBooleanArrayArrayArray2[local58 - 1][local72][local75]) {
									@Pc(92) int local92 = Static26.anInt403 + local72 - Static579.anInt10075;
									@Pc(98) int local98 = Static528.anInt9392 + local75 - Static579.anInt10075;
									if (local92 >= 0 && local92 < local70.anInt8829 && local98 >= 0 && local98 < local70.anInt8830) {
										Static468.aClass44_7.MA(local92 << Static145.anInt3093, local70.method7217(local98, local92), local98 << Static145.anInt3093, this.anIntArray178);
										if (Static93.method2107(this.anIntArray178[0]) == this.anInt3557 - 1) {
											local70.method7209(local92, local98);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		this.aClass44_9.method4980(this.anInt3557);
		while (this.aBoolean286 && this.aBoolean287) {
			synchronized (this) {
				try {
					this.wait();
				} catch (@Pc(195) InterruptedException local195) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "()V")
	public void method3178() {
		this.aBoolean286 = false;
		this.aBoolean287 = false;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!gu", name = "c", descriptor = "()V")
	public void method3179() {
		this.aBoolean286 = true;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!gu", name = "d", descriptor = "()V")
	public void method3180() {
		this.aBoolean286 = false;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!gu", name = "e", descriptor = "()J")
	public long method3181() {
		return this.aLong87;
	}

	@OriginalMember(owner = "client!gu", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean287) {
			this.method3177();
		}
	}

	@OriginalMember(owner = "client!gu", name = "f", descriptor = "()Z")
	public boolean method3182() {
		return this.aClass124_1 == null || !this.aBoolean288 && this.aClass124_1.method3119();
	}
}
