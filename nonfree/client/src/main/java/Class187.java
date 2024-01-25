import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public final class Class187 {

	@OriginalMember(owner = "client!jq", name = "d", descriptor = "Lclient!bi;")
	private final Class13_Sub2 aClass13_Sub2_21;

	@OriginalMember(owner = "client!jq", name = "c", descriptor = "I")
	public final int anInt5092;

	@OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(Lclient!bi;II)V")
	public Class187(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass13_Sub2_21 = arg0;
		this.anInt5092 = arg2;
	}

	@OriginalMember(owner = "client!jq", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass13_Sub2_21.method1077(this.anInt5092);
		super.finalize();
	}
}
