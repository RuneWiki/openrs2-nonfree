import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public final class Class99 {

	@OriginalMember(owner = "client!la", name = "c", descriptor = "I")
	public int anInt2834;

	@OriginalMember(owner = "client!la", name = "b", descriptor = "[Lclient!a;")
	private Class1[] aClass1Array2;

	@OriginalMember(owner = "client!la", name = "d", descriptor = "I")
	private int anInt2835;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(I[Lclient!a;)V")
	public Class99(@OriginalArg(0) int arg0, @OriginalArg(1) Class1[] arg1) {
		this.anInt2834 = arg0;
		this.aClass1Array2 = arg1;
		this.anInt2835 = Static166.anInt3350;
	}

	@OriginalMember(owner = "client!la", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		Static166.method2631(this.anInt2834, this.aClass1Array2, this.anInt2835);
		super.finalize();
	}
}
