import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public final class Class235 {

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "Lclient!qg;")
	private final Class121_Sub2 aClass121_Sub2_36;

	@OriginalMember(owner = "client!ub", name = "h", descriptor = "I")
	public final int anInt7103;

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lclient!qg;II)V")
	public Class235(@OriginalArg(0) Class121_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass121_Sub2_36 = arg0;
		this.anInt7103 = arg2;
	}

	@OriginalMember(owner = "client!ub", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass121_Sub2_36.method4693(this.anInt7103);
		super.finalize();
	}
}
