import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oda")
public final class Class148_Sub2_Sub1 extends Class148_Sub2 {

	@OriginalMember(owner = "client!oda", name = "A", descriptor = "[B")
	private byte[] aByteArray71;

	@OriginalMember(owner = "client!oda", name = "<init>", descriptor = "()V")
	public Class148_Sub2_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!oda", name = "b", descriptor = "(IIII)[B")
	public byte[] method5993() {
		this.aByteArray71 = new byte[524288];
		this.method7949();
		return this.aByteArray71;
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(BIB)V")
	@Override
	protected void method7953(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(11) int local11 = arg0 * 2;
		@Pc(20) byte local20 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(23) int local23 = local11;
		@Pc(24) int local24 = local11 + 1;
		this.aByteArray71[local23] = local20;
		this.aByteArray71[local24] = local20;
	}
}
