import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ESUFCMYV")
public final class Class11 {

	@OriginalMember(owner = "client!ESUFCMYV", name = "b", descriptor = "[B")
	private byte[] aByteArray2;

	@OriginalMember(owner = "client!ESUFCMYV", name = "c", descriptor = "I")
	private int anInt112;

	@OriginalMember(owner = "client!ESUFCMYV", name = "d", descriptor = "[I")
	private int[] anIntArray36;

	@OriginalMember(owner = "client!ESUFCMYV", name = "e", descriptor = "[I")
	private int[] anIntArray37;

	@OriginalMember(owner = "client!ESUFCMYV", name = "f", descriptor = "[I")
	private int[] anIntArray38;

	@OriginalMember(owner = "client!ESUFCMYV", name = "g", descriptor = "[I")
	private int[] anIntArray39;

	@OriginalMember(owner = "client!ESUFCMYV", name = "h", descriptor = "Z")
	private boolean aBoolean34;

	@OriginalMember(owner = "client!ESUFCMYV", name = "a", descriptor = "Z")
	private boolean aBoolean33 = false;

	@OriginalMember(owner = "client!ESUFCMYV", name = "<init>", descriptor = "(B[B)V")
	public Class11(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1) {
		try {
			@Pc(9) boolean local9 = false;
			this.method88(arg1);
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("23691, " + arg0 + ", " + arg1 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ESUFCMYV", name = "a", descriptor = "(I[B)V")
	private void method88(@OriginalArg(1) byte[] arg0) {
		try {
			@Pc(7) Class6_Sub1_Sub4 local7 = new Class6_Sub1_Sub4(arg0, (byte) -17);
			@Pc(10) int local10 = local7.method415();
			@Pc(13) int local13 = local7.method415();
			if (local13 == local10) {
				this.aByteArray2 = arg0;
				this.aBoolean34 = false;
			} else {
				@Pc(19) byte[] local19 = new byte[local10];
				Class31.method310(local19, local10, arg0, local13, 6);
				this.aByteArray2 = local19;
				local7 = new Class6_Sub1_Sub4(this.aByteArray2, (byte) -17);
				this.aBoolean34 = true;
			}
			this.anInt112 = local7.method413();
			this.anIntArray36 = new int[this.anInt112];
			this.anIntArray37 = new int[this.anInt112];
			this.anIntArray38 = new int[this.anInt112];
			this.anIntArray39 = new int[this.anInt112];
			@Pc(90) int local90 = local7.anInt704 + this.anInt112 * 10;
			for (@Pc(92) int local92 = 0; local92 < this.anInt112; local92++) {
				this.anIntArray36[local92] = local7.method416();
				this.anIntArray37[local92] = local7.method415();
				this.anIntArray38[local92] = local7.method415();
				this.anIntArray39[local92] = local90;
				local90 += this.anIntArray38[local92];
			}
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("79476, " + 0 + ", " + arg0 + ", " + local131.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ESUFCMYV", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
	public byte[] method89(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(3) int local3 = 0;
		@Pc(6) String local6 = arg0.toUpperCase();
		for (@Pc(8) int local8 = 0; local8 < local6.length(); local8++) {
			local3 = local3 * 61 + local6.charAt(local8) - 32;
		}
		for (@Pc(27) int local27 = 0; local27 < this.anInt112; local27++) {
			if (this.anIntArray36[local27] == local3) {
				if (arg1 == null) {
					arg1 = new byte[this.anIntArray37[local27]];
				}
				if (this.aBoolean34) {
					for (@Pc(67) int local67 = 0; local67 < this.anIntArray37[local27]; local67++) {
						arg1[local67] = this.aByteArray2[this.anIntArray39[local27] + local67];
					}
				} else {
					Class31.method310(arg1, this.anIntArray37[local27], this.aByteArray2, this.anIntArray38[local27], this.anIntArray39[local27]);
				}
				return arg1;
			}
		}
		return null;
	}
}
