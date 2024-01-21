import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public final class Class21_Sub1_Sub1 extends Class21_Sub1 {

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(Lclient!g;)V")
	public Class21_Sub1_Sub1(@OriginalArg(0) Class28 arg0) {
		Static78.anInterface3_2 = arg0.method580();
	}

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "()V")
	@Override
	protected void method2031() {
		Static78.anInterface3_2.method519();
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "()I")
	@Override
	protected int method2029() {
		return Static78.anInterface3_2.method520();
	}

	@OriginalMember(owner = "client!oe", name = "e", descriptor = "()V")
	@Override
	protected void method2035() {
		Static78.anInterface3_2.method521(Static29.anIntArray440);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
	@Override
	protected void method2027(@OriginalArg(0) int arg0) throws Exception {
		Static78.anInterface3_2.method522(arg0);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Ljava/awt/Component;IZ)V")
	@Override
	public void method2033(@OriginalArg(0) Component arg0) throws Exception {
		Static78.anInterface3_2.method518(arg0);
	}
}
