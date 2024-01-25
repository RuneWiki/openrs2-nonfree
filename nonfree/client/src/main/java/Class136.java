import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hs")
public final class Class136 implements Runnable {

	@OriginalMember(owner = "client!hs", name = "f", descriptor = "J")
	private long aLong115;

	@OriginalMember(owner = "client!hs", name = "h", descriptor = "Lclient!lda;")
	private Class187 aClass187_1;

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "[I")
	private final int[] anIntArray201 = new int[3];

	@OriginalMember(owner = "client!hs", name = "g", descriptor = "[Lclient!eq;")
	private final Class3_Sub10[] aClass3_Sub10Array3 = new Class3_Sub10[8];

	@OriginalMember(owner = "client!hs", name = "i", descriptor = "Z")
	private volatile boolean aBoolean286 = true;

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "Z")
	private volatile boolean aBoolean284 = true;

	@OriginalMember(owner = "client!hs", name = "d", descriptor = "Z")
	private volatile boolean aBoolean285 = false;

	@OriginalMember(owner = "client!hs", name = "c", descriptor = "I")
	private final int anInt3802;

	@OriginalMember(owner = "client!hs", name = "e", descriptor = "Lclient!r;")
	private final Class45 aClass45_5;

	@OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(ILclient!r;)V")
	public Class136(@OriginalArg(0) int arg0, @OriginalArg(1) Class45 arg1) {
		this.anInt3802 = arg0;
		this.aClass45_5 = arg1;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "()V")
	public void method3391() {
		this.aBoolean286 = false;
		this.aBoolean284 = false;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "()V")
	private void method3392() {
		this.aClass45_5.method7416(this.anInt3802);
		while (!this.aBoolean286 && this.aBoolean284) {
			if (this.aClass187_1 == null || this.aClass187_1.method4389()) {
				this.aBoolean285 = false;
				this.aLong115 = Static243.aClass231_1.method6768();
				synchronized (this) {
					try {
						this.wait();
					} catch (@Pc(168) InterruptedException local168) {
					}
				}
			} else {
				this.aBoolean285 = true;
				@Pc(21) Class41 local21 = this.aClass187_1.method4396();
				if (local21 instanceof Class41_Sub2) {
					@Pc(27) Class41_Sub2 local27 = (Class41_Sub2) local21;
					if (local27.aBoolean735) {
						local27.method7849(Static511.aClass45_12);
					} else {
						Static434.method6088(local27, this.aClass3_Sub10Array3);
						if (Static441.aClass54_11 != null) {
							Static441.aClass54_11.method7796(this.aClass187_1.aString35, -16777216, local27.anInt9440, -256, local27.anInt9441);
						}
					}
				} else {
					@Pc(58) int local58 = ((Class41_Sub6) local21).anInt7036;
					if (local58 >= 1 && local58 <= 4) {
						@Pc(70) Class34 local70 = Static68.aClass34Array1[local58 - 1];
						for (@Pc(72) int local72 = 0; local72 < Static453.anInt7589 + Static453.anInt7589; local72++) {
							for (@Pc(75) int local75 = 0; local75 < Static453.anInt7589 + Static453.anInt7589; local75++) {
								if (Static128.aBooleanArrayArrayArray1[local58 - 1][local72][local75]) {
									@Pc(92) int local92 = Static5.anInt120 + local72 - Static453.anInt7589;
									@Pc(98) int local98 = Static394.anInt6891 + local75 - Static453.anInt7589;
									if (local92 >= 0 && local92 < local70.anInt7854 && local98 >= 0 && local98 < local70.anInt7852) {
										Static511.aClass45_12.MA(local92 << Static315.anInt5369, local70.method6525(local98, local92), local98 << Static315.anInt5369, this.anIntArray201);
										if (Static412.method5919(this.anIntArray201[0]) == this.anInt3802 - 1) {
											local70.method6527(local92, local98);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		this.aClass45_5.method7428(this.anInt3802);
		while (this.aBoolean286 && this.aBoolean284) {
			synchronized (this) {
				try {
					this.wait();
				} catch (@Pc(195) InterruptedException local195) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!hs", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean284) {
			this.method3392();
		}
	}

	@OriginalMember(owner = "client!hs", name = "c", descriptor = "()V")
	public void method3393() {
		this.aBoolean286 = false;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!hs", name = "d", descriptor = "()V")
	public void method3394() {
		this.aBoolean286 = true;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Lclient!lda;)V")
	public void method3395(@OriginalArg(0) Class187 arg0) {
		if (this.aClass187_1 != null) {
			this.aClass187_1.method4397(null);
		}
		this.aClass187_1 = arg0;
		if (this.aClass187_1 != null) {
			this.aClass187_1.method4397(this);
		}
	}

	@OriginalMember(owner = "client!hs", name = "e", descriptor = "()Z")
	public boolean method3396() {
		return this.aClass187_1 == null || !this.aBoolean285 && this.aClass187_1.method4389();
	}

	@OriginalMember(owner = "client!hs", name = "f", descriptor = "()J")
	public long method3397() {
		return this.aLong115;
	}
}
