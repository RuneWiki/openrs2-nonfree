import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qea")
public final class Class301 {

	@OriginalMember(owner = "client!qea", name = "e", descriptor = "[Lclient!baa;")
	public Interface3[] anInterface3Array1;

	@OriginalMember(owner = "client!qea", name = "h", descriptor = "I")
	public int anInt7621;

	@OriginalMember(owner = "client!qea", name = "i", descriptor = "I")
	public int anInt7622;

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(Lclient!es;B)V")
	public void method6622(@OriginalArg(0) Class4_Sub11 arg0) {
		this.anInt7622 = arg0.method8827();
		this.anInt7621 = arg0.method8859();
		this.anInterface3Array1 = new Interface3[arg0.method8865()];
		@Pc(35) Class210[] local35 = Static661.method8222();
		for (@Pc(37) int local37 = 0; local37 < this.anInterface3Array1.length; local37++) {
			this.anInterface3Array1[local37] = this.method6623(arg0, local35[arg0.method8865()]);
		}
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(Lclient!es;Lclient!lf;I)Lclient!baa;")
	private Interface3 method6623(@OriginalArg(0) Class4_Sub11 arg0, @OriginalArg(1) Class210 arg1) {
		if (Static207.aClass210_17 == arg1) {
			return Static248.method3649(arg0);
		} else if (arg1 == Static679.aClass210_19) {
			return Static627.method8414(arg0);
		} else if (arg1 == Static340.aClass210_9) {
			return Static16.method298(arg0);
		} else if (arg1 == Static132.aClass210_6) {
			return Static485.method6641(arg0);
		} else if (Static288.aClass210_8 == arg1) {
			return Static366.method4838(arg0);
		} else if (Static537.aClass210_16 == arg1) {
			return Static295.method4176(arg0);
		} else if (Static384.aClass210_10 == arg1) {
			return Static643.method8576(arg0);
		} else if (arg1 == Static488.aClass210_15) {
			return Static49.method1007(arg0);
		} else if (Static169.aClass210_7 == arg1) {
			return Static184.method2919(arg0);
		} else if (arg1 == Static45.aClass210_1) {
			return Static483.method6618(arg0);
		} else {
			return null;
		}
	}
}
