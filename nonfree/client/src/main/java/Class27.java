import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bba")
public final class Class27 {

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "Lclient!kga;")
	private final Class44_Sub3 aClass44_Sub3_4;

	@OriginalMember(owner = "client!bba", name = "b", descriptor = "J")
	public final long aLong19;

	@OriginalMember(owner = "client!bba", name = "<init>", descriptor = "(Lclient!kga;JI)V")
	public Class27(@OriginalArg(0) Class44_Sub3 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aClass44_Sub3_4 = arg0;
		this.aLong19 = arg1;
	}

	@OriginalMember(owner = "client!bba", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass44_Sub3_4.method4678(this.aLong19);
		super.finalize();
	}
}
