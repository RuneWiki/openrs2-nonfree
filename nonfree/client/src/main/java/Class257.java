import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pj")
public final class Class257 {

	@OriginalMember(owner = "client!pj", name = "h", descriptor = "Lclient!il;")
	private final Class162 aClass162_28 = new Class162(256);

	@OriginalMember(owner = "client!pj", name = "l", descriptor = "Lclient!il;")
	private final Class162 aClass162_29 = new Class162(256);

	@OriginalMember(owner = "client!pj", name = "f", descriptor = "Lclient!pl;")
	private final Class259 aClass259_130;

	@OriginalMember(owner = "client!pj", name = "d", descriptor = "Lclient!pl;")
	private final Class259 aClass259_129;

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Lclient!pl;Lclient!pl;)V")
	public Class257(@OriginalArg(0) Class259 arg0, @OriginalArg(1) Class259 arg1) {
		this.aClass259_130 = arg0;
		this.aClass259_129 = arg1;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(II[II)Lclient!oaa;")
	private Class2_Sub7_Sub1 method5951(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = (arg2 << 4 & 0xFFF8 | arg2 >>> 12) ^ arg0;
		@Pc(29) int local29 = local15 | arg2 << 16;
		@Pc(32) long local32 = (long) local29;
		@Pc(39) Class2_Sub7_Sub1 local39 = (Class2_Sub7_Sub1) this.aClass162_29.method3519(local32);
		if (local39 != null) {
			return local39;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(57) Class331 local57 = Static604.method7303(this.aClass259_130, arg2, arg0);
			if (local57 == null) {
				return null;
			}
			local39 = local57.method7305();
			this.aClass162_29.method3522(local39, local32);
			if (arg1 != null) {
				arg1[0] -= local39.aByteArray68.length;
			}
			return local39;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(I[III)Lclient!oaa;")
	private Class2_Sub7_Sub1 method5953(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg2 ^ ((arg1 & 0xA0000FFF) << 4 | arg1 >>> 12);
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class2_Sub7_Sub1 local33 = (Class2_Sub7_Sub1) this.aClass162_29.method3519(local26);
		if (local33 != null) {
			return local33;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(58) Class2_Sub20 local58 = (Class2_Sub20) this.aClass162_28.method3519(local26);
			if (local58 == null) {
				local58 = Static178.method3070(this.aClass259_129, arg1, arg2);
				if (local58 == null) {
					return null;
				}
				this.aClass162_28.method3522(local58, local26);
			}
			local33 = local58.method3065(arg0);
			if (local33 == null) {
				return null;
			} else {
				local58.method7966();
				this.aClass162_29.method3522(local33, local26);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(II[I)Lclient!oaa;")
	public Class2_Sub7_Sub1 method5956(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass259_130.method5962() == 1) {
			return this.method5951(arg0, arg1, 0);
		} else if (this.aClass259_130.method5969(arg0) == 1) {
			return this.method5951(0, arg1, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(I[IB)Lclient!oaa;")
	public Class2_Sub7_Sub1 method5957(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.aClass259_129.method5962() == 1) {
			return this.method5953(arg1, 0, arg0);
		} else if (this.aClass259_129.method5969(arg0) == 1) {
			return this.method5953(arg1, arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}
}
