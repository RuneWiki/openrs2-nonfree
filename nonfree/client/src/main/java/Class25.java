import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!at")
public abstract class Class25 implements Interface5 {

	@OriginalMember(owner = "client!at", name = "h", descriptor = "Lclient!da;")
	private Class80 aClass80_11;

	@OriginalMember(owner = "client!at", name = "d", descriptor = "J")
	private long aLong269;

	@OriginalMember(owner = "client!at", name = "n", descriptor = "I")
	private int anInt9244;

	@OriginalMember(owner = "client!at", name = "j", descriptor = "Lclient!la;")
	protected final Class208 aClass208_121;

	@OriginalMember(owner = "client!at", name = "e", descriptor = "Lclient!bc;")
	protected final Class31 aClass31_5;

	@OriginalMember(owner = "client!at", name = "k", descriptor = "Lclient!la;")
	private final Class208 aClass208_123;

	@OriginalMember(owner = "client!at", name = "<init>", descriptor = "(Lclient!la;Lclient!la;Lclient!bc;)V")
	protected Class25(@OriginalArg(0) Class208 arg0, @OriginalArg(1) Class208 arg1, @OriginalArg(2) Class31 arg2) {
		this.aClass208_121 = arg0;
		this.aClass31_5 = arg2;
		this.aClass208_123 = arg1;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8947() {
		@Pc(13) boolean local13 = true;
		if (!this.aClass208_121.method4977(this.aClass31_5.anInt9299)) {
			local13 = false;
		}
		if (!this.aClass208_123.method4977(this.aClass31_5.anInt9299)) {
			local13 = false;
		}
		return local13;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(ZB)V")
	@Override
	public final void method8946() {
		@Pc(17) int local17 = this.aClass31_5.aClass219_12.method5206(this.aClass31_5.anInt9301, Static264.anInt4559) + this.aClass31_5.anInt9298;
		@Pc(32) int local32 = this.aClass31_5.aClass368_11.method8776(this.aClass31_5.anInt9302, Static47.anInt794) + this.aClass31_5.anInt9300;
		this.method7937(local17, local32);
		this.method7938(local17, local32);
		@Pc(56) String local56 = Static410.aClass194_1.method4394();
		if (Static515.method7499(120) - this.aLong269 > 10000L) {
			local56 = local56 + " (" + Static410.aClass194_1.method4395().method2859() + ")";
		}
		this.aClass80_11.method8792(local17 + this.aClass31_5.anInt9301 / 2, this.aClass31_5.anInt9305 + local32 + this.aClass31_5.anInt9302 / 2 + 4, this.aClass31_5.anInt9306, -1, local56);
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(B)V")
	@Override
	public void method8948() {
		@Pc(16) Class224 local16 = Static439.method6500(this.aClass31_5.anInt9299, this.aClass208_123);
		this.aClass80_11 = Static457.aClass57_11.method7708(local16, Static684.method3657(this.aClass208_121, this.aClass31_5.anInt9299));
	}

	@OriginalMember(owner = "client!at", name = "b", descriptor = "(I)I")
	protected final int method7936() {
		@Pc(15) int local15 = Static410.aClass194_1.method4392();
		@Pc(19) int local19 = local15 * 100;
		if (this.anInt9244 == local15 && local15 != 0) {
			@Pc(46) int local46 = Static410.aClass194_1.method4388();
			if (local46 > local15) {
				@Pc(56) long local56 = this.aLong269 - Static410.aClass194_1.method4383();
				if (local56 > 0L) {
					@Pc(73) long local73 = (long) (local46 - local15) * (local56 * 10000L / (long) local15);
					@Pc(82) long local82 = (Static515.method7499(100) - this.aLong269) * 10000L;
					if (local73 > local82) {
						local19 = (int) ((long) (local46 - local15) * local82 * 100L / local73 + (long) (local15 * 100));
					} else {
						local19 = local46 * 100;
					}
				}
			}
		} else {
			this.anInt9244 = local15;
			this.aLong269 = Static515.method7499(69);
		}
		return local19;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(ZIBI)V")
	protected abstract void method7937(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1);

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(ZIZI)V")
	protected abstract void method7938(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1);
}
