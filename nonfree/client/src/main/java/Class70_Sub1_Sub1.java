import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class70_Sub1_Sub1 extends Class70_Sub1 {

	@OriginalMember(owner = "client!ee", name = "N", descriptor = "[B")
	private byte[] aByteArray28;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "()V")
	public Class70_Sub1_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIB)V")
	@Override
	protected void method1623(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(21) int local21 = arg1 & 0xFF;
		@Pc(24) int local24 = local7;
		@Pc(25) int local25 = local7 + 1;
		this.aByteArray28[local24] = (byte) (local21 * 3 >> 5);
		this.aByteArray28[local25] = (byte) (local21 * 3 >> 5);
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(IIII)[B")
	public byte[] method1628() {
		this.aByteArray28 = new byte[524288];
		this.method5668();
		return this.aByteArray28;
	}
}
