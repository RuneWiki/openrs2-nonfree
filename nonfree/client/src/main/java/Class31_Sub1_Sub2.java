import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public final class Class31_Sub1_Sub2 extends Class31_Sub1 {

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lclient!sb;Ljava/awt/Component;)V")
	public Class31_Sub1_Sub2(@OriginalArg(0) Class53 arg0, @OriginalArg(1) Component arg1) throws Exception {
		super(22050);
		Static66.anInterface2_1 = arg0.method1627();
		Static66.anInterface2_1.method1169(arg1);
		this.method1185(arg0, 16384);
	}

	@OriginalMember(owner = "client!me", name = "e", descriptor = "()I")
	@Override
	protected int method1189() {
		return Static66.anInterface2_1.method1168();
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V")
	@Override
	protected void method1188(@OriginalArg(0) int arg0) throws Exception {
		Static66.anInterface2_1.method1170(arg0);
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "()V")
	@Override
	protected void method1182() {
		Static66.anInterface2_1.method1172(Static72.anIntArray267);
	}

	@OriginalMember(owner = "client!me", name = "d", descriptor = "()V")
	@Override
	protected void method1186() {
		Static66.anInterface2_1.method1171();
	}
}
