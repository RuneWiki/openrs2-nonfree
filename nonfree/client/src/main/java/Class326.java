import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public final class Class326 {

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "Lclient!eq;")
	private final Class33_Sub3 aClass33_Sub3_39;

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "J")
	public final long aLong247;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Lclient!eq;J[Lclient!ci;)V")
	public Class326(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class45[] arg2) {
		this.aClass33_Sub3_39 = arg0;
		this.aLong247 = arg1;
	}

	@OriginalMember(owner = "client!ua", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass33_Sub3_39.method3021(this.aLong247);
		super.finalize();
	}
}
