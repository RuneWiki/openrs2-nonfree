import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public final class Class39_Sub2 extends Class39 {

	@OriginalMember(owner = "client!fh", name = "K", descriptor = "I")
	private final int anInt3518;

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Lclient!vk;I)V")
	public Class39_Sub2(@OriginalArg(0) Class359 arg0, @OriginalArg(1) int arg1) {
		Static152.anInterface13_1 = (Interface13) arg0.method8259();
		this.anInt3518 = arg1;
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "()I")
	@Override
	protected int method2875() {
		return Static152.anInterface13_1.method7874(this.anInt3518);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "()V")
	@Override
	protected void method2873() {
		Static152.anInterface13_1.method7872(this.anInt3518);
	}

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "(I)V")
	@Override
	public void method2881(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static152.anInterface13_1.method7875(this.anInt3518, arg0);
	}

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "()V")
	@Override
	protected void method2879() {
		Static152.anInterface13_1.method7877(this.anInt3518, super.anIntArray247);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method2876(@OriginalArg(0) Component arg0) throws Exception {
		Static152.anInterface13_1.method7873(arg0, Static66.anInt1396, Static440.aBoolean586);
	}

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "()V")
	@Override
	protected void method2889() {
		Static152.anInterface13_1.method7876(this.anInt3518);
	}
}
