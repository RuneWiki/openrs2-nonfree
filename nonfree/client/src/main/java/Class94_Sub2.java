import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public final class Class94_Sub2 extends Class94 {

	@OriginalMember(owner = "client!wo", name = "A", descriptor = "I")
	private final int anInt6956;

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Lclient!rd;I)V")
	public Class94_Sub2(@OriginalArg(0) Class168 arg0, @OriginalArg(1) int arg1) {
		Static354.anInterface3_2 = arg0.method4839();
		this.anInt6956 = arg1;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method5977(@OriginalArg(0) Component arg0) throws Exception {
		Static354.anInterface3_2.method3552(Static18.aBoolean55, Static65.anInt1429, arg0);
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "()V")
	@Override
	protected void method5970() {
		Static354.anInterface3_2.method3554(this.anInt6956);
	}

	@OriginalMember(owner = "client!wo", name = "c", descriptor = "()V")
	@Override
	protected void method5973() {
		Static354.anInterface3_2.method3556(this.anInt6956, super.anIntArray508);
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "()I")
	@Override
	protected int method5971() {
		return Static354.anInterface3_2.method3555(this.anInt6956);
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)V")
	@Override
	public void method5968(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static354.anInterface3_2.method3557(this.anInt6956, arg0);
	}

	@OriginalMember(owner = "client!wo", name = "d", descriptor = "()V")
	@Override
	protected void method5978() {
		Static354.anInterface3_2.method3553(this.anInt6956);
	}
}
