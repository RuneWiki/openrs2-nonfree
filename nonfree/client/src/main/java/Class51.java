import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cg")
public final class Class51 implements Interface17 {

	@OriginalMember(owner = "client!cg", name = "i", descriptor = "Lclient!oj;")
	private Class234 aClass234_3 = new Class234(128);

	@OriginalMember(owner = "client!cg", name = "n", descriptor = "[I")
	public final int[] anIntArray111 = new int[Static382.aClass78_1.anInt1848];

	@OriginalMember(owner = "client!cg", name = "p", descriptor = "[I")
	private final int[] anIntArray112 = new int[Static382.aClass78_1.anInt1848];

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)V")
	public void method959() {
		for (@Pc(15) int local15 = 0; local15 < Static382.aClass78_1.anInt1848; local15++) {
			@Pc(22) Class110 local22 = Static382.aClass78_1.method1673(local15);
			if (local22 != null && local22.anInt2885 == 0) {
				this.anIntArray112[local15] = 0;
				this.anIntArray111[local15] = 0;
			}
		}
		this.aClass234_3 = new Class234(128);
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(BI)I")
	@Override
	public int method957(@OriginalArg(1) int arg0) {
		return this.anIntArray111[arg0];
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IZ)I")
	public int method961(@OriginalArg(1) boolean arg0) {
		@Pc(8) long local8 = Static416.method5922();
		for (@Pc(22) Class6_Sub45 local22 = arg0 ? (Class6_Sub45) this.aClass234_3.method5469() : (Class6_Sub45) this.aClass234_3.method5465(); local22 != null; local22 = (Class6_Sub45) this.aClass234_3.method5465()) {
			if (local8 > (local22.aLong208 & 0x3FFFFFFFFFFFFFFFL)) {
				if ((local22.aLong208 & 0x4000000000000000L) != 0L) {
					@Pc(49) int local49 = (int) local22.aLong245;
					this.anIntArray111[local49] = this.anIntArray112[local49];
					local22.method7948();
					return local49;
				}
				local22.method7948();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)I")
	@Override
	public int method958(@OriginalArg(1) int arg0) {
		@Pc(8) Class311 local8 = Static344.aClass173_1.method4046(arg0);
		@Pc(11) int local11 = local8.anInt8767;
		@Pc(14) int local14 = local8.anInt8764;
		@Pc(17) int local17 = local8.anInt8762;
		@Pc(30) int local30 = Class143.anIntArray347[local17 - local14];
		return this.anIntArray111[local11] >> local14 & local30;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(III)V")
	public void method962(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray112[arg1] = arg0;
		@Pc(36) Class6_Sub45 local36 = (Class6_Sub45) this.aClass234_3.method5464((long) arg1);
		if (local36 == null) {
			local36 = new Class6_Sub45(4611686018427387905L);
			this.aClass234_3.method5466((long) arg1, local36);
		} else if (local36.aLong208 != 4611686018427387905L) {
			local36.aLong208 = Static416.method5922() + 500L | 0x4000000000000000L;
		}
	}

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "(III)V")
	public void method965(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class311 local10 = Static344.aClass173_1.method4046(arg1);
		@Pc(13) int local13 = local10.anInt8767;
		@Pc(16) int local16 = local10.anInt8764;
		@Pc(19) int local19 = local10.anInt8762;
		@Pc(26) int local26 = Class143.anIntArray347[local19 - local16];
		if (arg0 < 0 || arg0 > local26) {
			arg0 = 0;
		}
		local26 <<= local16;
		this.method967(local13, ~local26 & this.anIntArray111[local13] | local26 & arg0 << local16);
	}

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "(III)V")
	public void method966(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class311 local10 = Static344.aClass173_1.method4046(arg0);
		@Pc(13) int local13 = local10.anInt8767;
		@Pc(16) int local16 = local10.anInt8764;
		@Pc(19) int local19 = local10.anInt8762;
		@Pc(26) int local26 = Class143.anIntArray347[local19 - local16];
		if (arg1 < 0 || arg1 > local26) {
			arg1 = 0;
		}
		local26 <<= local16;
		this.method962(this.anIntArray112[local13] & ~local26 | local26 & arg1 << local16, local13);
	}

	@OriginalMember(owner = "client!cg", name = "e", descriptor = "(III)V")
	public void method967(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray111[arg0] = arg1;
		@Pc(16) Class6_Sub45 local16 = (Class6_Sub45) this.aClass234_3.method5464((long) arg0);
		if (local16 == null) {
			local16 = new Class6_Sub45(Static416.method5922() + 500L);
			this.aClass234_3.method5466((long) arg0, local16);
		} else {
			local16.aLong208 = Static416.method5922() + 500L;
		}
	}
}
