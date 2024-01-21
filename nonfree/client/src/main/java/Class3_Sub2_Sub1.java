import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public final class Class3_Sub2_Sub1 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lclient!ha;)V")
	public Class3_Sub2_Sub1(@OriginalArg(0) Class29 arg0) {
		Static12.anInterface4_1 = arg0.method779();
	}

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "()V")
	@Override
	protected void method1228() {
		Static12.anInterface4_1.method1154(Static44.anIntArray226);
	}

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "(I)V")
	@Override
	protected void method1226(@OriginalArg(0) int arg0) throws Exception {
		Static12.anInterface4_1.method1152(arg0);
	}

	@OriginalMember(owner = "client!ca", name = "e", descriptor = "()V")
	@Override
	protected void method1230() {
		Static12.anInterface4_1.method1153();
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Ljava/awt/Component;IZ)V")
	@Override
	public void method1229(@OriginalArg(0) Component arg0) throws Exception {
		Static12.anInterface4_1.method1150(arg0);
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "()I")
	@Override
	protected int method1225() {
		return Static12.anInterface4_1.method1151();
	}
}
