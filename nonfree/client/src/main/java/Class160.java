import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jha")
public final class Class160 {

	@OriginalMember(owner = "client!jha", name = "d", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray2 = new Rectangle[100];

	@OriginalMember(owner = "client!jha", name = "c", descriptor = "I")
	public int anInt5739;

	@OriginalMember(owner = "client!jha", name = "e", descriptor = "[Lclient!ada;")
	public Interface1[] anInterface1Array1;

	@OriginalMember(owner = "client!jha", name = "g", descriptor = "I")
	public int anInt5741;

	static {
		for (@Pc(4) int local4 = 0; local4 < 100; local4++) {
			aRectangleArray2[local4] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(Lclient!tn;Lclient!qi;B)Lclient!ada;")
	private Interface1 method4867(@OriginalArg(0) Class3_Sub15 arg0, @OriginalArg(1) Class275 arg1) {
		if (arg1 == Static614.aClass275_10) {
			return Static254.method4793(arg0);
		} else if (arg1 == Static555.aClass275_8) {
			return Static508.method7389(arg0);
		} else if (arg1 == Static141.aClass275_1) {
			return Static242.method4625(arg0);
		} else if (arg1 == Static155.aClass275_2) {
			return Static472.method5190(arg0);
		} else if (arg1 == Static446.aClass275_7) {
			return Static190.method3795(arg0);
		} else if (Static216.aClass275_3 == arg1) {
			return Static245.method4652(arg0);
		} else if (Static423.aClass275_5 == arg1) {
			return Static181.method3692(arg0);
		} else if (Static441.aClass275_6 == arg1) {
			return Static556.method7833(arg0);
		} else if (Static612.aClass275_9 == arg1) {
			return Static396.method6337(arg0);
		} else if (Static314.aClass275_4 == arg1) {
			return Static294.method5061(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(ILclient!tn;)V")
	public void method4870(@OriginalArg(1) Class3_Sub15 arg0) {
		this.anInt5739 = arg0.method8421();
		this.anInt5741 = arg0.method8414();
		this.anInterface1Array1 = new Interface1[arg0.method8401()];
		@Pc(28) Class275[] local28 = Static448.method6790();
		for (@Pc(30) int local30 = 0; local30 < this.anInterface1Array1.length; local30++) {
			this.anInterface1Array1[local30] = this.method4867(arg0, local28[arg0.method8401()]);
		}
	}
}
