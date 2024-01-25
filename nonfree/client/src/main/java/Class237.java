import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mu")
public final class Class237 implements Interface2 {

	@OriginalMember(owner = "client!mu", name = "m", descriptor = "Lclient!rda;")
	private Class300 aClass300_30 = new Class300(128);

	@OriginalMember(owner = "client!mu", name = "g", descriptor = "[I")
	public final int[] anIntArray387 = new int[Static294.aClass389_1.anInt10681];

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "[I")
	private final int[] anIntArray386 = new int[Static294.aClass389_1.anInt10681];

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(III)V")
	public void method5680(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class258 local12 = Static545.aClass171_1.method4163(arg1);
		@Pc(15) int local15 = local12.anInt7267;
		@Pc(18) int local18 = local12.anInt7261;
		@Pc(21) int local21 = local12.anInt7264;
		@Pc(28) int local28 = Class5_Sub17_Sub3.anIntArray248[local21 - local18];
		if (arg0 < 0 || arg0 > local28) {
			arg0 = 0;
		}
		local28 <<= local18;
		this.method5682(local15, ~local28 & this.anIntArray386[local15] | arg0 << local18 & local28);
	}

	@OriginalMember(owner = "client!mu", name = "b", descriptor = "(III)V")
	public void method5681(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class258 local12 = Static545.aClass171_1.method4163(arg1);
		@Pc(15) int local15 = local12.anInt7267;
		@Pc(18) int local18 = local12.anInt7261;
		@Pc(21) int local21 = local12.anInt7264;
		@Pc(28) int local28 = Class5_Sub17_Sub3.anIntArray248[local21 - local18];
		if (arg0 < 0 || local28 < arg0) {
			arg0 = 0;
		}
		local28 <<= local18;
		this.method5683(arg0 << local18 & local28 | this.anIntArray387[local15] & ~local28, local15);
	}

	@OriginalMember(owner = "client!mu", name = "c", descriptor = "(III)V")
	public void method5682(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray386[arg0] = arg1;
		@Pc(16) Class5_Sub8 local16 = (Class5_Sub8) this.aClass300_30.method7188((long) arg0);
		if (local16 == null) {
			local16 = new Class5_Sub8(4611686018427387905L);
			this.aClass300_30.method7191(local16, (long) arg0);
		} else if (local16.aLong24 != 4611686018427387905L) {
			local16.aLong24 = Static547.method7619() + 500L | 0x4000000000000000L;
		}
	}

	@OriginalMember(owner = "client!mu", name = "d", descriptor = "(III)V")
	public void method5683(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray387[arg1] = arg0;
		@Pc(16) Class5_Sub8 local16 = (Class5_Sub8) this.aClass300_30.method7188((long) arg1);
		if (local16 == null) {
			local16 = new Class5_Sub8(Static547.method7619() + 500L);
			this.aClass300_30.method7191(local16, (long) arg1);
		} else {
			local16.aLong24 = Static547.method7619() + 500L;
		}
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(ZI)I")
	@Override
	public int method5678(@OriginalArg(1) int arg0) {
		@Pc(8) Class258 local8 = Static545.aClass171_1.method4163(arg0);
		@Pc(11) int local11 = local8.anInt7267;
		@Pc(14) int local14 = local8.anInt7261;
		@Pc(22) int local22 = local8.anInt7264;
		@Pc(29) int local29 = Class5_Sub17_Sub3.anIntArray248[local22 - local14];
		return this.anIntArray387[local11] >> local14 & local29;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(B)V")
	public void method5684() {
		for (@Pc(10) int local10 = 0; local10 < Static294.aClass389_1.anInt10681; local10++) {
			@Pc(16) Class24 local16 = Static294.aClass389_1.method8881(local10);
			if (local16 != null && local16.anInt341 == 0) {
				this.anIntArray386[local10] = 0;
				this.anIntArray387[local10] = 0;
			}
		}
		this.aClass300_30 = new Class300(128);
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(II)I")
	@Override
	public int method5679(@OriginalArg(0) int arg0) {
		return this.anIntArray387[arg0];
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(BZ)I")
	public int method5685(@OriginalArg(1) boolean arg0) {
		@Pc(16) long local16 = Static547.method7619();
		for (@Pc(30) Class5_Sub8 local30 = arg0 ? (Class5_Sub8) this.aClass300_30.method7182() : (Class5_Sub8) this.aClass300_30.method7192(); local30 != null; local30 = (Class5_Sub8) this.aClass300_30.method7192()) {
			if (local16 > (local30.aLong24 & 0x3FFFFFFFFFFFFFFFL)) {
				if ((local30.aLong24 & 0x4000000000000000L) != 0L) {
					@Pc(55) int local55 = (int) local30.aLong307;
					this.anIntArray387[local55] = this.anIntArray386[local55];
					local30.method9052();
					return local55;
				}
				local30.method9052();
			}
		}
		return -1;
	}
}
