import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public final class Class296 {

	@OriginalMember(owner = "client!ru", name = "e", descriptor = "I")
	public final int anInt8883;

	@OriginalMember(owner = "client!ru", name = "f", descriptor = "Lclient!kfa;")
	private final Class7_Sub2 aClass7_Sub2_38;

	@OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(Lclient!kfa;II)V")
	public Class296(@OriginalArg(0) Class7_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt8883 = arg2;
		this.aClass7_Sub2_38 = arg0;
	}

	@OriginalMember(owner = "client!ru", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass7_Sub2_38.method4296(this.anInt8883);
		super.finalize();
	}
}
