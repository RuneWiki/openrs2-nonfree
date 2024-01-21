import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public final class Class15_Sub1 extends Class15 {

	@OriginalMember(owner = "client!gi", name = "O", descriptor = "I")
	private final int anInt1550;

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Lclient!d;I)V")
	public Class15_Sub1(@OriginalArg(0) Class24 arg0, @OriginalArg(1) int arg1) {
		Static67.anInterface2_2 = arg0.method557();
		this.anInt1550 = arg1;
	}

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "()V")
	@Override
	protected void method2624() {
		Static67.anInterface2_2.method2203(this.anInt1550);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "()V")
	@Override
	protected void method2616() {
		Static67.anInterface2_2.method2207(this.anInt1550, super.anIntArray305);
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "()V")
	@Override
	protected void method2623() {
		Static67.anInterface2_2.method2206(this.anInt1550);
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(I)V")
	@Override
	public void method2621(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static67.anInterface2_2.method2204(this.anInt1550, arg0);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method2620(@OriginalArg(0) Component arg0) throws Exception {
		Static67.anInterface2_2.method2208(arg0, Static96.anInt2009, Static151.aBoolean177);
	}

	@OriginalMember(owner = "client!gi", name = "d", descriptor = "()I")
	@Override
	protected int method2626() {
		return Static67.anInterface2_2.method2205(this.anInt1550);
	}
}
