import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public final class Class246 {

	@OriginalMember(owner = "client!on", name = "e", descriptor = "J")
	public final long aLong203;

	@OriginalMember(owner = "client!on", name = "n", descriptor = "Lclient!hl;")
	private final Class5_Sub2_Sub2 aClass5_Sub2_Sub2_7;

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Lclient!hl;JI)V")
	public Class246(@OriginalArg(0) Class5_Sub2_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aLong203 = arg1;
		this.aClass5_Sub2_Sub2_7 = arg0;
	}

	@OriginalMember(owner = "client!on", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass5_Sub2_Sub2_7.method4072(this.aLong203);
		super.finalize();
	}
}
