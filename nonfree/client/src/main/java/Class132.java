import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hj")
public final class Class132 {

	@OriginalMember(owner = "client!hj", name = "h", descriptor = "Lclient!dea;")
	private final Class68 aClass68_29 = new Class68(256);

	@OriginalMember(owner = "client!hj", name = "l", descriptor = "Lclient!dea;")
	private final Class68 aClass68_30 = new Class68(256);

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "Lclient!an;")
	private final Class16 aClass16_49;

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "Lclient!an;")
	private final Class16 aClass16_48;

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Lclient!an;Lclient!an;)V")
	public Class132(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class16 arg1) {
		this.aClass16_49 = arg0;
		this.aClass16_48 = arg1;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "([III)Lclient!ke;")
	public Class12_Sub29_Sub1 method3614(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass16_48.method407() == 1) {
			return this.method3619(arg1, 0, arg0);
		} else if (this.aClass16_48.method399(arg1) == 1) {
			return this.method3619(0, arg1, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(I[II)Lclient!ke;")
	public Class12_Sub29_Sub1 method3616(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.aClass16_49.method407() == 1) {
			return this.method3618(arg1, arg0, 0);
		} else if (this.aClass16_49.method399(arg0) == 1) {
			return this.method3618(arg1, 0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "([IBII)Lclient!ke;")
	private Class12_Sub29_Sub1 method3618(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = ((arg2 & 0xD0000FFF) << 4 | arg2 >>> 12) ^ arg1;
		@Pc(21) int local21 = local15 | arg2 << 16;
		@Pc(34) long local34 = (long) local21;
		@Pc(41) Class12_Sub29_Sub1 local41 = (Class12_Sub29_Sub1) this.aClass68_30.method1917(local34);
		if (local41 != null) {
			return local41;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(59) Class116 local59 = Static553.method3274(this.aClass16_49, arg2, arg1);
			if (local59 == null) {
				return null;
			}
			local41 = local59.method3273();
			this.aClass68_30.method1916(local41, local34);
			if (arg0 != null) {
				arg0[0] -= local41.aByteArray59.length;
			}
			return local41;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIZ[I)Lclient!ke;")
	private Class12_Sub29_Sub1 method3619(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(15) int local15 = ((arg1 & 0x90000FFF) << 4 | arg1 >>> 12) ^ arg0;
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(38) Class12_Sub29_Sub1 local38 = (Class12_Sub29_Sub1) this.aClass68_30.method1917(local26);
		if (local38 != null) {
			return local38;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(57) Class12_Sub35 local57 = (Class12_Sub35) this.aClass68_29.method1917(local26);
			if (local57 == null) {
				local57 = Static311.method5005(this.aClass16_48, arg1, arg0);
				if (local57 == null) {
					return null;
				}
				this.aClass68_29.method1916(local57, local26);
			}
			local38 = local57.method5013(arg2);
			if (local38 == null) {
				return null;
			} else {
				local57.method7967();
				this.aClass68_30.method1916(local38, local26);
				return local38;
			}
		} else {
			return null;
		}
	}
}
