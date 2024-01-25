import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!w")
public final class Class1_Sub44 extends Class1 {

	@OriginalMember(owner = "client!w", name = "l", descriptor = "I")
	public int anInt6133;

	@OriginalMember(owner = "client!w", name = "n", descriptor = "I")
	public int anInt6135;

	@OriginalMember(owner = "client!w", name = "o", descriptor = "I")
	public int anInt6136;

	@OriginalMember(owner = "client!w", name = "p", descriptor = "I")
	public int anInt6137;

	@OriginalMember(owner = "client!w", name = "q", descriptor = "I")
	public int anInt6138;

	@OriginalMember(owner = "client!w", name = "r", descriptor = "I")
	public int anInt6139;

	@OriginalMember(owner = "client!w", name = "t", descriptor = "I")
	public int anInt6140;

	@OriginalMember(owner = "client!w", name = "u", descriptor = "I")
	public int anInt6141;

	@OriginalMember(owner = "client!w", name = "w", descriptor = "I")
	public int anInt6143;

	@OriginalMember(owner = "client!w", name = "x", descriptor = "I")
	public int anInt6144;

	@OriginalMember(owner = "client!w", name = "z", descriptor = "I")
	public int anInt6145;

	@OriginalMember(owner = "client!w", name = "A", descriptor = "I")
	public int anInt6146;

	@OriginalMember(owner = "client!w", name = "B", descriptor = "I")
	public int anInt6147;

	@OriginalMember(owner = "client!w", name = "C", descriptor = "I")
	public int anInt6148;

	@OriginalMember(owner = "client!w", name = "G", descriptor = "I")
	public int anInt6151;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!tq;IZ)Lclient!ns;")
	public Class22 method5300(@OriginalArg(0) Class164 arg0, @OriginalArg(1) int arg1) {
		@Pc(17) int local17 = Static140.anIntArray722[this.anInt6144];
		if (local17 == 0) {
			@Pc(27) Class25_Sub5 local27 = Static186.method2676(this.anInt6147, this.anInt6145, this.anInt6137);
			if (local27 instanceof Class25_Sub5_Sub2) {
				@Pc(33) Class25_Sub5_Sub2 local33 = (Class25_Sub5_Sub2) local27;
				if (local33.aClass25_Sub5_3 != null) {
					return ((Interface6) local33.aClass25_Sub5_3).method5244(arg1, arg0);
				}
			}
		} else if (local17 == 1) {
			@Pc(55) Class25_Sub3 local55 = Static153.method2323(this.anInt6147, this.anInt6145, this.anInt6137);
			if (local55 instanceof Class25_Sub3_Sub1) {
				@Pc(61) Class25_Sub3_Sub1 local61 = (Class25_Sub3_Sub1) local55;
				if (local61.aClass25_Sub3_3 != null) {
					return ((Interface6) local61.aClass25_Sub3_3).method5244(arg1, arg0);
				}
			}
		} else if (local17 == 2) {
			@Pc(119) Class25_Sub1 local119 = Static67.method1123(this.anInt6147, this.anInt6145, this.anInt6137, ki.class);
			if (local119 instanceof Class25_Sub1_Sub5) {
				@Pc(125) Class25_Sub1_Sub5 local125 = (Class25_Sub1_Sub5) local119;
				if (local125.aClass25_Sub1_2 != null) {
					return ((Interface6) local125.aClass25_Sub1_2).method5244(arg1, arg0);
				}
			}
		} else if (local17 == 3) {
			@Pc(86) Class25_Sub4 local86 = Static91.method1355(this.anInt6147, this.anInt6145, this.anInt6137);
			if (local86 instanceof Class25_Sub4_Sub2) {
				@Pc(92) Class25_Sub4_Sub2 local92 = (Class25_Sub4_Sub2) local86;
				if (local92.aClass25_Sub4_1 != null) {
					return ((Interface6) local92.aClass25_Sub4_1).method5244(arg1, arg0);
				}
			}
		}
		return null;
	}
}
