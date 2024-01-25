import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public final class Class248 {

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
	public final int anInt7338;

	@OriginalMember(owner = "client!ph", name = "h", descriptor = "Lclient!ap;")
	private final Class9_Sub2 aClass9_Sub2_29;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Lclient!ap;II)V")
	public Class248(@OriginalArg(0) Class9_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt7338 = arg2;
		this.aClass9_Sub2_29 = arg0;
	}

	@OriginalMember(owner = "client!ph", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass9_Sub2_29.method813(this.anInt7338);
		super.finalize();
	}
}
