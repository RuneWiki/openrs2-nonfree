import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public final class Class315 {

	@OriginalMember(owner = "client!qp", name = "g", descriptor = "J")
	public final long aLong278;

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "Lclient!vaa;")
	private final Class22_Sub2_Sub2 aClass22_Sub2_Sub2_11;

	@OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(Lclient!vaa;JI)V")
	public Class315(@OriginalArg(0) Class22_Sub2_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aLong278 = arg1;
		this.aClass22_Sub2_Sub2_11 = arg0;
	}

	@OriginalMember(owner = "client!qp", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass22_Sub2_Sub2_11.method8987(this.aLong278);
		super.finalize();
	}
}
