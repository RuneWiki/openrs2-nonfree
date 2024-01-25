import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public final class Class33_Sub2 extends Class33 {

	@OriginalMember(owner = "client!qn", name = "F", descriptor = "I")
	private final int anInt8550;

	@OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(Lclient!wea;I)V")
	public Class33_Sub2(@OriginalArg(0) Class370 arg0, @OriginalArg(1) int arg1) {
		Static466.anInterface9_1 = (Interface9) arg0.method9079();
		this.anInt8550 = arg1;
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "()V")
	@Override
	protected void method7213() {
		Static466.anInterface9_1.method105(this.anInt8550);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "()I")
	@Override
	protected int method7211() {
		return Static466.anInterface9_1.method103(this.anInt8550);
	}

	@OriginalMember(owner = "client!qn", name = "c", descriptor = "()V")
	@Override
	protected void method7221() {
		Static466.anInterface9_1.method102(this.anInt8550);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method7225(@OriginalArg(0) Component arg0) throws Exception {
		Static466.anInterface9_1.method106(Static215.anInt4848, Static600.aBoolean722, arg0);
	}

	@OriginalMember(owner = "client!qn", name = "d", descriptor = "()V")
	@Override
	protected void method7224() {
		Static466.anInterface9_1.method104(this.anInt8550, super.anIntArray557);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)V")
	@Override
	public void method7212(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static466.anInterface9_1.method107(arg0, this.anInt8550);
	}
}
