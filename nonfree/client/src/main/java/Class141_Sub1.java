import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public final class Class141_Sub1 extends Class141 {

	@OriginalMember(owner = "client!kq", name = "I", descriptor = "I")
	private final int anInt4152;

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Lclient!js;I)V")
	public Class141_Sub1(@OriginalArg(0) Class131 arg0, @OriginalArg(1) int arg1) {
		Static214.anInterface1_2 = arg0.method3066();
		this.anInt4152 = arg1;
	}

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "(I)V")
	@Override
	public void method5191(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static214.anInterface1_2.method1175(arg0, this.anInt4152);
	}

	@OriginalMember(owner = "client!kq", name = "d", descriptor = "()I")
	@Override
	protected int method5195() {
		return Static214.anInterface1_2.method1173(this.anInt4152);
	}

	@OriginalMember(owner = "client!kq", name = "c", descriptor = "()V")
	@Override
	protected void method5194() {
		Static214.anInterface1_2.method1171(this.anInt4152);
	}

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "()V")
	@Override
	protected void method5193() {
		Static214.anInterface1_2.method1174(this.anInt4152);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "()V")
	@Override
	protected void method5192() {
		Static214.anInterface1_2.method1176(this.anInt4152, super.anIntArray440);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method5189(@OriginalArg(0) Component arg0) throws Exception {
		Static214.anInterface1_2.method1172(Static369.anInt6566, Static451.aBoolean125, arg0);
	}
}
