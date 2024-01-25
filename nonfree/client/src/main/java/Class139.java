import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public abstract class Class139 implements Interface13 {

	@OriginalMember(owner = "client!te", name = "e", descriptor = "I")
	private int anInt10309;

	@OriginalMember(owner = "client!te", name = "f", descriptor = "Lclient!da;")
	private Class68 aClass68_12;

	@OriginalMember(owner = "client!te", name = "g", descriptor = "J")
	private long aLong294;

	@OriginalMember(owner = "client!te", name = "n", descriptor = "Lclient!rg;")
	private final Class310 aClass310_122;

	@OriginalMember(owner = "client!te", name = "j", descriptor = "Lclient!rg;")
	protected final Class310 aClass310_123;

	@OriginalMember(owner = "client!te", name = "c", descriptor = "Lclient!gh;")
	protected final Class132 aClass132_5;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lclient!rg;Lclient!rg;Lclient!gh;)V")
	protected Class139(@OriginalArg(0) Class310 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class132 arg2) {
		this.aClass310_122 = arg1;
		this.aClass310_123 = arg0;
		this.aClass132_5 = arg2;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ZIIZ)V")
	protected abstract void method8823(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIZI)V")
	protected abstract void method8824(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IZ)V")
	@Override
	public final void method8819() {
		@Pc(17) int local17 = this.aClass132_5.aClass258_12.method6293(Static380.anInt6690, this.aClass132_5.anInt9737) + this.aClass132_5.anInt9744;
		@Pc(31) int local31 = this.aClass132_5.aClass205_16.method5049(Static380.anInt6697, this.aClass132_5.anInt9742) + this.aClass132_5.anInt9746;
		this.method8823(local31, local17);
		this.method8824(local17, local31);
		@Pc(49) String local49 = Static161.aClass329_3.method8064();
		if (Static26.method382() - this.aLong294 > 10000L) {
			local49 = local49 + " (" + Static161.aClass329_3.method8072().method4057() + ")";
		}
		this.aClass68_12.method9441(-1, this.aClass132_5.anInt9747, local49, local31 + this.aClass132_5.anInt9742 / 2 + this.aClass132_5.anInt9740 + 4, local17 + this.aClass132_5.anInt9737 / 2);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8820() {
		@Pc(13) boolean local13 = true;
		if (!this.aClass310_123.method7785(this.aClass132_5.anInt9739)) {
			local13 = false;
		}
		if (!this.aClass310_122.method7785(this.aClass132_5.anInt9739)) {
			local13 = false;
		}
		return local13;
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(B)I")
	protected final int method8826() {
		@Pc(9) int local9 = Static161.aClass329_3.method8067();
		@Pc(13) int local13 = local9 * 100;
		if (this.anInt10309 == local9 && local9 != 0) {
			@Pc(28) int local28 = Static161.aClass329_3.method8075();
			if (local28 > local9) {
				@Pc(42) long local42 = this.aLong294 - Static161.aClass329_3.method8070();
				if (local42 > 0L) {
					@Pc(59) long local59 = local42 * 10000L / (long) local9 * (long) (local28 - local9);
					@Pc(67) long local67 = (Static26.method382() - this.aLong294) * 10000L;
					if (local59 <= local67) {
						local13 = local28 * 100;
					} else {
						local13 = (int) ((long) (local9 * 100) + local67 * (long) (local28 - local9) * 100L / local59);
					}
				}
			}
		} else {
			this.anInt10309 = local9;
			this.aLong294 = Static26.method382();
		}
		return local13;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(B)V")
	@Override
	public void method8821() {
		@Pc(11) Class350 local11 = Static63.method1038(this.aClass132_5.anInt9739, this.aClass310_122);
		this.aClass68_12 = Static103.aClass144_3.method6958(local11, Static697.method6468(this.aClass310_123, this.aClass132_5.anInt9739), true);
	}
}
