import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class24 {

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "Lclient!dh;")
	private final Class18 aClass18_3 = new Class18(256);

	@OriginalMember(owner = "client!fc", name = "t", descriptor = "Lclient!dh;")
	private final Class18 aClass18_4 = new Class18(256);

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "Lclient!kh;")
	private final Class29 aClass29_22;

	@OriginalMember(owner = "client!fc", name = "g", descriptor = "Lclient!kh;")
	private final Class29 aClass29_23;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lclient!kh;Lclient!kh;)V")
	public Class24(@OriginalArg(0) Class29 arg0, @OriginalArg(1) Class29 arg1) {
		this.aClass29_22 = arg0;
		this.aClass29_23 = arg1;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "([IBI)Lclient!jc;")
	public Class2_Sub10_Sub1 method873(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass29_23.method1027() == 1) {
			return this.method876(0, arg1, arg0);
		} else if (this.aClass29_23.method1039(arg1) == 1) {
			return this.method876(arg1, 0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I[IZ)Lclient!jc;")
	public Class2_Sub10_Sub1 method874(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.aClass29_22.method1027() == 1) {
			return this.method878(arg0, arg1, 0);
		} else if (this.aClass29_22.method1039(arg0) == 1) {
			return this.method878(0, arg1, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(III[I)Lclient!jc;")
	private Class2_Sub10_Sub1 method876(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(15) int local15 = arg1 ^ (arg0 << 4 & 0xFFFD | arg0 >>> 12);
		@Pc(21) int local21 = local15 | arg0 << 16;
		@Pc(35) long local35 = (long) local21 ^ 0x100000000L;
		@Pc(42) Class2_Sub10_Sub1 local42 = (Class2_Sub10_Sub1) this.aClass18_4.method683(local35);
		if (local42 != null) {
			return local42;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(64) Class2_Sub16 local64 = (Class2_Sub16) this.aClass18_3.method683(local35);
			if (local64 == null) {
				local64 = Static112.method1778(this.aClass29_23, arg0, arg1);
				if (local64 == null) {
					return null;
				}
				this.aClass18_3.method685(local35, local64);
			}
			local42 = local64.method1775(arg2);
			if (local42 == null) {
				return null;
			} else {
				local64.method2705();
				this.aClass18_4.method685(local35, local42);
				return local42;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I[III)Lclient!jc;")
	private Class2_Sub10_Sub1 method878(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		@Pc(20) int local20 = arg0 ^ (arg2 >>> 12 | arg2 << 4 & 0xFFFC);
		@Pc(26) int local26 = local20 | arg2 << 16;
		@Pc(29) long local29 = (long) local26;
		@Pc(36) Class2_Sub10_Sub1 local36 = (Class2_Sub10_Sub1) this.aClass18_4.method683(local29);
		if (local36 != null) {
			return local36;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(57) Class57 local57 = Static184.method1761(this.aClass29_22, arg2, arg0);
			if (local57 == null) {
				return null;
			}
			local36 = local57.method1758();
			this.aClass18_4.method685(local29, local36);
			if (arg1 != null) {
				arg1[0] -= local36.aByteArray21.length;
			}
			return local36;
		} else {
			return null;
		}
	}
}
