import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public final class Class42_Sub2 extends Class42 {

	@OriginalMember(owner = "client!qb", name = "J", descriptor = "I")
	private int anInt3510;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lclient!mi;I)V")
	public Class42_Sub2(@OriginalArg(0) Class72 arg0, @OriginalArg(1) int arg1) {
		Static162.anInterface4_2 = arg0.method2255();
		this.anInt3510 = arg1;
	}

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "()V")
	@Override
	protected void method2735() {
		Static162.anInterface4_2.method3494(this.anInt3510);
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "()V")
	@Override
	protected void method2733() {
		Static162.anInterface4_2.method3495(this.anInt3510, super.anIntArray228);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method2731(@OriginalArg(0) Component arg0) throws Exception {
		Static162.anInterface4_2.method3491(Static15.aBoolean12, arg0, Static31.anInt702);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "()V")
	@Override
	protected void method2729() {
		Static162.anInterface4_2.method3493(this.anInt3510);
	}

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "()I")
	@Override
	protected int method2738() {
		return Static162.anInterface4_2.method3492(this.anInt3510);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
	@Override
	public void method2727(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static162.anInterface4_2.method3496(this.anInt3510, arg0);
	}
}
