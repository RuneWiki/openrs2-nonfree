import java.awt.Container;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uv")
public final class Class349 implements Runnable {

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "Z")
	private boolean aBoolean696;

	@OriginalMember(owner = "client!uv", name = "q", descriptor = "Z")
	private volatile boolean aBoolean697;

	@OriginalMember(owner = "client!uv", name = "v", descriptor = "Ljava/lang/String;")
	private String aString89;

	@OriginalMember(owner = "client!uv", name = "w", descriptor = "J")
	private long aLong257;

	@OriginalMember(owner = "client!uv", name = "x", descriptor = "Lclient!wj;")
	private Class372 aClass372_2;

	@OriginalMember(owner = "client!uv", name = "y", descriptor = "I")
	private int anInt9604;

	@OriginalMember(owner = "client!uv", name = "z", descriptor = "I")
	private int anInt9605;

	@OriginalMember(owner = "client!uv", name = "B", descriptor = "J")
	private long aLong258;

	@OriginalMember(owner = "client!uv", name = "n", descriptor = "Lclient!lq;")
	private Interface14 anInterface14_1 = new Class50();

	@OriginalMember(owner = "client!uv", name = "t", descriptor = "Lclient!lq;")
	private Interface14 anInterface14_2 = null;

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(I)Ljava/lang/String;")
	public String method8063() {
		return this.aString89;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(Z)I")
	public int method8064() {
		return this.anInt9604;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(B)I")
	public int method8065() {
		if (this.aClass372_2 == null) {
			return 0;
		}
		@Pc(19) int local19 = this.aClass372_2.method8483();
		if (this.aClass372_2.aBoolean748 && this.aClass372_2.anInt10149 > this.anInt9604) {
			return this.anInt9604 + 1;
		} else if (local19 >= 0 && local19 < Static439.aClass372Array1.length - 1) {
			return this.aClass372_2.anInt10147 == this.anInt9604 ? this.aClass372_2.anInt10149 : this.aClass372_2.anInt10147;
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!uv", name = "b", descriptor = "(I)V")
	public synchronized void method8066() {
		this.aBoolean696 = true;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(Ljava/lang/String;JILclient!wj;I)V")
	public synchronized void method8067(@OriginalArg(0) String arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class372 arg3) {
		this.aLong258 = arg1;
		this.anInt9604 = arg2;
		this.aClass372_2 = arg3;
		this.aString89 = arg0;
	}

	@OriginalMember(owner = "client!uv", name = "b", descriptor = "(Z)J")
	public long method8068() {
		return this.aLong258;
	}

	@OriginalMember(owner = "client!uv", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean697) {
			@Pc(6) long local6 = Static438.method6517();
			synchronized (this) {
				try {
					this.anInt9605++;
					if (this.anInterface14_1 instanceof Class50) {
						this.anInterface14_1.method6247(this.aBoolean696);
					} else {
						@Pc(31) long local31 = Static438.method6517();
						if (Static600.aClass87_15 == null || this.anInterface14_2 == null || this.anInterface14_2.method6246() == 0 || this.aLong257 < local31 - (long) this.anInterface14_2.method6246()) {
							if (this.anInterface14_2 != null) {
								this.aBoolean696 = true;
								this.anInterface14_2.method6244();
								this.anInterface14_2 = null;
							}
							if (this.aBoolean696) {
								Static230.method7141();
								if (Static600.aClass87_15 != null) {
									Static600.aClass87_15.GA(0);
								}
							}
							this.anInterface14_1.method6247(this.aBoolean696 || Static600.aClass87_15 != null && Static600.aClass87_15.method7968());
						} else {
							@Pc(67) int local67 = (int) ((local31 - this.aLong257) * 255L / (long) this.anInterface14_2.method6246());
							@Pc(71) int local71 = 255 - local67;
							Static230.method7141();
							@Pc(79) int local79 = local67 << 24 | 0xFFFFFF;
							@Pc(85) int local85 = local71 << 24 | 0xFFFFFF;
							Static600.aClass87_15.GA(0);
							@Pc(94) Class20 local94 = Static600.aClass87_15.method7931(Static571.anInt9399, Static585.anInt9606, true);
							Static600.aClass87_15.method7908(local94);
							this.anInterface14_2.method6247(true);
							Static600.aClass87_15.method7895();
							local94.method4581(0, 0, 0, local85, 1);
							Static600.aClass87_15.method7908(local94);
							Static600.aClass87_15.GA(0);
							this.anInterface14_1.method6247(true);
							Static600.aClass87_15.method7895();
							local94.method4581(0, 0, 0, local79, 1);
						}
						try {
							if (Static600.aClass87_15 != null && !(this.anInterface14_1 instanceof Class50)) {
								Static600.aClass87_15.method7932();
							}
						} catch (@Pc(184) Exception_Sub1 local184) {
							Static420.method6396(local184.getMessage() + " (Recovered) " + Static181.aClient1.method1320(), local184);
							Static352.method5455(true, 0);
						}
					}
					@Pc(209) Container local209;
					if (Static503.aFrame3 != null) {
						local209 = Static503.aFrame3;
					} else if (Static234.anApplet2 == null) {
						local209 = Static493.anApplet_Sub1_1;
					} else {
						local209 = Static234.anApplet2;
					}
					local209.getSize();
					local209.getSize();
					if (local209 == Static503.aFrame3) {
						Static503.aFrame3.getInsets();
					}
					this.aBoolean696 = false;
					Static633.method8494();
				} catch (@Pc(238) Exception local238) {
					continue;
				}
			}
			@Pc(250) long local250 = Static438.method6517();
			@Pc(258) int local258 = (int) (local6 + 20L - local250);
			if (local258 > 0) {
				Static57.method1062((long) local258);
			}
		}
	}

	@OriginalMember(owner = "client!uv", name = "c", descriptor = "(I)V")
	public void method8070() {
		this.aBoolean697 = true;
	}

	@OriginalMember(owner = "client!uv", name = "d", descriptor = "(I)I")
	public int method8071() {
		return this.anInt9605;
	}

	@OriginalMember(owner = "client!uv", name = "b", descriptor = "(B)Z")
	public synchronized boolean method8072() {
		return this.anInterface14_1.method6249(this.aLong257);
	}

	@OriginalMember(owner = "client!uv", name = "f", descriptor = "(I)Lclient!wj;")
	public Class372 method8074() {
		return this.aClass372_2;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(Lclient!lq;I)V")
	public synchronized void method8076(@OriginalArg(0) Interface14 arg0) {
		this.anInterface14_2 = this.anInterface14_1;
		this.anInterface14_1 = arg0;
		this.aLong257 = Static438.method6517();
	}
}
