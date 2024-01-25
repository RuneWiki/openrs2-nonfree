import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public final class Class231 {

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
	public int anInt6446;

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
	public int anInt6448;

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "[Lclient!oc;")
	public Interface19[] anInterface19Array1;

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!es;B)V")
	public void method5403(@OriginalArg(0) Class2_Sub15 arg0) {
		this.anInt6448 = arg0.method4341();
		this.anInt6446 = arg0.method4294();
		this.anInterface19Array1 = new Interface19[arg0.method4325()];
		@Pc(26) Class357[] local26 = Static54.method923();
		for (@Pc(32) int local32 = 0; local32 < this.anInterface19Array1.length; local32++) {
			this.anInterface19Array1[local32] = this.method5404(local26[arg0.method4325()], arg0);
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!wea;ILclient!es;)Lclient!oc;")
	private Interface19 method5404(@OriginalArg(0) Class357 arg0, @OriginalArg(2) Class2_Sub15 arg1) {
		if (Static459.aClass357_12 == arg0) {
			return Static564.method7657(arg1);
		} else if (Static95.aClass357_2 == arg0) {
			return Static229.method3604(arg1);
		} else if (arg0 == Static259.aClass357_7) {
			return Static234.method3636(arg1);
		} else if (arg0 == Static375.aClass357_10) {
			return Static122.method1786(arg1);
		} else if (arg0 == Static92.aClass357_1) {
			return Static356.method5274(arg1);
		} else if (Static543.aClass357_13 == arg0) {
			return Static287.method4270(arg1);
		} else if (Static362.aClass357_9 == arg0) {
			return Static504.method7012(arg1);
		} else if (arg0 == Static161.aClass357_3) {
			return Static515.method7133(arg1);
		} else if (arg0 == Static172.aClass357_4) {
			return Static248.method3896(arg1);
		} else if (Static185.aClass357_14 == arg0) {
			return Static412.method369(arg1);
		} else {
			return null;
		}
	}
}
