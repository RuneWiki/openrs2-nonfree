import java.awt.Container;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cu")
public final class Class59 implements Runnable {

	@OriginalMember(owner = "client!cu", name = "c", descriptor = "Z")
	private boolean aBoolean136;

	@OriginalMember(owner = "client!cu", name = "q", descriptor = "Z")
	private volatile boolean aBoolean137;

	@OriginalMember(owner = "client!cu", name = "s", descriptor = "I")
	private int anInt2089;

	@OriginalMember(owner = "client!cu", name = "t", descriptor = "J")
	private long aLong39;

	@OriginalMember(owner = "client!cu", name = "u", descriptor = "Ljava/lang/String;")
	private String aString11;

	@OriginalMember(owner = "client!cu", name = "v", descriptor = "I")
	private int anInt2090;

	@OriginalMember(owner = "client!cu", name = "x", descriptor = "J")
	private long aLong40;

	@OriginalMember(owner = "client!cu", name = "y", descriptor = "Lclient!sj;")
	private Class310 aClass310_1;

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "Lclient!tga;")
	private Interface21 anInterface21_1 = new Class152();

	@OriginalMember(owner = "client!cu", name = "w", descriptor = "Lclient!tga;")
	private Interface21 anInterface21_2 = null;

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(Z)V")
	public synchronized void method1953() {
		this.aBoolean136 = true;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(B)I")
	public int method1954() {
		return this.anInt2089;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(I)I")
	public int method1955() {
		if (this.aClass310_1 == null) {
			return 0;
		}
		@Pc(13) int local13 = this.aClass310_1.method7732();
		if (this.aClass310_1.aBoolean642 && this.aClass310_1.anInt8980 > this.anInt2090) {
			return this.anInt2090 + 1;
		} else if (local13 >= 0 && local13 < Static356.aClass310Array1.length - 1) {
			return this.anInt2090 == this.aClass310_1.anInt8983 ? this.aClass310_1.anInt8980 : this.aClass310_1.anInt8983;
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!cu", name = "c", descriptor = "(I)Lclient!sj;")
	public Class310 method1957() {
		return this.aClass310_1;
	}

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "(Z)V")
	public void method1959() {
		this.aBoolean137 = true;
	}

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "(B)J")
	public long method1960() {
		return this.aLong39;
	}

	@OriginalMember(owner = "client!cu", name = "d", descriptor = "(I)I")
	public int method1961() {
		return this.anInt2090;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(Lclient!tga;B)V")
	public synchronized void method1962(@OriginalArg(0) Interface21 arg0) {
		this.anInterface21_2 = this.anInterface21_1;
		this.anInterface21_1 = arg0;
		this.aLong40 = Static374.method6036();
	}

	@OriginalMember(owner = "client!cu", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean137) {
			@Pc(6) long local6 = Static374.method6036();
			synchronized (this) {
				try {
					this.anInt2089++;
					if (this.anInterface21_1 instanceof Class152) {
						this.anInterface21_1.method3921(this.aBoolean136);
					} else {
						@Pc(23) long local23 = Static374.method6036();
						if (Static323.aClass5_9 == null || this.anInterface21_2 == null || this.anInterface21_2.method3920() == 0 || this.aLong40 < local23 - (long) this.anInterface21_2.method3920()) {
							if (this.anInterface21_2 != null) {
								this.aBoolean136 = true;
								this.anInterface21_2.method3924();
								this.anInterface21_2 = null;
							}
							if (this.aBoolean136) {
								Static428.method4107();
								if (Static323.aClass5_9 != null) {
									Static323.aClass5_9.GA(0);
								}
							}
							this.anInterface21_1.method3921(this.aBoolean136 || Static323.aClass5_9 != null && Static323.aClass5_9.method7518());
						} else {
							@Pc(103) int local103 = (int) ((local23 - this.aLong40) * 255L / (long) this.anInterface21_2.method3920());
							@Pc(108) int local108 = 255 - local103;
							@Pc(114) int local114 = local103 << 24 | 0xFFFFFF;
							@Pc(120) int local120 = local108 << 24 | 0xFFFFFF;
							Static428.method4107();
							Static323.aClass5_9.GA(0);
							@Pc(131) Class24 local131 = Static323.aClass5_9.method7524(Static109.anInt2357, Static330.anInt6165, true);
							Static323.aClass5_9.method7531(local131);
							this.anInterface21_2.method3921(true);
							Static323.aClass5_9.method7535();
							local131.method8570(0, 0, 0, local120, 1);
							Static323.aClass5_9.method7531(local131);
							Static323.aClass5_9.GA(0);
							this.anInterface21_1.method3921(true);
							Static323.aClass5_9.method7535();
							local131.method8570(0, 0, 0, local114, 1);
						}
						try {
							if (Static323.aClass5_9 != null && !(this.anInterface21_1 instanceof Class152)) {
								Static323.aClass5_9.method7557();
							}
						} catch (@Pc(181) Exception_Sub1 local181) {
							Static335.method5467(local181.getMessage() + " (Recovered) " + Static116.aClient1.method1803(), local181);
							Static441.method6865(true, 0);
						}
					}
					@Pc(215) Container local215;
					if (Static209.aFrame3 != null) {
						local215 = Static209.aFrame3;
					} else if (Static504.anApplet2 == null) {
						local215 = Static128.anApplet_Sub1_1;
					} else {
						local215 = Static504.anApplet2;
					}
					local215.getSize();
					local215.getSize();
					if (Static209.aFrame3 == local215) {
						Static209.aFrame3.getInsets();
					}
					this.aBoolean136 = false;
					if (Static323.aClass5_9 != null) {
						Static157.method2847();
					}
				} catch (@Pc(244) Exception local244) {
					continue;
				}
			}
			@Pc(256) long local256 = Static374.method6036();
			@Pc(263) int local263 = (int) (local6 + 20L - local256);
			if (local263 > 0) {
				Static258.method4293((long) local263);
			}
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(Lclient!sj;Ljava/lang/String;JII)V")
	public synchronized void method1963(@OriginalArg(0) Class310 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3) {
		this.anInt2090 = arg3;
		this.aLong39 = arg2;
		this.aString11 = arg1;
		this.aClass310_1 = arg0;
	}

	@OriginalMember(owner = "client!cu", name = "c", descriptor = "(Z)Z")
	public synchronized boolean method1964() {
		return this.anInterface21_1.method3919(this.aLong40);
	}

	@OriginalMember(owner = "client!cu", name = "e", descriptor = "(I)Ljava/lang/String;")
	public String method1965() {
		return this.aString11;
	}
}
