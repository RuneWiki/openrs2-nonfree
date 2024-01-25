import java.awt.Container;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tl")
public final class Class353 implements Runnable {

	@OriginalMember(owner = "client!tl", name = "m", descriptor = "Z")
	private volatile boolean aBoolean711;

	@OriginalMember(owner = "client!tl", name = "r", descriptor = "Z")
	private boolean aBoolean712;

	@OriginalMember(owner = "client!tl", name = "t", descriptor = "J")
	private long aLong259;

	@OriginalMember(owner = "client!tl", name = "w", descriptor = "Lclient!nc;")
	private Class246 aClass246_23;

	@OriginalMember(owner = "client!tl", name = "x", descriptor = "Ljava/lang/String;")
	private String aString109;

	@OriginalMember(owner = "client!tl", name = "z", descriptor = "J")
	private long aLong260;

	@OriginalMember(owner = "client!tl", name = "A", descriptor = "I")
	private int anInt9005;

	@OriginalMember(owner = "client!tl", name = "B", descriptor = "I")
	private int anInt9006;

	@OriginalMember(owner = "client!tl", name = "i", descriptor = "Lclient!sn;")
	private Interface22 anInterface22_1 = new Class360();

	@OriginalMember(owner = "client!tl", name = "v", descriptor = "Lclient!sn;")
	private Interface22 anInterface22_2 = null;

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)Ljava/lang/String;")
	public String method7675() {
		return this.aString109;
	}

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(I)J")
	public long method7676() {
		return this.aLong260;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lclient!nc;JILjava/lang/String;I)V")
	public synchronized void method7677(@OriginalArg(0) Class246 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3) {
		this.anInt9006 = arg2;
		this.aLong260 = arg1;
		this.aString109 = arg3;
		this.aClass246_23 = arg0;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lclient!sn;I)V")
	public synchronized void method7678(@OriginalArg(0) Interface22 arg0) {
		this.anInterface22_2 = this.anInterface22_1;
		this.anInterface22_1 = arg0;
		this.aLong259 = Static429.method5935();
	}

	@OriginalMember(owner = "client!tl", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean711) {
			@Pc(6) long local6 = Static429.method5935();
			synchronized (this) {
				try {
					this.anInt9005++;
					if (this.anInterface22_1 instanceof Class360) {
						this.anInterface22_1.method8778(this.aBoolean712);
					} else {
						@Pc(23) long local23 = Static429.method5935();
						if (Static582.aClass33_13 == null || this.anInterface22_2 == null || this.anInterface22_2.method8776() == 0 || this.aLong259 < local23 - (long) this.anInterface22_2.method8776()) {
							if (this.anInterface22_2 != null) {
								this.aBoolean712 = true;
								this.anInterface22_2.method8779();
								this.anInterface22_2 = null;
							}
							if (this.aBoolean712) {
								Static271.method3929();
								if (Static582.aClass33_13 != null) {
									Static582.aClass33_13.GA(0);
								}
							}
							this.anInterface22_1.method8778(this.aBoolean712 || Static582.aClass33_13 != null && Static582.aClass33_13.method8135());
						} else {
							@Pc(66) int local66 = (int) ((local23 - this.aLong259) * 255L / (long) this.anInterface22_2.method8776());
							@Pc(71) int local71 = 255 - local66;
							Static271.method3929();
							@Pc(79) int local79 = local71 << 24 | 0xFFFFFF;
							@Pc(85) int local85 = local66 << 24 | 0xFFFFFF;
							Static582.aClass33_13.GA(0);
							@Pc(94) Class17 local94 = Static582.aClass33_13.method8145(Static632.anInt9867, Static357.anInt5421, true);
							Static582.aClass33_13.method8143(local94);
							this.anInterface22_2.method8778(true);
							Static582.aClass33_13.method8134();
							local94.method5260(0, 0, 0, local79, 1);
							Static582.aClass33_13.method8143(local94);
							Static582.aClass33_13.GA(0);
							this.anInterface22_1.method8778(true);
							Static582.aClass33_13.method8134();
							local94.method5260(0, 0, 0, local85, 1);
						}
						try {
							if (Static582.aClass33_13 != null && !(this.anInterface22_1 instanceof Class360)) {
								Static582.aClass33_13.method8095();
							}
						} catch (@Pc(184) Exception_Sub1 local184) {
							Static357.method4765(local184, local184.getMessage() + " (Recovered) " + Static205.aClient1.method1594());
							Static46.method825(0, true);
						}
					}
					@Pc(216) Container local216;
					if (Static280.aFrame10 != null) {
						local216 = Static280.aFrame10;
					} else if (Static649.anApplet2 == null) {
						local216 = Static333.anApplet_Sub1_1;
					} else {
						local216 = Static649.anApplet2;
					}
					local216.getSize();
					local216.getSize();
					if (Static280.aFrame10 == local216) {
						Static280.aFrame10.getInsets();
					}
					this.aBoolean712 = false;
					if (Static582.aClass33_13 != null && !(this.anInterface22_1 instanceof Class360) && this.aClass246_23.method5071() < Static393.aClass246_20.method5071()) {
						Static381.method3017();
					}
				} catch (@Pc(259) Exception local259) {
					continue;
				}
			}
			@Pc(271) long local271 = Static429.method5935();
			@Pc(279) int local279 = (int) (local6 + 20L - local271);
			if (local279 > 0) {
				Static491.method6679((long) local279);
			}
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(B)I")
	public int method7679() {
		if (this.aClass246_23 == null) {
			return 0;
		}
		@Pc(18) int local18 = this.aClass246_23.method5071();
		if (this.aClass246_23.aBoolean442 && this.aClass246_23.anInt5770 > this.anInt9006) {
			return this.anInt9006 + 1;
		} else if (local18 >= 0 && local18 < Static432.aClass246Array1.length - 1) {
			return this.anInt9006 == this.aClass246_23.anInt5774 ? this.aClass246_23.anInt5770 : this.aClass246_23.anInt5774;
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(B)V")
	public synchronized void method7681() {
		this.aBoolean712 = true;
	}

	@OriginalMember(owner = "client!tl", name = "c", descriptor = "(B)V")
	public void method7682() {
		this.aBoolean711 = true;
	}

	@OriginalMember(owner = "client!tl", name = "d", descriptor = "(I)Z")
	public synchronized boolean method7683() {
		return this.anInterface22_1.method8780(this.aLong259);
	}

	@OriginalMember(owner = "client!tl", name = "d", descriptor = "(B)I")
	public int method7685() {
		return this.anInt9005;
	}

	@OriginalMember(owner = "client!tl", name = "e", descriptor = "(B)Lclient!nc;")
	public Class246 method7686() {
		return this.aClass246_23;
	}

	@OriginalMember(owner = "client!tl", name = "e", descriptor = "(I)I")
	public int method7688() {
		return this.anInt9006;
	}
}
