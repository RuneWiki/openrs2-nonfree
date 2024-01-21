import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public final class Class15_Sub1_Sub1 extends Class15_Sub1 {

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Lclient!ed;)V")
	public Class15_Sub1_Sub1(@OriginalArg(0) Class23 arg0) {
		Static28.anInterface4_2 = arg0.method518();
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Ljava/awt/Component;IZ)V")
	@Override
	public void method1355(@OriginalArg(0) Component arg0) throws Exception {
		Static28.anInterface4_2.method1755(arg0);
	}

	@OriginalMember(owner = "client!f", name = "d", descriptor = "()I")
	@Override
	protected int method1354() {
		return Static28.anInterface4_2.method1756();
	}

	@OriginalMember(owner = "client!f", name = "c", descriptor = "()V")
	@Override
	protected void method1352() {
		Static28.anInterface4_2.method1752(Static77.anIntArray231);
	}

	@OriginalMember(owner = "client!f", name = "c", descriptor = "(I)V")
	@Override
	protected void method1353(@OriginalArg(0) int arg0) throws Exception {
		Static28.anInterface4_2.method1754(arg0);
	}

	@OriginalMember(owner = "client!f", name = "e", descriptor = "()V")
	@Override
	protected void method1357() {
		Static28.anInterface4_2.method1753();
	}
}
