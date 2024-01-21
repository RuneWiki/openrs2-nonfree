import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public final class Class10_Sub1_Sub2 extends Class10_Sub1 {

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lclient!vb;Ljava/awt/Component;)V")
	public Class10_Sub1_Sub2(@OriginalArg(0) Class60 arg0, @OriginalArg(1) Component arg1) throws Exception {
		super(22050);
		Static86.anInterface3_1 = arg0.method1809();
		Static86.anInterface3_1.method1014(arg1);
		this.method1573(arg0, 16384);
	}

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "(I)V")
	@Override
	protected void method1569(@OriginalArg(0) int arg0) throws Exception {
		Static86.anInterface3_1.method1011(arg0);
	}

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "()V")
	@Override
	protected void method1567() {
		Static86.anInterface3_1.method1015(Static94.anIntArray348);
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "()V")
	@Override
	protected void method1565() {
		Static86.anInterface3_1.method1012();
	}

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "()I")
	@Override
	protected int method1570() {
		return Static86.anInterface3_1.method1013();
	}
}
