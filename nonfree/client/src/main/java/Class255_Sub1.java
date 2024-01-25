import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public final class Class255_Sub1 extends Class255 {

	@OriginalMember(owner = "client!qo", name = "H", descriptor = "I")
	private final int anInt8198;

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Lclient!oq;I)V")
	public Class255_Sub1(@OriginalArg(0) Class268 arg0, @OriginalArg(1) int arg1) {
		Static488.anInterface13_1 = (Interface13) arg0.method6335();
		this.anInt8198 = arg1;
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "()V")
	@Override
	protected void method7448() {
		Static488.anInterface13_1.method8088(this.anInt8198, super.anIntArray493);
	}

	@OriginalMember(owner = "client!qo", name = "c", descriptor = "(I)V")
	@Override
	public void method7459(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static488.anInterface13_1.method8091(this.anInt8198, arg0);
	}

	@OriginalMember(owner = "client!qo", name = "d", descriptor = "()V")
	@Override
	protected void method7461() {
		Static488.anInterface13_1.method8087(this.anInt8198);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "()V")
	@Override
	protected void method7445() {
		Static488.anInterface13_1.method8090(this.anInt8198);
	}

	@OriginalMember(owner = "client!qo", name = "c", descriptor = "()I")
	@Override
	protected int method7450() {
		return Static488.anInterface13_1.method8086(this.anInt8198);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method7455(@OriginalArg(0) Component arg0) throws Exception {
		Static488.anInterface13_1.method8089(Static143.aBoolean243, arg0, Static302.anInt5797);
	}
}
