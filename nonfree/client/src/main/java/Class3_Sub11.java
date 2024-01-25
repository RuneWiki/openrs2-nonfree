import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cu")
public final class Class3_Sub11 extends Class3 {

	@OriginalMember(owner = "client!cu", name = "p", descriptor = "I")
	public int anInt1451;

	@OriginalMember(owner = "client!cu", name = "q", descriptor = "I")
	public int anInt1452;

	@OriginalMember(owner = "client!cu", name = "r", descriptor = "I")
	public int anInt1453;

	@OriginalMember(owner = "client!cu", name = "s", descriptor = "I")
	public int anInt1454;

	@OriginalMember(owner = "client!cu", name = "t", descriptor = "I")
	public int anInt1455;

	@OriginalMember(owner = "client!cu", name = "u", descriptor = "I")
	public int anInt1456;

	@OriginalMember(owner = "client!cu", name = "v", descriptor = "I")
	public int anInt1457;

	@OriginalMember(owner = "client!cu", name = "x", descriptor = "I")
	public int anInt1459;

	@OriginalMember(owner = "client!cu", name = "y", descriptor = "I")
	public int anInt1460;

	@OriginalMember(owner = "client!cu", name = "A", descriptor = "I")
	public int anInt1461;

	@OriginalMember(owner = "client!cu", name = "B", descriptor = "I")
	public int anInt1462;

	@OriginalMember(owner = "client!cu", name = "C", descriptor = "I")
	public int anInt1463;

	@OriginalMember(owner = "client!cu", name = "E", descriptor = "I")
	public int anInt1465;

	@OriginalMember(owner = "client!cu", name = "F", descriptor = "I")
	public int anInt1466;

	@OriginalMember(owner = "client!cu", name = "G", descriptor = "I")
	public int anInt1467;

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(ILclient!qa;B)Lclient!c;")
	public Class31 method1210(@OriginalArg(0) int arg0, @OriginalArg(1) Class75 arg1) {
		@Pc(16) int local16 = Static188.anIntArray293[this.anInt1461];
		if (local16 == 0) {
			@Pc(26) Class1_Sub5 local26 = Static391.method5292(this.anInt1465, this.anInt1457, this.anInt1459);
			if (local26 instanceof Class1_Sub5_Sub1) {
				@Pc(32) Class1_Sub5_Sub1 local32 = (Class1_Sub5_Sub1) local26;
				if (local32.aClass1_Sub5_1 != null) {
					return ((Interface12) local32.aClass1_Sub5_1).method5850(arg0, arg1);
				}
			}
		} else if (local16 == 1) {
			@Pc(122) Class1_Sub1 local122 = Static35.method4618(this.anInt1465, this.anInt1457, this.anInt1459);
			if (local122 instanceof Class1_Sub1_Sub2) {
				@Pc(128) Class1_Sub1_Sub2 local128 = (Class1_Sub1_Sub2) local122;
				if (local128.aClass1_Sub1_1 != null) {
					return ((Interface12) local128.aClass1_Sub1_1).method5850(arg0, arg1);
				}
			}
		} else if (local16 == 2) {
			@Pc(97) Class1_Sub3 local97 = Static372.method1267(this.anInt1465, this.anInt1457, this.anInt1459, wk.class);
			if (local97 instanceof Class1_Sub3_Sub1) {
				@Pc(103) Class1_Sub3_Sub1 local103 = (Class1_Sub3_Sub1) local97;
				if (local103.aClass1_Sub3_1 != null) {
					return ((Interface12) local103.aClass1_Sub3_1).method5850(arg0, arg1);
				}
			}
		} else if (local16 == 3) {
			@Pc(64) Class1_Sub2 local64 = Static11.method399(this.anInt1465, this.anInt1457, this.anInt1459);
			if (local64 instanceof Class1_Sub2_Sub3) {
				@Pc(70) Class1_Sub2_Sub3 local70 = (Class1_Sub2_Sub3) local64;
				if (local70.aClass1_Sub2_2 != null) {
					return ((Interface12) local70.aClass1_Sub2_2).method5850(arg0, arg1);
				}
			}
		}
		return null;
	}
}
