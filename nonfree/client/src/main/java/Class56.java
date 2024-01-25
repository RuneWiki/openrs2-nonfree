import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!d")
public final class Class56 implements Interface21 {

	@OriginalMember(owner = "client!d", name = "l", descriptor = "Lclient!sl;")
	private Class310 aClass310_5 = new Class310(128);

	@OriginalMember(owner = "client!d", name = "i", descriptor = "[I")
	public final int[] anIntArray125 = new int[Static157.aClass195_1.anInt5267];

	@OriginalMember(owner = "client!d", name = "k", descriptor = "[I")
	private final int[] anIntArray126 = new int[Static157.aClass195_1.anInt5267];

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IB)I")
	@Override
	public int method1725(@OriginalArg(0) int arg0) {
		@Pc(13) Class190 local13 = Static165.aClass212_1.method5095(arg0);
		@Pc(16) int local16 = local13.anInt5118;
		@Pc(19) int local19 = local13.anInt5122;
		@Pc(22) int local22 = local13.anInt5121;
		@Pc(29) int local29 = Class27.anIntArray424[local22 - local19];
		return local29 & this.anIntArray125[local16] >> local19;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(BII)V")
	public void method1729(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class190 local8 = Static165.aClass212_1.method5095(arg0);
		@Pc(11) int local11 = local8.anInt5118;
		@Pc(14) int local14 = local8.anInt5122;
		@Pc(17) int local17 = local8.anInt5121;
		@Pc(29) int local29 = Class27.anIntArray424[local17 - local14];
		if (arg1 < 0 || arg1 > local29) {
			arg1 = 0;
		}
		local29 <<= local14;
		this.method1732(this.anIntArray125[local11] & ~local29 | local29 & arg1 << local14, local11);
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(III)V")
	public void method1731(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray126[arg1] = arg0;
		@Pc(26) Class3_Sub49 local26 = (Class3_Sub49) this.aClass310_5.method6601((long) arg1);
		if (local26 == null) {
			local26 = new Class3_Sub49(4611686018427387905L);
			this.aClass310_5.method6603(local26, (long) arg1);
		} else if (local26.aLong260 != 4611686018427387905L) {
			local26.aLong260 = Static587.method7753() + 500L | 0x4000000000000000L;
			return;
		}
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(III)V")
	public void method1732(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray125[arg1] = arg0;
		@Pc(24) Class3_Sub49 local24 = (Class3_Sub49) this.aClass310_5.method6601((long) arg1);
		if (local24 == null) {
			local24 = new Class3_Sub49(Static587.method7753() + 500L);
			this.aClass310_5.method6603(local24, (long) arg1);
		} else {
			local24.aLong260 = Static587.method7753() + 500L;
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ZI)I")
	@Override
	public int method1726(@OriginalArg(1) int arg0) {
		return this.anIntArray125[arg0];
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(I)V")
	public void method1733() {
		for (@Pc(9) int local9 = 0; local9 < Static157.aClass195_1.anInt5267; local9++) {
			@Pc(16) Class73 local16 = Static157.aClass195_1.method4539(local9);
			if (local16 != null && local16.anInt2613 == 0) {
				this.anIntArray126[local9] = 0;
				this.anIntArray125[local9] = 0;
			}
		}
		this.aClass310_5 = new Class310(128);
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ZB)I")
	public int method1735(@OriginalArg(0) boolean arg0) {
		@Pc(8) long local8 = Static587.method7753();
		for (@Pc(22) Class3_Sub49 local22 = arg0 ? (Class3_Sub49) this.aClass310_5.method6602() : (Class3_Sub49) this.aClass310_5.method6599(); local22 != null; local22 = (Class3_Sub49) this.aClass310_5.method6599()) {
			if ((local22.aLong260 & 0x3FFFFFFFFFFFFFFFL) < local8) {
				if ((local22.aLong260 & 0x4000000000000000L) != 0L) {
					@Pc(56) int local56 = (int) local22.aLong273;
					this.anIntArray125[local56] = this.anIntArray126[local56];
					local22.method7812();
					return local56;
				}
				local22.method7812();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!d", name = "c", descriptor = "(III)V")
	public void method1736(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class190 local10 = Static165.aClass212_1.method5095(arg1);
		@Pc(13) int local13 = local10.anInt5118;
		@Pc(16) int local16 = local10.anInt5122;
		@Pc(24) int local24 = local10.anInt5121;
		@Pc(31) int local31 = Class27.anIntArray424[local24 - local16];
		if (arg0 < 0 || arg0 > local31) {
			arg0 = 0;
		}
		local31 <<= local16;
		this.method1731(this.anIntArray126[local13] & ~local31 | arg0 << local16 & local31, local13);
	}
}
