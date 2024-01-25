import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public final class Class33_Sub2 extends Class33 implements Interface10 {

	@OriginalMember(owner = "client!rc", name = "i", descriptor = "I")
	private int anInt7261;

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lclient!uq;I[BI)V")
	public Class33_Sub2(@OriginalArg(0) Class122_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt7261 = arg1;
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)J")
	@Override
	public long method6549() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)I")
	@Override
	public int method6547() {
		return 0;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)I")
	@Override
	public int method6548() {
		return this.anInt7261;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(B[BII)V")
	@Override
	public void method6550(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		this.method6072(arg0, arg1);
		this.anInt7261 = 5123;
	}
}
