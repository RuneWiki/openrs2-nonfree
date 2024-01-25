import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public final class Class111_Sub1 extends Class111 implements Interface2 {

	@OriginalMember(owner = "client!gj", name = "d", descriptor = "I")
	private int anInt3433;

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(Lclient!vj;I[BI)V")
	public Class111_Sub1(@OriginalArg(0) Class45_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt3433 = arg1;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "([BIII)V")
	@Override
	public void method7527(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.method3889(arg0, arg1);
		this.anInt3433 = 5123;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)I")
	@Override
	public int method7526() {
		return this.anInt3433;
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(I)I")
	@Override
	public int method7528() {
		return 0;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Z)J")
	@Override
	public long method7525() {
		return super.aBuffer3.getAddress();
	}
}
