import java.awt.Container;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class Class302 implements Runnable {

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "Z")
	private boolean aBoolean627;

	@OriginalMember(owner = "client!sc", name = "m", descriptor = "Z")
	private volatile boolean aBoolean628;

	@OriginalMember(owner = "client!sc", name = "u", descriptor = "Lclient!cia;")
	private Class53 aClass53_31;

	@OriginalMember(owner = "client!sc", name = "w", descriptor = "J")
	private long aLong230;

	@OriginalMember(owner = "client!sc", name = "x", descriptor = "I")
	private int anInt8583;

	@OriginalMember(owner = "client!sc", name = "y", descriptor = "I")
	private int anInt8584;

	@OriginalMember(owner = "client!sc", name = "z", descriptor = "Ljava/lang/String;")
	private String aString85;

	@OriginalMember(owner = "client!sc", name = "A", descriptor = "J")
	private long aLong231;

	@OriginalMember(owner = "client!sc", name = "r", descriptor = "Lclient!rk;")
	private Interface21 anInterface21_1 = new Class346();

	@OriginalMember(owner = "client!sc", name = "t", descriptor = "Lclient!rk;")
	private Interface21 anInterface21_2 = null;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!rk;I)V")
	public synchronized void method7389(@OriginalArg(0) Interface21 arg0) {
		this.anInterface21_2 = this.anInterface21_1;
		this.anInterface21_1 = arg0;
		this.aLong230 = Static191.method3071();
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)I")
	public int method7390() {
		if (this.aClass53_31 == null) {
			return 0;
		}
		@Pc(19) int local19 = this.aClass53_31.method1252();
		if (this.aClass53_31.aBoolean96 && this.aClass53_31.anInt1432 > this.anInt8584) {
			return this.anInt8584 + 1;
		} else if (local19 >= 0 && Static152.aClass53Array1.length - 1 > local19) {
			return this.anInt8584 == this.aClass53_31.anInt1431 ? this.aClass53_31.anInt1432 : this.aClass53_31.anInt1431;
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)I")
	public int method7391() {
		return this.anInt8583;
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)Lclient!cia;")
	public Class53 method7392() {
		return this.aClass53_31;
	}

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "(I)J")
	public long method7394() {
		return this.aLong231;
	}

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "(I)V")
	public void method7395() {
		this.aBoolean628 = true;
	}

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "(I)Ljava/lang/String;")
	public String method7396() {
		return this.aString85;
	}

	@OriginalMember(owner = "client!sc", name = "g", descriptor = "(I)V")
	public synchronized void method7397() {
		this.aBoolean627 = true;
	}

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "(I)I")
	public int method7398() {
		return this.anInt8584;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IJLjava/lang/String;ILclient!cia;)V")
	public synchronized void method7399(@OriginalArg(1) long arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class53 arg3) {
		this.anInt8584 = arg2;
		this.aClass53_31 = arg3;
		this.aLong231 = arg0;
		this.aString85 = arg1;
	}

	@OriginalMember(owner = "client!sc", name = "i", descriptor = "(I)Z")
	public synchronized boolean method7400() {
		return this.anInterface21_1.method8188(this.aLong230);
	}

	@OriginalMember(owner = "client!sc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean628) {
			@Pc(10) long local10 = Static191.method3071();
			synchronized (this) {
				try {
					this.anInt8583++;
					if (this.anInterface21_1 instanceof Class346) {
						this.anInterface21_1.method8187(this.aBoolean627);
					} else {
						@Pc(35) long local35 = Static191.method3071();
						if (Static266.aClass82_8 == null || this.anInterface21_2 == null || this.anInterface21_2.method8189() == 0 || this.aLong230 < local35 - (long) this.anInterface21_2.method8189()) {
							if (this.anInterface21_2 != null) {
								this.aBoolean627 = true;
								this.anInterface21_2.method8191();
								this.anInterface21_2 = null;
							}
							if (this.aBoolean627) {
								Static616.method8421();
								if (Static266.aClass82_8 != null) {
									Static266.aClass82_8.GA(0);
								}
							}
							this.anInterface21_1.method8187(this.aBoolean627 || Static266.aClass82_8 != null && Static266.aClass82_8.method6175());
						} else {
							@Pc(78) int local78 = (int) ((local35 - this.aLong230) * 255L / (long) this.anInterface21_2.method8189());
							@Pc(83) int local83 = 255 - local78;
							@Pc(89) int local89 = local78 << 24 | 0xFFFFFF;
							@Pc(95) int local95 = local83 << 24 | 0xFFFFFF;
							Static616.method8421();
							Static266.aClass82_8.GA(0);
							@Pc(106) Class103 local106 = Static266.aClass82_8.method6110(Static330.anInt6254, Static190.anInt3576, true);
							Static266.aClass82_8.method6117(local106);
							this.anInterface21_2.method8187(true);
							Static266.aClass82_8.method6167();
							local106.method7444(0, 0, 0, local95, 1);
							Static266.aClass82_8.method6117(local106);
							Static266.aClass82_8.GA(0);
							this.anInterface21_1.method8187(true);
							Static266.aClass82_8.method6167();
							local106.method7444(0, 0, 0, local89, 1);
						}
						try {
							if (Static266.aClass82_8 != null && !(this.anInterface21_1 instanceof Class346)) {
								Static266.aClass82_8.method6152();
							}
						} catch (@Pc(196) Exception_Sub1 local196) {
							Static296.method5075(local196, local196.getMessage() + " (Recovered) " + Static554.aClient1.method1301());
							Static230.method3973(0, true);
						}
					}
					@Pc(223) Container local223;
					if (Static190.aFrame1 != null) {
						local223 = Static190.aFrame1;
					} else if (Static303.anApplet3 == null) {
						local223 = Static467.anApplet_Sub1_1;
					} else {
						local223 = Static303.anApplet3;
					}
					local223.getSize();
					local223.getSize();
					if (Static190.aFrame1 == local223) {
						Static190.aFrame1.getInsets();
					}
					this.aBoolean627 = false;
					if (Static266.aClass82_8 != null && !(this.anInterface21_1 instanceof Class346) && this.aClass53_31.method1252() < Static72.aClass53_22.method1252()) {
						Static334.method5415();
					}
				} catch (@Pc(268) Exception local268) {
					continue;
				}
			}
			@Pc(280) long local280 = Static191.method3071();
			@Pc(288) int local288 = (int) (local10 + 20L - local280);
			if (local288 > 0) {
				Static143.method2414((long) local288);
			}
		}
	}
}
