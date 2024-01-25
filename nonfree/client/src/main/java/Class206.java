import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public final class Class206 {

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "J")
	public final long aLong183;

	@OriginalMember(owner = "client!ni", name = "c", descriptor = "Lclient!ad;")
	private final Class5_Sub1 aClass5_Sub1_25;

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Lclient!ad;JI)V")
	public Class206(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aLong183 = arg1;
		this.aClass5_Sub1_25 = arg0;
	}

	@OriginalMember(owner = "client!ni", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass5_Sub1_25.method420(this.aLong183);
		super.finalize();
	}
}
