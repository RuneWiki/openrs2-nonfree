import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dba")
public final class Class64 {

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "I")
	public int anInt2119;

	@OriginalMember(owner = "client!dba", name = "b", descriptor = "I")
	public int anInt2120;

	@OriginalMember(owner = "client!dba", name = "i", descriptor = "[Lclient!bia;")
	public Interface4[] anInterface4Array1;

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(ILclient!sl;Lclient!hr;)Lclient!bia;")
	private Interface4 method2001(@OriginalArg(1) Class3_Sub3 arg0, @OriginalArg(2) Class146 arg1) {
		if (Static305.aClass146_5 == arg1) {
			return Static360.method5897(arg0);
		} else if (arg1 == Static428.aClass146_4) {
			return Static596.method8352(arg0);
		} else if (arg1 == Static447.aClass146_6) {
			return Static91.method2067(arg0);
		} else if (Static635.aClass146_11 == arg1) {
			return Static511.method7630(arg0);
		} else if (arg1 == Static461.aClass146_7) {
			return Static75.method1779(arg0);
		} else if (Static506.aClass146_8 == arg1) {
			return Static527.method7736(arg0);
		} else if (arg1 == Static47.aClass146_1) {
			return Static453.method3847(arg0);
		} else if (Static506.aClass146_9 == arg1) {
			return Static424.method6641(arg0);
		} else if (arg1 == Static612.aClass146_10) {
			return Static419.method6582(arg0);
		} else if (Static165.aClass146_2 == arg1) {
			return Static174.method3047(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(Lclient!sl;B)V")
	public void method2003(@OriginalArg(0) Class3_Sub3 arg0) {
		this.anInt2120 = arg0.method4204();
		this.anInt2119 = arg0.method4221();
		this.anInterface4Array1 = new Interface4[arg0.method4225()];
		@Pc(29) Class146[] local29 = Static140.method2608();
		for (@Pc(31) int local31 = 0; local31 < this.anInterface4Array1.length; local31++) {
			this.anInterface4Array1[local31] = this.method2001(arg0, local29[arg0.method4225()]);
		}
	}
}
