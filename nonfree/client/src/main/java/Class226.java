import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public final class Class226 {

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "Lclient!ia;")
	private final Class15_Sub2_Sub1 aClass15_Sub2_Sub1_7;

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
	public final int anInt6994;

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Lclient!ia;II)V")
	public Class226(@OriginalArg(0) Class15_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass15_Sub2_Sub1_7 = arg0;
		this.anInt6994 = arg2;
	}

	@OriginalMember(owner = "client!ne", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass15_Sub2_Sub1_7.method3630(this.anInt6994);
		super.finalize();
	}
}
