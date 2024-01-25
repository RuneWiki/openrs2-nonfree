import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public final class Class191_Sub1 extends Class191 {

	@OriginalMember(owner = "client!pe", name = "H", descriptor = "I")
	private final int anInt4913;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Lclient!gt;I)V")
	public Class191_Sub1(@OriginalArg(0) Class93 arg0, @OriginalArg(1) int arg1) {
		Static315.anInterface7_2 = arg0.method2079();
		this.anInt4913 = arg1;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method5012(@OriginalArg(0) Component arg0) throws Exception {
		Static315.anInterface7_2.method2411(Static193.anInt3215, arg0, Static335.aBoolean372);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "()V")
	@Override
	protected void method5002() {
		Static315.anInterface7_2.method2409(this.anInt4913);
	}

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "()I")
	@Override
	protected int method5011() {
		return Static315.anInterface7_2.method2410(this.anInt4913);
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "()V")
	@Override
	protected void method5003() {
		Static315.anInterface7_2.method2414(this.anInt4913, super.anIntArray445);
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)V")
	@Override
	public void method5008(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static315.anInterface7_2.method2413(arg0, this.anInt4913);
	}

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "()V")
	@Override
	protected void method5006() {
		Static315.anInterface7_2.method2412(this.anInt4913);
	}
}
