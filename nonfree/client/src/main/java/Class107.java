import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public final class Class107 {

	@OriginalMember(owner = "client!fr", name = "e", descriptor = "J")
	public final long aLong74;

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "Lclient!kga;")
	private final Class44_Sub3 aClass44_Sub3_15;

	@OriginalMember(owner = "client!fr", name = "<init>", descriptor = "(Lclient!kga;J[Lclient!bba;)V")
	public Class107(@OriginalArg(0) Class44_Sub3 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class27[] arg2) {
		this.aLong74 = arg1;
		this.aClass44_Sub3_15 = arg0;
	}

	@OriginalMember(owner = "client!fr", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass44_Sub3_15.method4678(this.aLong74);
		super.finalize();
	}
}
