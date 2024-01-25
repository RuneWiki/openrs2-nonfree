import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cca")
public final class Class48 {

	@OriginalMember(owner = "client!cca", name = "b", descriptor = "I")
	public int anInt965;

	@OriginalMember(owner = "client!cca", name = "e", descriptor = "I")
	public int anInt967;

	@OriginalMember(owner = "client!cca", name = "f", descriptor = "[Lclient!qo;")
	public Interface19[] anInterface19Array1;

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(Lclient!eh;I)V")
	public void method856(@OriginalArg(0) Class4_Sub9 arg0) {
		this.anInt965 = arg0.method6023();
		this.anInt967 = arg0.method5982();
		this.anInterface19Array1 = new Interface19[arg0.method6015()];
		@Pc(24) Class258[] local24 = Static267.method4356();
		for (@Pc(26) int local26 = 0; local26 < this.anInterface19Array1.length; local26++) {
			this.anInterface19Array1[local26] = this.method857(arg0, local24[arg0.method6015()]);
		}
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(BLclient!eh;Lclient!os;)Lclient!qo;")
	private Interface19 method857(@OriginalArg(1) Class4_Sub9 arg0, @OriginalArg(2) Class258 arg1) {
		if (Static332.aClass258_14 == arg1) {
			return Static43.method720(arg0);
		} else if (arg1 == Static327.aClass258_21) {
			return Static244.method4129(arg0);
		} else if (Static240.aClass258_12 == arg1) {
			return Static481.method6704(arg0);
		} else if (arg1 == Static157.aClass258_15) {
			return Static63.method1066(arg0);
		} else if (arg1 == Static406.aClass258_19) {
			return Static1.method46(arg0);
		} else if (Static367.aClass258_20 == arg1) {
			return Static289.method4564(arg0);
		} else if (arg1 == Static583.aClass258_22) {
			return Static310.method4786(arg0);
		} else if (arg1 == Static547.aClass258_18) {
			return Static79.method1371(arg0);
		} else if (Static158.aClass258_11 == arg1) {
			return Static452.method6400(arg0);
		} else if (arg1 == Static289.aClass258_13) {
			return Static90.method2061(arg0);
		} else {
			return null;
		}
	}
}
