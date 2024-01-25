import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!afa")
public final class Class11 {

	@OriginalMember(owner = "client!afa", name = "d", descriptor = "Lclient!kfa;")
	private final Class7_Sub2 aClass7_Sub2_3;

	@OriginalMember(owner = "client!afa", name = "f", descriptor = "J")
	public final long aLong6;

	@OriginalMember(owner = "client!afa", name = "<init>", descriptor = "(Lclient!kfa;JI)V")
	public Class11(@OriginalArg(0) Class7_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aClass7_Sub2_3 = arg0;
		this.aLong6 = arg1;
	}

	@OriginalMember(owner = "client!afa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass7_Sub2_3.method4351(this.aLong6);
		super.finalize();
	}
}
