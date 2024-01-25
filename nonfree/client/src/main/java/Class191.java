import java.awt.Container;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class191 implements Runnable {

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "Z")
	private volatile boolean aBoolean337;

	@OriginalMember(owner = "client!kc", name = "j", descriptor = "Z")
	private boolean aBoolean338;

	@OriginalMember(owner = "client!kc", name = "s", descriptor = "I")
	private int anInt5072;

	@OriginalMember(owner = "client!kc", name = "t", descriptor = "Ljava/lang/String;")
	private String aString64;

	@OriginalMember(owner = "client!kc", name = "u", descriptor = "J")
	private long aLong139;

	@OriginalMember(owner = "client!kc", name = "v", descriptor = "I")
	private int anInt5073;

	@OriginalMember(owner = "client!kc", name = "x", descriptor = "Lclient!ida;")
	private Class159 aClass159_23;

	@OriginalMember(owner = "client!kc", name = "y", descriptor = "J")
	private long aLong140;

	@OriginalMember(owner = "client!kc", name = "k", descriptor = "Lclient!iw;")
	private Interface13 anInterface13_1 = new Class322();

	@OriginalMember(owner = "client!kc", name = "w", descriptor = "Lclient!iw;")
	private Interface13 anInterface13_2 = null;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)I")
	public int method4352() {
		return this.anInt5072;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)Z")
	public synchronized boolean method4353() {
		return this.anInterface13_1.method7041(this.aLong139);
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)V")
	public synchronized void method4355() {
		this.aBoolean338 = true;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILclient!iw;)V")
	public synchronized void method4356(@OriginalArg(1) Interface13 arg0) {
		this.anInterface13_2 = this.anInterface13_1;
		this.anInterface13_1 = arg0;
		this.aLong139 = Static15.method380();
	}

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "(I)I")
	public int method4357() {
		if (this.aClass159_23 == null) {
			return 0;
		}
		@Pc(13) int local13 = this.aClass159_23.method3708();
		if (this.aClass159_23.aBoolean292 && this.anInt5072 < this.aClass159_23.anInt4338) {
			return this.anInt5072 + 1;
		} else if (local13 >= 0 && Static279.aClass159Array1.length - 1 > local13) {
			return this.aClass159_23.anInt4341 == this.anInt5072 ? this.aClass159_23.anInt4338 : this.aClass159_23.anInt4341;
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!kc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean337) {
			@Pc(6) long local6 = Static15.method380();
			synchronized (this) {
				try {
					this.anInt5073++;
					if (this.anInterface13_1 instanceof Class322) {
						this.anInterface13_1.method7039(this.aBoolean338);
					} else {
						@Pc(31) long local31 = Static15.method380();
						if (Static119.aClass95_4 == null || this.anInterface13_2 == null || this.anInterface13_2.method7038() == 0 || this.aLong139 < local31 - (long) this.anInterface13_2.method7038()) {
							if (this.anInterface13_2 != null) {
								this.aBoolean338 = true;
								this.anInterface13_2.method7043();
								this.anInterface13_2 = null;
							}
							if (this.aBoolean338) {
								Static242.method5991();
								if (Static119.aClass95_4 != null) {
									Static119.aClass95_4.GA(0);
								}
							}
							this.anInterface13_1.method7039(this.aBoolean338 || Static119.aClass95_4 != null && Static119.aClass95_4.method7996());
						} else {
							@Pc(107) int local107 = (int) ((local31 - this.aLong139) * 255L / (long) this.anInterface13_2.method7038());
							@Pc(111) int local111 = 255 - local107;
							@Pc(117) int local117 = local107 << 24 | 0xFFFFFF;
							@Pc(123) int local123 = local111 << 24 | 0xFFFFFF;
							Static242.method5991();
							Static119.aClass95_4.GA(0);
							@Pc(134) Class6 local134 = Static119.aClass95_4.method8025(Static531.anInt8327, Static13.anInt306, true);
							Static119.aClass95_4.method7997(local134);
							this.anInterface13_2.method7039(true);
							Static119.aClass95_4.method8042();
							local134.method5133(0, 0, 0, local123, 1);
							Static119.aClass95_4.method7997(local134);
							Static119.aClass95_4.GA(0);
							this.anInterface13_1.method7039(true);
							Static119.aClass95_4.method8042();
							local134.method5133(0, 0, 0, local117, 1);
						}
						try {
							if (Static119.aClass95_4 != null && !(this.anInterface13_1 instanceof Class322)) {
								Static119.aClass95_4.method8020();
							}
						} catch (@Pc(184) Exception_Sub1 local184) {
							Static456.method6140(local184.getMessage() + " (Recovered) " + Static548.aClient1.method1361(), local184);
							Static168.method2665(true, 0);
						}
					}
					@Pc(211) Container local211;
					if (Static572.aFrame2 != null) {
						local211 = Static572.aFrame2;
					} else if (Static339.anApplet2 == null) {
						local211 = Static353.anApplet_Sub1_1;
					} else {
						local211 = Static339.anApplet2;
					}
					local211.getSize();
					local211.getSize();
					if (Static572.aFrame2 == local211) {
						Static572.aFrame2.getInsets();
					}
					this.aBoolean338 = false;
					if (Static119.aClass95_4 != null && !(this.anInterface13_1 instanceof Class322) && this.aClass159_23.method3708() < Static245.aClass159_20.method3708()) {
						Static2.method24();
					}
				} catch (@Pc(256) Exception local256) {
					continue;
				}
			}
			@Pc(268) long local268 = Static15.method380();
			@Pc(275) int local275 = (int) (local6 + 20L - local268);
			if (local275 > 0) {
				Static26.method592((long) local275);
			}
		}
	}

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "(I)Lclient!ida;")
	public Class159 method4359() {
		return this.aClass159_23;
	}

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "(I)Ljava/lang/String;")
	public String method4361() {
		return this.aString64;
	}

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "(I)I")
	public int method4362() {
		return this.anInt5073;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(BILjava/lang/String;JLclient!ida;)V")
	public synchronized void method4363(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) long arg2, @OriginalArg(4) Class159 arg3) {
		this.aString64 = arg1;
		this.aLong140 = arg2;
		this.aClass159_23 = arg3;
		this.anInt5072 = arg0;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Z)V")
	public void method4364() {
		this.aBoolean337 = true;
	}

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "(I)J")
	public long method4365() {
		return this.aLong140;
	}
}
