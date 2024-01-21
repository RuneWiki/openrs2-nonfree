import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public final class Class57_Sub1 extends Class57 {

	@OriginalMember(owner = "client!na", name = "T", descriptor = "I")
	private final int anInt1759;

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "(Lclient!tc;I)V")
	public Class57_Sub1(@OriginalArg(0) Class74 arg0, @OriginalArg(1) int arg1) {
		Static79.anInterface2_1 = arg0.method1815();
		this.anInt1759 = arg1;
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "()V")
	@Override
	protected void method2008() {
		Static79.anInterface2_1.method934(this.anInt1759, super.anIntArray493);
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "()V")
	@Override
	protected void method2012() {
		Static79.anInterface2_1.method935(this.anInt1759);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "()I")
	@Override
	protected int method2002() {
		return Static79.anInterface2_1.method931(this.anInt1759);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V")
	@Override
	public void method2011(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static79.anInterface2_1.method933(this.anInt1759, arg0);
	}

	@OriginalMember(owner = "client!na", name = "d", descriptor = "()V")
	@Override
	protected void method2017() {
		Static79.anInterface2_1.method930(this.anInt1759);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method2016(@OriginalArg(0) Component arg0) throws Exception {
		Static79.anInterface2_1.method932(Static81.anInt1802, Static10.aBoolean6, arg0);
	}
}
