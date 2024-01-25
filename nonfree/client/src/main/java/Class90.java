import java.awt.Container;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!efa")
public final class Class90 implements Runnable {

	@OriginalMember(owner = "client!efa", name = "e", descriptor = "Z")
	private boolean aBoolean148;

	@OriginalMember(owner = "client!efa", name = "q", descriptor = "Z")
	private volatile boolean aBoolean149;

	@OriginalMember(owner = "client!efa", name = "t", descriptor = "J")
	private long aLong72;

	@OriginalMember(owner = "client!efa", name = "u", descriptor = "Lclient!qo;")
	private Class291 aClass291_1;

	@OriginalMember(owner = "client!efa", name = "v", descriptor = "I")
	private int anInt1984;

	@OriginalMember(owner = "client!efa", name = "x", descriptor = "J")
	private long aLong73;

	@OriginalMember(owner = "client!efa", name = "y", descriptor = "Ljava/lang/String;")
	private String aString32;

	@OriginalMember(owner = "client!efa", name = "A", descriptor = "I")
	private int anInt1986;

	@OriginalMember(owner = "client!efa", name = "l", descriptor = "Lclient!sa;")
	private Interface22 anInterface22_1 = new Class167();

	@OriginalMember(owner = "client!efa", name = "w", descriptor = "Lclient!sa;")
	private Interface22 anInterface22_2 = null;

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(I)Lclient!qo;")
	public Class291 method1822() {
		return this.aClass291_1;
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(B)I")
	public int method1823() {
		return this.anInt1984;
	}

	@OriginalMember(owner = "client!efa", name = "b", descriptor = "(I)I")
	public int method1824() {
		return this.anInt1986;
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(Lclient!sa;Z)V")
	public synchronized void method1825(@OriginalArg(0) Interface22 arg0) {
		this.anInterface22_2 = this.anInterface22_1;
		this.anInterface22_1 = arg0;
		this.aLong73 = Static205.method3179();
	}

	@OriginalMember(owner = "client!efa", name = "c", descriptor = "(I)V")
	public void method1826() {
		this.aBoolean149 = true;
	}

	@OriginalMember(owner = "client!efa", name = "b", descriptor = "(B)J")
	public long method1827() {
		return this.aLong72;
	}

	@OriginalMember(owner = "client!efa", name = "c", descriptor = "(B)I")
	public int method1829() {
		if (this.aClass291_1 == null) {
			return 0;
		}
		@Pc(13) int local13 = this.aClass291_1.method6904();
		if (this.aClass291_1.aBoolean659 && this.aClass291_1.anInt7917 > this.anInt1984) {
			return this.anInt1984 + 1;
		} else if (local13 >= 0 && Static593.aClass291Array1.length - 1 > local13) {
			return this.aClass291_1.anInt7918 == this.anInt1984 ? this.aClass291_1.anInt7917 : this.aClass291_1.anInt7918;
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!efa", name = "d", descriptor = "(B)Z")
	public synchronized boolean method1830() {
		return this.anInterface22_1.method6468(this.aLong73);
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(Ljava/lang/String;ILclient!qo;JI)V")
	public synchronized void method1831(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class291 arg2, @OriginalArg(3) long arg3) {
		this.anInt1984 = arg1;
		this.aClass291_1 = arg2;
		this.aString32 = arg0;
		this.aLong72 = arg3;
	}

	@OriginalMember(owner = "client!efa", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean149) {
			@Pc(6) long local6 = Static205.method3179();
			synchronized (this) {
				try {
					this.anInt1986++;
					if (this.anInterface22_1 instanceof Class167) {
						this.anInterface22_1.method6467(this.aBoolean148);
					} else {
						@Pc(31) long local31 = Static205.method3179();
						if (Static485.aClass126_17 == null || this.anInterface22_2 == null || this.anInterface22_2.method6465() == 0 || this.aLong73 < local31 - (long) this.anInterface22_2.method6465()) {
							if (this.anInterface22_2 != null) {
								this.aBoolean148 = true;
								this.anInterface22_2.method6466();
								this.anInterface22_2 = null;
							}
							if (this.aBoolean148) {
								Static639.method8796();
								if (Static485.aClass126_17 != null) {
									Static485.aClass126_17.GA(0);
								}
							}
							this.anInterface22_1.method6467(this.aBoolean148 || Static485.aClass126_17 != null && Static485.aClass126_17.method6993());
						} else {
							@Pc(110) int local110 = (int) ((local31 - this.aLong73) * 255L / (long) this.anInterface22_2.method6465());
							@Pc(114) int local114 = 255 - local110;
							@Pc(120) int local120 = local114 << 24 | 0xFFFFFF;
							Static639.method8796();
							@Pc(128) int local128 = local110 << 24 | 0xFFFFFF;
							Static485.aClass126_17.GA(0);
							@Pc(137) Class44 local137 = Static485.aClass126_17.method6996(Static254.anInt4283, Static438.anInt7403, true);
							Static485.aClass126_17.method7030(local137);
							this.anInterface22_2.method6467(true);
							Static485.aClass126_17.method7061();
							local137.method5322(0, 0, 0, local120, 1);
							Static485.aClass126_17.method7030(local137);
							Static485.aClass126_17.GA(0);
							this.anInterface22_1.method6467(true);
							Static485.aClass126_17.method7061();
							local137.method5322(0, 0, 0, local128, 1);
						}
						try {
							if (Static485.aClass126_17 != null && !(this.anInterface22_1 instanceof Class167)) {
								Static485.aClass126_17.method7050();
							}
						} catch (@Pc(187) Exception_Sub1 local187) {
							Static280.method4194(local187.getMessage() + " (Recovered) " + Static108.aClient1.method1207(), local187);
							Static590.method8288(true, 0);
						}
					}
					@Pc(214) Container local214;
					if (Static510.aFrame2 != null) {
						local214 = Static510.aFrame2;
					} else if (Static270.anApplet5 == null) {
						local214 = Static3.anApplet_Sub1_1;
					} else {
						local214 = Static270.anApplet5;
					}
					local214.getSize();
					local214.getSize();
					if (Static510.aFrame2 == local214) {
						Static510.aFrame2.getInsets();
					}
					this.aBoolean148 = false;
					if (Static485.aClass126_17 != null && !(this.anInterface22_1 instanceof Class167) && this.aClass291_1.method6904() < Static472.aClass291_21.method6904()) {
						Static110.method1619();
					}
				} catch (@Pc(259) Exception local259) {
					continue;
				}
			}
			@Pc(271) long local271 = Static205.method3179();
			@Pc(279) int local279 = (int) (local6 + 20L - local271);
			if (local279 > 0) {
				Static452.method7478((long) local279);
			}
		}
	}

	@OriginalMember(owner = "client!efa", name = "e", descriptor = "(B)V")
	public synchronized void method1832() {
		this.aBoolean148 = true;
	}

	@OriginalMember(owner = "client!efa", name = "f", descriptor = "(B)Ljava/lang/String;")
	public String method1833() {
		return this.aString32;
	}
}
