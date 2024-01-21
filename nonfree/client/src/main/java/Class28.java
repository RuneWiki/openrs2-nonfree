import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class28 {

	@OriginalMember(owner = "client!hf", name = "g", descriptor = "Lclient!wd;")
	private final Class82 aClass82_5 = new Class82(256);

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "Lclient!jb;")
	private final Class25 aClass25_10;

	@OriginalMember(owner = "client!hf", name = "m", descriptor = "Lclient!jb;")
	private final Class25 aClass25_11;

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lclient!jb;Lclient!jb;)V")
	public Class28(@OriginalArg(0) Class25 arg0, @OriginalArg(1) Class25 arg1) {
		this.aClass25_10 = arg1;
		this.aClass25_11 = arg0;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(I[III)Lclient!fc;")
	private Class3_Sub9_Sub1 method984(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(20) int local20 = (arg2 >>> 12 | arg2 << 4 & 0xFFF8) ^ arg1;
		@Pc(26) int local26 = local20 | arg2 << 16;
		@Pc(29) long local29 = (long) local26;
		@Pc(36) Class3_Sub9_Sub1 local36 = (Class3_Sub9_Sub1) this.aClass82_5.method2305(local29);
		if (local36 != null) {
			return local36;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(54) Class63 local54 = Static137.method2000(this.aClass25_11, arg2, arg1);
			if (local54 == null) {
				return null;
			}
			local36 = local54.method1998();
			this.aClass82_5.method2303(local36, local29);
			if (arg0 != null) {
				arg0[0] -= local36.aByteArray32.length;
			}
			return local36;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "([IBI)Lclient!fc;")
	public Class3_Sub9_Sub1 method986(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass25_10.method910() == 1) {
			return this.method990(arg0, arg1, 0);
		} else if (this.aClass25_10.method911(arg1) == 1) {
			return this.method990(arg0, 0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(II[I)Lclient!fc;")
	public Class3_Sub9_Sub1 method988(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass25_11.method910() == 1) {
			return this.method984(arg1, arg0, 0);
		} else if (this.aClass25_11.method911(arg0) == 1) {
			return this.method984(arg1, 0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "([IZII)Lclient!fc;")
	private Class3_Sub9_Sub1 method990(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = ((arg2 & 0x40000FFF) << 4 | arg2 >>> 12) ^ arg1;
		@Pc(26) int local26 = local15 | arg2 << 16;
		@Pc(31) long local31 = (long) local26 ^ 0x100000000L;
		@Pc(38) Class3_Sub9_Sub1 local38 = (Class3_Sub9_Sub1) this.aClass82_5.method2305(local31);
		if (local38 != null) {
			return local38;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(56) Class54 local56 = Static90.method1699(this.aClass25_10, arg2, arg1);
			if (local56 == null) {
				return null;
			}
			local38 = local56.method1702();
			this.aClass82_5.method2303(local38, local31);
			if (arg0 != null) {
				arg0[0] -= local38.aByteArray32.length;
			}
			return local38;
		} else {
			return null;
		}
	}
}
