import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lga")
public abstract class Class78 implements Interface27 {

	@OriginalMember(owner = "client!lga", name = "f", descriptor = "I")
	private int anInt5685;

	@OriginalMember(owner = "client!lga", name = "g", descriptor = "Lclient!da;")
	private Class69 aClass69_8;

	@OriginalMember(owner = "client!lga", name = "k", descriptor = "J")
	private long aLong183;

	@OriginalMember(owner = "client!lga", name = "b", descriptor = "Lclient!paa;")
	protected final Class106 aClass106_5;

	@OriginalMember(owner = "client!lga", name = "o", descriptor = "Lclient!aj;")
	private final Class15 aClass15_94;

	@OriginalMember(owner = "client!lga", name = "c", descriptor = "Lclient!aj;")
	protected final Class15 aClass15_93;

	@OriginalMember(owner = "client!lga", name = "<init>", descriptor = "(Lclient!aj;Lclient!aj;Lclient!paa;)V")
	protected Class78(@OriginalArg(0) Class15 arg0, @OriginalArg(1) Class15 arg1, @OriginalArg(2) Class106 arg2) {
		this.aClass106_5 = arg2;
		this.aClass15_94 = arg1;
		this.aClass15_93 = arg0;
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(IZII)V")
	protected abstract void method5191(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1);

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(I)V")
	@Override
	public void method7758() {
		@Pc(15) Class88 local15 = Static629.method8788(this.aClass15_94, this.aClass106_5.anInt5841);
		this.aClass69_8 = Static674.aClass13_22.method8515(local15, Static682.method2747(this.aClass15_93, this.aClass106_5.anInt5841));
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(IZ)V")
	@Override
	public final void method7760() {
		@Pc(18) int local18 = this.aClass106_5.aClass356_8.method8711(this.aClass106_5.anInt5840, Static33.anInt10742) + this.aClass106_5.anInt5838;
		@Pc(33) int local33 = this.aClass106_5.aClass56_11.method1354(Static602.anInt9666, this.aClass106_5.anInt5834) + this.aClass106_5.anInt5836;
		this.method5195(local18, local33);
		this.method5191(local33, local18);
		@Pc(55) String local55 = Static578.aClass193_1.method4862();
		if (Static524.method7320() - this.aLong183 > 10000L) {
			local55 = local55 + " (" + Static578.aClass193_1.method4865().method1209() + ")";
		}
		this.aClass69_8.method8858(local18 + this.aClass106_5.anInt5840 / 2, -1, this.aClass106_5.anInt5839, local55, this.aClass106_5.anInt5834 / 2 + local33 + this.aClass106_5.anInt5837 + 4);
	}

	@OriginalMember(owner = "client!lga", name = "d", descriptor = "(I)I")
	protected final int method5193() {
		@Pc(9) int local9 = Static578.aClass193_1.method4856();
		@Pc(13) int local13 = local9 * 100;
		if (local9 == this.anInt5685 && local9 != 0) {
			@Pc(36) int local36 = Static578.aClass193_1.method4857();
			if (local36 > local9) {
				@Pc(50) long local50 = this.aLong183 - Static578.aClass193_1.method4868();
				if (local50 > 0L) {
					@Pc(69) long local69 = (long) (local36 - local9) * (local50 * 10000L / (long) local9);
					@Pc(80) long local80 = (Static524.method7320() - this.aLong183) * 10000L;
					if (local80 >= local69) {
						local13 = local36 * 100;
					} else {
						local13 = (int) ((long) (local36 - local9) * local80 * 100L / local69 + (long) (local9 * 100));
					}
				}
			}
		} else {
			this.anInt5685 = local9;
			this.aLong183 = Static524.method7320();
		}
		return local13;
	}

	@OriginalMember(owner = "client!lga", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7759() {
		@Pc(12) boolean local12 = true;
		if (!this.aClass15_93.method526(this.aClass106_5.anInt5841)) {
			local12 = false;
		}
		if (!this.aClass15_94.method526(this.aClass106_5.anInt5841)) {
			local12 = false;
		}
		return local12;
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(ZBII)V")
	protected abstract void method5195(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1);
}
