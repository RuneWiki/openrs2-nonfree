import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class66 {

	@OriginalMember(owner = "client!qd", name = "n", descriptor = "Lclient!wf;")
	private final Class87 aClass87_12 = new Class87(256);

	@OriginalMember(owner = "client!qd", name = "z", descriptor = "Lclient!wf;")
	private final Class87 aClass87_13 = new Class87(256);

	@OriginalMember(owner = "client!qd", name = "i", descriptor = "Lclient!ah;")
	private final Class7 aClass7_53;

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "Lclient!ah;")
	private final Class7 aClass7_52;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lclient!ah;Lclient!ah;)V")
	public Class66(@OriginalArg(0) Class7 arg0, @OriginalArg(1) Class7 arg1) {
		this.aClass7_53 = arg0;
		this.aClass7_52 = arg1;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(I[III)Lclient!le;")
	private Class3_Sub13_Sub1 method2511(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		@Pc(20) int local20 = arg0 ^ (arg2 << 4 & 0xFFFD | arg2 >>> 12);
		@Pc(26) int local26 = local20 | arg2 << 16;
		@Pc(31) long local31 = (long) local26 ^ 0x100000000L;
		@Pc(38) Class3_Sub13_Sub1 local38 = (Class3_Sub13_Sub1) this.aClass87_13.method3201(local31);
		if (local38 != null) {
			return local38;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(57) Class3_Sub5 local57 = (Class3_Sub5) this.aClass87_12.method3201(local31);
			if (local57 == null) {
				local57 = Static36.method877(this.aClass7_52, arg2, arg0);
				if (local57 == null) {
					return null;
				}
				this.aClass87_12.method3200(local31, local57);
			}
			local38 = local57.method884(arg1);
			if (local38 == null) {
				return null;
			} else {
				local57.method3167();
				this.aClass87_13.method3200(local31, local38);
				return local38;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "([IBI)Lclient!le;")
	public Class3_Sub13_Sub1 method2513(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass7_52.method1025() == 1) {
			return this.method2511(arg1, arg0, 0);
		} else if (this.aClass7_52.method1022(arg1) == 1) {
			return this.method2511(0, arg0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "([IIII)Lclient!le;")
	private Class3_Sub13_Sub1 method2518(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(21) int local21 = arg2 ^ (arg1 << 4 & 0xFFF7 | arg1 >>> 12);
		@Pc(27) int local27 = local21 | arg1 << 16;
		@Pc(30) long local30 = (long) local27;
		@Pc(37) Class3_Sub13_Sub1 local37 = (Class3_Sub13_Sub1) this.aClass87_13.method3201(local30);
		if (local37 != null) {
			return local37;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(58) Class51 local58 = Static187.method2099(this.aClass7_53, arg1, arg2);
			if (local58 == null) {
				return null;
			}
			local37 = local58.method2100();
			this.aClass87_13.method3200(local30, local37);
			if (arg0 != null) {
				arg0[0] -= local37.aByteArray32.length;
			}
			return local37;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(I[IZ)Lclient!le;")
	public Class3_Sub13_Sub1 method2520(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.aClass7_53.method1025() == 1) {
			return this.method2518(arg1, 0, arg0);
		} else if (this.aClass7_53.method1022(arg0) == 1) {
			return this.method2518(arg1, arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}
}
