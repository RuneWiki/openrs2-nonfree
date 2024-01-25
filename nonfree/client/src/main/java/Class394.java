import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ww")
public final class Class394 {

	@OriginalMember(owner = "client!ww", name = "e", descriptor = "I")
	public int anInt10944;

	@OriginalMember(owner = "client!ww", name = "k", descriptor = "I")
	public int anInt10949;

	@OriginalMember(owner = "client!ww", name = "m", descriptor = "[Lclient!vq;")
	public Interface26[] anInterface26Array1;

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(Lclient!dt;Lclient!eo;B)Lclient!vq;")
	private Interface26 method9027(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(1) Class108 arg1) {
		if (Static119.aClass108_5 == arg1) {
			return Static353.method5113(arg0);
		} else if (arg1 == Static360.aClass108_8) {
			return Static525.method6826(arg0);
		} else if (Static119.aClass108_4 == arg1) {
			return Static393.method5488(arg0);
		} else if (Static158.aClass108_6 == arg1) {
			return Static9.method175(arg0);
		} else if (arg1 == Static542.aClass108_11) {
			return Static521.method6772(arg0);
		} else if (arg1 == Static289.aClass108_7) {
			return Static505.method6598(arg0);
		} else if (Static27.aClass108_3 == arg1) {
			return Static565.method7445(arg0);
		} else if (arg1 == Static634.aClass108_10) {
			return Static180.method2821(arg0);
		} else if (Static616.aClass108_12 == arg1) {
			return Static168.method2666(arg0);
		} else if (arg1 == Static370.aClass108_9) {
			return Static55.method1047(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(Lclient!dt;Z)V")
	public void method9030(@OriginalArg(0) Class3_Sub4 arg0) {
		this.anInt10949 = arg0.method7945();
		this.anInt10944 = arg0.method7951();
		this.anInterface26Array1 = new Interface26[arg0.method7954()];
		@Pc(24) Class108[] local24 = Static365.method5252();
		for (@Pc(26) int local26 = 0; local26 < this.anInterface26Array1.length; local26++) {
			this.anInterface26Array1[local26] = this.method9027(arg0, local24[arg0.method7954()]);
		}
	}
}
