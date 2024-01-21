import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!BYZSQZUF")
public final class Class5 {

	@OriginalMember(owner = "client!BYZSQZUF", name = "e", descriptor = "[B")
	private byte[] aByteArray2;

	@OriginalMember(owner = "client!BYZSQZUF", name = "f", descriptor = "I")
	private int anInt105;

	@OriginalMember(owner = "client!BYZSQZUF", name = "g", descriptor = "[I")
	private int[] anIntArray15;

	@OriginalMember(owner = "client!BYZSQZUF", name = "h", descriptor = "[I")
	private int[] anIntArray16;

	@OriginalMember(owner = "client!BYZSQZUF", name = "i", descriptor = "[I")
	private int[] anIntArray17;

	@OriginalMember(owner = "client!BYZSQZUF", name = "j", descriptor = "[I")
	private int[] anIntArray18;

	@OriginalMember(owner = "client!BYZSQZUF", name = "k", descriptor = "Z")
	private boolean aBoolean36;

	@OriginalMember(owner = "client!BYZSQZUF", name = "a", descriptor = "I")
	private int anInt102 = 2;

	@OriginalMember(owner = "client!BYZSQZUF", name = "b", descriptor = "I")
	private int anInt103 = 35904;

	@OriginalMember(owner = "client!BYZSQZUF", name = "c", descriptor = "I")
	private int anInt104 = 26615;

	@OriginalMember(owner = "client!BYZSQZUF", name = "d", descriptor = "Z")
	private boolean aBoolean35 = true;

	@OriginalMember(owner = "client!BYZSQZUF", name = "<init>", descriptor = "(I[B)V")
	public Class5(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		try {
			this.method65(arg1);
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("41299, " + arg0 + ", " + arg1 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BYZSQZUF", name = "a", descriptor = "([BI)V")
	private void method65(@OriginalArg(0) byte[] arg0) {
		try {
			@Pc(7) Class3_Sub1_Sub3 local7 = new Class3_Sub1_Sub3(0, arg0);
			@Pc(10) int local10 = local7.method150();
			@Pc(13) int local13 = local7.method150();
			if (local13 == local10) {
				this.aByteArray2 = arg0;
				this.aBoolean36 = false;
			} else {
				@Pc(26) byte[] local26 = new byte[local10];
				Class28.method310(local26, local10, arg0, local13, 6);
				this.aByteArray2 = local26;
				local7 = new Class3_Sub1_Sub3(0, this.aByteArray2);
				this.aBoolean36 = true;
			}
			this.anInt105 = local7.method148();
			this.anIntArray15 = new int[this.anInt105];
			this.anIntArray16 = new int[this.anInt105];
			this.anIntArray17 = new int[this.anInt105];
			this.anIntArray18 = new int[this.anInt105];
			@Pc(86) int local86 = local7.anInt243 + this.anInt105 * 10;
			for (@Pc(88) int local88 = 0; local88 < this.anInt105; local88++) {
				this.anIntArray15[local88] = local7.method151();
				this.anIntArray16[local88] = local7.method150();
				this.anIntArray17[local88] = local7.method150();
				this.anIntArray18[local88] = local86;
				local86 += this.anIntArray17[local88];
			}
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("61027, " + arg0 + ", " + 8 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BYZSQZUF", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
	public byte[] method66(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(3) int local3 = 0;
		@Pc(6) String local6 = arg0.toUpperCase();
		for (@Pc(8) int local8 = 0; local8 < local6.length(); local8++) {
			local3 = local3 * 61 + local6.charAt(local8) - 32;
		}
		for (@Pc(27) int local27 = 0; local27 < this.anInt105; local27++) {
			if (this.anIntArray15[local27] == local3) {
				if (arg1 == null) {
					arg1 = new byte[this.anIntArray16[local27]];
				}
				if (this.aBoolean36) {
					for (@Pc(67) int local67 = 0; local67 < this.anIntArray16[local27]; local67++) {
						arg1[local67] = this.aByteArray2[this.anIntArray18[local27] + local67];
					}
				} else {
					Class28.method310(arg1, this.anIntArray16[local27], this.aByteArray2, this.anIntArray17[local27], this.anIntArray18[local27]);
				}
				return arg1;
			}
		}
		return null;
	}
}
