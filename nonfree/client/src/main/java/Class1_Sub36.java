import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class1_Sub36 extends Class1 {

	@OriginalMember(owner = "client!rd", name = "n", descriptor = "I")
	public int anInt6194;

	@OriginalMember(owner = "client!rd", name = "o", descriptor = "I")
	public int anInt6195;

	@OriginalMember(owner = "client!rd", name = "p", descriptor = "I")
	public int anInt6196;

	@OriginalMember(owner = "client!rd", name = "r", descriptor = "I")
	public int anInt6197;

	@OriginalMember(owner = "client!rd", name = "t", descriptor = "I")
	public int anInt6199;

	@OriginalMember(owner = "client!rd", name = "u", descriptor = "I")
	public int anInt6200;

	@OriginalMember(owner = "client!rd", name = "v", descriptor = "I")
	public int anInt6201;

	@OriginalMember(owner = "client!rd", name = "w", descriptor = "I")
	public int anInt6202;

	@OriginalMember(owner = "client!rd", name = "x", descriptor = "I")
	public int anInt6203;

	@OriginalMember(owner = "client!rd", name = "y", descriptor = "I")
	public int anInt6204;

	@OriginalMember(owner = "client!rd", name = "z", descriptor = "I")
	public int anInt6205;

	@OriginalMember(owner = "client!rd", name = "B", descriptor = "I")
	public int anInt6206;

	@OriginalMember(owner = "client!rd", name = "E", descriptor = "I")
	public int anInt6208;

	@OriginalMember(owner = "client!rd", name = "F", descriptor = "I")
	public int anInt6209;

	@OriginalMember(owner = "client!rd", name = "H", descriptor = "I")
	public int anInt6210;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!qa;II)Lclient!c;")
	public Class37 method4907(@OriginalArg(0) Class121 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = Static449.anIntArray583[this.anInt6209];
		if (local8 == 0) {
			@Pc(115) Class47_Sub2 local115 = Static208.method3165(this.anInt6195, this.anInt6197, this.anInt6205);
			if (local115 instanceof Class47_Sub2_Sub2) {
				@Pc(121) Class47_Sub2_Sub2 local121 = (Class47_Sub2_Sub2) local115;
				if (local121.aClass47_Sub2_3 != null) {
					return ((Interface11) local121.aClass47_Sub2_3).method5746(arg1, arg0);
				}
			}
		} else if (local8 == 1) {
			@Pc(26) Class47_Sub4 local26 = Static170.method2638(this.anInt6195, this.anInt6197, this.anInt6205);
			if (local26 instanceof Class47_Sub4_Sub2) {
				@Pc(32) Class47_Sub4_Sub2 local32 = (Class47_Sub4_Sub2) local26;
				if (local32.aClass47_Sub4_3 != null) {
					return ((Interface11) local32.aClass47_Sub4_3).method5746(arg1, arg0);
				}
			}
		} else if (local8 == 2) {
			@Pc(90) Class47_Sub1 local90 = Static286.method3918(this.anInt6195, this.anInt6197, this.anInt6205, rq.class);
			if (local90 instanceof Class47_Sub1_Sub4) {
				@Pc(96) Class47_Sub1_Sub4 local96 = (Class47_Sub1_Sub4) local90;
				if (local96.aClass47_Sub1_1 != null) {
					return ((Interface11) local96.aClass47_Sub1_1).method5746(arg1, arg0);
				}
			}
		} else if (local8 == 3) {
			@Pc(57) Class47_Sub5 local57 = Static112.method1764(this.anInt6195, this.anInt6197, this.anInt6205);
			if (local57 instanceof Class47_Sub5_Sub3) {
				@Pc(63) Class47_Sub5_Sub3 local63 = (Class47_Sub5_Sub3) local57;
				if (local63.aClass47_Sub5_2 != null) {
					return ((Interface11) local63.aClass47_Sub5_2).method5746(arg1, arg0);
				}
			}
		}
		return null;
	}
}
