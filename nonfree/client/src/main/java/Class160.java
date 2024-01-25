import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ii")
public final class Class160 implements Interface23 {

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "Lclient!efa;")
	private Class90 aClass90_10 = new Class90(128);

	@OriginalMember(owner = "client!ii", name = "i", descriptor = "[I")
	private final int[] anIntArray275 = new int[Static572.aClass55_1.anInt1148];

	@OriginalMember(owner = "client!ii", name = "o", descriptor = "[I")
	public final int[] anIntArray276 = new int[Static572.aClass55_1.anInt1148];

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(IB)I")
	@Override
	public int method2781(@OriginalArg(0) int arg0) {
		@Pc(13) Class184 local13 = Static31.aClass145_1.method2547(arg0);
		@Pc(16) int local16 = local13.anInt4304;
		@Pc(19) int local19 = local13.anInt4302;
		@Pc(22) int local22 = local13.anInt4301;
		@Pc(28) int local28 = Class204.anIntArray347[local22 - local19];
		return this.anIntArray276[local16] >> local19 & local28;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(ZI)I")
	public int method2783(@OriginalArg(0) boolean arg0) {
		@Pc(8) long local8 = Static362.method5133();
		for (@Pc(29) Class2_Sub45 local29 = arg0 ? (Class2_Sub45) this.aClass90_10.method1676() : (Class2_Sub45) this.aClass90_10.method1680(); local29 != null; local29 = (Class2_Sub45) this.aClass90_10.method1680()) {
			if (local8 > (local29.aLong219 & 0x3FFFFFFFFFFFFFFFL)) {
				if ((local29.aLong219 & 0x4000000000000000L) != 0L) {
					@Pc(60) int local60 = (int) local29.aLong268;
					this.anIntArray276[local60] = this.anIntArray275[local60];
					local29.method7657();
					return local60;
				}
				local29.method7657();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V")
	public void method2784() {
		for (@Pc(11) int local11 = 0; local11 < Static572.aClass55_1.anInt1148; local11++) {
			@Pc(18) Class27 local18 = Static572.aClass55_1.method1098(local11);
			if (local18 != null && local18.anInt649 == 0) {
				this.anIntArray275[local11] = 0;
				this.anIntArray276[local11] = 0;
			}
		}
		this.aClass90_10 = new Class90(128);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIZ)V")
	public void method2785(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray275[arg0] = arg1;
		@Pc(22) Class2_Sub45 local22 = (Class2_Sub45) this.aClass90_10.method1685((long) arg0);
		if (local22 == null) {
			local22 = new Class2_Sub45(4611686018427387905L);
			this.aClass90_10.method1684(local22, (long) arg0);
		} else if (local22.aLong219 != 4611686018427387905L) {
			local22.aLong219 = Static362.method5133() + 500L | 0x4000000000000000L;
			return;
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IBI)V")
	public void method2787(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class184 local8 = Static31.aClass145_1.method2547(arg1);
		@Pc(19) int local19 = local8.anInt4304;
		@Pc(22) int local22 = local8.anInt4302;
		@Pc(25) int local25 = local8.anInt4301;
		@Pc(32) int local32 = Class204.anIntArray347[local25 - local22];
		if (arg0 < 0 || local32 < arg0) {
			arg0 = 0;
		}
		local32 <<= local22;
		this.method2785(local19, ~local32 & this.anIntArray275[local19] | arg0 << local22 & local32);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IB)I")
	@Override
	public int method2780(@OriginalArg(0) int arg0) {
		return this.anIntArray276[arg0];
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(III)V")
	public void method2789(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class184 local8 = Static31.aClass145_1.method2547(arg0);
		@Pc(11) int local11 = local8.anInt4304;
		@Pc(14) int local14 = local8.anInt4302;
		@Pc(17) int local17 = local8.anInt4301;
		@Pc(24) int local24 = Class204.anIntArray347[local17 - local14];
		if (arg1 < 0 || arg1 > local24) {
			arg1 = 0;
		}
		local24 <<= local14;
		this.method2790(local11, this.anIntArray276[local11] & ~local24 | arg1 << local14 & local24);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIB)V")
	public void method2790(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray276[arg0] = arg1;
		@Pc(16) Class2_Sub45 local16 = (Class2_Sub45) this.aClass90_10.method1685((long) arg0);
		if (local16 == null) {
			local16 = new Class2_Sub45(Static362.method5133() + 500L);
			this.aClass90_10.method1684(local16, (long) arg0);
		} else {
			local16.aLong219 = Static362.method5133() + 500L;
		}
	}
}
