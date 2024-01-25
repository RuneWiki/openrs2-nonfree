import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gh")
public final class Class125 {

	@OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
	public int anInt3479;

	@OriginalMember(owner = "client!gh", name = "g", descriptor = "[Lclient!an;")
	public Interface2[] anInterface2Array1;

	@OriginalMember(owner = "client!gh", name = "i", descriptor = "I")
	public int anInt3483;

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILclient!ek;Lclient!kq;)Lclient!an;")
	private Interface2 method2766(@OriginalArg(1) Class4_Sub13 arg0, @OriginalArg(2) Class184 arg1) {
		if (arg1 == Static462.aClass184_12) {
			return Static278.method4470(arg0);
		} else if (arg1 == Static257.aClass184_8) {
			return Static377.method5886(arg0);
		} else if (arg1 == Static418.aClass184_11) {
			return Static248.method3972(arg0);
		} else if (arg1 == Static470.aClass184_13) {
			return Static560.method7940(arg0);
		} else if (Static201.aClass184_6 == arg1) {
			return Static577.method8119(arg0);
		} else if (arg1 == Static360.aClass184_10) {
			return Static312.method4932(arg0);
		} else if (arg1 == Static317.aClass184_9) {
			return Static489.method5436(arg0);
		} else if (Static198.aClass184_5 == arg1) {
			return Static290.method4713(arg0);
		} else if (arg1 == Static542.aClass184_14) {
			return Static480.method8072(arg0);
		} else if (Static132.aClass184_3 == arg1) {
			return Static100.method1929(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(BLclient!ek;)V")
	public void method2768(@OriginalArg(1) Class4_Sub13 arg0) {
		this.anInt3479 = arg0.method7013();
		this.anInt3483 = arg0.method7054();
		this.anInterface2Array1 = new Interface2[arg0.method7004()];
		@Pc(24) Class184[] local24 = Static385.method5960();
		for (@Pc(26) int local26 = 0; local26 < this.anInterface2Array1.length; local26++) {
			this.anInterface2Array1[local26] = this.method2766(arg0, local24[arg0.method7004()]);
		}
	}
}
