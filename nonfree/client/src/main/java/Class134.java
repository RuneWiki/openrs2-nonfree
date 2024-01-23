import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public final class Class134 {

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
	public int anInt4168;

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "[Lclient!fc;")
	private Class43[] aClass43Array2;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
	private int anInt4167;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(I[Lclient!fc;)V")
	public Class134(@OriginalArg(0) int arg0, @OriginalArg(1) Class43[] arg1) {
		this.anInt4168 = arg0;
		this.aClass43Array2 = arg1;
		this.anInt4167 = Static94.anInt2207;
	}

	@OriginalMember(owner = "client!qb", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		Static94.method1745(this.anInt4168, this.aClass43Array2, this.anInt4167);
		super.finalize();
	}
}
