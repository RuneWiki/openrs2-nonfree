import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public final class Class19_Sub1_Sub2 extends Class19_Sub1 {

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Lclient!c;)V")
	public Class19_Sub1_Sub2(@OriginalArg(0) Class11 arg0) {
		Static70.anInterface1_2 = arg0.method235();
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljava/awt/Component;IZ)V")
	@Override
	public void method1271(@OriginalArg(0) Component arg0) throws Exception {
		Static70.anInterface1_2.method218(arg0);
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "()I")
	@Override
	protected int method1263() {
		return Static70.anInterface1_2.method215();
	}

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)V")
	@Override
	protected void method1268(@OriginalArg(0) int arg0) throws Exception {
		Static70.anInterface1_2.method216(arg0);
	}

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "()V")
	@Override
	protected void method1270() {
		Static70.anInterface1_2.method217();
	}

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "()V")
	@Override
	protected void method1266() {
		Static70.anInterface1_2.method219(Static28.anIntArray226);
	}
}
