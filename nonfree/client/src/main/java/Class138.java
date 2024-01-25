import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public final class Class138 {

	@OriginalMember(owner = "client!is", name = "j", descriptor = "J")
	public final long aLong119;

	@OriginalMember(owner = "client!is", name = "k", descriptor = "Lclient!ad;")
	private final Class5_Sub1 aClass5_Sub1_17;

	@OriginalMember(owner = "client!is", name = "<init>", descriptor = "(Lclient!ad;J[Lclient!ni;)V")
	public Class138(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class206[] arg2) {
		this.aLong119 = arg1;
		this.aClass5_Sub1_17 = arg0;
	}

	@OriginalMember(owner = "client!is", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass5_Sub1_17.method420(this.aLong119);
		super.finalize();
	}
}
