import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pw")
public final class Class278 {

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "I")
	public int anInt7312;

	@OriginalMember(owner = "client!pw", name = "b", descriptor = "[Lclient!cea;")
	public Interface4[] anInterface4Array1;

	@OriginalMember(owner = "client!pw", name = "d", descriptor = "I")
	public int anInt7313;

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(Lclient!ac;I)V")
	public void method5878(@OriginalArg(0) Class1_Sub3 arg0) {
		this.anInt7312 = arg0.method7919();
		this.anInt7313 = arg0.method7945();
		this.anInterface4Array1 = new Interface4[arg0.method7974()];
		@Pc(29) Class252[] local29 = Static42.method750();
		for (@Pc(31) int local31 = 0; local31 < this.anInterface4Array1.length; local31++) {
			this.anInterface4Array1[local31] = this.method5879(arg0, local29[arg0.method7974()]);
		}
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(BLclient!ac;Lclient!oh;)Lclient!cea;")
	private Interface4 method5879(@OriginalArg(1) Class1_Sub3 arg0, @OriginalArg(2) Class252 arg1) {
		if (arg1 == Static284.aClass252_17) {
			return Static165.method2701(arg0);
		} else if (arg1 == Static361.aClass252_13) {
			return Static374.method5450(arg0);
		} else if (arg1 == Static237.aClass252_8) {
			return Static21.method474(arg0);
		} else if (Static429.aClass252_15 == arg1) {
			return Static39.method714(arg0);
		} else if (arg1 == Static40.aClass252_1) {
			return Static548.method7476(arg0);
		} else if (arg1 == Static494.aClass252_16) {
			return Static357.method5295(arg0);
		} else if (Static191.aClass252_7 == arg1) {
			return Static295.method4395(arg0);
		} else if (arg1 == Static241.aClass252_9) {
			return Static452.method6353(arg0);
		} else if (arg1 == Static67.aClass252_5) {
			return Static18.method442(arg0);
		} else if (Static271.aClass252_10 == arg1) {
			return Static208.method6477(arg0);
		} else {
			return null;
		}
	}
}
