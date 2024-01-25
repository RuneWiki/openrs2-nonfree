import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fs")
public final class Class38_Sub2_Sub1 extends Class38_Sub2 {

	@OriginalMember(owner = "client!fs", name = "y", descriptor = "[B")
	private byte[] aByteArray37;

	@OriginalMember(owner = "client!fs", name = "<init>", descriptor = "()V")
	public Class38_Sub2_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "(IIII)[B")
	public byte[] method2501() {
		this.aByteArray37 = new byte[524288];
		this.method5557();
		return this.aByteArray37;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIB)V")
	@Override
	protected void method4311(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(16) byte local16 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(19) int local19 = local7;
		@Pc(20) int local20 = local7 + 1;
		this.aByteArray37[local19] = local16;
		this.aByteArray37[local20] = local16;
	}
}
