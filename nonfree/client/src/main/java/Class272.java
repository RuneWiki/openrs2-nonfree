import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sca")
public final class Class272 {

	@OriginalMember(owner = "client!sca", name = "d", descriptor = "Lclient!gi;")
	private final Class42_Sub3 aClass42_Sub3_35;

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "J")
	public final long aLong208;

	@OriginalMember(owner = "client!sca", name = "<init>", descriptor = "(Lclient!gi;JI)V")
	public Class272(@OriginalArg(0) Class42_Sub3 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aClass42_Sub3_35 = arg0;
		this.aLong208 = arg1;
	}

	@OriginalMember(owner = "client!sca", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass42_Sub3_35.method3224(this.aLong208);
		super.finalize();
	}
}
