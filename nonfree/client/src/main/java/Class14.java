import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!INOFEYKQ")
public final class Class14 {

	@OriginalMember(owner = "client!INOFEYKQ", name = "e", descriptor = "[B")
	private byte[] aByteArray3;

	@OriginalMember(owner = "client!INOFEYKQ", name = "f", descriptor = "I")
	private int anInt378;

	@OriginalMember(owner = "client!INOFEYKQ", name = "g", descriptor = "[I")
	private int[] anIntArray100;

	@OriginalMember(owner = "client!INOFEYKQ", name = "h", descriptor = "[I")
	private int[] anIntArray101;

	@OriginalMember(owner = "client!INOFEYKQ", name = "i", descriptor = "[I")
	private int[] anIntArray102;

	@OriginalMember(owner = "client!INOFEYKQ", name = "j", descriptor = "[I")
	private int[] anIntArray103;

	@OriginalMember(owner = "client!INOFEYKQ", name = "k", descriptor = "Z")
	private boolean aBoolean94;

	@OriginalMember(owner = "client!INOFEYKQ", name = "a", descriptor = "I")
	private int anInt376 = 5;

	@OriginalMember(owner = "client!INOFEYKQ", name = "b", descriptor = "I")
	private int anInt377 = 44885;

	@OriginalMember(owner = "client!INOFEYKQ", name = "c", descriptor = "Z")
	private boolean aBoolean92 = true;

	@OriginalMember(owner = "client!INOFEYKQ", name = "d", descriptor = "Z")
	private boolean aBoolean93 = true;

	@OriginalMember(owner = "client!INOFEYKQ", name = "<init>", descriptor = "(Z[B)V")
	public Class14(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1) {
		try {
			this.method201(399, arg1);
			if (arg0) {
				throw new NullPointerException();
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("1561, " + arg0 + ", " + arg1 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!INOFEYKQ", name = "a", descriptor = "(I[B)V")
	private void method201(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		try {
			@Pc(7) Class3_Sub1_Sub3 local7 = new Class3_Sub1_Sub3((byte) -103, arg1);
			@Pc(10) int local10 = local7.method278();
			@Pc(13) int local13 = local7.method278();
			if (local13 == local10) {
				this.aByteArray3 = arg1;
				this.aBoolean94 = false;
			} else {
				@Pc(19) byte[] local19 = new byte[local10];
				Class43.method470(local19, local10, arg1, local13, 6);
				this.aByteArray3 = local19;
				local7 = new Class3_Sub1_Sub3((byte) -103, this.aByteArray3);
				this.aBoolean94 = true;
			}
			this.anInt378 = local7.method276();
			this.anIntArray100 = new int[this.anInt378];
			this.anIntArray101 = new int[this.anInt378];
			this.anIntArray102 = new int[this.anInt378];
			this.anIntArray103 = new int[this.anInt378];
			@Pc(79) int local79 = local7.anInt441 + this.anInt378 * 10;
			@Pc(83) boolean local83 = false;
			for (@Pc(85) int local85 = 0; local85 < this.anInt378; local85++) {
				this.anIntArray100[local85] = local7.method279();
				this.anIntArray101[local85] = local7.method278();
				this.anIntArray102[local85] = local7.method278();
				this.anIntArray103[local85] = local79;
				local79 += this.anIntArray102[local85];
			}
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("36641, " + arg0 + ", " + arg1 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!INOFEYKQ", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
	public byte[] method202(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(3) int local3 = 0;
		@Pc(6) String local6 = arg0.toUpperCase();
		for (@Pc(8) int local8 = 0; local8 < local6.length(); local8++) {
			local3 = local3 * 61 + local6.charAt(local8) - 32;
		}
		for (@Pc(27) int local27 = 0; local27 < this.anInt378; local27++) {
			if (this.anIntArray100[local27] == local3) {
				if (arg1 == null) {
					arg1 = new byte[this.anIntArray101[local27]];
				}
				if (this.aBoolean94) {
					for (@Pc(67) int local67 = 0; local67 < this.anIntArray101[local27]; local67++) {
						arg1[local67] = this.aByteArray3[this.anIntArray103[local27] + local67];
					}
				} else {
					Class43.method470(arg1, this.anIntArray101[local27], this.aByteArray3, this.anIntArray102[local27], this.anIntArray103[local27]);
				}
				return arg1;
			}
		}
		return null;
	}
}
