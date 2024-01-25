import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fq")
public abstract class Class106 implements Interface16 {

	@OriginalMember(owner = "client!fq", name = "g", descriptor = "I")
	private int anInt8701;

	@OriginalMember(owner = "client!fq", name = "i", descriptor = "J")
	private long aLong226;

	@OriginalMember(owner = "client!fq", name = "m", descriptor = "Lclient!da;")
	private Class27 aClass27_17;

	@OriginalMember(owner = "client!fq", name = "e", descriptor = "Lclient!oh;")
	private final Class237 aClass237_119;

	@OriginalMember(owner = "client!fq", name = "h", descriptor = "Lclient!oh;")
	protected final Class237 aClass237_120;

	@OriginalMember(owner = "client!fq", name = "d", descriptor = "Lclient!laa;")
	protected final Class6 aClass6_5;

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Lclient!oh;Lclient!oh;Lclient!laa;)V")
	protected Class106(@OriginalArg(0) Class237 arg0, @OriginalArg(1) Class237 arg1, @OriginalArg(2) Class6 arg2) {
		this.aClass237_119 = arg1;
		this.aClass237_120 = arg0;
		this.aClass6_5 = arg2;
	}

	@OriginalMember(owner = "client!fq", name = "b", descriptor = "(I)I")
	protected final int method7191() {
		@Pc(9) int local9 = Static609.aClass42_3.method1399();
		@Pc(13) int local13 = local9 * 100;
		if (this.anInt8701 == local9 && local9 != 0) {
			@Pc(39) int local39 = Static609.aClass42_3.method1395();
			if (local9 < local39) {
				@Pc(53) long local53 = this.aLong226 - Static609.aClass42_3.method1403();
				if (local53 > 0L) {
					@Pc(71) long local71 = (long) (local39 - local9) * (local53 * 10000L / (long) local9);
					@Pc(80) long local80 = (Static342.method5463() - this.aLong226) * 10000L;
					if (local80 >= local71) {
						local13 = local39 * 100;
					} else {
						local13 = (int) (local80 * 100L * (long) (local39 - local9) / local71 + (long) (local9 * 100));
					}
				}
			}
		} else {
			this.anInt8701 = local9;
			this.aLong226 = Static342.method5463();
		}
		return local13;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(ZIII)V")
	protected abstract void method7194(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(ZIIZ)V")
	protected abstract void method7195(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(ZI)V")
	@Override
	public final void method8622() {
		@Pc(17) int local17 = this.aClass6_5.aClass173_14.method4706(Static328.anInt9768, this.aClass6_5.anInt10335) + this.aClass6_5.anInt10332;
		@Pc(31) int local31 = this.aClass6_5.aClass60_13.method2078(Static594.anInt10159, this.aClass6_5.anInt10336) + this.aClass6_5.anInt10334;
		this.method7194(local31, local17);
		this.method7195(local17, local31);
		@Pc(47) String local47 = Static609.aClass42_3.method1406();
		if (Static342.method5463() - this.aLong226 > 10000L) {
			local47 = local47 + " (" + Static609.aClass42_3.method1408().method7183() + ")";
		}
		this.aClass27_17.method7002(-1, this.aClass6_5.anInt10337, local47, this.aClass6_5.anInt10335 / 2 + local17, this.aClass6_5.anInt10336 / 2 + local31 + 4 + this.aClass6_5.anInt10339);
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)V")
	@Override
	public void method8624() {
		@Pc(18) Class345 local18 = Static549.method7716(this.aClass237_119, this.aClass6_5.anInt10342);
		this.aClass27_17 = Static171.aClass16_5.method6088(local18, Static647.method3298(this.aClass237_120, this.aClass6_5.anInt10342));
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8623() {
		@Pc(5) boolean local5 = true;
		if (!this.aClass237_120.method6296(this.aClass6_5.anInt10342)) {
			local5 = false;
		}
		if (!this.aClass237_119.method6296(this.aClass6_5.anInt10342)) {
			local5 = false;
		}
		return local5;
	}
}
