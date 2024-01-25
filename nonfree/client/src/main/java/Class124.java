import java.awt.Container;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fia")
public final class Class124 implements Runnable {

	@OriginalMember(owner = "client!fia", name = "h", descriptor = "Z")
	private boolean aBoolean239;

	@OriginalMember(owner = "client!fia", name = "q", descriptor = "Z")
	private volatile boolean aBoolean240;

	@OriginalMember(owner = "client!fia", name = "t", descriptor = "I")
	private int anInt3040;

	@OriginalMember(owner = "client!fia", name = "u", descriptor = "I")
	private int anInt3041;

	@OriginalMember(owner = "client!fia", name = "w", descriptor = "Lclient!vc;")
	private Class370 aClass370_2;

	@OriginalMember(owner = "client!fia", name = "x", descriptor = "J")
	private long aLong85;

	@OriginalMember(owner = "client!fia", name = "y", descriptor = "Ljava/lang/String;")
	private String aString30;

	@OriginalMember(owner = "client!fia", name = "z", descriptor = "J")
	private long aLong86;

	@OriginalMember(owner = "client!fia", name = "j", descriptor = "Lclient!wo;")
	private Interface27 anInterface27_1 = new Class344();

	@OriginalMember(owner = "client!fia", name = "v", descriptor = "Lclient!wo;")
	private Interface27 anInterface27_2 = null;

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "(Ljava/lang/String;Lclient!vc;IJI)V")
	public synchronized void method2769(@OriginalArg(0) String arg0, @OriginalArg(1) Class370 arg1, @OriginalArg(3) long arg2, @OriginalArg(4) int arg3) {
		this.anInt3040 = arg3;
		this.aString30 = arg0;
		this.aLong86 = arg2;
		this.aClass370_2 = arg1;
	}

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "(I)I")
	public int method2770() {
		if (this.aClass370_2 == null) {
			return 0;
		}
		@Pc(13) int local13 = this.aClass370_2.method8274();
		if (this.aClass370_2.aBoolean718 && this.aClass370_2.anInt9713 > this.anInt3040) {
			return this.anInt3040 + 1;
		} else if (local13 >= 0 && local13 < Static424.aClass370Array1.length - 1) {
			return this.anInt3040 == this.aClass370_2.anInt9706 ? this.aClass370_2.anInt9713 : this.aClass370_2.anInt9706;
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!fia", name = "b", descriptor = "(I)Lclient!vc;")
	public Class370 method2771() {
		return this.aClass370_2;
	}

	@OriginalMember(owner = "client!fia", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean240) {
			@Pc(10) long local10 = Static131.method2268();
			synchronized (this) {
				try {
					this.anInt3041++;
					if (this.anInterface27_1 instanceof Class344) {
						this.anInterface27_1.method7914(this.aBoolean239);
					} else {
						@Pc(35) long local35 = Static131.method2268();
						if (Static582.aClass16_12 == null || this.anInterface27_2 == null || this.anInterface27_2.method7910() == 0 || this.aLong85 < local35 - (long) this.anInterface27_2.method7910()) {
							if (this.anInterface27_2 != null) {
								this.aBoolean239 = true;
								this.anInterface27_2.method7911();
								this.anInterface27_2 = null;
							}
							if (this.aBoolean239) {
								Static468.method7635();
								if (Static582.aClass16_12 != null) {
									Static582.aClass16_12.GA(0);
								}
							}
							this.anInterface27_1.method7914(this.aBoolean239 || Static582.aClass16_12 != null && Static582.aClass16_12.method8187());
						} else {
							@Pc(112) int local112 = (int) ((local35 - this.aLong85) * 255L / (long) this.anInterface27_2.method7910());
							@Pc(116) int local116 = 255 - local112;
							@Pc(122) int local122 = local112 << 24 | 0xFFFFFF;
							@Pc(128) int local128 = local116 << 24 | 0xFFFFFF;
							Static468.method7635();
							Static582.aClass16_12.GA(0);
							@Pc(139) Class102 local139 = Static582.aClass16_12.method8168(Static654.anInt10064, Static483.anInt8181, true);
							Static582.aClass16_12.method8155(local139);
							this.anInterface27_2.method7914(true);
							Static582.aClass16_12.method8138();
							local139.method6955(0, 0, 0, local128, 1);
							Static582.aClass16_12.method8155(local139);
							Static582.aClass16_12.GA(0);
							this.anInterface27_1.method7914(true);
							Static582.aClass16_12.method8138();
							local139.method6955(0, 0, 0, local122, 1);
						}
						try {
							if (Static582.aClass16_12 != null && !(this.anInterface27_1 instanceof Class344)) {
								Static582.aClass16_12.method8123();
							}
						} catch (@Pc(189) Exception_Sub1 local189) {
							Static81.method1711(local189.getMessage() + " (Recovered) " + Static487.aClient1.method1737(), local189);
							Static422.method6016(true, 0);
						}
					}
					@Pc(216) Container local216;
					if (Static90.aFrame2 != null) {
						local216 = Static90.aFrame2;
					} else if (Static287.anApplet2 == null) {
						local216 = Static287.anApplet_Sub1_1;
					} else {
						local216 = Static287.anApplet2;
					}
					local216.getSize();
					local216.getSize();
					if (Static90.aFrame2 == local216) {
						Static90.aFrame2.getInsets();
					}
					this.aBoolean239 = false;
					if (Static582.aClass16_12 != null && !(this.anInterface27_1 instanceof Class344) && this.aClass370_2.method8274() < Static627.aClass370_21.method8274()) {
						Static502.method7148();
					}
				} catch (@Pc(261) Exception local261) {
					continue;
				}
			}
			@Pc(273) long local273 = Static131.method2268();
			@Pc(281) int local281 = (int) (local10 + 20L - local273);
			if (local281 > 0) {
				Static365.method3472((long) local281);
			}
		}
	}

	@OriginalMember(owner = "client!fia", name = "c", descriptor = "(I)V")
	public synchronized void method2772() {
		this.aBoolean239 = true;
	}

	@OriginalMember(owner = "client!fia", name = "d", descriptor = "(I)J")
	public long method2773() {
		return this.aLong86;
	}

	@OriginalMember(owner = "client!fia", name = "b", descriptor = "(B)Ljava/lang/String;")
	public String method2774() {
		return this.aString30;
	}

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "(Z)V")
	public void method2775() {
		this.aBoolean240 = true;
	}

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "(ILclient!wo;)V")
	public synchronized void method2776(@OriginalArg(1) Interface27 arg0) {
		this.anInterface27_2 = this.anInterface27_1;
		this.anInterface27_1 = arg0;
		this.aLong85 = Static131.method2268();
	}

	@OriginalMember(owner = "client!fia", name = "e", descriptor = "(I)I")
	public int method2777() {
		return this.anInt3041;
	}

	@OriginalMember(owner = "client!fia", name = "f", descriptor = "(I)Z")
	public synchronized boolean method2779() {
		return this.anInterface27_1.method7913(this.aLong85);
	}

	@OriginalMember(owner = "client!fia", name = "g", descriptor = "(I)I")
	public int method2780() {
		return this.anInt3040;
	}
}
