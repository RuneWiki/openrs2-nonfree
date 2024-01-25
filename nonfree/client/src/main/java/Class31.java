import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public abstract class Class31 implements Interface25 {

	@OriginalMember(owner = "client!be", name = "k", descriptor = "Lclient!da;")
	private Class55 aClass55_15;

	@OriginalMember(owner = "client!be", name = "m", descriptor = "I")
	private int anInt9151;

	@OriginalMember(owner = "client!be", name = "n", descriptor = "J")
	private long aLong231;

	@OriginalMember(owner = "client!be", name = "e", descriptor = "Lclient!la;")
	protected final Class207 aClass207_110;

	@OriginalMember(owner = "client!be", name = "h", descriptor = "Lclient!hc;")
	protected final Class119 aClass119_5;

	@OriginalMember(owner = "client!be", name = "f", descriptor = "Lclient!la;")
	private final Class207 aClass207_111;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lclient!la;Lclient!la;Lclient!hc;)V")
	protected Class31(@OriginalArg(0) Class207 arg0, @OriginalArg(1) Class207 arg1, @OriginalArg(2) Class119 arg2) {
		this.aClass207_110 = arg0;
		this.aClass119_5 = arg2;
		this.aClass207_111 = arg1;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8109() {
		@Pc(5) boolean local5 = true;
		if (!this.aClass207_110.method4678(this.aClass119_5.anInt10370)) {
			local5 = false;
		}
		if (!this.aClass207_111.method4678(this.aClass119_5.anInt10370)) {
			local5 = false;
		}
		return local5;
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(I)I")
	protected final int method7897() {
		@Pc(9) int local9 = Static299.aClass347_1.method8229();
		@Pc(19) int local19 = local9 * 100;
		if (this.anInt9151 == local9 && local9 != 0) {
			@Pc(38) int local38 = Static299.aClass347_1.method8231();
			if (local9 < local38) {
				@Pc(53) long local53 = this.aLong231 - Static299.aClass347_1.method8239();
				if (local53 > 0L) {
					@Pc(72) long local72 = local53 * 10000L / (long) local9 * (long) (local38 - local9);
					@Pc(80) long local80 = (Static95.method1587() - this.aLong231) * 10000L;
					if (local80 >= local72) {
						local19 = local38 * 100;
					} else {
						local19 = (int) ((long) (local9 * 100) + (long) (local38 - local9) * 100L * local80 / local72);
					}
				}
			}
		} else {
			this.anInt9151 = local9;
			this.aLong231 = Static95.method1587();
		}
		return local19;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V")
	@Override
	public void method8111() {
		@Pc(17) Class272 local17 = Static531.method7862(this.aClass207_111, this.aClass119_5.anInt10370);
		this.aClass55_15 = Static213.aClass133_5.method7255(local17, Static649.method2902(this.aClass207_110, this.aClass119_5.anInt10370));
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ZIZI)V")
	protected abstract void method7899(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1);

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IBIZ)V")
	protected abstract void method7900(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ZZ)V")
	@Override
	public final void method8110() {
		@Pc(17) int local17 = this.aClass119_5.aClass245_14.method5486(Static79.anInt1667, this.aClass119_5.anInt10371) + this.aClass119_5.anInt10375;
		@Pc(31) int local31 = this.aClass119_5.aClass183_12.method4291(this.aClass119_5.anInt10373, Static627.anInt10422) + this.aClass119_5.anInt10374;
		this.method7899(local17, local31);
		this.method7900(local17, local31);
		@Pc(47) String local47 = Static299.aClass347_1.method8226();
		if (Static95.method1587() - this.aLong231 > 10000L) {
			local47 = local47 + " (" + Static299.aClass347_1.method8233().method6654() + ")";
		}
		this.aClass55_15.method6013(-1, local47, local31 + this.aClass119_5.anInt10373 / 2 + this.aClass119_5.anInt10367 + 4, this.aClass119_5.anInt10369, local17 + this.aClass119_5.anInt10371 / 2);
	}
}
