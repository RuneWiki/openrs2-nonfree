import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class93 {

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "Lclient!pd;")
	private Class129 aClass129_12 = new Class129(256);

	@OriginalMember(owner = "client!ke", name = "p", descriptor = "Lclient!pd;")
	private Class129 aClass129_13 = new Class129(256);

	@OriginalMember(owner = "client!ke", name = "f", descriptor = "Lclient!pk;")
	private Class132 aClass132_51;

	@OriginalMember(owner = "client!ke", name = "n", descriptor = "Lclient!pk;")
	private Class132 aClass132_52;

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(Lclient!pk;Lclient!pk;)V")
	public Class93(@OriginalArg(0) Class132 arg0, @OriginalArg(1) Class132 arg1) {
		this.aClass132_51 = arg1;
		this.aClass132_52 = arg0;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z[II)Lclient!rk;")
	public Class8_Sub20_Sub1 method2199(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass132_51.method3193() == 1) {
			return this.method2203(arg0, 0, arg1);
		} else if (this.aClass132_51.method3189(arg1) == 1) {
			return this.method2203(arg0, arg1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(II[I)Lclient!rk;")
	public Class8_Sub20_Sub1 method2200(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass132_52.method3193() == 1) {
			return this.method2201(arg0, 0, arg1);
		} else if (this.aClass132_52.method3189(arg0) == 1) {
			return this.method2201(0, arg0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(III[I)Lclient!rk;")
	private Class8_Sub20_Sub1 method2201(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(15) int local15 = arg0 ^ (arg1 >>> 12 | (arg1 & 0x30000FFF) << 4);
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class8_Sub20_Sub1 local31 = (Class8_Sub20_Sub1) this.aClass129_13.method3043(local24);
		if (local31 != null) {
			return local31;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(50) Class104 local50 = Static308.method2415(this.aClass132_52, arg1, arg0);
			if (local50 == null) {
				return null;
			}
			local31 = local50.method2417();
			this.aClass129_13.method3039(local31, local24);
			if (arg2 != null) {
				arg2[0] -= local31.aByteArray47.length;
			}
			return local31;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z[III)Lclient!rk;")
	private Class8_Sub20_Sub1 method2203(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11 = (arg1 >>> 12 | arg1 << 4 & 0xFFF2) ^ arg2;
		@Pc(17) int local17 = local11 | arg1 << 16;
		@Pc(26) long local26 = (long) local17 ^ 0x100000000L;
		@Pc(33) Class8_Sub20_Sub1 local33 = (Class8_Sub20_Sub1) this.aClass129_13.method3043(local26);
		if (local33 != null) {
			return local33;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(54) Class8_Sub19 local54 = (Class8_Sub19) this.aClass129_12.method3043(local26);
			if (local54 == null) {
				local54 = Static142.method2249(this.aClass132_51, arg1, arg2);
				if (local54 == null) {
					return null;
				}
				this.aClass129_12.method3039(local54, local26);
			}
			local33 = local54.method2259(arg0);
			if (local33 == null) {
				return null;
			} else {
				local54.method4273();
				this.aClass129_13.method3039(local33, local26);
				return local33;
			}
		} else {
			return null;
		}
	}
}
