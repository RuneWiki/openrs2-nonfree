import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public final class Class24_Sub2_Sub1 extends Class24_Sub2 {

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lclient!cc;Ljava/awt/Component;)V")
	public Class24_Sub2_Sub1(@OriginalArg(0) Class12 arg0, @OriginalArg(1) Component arg1) throws Exception {
		super(22050);
		Static43.anInterface4_2 = arg0.method327();
		Static43.anInterface4_2.method1715(arg1);
		this.method1147(arg0, 16384);
	}

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "()V")
	@Override
	protected void method1146() {
		Static43.anInterface4_2.method1718(Static36.anIntArray217);
	}

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "()V")
	@Override
	protected void method1142() {
		Static43.anInterface4_2.method1716();
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "()I")
	@Override
	protected int method1140() {
		return Static43.anInterface4_2.method1717();
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V")
	@Override
	protected void method1143(@OriginalArg(0) int arg0) throws Exception {
		Static43.anInterface4_2.method1714(arg0);
	}
}
