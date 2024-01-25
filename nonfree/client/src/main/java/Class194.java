import java.awt.Container;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class194 implements Runnable {

	@OriginalMember(owner = "client!kb", name = "E", descriptor = "Z")
	private boolean aBoolean391;

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "Z")
	private volatile boolean aBoolean392;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "J")
	private long aLong161;

	@OriginalMember(owner = "client!kb", name = "m", descriptor = "Ljava/lang/String;")
	private String aString69;

	@OriginalMember(owner = "client!kb", name = "r", descriptor = "I")
	private int anInt5154;

	@OriginalMember(owner = "client!kb", name = "o", descriptor = "I")
	private int anInt5155;

	@OriginalMember(owner = "client!kb", name = "p", descriptor = "Lclient!gl;")
	private Class146 aClass146_23;

	@OriginalMember(owner = "client!kb", name = "x", descriptor = "J")
	private long aLong162;

	@OriginalMember(owner = "client!kb", name = "B", descriptor = "Lclient!mba;")
	private Interface14 anInterface14_1 = new Class222();

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "Lclient!mba;")
	private Interface14 anInterface14_2 = null;

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)J")
	public long method4383() {
		return this.aLong162;
	}

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "(I)I")
	public int method4384() {
		return this.anInt5155;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!mba;I)V")
	public synchronized void method4385(@OriginalArg(0) Interface14 arg0) {
		this.anInterface14_2 = this.anInterface14_1;
		this.anInterface14_1 = arg0;
		this.aLong161 = Static515.method7499(69);
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(B)V")
	public void method4386() {
		this.aBoolean392 = true;
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)V")
	public synchronized void method4387() {
		this.aBoolean391 = true;
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(Z)I")
	public int method4388() {
		if (this.aClass146_23 == null) {
			return 0;
		}
		@Pc(23) int local23 = this.aClass146_23.method2859();
		if (this.aClass146_23.aBoolean262 && this.aClass146_23.anInt3222 > this.anInt5154) {
			return this.anInt5154 + 1;
		} else if (local23 >= 0 && local23 < Static297.aClass146Array1.length - 1) {
			return this.anInt5154 == this.aClass146_23.anInt3227 ? this.aClass146_23.anInt3222 : this.aClass146_23.anInt3227;
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "(I)Z")
	public synchronized boolean method4391() {
		return this.anInterface14_1.method7953(this.aLong161);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)I")
	public int method4392() {
		return this.anInt5154;
	}

	@OriginalMember(owner = "client!kb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean392) {
			@Pc(8) long local8 = Static515.method7499(106);
			synchronized (this) {
				try {
					this.anInt5155++;
					if (this.anInterface14_1 instanceof Class222) {
						this.anInterface14_1.method7952(this.aBoolean391);
					} else {
						@Pc(33) long local33 = Static515.method7499(78);
						if (Static457.aClass57_11 == null || this.anInterface14_2 == null || this.anInterface14_2.method7951() == 0 || this.aLong161 < local33 - (long) this.anInterface14_2.method7951()) {
							if (this.anInterface14_2 != null) {
								this.aBoolean391 = true;
								this.anInterface14_2.method7950();
								this.anInterface14_2 = null;
							}
							if (this.aBoolean391) {
								Static403.method5923();
								if (Static457.aClass57_11 != null) {
									Static457.aClass57_11.GA(0);
								}
							}
							this.anInterface14_1.method7952(this.aBoolean391 || Static457.aClass57_11 != null && Static457.aClass57_11.method7665());
						} else {
							@Pc(136) int local136 = (int) ((local33 - this.aLong161) * 255L / (long) this.anInterface14_2.method7951());
							@Pc(141) int local141 = 255 - local136;
							@Pc(147) int local147 = local136 << 24 | 0xFFFFFF;
							@Pc(153) int local153 = local141 << 24 | 0xFFFFFF;
							Static403.method5923();
							Static457.aClass57_11.GA(0);
							@Pc(164) Class134 local164 = Static457.aClass57_11.method7688(Static70.anInt1125, Static631.anInt10283, true);
							Static457.aClass57_11.method7725(local164);
							this.anInterface14_2.method7952(true);
							Static457.aClass57_11.method7663();
							local164.method9230(0, 0, 0, local153, 1);
							Static457.aClass57_11.method7725(local164);
							Static457.aClass57_11.GA(0);
							this.anInterface14_1.method7952(true);
							Static457.aClass57_11.method7663();
							local164.method9230(0, 0, 0, local147, 1);
						}
						try {
							if (Static457.aClass57_11 != null && !(this.anInterface14_1 instanceof Class222)) {
								Static457.aClass57_11.method7693();
							}
						} catch (@Pc(216) Exception_Sub1 local216) {
							Static405.method5934(local216.getMessage() + " (Recovered) " + Static454.aClient1.method1228(), local216);
							Static565.method8890(0, true);
						}
					}
					@Pc(243) Container local243;
					if (Static675.aFrame3 != null) {
						local243 = Static675.aFrame3;
					} else if (Static492.anApplet2 == null) {
						local243 = Static361.anApplet_Sub1_1;
					} else {
						local243 = Static492.anApplet2;
					}
					local243.getSize();
					local243.getSize();
					if (Static675.aFrame3 == local243) {
						Static675.aFrame3.getInsets();
					}
					this.aBoolean391 = false;
					if (Static457.aClass57_11 != null && !(this.anInterface14_1 instanceof Class222) && this.aClass146_23.method2859() < Static198.aClass146_19.method2859()) {
						Static360.method5369();
					}
				} catch (@Pc(294) Exception local294) {
					continue;
				}
			}
			@Pc(306) long local306 = Static515.method7499(92);
			@Pc(315) int local315 = (int) (local8 + 20L - local306);
			if (local315 > 0) {
				Static351.method5279((long) local315);
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Z)Ljava/lang/String;")
	public String method4394() {
		return this.aString69;
	}

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "(I)Lclient!gl;")
	public Class146 method4395() {
		return this.aClass146_23;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(JZLclient!gl;ILjava/lang/String;)V")
	public synchronized void method4396(@OriginalArg(0) long arg0, @OriginalArg(2) Class146 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		this.aLong162 = arg0;
		this.aString69 = arg3;
		this.anInt5154 = arg2;
		this.aClass146_23 = arg1;
	}
}
