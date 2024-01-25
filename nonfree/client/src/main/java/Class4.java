import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aba")
public abstract class Class4 implements Interface21 {

	@OriginalMember(owner = "client!aba", name = "j", descriptor = "I")
	private int anInt8169;

	@OriginalMember(owner = "client!aba", name = "o", descriptor = "Lclient!da;")
	private Class50 aClass50_9;

	@OriginalMember(owner = "client!aba", name = "q", descriptor = "J")
	private long aLong209;

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "Lclient!vd;")
	protected final Class353 aClass353_86;

	@OriginalMember(owner = "client!aba", name = "g", descriptor = "Lclient!au;")
	protected final Class22 aClass22_5;

	@OriginalMember(owner = "client!aba", name = "i", descriptor = "Lclient!vd;")
	private final Class353 aClass353_87;

	@OriginalMember(owner = "client!aba", name = "<init>", descriptor = "(Lclient!vd;Lclient!vd;Lclient!au;)V")
	protected Class4(@OriginalArg(0) Class353 arg0, @OriginalArg(1) Class353 arg1, @OriginalArg(2) Class22 arg2) {
		this.aClass353_86 = arg0;
		this.aClass22_5 = arg2;
		this.aClass353_87 = arg1;
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(IIIZ)V")
	protected abstract void method7042(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(IZ)V")
	@Override
	public final void method7903() {
		@Pc(18) int local18 = this.aClass22_5.aClass238_9.method6456(Static507.anInt8741, this.aClass22_5.anInt5441) + this.aClass22_5.anInt5439;
		@Pc(36) int local36 = this.aClass22_5.aClass79_14.method2054(this.aClass22_5.anInt5435, Static106.anInt2101) + this.aClass22_5.anInt5436;
		this.method7045(local18, local36);
		this.method7042(local18, local36);
		@Pc(54) String local54 = Static645.aClass121_1.method3468();
		if (Static32.method595() - this.aLong209 > 10000L) {
			local54 = local54 + " (" + Static645.aClass121_1.method3458().method6202() + ")";
		}
		this.aClass50_9.method5734(this.aClass22_5.anInt5441 / 2 + local18, local54, -1, local36 + this.aClass22_5.anInt5435 / 2 + this.aClass22_5.anInt5432 + 4, this.aClass22_5.anInt5431);
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(B)I")
	protected final int method7043() {
		@Pc(14) int local14 = Static645.aClass121_1.method3456();
		@Pc(18) int local18 = local14 * 100;
		if (this.anInt8169 == local14 && local14 != 0) {
			@Pc(40) int local40 = Static645.aClass121_1.method3469();
			if (local14 < local40) {
				@Pc(51) long local51 = this.aLong209 - Static645.aClass121_1.method3461();
				if (local51 > 0L) {
					@Pc(69) long local69 = local51 * 10000L / (long) local14 * (long) (local40 - local14);
					@Pc(78) long local78 = (Static32.method595() - this.aLong209) * 10000L;
					if (local69 > local78) {
						local18 = (int) ((long) (local14 * 100) + local78 * 100L * (long) (local40 - local14) / local69);
					} else {
						local18 = local40 * 100;
					}
				}
			}
		} else {
			this.anInt8169 = local14;
			this.aLong209 = Static32.method595();
		}
		return local18;
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7901() {
		@Pc(5) boolean local5 = true;
		if (!this.aClass353_86.method8401(this.aClass22_5.anInt5438)) {
			local5 = false;
		}
		if (!this.aClass353_87.method8401(this.aClass22_5.anInt5438)) {
			local5 = false;
		}
		return local5;
	}

	@OriginalMember(owner = "client!aba", name = "b", descriptor = "(I)V")
	@Override
	public void method7902() {
		@Pc(11) Class133 local11 = Static308.method5208(this.aClass22_5.anInt5438, this.aClass353_87);
		this.aClass50_9 = Static162.aClass100_7.method8808(local11, Static651.method2403(this.aClass353_86, this.aClass22_5.anInt5438));
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(IZBI)V")
	protected abstract void method7045(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1);
}
