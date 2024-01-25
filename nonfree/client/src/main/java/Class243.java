import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public final class Class243 {

	@OriginalMember(owner = "client!uh", name = "f", descriptor = "Lclient!bl;")
	private final Class28_Sub1 aClass28_Sub1_40;

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "J")
	public final long aLong198;

	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(Lclient!bl;JI)V")
	public Class243(@OriginalArg(0) Class28_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aClass28_Sub1_40 = arg0;
		this.aLong198 = arg1;
	}

	@OriginalMember(owner = "client!uh", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass28_Sub1_40.method647(this.aLong198);
		super.finalize();
	}
}
