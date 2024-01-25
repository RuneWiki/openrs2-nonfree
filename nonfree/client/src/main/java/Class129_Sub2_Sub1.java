import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class129_Sub2_Sub1 extends Class129_Sub2 {

	@OriginalMember(owner = "client!th", name = "E", descriptor = "[B")
	private byte[] aByteArray94;

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "()V")
	public Class129_Sub2_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(III)[B")
	public byte[] method5198() {
		this.aByteArray94 = new byte[524288];
		this.method5190();
		return this.aByteArray94;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IB)V")
	@Override
	protected void method5197(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(7) int local7 = arg1 & 0xFF;
		@Pc(10) int local10 = local3;
		@Pc(11) int local11 = local3 + 1;
		this.aByteArray94[local10] = (byte) (local7 * 3 >> 5);
		this.aByteArray94[local11] = (byte) (local7 * 3 >> 5);
	}
}
