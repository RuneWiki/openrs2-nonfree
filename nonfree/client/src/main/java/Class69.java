import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nj")
public final class Class69 {

	@OriginalMember(owner = "client!nj", name = "g", descriptor = "Lclient!ob;")
	private Class70 aClass70_12 = new Class70(256);

	@OriginalMember(owner = "client!nj", name = "p", descriptor = "Lclient!ob;")
	private Class70 aClass70_13 = new Class70(256);

	@OriginalMember(owner = "client!nj", name = "o", descriptor = "Lclient!nb;")
	private Class15 aClass15_28;

	@OriginalMember(owner = "client!nj", name = "h", descriptor = "Lclient!nb;")
	private Class15 aClass15_27;

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(Lclient!nb;Lclient!nb;)V")
	public Class69(@OriginalArg(0) Class15 arg0, @OriginalArg(1) Class15 arg1) {
		this.aClass15_28 = arg1;
		this.aClass15_27 = arg0;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(II[I)Lclient!tf;")
	public Class2_Sub9_Sub1 method2164(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass15_27.method388() == 1) {
			return this.method2166(arg0, arg1, 0);
		} else if (this.aClass15_27.method390(arg0) == 1) {
			return this.method2166(0, arg1, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "([IIII)Lclient!tf;")
	private Class2_Sub9_Sub1 method2165(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg2 ^ ((arg1 & 0xD0000FFF) << 4 | arg1 >>> 12);
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class2_Sub9_Sub1 local33 = (Class2_Sub9_Sub1) this.aClass70_13.method2205(local26);
		if (local33 != null) {
			return local33;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(60) Class2_Sub24 local60 = (Class2_Sub24) this.aClass70_12.method2205(local26);
			if (local60 == null) {
				local60 = Static172.method2787(this.aClass15_28, arg1, arg2);
				if (local60 == null) {
					return null;
				}
				this.aClass70_12.method2208(local26, local60);
			}
			local33 = local60.method2788(arg0);
			if (local33 == null) {
				return null;
			} else {
				local60.method3314();
				this.aClass70_13.method2208(local26, local33);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(II[II)Lclient!tf;")
	private Class2_Sub9_Sub1 method2166(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(20) int local20 = (arg2 << 4 & 0xFFF4 | arg2 >>> 12) ^ arg0;
		@Pc(26) int local26 = local20 | arg2 << 16;
		@Pc(29) long local29 = (long) local26;
		@Pc(36) Class2_Sub9_Sub1 local36 = (Class2_Sub9_Sub1) this.aClass70_13.method2205(local29);
		if (local36 != null) {
			return local36;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(57) Class24 local57 = Static223.method686(this.aClass15_27, arg2, arg0);
			if (local57 == null) {
				return null;
			}
			local36 = local57.method687();
			this.aClass70_13.method2208(local29, local36);
			if (arg1 != null) {
				arg1[0] -= local36.aByteArray61.length;
			}
			return local36;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "([III)Lclient!tf;")
	public Class2_Sub9_Sub1 method2167(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass15_28.method388() == 1) {
			return this.method2165(arg0, 0, arg1);
		} else if (this.aClass15_28.method390(arg1) == 1) {
			return this.method2165(arg0, arg1, 0);
		} else {
			throw new RuntimeException();
		}
	}
}
