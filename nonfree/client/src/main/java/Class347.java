import java.awt.Container;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uha")
public final class Class347 implements Runnable {

	@OriginalMember(owner = "client!uha", name = "g", descriptor = "Z")
	private volatile boolean aBoolean689;

	@OriginalMember(owner = "client!uha", name = "s", descriptor = "Z")
	private boolean aBoolean690;

	@OriginalMember(owner = "client!uha", name = "w", descriptor = "J")
	private long aLong242;

	@OriginalMember(owner = "client!uha", name = "x", descriptor = "J")
	private long aLong243;

	@OriginalMember(owner = "client!uha", name = "y", descriptor = "Ljava/lang/String;")
	private String aString104;

	@OriginalMember(owner = "client!uha", name = "A", descriptor = "Lclient!ps;")
	private Class277 aClass277_23;

	@OriginalMember(owner = "client!uha", name = "B", descriptor = "I")
	private int anInt9592;

	@OriginalMember(owner = "client!uha", name = "C", descriptor = "I")
	private int anInt9593;

	@OriginalMember(owner = "client!uha", name = "r", descriptor = "Lclient!bia;")
	private Interface2 anInterface2_1 = new Class371();

	@OriginalMember(owner = "client!uha", name = "z", descriptor = "Lclient!bia;")
	private Interface2 anInterface2_2 = null;

	@OriginalMember(owner = "client!uha", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean689) {
			@Pc(10) long local10 = Static95.method1587();
			synchronized (this) {
				try {
					this.anInt9592++;
					if (this.anInterface2_1 instanceof Class371) {
						this.anInterface2_1.method8797(this.aBoolean690);
					} else {
						@Pc(35) long local35 = Static95.method1587();
						if (Static213.aClass133_5 == null || this.anInterface2_2 == null || this.anInterface2_2.method8796() == 0 || this.aLong242 < local35 - (long) this.anInterface2_2.method8796()) {
							if (this.anInterface2_2 != null) {
								this.aBoolean690 = true;
								this.anInterface2_2.method8795();
								this.anInterface2_2 = null;
							}
							if (this.aBoolean690) {
								Static181.method2785();
								if (Static213.aClass133_5 != null) {
									Static213.aClass133_5.GA(0);
								}
							}
							this.anInterface2_1.method8797(this.aBoolean690 || Static213.aClass133_5 != null && Static213.aClass133_5.method7240());
						} else {
							@Pc(112) int local112 = (int) ((local35 - this.aLong242) * 255L / (long) this.anInterface2_2.method8796());
							@Pc(116) int local116 = 255 - local112;
							@Pc(122) int local122 = local112 << 24 | 0xFFFFFF;
							Static181.method2785();
							@Pc(130) int local130 = local116 << 24 | 0xFFFFFF;
							Static213.aClass133_5.GA(0);
							@Pc(139) Class28 local139 = Static213.aClass133_5.method7290(Static345.anInt5827, Static408.anInt7118, true);
							Static213.aClass133_5.method7253(local139);
							this.anInterface2_2.method8797(true);
							Static213.aClass133_5.method7267();
							local139.method4034(0, 0, 0, local130, 1);
							Static213.aClass133_5.method7253(local139);
							Static213.aClass133_5.GA(0);
							this.anInterface2_1.method8797(true);
							Static213.aClass133_5.method7267();
							local139.method4034(0, 0, 0, local122, 1);
						}
						try {
							if (Static213.aClass133_5 != null && !(this.anInterface2_1 instanceof Class371)) {
								Static213.aClass133_5.method7316();
							}
						} catch (@Pc(189) Exception_Sub1 local189) {
							Static524.method7740(local189, local189.getMessage() + " (Recovered) " + Static475.aClient1.method1280());
							Static638.method9004(0, true);
						}
					}
					@Pc(214) Container local214;
					if (Static190.aFrame1 != null) {
						local214 = Static190.aFrame1;
					} else if (Static7.anApplet1 == null) {
						local214 = Static580.anApplet_Sub1_1;
					} else {
						local214 = Static7.anApplet1;
					}
					local214.getSize();
					local214.getSize();
					if (local214 == Static190.aFrame1) {
						Static190.aFrame1.getInsets();
					}
					this.aBoolean690 = false;
					if (Static213.aClass133_5 != null && !(this.anInterface2_1 instanceof Class371) && this.aClass277_23.method6654() < Static437.aClass277_19.method6654()) {
						Static521.method7716();
					}
				} catch (@Pc(261) Exception local261) {
					continue;
				}
			}
			@Pc(273) long local273 = Static95.method1587();
			@Pc(280) int local280 = (int) (local10 + 20L - local273);
			if (local280 > 0) {
				Static314.method4821((long) local280);
			}
		}
	}

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(I)V")
	public void method8225() {
		this.aBoolean689 = true;
	}

	@OriginalMember(owner = "client!uha", name = "b", descriptor = "(I)Ljava/lang/String;")
	public String method8226() {
		return this.aString104;
	}

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(ZLclient!bia;)V")
	public synchronized void method8227(@OriginalArg(1) Interface2 arg0) {
		this.anInterface2_2 = this.anInterface2_1;
		this.anInterface2_1 = arg0;
		this.aLong242 = Static95.method1587();
	}

	@OriginalMember(owner = "client!uha", name = "c", descriptor = "(I)Z")
	public synchronized boolean method8228() {
		return this.anInterface2_1.method8792(this.aLong242);
	}

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(Z)I")
	public int method8229() {
		return this.anInt9593;
	}

	@OriginalMember(owner = "client!uha", name = "d", descriptor = "(I)V")
	public synchronized void method8230() {
		this.aBoolean690 = true;
	}

	@OriginalMember(owner = "client!uha", name = "e", descriptor = "(I)I")
	public int method8231() {
		if (this.aClass277_23 == null) {
			return 0;
		}
		@Pc(13) int local13 = this.aClass277_23.method6654();
		if (this.aClass277_23.aBoolean536 && this.aClass277_23.anInt7507 > this.anInt9593) {
			return this.anInt9593 + 1;
		} else if (local13 >= 0 && local13 < Static353.aClass277Array1.length - 1) {
			return this.anInt9593 == this.aClass277_23.anInt7504 ? this.aClass277_23.anInt7507 : this.aClass277_23.anInt7504;
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!uha", name = "b", descriptor = "(Z)Lclient!ps;")
	public Class277 method8233() {
		return this.aClass277_23;
	}

	@OriginalMember(owner = "client!uha", name = "b", descriptor = "(B)I")
	public int method8237() {
		return this.anInt9592;
	}

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(JBILclient!ps;Ljava/lang/String;)V")
	public synchronized void method8238(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class277 arg2, @OriginalArg(4) String arg3) {
		this.anInt9593 = arg1;
		this.aLong243 = arg0;
		this.aClass277_23 = arg2;
		this.aString104 = arg3;
	}

	@OriginalMember(owner = "client!uha", name = "c", descriptor = "(Z)J")
	public long method8239() {
		return this.aLong243;
	}
}
