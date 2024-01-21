import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public final class Class17_Sub2_Sub1 extends Class17_Sub2 {

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lclient!s;Ljava/awt/Component;)V")
	public Class17_Sub2_Sub1(@OriginalArg(0) Class55 arg0, @OriginalArg(1) Component arg1) throws Exception {
		super(22050);
		Static77.anInterface2_1 = arg0.method1406();
		Static77.anInterface2_1.method652(arg1);
		this.method1446(arg0, 16384);
	}

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "()I")
	@Override
	protected int method1445() {
		return Static77.anInterface2_1.method655();
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "()V")
	@Override
	protected void method1439() {
		Static77.anInterface2_1.method656();
	}

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "(I)V")
	@Override
	protected void method1438(@OriginalArg(0) int arg0) throws Exception {
		Static77.anInterface2_1.method653(arg0);
	}

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "()V")
	@Override
	protected void method1441() {
		Static77.anInterface2_1.method654(Static92.anIntArray307);
	}
}
