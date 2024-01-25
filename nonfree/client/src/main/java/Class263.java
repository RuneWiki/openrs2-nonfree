import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public final class Class263 {

	@OriginalMember(owner = "client!pm", name = "h", descriptor = "Lclient!jq;")
	private final Class43_Sub1_Sub2 aClass43_Sub1_Sub2_8;

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "J")
	public final long aLong194;

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Lclient!jq;JI)V")
	public Class263(@OriginalArg(0) Class43_Sub1_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aClass43_Sub1_Sub2_8 = arg0;
		this.aLong194 = arg1;
	}

	@OriginalMember(owner = "client!pm", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass43_Sub1_Sub2_8.method4305(this.aLong194);
		super.finalize();
	}
}
