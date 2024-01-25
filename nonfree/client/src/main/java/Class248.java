import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public final class Class248 {

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "Lclient!uq;")
	private final Class122_Sub3 aClass122_Sub3_30;

	@OriginalMember(owner = "client!qj", name = "e", descriptor = "I")
	public final int anInt7049;

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Lclient!uq;II)V")
	public Class248(@OriginalArg(0) Class122_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass122_Sub3_30 = arg0;
		this.anInt7049 = arg2;
	}

	@OriginalMember(owner = "client!qj", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass122_Sub3_30.method6882(this.anInt7049);
		super.finalize();
	}
}
