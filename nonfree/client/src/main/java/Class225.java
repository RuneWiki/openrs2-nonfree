import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public final class Class225 {

	@OriginalMember(owner = "client!rv", name = "d", descriptor = "Lclient!vd;")
	private final Class51_Sub2 aClass51_Sub2_35;

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "J")
	public final long aLong180;

	@OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(Lclient!vd;JI)V")
	public Class225(@OriginalArg(0) Class51_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aClass51_Sub2_35 = arg0;
		this.aLong180 = arg1;
	}

	@OriginalMember(owner = "client!rv", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass51_Sub2_35.method5427(this.aLong180);
		super.finalize();
	}
}
