import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public final class Class56 {

	@OriginalMember(owner = "client!cd", name = "f", descriptor = "Lclient!uja;")
	private final Class145_Sub3 aClass145_Sub3_4;

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
	public final int anInt1316;

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lclient!uja;II)V")
	public Class56(@OriginalArg(0) Class145_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass145_Sub3_4 = arg0;
		this.anInt1316 = arg2;
	}

	@OriginalMember(owner = "client!cd", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass145_Sub3_4.method8902(this.anInt1316);
		super.finalize();
	}
}
