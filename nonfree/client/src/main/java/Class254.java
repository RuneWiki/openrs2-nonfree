import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public final class Class254 {

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "Lclient!vaa;")
	private final Class22_Sub2_Sub2 aClass22_Sub2_Sub2_9;

	@OriginalMember(owner = "client!mp", name = "c", descriptor = "J")
	public final long aLong220;

	@OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(Lclient!vaa;J[Lclient!qp;)V")
	public Class254(@OriginalArg(0) Class22_Sub2_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class315[] arg2) {
		this.aClass22_Sub2_Sub2_9 = arg0;
		this.aLong220 = arg1;
	}

	@OriginalMember(owner = "client!mp", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass22_Sub2_Sub2_9.method8987(this.aLong220);
		super.finalize();
	}
}
