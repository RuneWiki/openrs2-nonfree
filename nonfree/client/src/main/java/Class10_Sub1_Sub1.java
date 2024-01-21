import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public final class Class10_Sub1_Sub1 extends Class10_Sub1 {

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Lclient!lc;Ljava/awt/Component;)V")
	public Class10_Sub1_Sub1(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Component arg1) throws Exception {
		super(22050);
		Static35.anInterface3_1 = arg0.method1255();
		Static35.anInterface3_1.method1274(arg1);
		this.method1038(arg0, 16384);
	}

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "(I)V")
	@Override
	protected void method1042(@OriginalArg(0) int arg0) throws Exception {
		Static35.anInterface3_1.method1270(arg0);
	}

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "()I")
	@Override
	protected int method1040() {
		return Static35.anInterface3_1.method1273();
	}

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "()V")
	@Override
	protected void method1041() {
		Static35.anInterface3_1.method1272();
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "()V")
	@Override
	protected void method1039() {
		Static35.anInterface3_1.method1271(Static78.anIntArray160);
	}
}
