import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public final class Class17 {

	@OriginalMember(owner = "client!b", name = "b", descriptor = "Lclient!se;")
	private final Class122_Sub2 aClass122_Sub2_2;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "I")
	public final int anInt524;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lclient!se;I[Lclient!ne;)V")
	public Class17(@OriginalArg(0) Class122_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class141[] arg2) {
		this.aClass122_Sub2_2 = arg0;
		this.anInt524 = arg1;
	}

	@OriginalMember(owner = "client!b", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass122_Sub2_2.method4813(this.anInt524);
		super.finalize();
	}
}
