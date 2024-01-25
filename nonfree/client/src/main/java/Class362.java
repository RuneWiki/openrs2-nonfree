import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public final class Class362 {

	@OriginalMember(owner = "client!uk", name = "d", descriptor = "Lclient!ml;")
	private final Class75_Sub3 aClass75_Sub3_39;

	@OriginalMember(owner = "client!uk", name = "e", descriptor = "J")
	public final long aLong320;

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lclient!ml;JI)V")
	public Class362(@OriginalArg(0) Class75_Sub3 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aClass75_Sub3_39 = arg0;
		this.aLong320 = arg1;
	}

	@OriginalMember(owner = "client!uk", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass75_Sub3_39.method5763(this.aLong320);
		super.finalize();
	}
}
