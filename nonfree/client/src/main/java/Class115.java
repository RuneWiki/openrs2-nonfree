import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fka")
public final class Class115 {

	@OriginalMember(owner = "client!fka", name = "c", descriptor = "J")
	public final long aLong115;

	@OriginalMember(owner = "client!fka", name = "b", descriptor = "Lclient!lt;")
	private final Class67_Sub1_Sub2 aClass67_Sub1_Sub2_6;

	@OriginalMember(owner = "client!fka", name = "<init>", descriptor = "(Lclient!lt;J[Lclient!uw;)V")
	public Class115(@OriginalArg(0) Class67_Sub1_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class378[] arg2) {
		this.aLong115 = arg1;
		this.aClass67_Sub1_Sub2_6 = arg0;
	}

	@OriginalMember(owner = "client!fka", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass67_Sub1_Sub2_6.method5692(this.aLong115, (byte) -108);
		super.finalize();
	}
}
