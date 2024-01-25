import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public final class Class362 {

	@OriginalMember(owner = "client!w", name = "b", descriptor = "Lclient!nv;")
	private final Class16_Sub3 aClass16_Sub3_43;

	@OriginalMember(owner = "client!w", name = "h", descriptor = "J")
	public final long aLong272;

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Lclient!nv;JI)V")
	public Class362(@OriginalArg(0) Class16_Sub3 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aClass16_Sub3_43 = arg0;
		this.aLong272 = arg1;
	}

	@OriginalMember(owner = "client!w", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass16_Sub3_43.method5994(this.aLong272);
		super.finalize();
	}
}
