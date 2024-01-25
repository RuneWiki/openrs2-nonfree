import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bq")
public final class Class20_Sub1_Sub1 extends Class20_Sub1 {

	@OriginalMember(owner = "client!bq", name = "N", descriptor = "[B")
	private byte[] aByteArray10;

	@OriginalMember(owner = "client!bq", name = "<init>", descriptor = "()V")
	public Class20_Sub1_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!bq", name = "b", descriptor = "(III)[B")
	public byte[] method538() {
		this.aByteArray10 = new byte[524288];
		this.method5504();
		return this.aByteArray10;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IB)V")
	@Override
	protected void method536(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(7) int local7 = arg1 & 0xFF;
		@Pc(10) int local10 = local3;
		@Pc(11) int local11 = local3 + 1;
		this.aByteArray10[local10] = (byte) (local7 * 3 >> 5);
		this.aByteArray10[local11] = (byte) (local7 * 3 >> 5);
	}
}
