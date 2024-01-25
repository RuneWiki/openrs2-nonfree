import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gl")
public abstract class Class53 implements Interface1 {

	@OriginalMember(owner = "client!gl", name = "d", descriptor = "I")
	private int anInt11067;

	@OriginalMember(owner = "client!gl", name = "k", descriptor = "Lclient!da;")
	private Class68 aClass68_13;

	@OriginalMember(owner = "client!gl", name = "n", descriptor = "J")
	private long aLong277;

	@OriginalMember(owner = "client!gl", name = "e", descriptor = "Lclient!in;")
	private final Class157 aClass157_309;

	@OriginalMember(owner = "client!gl", name = "f", descriptor = "Lclient!in;")
	protected final Class157 aClass157_310;

	@OriginalMember(owner = "client!gl", name = "i", descriptor = "Lclient!fn;")
	protected final Class110 aClass110_5;

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Lclient!in;Lclient!in;Lclient!fn;)V")
	protected Class53(@OriginalArg(0) Class157 arg0, @OriginalArg(1) Class157 arg1, @OriginalArg(2) Class110 arg2) {
		this.aClass157_309 = arg1;
		this.aClass157_310 = arg0;
		this.aClass110_5 = arg2;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IZBI)V")
	protected abstract void method9234(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1);

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9232() {
		@Pc(13) boolean local13 = true;
		if (!this.aClass157_310.method4575(this.aClass110_5.anInt7738)) {
			local13 = false;
		}
		if (!this.aClass157_309.method4575(this.aClass110_5.anInt7738)) {
			local13 = false;
		}
		return local13;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V")
	@Override
	public void method9231() {
		@Pc(15) Class239 local15 = Static392.method6465(this.aClass110_5.anInt7738, this.aClass157_309);
		this.aClass68_13 = Static186.aClass20_4.method7289(local15, Static652.method7585(this.aClass157_310, this.aClass110_5.anInt7738));
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIZ)V")
	protected abstract void method9238(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!gl", name = "c", descriptor = "(I)I")
	protected final int method9239() {
		@Pc(15) int local15 = Static251.aClass8_1.method173();
		@Pc(19) int local19 = local15 * 100;
		if (local15 == this.anInt11067 && local15 != 0) {
			@Pc(45) int local45 = Static251.aClass8_1.method168();
			if (local15 < local45) {
				@Pc(55) long local55 = this.aLong277 - Static251.aClass8_1.method176();
				if (local55 > 0L) {
					@Pc(71) long local71 = (long) (local45 - local15) * (local55 * 10000L / (long) local15);
					@Pc(80) long local80 = (Static277.method5091() - this.aLong277) * 10000L;
					if (local71 > local80) {
						local19 = (int) ((long) (local15 * 100) + (long) (local45 - local15) * local80 * 100L / local71);
					} else {
						local19 = local45 * 100;
					}
				}
			}
		} else {
			this.anInt11067 = local15;
			this.aLong277 = Static277.method5091();
		}
		return local19;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(BZ)V")
	@Override
	public final void method9233() {
		@Pc(21) int local21 = this.aClass110_5.aClass309_11.method7817(Static326.anInt6591, this.aClass110_5.anInt7743) + this.aClass110_5.anInt7742;
		@Pc(37) int local37 = this.aClass110_5.aClass86_10.method2903(Static467.anInt8715, this.aClass110_5.anInt7736) + this.aClass110_5.anInt7733;
		this.method9234(local21, local37);
		this.method9238(local37, local21);
		@Pc(55) String local55 = Static251.aClass8_1.method171();
		if (Static277.method5091() - this.aLong277 > 10000L) {
			local55 = local55 + " (" + Static251.aClass8_1.method177().method4891() + ")";
		}
		this.aClass68_13.method8106(local21 + this.aClass110_5.anInt7743 / 2, this.aClass110_5.anInt7735, local55, -1, this.aClass110_5.anInt7739 + local37 + this.aClass110_5.anInt7736 / 2 + 4);
	}
}
