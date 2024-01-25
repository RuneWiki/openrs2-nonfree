import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public final class Class230 {

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "Lclient!pi;")
	private final Class42_Sub1_Sub2 aClass42_Sub1_Sub2_6;

	@OriginalMember(owner = "client!oj", name = "d", descriptor = "I")
	public final int anInt6606;

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Lclient!pi;II)V")
	public Class230(@OriginalArg(0) Class42_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass42_Sub1_Sub2_6 = arg0;
		this.anInt6606 = arg2;
	}

	@OriginalMember(owner = "client!oj", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass42_Sub1_Sub2_6.method6006(this.anInt6606);
		super.finalize();
	}
}
