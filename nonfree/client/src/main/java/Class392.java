import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wl")
public final class Class392 implements Runnable {

	@OriginalMember(owner = "client!wl", name = "c", descriptor = "J")
	private long aLong306;

	@OriginalMember(owner = "client!wl", name = "h", descriptor = "Lclient!lha;")
	private Class224 aClass224_1;

	@OriginalMember(owner = "client!wl", name = "d", descriptor = "Z")
	private volatile boolean aBoolean757 = true;

	@OriginalMember(owner = "client!wl", name = "e", descriptor = "Z")
	private volatile boolean aBoolean758 = true;

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "[I")
	private final int[] anIntArray665 = new int[3];

	@OriginalMember(owner = "client!wl", name = "i", descriptor = "Z")
	private volatile boolean aBoolean759 = false;

	@OriginalMember(owner = "client!wl", name = "f", descriptor = "[Lclient!bq;")
	private final Class3_Sub7[] aClass3_Sub7Array6 = new Class3_Sub7[8];

	@OriginalMember(owner = "client!wl", name = "g", descriptor = "I")
	private final int anInt10270;

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "Lclient!ha;")
	private final Class16 aClass16_15;

	@OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(ILclient!ha;)V")
	public Class392(@OriginalArg(0) int arg0, @OriginalArg(1) Class16 arg1) {
		this.anInt10270 = arg0;
		this.aClass16_15 = arg1;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "()V")
	public void method8683() {
		this.aBoolean757 = false;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "()J")
	public long method8684() {
		return this.aLong306;
	}

	@OriginalMember(owner = "client!wl", name = "c", descriptor = "()V")
	public void method8685() {
		this.aBoolean757 = true;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!wl", name = "d", descriptor = "()V")
	private void method8686() {
		this.aClass16_15.method8165(this.anInt10270);
		while (!this.aBoolean757 && this.aBoolean758) {
			if (this.aClass224_1 == null || this.aClass224_1.method5161()) {
				this.aBoolean759 = false;
				this.aLong306 = Static645.aClass171_1.method7250();
				synchronized (this) {
					try {
						this.wait();
					} catch (@Pc(168) InterruptedException local168) {
					}
				}
			} else {
				this.aBoolean759 = true;
				@Pc(21) Class23 local21 = this.aClass224_1.method5159();
				if (local21 instanceof Class23_Sub2) {
					@Pc(27) Class23_Sub2 local27 = (Class23_Sub2) local21;
					if (local27.aBoolean744) {
						local27.method8590(Static486.aClass16_8);
					} else {
						Static583.method7849(local27, this.aClass3_Sub7Array6);
						if (Static192.aClass69_4 != null) {
							Static192.aClass69_4.method7451(local27.anInt10107, -256, -16777216, this.aClass224_1.aString76, local27.anInt10105);
						}
					}
				} else {
					@Pc(58) int local58 = ((Class23_Sub10) local21).anInt9842;
					if (local58 >= 1 && local58 <= 4) {
						@Pc(70) Class104 local70 = Static343.aClass104Array2[local58 - 1];
						for (@Pc(72) int local72 = 0; local72 < Static641.anInt9890 + Static641.anInt9890; local72++) {
							for (@Pc(75) int local75 = 0; local75 < Static641.anInt9890 + Static641.anInt9890; local75++) {
								if (Static252.aBooleanArrayArrayArray2[local58 - 1][local72][local75]) {
									@Pc(92) int local92 = Static177.anInt3330 + local72 - Static641.anInt9890;
									@Pc(98) int local98 = Static227.anInt4358 + local75 - Static641.anInt9890;
									if (local92 >= 0 && local92 < local70.anInt9718 && local98 >= 0 && local98 < local70.anInt9715) {
										Static486.aClass16_8.H(local92 << Static436.anInt7634, local70.method8279(local98, local92), local98 << Static436.anInt7634, this.anIntArray665);
										if (Static67.method7735(this.anIntArray665[0]) == this.anInt10270 - 1) {
											local70.method8284(local92, local98);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		this.aClass16_15.method8133(this.anInt10270);
		while (this.aBoolean757 && this.aBoolean758) {
			synchronized (this) {
				try {
					this.wait();
				} catch (@Pc(195) InterruptedException local195) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!wl", name = "e", descriptor = "()V")
	public void method8687() {
		this.aBoolean757 = false;
		this.aBoolean758 = false;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!wl", name = "f", descriptor = "()Z")
	public boolean method8688() {
		return this.aClass224_1 == null || !this.aBoolean759 && this.aClass224_1.method5161();
	}

	@OriginalMember(owner = "client!wl", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean758) {
			this.method8686();
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lclient!lha;)V")
	public void method8689(@OriginalArg(0) Class224 arg0) {
		if (this.aClass224_1 != null) {
			this.aClass224_1.method5156((Class392) null);
		}
		this.aClass224_1 = arg0;
		if (this.aClass224_1 != null) {
			this.aClass224_1.method5156(this);
		}
	}
}
