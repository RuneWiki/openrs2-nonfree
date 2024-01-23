import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public final class Class82 {

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
	public int anInt2582;

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "[Lclient!ha;")
	private Class62[] aClass62Array1;

	@OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
	private int anInt2583;

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(I[Lclient!ha;)V")
	public Class82(@OriginalArg(0) int arg0, @OriginalArg(1) Class62[] arg1) {
		this.anInt2582 = arg0;
		this.aClass62Array1 = arg1;
		this.anInt2583 = Static10.anInt142;
	}

	@OriginalMember(owner = "client!jd", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		Static10.method129(this.anInt2582, this.aClass62Array1, this.anInt2583);
		super.finalize();
	}
}
