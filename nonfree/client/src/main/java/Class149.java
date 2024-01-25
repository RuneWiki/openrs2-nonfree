import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ln")
public final class Class149 implements Interface4 {

	@OriginalMember(owner = "client!ln", name = "j", descriptor = "Lclient!qo;")
	private Class196 aClass196_20 = new Class196(128);

	@OriginalMember(owner = "client!ln", name = "k", descriptor = "[I")
	private final int[] anIntArray345 = new int[Static186.aClass54_1.anInt1890];

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "[I")
	public final int[] anIntArray344 = new int[Static186.aClass54_1.anInt1890];

	static {
		new Class242(null, "der Spieler ist momentan nicht verfügbar.", null, null);
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)V")
	public void method3214() {
		for (@Pc(7) int local7 = 0; local7 < Static186.aClass54_1.anInt1890; local7++) {
			@Pc(14) Class48 local14 = Static186.aClass54_1.method1422(local7);
			if (local14 != null && local14.anInt1787 == 0) {
				this.anIntArray345[local7] = 0;
				this.anIntArray344[local7] = 0;
			}
		}
		this.aClass196_20 = new Class196(128);
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIB)V")
	public void method3215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray345[arg0] = arg1;
		@Pc(22) Class4_Sub14 local22 = (Class4_Sub14) this.aClass196_20.method4477((long) arg0);
		if (local22 == null) {
			local22 = new Class4_Sub14(4611686018427387905L);
			this.aClass196_20.method4474((long) arg0, local22);
		} else if (local22.aLong64 != 4611686018427387905L) {
			local22.aLong64 = Static199.method2845() + 500L | 0x4000000000000000L;
			return;
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(II)I")
	@Override
	public int method3212(@OriginalArg(1) int arg0) {
		@Pc(8) Class100 local8 = Static73.aClass252_1.method5480(arg0);
		@Pc(16) int local16 = local8.anInt2681;
		@Pc(19) int local19 = local8.anInt2683;
		@Pc(22) int local22 = local8.anInt2686;
		@Pc(29) int local29 = Class146.anIntArray424[local22 - local19];
		return local29 & this.anIntArray344[local16] >> local19;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIZ)V")
	public void method3217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class100 local8 = Static73.aClass252_1.method5480(arg0);
		@Pc(11) int local11 = local8.anInt2681;
		@Pc(22) int local22 = local8.anInt2683;
		@Pc(25) int local25 = local8.anInt2686;
		@Pc(31) int local31 = Class146.anIntArray424[local25 - local22];
		if (arg1 < 0 || local31 < arg1) {
			arg1 = 0;
		}
		local31 <<= local22;
		this.method3215(local11, local31 & arg1 << local22 | this.anIntArray345[local11] & ~local31);
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(ZII)V")
	public void method3218(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class100 local16 = Static73.aClass252_1.method5480(arg0);
		@Pc(19) int local19 = local16.anInt2681;
		@Pc(22) int local22 = local16.anInt2683;
		@Pc(25) int local25 = local16.anInt2686;
		@Pc(32) int local32 = Class146.anIntArray424[local25 - local22];
		if (arg1 < 0 || arg1 > local32) {
			arg1 = 0;
		}
		local32 <<= local22;
		this.method3219(this.anIntArray344[local19] & ~local32 | arg1 << local22 & local32, local19);
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(III)V")
	public void method3219(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray344[arg1] = arg0;
		@Pc(20) Class4_Sub14 local20 = (Class4_Sub14) this.aClass196_20.method4477((long) arg1);
		if (local20 == null) {
			local20 = new Class4_Sub14(Static199.method2845() + 500L);
			this.aClass196_20.method4474((long) arg1, local20);
		} else {
			local20.aLong64 = Static199.method2845() + 500L;
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IZ)I")
	@Override
	public int method3211(@OriginalArg(0) int arg0) {
		return this.anIntArray344[arg0];
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(BZ)I")
	public int method3221(@OriginalArg(1) boolean arg0) {
		@Pc(8) long local8 = Static199.method2845();
		for (@Pc(28) Class4_Sub14 local28 = arg0 ? (Class4_Sub14) this.aClass196_20.method4482() : (Class4_Sub14) this.aClass196_20.method4472(); local28 != null; local28 = (Class4_Sub14) this.aClass196_20.method4472()) {
			if ((local28.aLong64 & 0x3FFFFFFFFFFFFFFFL) < local8) {
				if ((local28.aLong64 & 0x4000000000000000L) != 0L) {
					@Pc(59) int local59 = (int) local28.aLong225;
					this.anIntArray344[local59] = this.anIntArray345[local59];
					local28.method5854();
					return local59;
				}
				local28.method5854();
			}
		}
		return -1;
	}
}
