import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class39 {

	@OriginalMember(owner = "client!jb", name = "h", descriptor = "Lclient!id;")
	private final Class35 aClass35_27 = new Class35(256);

	@OriginalMember(owner = "client!jb", name = "o", descriptor = "Lclient!id;")
	private final Class35 aClass35_28 = new Class35(256);

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "Lclient!jc;")
	private final Class40 aClass40_21;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "Lclient!jc;")
	private final Class40 aClass40_20;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lclient!jc;Lclient!jc;)V")
	public Class39(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class40 arg1) {
		this.aClass40_21 = arg0;
		this.aClass40_20 = arg1;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(III[I)Lclient!nc;")
	private Class2_Sub18_Sub1 method1436(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(15) int local15 = arg1 ^ ((arg0 & 0x10000FFF) << 4 | arg0 >>> 12);
		@Pc(26) int local26 = local15 | arg0 << 16;
		@Pc(31) long local31 = (long) local26 ^ 0x100000000L;
		@Pc(40) Class2_Sub18_Sub1 local40 = (Class2_Sub18_Sub1) this.aClass35_28.method1354(local31);
		if (local40 != null) {
			return local40;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(64) Class2_Sub1 local64 = (Class2_Sub1) this.aClass35_27.method1354(local31);
			if (local64 == null) {
				local64 = Static2.method15(this.aClass40_20, arg0, arg1);
				if (local64 == null) {
					return null;
				}
				this.aClass35_27.method1362(local64, local31);
			}
			local40 = local64.method18(arg2);
			if (local40 == null) {
				return null;
			} else {
				local64.method2888();
				this.aClass35_28.method1362(local40, local31);
				return local40;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I[II)Lclient!nc;")
	public Class2_Sub18_Sub1 method1438(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.aClass40_20.method1789() == 1) {
			return this.method1436(0, arg0, arg1);
		} else if (this.aClass40_20.method1785(arg0) == 1) {
			return this.method1436(arg0, 0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(I[II)Lclient!nc;")
	public Class2_Sub18_Sub1 method1439(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.aClass40_21.method1789() == 1) {
			return this.method1441(arg1, arg0, 0);
		} else if (this.aClass40_21.method1785(arg0) == 1) {
			return this.method1441(arg1, 0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "([IIII)Lclient!nc;")
	private Class2_Sub18_Sub1 method1441(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = (arg2 << 4 & 0xFFF5 | arg2 >>> 12) ^ arg1;
		@Pc(21) int local21 = local15 | arg2 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class2_Sub18_Sub1 local31 = (Class2_Sub18_Sub1) this.aClass35_28.method1354(local24);
		if (local31 != null) {
			return local31;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(49) Class38 local49 = Static183.method1411(this.aClass40_21, arg2, arg1);
			if (local49 == null) {
				return null;
			}
			local31 = local49.method1409();
			this.aClass35_28.method1362(local31, local24);
			if (arg0 != null) {
				arg0[0] -= local31.aByteArray36.length;
			}
			return local31;
		} else {
			return null;
		}
	}
}
