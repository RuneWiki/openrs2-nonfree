import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public final class Class114 {

	@OriginalMember(owner = "client!ij", name = "d", descriptor = "Lclient!vd;")
	private final Class51_Sub2 aClass51_Sub2_23;

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "J")
	public final long aLong97;

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(Lclient!vd;J[Lclient!rv;)V")
	public Class114(@OriginalArg(0) Class51_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class225[] arg2) {
		this.aClass51_Sub2_23 = arg0;
		this.aLong97 = arg1;
	}

	@OriginalMember(owner = "client!ij", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass51_Sub2_23.method5427(this.aLong97);
		super.finalize();
	}
}
