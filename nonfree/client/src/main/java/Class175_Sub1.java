import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public final class Class175_Sub1 extends Class175 {

	@OriginalMember(owner = "client!ik", name = "I", descriptor = "I")
	private final int anInt4428;

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Lclient!mca;I)V")
	public Class175_Sub1(@OriginalArg(0) Class230 arg0, @OriginalArg(1) int arg1) {
		Static255.anInterface13_1 = (Interface13) arg0.method5346();
		this.anInt4428 = arg1;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "()I")
	@Override
	protected int method4707() {
		return Static255.anInterface13_1.method5162(this.anInt4428);
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)V")
	@Override
	public void method4699(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static255.anInterface13_1.method5160(this.anInt4428, arg0);
	}

	@OriginalMember(owner = "client!ik", name = "c", descriptor = "()V")
	@Override
	protected void method4693() {
		Static255.anInterface13_1.method5164(this.anInt4428);
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "()V")
	@Override
	protected void method4706() {
		Static255.anInterface13_1.method5161(this.anInt4428, super.anIntArray305);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method4697(@OriginalArg(0) Component arg0) throws Exception {
		Static255.anInterface13_1.method5165(Static608.anInt10099, Static128.aBoolean541, arg0);
	}

	@OriginalMember(owner = "client!ik", name = "d", descriptor = "()V")
	@Override
	protected void method4696() {
		Static255.anInterface13_1.method5163(this.anInt4428);
	}
}
