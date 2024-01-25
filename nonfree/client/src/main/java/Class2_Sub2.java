import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public final class Class2_Sub2 extends Class2 {

	@OriginalMember(owner = "client!ao", name = "J", descriptor = "I")
	private final int anInt425;

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Lclient!qn;I)V")
	public Class2_Sub2(@OriginalArg(0) Class209 arg0, @OriginalArg(1) int arg1) {
		Static13.anInterface1_1 = arg0.method4691();
		this.anInt425 = arg1;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "()V")
	@Override
	protected void method350() {
		Static13.anInterface1_1.method970(this.anInt425);
	}

	@OriginalMember(owner = "client!ao", name = "d", descriptor = "()V")
	@Override
	protected void method364() {
		Static13.anInterface1_1.method969(this.anInt425);
	}

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "()V")
	@Override
	protected void method354() {
		Static13.anInterface1_1.method971(this.anInt425, super.anIntArray18);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V")
	@Override
	public void method349(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static13.anInterface1_1.method968(this.anInt425, arg0);
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "()I")
	@Override
	protected int method351() {
		return Static13.anInterface1_1.method967(this.anInt425);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method357(@OriginalArg(0) Component arg0) throws Exception {
		Static13.anInterface1_1.method972(Static314.aBoolean348, arg0, Static275.anInt4927);
	}
}
