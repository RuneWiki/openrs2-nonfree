import java.awt.Container;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kl")
public final class Class204 implements Runnable {

	@OriginalMember(owner = "client!kl", name = "k", descriptor = "Z")
	private volatile boolean aBoolean392;

	@OriginalMember(owner = "client!kl", name = "r", descriptor = "Z")
	private boolean aBoolean393;

	@OriginalMember(owner = "client!kl", name = "u", descriptor = "J")
	private long aLong160;

	@OriginalMember(owner = "client!kl", name = "v", descriptor = "I")
	private int anInt5546;

	@OriginalMember(owner = "client!kl", name = "w", descriptor = "J")
	private long aLong161;

	@OriginalMember(owner = "client!kl", name = "y", descriptor = "Ljava/lang/String;")
	private String aString54;

	@OriginalMember(owner = "client!kl", name = "z", descriptor = "I")
	private int anInt5548;

	@OriginalMember(owner = "client!kl", name = "B", descriptor = "Lclient!nm;")
	private Class247 aClass247_1;

	@OriginalMember(owner = "client!kl", name = "e", descriptor = "Lclient!ia;")
	private Interface7 anInterface7_1 = new Class55();

	@OriginalMember(owner = "client!kl", name = "A", descriptor = "Lclient!ia;")
	private Interface7 anInterface7_2 = null;

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)V")
	public synchronized void method4776() {
		this.aBoolean393 = true;
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)I")
	public int method4777() {
		return this.anInt5548;
	}

	@OriginalMember(owner = "client!kl", name = "c", descriptor = "(I)I")
	public int method4778() {
		return this.anInt5546;
	}

	@OriginalMember(owner = "client!kl", name = "d", descriptor = "(I)V")
	public void method4779() {
		this.aBoolean392 = true;
	}

	@OriginalMember(owner = "client!kl", name = "e", descriptor = "(I)Lclient!nm;")
	public Class247 method4780() {
		return this.aClass247_1;
	}

	@OriginalMember(owner = "client!kl", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean392) {
			@Pc(10) long local10 = Static124.method1947();
			synchronized (this) {
				try {
					this.anInt5548++;
					if (this.anInterface7_1 instanceof Class55) {
						this.anInterface7_1.method8443(this.aBoolean393);
					} else {
						@Pc(27) long local27 = Static124.method1947();
						if (Static563.aClass143_13 == null || this.anInterface7_2 == null || this.anInterface7_2.method8439() == 0 || this.aLong160 < local27 - (long) this.anInterface7_2.method8439()) {
							if (this.anInterface7_2 != null) {
								this.aBoolean393 = true;
								this.anInterface7_2.method8441();
								this.anInterface7_2 = null;
							}
							if (this.aBoolean393) {
								Static587.method8002();
								if (Static563.aClass143_13 != null) {
									Static563.aClass143_13.GA(0);
								}
							}
							this.anInterface7_1.method8443(this.aBoolean393 || Static563.aClass143_13 != null && Static563.aClass143_13.method6207());
						} else {
							@Pc(68) int local68 = (int) ((local27 - this.aLong160) * 255L / (long) this.anInterface7_2.method8439());
							@Pc(73) int local73 = 255 - local68;
							Static587.method8002();
							@Pc(81) int local81 = local68 << 24 | 0xFFFFFF;
							@Pc(87) int local87 = local73 << 24 | 0xFFFFFF;
							Static563.aClass143_13.GA(0);
							@Pc(96) Class59 local96 = Static563.aClass143_13.method6263(Static563.anInt9176, Static316.anInt8165, true);
							Static563.aClass143_13.method6259(local96);
							this.anInterface7_2.method8443(true);
							Static563.aClass143_13.method6198();
							local96.method8067(0, 0, 0, local87, 1);
							Static563.aClass143_13.method6259(local96);
							Static563.aClass143_13.GA(0);
							this.anInterface7_1.method8443(true);
							Static563.aClass143_13.method6198();
							local96.method8067(0, 0, 0, local81, 1);
						}
						try {
							if (Static563.aClass143_13 != null && !(this.anInterface7_1 instanceof Class55)) {
								Static563.aClass143_13.method6201();
							}
						} catch (@Pc(186) Exception_Sub1 local186) {
							Static17.method268(local186.getMessage() + " (Recovered) " + Static437.aClient1.method1248(), local186);
							Static75.method1101(true, 0);
						}
					}
					@Pc(220) Container local220;
					if (Static634.aFrame5 != null) {
						local220 = Static634.aFrame5;
					} else if (Static285.anApplet5 == null) {
						local220 = Static279.anApplet_Sub1_1;
					} else {
						local220 = Static285.anApplet5;
					}
					local220.getSize();
					local220.getSize();
					if (Static634.aFrame5 == local220) {
						Static634.aFrame5.getInsets();
					}
					this.aBoolean393 = false;
					if (Static563.aClass143_13 != null && !(this.anInterface7_1 instanceof Class55) && this.aClass247_1.method5877() < Static400.aClass247_21.method5877()) {
						Static665.method6311();
					}
				} catch (@Pc(261) Exception local261) {
					continue;
				}
			}
			@Pc(273) long local273 = Static124.method1947();
			@Pc(281) int local281 = (int) (local10 + 20L - local273);
			if (local281 > 0) {
				Static127.method1985((long) local281);
			}
		}
	}

	@OriginalMember(owner = "client!kl", name = "f", descriptor = "(I)Z")
	public synchronized boolean method4781() {
		return this.anInterface7_1.method8444(this.aLong160);
	}

	@OriginalMember(owner = "client!kl", name = "g", descriptor = "(I)I")
	public int method4783() {
		if (this.aClass247_1 == null) {
			return 0;
		}
		@Pc(13) int local13 = this.aClass247_1.method5877();
		if (this.aClass247_1.aBoolean497 && this.anInt5546 < this.aClass247_1.anInt6916) {
			return this.anInt5546 + 1;
		} else if (local13 >= 0 && local13 < Static127.aClass247Array1.length - 1) {
			return this.anInt5546 == this.aClass247_1.anInt6917 ? this.aClass247_1.anInt6916 : this.aClass247_1.anInt6917;
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(B)Ljava/lang/String;")
	public String method4784() {
		return this.aString54;
	}

	@OriginalMember(owner = "client!kl", name = "c", descriptor = "(B)J")
	public long method4785() {
		return this.aLong161;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(JLclient!nm;Ljava/lang/String;ZI)V")
	public synchronized void method4786(@OriginalArg(0) long arg0, @OriginalArg(1) Class247 arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3) {
		this.aString54 = arg2;
		this.anInt5546 = arg3;
		this.aLong161 = arg0;
		this.aClass247_1 = arg1;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lclient!ia;B)V")
	public synchronized void method4787(@OriginalArg(0) Interface7 arg0) {
		this.anInterface7_2 = this.anInterface7_1;
		this.anInterface7_1 = arg0;
		this.aLong160 = Static124.method1947();
	}
}
