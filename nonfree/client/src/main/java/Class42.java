import java.awt.Container;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bo")
public final class Class42 implements Runnable {

	@OriginalMember(owner = "client!bo", name = "d", descriptor = "Z")
	private volatile boolean aBoolean123;

	@OriginalMember(owner = "client!bo", name = "e", descriptor = "Z")
	private boolean aBoolean124;

	@OriginalMember(owner = "client!bo", name = "k", descriptor = "Lclient!rj;")
	private Class296 aClass296_1;

	@OriginalMember(owner = "client!bo", name = "l", descriptor = "I")
	private int anInt1617;

	@OriginalMember(owner = "client!bo", name = "m", descriptor = "Ljava/lang/String;")
	private String aString12;

	@OriginalMember(owner = "client!bo", name = "o", descriptor = "J")
	private long aLong35;

	@OriginalMember(owner = "client!bo", name = "s", descriptor = "I")
	private int anInt1622;

	@OriginalMember(owner = "client!bo", name = "z", descriptor = "J")
	private long aLong36;

	@OriginalMember(owner = "client!bo", name = "f", descriptor = "Lclient!nk;")
	private Interface18 anInterface18_1 = new Class370();

	@OriginalMember(owner = "client!bo", name = "j", descriptor = "Lclient!nk;")
	private Interface18 anInterface18_2 = null;

	@OriginalMember(owner = "client!bo", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean123) {
			@Pc(6) long local6 = Static342.method5463();
			synchronized (this) {
				try {
					this.anInt1622++;
					if (this.anInterface18_1 instanceof Class370) {
						this.anInterface18_1.method8417(this.aBoolean124);
					} else {
						@Pc(31) long local31 = Static342.method5463();
						if (Static171.aClass16_5 == null || this.anInterface18_2 == null || this.anInterface18_2.method8416() == 0 || this.aLong35 < local31 - (long) this.anInterface18_2.method8416()) {
							if (this.anInterface18_2 != null) {
								this.aBoolean124 = true;
								this.anInterface18_2.method8414();
								this.anInterface18_2 = null;
							}
							if (this.aBoolean124) {
								Static582.method8106();
								if (Static171.aClass16_5 != null) {
									Static171.aClass16_5.GA(0);
								}
							}
							this.anInterface18_1.method8417(this.aBoolean124 || Static171.aClass16_5 != null && Static171.aClass16_5.method6056());
						} else {
							@Pc(111) int local111 = (int) ((local31 - this.aLong35) * 255L / (long) this.anInterface18_2.method8416());
							@Pc(116) int local116 = 255 - local111;
							@Pc(122) int local122 = local116 << 24 | 0xFFFFFF;
							Static582.method8106();
							@Pc(130) int local130 = local111 << 24 | 0xFFFFFF;
							Static171.aClass16_5.GA(0);
							@Pc(139) Class21 local139 = Static171.aClass16_5.method6060(Static235.anInt5298, Static313.anInt6355, true);
							Static171.aClass16_5.method6062(local139);
							this.anInterface18_2.method8417(true);
							Static171.aClass16_5.method6128();
							local139.method5791(0, 0, 0, local122, 1);
							Static171.aClass16_5.method6062(local139);
							Static171.aClass16_5.GA(0);
							this.anInterface18_1.method8417(true);
							Static171.aClass16_5.method6128();
							local139.method5791(0, 0, 0, local130, 1);
						}
						try {
							if (Static171.aClass16_5 != null && !(this.anInterface18_1 instanceof Class370)) {
								Static171.aClass16_5.method6098();
							}
						} catch (@Pc(189) Exception_Sub1 local189) {
							Static596.method8231(local189.getMessage() + " (Recovered) " + Static227.aClient1.method1912(), local189);
							Static553.method7773(true, 0);
						}
					}
					@Pc(216) Container local216;
					if (Static602.aFrame3 != null) {
						local216 = Static602.aFrame3;
					} else if (Static152.anApplet1 == null) {
						local216 = Static370.anApplet_Sub1_1;
					} else {
						local216 = Static152.anApplet1;
					}
					local216.getSize();
					local216.getSize();
					if (local216 == Static602.aFrame3) {
						Static602.aFrame3.getInsets();
					}
					this.aBoolean124 = false;
					if (Static171.aClass16_5 != null && !(this.anInterface18_1 instanceof Class370) && this.aClass296_1.method7183() < Static490.aClass296_21.method7183()) {
						Static163.method3266();
					}
				} catch (@Pc(261) Exception local261) {
					continue;
				}
			}
			@Pc(273) long local273 = Static342.method5463();
			@Pc(281) int local281 = (int) (local6 + 20L - local273);
			if (local281 > 0) {
				Static214.method4061((long) local281);
			}
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)I")
	public int method1395() {
		if (this.aClass296_1 == null) {
			return 0;
		}
		@Pc(15) int local15 = this.aClass296_1.method7183();
		if (this.aClass296_1.aBoolean615 && this.aClass296_1.anInt8691 > this.anInt1617) {
			return this.anInt1617 + 1;
		} else if (local15 >= 0 && local15 < Static73.aClass296Array1.length - 1) {
			return this.aClass296_1.anInt8689 == this.anInt1617 ? this.aClass296_1.anInt8691 : this.aClass296_1.anInt8689;
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(I)V")
	public synchronized void method1397() {
		this.aBoolean124 = true;
	}

	@OriginalMember(owner = "client!bo", name = "d", descriptor = "(I)I")
	public int method1399() {
		return this.anInt1617;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!nk;I)V")
	public synchronized void method1400(@OriginalArg(0) Interface18 arg0) {
		this.anInterface18_2 = this.anInterface18_1;
		this.anInterface18_1 = arg0;
		this.aLong35 = Static342.method5463();
	}

	@OriginalMember(owner = "client!bo", name = "e", descriptor = "(I)Z")
	public synchronized boolean method1401() {
		return this.anInterface18_1.method8415(this.aLong35);
	}

	@OriginalMember(owner = "client!bo", name = "f", descriptor = "(I)I")
	public int method1402() {
		return this.anInt1622;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(B)J")
	public long method1403() {
		return this.aLong36;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!rj;IJBLjava/lang/String;)V")
	public synchronized void method1405(@OriginalArg(0) Class296 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(4) String arg3) {
		this.anInt1617 = arg1;
		this.aString12 = arg3;
		this.aClass296_1 = arg0;
		this.aLong36 = arg2;
	}

	@OriginalMember(owner = "client!bo", name = "g", descriptor = "(I)Ljava/lang/String;")
	public String method1406() {
		return this.aString12;
	}

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "(B)Lclient!rj;")
	public Class296 method1408() {
		return this.aClass296_1;
	}

	@OriginalMember(owner = "client!bo", name = "d", descriptor = "(B)V")
	public void method1409() {
		this.aBoolean123 = true;
	}
}
