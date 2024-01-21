import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public final class Class13_Sub1 extends Class13 {

	@OriginalMember(owner = "client!ib", name = "T", descriptor = "I")
	private final int anInt1401;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lclient!je;I)V")
	public Class13_Sub1(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1) {
		Static55.anInterface1_1 = arg0.method950();
		this.anInt1401 = arg1;
	}

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "(I)V")
	@Override
	public void method1608(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static55.anInterface1_1.method1467(this.anInt1401, arg0);
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "()V")
	@Override
	protected void method1596() {
		Static55.anInterface1_1.method1466(this.anInt1401);
	}

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "()V")
	@Override
	protected void method1609() {
		Static55.anInterface1_1.method1464(this.anInt1401, super.anIntArray343);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "()V")
	@Override
	protected void method1594() {
		Static55.anInterface1_1.method1462(this.anInt1401);
	}

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "()I")
	@Override
	protected int method1605() {
		return Static55.anInterface1_1.method1465(this.anInt1401);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method1610(@OriginalArg(0) Component arg0) throws Exception {
		Static55.anInterface1_1.method1463(arg0, Static23.aBoolean34, Static23.anInt713);
	}
}
