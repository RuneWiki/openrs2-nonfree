import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public final class Class150 {

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "I")
	public int anInt5043;

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "[Lclient!dn;")
	private Class41[] aClass41Array2;

	@OriginalMember(owner = "client!sl", name = "d", descriptor = "I")
	private int anInt5044;

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(I[Lclient!dn;)V")
	public Class150(@OriginalArg(0) int arg0, @OriginalArg(1) Class41[] arg1) {
		this.anInt5043 = arg0;
		this.aClass41Array2 = arg1;
		this.anInt5044 = Static154.anInt2852;
	}

	@OriginalMember(owner = "client!sl", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		Static154.method2372(this.anInt5043, this.aClass41Array2, this.anInt5044);
		super.finalize();
	}
}
