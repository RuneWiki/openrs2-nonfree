import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public final class Class9_Sub2_Sub2 extends Class9_Sub2 {

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "(Lclient!ra;Ljava/awt/Component;)V")
	public Class9_Sub2_Sub2(@OriginalArg(0) Class54 arg0, @OriginalArg(1) Component arg1) throws Exception {
		super(22050);
		Static91.anInterface3_2 = arg0.method1493();
		Static91.anInterface3_2.method1630(arg1);
		this.method1557(arg0, 16384);
	}

	@OriginalMember(owner = "client!s", name = "d", descriptor = "()V")
	@Override
	protected void method1556() {
		Static91.anInterface3_2.method1628();
	}

	@OriginalMember(owner = "client!s", name = "e", descriptor = "()I")
	@Override
	protected int method1559() {
		return Static91.anInterface3_2.method1627();
	}

	@OriginalMember(owner = "client!s", name = "c", descriptor = "(I)V")
	@Override
	protected void method1553(@OriginalArg(0) int arg0) throws Exception {
		Static91.anInterface3_2.method1629(arg0);
	}

	@OriginalMember(owner = "client!s", name = "c", descriptor = "()V")
	@Override
	protected void method1555() {
		Static91.anInterface3_2.method1626(Static30.anIntArray329);
	}
}
