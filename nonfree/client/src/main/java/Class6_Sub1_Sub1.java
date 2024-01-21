import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public final class Class6_Sub1_Sub1 extends Class6_Sub1 {

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(Lclient!qd;Ljava/awt/Component;)V")
	public Class6_Sub1_Sub1(@OriginalArg(0) Class51 arg0, @OriginalArg(1) Component arg1) throws Exception {
		super(22050);
		Static6.anInterface3_1 = arg0.method1474();
		Static6.anInterface3_1.method1480(arg1);
		this.method1572(arg0, 16384);
	}

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "()I")
	@Override
	protected int method1571() {
		return Static6.anInterface3_1.method1476();
	}

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "()V")
	@Override
	protected void method1574() {
		Static6.anInterface3_1.method1479(Static104.anIntArray360);
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)V")
	@Override
	protected void method1573(@OriginalArg(0) int arg0) throws Exception {
		Static6.anInterface3_1.method1478(arg0);
	}

	@OriginalMember(owner = "client!ba", name = "e", descriptor = "()V")
	@Override
	protected void method1575() {
		Static6.anInterface3_1.method1477();
	}
}
