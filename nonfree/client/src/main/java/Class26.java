import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public final class Class26 {

	@OriginalMember(owner = "client!br", name = "g", descriptor = "Lclient!tt;")
	private final Class200_Sub2 aClass200_Sub2_8;

	@OriginalMember(owner = "client!br", name = "h", descriptor = "J")
	public final long aLong37;

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lclient!tt;J[Lclient!ds;)V")
	public Class26(@OriginalArg(0) Class200_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class54[] arg2) {
		this.aClass200_Sub2_8 = arg0;
		this.aLong37 = arg1;
	}

	@OriginalMember(owner = "client!br", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass200_Sub2_8.method5313(this.aLong37);
		super.finalize();
	}
}
