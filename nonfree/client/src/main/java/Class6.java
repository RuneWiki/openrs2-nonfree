import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ag")
public final class Class6 {

	@OriginalMember(owner = "client!ag", name = "g", descriptor = "Lclient!ge;")
	private final Class30 aClass30_2 = new Class30(256);

	@OriginalMember(owner = "client!ag", name = "i", descriptor = "Lclient!ge;")
	private final Class30 aClass30_3 = new Class30(256);

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "Lclient!u;")
	private final Class76 aClass76_8;

	@OriginalMember(owner = "client!ag", name = "e", descriptor = "Lclient!u;")
	private final Class76 aClass76_9;

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Lclient!u;Lclient!u;)V")
	public Class6(@OriginalArg(0) Class76 arg0, @OriginalArg(1) Class76 arg1) {
		this.aClass76_8 = arg0;
		this.aClass76_9 = arg1;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(I[III)Lclient!qe;")
	private Class1_Sub20_Sub1 method239(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg0 ^ (arg2 << 4 & 0xFFF4 | arg2 >>> 12);
		@Pc(21) int local21 = local15 | arg2 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class1_Sub20_Sub1 local31 = (Class1_Sub20_Sub1) this.aClass30_3.method1467(local24);
		if (local31 != null) {
			return local31;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(59) Class47 local59 = Static187.method2174(this.aClass76_8, arg2, arg0);
			if (local59 == null) {
				return null;
			}
			local31 = local59.method2176();
			this.aClass30_3.method1464(local31, local24);
			if (arg1 != null) {
				arg1[0] -= local31.aByteArray45.length;
			}
			return local31;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(II[I)Lclient!qe;")
	public Class1_Sub20_Sub1 method241(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass76_8.method3326() == 1) {
			return this.method239(arg0, arg1, 0);
		} else if (this.aClass76_8.method3306(arg0) == 1) {
			return this.method239(0, arg1, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(B[II)Lclient!qe;")
	public Class1_Sub20_Sub1 method242(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass76_9.method3326() == 1) {
			return this.method243(arg1, 0, arg0);
		} else if (this.aClass76_9.method3306(arg1) == 1) {
			return this.method243(0, arg1, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(III[I)Lclient!qe;")
	private Class1_Sub20_Sub1 method243(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(15) int local15 = arg0 ^ (arg1 >>> 12 | (arg1 & 0x80000FFF) << 4);
		@Pc(26) int local26 = local15 | arg1 << 16;
		@Pc(31) long local31 = (long) local26 ^ 0x100000000L;
		@Pc(38) Class1_Sub20_Sub1 local38 = (Class1_Sub20_Sub1) this.aClass30_3.method1467(local31);
		if (local38 != null) {
			return local38;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(57) Class1_Sub6 local57 = (Class1_Sub6) this.aClass30_2.method1467(local31);
			if (local57 == null) {
				local57 = Static23.method490(this.aClass76_9, arg1, arg0);
				if (local57 == null) {
					return null;
				}
				this.aClass30_2.method1464(local57, local31);
			}
			local38 = local57.method489(arg2);
			if (local38 == null) {
				return null;
			} else {
				local57.method3499();
				this.aClass30_3.method1464(local38, local31);
				return local38;
			}
		} else {
			return null;
		}
	}
}
