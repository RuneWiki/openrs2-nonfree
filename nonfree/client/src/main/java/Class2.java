import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!AWEEREDT")
public final class Class2 {

	@OriginalMember(owner = "client!AWEEREDT", name = "c", descriptor = "[B")
	private byte[] aByteArray1;

	@OriginalMember(owner = "client!AWEEREDT", name = "d", descriptor = "I")
	private int anInt7;

	@OriginalMember(owner = "client!AWEEREDT", name = "e", descriptor = "[I")
	private int[] anIntArray1;

	@OriginalMember(owner = "client!AWEEREDT", name = "f", descriptor = "[I")
	private int[] anIntArray2;

	@OriginalMember(owner = "client!AWEEREDT", name = "g", descriptor = "[I")
	private int[] anIntArray3;

	@OriginalMember(owner = "client!AWEEREDT", name = "h", descriptor = "[I")
	private int[] anIntArray4;

	@OriginalMember(owner = "client!AWEEREDT", name = "i", descriptor = "Z")
	private boolean aBoolean3;

	@OriginalMember(owner = "client!AWEEREDT", name = "a", descriptor = "I")
	private int anInt5 = 1;

	@OriginalMember(owner = "client!AWEEREDT", name = "b", descriptor = "I")
	private int anInt6 = 7;

	@OriginalMember(owner = "client!AWEEREDT", name = "<init>", descriptor = "(I[B)V")
	public Class2(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		try {
			this.method13(arg1);
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("46356, " + arg0 + ", " + arg1 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AWEEREDT", name = "a", descriptor = "(B[B)V")
	private void method13(@OriginalArg(1) byte[] arg0) {
		try {
			@Pc(7) Class8_Sub1_Sub3 local7 = new Class8_Sub1_Sub3(arg0, 713);
			@Pc(10) int local10 = local7.method156();
			@Pc(13) int local13 = local7.method156();
			if (local13 == local10) {
				this.aByteArray1 = arg0;
				this.aBoolean3 = false;
			} else {
				@Pc(19) byte[] local19 = new byte[local10];
				Class28.method297(local19, local10, arg0, local13, 6);
				this.aByteArray1 = local19;
				local7 = new Class8_Sub1_Sub3(this.aByteArray1, 713);
				this.aBoolean3 = true;
			}
			this.anInt7 = local7.method154();
			this.anIntArray1 = new int[this.anInt7];
			this.anIntArray2 = new int[this.anInt7];
			this.anIntArray3 = new int[this.anInt7];
			this.anIntArray4 = new int[this.anInt7];
			@Pc(79) int local79 = local7.anInt239 + this.anInt7 * 10;
			for (@Pc(81) int local81 = 0; local81 < this.anInt7; local81++) {
				this.anIntArray1[local81] = local7.method157();
				this.anIntArray2[local81] = local7.method156();
				this.anIntArray3[local81] = local7.method156();
				this.anIntArray4[local81] = local79;
				local79 += this.anIntArray3[local81];
			}
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("47232, " + 6 + ", " + arg0 + ", " + local126.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AWEEREDT", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
	public byte[] method14(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(3) int local3 = 0;
		@Pc(6) String local6 = arg0.toUpperCase();
		for (@Pc(8) int local8 = 0; local8 < local6.length(); local8++) {
			local3 = local3 * 61 + local6.charAt(local8) - 32;
		}
		for (@Pc(27) int local27 = 0; local27 < this.anInt7; local27++) {
			if (this.anIntArray1[local27] == local3) {
				if (arg1 == null) {
					arg1 = new byte[this.anIntArray2[local27]];
				}
				if (this.aBoolean3) {
					for (@Pc(67) int local67 = 0; local67 < this.anIntArray2[local27]; local67++) {
						arg1[local67] = this.aByteArray1[this.anIntArray4[local27] + local67];
					}
				} else {
					Class28.method297(arg1, this.anIntArray2[local27], this.aByteArray1, this.anIntArray3[local27], this.anIntArray4[local27]);
				}
				return arg1;
			}
		}
		return null;
	}
}
