import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cl")
public final class Class2_Sub6 extends Class2 {

	@OriginalMember(owner = "client!cl", name = "B", descriptor = "I")
	public static int anInt1105 = 20;

	@OriginalMember(owner = "client!cl", name = "u", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_26 = new Class79(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");

	@OriginalMember(owner = "client!cl", name = "L", descriptor = "I")
	public static int anInt1114 = 0;

	@OriginalMember(owner = "client!cl", name = "M", descriptor = "[Z")
	public static final boolean[] aBooleanArray11 = new boolean[8];

	@OriginalMember(owner = "client!cl", name = "v", descriptor = "I")
	public int anInt1099;

	@OriginalMember(owner = "client!cl", name = "w", descriptor = "I")
	public int anInt1100;

	@OriginalMember(owner = "client!cl", name = "x", descriptor = "I")
	public int anInt1101;

	@OriginalMember(owner = "client!cl", name = "z", descriptor = "I")
	public int anInt1103;

	@OriginalMember(owner = "client!cl", name = "C", descriptor = "I")
	public int anInt1106;

	@OriginalMember(owner = "client!cl", name = "D", descriptor = "I")
	public int anInt1107;

	@OriginalMember(owner = "client!cl", name = "E", descriptor = "I")
	public int anInt1108;

	@OriginalMember(owner = "client!cl", name = "F", descriptor = "I")
	public int anInt1109;

	@OriginalMember(owner = "client!cl", name = "G", descriptor = "I")
	public int anInt1110;

	@OriginalMember(owner = "client!cl", name = "H", descriptor = "I")
	public int anInt1111;

	@OriginalMember(owner = "client!cl", name = "I", descriptor = "I")
	public int anInt1112;

	@OriginalMember(owner = "client!cl", name = "J", descriptor = "I")
	public int anInt1113;

	@OriginalMember(owner = "client!cl", name = "N", descriptor = "I")
	public int anInt1115;

	@OriginalMember(owner = "client!cl", name = "O", descriptor = "I")
	public int anInt1116;

	@OriginalMember(owner = "client!cl", name = "P", descriptor = "I")
	public int anInt1117;

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lclient!wm;II)Lclient!gn;", line = 167)
	public Class31 method1360(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = Class2_Sub3_Sub16.anIntArray174[this.anInt1115];
		if (local13 == 0) {
			@Pc(119) Class11_Sub1 local119 = Static12.method283(this.anInt1109, this.anInt1116, this.anInt1108);
			if (local119 instanceof Class11_Sub1_Sub1) {
				@Pc(125) Class11_Sub1_Sub1 local125 = (Class11_Sub1_Sub1) local119;
				if (local125.aClass11_Sub1_1 != null) {
					return ((Interface6) local125.aClass11_Sub1_1).method6089(arg1, arg0);
				}
			}
		} else if (local13 == 1) {
			@Pc(28) Class11_Sub3 local28 = Static27.method893(this.anInt1109, this.anInt1116, this.anInt1108);
			if (local28 instanceof Class11_Sub3_Sub1) {
				@Pc(34) Class11_Sub3_Sub1 local34 = (Class11_Sub3_Sub1) local28;
				if (local34.aClass11_Sub3_1 != null) {
					return ((Interface6) local34.aClass11_Sub3_1).method6089(arg1, arg0);
				}
			}
		} else if (local13 == 2) {
			@Pc(94) Class11_Sub5 local94 = Static98.method2209(this.anInt1109, this.anInt1116, this.anInt1108, id.class);
			if (local94 instanceof Class11_Sub5_Sub6) {
				@Pc(100) Class11_Sub5_Sub6 local100 = (Class11_Sub5_Sub6) local94;
				if (local100.aClass11_Sub5_2 != null) {
					return ((Interface6) local100.aClass11_Sub5_2).method6089(arg1, arg0);
				}
			}
		} else if (local13 == 3) {
			@Pc(61) Class11_Sub2 local61 = Static25.method865(this.anInt1109, this.anInt1116, this.anInt1108);
			if (local61 instanceof Class11_Sub2_Sub2) {
				@Pc(67) Class11_Sub2_Sub2 local67 = (Class11_Sub2_Sub2) local61;
				if (local67.aClass11_Sub2_1 != null) {
					return ((Interface6) local67.aClass11_Sub2_1).method6089(arg1, arg0);
				}
			}
		}
		return null;
	}
}
