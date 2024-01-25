import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lk")
public final class Class188 implements Runnable {

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "J")
	private long aLong175;

	@OriginalMember(owner = "client!lk", name = "f", descriptor = "Lclient!ph;")
	private Class260 aClass260_1;

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "[Lclient!cba;")
	private final Class6_Sub10[] aClass6_Sub10Array6 = new Class6_Sub10[8];

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "[I")
	private final int[] anIntArray299 = new int[3];

	@OriginalMember(owner = "client!lk", name = "e", descriptor = "Z")
	private volatile boolean aBoolean498 = true;

	@OriginalMember(owner = "client!lk", name = "d", descriptor = "Z")
	private volatile boolean aBoolean497 = true;

	@OriginalMember(owner = "client!lk", name = "h", descriptor = "Z")
	private volatile boolean aBoolean499 = false;

	@OriginalMember(owner = "client!lk", name = "i", descriptor = "I")
	private final int anInt6396;

	@OriginalMember(owner = "client!lk", name = "g", descriptor = "Lclient!ha;")
	private final Class5 aClass5_9;

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(ILclient!ha;)V")
	public Class188(@OriginalArg(0) int arg0, @OriginalArg(1) Class5 arg1) {
		this.anInt6396 = arg0;
		this.aClass5_9 = arg1;
	}

	@OriginalMember(owner = "client!lk", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean497) {
			this.method5375();
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "()V")
	public void method5369() {
		this.aBoolean498 = true;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "()J")
	public long method5370() {
		return this.aLong175;
	}

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "()Z")
	public boolean method5371() {
		return this.aClass260_1 == null || !this.aBoolean499 && this.aClass260_1.method6664();
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lclient!ph;)V")
	public void method5372(@OriginalArg(0) Class260 arg0) {
		if (this.aClass260_1 != null) {
			this.aClass260_1.method6662((Class188) null);
		}
		this.aClass260_1 = arg0;
		if (this.aClass260_1 != null) {
			this.aClass260_1.method6662(this);
		}
	}

	@OriginalMember(owner = "client!lk", name = "d", descriptor = "()V")
	public void method5373() {
		this.aBoolean498 = false;
		this.aBoolean497 = false;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!lk", name = "e", descriptor = "()V")
	public void method5374() {
		this.aBoolean498 = false;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!lk", name = "f", descriptor = "()V")
	private void method5375() {
		this.aClass5_9.method6170(this.anInt6396);
		while (!this.aBoolean498 && this.aBoolean497) {
			if (this.aClass260_1 == null || this.aClass260_1.method6664()) {
				this.aBoolean499 = false;
				this.aLong175 = Static641.aClass42_1.method8006();
				synchronized (this) {
					try {
						this.wait();
					} catch (@Pc(168) InterruptedException local168) {
					}
				}
			} else {
				this.aBoolean499 = true;
				@Pc(21) Class9 local21 = this.aClass260_1.method6661();
				if (local21 instanceof Class9_Sub4) {
					@Pc(27) Class9_Sub4 local27 = (Class9_Sub4) local21;
					if (local27.aBoolean815) {
						local27.method8423(Static472.aClass5_14);
					} else {
						Static504.method7269(local27, this.aClass6_Sub10Array6);
						if (Static177.aClass34_13 != null) {
							Static177.aClass34_13.method8598(local27.anInt10358, this.aClass260_1.aString83, -256, -16777216, local27.anInt10362);
						}
					}
				} else {
					@Pc(58) int local58 = ((Class9_Sub10) local21).anInt8224;
					if (local58 >= 1 && local58 <= 4) {
						@Pc(70) Class245 local70 = Static148.aClass245Array1[local58 - 1];
						for (@Pc(72) int local72 = 0; local72 < Static456.anInt8195 + Static456.anInt8195; local72++) {
							for (@Pc(75) int local75 = 0; local75 < Static456.anInt8195 + Static456.anInt8195; local75++) {
								if (Static71.aBooleanArrayArrayArray1[local58 - 1][local72][local75]) {
									@Pc(92) int local92 = Static427.anInt7834 + local72 - Static456.anInt8195;
									@Pc(98) int local98 = Static594.anInt10050 + local75 - Static456.anInt8195;
									if (local92 >= 0 && local92 < local70.anInt9289 && local98 >= 0 && local98 < local70.anInt9290) {
										Static472.aClass5_14.H(local92 << Static606.anInt10280, local70.method7583(local98, local92), local98 << Static606.anInt10280, this.anIntArray299);
										if (Static368.method5887(this.anIntArray299[0]) == this.anInt6396 - 1) {
											local70.method7588(local92, local98);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		this.aClass5_9.method6137(this.anInt6396);
		while (this.aBoolean498 && this.aBoolean497) {
			synchronized (this) {
				try {
					this.wait();
				} catch (@Pc(195) InterruptedException local195) {
				}
			}
		}
	}
}
