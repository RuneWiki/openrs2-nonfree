import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ls")
public final class Class212 implements Runnable {

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "J")
	private long aLong143;

	@OriginalMember(owner = "client!ls", name = "c", descriptor = "Lclient!vca;")
	private Class358 aClass358_1;

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "[I")
	private final int[] anIntArray361 = new int[3];

	@OriginalMember(owner = "client!ls", name = "h", descriptor = "Z")
	private volatile boolean aBoolean368 = true;

	@OriginalMember(owner = "client!ls", name = "d", descriptor = "Z")
	private volatile boolean aBoolean366 = true;

	@OriginalMember(owner = "client!ls", name = "e", descriptor = "Z")
	private volatile boolean aBoolean367 = false;

	@OriginalMember(owner = "client!ls", name = "i", descriptor = "[Lclient!kb;")
	private final Class2_Sub24[] aClass2_Sub24Array19 = new Class2_Sub24[8];

	@OriginalMember(owner = "client!ls", name = "g", descriptor = "I")
	private final int anInt5231;

	@OriginalMember(owner = "client!ls", name = "f", descriptor = "Lclient!ha;")
	private final Class95 aClass95_8;

	@OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(ILclient!ha;)V")
	public Class212(@OriginalArg(0) int arg0, @OriginalArg(1) Class95 arg1) {
		this.anInt5231 = arg0;
		this.aClass95_8 = arg1;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "()V")
	public void method4408() {
		this.aBoolean368 = true;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "()V")
	private void method4409() {
		this.aClass95_8.method6982(this.anInt5231);
		while (!this.aBoolean368 && this.aBoolean366) {
			if (this.aClass358_1 == null || this.aClass358_1.method8047()) {
				this.aBoolean367 = false;
				this.aLong143 = Static20.aClass123_1.method2765();
				synchronized (this) {
					try {
						this.wait();
					} catch (@Pc(168) InterruptedException local168) {
					}
				}
			} else {
				this.aBoolean367 = true;
				@Pc(21) Class13 local21 = this.aClass358_1.method8054();
				if (local21 instanceof Class13_Sub1) {
					@Pc(27) Class13_Sub1 local27 = (Class13_Sub1) local21;
					if (local27.aBoolean737) {
						local27.method8415(Static207.aClass95_6);
					} else {
						Static321.method4297(local27, this.aClass2_Sub24Array19);
						if (Static483.aClass62_17 != null) {
							Static483.aClass62_17.method5684(local27.anInt10087, this.aClass358_1.aString106, local27.anInt10088, -256, -16777216);
						}
					}
				} else {
					@Pc(58) int local58 = ((Class13_Sub8) local21).anInt5785;
					if (local58 >= 1 && local58 <= 4) {
						@Pc(70) Class76 local70 = Static314.aClass76Array2[local58 - 1];
						for (@Pc(72) int local72 = 0; local72 < Static335.anInt5343 + Static335.anInt5343; local72++) {
							for (@Pc(75) int local75 = 0; local75 < Static335.anInt5343 + Static335.anInt5343; local75++) {
								if (Static215.aBooleanArrayArrayArray1[local58 - 1][local72][local75]) {
									@Pc(92) int local92 = Static566.anInt9234 + local72 - Static335.anInt5343;
									@Pc(98) int local98 = Static370.anInt5837 + local75 - Static335.anInt5343;
									if (local92 >= 0 && local92 < local70.anInt8791 && local98 >= 0 && local98 < local70.anInt8794) {
										Static207.aClass95_6.H(local92 << Static609.anInt9827, local70.method7396(local98, local92), local98 << Static609.anInt9827, this.anIntArray361);
										if (Static397.method5415(this.anIntArray361[0]) == this.anInt5231 - 1) {
											local70.method7394(local92, local98);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		this.aClass95_8.method6981(this.anInt5231);
		while (this.aBoolean368 && this.aBoolean366) {
			synchronized (this) {
				try {
					this.wait();
				} catch (@Pc(195) InterruptedException local195) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!ls", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean366) {
			this.method4409();
		}
	}

	@OriginalMember(owner = "client!ls", name = "c", descriptor = "()J")
	public long method4410() {
		return this.aLong143;
	}

	@OriginalMember(owner = "client!ls", name = "d", descriptor = "()V")
	public void method4411() {
		this.aBoolean368 = false;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!ls", name = "e", descriptor = "()V")
	public void method4412() {
		this.aBoolean368 = false;
		this.aBoolean366 = false;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lclient!vca;)V")
	public void method4413(@OriginalArg(0) Class358 arg0) {
		if (this.aClass358_1 != null) {
			this.aClass358_1.method8055(null);
		}
		this.aClass358_1 = arg0;
		if (this.aClass358_1 != null) {
			this.aClass358_1.method8055(this);
		}
	}

	@OriginalMember(owner = "client!ls", name = "f", descriptor = "()Z")
	public boolean method4414() {
		return this.aClass358_1 == null || !this.aBoolean367 && this.aClass358_1.method8047();
	}
}
