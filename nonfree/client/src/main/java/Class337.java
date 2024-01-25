import java.awt.Container;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!si")
public final class Class337 implements Runnable {

	@OriginalMember(owner = "client!si", name = "p", descriptor = "Z")
	private boolean aBoolean788;

	@OriginalMember(owner = "client!si", name = "g", descriptor = "Z")
	private volatile boolean aBoolean789;

	@OriginalMember(owner = "client!si", name = "b", descriptor = "J")
	private long aLong287;

	@OriginalMember(owner = "client!si", name = "t", descriptor = "I")
	private int anInt9191;

	@OriginalMember(owner = "client!si", name = "f", descriptor = "J")
	private long aLong288;

	@OriginalMember(owner = "client!si", name = "c", descriptor = "Ljava/lang/String;")
	private String aString100;

	@OriginalMember(owner = "client!si", name = "z", descriptor = "Lclient!wr;")
	private Class406 aClass406_9;

	@OriginalMember(owner = "client!si", name = "s", descriptor = "I")
	private int anInt9192;

	@OriginalMember(owner = "client!si", name = "i", descriptor = "Lclient!fla;")
	private Interface8 anInterface8_1 = new Class149();

	@OriginalMember(owner = "client!si", name = "w", descriptor = "Lclient!fla;")
	private Interface8 anInterface8_2 = null;

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(I)Z")
	public synchronized boolean method8088() {
		return this.anInterface8_1.method7189(this.aLong288);
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(ILclient!wr;Ljava/lang/String;IJ)V")
	public synchronized void method8091(@OriginalArg(1) Class406 arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) long arg3) {
		this.aClass406_9 = arg0;
		this.anInt9192 = arg2;
		this.aLong287 = arg3;
		this.aString100 = arg1;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(ILclient!fla;)V")
	public synchronized void method8093(@OriginalArg(1) Interface8 arg0) {
		this.anInterface8_2 = this.anInterface8_1;
		this.anInterface8_1 = arg0;
		this.aLong288 = Static567.method7863();
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Z)V")
	public synchronized void method8094() {
		this.aBoolean788 = true;
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(Z)I")
	public int method8095() {
		if (this.aClass406_9 == null) {
			return 0;
		}
		@Pc(23) int local23 = this.aClass406_9.method9624();
		if (this.aClass406_9.aBoolean941 && this.anInt9192 < this.aClass406_9.anInt11031) {
			return this.anInt9192 + 1;
		} else if (local23 >= 0 && Static127.aClass406Array1.length - 1 > local23) {
			return this.anInt9192 == this.aClass406_9.anInt11029 ? this.aClass406_9.anInt11031 : this.aClass406_9.anInt11029;
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!si", name = "c", descriptor = "(B)J")
	public long method8097() {
		return this.aLong287;
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(B)Lclient!wr;")
	public Class406 method8099() {
		return this.aClass406_9;
	}

	@OriginalMember(owner = "client!si", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean789) {
			@Pc(12) long local12 = Static567.method7863();
			synchronized (this) {
				try {
					this.anInt9191++;
					if (this.anInterface8_1 instanceof Class149) {
						this.anInterface8_1.method7192(this.aBoolean788);
					} else {
						@Pc(37) long local37 = Static567.method7863();
						if (Static396.aClass145_6 == null || this.anInterface8_2 == null || this.anInterface8_2.method7191() == 0 || this.aLong288 < local37 - (long) this.anInterface8_2.method7191()) {
							if (this.anInterface8_2 != null) {
								this.aBoolean788 = true;
								this.anInterface8_2.method7188();
								this.anInterface8_2 = null;
							}
							if (this.aBoolean788) {
								Static475.method6832();
								if (Static396.aClass145_6 != null) {
									Static396.aClass145_6.GA(0);
								}
							}
							this.anInterface8_1.method7192(this.aBoolean788 || Static396.aClass145_6 != null && Static396.aClass145_6.method9703());
						} else {
							@Pc(132) int local132 = (int) ((local37 - this.aLong288) * 255L / (long) this.anInterface8_2.method7191());
							@Pc(137) int local137 = 255 - local132;
							@Pc(143) int local143 = local132 << 24 | 0xFFFFFF;
							Static475.method6832();
							@Pc(151) int local151 = local137 << 24 | 0xFFFFFF;
							Static396.aClass145_6.GA(0);
							@Pc(160) Class43 local160 = Static396.aClass145_6.method9687(Static151.anInt7983, Static295.anInt4558, true);
							Static396.aClass145_6.method9717(local160);
							this.anInterface8_2.method7192(true);
							Static396.aClass145_6.method9706();
							local160.method9583(0, 0, 0, local151, 1);
							Static396.aClass145_6.method9717(local160);
							Static396.aClass145_6.GA(0);
							this.anInterface8_1.method7192(true);
							Static396.aClass145_6.method9706();
							local160.method9583(0, 0, 0, local143, 1);
						}
						try {
							if (Static396.aClass145_6 != null && !(this.anInterface8_1 instanceof Class149)) {
								Static396.aClass145_6.method9647();
							}
						} catch (@Pc(212) Exception_Sub1 local212) {
							Static329.method4572(local212.getMessage() + " (Recovered) " + Static255.aClient1.method1384(), local212);
							Static213.method2982(true, 0);
						}
					}
					@Pc(239) Container local239;
					if (Static516.aFrame2 != null) {
						local239 = Static516.aFrame2;
					} else if (Static214.anApplet1 == null) {
						local239 = Static273.anApplet_Sub1_1;
					} else {
						local239 = Static214.anApplet1;
					}
					local239.getSize();
					local239.getSize();
					if (local239 == Static516.aFrame2) {
						Static516.aFrame2.getInsets();
					}
					this.aBoolean788 = false;
					if (Static396.aClass145_6 != null && !(this.anInterface8_1 instanceof Class149) && this.aClass406_9.method9624() < Static722.aClass406_28.method9624()) {
						Static14.method216();
					}
				} catch (@Pc(290) Exception local290) {
					continue;
				}
			}
			@Pc(302) long local302 = Static567.method7863();
			@Pc(310) int local310 = (int) (local12 + 20L - local302);
			if (local310 > 0) {
				Static570.method7907((long) local310);
			}
		}
	}

	@OriginalMember(owner = "client!si", name = "d", descriptor = "(I)I")
	public int method8100() {
		return this.anInt9191;
	}

	@OriginalMember(owner = "client!si", name = "c", descriptor = "(Z)Ljava/lang/String;")
	public String method8101() {
		return this.aString100;
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(I)I")
	public int method8102() {
		return this.anInt9192;
	}

	@OriginalMember(owner = "client!si", name = "c", descriptor = "(I)V")
	public void method8104() {
		this.aBoolean789 = true;
	}
}
