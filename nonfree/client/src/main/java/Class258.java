import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ov")
public final class Class258 implements Runnable {

	@OriginalMember(owner = "client!ov", name = "i", descriptor = "Z")
	private volatile boolean aBoolean555;

	@OriginalMember(owner = "client!ov", name = "u", descriptor = "Z")
	private boolean aBoolean556;

	@OriginalMember(owner = "client!ov", name = "v", descriptor = "I")
	private int anInt7606;

	@OriginalMember(owner = "client!ov", name = "x", descriptor = "Lclient!ei;")
	private Class94 aClass94_23;

	@OriginalMember(owner = "client!ov", name = "y", descriptor = "J")
	private long aLong200;

	@OriginalMember(owner = "client!ov", name = "z", descriptor = "I")
	private int anInt7607;

	@OriginalMember(owner = "client!ov", name = "A", descriptor = "Ljava/lang/String;")
	private String aString152;

	@OriginalMember(owner = "client!ov", name = "B", descriptor = "J")
	private long aLong201;

	@OriginalMember(owner = "client!ov", name = "o", descriptor = "Lclient!nc;")
	private Interface15 anInterface15_1 = new Class130();

	@OriginalMember(owner = "client!ov", name = "w", descriptor = "Lclient!nc;")
	private Interface15 anInterface15_2 = null;

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(Lclient!nc;I)V")
	public synchronized void method5971(@OriginalArg(0) Interface15 arg0) {
		this.anInterface15_2 = this.anInterface15_1;
		this.anInterface15_1 = arg0;
		this.aLong201 = Static112.method2047();
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(BLjava/lang/String;JILclient!ei;)V")
	public synchronized void method5972(@OriginalArg(1) String arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class94 arg3) {
		this.anInt7607 = arg2;
		this.aLong200 = arg1;
		this.aClass94_23 = arg3;
		this.aString152 = arg0;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(B)I")
	public int method5973() {
		return this.anInt7606;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(Z)V")
	public void method5975() {
		this.aBoolean555 = true;
	}

	@OriginalMember(owner = "client!ov", name = "b", descriptor = "(Z)V")
	public synchronized void method5976() {
		this.aBoolean556 = true;
	}

	@OriginalMember(owner = "client!ov", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean555) {
			@Pc(10) long local10 = Static112.method2047();
			synchronized (this) {
				try {
					if (this.anInterface15_1 instanceof Class130) {
						this.anInterface15_1.method8256(this.aBoolean556);
					} else {
						this.anInt7606++;
						@Pc(27) long local27 = Static112.method2047();
						if (Static39.aClass7_2 == null || this.anInterface15_2 == null || this.anInterface15_2.method8255() == 0 || this.aLong201 < local27 - (long) this.anInterface15_2.method8255()) {
							if (this.anInterface15_2 != null) {
								this.aBoolean556 = true;
								this.anInterface15_2.method8260();
								this.anInterface15_2 = null;
							}
							if (this.aBoolean556) {
								Static452.method6641();
								if (Static39.aClass7_2 != null) {
									Static39.aClass7_2.ja(0);
								}
							}
							this.anInterface15_1.method8256(this.aBoolean556 || Static39.aClass7_2 != null && Static39.aClass7_2.method7847());
						} else {
							@Pc(67) int local67 = (int) ((local27 - this.aLong201) * 255L / (long) this.anInterface15_2.method8255());
							@Pc(72) int local72 = 255 - local67;
							@Pc(78) int local78 = local67 << 24 | 0xFFFFFF;
							@Pc(84) int local84 = local72 << 24 | 0xFFFFFF;
							Static452.method6641();
							Static39.aClass7_2.ja(0);
							@Pc(95) Class88 local95 = Static39.aClass7_2.method7855(Static123.anInt9150, Static71.anInt1872);
							Static39.aClass7_2.method7786(local95);
							this.anInterface15_2.method8256(true);
							Static39.aClass7_2.method7843();
							local95.V(0, 0, 0, local84, 1);
							Static39.aClass7_2.method7786(local95);
							Static39.aClass7_2.ja(0);
							this.anInterface15_1.method8256(true);
							Static39.aClass7_2.method7843();
							local95.V(0, 0, 0, local78, 1);
						}
						try {
							if (Static39.aClass7_2 != null && !(this.anInterface15_1 instanceof Class130)) {
								Static39.aClass7_2.method7827();
							}
						} catch (@Pc(184) Exception_Sub1 local184) {
							Static109.method2014(local184.getMessage() + " (Recovered) " + Static104.aClient3.method1524(), local184);
							Static146.method2531(0);
						}
					}
					this.aBoolean556 = false;
				} catch (@Pc(216) Exception local216) {
					continue;
				}
			}
			@Pc(228) long local228 = Static112.method2047();
			@Pc(235) int local235 = (int) (local10 + 20L - local228);
			if (local235 > 0) {
				Static214.method3478((long) local235);
			}
		}
	}

	@OriginalMember(owner = "client!ov", name = "b", descriptor = "(B)Lclient!ei;")
	public Class94 method5977() {
		return this.aClass94_23;
	}

	@OriginalMember(owner = "client!ov", name = "b", descriptor = "(I)Ljava/lang/String;")
	public String method5978() {
		return this.aString152;
	}

	@OriginalMember(owner = "client!ov", name = "c", descriptor = "(I)J")
	public long method5979() {
		return this.aLong200;
	}

	@OriginalMember(owner = "client!ov", name = "c", descriptor = "(Z)I")
	public int method5981() {
		if (this.aClass94_23 == null) {
			return 0;
		}
		@Pc(18) int local18 = this.aClass94_23.method2182();
		if (this.aClass94_23.aBoolean210 && this.aClass94_23.anInt2741 > this.anInt7607) {
			return this.anInt7607 + 1;
		} else if (local18 >= 0 && Static73.aClass94Array1.length - 1 > local18) {
			return this.aClass94_23.anInt2736 == this.anInt7607 ? this.aClass94_23.anInt2741 : this.aClass94_23.anInt2736;
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!ov", name = "d", descriptor = "(Z)Z")
	public synchronized boolean method5982() {
		return this.anInterface15_1.method8257(this.aLong201);
	}

	@OriginalMember(owner = "client!ov", name = "d", descriptor = "(I)I")
	public int method5983() {
		return this.anInt7607;
	}
}
