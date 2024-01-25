import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public final class Class284 {

	@OriginalMember(owner = "client!pj", name = "d", descriptor = "Lclient!nv;")
	private final Class33_Sub2_Sub1 aClass33_Sub2_Sub1_10;

	@OriginalMember(owner = "client!pj", name = "h", descriptor = "J")
	public final long aLong214;

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Lclient!nv;JI)V")
	public Class284(@OriginalArg(0) Class33_Sub2_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aClass33_Sub2_Sub1_10 = arg0;
		this.aLong214 = arg1;
	}

	@OriginalMember(owner = "client!pj", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass33_Sub2_Sub1_10.method5744(this.aLong214);
		super.finalize();
	}
}
