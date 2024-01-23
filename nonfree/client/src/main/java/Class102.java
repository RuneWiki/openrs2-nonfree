import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ll")
public final class Class102 {

	@OriginalMember(owner = "client!ll", name = "h", descriptor = "Lclient!lb;")
	private Class97 aClass97_13 = new Class97(256);

	@OriginalMember(owner = "client!ll", name = "p", descriptor = "Lclient!lb;")
	private Class97 aClass97_14 = new Class97(256);

	@OriginalMember(owner = "client!ll", name = "l", descriptor = "Lclient!lc;")
	private Class98 aClass98_94;

	@OriginalMember(owner = "client!ll", name = "i", descriptor = "Lclient!lc;")
	private Class98 aClass98_93;

	@OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Lclient!lc;Lclient!lc;)V")
	public Class102(@OriginalArg(0) Class98 arg0, @OriginalArg(1) Class98 arg1) {
		this.aClass98_94 = arg0;
		this.aClass98_93 = arg1;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIB[I)Lclient!gl;")
	private Class4_Sub15_Sub1 method2479(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(15) int local15 = ((arg1 & 0xC0000FFF) << 4 | arg1 >>> 12) ^ arg0;
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(41) Class4_Sub15_Sub1 local41 = (Class4_Sub15_Sub1) this.aClass97_14.method2360(local26);
		if (local41 != null) {
			return local41;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(63) Class4_Sub4 local63 = (Class4_Sub4) this.aClass97_13.method2360(local26);
			if (local63 == null) {
				local63 = Static9.method164(this.aClass98_93, arg1, arg0);
				if (local63 == null) {
					return null;
				}
				this.aClass97_13.method2364(local63, local26);
			}
			local41 = local63.method162(arg2);
			if (local41 == null) {
				return null;
			} else {
				local63.method4391();
				this.aClass97_14.method2364(local41, local26);
				return local41;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(I[II)Lclient!gl;")
	public Class4_Sub15_Sub1 method2480(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.aClass98_94.method2380() == 1) {
			return this.method2481(arg1, arg0, 0);
		} else if (this.aClass98_94.method2394(arg0) == 1) {
			return this.method2481(arg1, 0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "([IIII)Lclient!gl;")
	private Class4_Sub15_Sub1 method2481(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(20) int local20 = ((arg2 & 0xFFF) << 4 | arg2 >>> 12) ^ arg1;
		@Pc(26) int local26 = local20 | arg2 << 16;
		@Pc(29) long local29 = (long) local26;
		@Pc(36) Class4_Sub15_Sub1 local36 = (Class4_Sub15_Sub1) this.aClass97_14.method2360(local29);
		if (local36 != null) {
			return local36;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(59) Class60 local59 = Static303.method1647(this.aClass98_94, arg2, arg1);
			if (local59 == null) {
				return null;
			}
			local36 = local59.method1646();
			this.aClass97_14.method2364(local36, local29);
			if (arg0 != null) {
				arg0[0] -= local36.aByteArray26.length;
			}
			return local36;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(II[I)Lclient!gl;")
	public Class4_Sub15_Sub1 method2482(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass98_93.method2380() == 1) {
			return this.method2479(arg0, 0, arg1);
		} else if (this.aClass98_93.method2394(arg0) == 1) {
			return this.method2479(0, arg0, arg1);
		} else {
			throw new RuntimeException();
		}
	}
}
