import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class4 implements Interface12 {

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "Lclient!qi;")
	private Class208 aClass208_1 = new Class208(128);

	@OriginalMember(owner = "client!ac", name = "o", descriptor = "[I")
	public final int[] anIntArray2 = new int[Static186.aClass233_1.anInt6078];

	@OriginalMember(owner = "client!ac", name = "m", descriptor = "[I")
	private final int[] anIntArray1 = new int[Static186.aClass233_1.anInt6078];

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
	public void method32() {
		for (@Pc(7) int local7 = 0; local7 < Static186.aClass233_1.anInt6078; local7++) {
			@Pc(14) Class258 local14 = Static186.aClass233_1.method4876(local7);
			if (local14 != null && local14.anInt6811 == 0) {
				this.anIntArray1[local7] = 0;
				this.anIntArray2[local7] = 0;
			}
		}
		this.aClass208_1 = new Class208(128);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)I")
	@Override
	public int method31(@OriginalArg(1) int arg0) {
		@Pc(10) Class207 local10 = Static197.aClass76_1.method1374(arg0);
		@Pc(19) int local19 = local10.anInt5483;
		@Pc(22) int local22 = local10.anInt5486;
		@Pc(25) int local25 = local10.anInt5489;
		@Pc(31) int local31 = Class200.anIntArray391[local25 - local22];
		return this.anIntArray2[local19] >> local22 & local31;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BII)V")
	public void method34(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class207 local8 = Static197.aClass76_1.method1374(arg0);
		@Pc(11) int local11 = local8.anInt5483;
		@Pc(14) int local14 = local8.anInt5486;
		@Pc(25) int local25 = local8.anInt5489;
		@Pc(31) int local31 = Class200.anIntArray391[local25 - local14];
		if (arg1 < 0 || arg1 > local31) {
			arg1 = 0;
		}
		local31 <<= local14;
		this.method38(local11, this.anIntArray1[local11] & ~local31 | local31 & arg1 << local14);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IZI)V")
	public void method35(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class207 local8 = Static197.aClass76_1.method1374(arg0);
		@Pc(11) int local11 = local8.anInt5483;
		@Pc(14) int local14 = local8.anInt5486;
		@Pc(23) int local23 = local8.anInt5489;
		@Pc(29) int local29 = Class200.anIntArray391[local23 - local14];
		if (arg1 < 0 || local29 < arg1) {
			arg1 = 0;
		}
		local29 <<= local14;
		this.method39(local11, this.anIntArray2[local11] & ~local29 | local29 & arg1 << local14);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BI)I")
	@Override
	public int method30(@OriginalArg(1) int arg0) {
		return this.anIntArray2[arg0];
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZB)I")
	public int method36(@OriginalArg(0) boolean arg0) {
		@Pc(8) long local8 = Static183.method2674();
		for (@Pc(28) Class1_Sub40 local28 = arg0 ? (Class1_Sub40) this.aClass208_1.method4414() : (Class1_Sub40) this.aClass208_1.method4410(); local28 != null; local28 = (Class1_Sub40) this.aClass208_1.method4410()) {
			if ((local28.aLong195 & 0x3FFFFFFFFFFFFFFFL) < local8) {
				if ((local28.aLong195 & 0x4000000000000000L) != 0L) {
					@Pc(53) int local53 = (int) local28.aLong236;
					this.anIntArray2[local53] = this.anIntArray1[local53];
					local28.method5953();
					return local53;
				}
				local28.method5953();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(III)V")
	public void method38(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray1[arg0] = arg1;
		@Pc(24) Class1_Sub40 local24 = (Class1_Sub40) this.aClass208_1.method4405((long) arg0);
		if (local24 == null) {
			local24 = new Class1_Sub40(4611686018427387905L);
			this.aClass208_1.method4413((long) arg0, local24);
		} else if (local24.aLong195 != 4611686018427387905L) {
			local24.aLong195 = Static183.method2674() + 500L | 0x4000000000000000L;
		}
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(BII)V")
	public void method39(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray2[arg0] = arg1;
		@Pc(16) Class1_Sub40 local16 = (Class1_Sub40) this.aClass208_1.method4405((long) arg0);
		if (local16 == null) {
			local16 = new Class1_Sub40(Static183.method2674() + 500L);
			this.aClass208_1.method4413((long) arg0, local16);
		} else {
			local16.aLong195 = Static183.method2674() + 500L;
		}
	}
}
