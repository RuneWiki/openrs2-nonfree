import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class Class65 {

	@OriginalMember(owner = "client!s", name = "e", descriptor = "Lclient!ef;")
	private final Class20 aClass20_11 = new Class20(256);

	@OriginalMember(owner = "client!s", name = "q", descriptor = "Lclient!ef;")
	private final Class20 aClass20_12 = new Class20(256);

	@OriginalMember(owner = "client!s", name = "h", descriptor = "Lclient!ff;")
	private final Class26 aClass26_26;

	@OriginalMember(owner = "client!s", name = "f", descriptor = "Lclient!ff;")
	private final Class26 aClass26_25;

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "(Lclient!ff;Lclient!ff;)V")
	public Class65(@OriginalArg(0) Class26 arg0, @OriginalArg(1) Class26 arg1) {
		this.aClass26_26 = arg0;
		this.aClass26_25 = arg1;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "([IBI)Lclient!qf;")
	public Class5_Sub21_Sub1 method1768(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass26_25.method1045() == 1) {
			return this.method1772(arg0, 0, arg1);
		} else if (this.aClass26_25.method1031(arg1) == 1) {
			return this.method1772(arg0, arg1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(I[III)Lclient!qf;")
	private Class5_Sub21_Sub1 method1771(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = (arg2 >>> 12 | (arg2 & 0x20000FFF) << 4) ^ arg1;
		@Pc(21) int local21 = local15 | arg2 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class5_Sub21_Sub1 local31 = (Class5_Sub21_Sub1) this.aClass20_12.method656(local24);
		if (local31 != null) {
			return local31;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(57) Class53 local57 = Static138.method1537(this.aClass26_26, arg2, arg1);
			if (local57 == null) {
				return null;
			}
			local31 = local57.method1538();
			this.aClass20_12.method647(local31, local24);
			if (arg0 != null) {
				arg0[0] -= local31.aByteArray37.length;
			}
			return local31;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(B[III)Lclient!qf;")
	private Class5_Sub21_Sub1 method1772(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = ((arg1 & 0x10000FFF) << 4 | arg1 >>> 12) ^ arg2;
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class5_Sub21_Sub1 local33 = (Class5_Sub21_Sub1) this.aClass20_12.method656(local26);
		if (local33 != null) {
			return local33;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(55) Class5_Sub1 local55 = (Class5_Sub1) this.aClass20_11.method656(local26);
			if (local55 == null) {
				local55 = Static5.method40(this.aClass26_25, arg1, arg2);
				if (local55 == null) {
					return null;
				}
				this.aClass20_11.method647(local55, local26);
			}
			local33 = local55.method32(arg0);
			if (local33 == null) {
				return null;
			} else {
				local55.method2189();
				this.aClass20_12.method647(local33, local26);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(II[I)Lclient!qf;")
	public Class5_Sub21_Sub1 method1773(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass26_26.method1045() == 1) {
			return this.method1771(arg1, arg0, 0);
		} else if (this.aClass26_26.method1031(arg0) == 1) {
			return this.method1771(arg1, 0, arg0);
		} else {
			throw new RuntimeException();
		}
	}
}
