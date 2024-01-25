import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uaa")
public final class Class311 {

	@OriginalMember(owner = "client!uaa", name = "d", descriptor = "Lclient!nfa;")
	private final Class9_Sub3_Sub2 aClass9_Sub3_Sub2_9;

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "I")
	public final int anInt8967;

	@OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "(Lclient!nfa;II)V")
	public Class311(@OriginalArg(0) Class9_Sub3_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass9_Sub3_Sub2_9 = arg0;
		this.anInt8967 = arg2;
	}

	@OriginalMember(owner = "client!uaa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass9_Sub3_Sub2_9.method5605(this.anInt8967);
		super.finalize();
	}
}
