import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
public final class Class51 {

	@OriginalMember(owner = "client!fi", name = "l", descriptor = "Lclient!qb;")
	private Class142 aClass142_5 = new Class142(256);

	@OriginalMember(owner = "client!fi", name = "o", descriptor = "Lclient!qb;")
	private Class142 aClass142_6 = new Class142(256);

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "Lclient!nk;")
	private Class121 aClass121_45;

	@OriginalMember(owner = "client!fi", name = "f", descriptor = "Lclient!nk;")
	private Class121 aClass121_46;

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lclient!nk;Lclient!nk;)V")
	public Class51(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class121 arg1) {
		this.aClass121_45 = arg0;
		this.aClass121_46 = arg1;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(B[III)Lclient!fn;")
	private Class1_Sub5_Sub1 method1559(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg1 ^ ((arg2 & 0xF0000FFF) << 4 | arg2 >>> 12);
		@Pc(21) int local21 = local15 | arg2 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class1_Sub5_Sub1 local33 = (Class1_Sub5_Sub1) this.aClass142_6.method3543(local26);
		if (local33 != null) {
			return local33;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(55) Class1_Sub28 local55 = (Class1_Sub28) this.aClass142_5.method3543(local26);
			if (local55 == null) {
				local55 = Static265.method4176(this.aClass121_46, arg2, arg1);
				if (local55 == null) {
					return null;
				}
				this.aClass142_5.method3537(local55, local26);
			}
			local33 = local55.method4169(arg0);
			if (local33 == null) {
				return null;
			} else {
				local55.method4779();
				this.aClass142_6.method3537(local33, local26);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(I[III)Lclient!fn;")
	private Class1_Sub5_Sub1 method1562(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		@Pc(11) int local11 = arg0 ^ (arg2 << 4 & 0xFFF5 | arg2 >>> 12);
		@Pc(17) int local17 = local11 | arg2 << 16;
		@Pc(20) long local20 = (long) local17;
		@Pc(33) Class1_Sub5_Sub1 local33 = (Class1_Sub5_Sub1) this.aClass142_6.method3543(local20);
		if (local33 != null) {
			return local33;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(58) Class169 local58 = Static326.method4205(this.aClass121_45, arg2, arg0);
			if (local58 == null) {
				return null;
			}
			local33 = local58.method4206();
			this.aClass142_6.method3537(local33, local20);
			if (arg1 != null) {
				arg1[0] -= local33.aByteArray21.length;
			}
			return local33;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "([III)Lclient!fn;")
	public Class1_Sub5_Sub1 method1563(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		if (this.aClass121_46.method3137() == 1) {
			return this.method1559(arg0, arg1, 0);
		} else if (this.aClass121_46.method3125(arg1) == 1) {
			return this.method1559(arg0, 0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IB[I)Lclient!fn;")
	public Class1_Sub5_Sub1 method1564(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass121_45.method3137() == 1) {
			return this.method1562(arg0, arg1, 0);
		} else if (this.aClass121_45.method3125(arg0) == 1) {
			return this.method1562(0, arg1, arg0);
		} else {
			throw new RuntimeException();
		}
	}
}
