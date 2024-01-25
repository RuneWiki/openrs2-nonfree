import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vda")
public final class Class12_Sub1_Sub2 extends Class12_Sub1 {

	@OriginalMember(owner = "client!vda", name = "I", descriptor = "[C")
	private static final char[] aCharArray6 = new char[64];

	@OriginalMember(owner = "client!vda", name = "P", descriptor = "[B")
	private byte[] aByteArray109;

	static {
		for (@Pc(48) int local48 = 0; local48 < 26; local48++) {
			aCharArray6[local48] = (char) (local48 + 65);
		}
		for (@Pc(62) int local62 = 26; local62 < 52; local62++) {
			aCharArray6[local62] = (char) (local62 + 97 - 26);
		}
		for (@Pc(78) int local78 = 52; local78 < 62; local78++) {
			aCharArray6[local78] = (char) (local78 + 48 - 52);
		}
		aCharArray6[63] = '-';
		aCharArray6[62] = '*';
	}

	@OriginalMember(owner = "client!vda", name = "<init>", descriptor = "()V")
	public Class12_Sub1_Sub2() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!vda", name = "b", descriptor = "(IIII)[B")
	public byte[] method8934() {
		this.aByteArray109 = new byte[524288];
		this.method8927();
		return this.aByteArray109;
	}

	@OriginalMember(owner = "client!vda", name = "b", descriptor = "(IIB)V")
	@Override
	protected void method8932(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(11) int local11 = arg1 & 0xFF;
		@Pc(18) int local18 = local7;
		@Pc(19) int local19 = local7 + 1;
		this.aByteArray109[local18] = (byte) (local11 * 3 >> 5);
		this.aByteArray109[local19] = (byte) (local11 * 3 >> 5);
	}
}
