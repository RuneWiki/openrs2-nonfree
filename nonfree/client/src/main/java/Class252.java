import java.awt.Container;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ol")
public final class Class252 implements Runnable {

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "Z")
	private volatile boolean aBoolean455;

	@OriginalMember(owner = "client!ol", name = "n", descriptor = "Z")
	private boolean aBoolean456;

	@OriginalMember(owner = "client!ol", name = "v", descriptor = "Lclient!sp;")
	private Class323 aClass323_2;

	@OriginalMember(owner = "client!ol", name = "w", descriptor = "Ljava/lang/String;")
	private String aString86;

	@OriginalMember(owner = "client!ol", name = "x", descriptor = "I")
	private int anInt6360;

	@OriginalMember(owner = "client!ol", name = "z", descriptor = "J")
	private long aLong185;

	@OriginalMember(owner = "client!ol", name = "A", descriptor = "J")
	private long aLong186;

	@OriginalMember(owner = "client!ol", name = "B", descriptor = "I")
	private int anInt6361;

	@OriginalMember(owner = "client!ol", name = "u", descriptor = "Lclient!fh;")
	private Interface8 anInterface8_1 = new Class22();

	@OriginalMember(owner = "client!ol", name = "y", descriptor = "Lclient!fh;")
	private Interface8 anInterface8_2 = null;

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)Z")
	public synchronized boolean method5477() {
		return this.anInterface8_1.method8056(this.aLong185);
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)V")
	public void method5479() {
		this.aBoolean455 = true;
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(B)V")
	public synchronized void method5480() {
		this.aBoolean456 = true;
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(I)Lclient!sp;")
	public Class323 method5484() {
		return this.aClass323_2;
	}

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "(I)I")
	public int method5485() {
		return this.anInt6360;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(ILclient!sp;Ljava/lang/String;JB)V")
	public synchronized void method5486(@OriginalArg(0) int arg0, @OriginalArg(1) Class323 arg1, @OriginalArg(2) String arg2, @OriginalArg(3) long arg3) {
		this.aClass323_2 = arg1;
		this.aString86 = arg2;
		this.anInt6360 = arg0;
		this.aLong186 = arg3;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lclient!fh;I)V")
	public synchronized void method5487(@OriginalArg(0) Interface8 arg0) {
		this.anInterface8_2 = this.anInterface8_1;
		this.anInterface8_1 = arg0;
		this.aLong185 = Static476.method6413();
	}

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "(B)I")
	public int method5488() {
		if (this.aClass323_2 == null) {
			return 0;
		}
		@Pc(13) int local13 = this.aClass323_2.method7297();
		if (this.aClass323_2.aBoolean653 && this.aClass323_2.anInt8660 > this.anInt6360) {
			return this.anInt6360 + 1;
		} else if (local13 >= 0 && Static365.aClass323Array1.length - 1 > local13) {
			return this.anInt6360 == this.aClass323_2.anInt8662 ? this.aClass323_2.anInt8660 : this.aClass323_2.anInt8662;
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!ol", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean455) {
			@Pc(10) long local10 = Static476.method6413();
			synchronized (this) {
				try {
					this.anInt6361++;
					if (this.anInterface8_1 instanceof Class22) {
						this.anInterface8_1.method8061(this.aBoolean456);
					} else {
						@Pc(27) long local27 = Static476.method6413();
						if (Static192.aClass95_4 == null || this.anInterface8_2 == null || this.anInterface8_2.method8058() == 0 || this.aLong185 < local27 - (long) this.anInterface8_2.method8058()) {
							if (this.anInterface8_2 != null) {
								this.aBoolean456 = true;
								this.anInterface8_2.method8059();
								this.anInterface8_2 = null;
							}
							if (this.aBoolean456) {
								Static130.method1828();
								if (Static192.aClass95_4 != null) {
									Static192.aClass95_4.GA(0);
								}
							}
							this.anInterface8_1.method8061(this.aBoolean456 || Static192.aClass95_4 != null && Static192.aClass95_4.method6958());
						} else {
							@Pc(103) int local103 = (int) ((local27 - this.aLong185) * 255L / (long) this.anInterface8_2.method8058());
							@Pc(108) int local108 = 255 - local103;
							Static130.method1828();
							@Pc(116) int local116 = local108 << 24 | 0xFFFFFF;
							@Pc(122) int local122 = local103 << 24 | 0xFFFFFF;
							Static192.aClass95_4.GA(0);
							@Pc(131) Class61 local131 = Static192.aClass95_4.method6952(Static511.anInt8548, Static153.anInt2747, true);
							Static192.aClass95_4.method6973(local131);
							this.anInterface8_2.method8061(true);
							Static192.aClass95_4.method7000();
							local131.method6434(0, 0, 0, local116, 1);
							Static192.aClass95_4.method6973(local131);
							Static192.aClass95_4.GA(0);
							this.anInterface8_1.method8061(true);
							Static192.aClass95_4.method7000();
							local131.method6434(0, 0, 0, local122, 1);
						}
						try {
							if (Static192.aClass95_4 != null && !(this.anInterface8_1 instanceof Class22)) {
								Static192.aClass95_4.method6975();
							}
						} catch (@Pc(181) Exception_Sub1 local181) {
							Static163.method2447(local181, local181.getMessage() + " (Recovered) " + Static78.aClient1.method1051());
							Static317.method4257(true, 0);
						}
					}
					@Pc(213) Container local213;
					if (Static202.aFrame2 != null) {
						local213 = Static202.aFrame2;
					} else if (Static617.anApplet2 == null) {
						local213 = Static263.anApplet_Sub1_1;
					} else {
						local213 = Static617.anApplet2;
					}
					local213.getSize();
					local213.getSize();
					if (Static202.aFrame2 == local213) {
						Static202.aFrame2.getInsets();
					}
					this.aBoolean456 = false;
					if (Static192.aClass95_4 != null && !(this.anInterface8_1 instanceof Class22) && Static38.anInt777 == -1) {
						Static236.method3210();
					}
				} catch (@Pc(252) Exception local252) {
					continue;
				}
			}
			@Pc(264) long local264 = Static476.method6413();
			@Pc(271) int local271 = (int) (local10 + 20L - local264);
			if (local271 > 0) {
				Static444.method6061((long) local271);
			}
		}
	}

	@OriginalMember(owner = "client!ol", name = "d", descriptor = "(I)I")
	public int method5489() {
		return this.anInt6361;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Z)J")
	public long method5490() {
		return this.aLong186;
	}

	@OriginalMember(owner = "client!ol", name = "d", descriptor = "(B)Ljava/lang/String;")
	public String method5491() {
		return this.aString86;
	}
}
