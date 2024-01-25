import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public final class Class117 {

	@OriginalMember(owner = "client!ft", name = "e", descriptor = "Lclient!kw;")
	private final Class5_Sub2 aClass5_Sub2_12;

	@OriginalMember(owner = "client!ft", name = "f", descriptor = "I")
	public final int anInt3241;

	@OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(Lclient!kw;II)V")
	public Class117(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass5_Sub2_12 = arg0;
		this.anInt3241 = arg2;
	}

	@OriginalMember(owner = "client!ft", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass5_Sub2_12.method4959(this.anInt3241);
		super.finalize();
	}
}
