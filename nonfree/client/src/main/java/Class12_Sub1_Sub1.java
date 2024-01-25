import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class12_Sub1_Sub1 extends Class12_Sub1 {

	@OriginalMember(owner = "client!ee", name = "I", descriptor = "[B")
	private byte[] aByteArray39;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "()V")
	public Class12_Sub1_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIB)V")
	@Override
	protected void method6180(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(19) int local19 = arg1 & 0xFF;
		@Pc(22) int local22 = local7;
		@Pc(23) int local23 = local7 + 1;
		this.aByteArray39[local22] = (byte) (local19 * 3 >> 5);
		this.aByteArray39[local23] = (byte) (local19 * 3 >> 5);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIII)[B")
	public byte[] method2075() {
		this.aByteArray39 = new byte[524288];
		this.method6173();
		return this.aByteArray39;
	}
}
