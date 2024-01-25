import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cv")
public final class Class6_Sub14 extends Class6 {

	@OriginalMember(owner = "client!cv", name = "m", descriptor = "I")
	public int anInt1900;

	@OriginalMember(owner = "client!cv", name = "n", descriptor = "I")
	public int anInt1901;

	@OriginalMember(owner = "client!cv", name = "o", descriptor = "I")
	public int anInt1902;

	@OriginalMember(owner = "client!cv", name = "p", descriptor = "I")
	public int anInt1903;

	@OriginalMember(owner = "client!cv", name = "q", descriptor = "I")
	public int anInt1904;

	@OriginalMember(owner = "client!cv", name = "t", descriptor = "I")
	public int anInt1907;

	@OriginalMember(owner = "client!cv", name = "u", descriptor = "I")
	public int anInt1908;

	@OriginalMember(owner = "client!cv", name = "w", descriptor = "I")
	public int anInt1910;

	@OriginalMember(owner = "client!cv", name = "x", descriptor = "I")
	public int anInt1911;

	@OriginalMember(owner = "client!cv", name = "z", descriptor = "I")
	public int anInt1913;

	@OriginalMember(owner = "client!cv", name = "A", descriptor = "I")
	public int anInt1914;

	@OriginalMember(owner = "client!cv", name = "C", descriptor = "I")
	public int anInt1915;

	@OriginalMember(owner = "client!cv", name = "D", descriptor = "I")
	public int anInt1916;

	@OriginalMember(owner = "client!cv", name = "F", descriptor = "I")
	public int anInt1918;

	@OriginalMember(owner = "client!cv", name = "I", descriptor = "I")
	public int anInt1920;

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(ZLclient!oa;I)Lclient!ba;")
	public Class23 method1703(@OriginalArg(1) Class9 arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = Static476.anIntArray768[this.anInt1907];
		@Pc(16) Class23 local16 = null;
		if (local14 == 0) {
			@Pc(125) Class11_Sub4 local125 = Static298.method4853(this.anInt1915, this.anInt1918, this.anInt1903);
			if (local125 instanceof Class11_Sub4_Sub3) {
				@Pc(131) Class11_Sub4_Sub3 local131 = (Class11_Sub4_Sub3) local125;
				if (local131.aClass11_Sub4_1 != null) {
					local16 = ((Interface17) local131.aClass11_Sub4_1).method8117(arg1, arg0);
				}
			}
		} else if (local14 == 1) {
			@Pc(99) Class11_Sub3 local99 = Static541.method7782(this.anInt1915, this.anInt1918, this.anInt1903);
			if (local99 instanceof Class11_Sub3_Sub3) {
				@Pc(105) Class11_Sub3_Sub3 local105 = (Class11_Sub3_Sub3) local99;
				if (local105.aClass11_Sub3_3 != null) {
					local16 = ((Interface17) local105.aClass11_Sub3_3).method8117(arg1, arg0);
				}
			}
		} else if (local14 == 2) {
			@Pc(42) Class11_Sub1 local42 = Static178.method3532(this.anInt1915, this.anInt1918, this.anInt1903, ql.class);
			if (local42 instanceof Class11_Sub1_Sub4) {
				@Pc(48) Class11_Sub1_Sub4 local48 = (Class11_Sub1_Sub4) local42;
				if (local48.aClass11_Sub1_1 != null) {
					local16 = ((Interface17) local48.aClass11_Sub1_1).method8117(arg1, arg0);
				}
			}
		} else if (local14 == 3) {
			@Pc(73) Class11_Sub5 local73 = Static216.method3980(this.anInt1915, this.anInt1918, this.anInt1903);
			if (local73 instanceof Class11_Sub5_Sub2) {
				@Pc(79) Class11_Sub5_Sub2 local79 = (Class11_Sub5_Sub2) local73;
				if (local79.aClass11_Sub5_1 != null) {
					local16 = ((Interface17) local79.aClass11_Sub5_1).method8117(arg1, arg0);
				}
			}
		}
		return local16 == null ? null : local16.method7068((byte) 0, arg1, true);
	}
}
