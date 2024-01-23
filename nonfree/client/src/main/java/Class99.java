import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jk")
public final class Class99 {

	@OriginalMember(owner = "client!jk", name = "m", descriptor = "Lclient!ic;")
	private Class85 aClass85_11 = new Class85(256);

	@OriginalMember(owner = "client!jk", name = "x", descriptor = "Lclient!ic;")
	private Class85 aClass85_12 = new Class85(256);

	@OriginalMember(owner = "client!jk", name = "c", descriptor = "Lclient!fh;")
	private Class58 aClass58_62;

	@OriginalMember(owner = "client!jk", name = "l", descriptor = "Lclient!fh;")
	private Class58 aClass58_63;

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Lclient!fh;Lclient!fh;)V")
	public Class99(@OriginalArg(0) Class58 arg0, @OriginalArg(1) Class58 arg1) {
		this.aClass58_62 = arg1;
		this.aClass58_63 = arg0;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(I[III)Lclient!pb;")
	private Class4_Sub8_Sub1 method2058(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		@Pc(18) int local18 = arg2 ^ (arg0 >>> 12 | (arg0 & 0x30000FFF) << 4);
		@Pc(28) int local28 = local18 | arg0 << 16;
		@Pc(31) long local31 = (long) local28;
		@Pc(38) Class4_Sub8_Sub1 local38 = (Class4_Sub8_Sub1) this.aClass85_12.method1845(local31);
		if (local38 != null) {
			return local38;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(57) Class7 local57 = Static317.method106(this.aClass58_63, arg0, arg2);
			if (local57 == null) {
				return null;
			}
			local38 = local57.method107();
			this.aClass85_12.method1841(local38, local31);
			if (arg1 != null) {
				arg1[0] -= local38.aByteArray52.length;
			}
			return local38;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "([III)Lclient!pb;")
	public Class4_Sub8_Sub1 method2059(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass58_62.method1351() == 1) {
			return this.method2060(arg1, 0, arg0);
		} else if (this.aClass58_62.method1371(arg1) == 1) {
			return this.method2060(0, arg1, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(III[I)Lclient!pb;")
	private Class4_Sub8_Sub1 method2060(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(15) int local15 = arg0 ^ ((arg1 & 0x60000FFF) << 4 | arg1 >>> 12);
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class4_Sub8_Sub1 local33 = (Class4_Sub8_Sub1) this.aClass85_12.method1845(local26);
		if (local33 != null) {
			return local33;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(64) Class4_Sub24 local64 = (Class4_Sub24) this.aClass85_11.method1845(local26);
			if (local64 == null) {
				local64 = Static231.method3673(this.aClass58_62, arg1, arg0);
				if (local64 == null) {
					return null;
				}
				this.aClass85_11.method1841(local64, local26);
			}
			local33 = local64.method3672(arg2);
			if (local33 == null) {
				return null;
			} else {
				local64.method4854();
				this.aClass85_12.method1841(local33, local26);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(I[II)Lclient!pb;")
	public Class4_Sub8_Sub1 method2062(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass58_63.method1351() == 1) {
			return this.method2058(0, arg0, arg1);
		} else if (this.aClass58_63.method1371(arg1) == 1) {
			return this.method2058(arg1, arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}
}
