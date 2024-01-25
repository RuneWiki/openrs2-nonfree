import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oca")
public final class Class260 {

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "J")
	public final long aLong199;

	@OriginalMember(owner = "client!oca", name = "b", descriptor = "Lclient!oia;")
	private final Class16_Sub1_Sub2 aClass16_Sub1_Sub2_8;

	@OriginalMember(owner = "client!oca", name = "<init>", descriptor = "(Lclient!oia;J[Lclient!wja;)V")
	public Class260(@OriginalArg(0) Class16_Sub1_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class391[] arg2) {
		this.aLong199 = arg1;
		this.aClass16_Sub1_Sub2_8 = arg0;
	}

	@OriginalMember(owner = "client!oca", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass16_Sub1_Sub2_8.method6333(this.aLong199);
		super.finalize();
	}
}
