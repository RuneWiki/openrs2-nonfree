import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public final class Class105_Sub1 extends Class105 {

	@OriginalMember(owner = "client!ll", name = "L", descriptor = "I")
	private int anInt3049;

	@OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Lclient!ua;I)V")
	public Class105_Sub1(@OriginalArg(0) Class176 arg0, @OriginalArg(1) int arg1) {
		Static162.anInterface3_1 = arg0.method4510();
		this.anInt3049 = arg1;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)V")
	@Override
	public void method2772(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static162.anInterface3_1.method434(this.anInt3049, arg0);
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method2778(@OriginalArg(0) Component arg0) throws Exception {
		Static162.anInterface3_1.method437(arg0, Static105.aBoolean156, Static155.anInt2915);
	}

	@OriginalMember(owner = "client!ll", name = "c", descriptor = "()V")
	@Override
	protected void method2775() {
		Static162.anInterface3_1.method433(this.anInt3049);
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "()I")
	@Override
	protected int method2769() {
		return Static162.anInterface3_1.method436(this.anInt3049);
	}

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "()V")
	@Override
	protected void method2773() {
		Static162.anInterface3_1.method435(this.anInt3049);
	}

	@OriginalMember(owner = "client!ll", name = "d", descriptor = "()V")
	@Override
	protected void method2780() {
		Static162.anInterface3_1.method438(this.anInt3049, this.anIntArray367);
	}
}
