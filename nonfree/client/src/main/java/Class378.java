import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uw")
public final class Class378 {

	@OriginalMember(owner = "client!uw", name = "e", descriptor = "Lclient!lt;")
	private final Class67_Sub1_Sub2 aClass67_Sub1_Sub2_11;

	@OriginalMember(owner = "client!uw", name = "c", descriptor = "J")
	public final long aLong364;

	@OriginalMember(owner = "client!uw", name = "<init>", descriptor = "(Lclient!lt;JI)V")
	public Class378(@OriginalArg(0) Class67_Sub1_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aClass67_Sub1_Sub2_11 = arg0;
		this.aLong364 = arg1;
	}

	@OriginalMember(owner = "client!uw", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass67_Sub1_Sub2_11.method5692(this.aLong364, (byte) -127);
		super.finalize();
	}
}
