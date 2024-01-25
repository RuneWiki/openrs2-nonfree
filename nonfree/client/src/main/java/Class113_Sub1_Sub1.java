import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jn")
public final class Class113_Sub1_Sub1 extends Class113_Sub1 {

	@OriginalMember(owner = "client!jn", name = "I", descriptor = "[B")
	private byte[] aByteArray37;

	@OriginalMember(owner = "client!jn", name = "<init>", descriptor = "()V")
	public Class113_Sub1_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(BIII)[B")
	public byte[] method2860() {
		this.aByteArray37 = new byte[524288];
		this.method4567();
		return this.aByteArray37;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IBB)V")
	@Override
	protected void method2858(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0 * 2;
		@Pc(16) int local16 = arg1 & 0xFF;
		@Pc(19) int local19 = local12;
		@Pc(20) int local20 = local12 + 1;
		this.aByteArray37[local19] = (byte) (local16 * 3 >> 5);
		this.aByteArray37[local20] = (byte) (local16 * 3 >> 5);
	}
}
