import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wl")
public abstract class Class30 implements Interface21 {

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "I")
	private int anInt9227;

	@OriginalMember(owner = "client!wl", name = "g", descriptor = "Lclient!da;")
	private Class34 aClass34_11;

	@OriginalMember(owner = "client!wl", name = "h", descriptor = "J")
	private long aLong246;

	@OriginalMember(owner = "client!wl", name = "d", descriptor = "Lclient!ni;")
	protected final Class223 aClass223_124;

	@OriginalMember(owner = "client!wl", name = "j", descriptor = "Lclient!ni;")
	private final Class223 aClass223_125;

	@OriginalMember(owner = "client!wl", name = "m", descriptor = "Lclient!fq;")
	protected final Class109 aClass109_5;

	@OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Lclient!ni;Lclient!ni;Lclient!fq;)V")
	protected Class30(@OriginalArg(0) Class223 arg0, @OriginalArg(1) Class223 arg1, @OriginalArg(2) Class109 arg2) {
		this.aClass223_124 = arg0;
		this.aClass223_125 = arg1;
		this.aClass109_5 = arg2;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7993() {
		@Pc(10) boolean local10 = true;
		if (!this.aClass223_124.method5951(this.aClass109_5.anInt9907)) {
			local10 = false;
		}
		if (!this.aClass223_125.method5951(this.aClass109_5.anInt9907)) {
			local10 = false;
		}
		return local10;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIBZ)V")
	protected abstract void method7537(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(ZB)V")
	@Override
	public final void method7994() {
		@Pc(18) int local18 = this.aClass109_5.aClass79_21.method2610(Static182.anInt4018, this.aClass109_5.anInt9913) + this.aClass109_5.anInt9905;
		@Pc(33) int local33 = this.aClass109_5.aClass127_18.method3682(this.aClass109_5.anInt9904, Static52.anInt1780) + this.aClass109_5.anInt9908;
		this.method7537(local33, local18);
		this.method7542(local33, local18);
		@Pc(58) String local58 = Static272.aClass61_1.method2360();
		if (Static582.method8056() - this.aLong246 > 10000L) {
			local58 = local58 + " (" + Static272.aClass61_1.method2359().method2772() + ")";
		}
		this.aClass34_11.method8602(this.aClass109_5.anInt9912, local58, local18 + this.aClass109_5.anInt9913 / 2, -1, local33 + 4 - -(this.aClass109_5.anInt9904 / 2) + this.aClass109_5.anInt9909);
	}

	@OriginalMember(owner = "client!wl", name = "c", descriptor = "(I)I")
	protected final int method7540() {
		@Pc(9) int local9 = Static272.aClass61_1.method2357();
		@Pc(13) int local13 = local9 * 100;
		if (local9 == this.anInt9227 && local9 != 0) {
			@Pc(41) int local41 = Static272.aClass61_1.method2364();
			if (local41 > local9) {
				@Pc(56) long local56 = this.aLong246 - Static272.aClass61_1.method2362();
				if (local56 > 0L) {
					@Pc(72) long local72 = (long) (local41 - local9) * (local56 * 10000L / (long) local9);
					@Pc(83) long local83 = (Static582.method8056() - this.aLong246) * 10000L;
					if (local83 < local72) {
						local13 = (int) ((long) (local41 - local9) * 100L * local83 / local72 + (long) (local9 * 100));
					} else {
						local13 = local41 * 100;
					}
				}
			}
		} else {
			this.anInt9227 = local9;
			this.aLong246 = Static582.method8056();
		}
		return local13;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)V")
	@Override
	public void method7992() {
		@Pc(20) Class213 local20 = Static50.method1622(this.aClass223_125, this.aClass109_5.anInt9907);
		this.aClass34_11 = Static467.aClass5_13.method6167(local20, Static655.method7891(this.aClass223_124, this.aClass109_5.anInt9907));
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIZ)V")
	protected abstract void method7542(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
