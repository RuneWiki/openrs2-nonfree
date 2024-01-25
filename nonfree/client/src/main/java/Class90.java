import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!il")
public final class Class90 {

	@OriginalMember(owner = "client!il", name = "c", descriptor = "Lclient!va;")
	private final Class199 aClass199_13 = new Class199(256);

	@OriginalMember(owner = "client!il", name = "r", descriptor = "Lclient!va;")
	private final Class199 aClass199_14 = new Class199(256);

	@OriginalMember(owner = "client!il", name = "p", descriptor = "Lclient!tq;")
	private final Class191 aClass191_91;

	@OriginalMember(owner = "client!il", name = "e", descriptor = "Lclient!tq;")
	private final Class191 aClass191_90;

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Lclient!tq;Lclient!tq;)V")
	public Class90(@OriginalArg(0) Class191 arg0, @OriginalArg(1) Class191 arg1) {
		this.aClass191_91 = arg1;
		this.aClass191_90 = arg0;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(ZII[I)Lclient!vo;")
	private Class2_Sub12_Sub1 method2750(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(20) int local20 = arg0 ^ ((arg1 & 0xC0000FFF) << 4 | arg1 >>> 12);
		@Pc(26) int local26 = local20 | arg1 << 16;
		@Pc(29) long local29 = (long) local26;
		@Pc(36) Class2_Sub12_Sub1 local36 = (Class2_Sub12_Sub1) this.aClass199_14.method5751(local29);
		if (local36 != null) {
			return local36;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(54) Class134 local54 = Static367.method3758(this.aClass191_90, arg1, arg0);
			if (local54 == null) {
				return null;
			}
			local36 = local54.method3760();
			this.aClass199_14.method5749(local36, local29);
			if (arg2 != null) {
				arg2[0] -= local36.aByteArray90.length;
			}
			return local36;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(ZI[I)Lclient!vo;")
	public Class2_Sub12_Sub1 method2752(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass191_90.method5460() == 1) {
			return this.method2750(arg0, 0, arg1);
		} else if (this.aClass191_90.method5443(arg0) == 1) {
			return this.method2750(0, arg0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "([IZI)Lclient!vo;")
	public Class2_Sub12_Sub1 method2756(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass191_91.method5460() == 1) {
			return this.method2758(arg1, arg0, 0);
		} else if (this.aClass191_91.method5443(arg1) == 1) {
			return this.method2758(0, arg0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(II[II)Lclient!vo;")
	private Class2_Sub12_Sub1 method2758(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = (arg2 >>> 12 | arg2 << 4 & 0xFFF1) ^ arg0;
		@Pc(21) int local21 = local15 | arg2 << 16;
		@Pc(34) long local34 = (long) local21 ^ 0x100000000L;
		@Pc(41) Class2_Sub12_Sub1 local41 = (Class2_Sub12_Sub1) this.aClass199_14.method5751(local34);
		if (local41 != null) {
			return local41;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(63) Class2_Sub43 local63 = (Class2_Sub43) this.aClass199_13.method5751(local34);
			if (local63 == null) {
				local63 = Static334.method5791(this.aClass191_91, arg2, arg0);
				if (local63 == null) {
					return null;
				}
				this.aClass199_13.method5749(local63, local34);
			}
			local41 = local63.method5800(arg1);
			if (local41 == null) {
				return null;
			} else {
				local63.method5945();
				this.aClass199_14.method5749(local41, local34);
				return local41;
			}
		} else {
			return null;
		}
	}
}
