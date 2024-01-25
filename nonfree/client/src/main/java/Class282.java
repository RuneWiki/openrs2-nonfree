import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!raa")
public final class Class282 implements Runnable {

	@OriginalMember(owner = "client!raa", name = "e", descriptor = "Z")
	private boolean aBoolean570;

	@OriginalMember(owner = "client!raa", name = "s", descriptor = "Z")
	private volatile boolean aBoolean571;

	@OriginalMember(owner = "client!raa", name = "v", descriptor = "I")
	private int anInt8228;

	@OriginalMember(owner = "client!raa", name = "w", descriptor = "I")
	private int anInt8229;

	@OriginalMember(owner = "client!raa", name = "x", descriptor = "Lclient!fc;")
	private Class96 aClass96_24;

	@OriginalMember(owner = "client!raa", name = "y", descriptor = "Ljava/lang/String;")
	private String aString74;

	@OriginalMember(owner = "client!raa", name = "z", descriptor = "J")
	private long aLong215;

	@OriginalMember(owner = "client!raa", name = "C", descriptor = "J")
	private long aLong216;

	@OriginalMember(owner = "client!raa", name = "h", descriptor = "Lclient!hd;")
	private Interface14 anInterface14_1 = new Class322();

	@OriginalMember(owner = "client!raa", name = "A", descriptor = "Lclient!hd;")
	private Interface14 anInterface14_2 = null;

	@OriginalMember(owner = "client!raa", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean571) {
			@Pc(10) long local10 = Static574.method8210();
			synchronized (this) {
				try {
					if (this.anInterface14_1 instanceof Class322) {
						this.anInterface14_1.method7595(this.aBoolean570);
					} else {
						this.anInt8229++;
						@Pc(35) long local35 = Static574.method8210();
						if (Static440.aClass44_12 == null || this.anInterface14_2 == null || this.anInterface14_2.method7597() == 0 || this.aLong215 < local35 - (long) this.anInterface14_2.method7597()) {
							if (this.anInterface14_2 != null) {
								this.aBoolean570 = true;
								this.anInterface14_2.method7598();
								this.anInterface14_2 = null;
							}
							if (this.aBoolean570) {
								Static479.method7194();
								if (Static440.aClass44_12 != null) {
									Static440.aClass44_12.ja(0);
								}
							}
							this.anInterface14_1.method7595(this.aBoolean570 || Static440.aClass44_12 != null && Static440.aClass44_12.method5041());
						} else {
							@Pc(72) int local72 = (int) ((local35 - this.aLong215) * 255L / (long) this.anInterface14_2.method7597());
							@Pc(77) int local77 = 255 - local72;
							@Pc(83) int local83 = local77 << 24 | 0xFFFFFF;
							@Pc(89) int local89 = local72 << 24 | 0xFFFFFF;
							Static479.method7194();
							Static440.aClass44_12.ja(0);
							@Pc(100) Class78 local100 = Static440.aClass44_12.method5035(Static554.anInt9828, Static375.anInt7256);
							Static440.aClass44_12.method5015(local100);
							this.anInterface14_2.method7595(true);
							Static440.aClass44_12.method5039();
							local100.V(0, 0, 0, local83, 1);
							Static440.aClass44_12.method5015(local100);
							Static440.aClass44_12.ja(0);
							this.anInterface14_1.method7595(true);
							Static440.aClass44_12.method5039();
							local100.V(0, 0, 0, local89, 1);
						}
						try {
							if (Static440.aClass44_12 != null && !(this.anInterface14_1 instanceof Class322)) {
								Static440.aClass44_12.method5013();
							}
						} catch (@Pc(189) Exception_Sub1 local189) {
							Static205.method3450(local189.getMessage() + " (Recovered) " + Static430.aClient1.method1165(), local189);
							Static547.method7956(0);
						}
					}
					this.aBoolean570 = false;
				} catch (@Pc(214) Exception local214) {
					continue;
				}
			}
			@Pc(226) long local226 = Static574.method8210();
			@Pc(233) int local233 = (int) (local10 + 20L - local226);
			if (local233 > 0) {
				Static63.method1019((long) local233);
			}
		}
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(B)I")
	public int method6814() {
		return this.anInt8228;
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(I)I")
	public int method6815() {
		if (this.aClass96_24 == null) {
			return 0;
		}
		@Pc(13) int local13 = this.aClass96_24.method2634();
		if (this.aClass96_24.aBoolean211 && this.anInt8228 < this.aClass96_24.anInt2827) {
			return this.anInt8228 + 1;
		} else if (local13 >= 0 && local13 < Static256.aClass96Array1.length - 1) {
			return this.aClass96_24.anInt2835 == this.anInt8228 ? this.aClass96_24.anInt2827 : this.aClass96_24.anInt2835;
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!raa", name = "b", descriptor = "(I)V")
	public void method6816() {
		this.aBoolean571 = true;
	}

	@OriginalMember(owner = "client!raa", name = "b", descriptor = "(B)J")
	public long method6817() {
		return this.aLong216;
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(ILclient!hd;)V")
	public synchronized void method6818(@OriginalArg(1) Interface14 arg0) {
		this.anInterface14_2 = this.anInterface14_1;
		this.anInterface14_1 = arg0;
		this.aLong215 = Static574.method8210();
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(JIBLclient!fc;Ljava/lang/String;)V")
	public synchronized void method6819(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class96 arg2, @OriginalArg(4) String arg3) {
		this.aClass96_24 = arg2;
		this.anInt8228 = arg1;
		this.aLong216 = arg0;
		this.aString74 = arg3;
	}

	@OriginalMember(owner = "client!raa", name = "c", descriptor = "(I)I")
	public int method6820() {
		return this.anInt8229;
	}

	@OriginalMember(owner = "client!raa", name = "c", descriptor = "(B)Ljava/lang/String;")
	public String method6821() {
		return this.aString74;
	}

	@OriginalMember(owner = "client!raa", name = "d", descriptor = "(B)Lclient!fc;")
	public Class96 method6822() {
		return this.aClass96_24;
	}

	@OriginalMember(owner = "client!raa", name = "d", descriptor = "(I)V")
	public synchronized void method6824() {
		this.aBoolean570 = true;
	}

	@OriginalMember(owner = "client!raa", name = "f", descriptor = "(I)Z")
	public synchronized boolean method6826() {
		return this.anInterface14_1.method7596(this.aLong215);
	}
}
