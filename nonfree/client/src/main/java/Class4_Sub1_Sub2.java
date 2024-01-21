import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public final class Class4_Sub1_Sub2 extends Class4_Sub1 {

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lclient!fb;Ljava/awt/Component;)V")
	public Class4_Sub1_Sub2(@OriginalArg(0) Class20 arg0, @OriginalArg(1) Component arg1) throws Exception {
		super(22050);
		Static36.anInterface3_2 = arg0.method721();
		Static36.anInterface3_2.method1153(arg1);
		this.method887(arg0, 16384);
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(I)V")
	@Override
	protected void method886(@OriginalArg(0) int arg0) throws Exception {
		Static36.anInterface3_2.method1149(arg0);
	}

	@OriginalMember(owner = "client!i", name = "c", descriptor = "()V")
	@Override
	protected void method884() {
		Static36.anInterface3_2.method1151();
	}

	@OriginalMember(owner = "client!i", name = "e", descriptor = "()I")
	@Override
	protected int method890() {
		return Static36.anInterface3_2.method1152();
	}

	@OriginalMember(owner = "client!i", name = "d", descriptor = "()V")
	@Override
	protected void method888() {
		Static36.anInterface3_2.method1150(Static62.anIntArray88);
	}
}
