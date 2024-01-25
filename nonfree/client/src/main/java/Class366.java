import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wt")
public final class Class366 implements Runnable {

	@OriginalMember(owner = "client!wt", name = "s", descriptor = "Z")
	private boolean aBoolean730;

	@OriginalMember(owner = "client!wt", name = "u", descriptor = "Z")
	private volatile boolean aBoolean731;

	@OriginalMember(owner = "client!wt", name = "v", descriptor = "Lclient!rd;")
	private Class281 aClass281_24;

	@OriginalMember(owner = "client!wt", name = "w", descriptor = "I")
	private int anInt9418;

	@OriginalMember(owner = "client!wt", name = "y", descriptor = "J")
	private long aLong271;

	@OriginalMember(owner = "client!wt", name = "z", descriptor = "I")
	private int anInt9419;

	@OriginalMember(owner = "client!wt", name = "A", descriptor = "Ljava/lang/String;")
	private String aString130;

	@OriginalMember(owner = "client!wt", name = "C", descriptor = "J")
	private long aLong272;

	@OriginalMember(owner = "client!wt", name = "e", descriptor = "Lclient!jw;")
	private Interface13 anInterface13_1 = new Class81();

	@OriginalMember(owner = "client!wt", name = "x", descriptor = "Lclient!jw;")
	private Interface13 anInterface13_2 = null;

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)Ljava/lang/String;")
	public String method7794() {
		return this.aString130;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(B)Z")
	public synchronized boolean method7795() {
		return this.anInterface13_1.method5344(this.aLong271);
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(ILclient!jw;)V")
	public synchronized void method7796(@OriginalArg(1) Interface13 arg0) {
		this.anInterface13_2 = this.anInterface13_1;
		this.anInterface13_1 = arg0;
		this.aLong271 = Static587.method7753();
	}

	@OriginalMember(owner = "client!wt", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean731) {
			@Pc(6) long local6 = Static587.method7753();
			synchronized (this) {
				try {
					if (this.anInterface13_1 instanceof Class81) {
						this.anInterface13_1.method5345(this.aBoolean730);
					} else {
						this.anInt9418++;
						@Pc(31) long local31 = Static587.method7753();
						if (Static4.aClass43_1 == null || this.anInterface13_2 == null || this.anInterface13_2.method5347() == 0 || this.aLong271 < local31 - (long) this.anInterface13_2.method5347()) {
							if (this.anInterface13_2 != null) {
								this.aBoolean730 = true;
								this.anInterface13_2.method5348();
								this.anInterface13_2 = null;
							}
							if (this.aBoolean730) {
								Static572.method6782();
								if (Static4.aClass43_1 != null) {
									Static4.aClass43_1.ja(0);
								}
							}
							this.anInterface13_1.method5345(this.aBoolean730 || Static4.aClass43_1 != null && Static4.aClass43_1.method7147());
						} else {
							@Pc(71) int local71 = (int) ((local31 - this.aLong271) * 255L / (long) this.anInterface13_2.method5347());
							@Pc(76) int local76 = 255 - local71;
							@Pc(82) int local82 = local71 << 24 | 0xFFFFFF;
							Static572.method6782();
							@Pc(90) int local90 = local76 << 24 | 0xFFFFFF;
							Static4.aClass43_1.ja(0);
							@Pc(99) Class46 local99 = Static4.aClass43_1.method7143(Static318.anInt5754, Static447.anInt7372);
							Static4.aClass43_1.method7175(local99);
							this.anInterface13_2.method5345(true);
							Static4.aClass43_1.method7152();
							local99.V(0, 0, 0, local90, 1);
							Static4.aClass43_1.method7175(local99);
							Static4.aClass43_1.ja(0);
							this.anInterface13_1.method5345(true);
							Static4.aClass43_1.method7152();
							local99.V(0, 0, 0, local82, 1);
						}
						try {
							if (Static4.aClass43_1 != null && !(this.anInterface13_1 instanceof Class81)) {
								Static4.aClass43_1.method7197();
							}
						} catch (@Pc(188) Exception_Sub1 local188) {
							Static379.method5607(local188.getMessage() + " (Recovered) " + Static478.aClient1.method1613(), local188);
							Static137.method2648(0);
						}
					}
					this.aBoolean730 = false;
				} catch (@Pc(213) Exception local213) {
					continue;
				}
			}
			@Pc(225) long local225 = Static587.method7753();
			@Pc(233) int local233 = (int) (local6 + 20L - local225);
			if (local233 > 0) {
				Static374.method5521((long) local233);
			}
		}
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(Lclient!rd;IILjava/lang/String;J)V")
	public synchronized void method7797(@OriginalArg(0) Class281 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) long arg3) {
		this.aLong272 = arg3;
		this.aString130 = arg2;
		this.anInt9419 = arg1;
		this.aClass281_24 = arg0;
	}

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "(I)I")
	public int method7799() {
		if (this.aClass281_24 == null) {
			return 0;
		}
		@Pc(13) int local13 = this.aClass281_24.method6260();
		if (this.aClass281_24.aBoolean580 && this.aClass281_24.anInt7369 > this.anInt9419) {
			return this.anInt9419 + 1;
		} else if (local13 >= 0 && local13 < Static22.aClass281Array1.length - 1) {
			return this.aClass281_24.anInt7365 == this.anInt9419 ? this.aClass281_24.anInt7369 : this.aClass281_24.anInt7365;
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "(B)V")
	public void method7800() {
		this.aBoolean731 = true;
	}

	@OriginalMember(owner = "client!wt", name = "c", descriptor = "(I)Lclient!rd;")
	public Class281 method7801() {
		return this.aClass281_24;
	}

	@OriginalMember(owner = "client!wt", name = "c", descriptor = "(B)I")
	public int method7803() {
		return this.anInt9418;
	}

	@OriginalMember(owner = "client!wt", name = "d", descriptor = "(I)I")
	public int method7804() {
		return this.anInt9419;
	}

	@OriginalMember(owner = "client!wt", name = "d", descriptor = "(B)J")
	public long method7805() {
		return this.aLong272;
	}

	@OriginalMember(owner = "client!wt", name = "e", descriptor = "(I)V")
	public synchronized void method7806() {
		this.aBoolean730 = true;
	}
}
