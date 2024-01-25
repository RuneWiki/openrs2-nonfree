import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public final class Class80 {

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "J")
	public final long aLong58;

	@OriginalMember(owner = "client!dl", name = "e", descriptor = "Lclient!lm;")
	private final Class100_Sub1_Sub2 aClass100_Sub1_Sub2_4;

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Lclient!lm;J[Lclient!cb;)V")
	public Class80(@OriginalArg(0) Class100_Sub1_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class46[] arg2) {
		this.aLong58 = arg1;
		this.aClass100_Sub1_Sub2_4 = arg0;
	}

	@OriginalMember(owner = "client!dl", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass100_Sub1_Sub2_4.method4886(this.aLong58);
		super.finalize();
	}
}
