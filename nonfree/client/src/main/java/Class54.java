import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public final class Class54 {

	@OriginalMember(owner = "client!ds", name = "e", descriptor = "J")
	public final long aLong53;

	@OriginalMember(owner = "client!ds", name = "d", descriptor = "Lclient!tt;")
	private final Class200_Sub2 aClass200_Sub2_14;

	@OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(Lclient!tt;JI)V")
	public Class54(@OriginalArg(0) Class200_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aLong53 = arg1;
		this.aClass200_Sub2_14 = arg0;
	}

	@OriginalMember(owner = "client!ds", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass200_Sub2_14.method5313(this.aLong53);
		super.finalize();
	}
}
