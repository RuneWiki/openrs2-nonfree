import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public final class Class4_Sub2 extends Class4 {

	@OriginalMember(owner = "client!jc", name = "N", descriptor = "I")
	private final int anInt1249;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Lclient!df;I)V")
	public Class4_Sub2(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1) {
		Static51.anInterface3_2 = arg0.method373();
		this.anInt1249 = arg1;
	}

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "()V")
	@Override
	protected void method874() {
		Static51.anInterface3_2.method770(this.anInt1249);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "()V")
	@Override
	protected void method865() {
		Static51.anInterface3_2.method769(this.anInt1249);
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "()V")
	@Override
	protected void method870() {
		Static51.anInterface3_2.method768(this.anInt1249, super.anIntArray158);
	}

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "(I)V")
	@Override
	public void method864(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static51.anInterface3_2.method771(arg0, this.anInt1249);
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "()I")
	@Override
	protected int method869() {
		return Static51.anInterface3_2.method773(this.anInt1249);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method873(@OriginalArg(0) Component arg0) throws Exception {
		Static51.anInterface3_2.method772(Static107.anInt2405, Static28.aBoolean29, arg0);
	}
}
