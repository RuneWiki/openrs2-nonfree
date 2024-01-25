import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public final class Class166 {

	@OriginalMember(owner = "client!hv", name = "e", descriptor = "J")
	public final long aLong115;

	@OriginalMember(owner = "client!hv", name = "d", descriptor = "Lclient!hk;")
	private final Class16_Sub2 aClass16_Sub2_21;

	@OriginalMember(owner = "client!hv", name = "<init>", descriptor = "(Lclient!hk;JI)V")
	public Class166(@OriginalArg(0) Class16_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aLong115 = arg1;
		this.aClass16_Sub2_21 = arg0;
	}

	@OriginalMember(owner = "client!hv", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass16_Sub2_21.method3679(this.aLong115);
		super.finalize();
	}
}
