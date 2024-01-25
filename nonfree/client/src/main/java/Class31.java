import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sca")
public abstract class Class31 implements Interface12 {

	@OriginalMember(owner = "client!sca", name = "d", descriptor = "I")
	private int anInt9958;

	@OriginalMember(owner = "client!sca", name = "i", descriptor = "Lclient!da;")
	private Class6 aClass6_16;

	@OriginalMember(owner = "client!sca", name = "m", descriptor = "J")
	private long aLong265;

	@OriginalMember(owner = "client!sca", name = "g", descriptor = "Lclient!nm;")
	protected final Class96 aClass96_5;

	@OriginalMember(owner = "client!sca", name = "l", descriptor = "Lclient!wu;")
	private final Class384 aClass384_134;

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "Lclient!wu;")
	protected final Class384 aClass384_133;

	@OriginalMember(owner = "client!sca", name = "<init>", descriptor = "(Lclient!wu;Lclient!wu;Lclient!nm;)V")
	protected Class31(@OriginalArg(0) Class384 arg0, @OriginalArg(1) Class384 arg1, @OriginalArg(2) Class96 arg2) {
		this.aClass96_5 = arg2;
		this.aClass384_134 = arg1;
		this.aClass384_133 = arg0;
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8776() {
		@Pc(11) boolean local11 = true;
		if (!this.aClass384_133.method8883(this.aClass96_5.anInt9361)) {
			local11 = false;
		}
		if (!this.aClass384_134.method8883(this.aClass96_5.anInt9361)) {
			local11 = false;
		}
		return local11;
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(IIIZ)V")
	protected abstract void method8460(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!sca", name = "b", descriptor = "(B)I")
	protected final int method8462() {
		@Pc(9) int local9 = Static182.aClass90_1.method1823();
		@Pc(13) int local13 = local9 * 100;
		if (this.anInt9958 == local9 && local9 != 0) {
			@Pc(23) int local23 = Static182.aClass90_1.method1829();
			if (local9 < local23) {
				@Pc(33) long local33 = this.aLong265 - Static182.aClass90_1.method1827();
				if (local33 > 0L) {
					@Pc(52) long local52 = (long) (local23 - local9) * (local33 * 10000L / (long) local9);
					@Pc(61) long local61 = (Static205.method3179() - this.aLong265) * 10000L;
					if (local61 >= local52) {
						local13 = local23 * 100;
					} else {
						local13 = (int) ((long) (local23 - local9) * 100L * local61 / local52 + (long) (local9 * 100));
					}
				}
			}
		} else {
			this.anInt9958 = local9;
			this.aLong265 = Static205.method3179();
		}
		return local13;
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(B)V")
	@Override
	public void method8777() {
		@Pc(20) Class298 local20 = Static7.method166(this.aClass384_134, this.aClass96_5.anInt9361);
		this.aClass6_16 = Static485.aClass126_17.method7000(local20, Static654.method4058(this.aClass384_133, this.aClass96_5.anInt9361));
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(IIZI)V")
	protected abstract void method8463(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1);

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(ZB)V")
	@Override
	public final void method8775() {
		@Pc(22) int local22 = this.aClass96_5.aClass204_13.method4964(this.aClass96_5.anInt9360, Static519.anInt7022) + this.aClass96_5.anInt9354;
		@Pc(36) int local36 = this.aClass96_5.aClass288_13.method6878(Static363.anInt6413, this.aClass96_5.anInt9362) + this.aClass96_5.anInt9359;
		this.method8463(local36, local22);
		this.method8460(local22, local36);
		@Pc(52) String local52 = Static182.aClass90_1.method1833();
		if (Static205.method3179() - this.aLong265 > 10000L) {
			local52 = local52 + " (" + Static182.aClass90_1.method1822().method6904() + ")";
		}
		this.aClass6_16.method7199(local22 + this.aClass96_5.anInt9360 / 2, local52, this.aClass96_5.anInt9362 / 2 + local36 + this.aClass96_5.anInt9357 + 4, this.aClass96_5.anInt9355, -1);
	}
}
