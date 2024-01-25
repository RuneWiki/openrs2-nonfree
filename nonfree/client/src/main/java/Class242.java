import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public final class Class242 {

	@OriginalMember(owner = "client!ob", name = "g", descriptor = "I")
	public final int anInt7252;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "Lclient!mba;")
	private final Class5_Sub1_Sub2 aClass5_Sub1_Sub2_11;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lclient!mba;II)V")
	public Class242(@OriginalArg(0) Class5_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt7252 = arg2;
		this.aClass5_Sub1_Sub2_11 = arg0;
	}

	@OriginalMember(owner = "client!ob", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass5_Sub1_Sub2_11.method5702(this.anInt7252);
		super.finalize();
	}
}
