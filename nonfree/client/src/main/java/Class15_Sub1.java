import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public final class Class15_Sub1 extends Class15 {

	@OriginalMember(owner = "client!ms", name = "M", descriptor = "I")
	private final int anInt4169;

	@OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(Lclient!bd;I)V")
	public Class15_Sub1(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1) {
		Static208.anInterface8_2 = arg0.method382();
		this.anInt4169 = arg1;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "()V")
	@Override
	protected void method4457() {
		Static208.anInterface8_2.method4615(this.anInt4169);
	}

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "()V")
	@Override
	protected void method4458() {
		Static208.anInterface8_2.method4617(this.anInt4169, super.anIntArray674);
	}

	@OriginalMember(owner = "client!ms", name = "d", descriptor = "(I)V")
	@Override
	public void method4470(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static208.anInterface8_2.method4612(arg0, this.anInt4169);
	}

	@OriginalMember(owner = "client!ms", name = "c", descriptor = "()I")
	@Override
	protected int method4460() {
		return Static208.anInterface8_2.method4616(this.anInt4169);
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method4469(@OriginalArg(0) Component arg0) throws Exception {
		Static208.anInterface8_2.method4613(Static103.aBoolean170, arg0, Static172.anInt2667);
	}

	@OriginalMember(owner = "client!ms", name = "d", descriptor = "()V")
	@Override
	protected void method4467() {
		Static208.anInterface8_2.method4614(this.anInt4169);
	}
}
