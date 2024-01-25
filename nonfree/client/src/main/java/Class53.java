import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public final class Class53 {

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "I")
	public final int anInt1181;

	@OriginalMember(owner = "client!ch", name = "d", descriptor = "Lclient!mc;")
	private final Class90_Sub3_Sub1 aClass90_Sub3_Sub1_5;

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Lclient!mc;II)V")
	public Class53(@OriginalArg(0) Class90_Sub3_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1181 = arg2;
		this.aClass90_Sub3_Sub1_5 = arg0;
	}

	@OriginalMember(owner = "client!ch", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass90_Sub3_Sub1_5.method4886(this.anInt1181);
		super.finalize();
	}
}
