import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public final class Class22_Sub1_Sub1 extends Class22_Sub1 {

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Lclient!aa;Ljava/awt/Component;)V")
	public Class22_Sub1_Sub1(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Component arg1) throws Exception {
		super(22050);
		Static26.anInterface3_2 = arg0.method5();
		Static26.anInterface3_2.method1561(arg1);
		this.method1002(arg0, 16384);
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "()V")
	@Override
	protected void method996() {
		Static26.anInterface3_2.method1559();
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)V")
	@Override
	protected void method999(@OriginalArg(0) int arg0) throws Exception {
		Static26.anInterface3_2.method1560(arg0);
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "()V")
	@Override
	protected void method1000() {
		Static26.anInterface3_2.method1558(Static105.anIntArray210);
	}

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "()I")
	@Override
	protected int method1004() {
		return Static26.anInterface3_2.method1557();
	}
}
