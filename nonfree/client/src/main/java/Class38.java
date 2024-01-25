import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public final class Class38 {

	@OriginalMember(owner = "client!bh", name = "f", descriptor = "[Lclient!oe;")
	public Interface17[] anInterface17Array1;

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "I")
	public int anInt638;

	@OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
	public int anInt640;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(BLclient!hfa;Lclient!et;)Lclient!oe;")
	private Interface17 method626(@OriginalArg(1) Class152 arg0, @OriginalArg(2) Class2_Sub20 arg1) {
		if (arg0 == Static450.aClass152_4) {
			return Static522.method7381(arg1);
		} else if (Static683.aClass152_9 == arg0) {
			return Static508.method7186(arg1);
		} else if (Static600.aClass152_6 == arg0) {
			return Static616.method8382(arg1);
		} else if (Static203.aClass152_3 == arg0) {
			return Static191.method2740(arg1);
		} else if (arg0 == Static661.aClass152_8) {
			return Static46.method601(arg1);
		} else if (arg0 == Static468.aClass152_5) {
			return Static557.method7770(arg1);
		} else if (Static639.aClass152_7 == arg0) {
			return Static603.method8250(arg1);
		} else if (arg0 == Static53.aClass152_1) {
			return Static632.method8616(arg1);
		} else if (arg0 == Static199.aClass152_2) {
			return Static329.method4574(arg1);
		} else if (arg0 == Static711.aClass152_10) {
			return Static102.method1542(arg1);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILclient!et;)V")
	public void method628(@OriginalArg(1) Class2_Sub20 arg0) {
		this.anInt640 = arg0.method8583();
		this.anInt638 = arg0.method8575();
		this.anInterface17Array1 = new Interface17[arg0.method8581(-17416)];
		@Pc(35) Class152[] local35 = Static330.method4576();
		for (@Pc(37) int local37 = 0; local37 < this.anInterface17Array1.length; local37++) {
			this.anInterface17Array1[local37] = this.method626(local35[arg0.method8581(-17416)], arg0);
		}
	}
}
