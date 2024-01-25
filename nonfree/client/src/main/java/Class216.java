import java.awt.Container;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class216 implements Runnable {

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "Z")
	private boolean aBoolean365;

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "Z")
	private volatile boolean aBoolean366;

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "J")
	private long aLong157;

	@OriginalMember(owner = "client!lc", name = "p", descriptor = "I")
	private int anInt5507;

	@OriginalMember(owner = "client!lc", name = "o", descriptor = "I")
	private int anInt5508;

	@OriginalMember(owner = "client!lc", name = "r", descriptor = "Ljava/lang/String;")
	private String aString62;

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "J")
	private long aLong158;

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "Lclient!bl;")
	private Class40 aClass40_23;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "Lclient!jga;")
	private Interface18 anInterface18_1 = new Class53();

	@OriginalMember(owner = "client!lc", name = "v", descriptor = "Lclient!jga;")
	private Interface18 anInterface18_2 = null;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)I")
	public int method4931() {
		return this.anInt5507;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)I")
	public int method4932() {
		return this.anInt5508;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IBJLjava/lang/String;Lclient!bl;)V")
	public synchronized void method4933(@OriginalArg(0) int arg0, @OriginalArg(2) long arg1, @OriginalArg(3) String arg2, @OriginalArg(4) Class40 arg3) {
		this.aString62 = arg2;
		this.aClass40_23 = arg3;
		this.anInt5507 = arg0;
		this.aLong158 = arg1;
	}

	@OriginalMember(owner = "client!lc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean366) {
			@Pc(6) long local6 = Static480.method6763();
			synchronized (this) {
				try {
					this.anInt5508++;
					if (this.anInterface18_1 instanceof Class53) {
						this.anInterface18_1.method5205(this.aBoolean365);
					} else {
						@Pc(23) long local23 = Static480.method6763();
						if (Static273.aClass100_6 == null || this.anInterface18_2 == null || this.anInterface18_2.method5202() == 0 || this.aLong157 < local23 - (long) this.anInterface18_2.method5202()) {
							if (this.anInterface18_2 != null) {
								this.aBoolean365 = true;
								this.anInterface18_2.method5201();
								this.anInterface18_2 = null;
							}
							if (this.aBoolean365) {
								Static285.method4554();
								if (Static273.aClass100_6 != null) {
									Static273.aClass100_6.GA(0);
								}
							}
							this.anInterface18_1.method5205(this.aBoolean365 || Static273.aClass100_6 != null && Static273.aClass100_6.method8622());
						} else {
							@Pc(72) int local72 = (int) ((local23 - this.aLong157) * 255L / (long) this.anInterface18_2.method5202());
							@Pc(77) int local77 = 255 - local72;
							Static285.method4554();
							@Pc(85) int local85 = local72 << 24 | 0xFFFFFF;
							@Pc(91) int local91 = local77 << 24 | 0xFFFFFF;
							Static273.aClass100_6.GA(0);
							@Pc(100) Class155 local100 = Static273.aClass100_6.method8647(Static85.anInt9921, Static256.anInt4629, true);
							Static273.aClass100_6.method8660(local100);
							this.anInterface18_2.method5205(true);
							Static273.aClass100_6.method8648();
							local100.method7205(0, 0, 0, local91, 1);
							Static273.aClass100_6.method8660(local100);
							Static273.aClass100_6.GA(0);
							this.anInterface18_1.method5205(true);
							Static273.aClass100_6.method8648();
							local100.method7205(0, 0, 0, local85, 1);
						}
						try {
							if (Static273.aClass100_6 != null && !(this.anInterface18_1 instanceof Class53)) {
								Static273.aClass100_6.method8619();
							}
						} catch (@Pc(205) Exception_Sub1 local205) {
							Static522.method7115(local205, local205.getMessage() + " (Recovered) " + Static189.aClient1.method1191());
							Static462.method6506(true, 0);
						}
					}
					@Pc(241) Container local241;
					if (Static207.aFrame2 != null) {
						local241 = Static207.aFrame2;
					} else if (Static265.anApplet2 == null) {
						local241 = Static597.anApplet_Sub1_1;
					} else {
						local241 = Static265.anApplet2;
					}
					local241.getSize();
					local241.getSize();
					if (Static207.aFrame2 == local241) {
						Static207.aFrame2.getInsets();
					}
					this.aBoolean365 = false;
					if (Static273.aClass100_6 != null && !(this.anInterface18_1 instanceof Class53) && this.aClass40_23.method774() < Static43.aClass40_19.method774()) {
						Static555.method7518();
					}
				} catch (@Pc(296) Exception local296) {
					continue;
				}
			}
			@Pc(308) long local308 = Static480.method6763();
			@Pc(316) int local316 = (int) (local6 + 20L - local308);
			if (local316 > 0) {
				Static620.method7045(-4, (long) local316);
			}
		}
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)Z")
	public synchronized boolean method4934() {
		return this.anInterface18_1.method5200(this.aLong157);
	}

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "(I)V")
	public void method4935() {
		this.aBoolean366 = true;
	}

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "(I)Ljava/lang/String;")
	public String method4936() {
		return this.aString62;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(BLclient!jga;)V")
	public synchronized void method4937(@OriginalArg(1) Interface18 arg0) {
		this.anInterface18_2 = this.anInterface18_1;
		this.anInterface18_1 = arg0;
		this.aLong157 = Static480.method6763();
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(B)I")
	public int method4938() {
		if (this.aClass40_23 == null) {
			return 0;
		}
		@Pc(20) int local20 = this.aClass40_23.method774();
		if (this.aClass40_23.aBoolean46 && this.anInt5507 < this.aClass40_23.anInt710) {
			return this.anInt5507 + 1;
		} else if (local20 >= 0 && local20 < Static486.aClass40Array1.length - 1) {
			return this.anInt5507 == this.aClass40_23.anInt705 ? this.aClass40_23.anInt710 : this.aClass40_23.anInt705;
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)Lclient!bl;")
	public Class40 method4939() {
		return this.aClass40_23;
	}

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "(I)V")
	public synchronized void method4940() {
		this.aBoolean365 = true;
	}

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "(I)J")
	public long method4941() {
		return this.aLong158;
	}
}
