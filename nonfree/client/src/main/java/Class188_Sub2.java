import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rw")
public final class Class188_Sub2 extends Class188 implements Interface18 {

	@OriginalMember(owner = "client!rw", name = "x", descriptor = "I")
	private int anInt7954;

	@OriginalMember(owner = "client!rw", name = "<init>", descriptor = "(Lclient!no;I[BIZ)V")
	public Class188_Sub2(@OriginalArg(0) Class66_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt7954 = arg1;
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(B)I")
	@Override
	public int method6571() {
		return super.anInt7946;
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(I)J")
	@Override
	public long method6572() {
		return 0L;
	}

	@OriginalMember(owner = "client!rw", name = "d", descriptor = "(I)V")
	@Override
	protected void method6567() {
		super.aClass66_Sub3_34.method5363(this);
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(IIZ[B)V")
	@Override
	public void method6570(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		this.method6565(arg0, arg1);
		this.anInt7954 = 5123;
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(Z)I")
	@Override
	public int method6573() {
		return this.anInt7954;
	}
}
