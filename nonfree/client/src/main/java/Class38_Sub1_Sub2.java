import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!os")
public final class Class38_Sub1_Sub2 extends Class38_Sub1 {

	@OriginalMember(owner = "client!os", name = "E", descriptor = "[B")
	private byte[] aByteArray81;

	@OriginalMember(owner = "client!os", name = "<init>", descriptor = "()V")
	public Class38_Sub1_Sub2() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IIB)V")
	@Override
	protected void method5561(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(10) int local10 = local7;
		@Pc(11) int local11 = local7 + 1;
		this.aByteArray81[local10] = -1;
		@Pc(17) int local17 = arg1 & 0xFF;
		this.aByteArray81[local11] = (byte) (local17 * 3 >> 5);
	}

	@OriginalMember(owner = "client!os", name = "b", descriptor = "(IIII)[B")
	public byte[] method5567() {
		this.aByteArray81 = new byte[524288];
		this.method5557();
		return this.aByteArray81;
	}
}
