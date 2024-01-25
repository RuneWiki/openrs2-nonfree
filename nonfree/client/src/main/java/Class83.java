import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dq")
public final class Class83 {

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "I")
	public int anInt2166;

	@OriginalMember(owner = "client!dq", name = "h", descriptor = "[Lclient!kd;")
	public Interface15[] anInterface15Array1;

	@OriginalMember(owner = "client!dq", name = "f", descriptor = "I")
	public int anInt2167;

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(ILclient!uu;Lclient!jc;)Lclient!kd;")
	private Interface15 method2080(@OriginalArg(1) Class369 arg0, @OriginalArg(2) Class6_Sub15 arg1) {
		if (arg0 == Static9.aClass369_1) {
			return Static460.method7016(arg1);
		} else if (Static378.aClass369_10 == arg0) {
			return Static69.method905(arg1);
		} else if (Static667.aClass369_12 == arg0) {
			return Static470.method7086(arg1);
		} else if (Static272.aClass369_4 == arg0) {
			return Static79.method1087(arg1);
		} else if (arg0 == Static12.aClass369_2) {
			return Static614.method8475(arg1);
		} else if (Static189.aClass369_8 == arg0) {
			return Static536.method7651(arg1);
		} else if (arg0 == Static172.aClass369_7) {
			return Static497.method7324(arg1);
		} else if (arg0 == Static158.aClass369_6) {
			return Static667.method8849(arg1);
		} else if (Static141.aClass369_11 == arg0) {
			return Static542.method7710(arg1);
		} else if (arg0 == Static207.aClass369_9) {
			return Static317.method5008(arg1);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(ILclient!jc;)V")
	public void method2081(@OriginalArg(1) Class6_Sub15 arg0) {
		this.anInt2166 = arg0.method2987();
		this.anInt2167 = arg0.method3018();
		this.anInterface15Array1 = new Interface15[arg0.method3030()];
		@Pc(26) Class369[] local26 = Static368.method5568();
		for (@Pc(33) int local33 = 0; local33 < this.anInterface15Array1.length; local33++) {
			this.anInterface15Array1[local33] = this.method2080(local26[arg0.method3030()], arg0);
		}
	}
}
