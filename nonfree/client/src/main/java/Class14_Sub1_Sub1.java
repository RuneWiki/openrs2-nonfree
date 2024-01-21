import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public final class Class14_Sub1_Sub1 extends Class14_Sub1 {

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Lclient!jc;Ljava/awt/Component;)V")
	public Class14_Sub1_Sub1(@OriginalArg(0) Class35 arg0, @OriginalArg(1) Component arg1) throws Exception {
		super(22050);
		Static60.anInterface1_2 = arg0.method773();
		Static60.anInterface1_2.method319(arg1);
		this.method1365(arg0, 16384);
	}

	@OriginalMember(owner = "client!le", name = "d", descriptor = "()I")
	@Override
	protected int method1366() {
		return Static60.anInterface1_2.method315();
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "()V")
	@Override
	protected void method1362() {
		Static60.anInterface1_2.method318(Static67.anIntArray241);
	}

	@OriginalMember(owner = "client!le", name = "e", descriptor = "()V")
	@Override
	protected void method1369() {
		Static60.anInterface1_2.method317();
	}

	@OriginalMember(owner = "client!le", name = "e", descriptor = "(I)V")
	@Override
	protected void method1367(@OriginalArg(0) int arg0) throws Exception {
		Static60.anInterface1_2.method316(arg0);
	}
}
