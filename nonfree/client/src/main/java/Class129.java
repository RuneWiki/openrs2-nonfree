import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gm")
public final class Class129 {

	@OriginalMember(owner = "client!gm", name = "e", descriptor = "Lclient!jo;")
	private final Class187 aClass187_28 = new Class187(256);

	@OriginalMember(owner = "client!gm", name = "o", descriptor = "Lclient!jo;")
	private final Class187 aClass187_29 = new Class187(256);

	@OriginalMember(owner = "client!gm", name = "l", descriptor = "Lclient!wia;")
	private final Class386 aClass386_49;

	@OriginalMember(owner = "client!gm", name = "i", descriptor = "Lclient!wia;")
	private final Class386 aClass386_48;

	@OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Lclient!wia;Lclient!wia;)V")
	public Class129(@OriginalArg(0) Class386 arg0, @OriginalArg(1) Class386 arg1) {
		this.aClass386_49 = arg1;
		this.aClass386_48 = arg0;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(I[IIB)Lclient!dga;")
	private Class14_Sub14_Sub1 method2996(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		@Pc(15) int local15 = (arg2 << 4 & 0xFFFB | arg2 >>> 12) ^ arg0;
		@Pc(21) int local21 = local15 | arg2 << 16;
		@Pc(31) long local31 = (long) local21 ^ 0x100000000L;
		@Pc(38) Class14_Sub14_Sub1 local38 = (Class14_Sub14_Sub1) this.aClass187_29.method4078(local31);
		if (local38 != null) {
			return local38;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(57) Class14_Sub13 local57 = (Class14_Sub13) this.aClass187_28.method4078(local31);
			if (local57 == null) {
				local57 = Static99.method1800(this.aClass386_49, arg2, arg0);
				if (local57 == null) {
					return null;
				}
				this.aClass187_28.method4077(local31, local57);
			}
			local38 = local57.method1794(arg1);
			if (local38 == null) {
				return null;
			} else {
				local57.method9315();
				this.aClass187_29.method4077(local31, local38);
				return local38;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(II[I)Lclient!dga;")
	public Class14_Sub14_Sub1 method2997(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass386_49.method9189() == 1) {
			return this.method2996(arg0, arg1, 0);
		} else if (this.aClass386_49.method9210(arg0) == 1) {
			return this.method2996(0, arg1, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(III[I)Lclient!dga;")
	private Class14_Sub14_Sub1 method2999(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(15) int local15 = arg0 ^ ((arg1 & 0xE0000FFF) << 4 | arg1 >>> 12);
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class14_Sub14_Sub1 local31 = (Class14_Sub14_Sub1) this.aClass187_29.method4078(local24);
		if (local31 != null) {
			return local31;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(57) Class354 local57 = Static687.method8490(this.aClass386_48, arg1, arg0);
			if (local57 == null) {
				return null;
			}
			local31 = local57.method8493();
			this.aClass187_29.method4077(local24, local31);
			if (arg2 != null) {
				arg2[0] -= local31.aByteArray35.length;
			}
			return local31;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(I[II)Lclient!dga;")
	public Class14_Sub14_Sub1 method3001(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.aClass386_48.method9189() == 1) {
			return this.method2999(arg0, 0, arg1);
		} else if (this.aClass386_48.method9210(arg0) == 1) {
			return this.method2999(0, arg0, arg1);
		} else {
			throw new RuntimeException();
		}
	}
}
