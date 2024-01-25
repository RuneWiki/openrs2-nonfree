import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public final class Class250 {

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "Lclient!dga;")
	private final Class75_Sub1_Sub1 aClass75_Sub1_Sub1_11;

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
	public final int anInt6875;

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Lclient!dga;II)V")
	public Class250(@OriginalArg(0) Class75_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass75_Sub1_Sub1_11 = arg0;
		this.anInt6875 = arg2;
	}

	@OriginalMember(owner = "client!nh", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass75_Sub1_Sub1_11.method1958(this.anInt6875);
		super.finalize();
	}
}
