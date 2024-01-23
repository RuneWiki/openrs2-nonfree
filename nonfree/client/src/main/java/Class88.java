import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public final class Class88 {

	@OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
	public int anInt2537;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "[Lclient!ac;")
	private Class4[] aClass4Array1;

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
	private int anInt2536;

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(I[Lclient!ac;)V")
	public Class88(@OriginalArg(0) int arg0, @OriginalArg(1) Class4[] arg1) {
		this.anInt2537 = arg0;
		this.aClass4Array1 = arg1;
		this.anInt2536 = Static74.anInt1419;
	}

	@OriginalMember(owner = "client!jd", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		Static74.method1193(this.anInt2537, this.aClass4Array1, this.anInt2536);
		super.finalize();
	}
}
