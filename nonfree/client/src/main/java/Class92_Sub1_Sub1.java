import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gs")
public final class Class92_Sub1_Sub1 extends Class92_Sub1 {

	@OriginalMember(owner = "client!gs", name = "Q", descriptor = "[B")
	private byte[] aByteArray34;

	@OriginalMember(owner = "client!gs", name = "<init>", descriptor = "()V")
	public Class92_Sub1_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(BIB)V")
	@Override
	protected void method2064(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int local11 = arg1 * 2;
		@Pc(15) int local15 = arg0 & 0xFF;
		@Pc(18) int local18 = local11;
		@Pc(19) int local19 = local11 + 1;
		this.aByteArray34[local18] = (byte) (local15 * 3 >> 5);
		this.aByteArray34[local19] = (byte) (local15 * 3 >> 5);
	}

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "(IIII)[B")
	public byte[] method2069() {
		this.aByteArray34 = new byte[524288];
		this.method3782();
		return this.aByteArray34;
	}
}
