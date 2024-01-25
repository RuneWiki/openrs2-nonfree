import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bk")
public final class Class39 {

	@OriginalMember(owner = "client!bk", name = "k", descriptor = "I")
	public int anInt1331;

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "[Lclient!cr;")
	public Interface3[] anInterface3Array1;

	@OriginalMember(owner = "client!bk", name = "j", descriptor = "I")
	public int anInt1335;

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lclient!vf;ZLclient!ika;)Lclient!cr;")
	private Interface3 method1250(@OriginalArg(0) Class390 arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (Static386.aClass390_8 == arg0) {
			return Static93.method1943(arg1);
		} else if (Static56.aClass390_2 == arg0) {
			return Static434.method9044(arg1);
		} else if (arg0 == Static248.aClass390_7) {
			return Static318.method1659(arg1);
		} else if (Static562.aClass390_11 == arg0) {
			return Static151.method2500(arg1);
		} else if (Static133.aClass390_5 == arg0) {
			return Static556.method7271(arg1);
		} else if (Static709.aClass390_13 == arg0) {
			return Static536.method7115(arg1);
		} else if (arg0 == Static624.aClass390_10) {
			return Static611.method7809(arg1);
		} else if (arg0 == Static601.aClass390_12) {
			return Static160.method2609(arg1);
		} else if (arg0 == Static9.aClass390_1) {
			return Static102.method2002(arg1);
		} else if (arg0 == Static184.aClass390_6) {
			return Static703.method9309(arg1);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lclient!ika;I)V")
	public void method1253(@OriginalArg(0) Class3_Sub2 arg0) {
		this.anInt1335 = arg0.method2061();
		this.anInt1331 = arg0.method2028(-14795);
		this.anInterface3Array1 = new Interface3[arg0.method2048(255)];
		@Pc(33) Class390[] local33 = Static50.method1254();
		for (@Pc(35) int local35 = 0; local35 < this.anInterface3Array1.length; local35++) {
			this.anInterface3Array1[local35] = this.method1250(local33[arg0.method2048(255)], arg0);
		}
	}
}
