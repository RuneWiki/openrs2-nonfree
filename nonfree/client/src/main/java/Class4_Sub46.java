import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class4_Sub46 extends Class4 {

	@OriginalMember(owner = "client!vc", name = "o", descriptor = "I")
	public int anInt7371;

	@OriginalMember(owner = "client!vc", name = "p", descriptor = "I")
	public int anInt7372;

	@OriginalMember(owner = "client!vc", name = "r", descriptor = "I")
	public int anInt7373;

	@OriginalMember(owner = "client!vc", name = "s", descriptor = "I")
	public int anInt7374;

	@OriginalMember(owner = "client!vc", name = "v", descriptor = "I")
	public int anInt7376;

	@OriginalMember(owner = "client!vc", name = "w", descriptor = "I")
	public int anInt7377;

	@OriginalMember(owner = "client!vc", name = "y", descriptor = "I")
	public int anInt7379;

	@OriginalMember(owner = "client!vc", name = "z", descriptor = "I")
	public int anInt7380;

	@OriginalMember(owner = "client!vc", name = "A", descriptor = "I")
	public int anInt7381;

	@OriginalMember(owner = "client!vc", name = "C", descriptor = "I")
	public int anInt7382;

	@OriginalMember(owner = "client!vc", name = "D", descriptor = "I")
	public int anInt7383;

	@OriginalMember(owner = "client!vc", name = "E", descriptor = "I")
	public int anInt7384;

	@OriginalMember(owner = "client!vc", name = "G", descriptor = "I")
	public int anInt7386;

	@OriginalMember(owner = "client!vc", name = "H", descriptor = "I")
	public int anInt7387;

	@OriginalMember(owner = "client!vc", name = "J", descriptor = "I")
	public int anInt7388;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!qa;II)Lclient!ka;")
	public Class57 method5933(@OriginalArg(0) Class30 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = Static86.anIntArray170[this.anInt7371];
		if (local8 == 0) {
			@Pc(117) Class11_Sub2 local117 = Static278.method4397(this.anInt7382, this.anInt7372, this.anInt7376);
			if (local117 instanceof Class11_Sub2_Sub2) {
				@Pc(123) Class11_Sub2_Sub2 local123 = (Class11_Sub2_Sub2) local117;
				if (local123.aClass11_Sub2_3 != null) {
					return ((Interface12) local123.aClass11_Sub2_3).method6315(arg0, arg1);
				}
			}
		} else if (local8 == 1) {
			@Pc(92) Class11_Sub3 local92 = Static177.method3233(this.anInt7382, this.anInt7372, this.anInt7376);
			if (local92 instanceof Class11_Sub3_Sub2) {
				@Pc(98) Class11_Sub3_Sub2 local98 = (Class11_Sub3_Sub2) local92;
				if (local98.aClass11_Sub3_3 != null) {
					return ((Interface12) local98.aClass11_Sub3_3).method6315(arg0, arg1);
				}
			}
		} else if (local8 == 2) {
			@Pc(37) Class11_Sub5 local37 = Static422.method5870(this.anInt7382, this.anInt7372, this.anInt7376, wo.class);
			if (local37 instanceof Class11_Sub5_Sub5) {
				@Pc(43) Class11_Sub5_Sub5 local43 = (Class11_Sub5_Sub5) local37;
				if (local43.aClass11_Sub5_2 != null) {
					return ((Interface12) local43.aClass11_Sub5_2).method6315(arg0, arg1);
				}
			}
		} else if (local8 == 3) {
			@Pc(67) Class11_Sub1 local67 = Static241.method4021(this.anInt7382, this.anInt7372, this.anInt7376);
			if (local67 instanceof Class11_Sub1_Sub2) {
				@Pc(73) Class11_Sub1_Sub2 local73 = (Class11_Sub1_Sub2) local67;
				if (local73.aClass11_Sub1_1 != null) {
					return ((Interface12) local73.aClass11_Sub1_1).method6315(arg0, arg1);
				}
			}
		}
		return null;
	}
}
