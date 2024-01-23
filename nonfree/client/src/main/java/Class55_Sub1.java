import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public final class Class55_Sub1 extends Class55 {

	@OriginalMember(owner = "client!jh", name = "P", descriptor = "I")
	private int anInt2985;

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Lclient!d;I)V")
	public Class55_Sub1(@OriginalArg(0) Class28 arg0, @OriginalArg(1) int arg1) {
		Static114.anInterface3_2 = arg0.method727();
		this.anInt2985 = arg1;
	}

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "()I")
	@Override
	protected int method3214() {
		return Static114.anInterface3_2.method3682(this.anInt2985);
	}

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "(I)V")
	@Override
	public void method3206(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static114.anInterface3_2.method3679(arg0, this.anInt2985);
	}

	@OriginalMember(owner = "client!jh", name = "d", descriptor = "()V")
	@Override
	protected void method3221() {
		Static114.anInterface3_2.method3678(this.anInt2985);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method3213(@OriginalArg(0) Component arg0) throws Exception {
		Static114.anInterface3_2.method3683(Static107.anInt2862, arg0, Static121.aBoolean167);
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "()V")
	@Override
	protected void method3211() {
		Static114.anInterface3_2.method3681(this.anInt2985, super.anIntArray320);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "()V")
	@Override
	protected void method3209() {
		Static114.anInterface3_2.method3680(this.anInt2985);
	}
}
