import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hba")
public final class Class18_Sub1_Sub1 extends Class18_Sub1 {

	@OriginalMember(owner = "client!hba", name = "I", descriptor = "[B")
	private byte[] aByteArray39;

	@OriginalMember(owner = "client!hba", name = "<init>", descriptor = "()V")
	public Class18_Sub1_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(IIII)[B")
	public byte[] method3740() {
		this.aByteArray39 = new byte[524288];
		this.method7247();
		return this.aByteArray39;
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(IBB)V")
	@Override
	protected void method6840(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(12) byte local12 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(24) int local24 = arg0 * 2;
		@Pc(27) int local27 = local24;
		@Pc(28) int local28 = local24 + 1;
		this.aByteArray39[local27] = local12;
		this.aByteArray39[local28] = local12;
	}
}
