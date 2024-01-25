import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public final class Class130_Sub1 extends Class130 {

	@OriginalMember(owner = "client!ji", name = "G", descriptor = "I")
	private final int anInt3904;

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Lclient!lt;I)V")
	public Class130_Sub1(@OriginalArg(0) Class159 arg0, @OriginalArg(1) int arg1) {
		Static194.anInterface2_1 = arg0.method3506();
		this.anInt3904 = arg1;
	}

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "()I")
	@Override
	protected int method3640() {
		return Static194.anInterface2_1.method1649(this.anInt3904);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "()V")
	@Override
	protected void method3637() {
		Static194.anInterface2_1.method1645(this.anInt3904);
	}

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "()V")
	@Override
	protected void method3645() {
		Static194.anInterface2_1.method1646(this.anInt3904, super.anIntArray451);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method3638(@OriginalArg(0) Component arg0) throws Exception {
		Static194.anInterface2_1.method1644(Static438.anInt7333, arg0, Static324.aBoolean365);
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "()V")
	@Override
	protected void method3639() {
		Static194.anInterface2_1.method1648(this.anInt3904);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V")
	@Override
	public void method3647(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static194.anInterface2_1.method1647(this.anInt3904, arg0);
	}
}
