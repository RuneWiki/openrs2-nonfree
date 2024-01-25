import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public final class Class30_Sub1 extends Class30 {

	@OriginalMember(owner = "client!ce", name = "Q", descriptor = "I")
	private final int anInt887;

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Lclient!de;I)V")
	public Class30_Sub1(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int arg1) {
		Static39.anInterface4_1 = arg0.method984();
		this.anInt887 = arg1;
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "()V")
	@Override
	protected void method4514() {
		Static39.anInterface4_1.method2879(this.anInt887);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V")
	@Override
	public void method4512(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static39.anInterface4_1.method2880(this.anInt887, arg0);
	}

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "()V")
	@Override
	protected void method4522() {
		Static39.anInterface4_1.method2878(this.anInt887, super.anIntArray429);
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "()V")
	@Override
	protected void method4519() {
		Static39.anInterface4_1.method2876(this.anInt887);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "()I")
	@Override
	protected int method4511() {
		return Static39.anInterface4_1.method2875(this.anInt887);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method4524(@OriginalArg(0) Component arg0) throws Exception {
		Static39.anInterface4_1.method2877(arg0, Static272.aBoolean339, Static244.anInt4835);
	}
}
