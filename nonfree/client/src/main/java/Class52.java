import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public final class Class52 {

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "Lclient!nv;")
	private final Class33_Sub2_Sub1 aClass33_Sub2_Sub1_6;

	@OriginalMember(owner = "client!ct", name = "e", descriptor = "J")
	public final long aLong53;

	@OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(Lclient!nv;J[Lclient!pj;)V")
	public Class52(@OriginalArg(0) Class33_Sub2_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class284[] arg2) {
		this.aClass33_Sub2_Sub1_6 = arg0;
		this.aLong53 = arg1;
	}

	@OriginalMember(owner = "client!ct", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass33_Sub2_Sub1_6.method5744(this.aLong53);
		super.finalize();
	}
}
