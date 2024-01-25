import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public final class Class118 {

	@OriginalMember(owner = "client!g", name = "f", descriptor = "Lclient!uca;")
	private final Class162_Sub3 aClass162_Sub3_17;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "J")
	public final long aLong61;

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lclient!uca;JI)V")
	public Class118(@OriginalArg(0) Class162_Sub3 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aClass162_Sub3_17 = arg0;
		this.aLong61 = arg1;
	}

	@OriginalMember(owner = "client!g", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass162_Sub3_17.method6959(this.aLong61);
		super.finalize();
	}
}
