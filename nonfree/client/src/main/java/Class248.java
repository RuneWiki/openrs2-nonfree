import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public final class Class248 {

	@OriginalMember(owner = "client!nk", name = "g", descriptor = "Lclient!qfa;")
	private final Class137_Sub3 aClass137_Sub3_27;

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "I")
	public final int anInt7377;

	@OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Lclient!qfa;II)V")
	public Class248(@OriginalArg(0) Class137_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass137_Sub3_27 = arg0;
		this.anInt7377 = arg2;
	}

	@OriginalMember(owner = "client!nk", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass137_Sub3_27.method7033(this.anInt7377);
		super.finalize();
	}
}
