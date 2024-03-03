import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public final class Class166 {

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "[I")
	public static final int[] anIntArray293 = new int[2];

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "Lclient!bf;")
	private final Class19_Sub1 aClass19_Sub1_25;

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
	public final int anInt4497;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lclient!bf;I[Lclient!cg;)V", line = 14)
	public Class166(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class35[] arg2) {
		this.aClass19_Sub1_25 = arg0;
		this.anInt4497 = arg1;
	}

	@OriginalMember(owner = "client!oa", name = "finalize", descriptor = "()V", line = 3)
	@Override
	public void finalize() throws Throwable {
		this.aClass19_Sub1_25.method820(this.anInt4497);
		super.finalize();
	}
}
