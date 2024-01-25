import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public final class Class124 {

	@OriginalMember(owner = "client!im", name = "h", descriptor = "J")
	public final long aLong145;

	@OriginalMember(owner = "client!im", name = "c", descriptor = "Lclient!na;")
	private final Class75_Sub2 aClass75_Sub2_15;

	@OriginalMember(owner = "client!im", name = "<init>", descriptor = "(Lclient!na;JI)V")
	public Class124(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aLong145 = arg1;
		this.aClass75_Sub2_15 = arg0;
	}

	@OriginalMember(owner = "client!im", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass75_Sub2_15.method3860(this.aLong145);
		super.finalize();
	}
}
