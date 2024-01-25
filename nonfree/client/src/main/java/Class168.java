import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public final class Class168 {

	@OriginalMember(owner = "client!ku", name = "e", descriptor = "I")
	public final int anInt4664;

	@OriginalMember(owner = "client!ku", name = "h", descriptor = "Lclient!os;")
	private final Class39_Sub3 aClass39_Sub3_22;

	@OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(Lclient!os;II)V")
	public Class168(@OriginalArg(0) Class39_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4664 = arg2;
		this.aClass39_Sub3_22 = arg0;
	}

	@OriginalMember(owner = "client!ku", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass39_Sub3_22.method5692(this.anInt4664);
		super.finalize();
	}
}
