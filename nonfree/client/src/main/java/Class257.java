import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public final class Class257 {

	@OriginalMember(owner = "client!nu", name = "g", descriptor = "J")
	public final long aLong200;

	@OriginalMember(owner = "client!nu", name = "d", descriptor = "Lclient!md;")
	private final Class144_Sub1_Sub2 aClass144_Sub1_Sub2_10;

	@OriginalMember(owner = "client!nu", name = "<init>", descriptor = "(Lclient!md;J[Lclient!cr;)V")
	public Class257(@OriginalArg(0) Class144_Sub1_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class66[] arg2) {
		this.aLong200 = arg1;
		this.aClass144_Sub1_Sub2_10 = arg0;
	}

	@OriginalMember(owner = "client!nu", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass144_Sub1_Sub2_10.method5781(this.aLong200);
		super.finalize();
	}
}
