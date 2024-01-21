import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public final class Class9_Sub1_Sub1 extends Class9_Sub1 {

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lclient!jb;Ljava/awt/Component;)V")
	public Class9_Sub1_Sub1(@OriginalArg(0) Class32 arg0, @OriginalArg(1) Component arg1) throws Exception {
		super(22050);
		Static9.anInterface2_1 = arg0.method946();
		Static9.anInterface2_1.method1566(arg1);
		this.method1877(arg0, 16384);
	}

	@OriginalMember(owner = "client!be", name = "e", descriptor = "()V")
	@Override
	protected void method1881() {
		Static9.anInterface2_1.method1567(Static14.anIntArray396);
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(I)V")
	@Override
	protected void method1876(@OriginalArg(0) int arg0) throws Exception {
		Static9.anInterface2_1.method1563(arg0);
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "()I")
	@Override
	protected int method1878() {
		return Static9.anInterface2_1.method1564();
	}

	@OriginalMember(owner = "client!be", name = "d", descriptor = "()V")
	@Override
	protected void method1879() {
		Static9.anInterface2_1.method1565();
	}
}
