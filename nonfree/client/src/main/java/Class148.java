import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class148 implements Interface15 {

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "Lclient!wh;")
	private Class356 aClass356_18 = new Class356(128);

	@OriginalMember(owner = "client!ib", name = "l", descriptor = "[I")
	private final int[] anIntArray241 = new int[Static189.aClass39_1.anInt1359];

	@OriginalMember(owner = "client!ib", name = "h", descriptor = "[I")
	public final int[] anIntArray240 = new int[Static189.aClass39_1.anInt1359];

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIB)V")
	public void method3532(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray241[arg0] = arg1;
		@Pc(24) Class1_Sub33 local24 = (Class1_Sub33) this.aClass356_18.method7796((long) arg0);
		if (local24 == null) {
			local24 = new Class1_Sub33(4611686018427387905L);
			this.aClass356_18.method7800((long) arg0, local24);
		} else if (local24.aLong269 != 4611686018427387905L) {
			local24.aLong269 = Static255.method4035() + 500L | 0x4000000000000000L;
			return;
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)V")
	public void method3533(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray240[arg0] = arg1;
		@Pc(16) Class1_Sub33 local16 = (Class1_Sub33) this.aClass356_18.method7796((long) arg0);
		if (local16 == null) {
			local16 = new Class1_Sub33(Static255.method4035() + 500L);
			this.aClass356_18.method7800((long) arg0, local16);
		} else {
			local16.aLong269 = Static255.method4035() + 500L;
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
	public void method3535() {
		for (@Pc(7) int local7 = 0; local7 < Static189.aClass39_1.anInt1359; local7++) {
			@Pc(14) Class341 local14 = Static189.aClass39_1.method1243(local7);
			if (local14 != null && local14.anInt9073 == 0) {
				this.anIntArray241[local7] = 0;
				this.anIntArray240[local7] = 0;
			}
		}
		this.aClass356_18 = new Class356(128);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)I")
	@Override
	public int method3531(@OriginalArg(0) int arg0) {
		@Pc(10) Class38 local10 = Static558.aClass32_1.method1001(arg0);
		@Pc(21) int local21 = local10.anInt1250;
		@Pc(24) int local24 = local10.anInt1248;
		@Pc(27) int local27 = local10.anInt1249;
		@Pc(34) int local34 = Class147.anIntArray239[local27 - local24];
		return this.anIntArray240[local21] >> local24 & local34;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZZ)I")
	public int method3536(@OriginalArg(0) boolean arg0) {
		@Pc(6) long local6 = Static255.method4035();
		for (@Pc(20) Class1_Sub33 local20 = arg0 ? (Class1_Sub33) this.aClass356_18.method7792() : (Class1_Sub33) this.aClass356_18.method7795(); local20 != null; local20 = (Class1_Sub33) this.aClass356_18.method7795()) {
			if (local6 > (local20.aLong269 & 0x3FFFFFFFFFFFFFFFL)) {
				if ((local20.aLong269 & 0x4000000000000000L) != 0L) {
					@Pc(45) int local45 = (int) local20.aLong425;
					this.anIntArray240[local45] = this.anIntArray241[local45];
					local20.method7878();
					return local45;
				}
				local20.method7878();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IBI)V")
	public void method3537(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class38 local8 = Static558.aClass32_1.method1001(arg1);
		@Pc(11) int local11 = local8.anInt1250;
		@Pc(14) int local14 = local8.anInt1248;
		@Pc(17) int local17 = local8.anInt1249;
		@Pc(29) int local29 = Class147.anIntArray239[local17 - local14];
		if (arg0 < 0 || arg0 > local29) {
			arg0 = 0;
		}
		local29 <<= local14;
		this.method3533(local11, arg0 << local14 & local29 | this.anIntArray240[local11] & ~local29);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(BI)I")
	@Override
	public int method3530(@OriginalArg(1) int arg0) {
		return this.anIntArray240[arg0];
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(III)V")
	public void method3538(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class38 local8 = Static558.aClass32_1.method1001(arg1);
		@Pc(11) int local11 = local8.anInt1250;
		@Pc(14) int local14 = local8.anInt1248;
		@Pc(17) int local17 = local8.anInt1249;
		@Pc(24) int local24 = Class147.anIntArray239[local17 - local14];
		if (arg0 < 0 || local24 < arg0) {
			arg0 = 0;
		}
		local24 <<= local14;
		this.method3532(local11, arg0 << local14 & local24 | this.anIntArray241[local11] & ~local24);
	}
}
