import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public final class Class20_Sub2 extends Class20 implements Interface18 {

	@OriginalMember(owner = "client!fl", name = "g", descriptor = "I")
	private int anInt3273;

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(Lclient!no;I[BI)V")
	public Class20_Sub2(@OriginalArg(0) Class66_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt3273 = arg1;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)I")
	@Override
	public int method6571() {
		return 0;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIZ[B)V")
	@Override
	public void method6570(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		this.method3000(arg1, arg0);
		this.anInt3273 = 5123;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Z)I")
	@Override
	public int method6573() {
		return this.anInt3273;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)J")
	@Override
	public long method6572() {
		return super.aBuffer3.getAddress();
	}
}
