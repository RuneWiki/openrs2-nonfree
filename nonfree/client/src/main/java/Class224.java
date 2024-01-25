import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public final class Class224 {

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "Lclient!mba;")
	private final Class5_Sub1_Sub2 aClass5_Sub1_Sub2_8;

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "J")
	public final long aLong188;

	@OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(Lclient!mba;JI)V")
	public Class224(@OriginalArg(0) Class5_Sub1_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aClass5_Sub1_Sub2_8 = arg0;
		this.aLong188 = arg1;
	}

	@OriginalMember(owner = "client!ms", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass5_Sub1_Sub2_8.method5698(this.aLong188);
		super.finalize();
	}
}
