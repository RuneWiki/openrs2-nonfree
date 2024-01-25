import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public final class Class37_Sub2 extends Class37 {

	@OriginalMember(owner = "client!ir", name = "H", descriptor = "I")
	private final int anInt4910;

	@OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(Lclient!iha;I)V")
	public Class37_Sub2(@OriginalArg(0) Class173 arg0, @OriginalArg(1) int arg1) {
		Static263.anInterface21_1 = (Interface21) arg0.method4247();
		this.anInt4910 = arg1;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "()V")
	@Override
	protected void method4378() {
		Static263.anInterface21_1.method3782(this.anInt4910);
	}

	@OriginalMember(owner = "client!ir", name = "c", descriptor = "()V")
	@Override
	protected void method4374() {
		Static263.anInterface21_1.method3783(this.anInt4910, super.anIntArray247);
	}

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "(I)V")
	@Override
	public void method4372(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static263.anInterface21_1.method3780(arg0, this.anInt4910);
	}

	@OriginalMember(owner = "client!ir", name = "d", descriptor = "()I")
	@Override
	protected int method4375() {
		return Static263.anInterface21_1.method3779(this.anInt4910);
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method4373(@OriginalArg(0) Component arg0) throws Exception {
		Static263.anInterface21_1.method3781(Static583.aBoolean664, arg0, Static157.anInt2396);
	}

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "()V")
	@Override
	protected void method4383() {
		Static263.anInterface21_1.method3778(this.anInt4910);
	}
}
