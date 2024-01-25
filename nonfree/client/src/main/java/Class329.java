import java.awt.Container;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sha")
public final class Class329 implements Runnable {

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "Z")
	private volatile boolean aBoolean643;

	@OriginalMember(owner = "client!sha", name = "d", descriptor = "Z")
	private boolean aBoolean644;

	@OriginalMember(owner = "client!sha", name = "t", descriptor = "Ljava/lang/String;")
	private String aString105;

	@OriginalMember(owner = "client!sha", name = "v", descriptor = "I")
	private int anInt9360;

	@OriginalMember(owner = "client!sha", name = "l", descriptor = "Lclient!ic;")
	private Class168 aClass168_23;

	@OriginalMember(owner = "client!sha", name = "i", descriptor = "I")
	private int anInt9361;

	@OriginalMember(owner = "client!sha", name = "k", descriptor = "J")
	private long aLong256;

	@OriginalMember(owner = "client!sha", name = "x", descriptor = "J")
	private long aLong257;

	@OriginalMember(owner = "client!sha", name = "q", descriptor = "Lclient!kk;")
	private Interface11 anInterface11_1 = new Class224();

	@OriginalMember(owner = "client!sha", name = "e", descriptor = "Lclient!kk;")
	private Interface11 anInterface11_2 = null;

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(I)Ljava/lang/String;")
	public String method8064() {
		return this.aString105;
	}

	@OriginalMember(owner = "client!sha", name = "b", descriptor = "(I)I")
	public int method8065() {
		return this.anInt9361;
	}

	@OriginalMember(owner = "client!sha", name = "f", descriptor = "(I)V")
	public synchronized void method8066() {
		this.aBoolean644 = true;
	}

	@OriginalMember(owner = "client!sha", name = "e", descriptor = "(I)I")
	public int method8067() {
		return this.anInt9360;
	}

	@OriginalMember(owner = "client!sha", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean643) {
			@Pc(12) long local12 = Static26.method382();
			synchronized (this) {
				try {
					this.anInt9361++;
					if (this.anInterface11_1 instanceof Class224) {
						this.anInterface11_1.method5418(this.aBoolean644);
					} else {
						@Pc(37) long local37 = Static26.method382();
						if (Static103.aClass144_3 == null || this.anInterface11_2 == null || this.anInterface11_2.method5413() == 0 || this.aLong257 < local37 - (long) this.anInterface11_2.method5413()) {
							if (this.anInterface11_2 != null) {
								this.aBoolean644 = true;
								this.anInterface11_2.method5417();
								this.anInterface11_2 = null;
							}
							if (this.aBoolean644) {
								Static118.method1852();
								if (Static103.aClass144_3 != null) {
									Static103.aClass144_3.GA(0);
								}
							}
							this.anInterface11_1.method5418(this.aBoolean644 || Static103.aClass144_3 != null && Static103.aClass144_3.method6944());
						} else {
							@Pc(87) int local87 = (int) ((local37 - this.aLong257) * 255L / (long) this.anInterface11_2.method5413());
							@Pc(91) int local91 = 255 - local87;
							@Pc(97) int local97 = local91 << 24 | 0xFFFFFF;
							@Pc(103) int local103 = local87 << 24 | 0xFFFFFF;
							Static118.method1852();
							Static103.aClass144_3.GA(0);
							@Pc(114) Class45 local114 = Static103.aClass144_3.method6890(Static563.anInt4939, Static506.anInt8791, true);
							Static103.aClass144_3.method6929(local114);
							this.anInterface11_2.method5418(true);
							Static103.aClass144_3.method6953();
							local114.method7491(0, 0, 0, local97, 1);
							Static103.aClass144_3.method6929(local114);
							Static103.aClass144_3.GA(0);
							this.anInterface11_1.method5418(true);
							Static103.aClass144_3.method6953();
							local114.method7491(0, 0, 0, local103, 1);
						}
						try {
							if (Static103.aClass144_3 != null && !(this.anInterface11_1 instanceof Class224)) {
								Static103.aClass144_3.method6928();
							}
						} catch (@Pc(219) Exception_Sub1 local219) {
							Static629.method8829(local219.getMessage() + " (Recovered) " + Static105.aClient4.method1350(), local219);
							Static459.method8986(true, 0);
						}
					}
					@Pc(250) Container local250;
					if (Static613.aFrame2 != null) {
						local250 = Static613.aFrame2;
					} else if (Static531.anApplet2 == null) {
						local250 = Static267.anApplet_Sub1_1;
					} else {
						local250 = Static531.anApplet2;
					}
					local250.getSize();
					local250.getSize();
					if (local250 == Static613.aFrame2) {
						Static613.aFrame2.getInsets();
					}
					this.aBoolean644 = false;
					if (Static103.aClass144_3 != null && !(this.anInterface11_1 instanceof Class224) && this.aClass168_23.method4057() < Static243.aClass168_20.method4057()) {
						Static261.method4366();
					}
				} catch (@Pc(297) Exception local297) {
					continue;
				}
			}
			@Pc(309) long local309 = Static26.method382();
			@Pc(317) int local317 = (int) (local12 + 20L - local309);
			if (local317 > 0) {
				Static548.method7968((long) local317);
			}
		}
	}

	@OriginalMember(owner = "client!sha", name = "b", descriptor = "(B)V")
	public void method8069() {
		this.aBoolean643 = true;
	}

	@OriginalMember(owner = "client!sha", name = "c", descriptor = "(B)J")
	public long method8070() {
		return this.aLong256;
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(ILclient!kk;)V")
	public synchronized void method8071(@OriginalArg(1) Interface11 arg0) {
		this.anInterface11_2 = this.anInterface11_1;
		this.anInterface11_1 = arg0;
		this.aLong257 = Static26.method382();
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(Z)Lclient!ic;")
	public Class168 method8072() {
		return this.aClass168_23;
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(Lclient!ic;JBILjava/lang/String;)V")
	public synchronized void method8073(@OriginalArg(0) Class168 arg0, @OriginalArg(1) long arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		this.aClass168_23 = arg0;
		this.anInt9360 = arg2;
		this.aString105 = arg3;
		this.aLong256 = arg1;
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(B)Z")
	public synchronized boolean method8074() {
		return this.anInterface11_1.method5415(this.aLong257);
	}

	@OriginalMember(owner = "client!sha", name = "d", descriptor = "(I)I")
	public int method8075() {
		if (this.aClass168_23 == null) {
			return 0;
		}
		@Pc(14) int local14 = this.aClass168_23.method4057();
		if (this.aClass168_23.aBoolean352 && this.aClass168_23.anInt4638 > this.anInt9360) {
			return this.anInt9360 + 1;
		} else if (local14 >= 0 && Static7.aClass168Array1.length - 1 > local14) {
			return this.aClass168_23.anInt4640 == this.anInt9360 ? this.aClass168_23.anInt4638 : this.aClass168_23.anInt4640;
		} else {
			return 100;
		}
	}
}
