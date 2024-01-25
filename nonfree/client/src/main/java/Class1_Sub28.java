import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class1_Sub28 extends Class1 {

	@OriginalMember(owner = "client!md", name = "k", descriptor = "I")
	public int anInt4381;

	@OriginalMember(owner = "client!md", name = "l", descriptor = "I")
	public int anInt4382;

	@OriginalMember(owner = "client!md", name = "m", descriptor = "I")
	public int anInt4383;

	@OriginalMember(owner = "client!md", name = "n", descriptor = "I")
	public int anInt4384;

	@OriginalMember(owner = "client!md", name = "p", descriptor = "I")
	public int anInt4386;

	@OriginalMember(owner = "client!md", name = "q", descriptor = "I")
	public int anInt4387;

	@OriginalMember(owner = "client!md", name = "s", descriptor = "I")
	public int anInt4389;

	@OriginalMember(owner = "client!md", name = "t", descriptor = "I")
	public int anInt4390;

	@OriginalMember(owner = "client!md", name = "u", descriptor = "I")
	public int anInt4391;

	@OriginalMember(owner = "client!md", name = "v", descriptor = "I")
	public int anInt4392;

	@OriginalMember(owner = "client!md", name = "w", descriptor = "I")
	public int anInt4393;

	@OriginalMember(owner = "client!md", name = "x", descriptor = "I")
	public int anInt4394;

	@OriginalMember(owner = "client!md", name = "y", descriptor = "I")
	public int anInt4395;

	@OriginalMember(owner = "client!md", name = "z", descriptor = "I")
	public int anInt4396;

	@OriginalMember(owner = "client!md", name = "A", descriptor = "I")
	public int anInt4397;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(BLclient!ya;I)Lclient!t;")
	public Class105 method3622(@OriginalArg(1) Class39 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = Static58.anIntArray93[this.anInt4381];
		if (local8 == 0) {
			@Pc(119) Class31_Sub3 local119 = Static110.method1983(this.anInt4396, this.anInt4382, this.anInt4384);
			if (local119 instanceof Class31_Sub3_Sub2) {
				@Pc(125) Class31_Sub3_Sub2 local125 = (Class31_Sub3_Sub2) local119;
				if (local125.aClass31_Sub3_1 != null) {
					return ((Interface5) local125.aClass31_Sub3_1).method5174(arg0, arg1);
				}
			}
		} else if (local8 == 1) {
			@Pc(28) Class31_Sub4 local28 = Static198.method3177(this.anInt4396, this.anInt4382, this.anInt4384);
			if (local28 instanceof Class31_Sub4_Sub2) {
				@Pc(34) Class31_Sub4_Sub2 local34 = (Class31_Sub4_Sub2) local28;
				if (local34.aClass31_Sub4_3 != null) {
					return ((Interface5) local34.aClass31_Sub4_3).method5174(arg0, arg1);
				}
			}
		} else if (local8 == 2) {
			@Pc(64) Class31_Sub2 local64 = Static357.method4896(this.anInt4396, this.anInt4382, this.anInt4384, ig.class);
			if (local64 instanceof Class31_Sub2_Sub5) {
				@Pc(70) Class31_Sub2_Sub5 local70 = (Class31_Sub2_Sub5) local64;
				if (local70.aClass31_Sub2_2 != null) {
					return ((Interface5) local70.aClass31_Sub2_2).method5174(arg0, arg1);
				}
			}
		} else if (local8 == 3) {
			@Pc(94) Class31_Sub1 local94 = Static393.method5258(this.anInt4396, this.anInt4382, this.anInt4384);
			if (local94 instanceof Class31_Sub1_Sub1) {
				@Pc(100) Class31_Sub1_Sub1 local100 = (Class31_Sub1_Sub1) local94;
				if (local100.aClass31_Sub1_1 != null) {
					return ((Interface5) local100.aClass31_Sub1_1).method5174(arg0, arg1);
				}
			}
		}
		return null;
	}
}
