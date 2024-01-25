import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public final class Class345 {

	@OriginalMember(owner = "client!su", name = "a", descriptor = "Lclient!mba;")
	private final Class145_Sub1_Sub1 aClass145_Sub1_Sub1_11;

	@OriginalMember(owner = "client!su", name = "g", descriptor = "J")
	public final long aLong294;

	@OriginalMember(owner = "client!su", name = "<init>", descriptor = "(Lclient!mba;JI)V")
	public Class345(@OriginalArg(0) Class145_Sub1_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aClass145_Sub1_Sub1_11 = arg0;
		this.aLong294 = arg1;
	}

	@OriginalMember(owner = "client!su", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass145_Sub1_Sub1_11.method5742(this.aLong294);
		super.finalize();
	}
}
