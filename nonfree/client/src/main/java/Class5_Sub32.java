import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class Class5_Sub32 extends Class5 {

	@OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
	public int anInt6213;

	@OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
	public int anInt6214;

	@OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
	public int anInt6215;

	@OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
	public int anInt6216;

	@OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
	public int anInt6217;

	@OriginalMember(owner = "client!nc", name = "p", descriptor = "I")
	public int anInt6218;

	@OriginalMember(owner = "client!nc", name = "q", descriptor = "I")
	public int anInt6219;

	@OriginalMember(owner = "client!nc", name = "r", descriptor = "I")
	public int anInt6220;

	@OriginalMember(owner = "client!nc", name = "s", descriptor = "I")
	public int anInt6221;

	@OriginalMember(owner = "client!nc", name = "t", descriptor = "I")
	public int anInt6222;

	@OriginalMember(owner = "client!nc", name = "v", descriptor = "I")
	public int anInt6224;

	@OriginalMember(owner = "client!nc", name = "x", descriptor = "I")
	public int anInt6225;

	@OriginalMember(owner = "client!nc", name = "y", descriptor = "I")
	public int anInt6226;

	@OriginalMember(owner = "client!nc", name = "A", descriptor = "I")
	public int anInt6227;

	@OriginalMember(owner = "client!nc", name = "E", descriptor = "I")
	public int anInt6229;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZLclient!qa;I)Lclient!r;")
	public Class36 method5177(@OriginalArg(1) Class62 arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = Static114.anIntArray215[this.anInt6226];
		@Pc(15) Class36 local15 = null;
		if (local13 == 0) {
			@Pc(127) Class15_Sub3 local127 = Static490.method6780(this.anInt6227, this.anInt6216, this.anInt6219);
			if (local127 instanceof Class15_Sub3_Sub1) {
				@Pc(133) Class15_Sub3_Sub1 local133 = (Class15_Sub3_Sub1) local127;
				if (local133.aClass15_Sub3_1 != null) {
					local15 = ((Interface10) local133.aClass15_Sub3_1).method6873(arg1, arg0);
				}
			}
		} else if (local13 == 1) {
			@Pc(97) Class15_Sub1 local97 = Static475.method6634(this.anInt6227, this.anInt6216, this.anInt6219);
			if (local97 instanceof Class15_Sub1_Sub1) {
				@Pc(103) Class15_Sub1_Sub1 local103 = (Class15_Sub1_Sub1) local97;
				if (local103.aClass15_Sub1_1 != null) {
					local15 = ((Interface10) local103.aClass15_Sub1_1).method6873(arg1, arg0);
				}
			}
		} else if (local13 == 2) {
			@Pc(42) Class15_Sub2 local42 = Static188.method3173(this.anInt6227, this.anInt6216, this.anInt6219, p.class);
			if (local42 instanceof Class15_Sub2_Sub4) {
				@Pc(48) Class15_Sub2_Sub4 local48 = (Class15_Sub2_Sub4) local42;
				if (local48.aClass15_Sub2_2 != null) {
					local15 = ((Interface10) local48.aClass15_Sub2_2).method6873(arg1, arg0);
				}
			}
		} else if (local13 == 3) {
			@Pc(71) Class15_Sub5 local71 = Static469.method6581(this.anInt6227, this.anInt6216, this.anInt6219);
			if (local71 instanceof Class15_Sub5_Sub3) {
				@Pc(77) Class15_Sub5_Sub3 local77 = (Class15_Sub5_Sub3) local71;
				if (local77.aClass15_Sub5_2 != null) {
					local15 = ((Interface10) local77.aClass15_Sub5_2).method6873(arg1, arg0);
				}
			}
		}
		return local15 == null ? null : local15.method7356((byte) 0, arg1, true);
	}
}
