import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public final class Class3_Sub1 extends Class3 {

	@OriginalMember(owner = "client!ab", name = "O", descriptor = "I")
	private int anInt136;

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Lclient!vl;I)V")
	public Class3_Sub1(@OriginalArg(0) Class177 arg0, @OriginalArg(1) int arg1) {
		Static3.anInterface4_1 = arg0.method4680();
		this.anInt136 = arg1;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method2227(@OriginalArg(0) Component arg0) throws Exception {
		Static3.anInterface4_1.method3353(Static110.anInt2380, arg0, Static82.aBoolean465);
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "()V")
	@Override
	protected void method2233() {
		Static3.anInterface4_1.method3354(this.anInt136, this.anIntArray172);
	}

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "()I")
	@Override
	protected int method2235() {
		return Static3.anInterface4_1.method3355(this.anInt136);
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V")
	@Override
	public void method2238(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static3.anInterface4_1.method3352(arg0, this.anInt136);
	}

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "()V")
	@Override
	protected void method2236() {
		Static3.anInterface4_1.method3350(this.anInt136);
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "()V")
	@Override
	protected void method2232() {
		Static3.anInterface4_1.method3351(this.anInt136);
	}
}
