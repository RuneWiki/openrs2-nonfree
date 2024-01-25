import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class Class2_Sub42 extends Class2 {

	@OriginalMember(owner = "client!vd", name = "q", descriptor = "I")
	public int anInt6005;

	@OriginalMember(owner = "client!vd", name = "r", descriptor = "I")
	public int anInt6006;

	@OriginalMember(owner = "client!vd", name = "s", descriptor = "I")
	public int anInt6007;

	@OriginalMember(owner = "client!vd", name = "t", descriptor = "I")
	public int anInt6008;

	@OriginalMember(owner = "client!vd", name = "w", descriptor = "I")
	public int anInt6011;

	@OriginalMember(owner = "client!vd", name = "A", descriptor = "I")
	public int anInt6014;

	@OriginalMember(owner = "client!vd", name = "B", descriptor = "I")
	public int anInt6015;

	@OriginalMember(owner = "client!vd", name = "C", descriptor = "I")
	public int anInt6016;

	@OriginalMember(owner = "client!vd", name = "D", descriptor = "I")
	public int anInt6017;

	@OriginalMember(owner = "client!vd", name = "E", descriptor = "I")
	public int anInt6018;

	@OriginalMember(owner = "client!vd", name = "F", descriptor = "I")
	public int anInt6019;

	@OriginalMember(owner = "client!vd", name = "H", descriptor = "I")
	public int anInt6021;

	@OriginalMember(owner = "client!vd", name = "J", descriptor = "I")
	public int anInt6023;

	@OriginalMember(owner = "client!vd", name = "K", descriptor = "I")
	public int anInt6024;

	@OriginalMember(owner = "client!vd", name = "N", descriptor = "I")
	public int anInt6025;

	static {
		new Class32("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILclient!vc;I)Lclient!n;")
	public Class66 method5243(@OriginalArg(1) Class63 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = Static181.anIntArray1303[this.anInt6017];
		if (local8 == 0) {
			@Pc(23) Class1_Sub1 local23 = Static368.method4614(this.anInt6018, this.anInt6019, this.anInt6005);
			if (local23 instanceof Class1_Sub1_Sub3) {
				@Pc(29) Class1_Sub1_Sub3 local29 = (Class1_Sub1_Sub3) local23;
				if (local29.aClass1_Sub1_1 != null) {
					return ((Interface2) local29.aClass1_Sub1_1).method5652(arg1, arg0);
				}
			}
		} else if (local8 == 1) {
			@Pc(117) Class1_Sub2 local117 = Static95.method5549(this.anInt6018, this.anInt6019, this.anInt6005);
			if (local117 instanceof Class1_Sub2_Sub1) {
				@Pc(123) Class1_Sub2_Sub1 local123 = (Class1_Sub2_Sub1) local117;
				if (local123.aClass1_Sub2_1 != null) {
					return ((Interface2) local123.aClass1_Sub2_1).method5652(arg1, arg0);
				}
			}
		} else if (local8 == 2) {
			@Pc(64) Class1_Sub5 local64 = Static292.method4418(this.anInt6018, this.anInt6019, this.anInt6005, dc.class);
			if (local64 instanceof Class1_Sub5_Sub3) {
				@Pc(70) Class1_Sub5_Sub3 local70 = (Class1_Sub5_Sub3) local64;
				if (local70.aClass1_Sub5_2 != null) {
					return ((Interface2) local70.aClass1_Sub5_2).method5652(arg1, arg0);
				}
			}
		} else if (local8 == 3) {
			@Pc(92) Class1_Sub3 local92 = Static102.method2138(this.anInt6018, this.anInt6019, this.anInt6005);
			if (local92 instanceof Class1_Sub3_Sub3) {
				@Pc(98) Class1_Sub3_Sub3 local98 = (Class1_Sub3_Sub3) local92;
				if (local98.aClass1_Sub3_1 != null) {
					return ((Interface2) local98.aClass1_Sub3_1).method5652(arg1, arg0);
				}
			}
		}
		return null;
	}
}
