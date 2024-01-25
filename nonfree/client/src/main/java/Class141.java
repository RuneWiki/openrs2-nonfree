import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public final class Class141 {

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "Lclient!se;")
	private final Class122_Sub2 aClass122_Sub2_27;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
	public final int anInt4199;

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Lclient!se;II)V")
	public Class141(@OriginalArg(0) Class122_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass122_Sub2_27 = arg0;
		this.anInt4199 = arg1;
	}

	@OriginalMember(owner = "client!ne", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass122_Sub2_27.method4813(this.anInt4199);
		super.finalize();
	}
}
