import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public final class Class203 {

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "Lclient!vj;")
	private final Class45_Sub3 aClass45_Sub3_33;

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "J")
	public final long aLong149;

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Lclient!vj;JI)V")
	public Class203(@OriginalArg(0) Class45_Sub3 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aClass45_Sub3_33 = arg0;
		this.aLong149 = arg1;
	}

	@OriginalMember(owner = "client!mc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass45_Sub3_33.method7470(this.aLong149);
		super.finalize();
	}
}
