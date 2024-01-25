import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vaa")
public final class Class363 implements Interface19 {

	@OriginalMember(owner = "client!vaa", name = "g", descriptor = "Lclient!lk;")
	private Class209 aClass209_53 = new Class209(128);

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "[I")
	private final int[] anIntArray669 = new int[Static313.aClass200_1.anInt5427];

	@OriginalMember(owner = "client!vaa", name = "b", descriptor = "[I")
	public final int[] anIntArray670 = new int[Static313.aClass200_1.anInt5427];

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(III)V")
	public void method8558(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray669[arg0] = arg1;
		@Pc(16) Class6_Sub50 local16 = (Class6_Sub50) this.aClass209_53.method5038((long) arg0);
		if (local16 == null) {
			local16 = new Class6_Sub50(4611686018427387905L);
			this.aClass209_53.method5035((long) arg0, local16);
		} else if (local16.aLong268 != 4611686018427387905L) {
			local16.aLong268 = Static566.method7936() + 500L | 0x4000000000000000L;
		}
	}

	@OriginalMember(owner = "client!vaa", name = "b", descriptor = "(III)V")
	public void method8559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray670[arg1] = arg0;
		@Pc(16) Class6_Sub50 local16 = (Class6_Sub50) this.aClass209_53.method5038((long) arg1);
		if (local16 == null) {
			local16 = new Class6_Sub50(Static566.method7936() + 500L);
			this.aClass209_53.method5035((long) arg1, local16);
		} else {
			local16.aLong268 = Static566.method7936() + 500L;
		}
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(BII)V")
	public void method8560(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class348 local8 = Static439.aClass372_1.method8725(arg1);
		@Pc(17) int local17 = local8.anInt9658;
		@Pc(20) int local20 = local8.anInt9661;
		@Pc(23) int local23 = local8.anInt9660;
		@Pc(30) int local30 = Class6_Sub1_Sub30.anIntArray554[local23 - local20];
		if (arg0 < 0 || arg0 > local30) {
			arg0 = 0;
		}
		local30 <<= local20;
		this.method8558(local17, this.anIntArray669[local17] & ~local30 | arg0 << local20 & local30);
	}

	@OriginalMember(owner = "client!vaa", name = "b", descriptor = "(II)I")
	@Override
	public int method8557(@OriginalArg(0) int arg0) {
		return this.anIntArray670[arg0];
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(B)V")
	public void method8561() {
		for (@Pc(1) int local1 = 0; local1 < Static313.aClass200_1.anInt5427; local1++) {
			@Pc(10) Class387 local10 = Static313.aClass200_1.method4611(local1);
			if (local10 != null && local10.anInt10616 == 0) {
				this.anIntArray669[local1] = 0;
				this.anIntArray670[local1] = 0;
			}
		}
		this.aClass209_53 = new Class209(128);
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IIZ)V")
	public void method8563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class348 local8 = Static439.aClass372_1.method8725(arg1);
		@Pc(19) int local19 = local8.anInt9658;
		@Pc(22) int local22 = local8.anInt9661;
		@Pc(25) int local25 = local8.anInt9660;
		@Pc(32) int local32 = Class6_Sub1_Sub30.anIntArray554[local25 - local22];
		if (arg0 < 0 || arg0 > local32) {
			arg0 = 0;
		}
		local32 <<= local22;
		this.method8559(~local32 & this.anIntArray670[local19] | local32 & arg0 << local22, local19);
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(BZ)I")
	public int method8565(@OriginalArg(1) boolean arg0) {
		@Pc(8) long local8 = Static566.method7936();
		for (@Pc(27) Class6_Sub50 local27 = arg0 ? (Class6_Sub50) this.aClass209_53.method5037() : (Class6_Sub50) this.aClass209_53.method5036(); local27 != null; local27 = (Class6_Sub50) this.aClass209_53.method5036()) {
			if (local8 > (local27.aLong268 & 0x3FFFFFFFFFFFFFFFL)) {
				if ((local27.aLong268 & 0x4000000000000000L) != 0L) {
					@Pc(47) int local47 = (int) local27.aLong314;
					this.anIntArray670[local47] = this.anIntArray669[local47];
					local27.method9174();
					return local47;
				}
				local27.method9174();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(II)I")
	@Override
	public int method8556(@OriginalArg(0) int arg0) {
		@Pc(8) Class348 local8 = Static439.aClass372_1.method8725(arg0);
		@Pc(15) int local15 = local8.anInt9658;
		@Pc(18) int local18 = local8.anInt9661;
		@Pc(21) int local21 = local8.anInt9660;
		@Pc(28) int local28 = Class6_Sub1_Sub30.anIntArray554[local21 - local18];
		return this.anIntArray670[local15] >> local18 & local28;
	}
}
