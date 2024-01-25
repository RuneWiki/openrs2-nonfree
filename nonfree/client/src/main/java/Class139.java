import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class139 {

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
	public int anInt5229;

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "[Lclient!tda;")
	public Interface25[] anInterface25Array1;

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
	public int anInt5230;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!hda;Lclient!ji;I)Lclient!tda;")
	private Interface25 method4285(@OriginalArg(0) Class129 arg0, @OriginalArg(1) Class6_Sub8 arg1) {
		if (arg0 == Static180.aClass129_5) {
			return Static519.method7424(arg1);
		} else if (arg0 == Static98.aClass129_4) {
			return Static459.method6910(arg1);
		} else if (arg0 == Static622.aClass129_10) {
			return Static457.method6893(arg1);
		} else if (Static17.aClass129_2 == arg0) {
			return Static265.method4756(arg1);
		} else if (arg0 == Static493.aClass129_7) {
			return Static201.method6159(arg1);
		} else if (arg0 == Static264.aClass129_6) {
			return Static596.method8279(arg1);
		} else if (arg0 == Static540.aClass129_9) {
			return Static576.method8015(arg1);
		} else if (Static535.aClass129_8 == arg0) {
			return Static330.method7825(arg1);
		} else if (Static8.aClass129_1 == arg0) {
			return Static356.method5769(arg1);
		} else if (Static40.aClass129_3 == arg0) {
			return Static616.method8466(arg1);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILclient!ji;)V")
	public void method4287(@OriginalArg(1) Class6_Sub8 arg0) {
		this.anInt5229 = arg0.method8203();
		this.anInt5230 = arg0.method8220();
		this.anInterface25Array1 = new Interface25[arg0.method8246()];
		@Pc(24) Class129[] local24 = Static126.method2631();
		for (@Pc(26) int local26 = 0; local26 < this.anInterface25Array1.length; local26++) {
			this.anInterface25Array1[local26] = this.method4285(local24[arg0.method8246()], arg0);
		}
	}
}
