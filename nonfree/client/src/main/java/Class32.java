import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!QDHHNYHL")
public final class Class32 {

	@OriginalMember(owner = "client!QDHHNYHL", name = "f", descriptor = "[B")
	private byte[] aByteArray11;

	@OriginalMember(owner = "client!QDHHNYHL", name = "g", descriptor = "I")
	private int anInt541;

	@OriginalMember(owner = "client!QDHHNYHL", name = "h", descriptor = "[I")
	private int[] anIntArray141;

	@OriginalMember(owner = "client!QDHHNYHL", name = "i", descriptor = "[I")
	private int[] anIntArray142;

	@OriginalMember(owner = "client!QDHHNYHL", name = "j", descriptor = "[I")
	private int[] anIntArray143;

	@OriginalMember(owner = "client!QDHHNYHL", name = "k", descriptor = "[I")
	private int[] anIntArray144;

	@OriginalMember(owner = "client!QDHHNYHL", name = "l", descriptor = "Z")
	private boolean aBoolean142;

	@OriginalMember(owner = "client!QDHHNYHL", name = "a", descriptor = "I")
	private int anInt538 = -110;

	@OriginalMember(owner = "client!QDHHNYHL", name = "b", descriptor = "I")
	private int anInt539 = 6;

	@OriginalMember(owner = "client!QDHHNYHL", name = "c", descriptor = "I")
	private int anInt540 = -8226;

	@OriginalMember(owner = "client!QDHHNYHL", name = "d", descriptor = "Z")
	private boolean aBoolean140 = true;

	@OriginalMember(owner = "client!QDHHNYHL", name = "e", descriptor = "Z")
	private boolean aBoolean141 = true;

	@OriginalMember(owner = "client!QDHHNYHL", name = "<init>", descriptor = "([BI)V")
	public Class32(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		try {
			this.method425(arg0);
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("44669, " + arg0 + ", " + arg1 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QDHHNYHL", name = "a", descriptor = "([BI)V")
	private void method425(@OriginalArg(0) byte[] arg0) {
		try {
			@Pc(7) Class4_Sub1_Sub4 local7 = new Class4_Sub1_Sub4(5, arg0);
			@Pc(10) int local10 = local7.method359();
			@Pc(13) int local13 = local7.method359();
			if (local13 == local10) {
				this.aByteArray11 = arg0;
				this.aBoolean142 = false;
			} else {
				@Pc(19) byte[] local19 = new byte[local10];
				Class26.method305(local19, local10, arg0, local13, 6);
				this.aByteArray11 = local19;
				local7 = new Class4_Sub1_Sub4(5, this.aByteArray11);
				this.aBoolean142 = true;
			}
			this.anInt541 = local7.method357();
			this.anIntArray141 = new int[this.anInt541];
			this.anIntArray142 = new int[this.anInt541];
			this.anIntArray143 = new int[this.anInt541];
			this.anIntArray144 = new int[this.anInt541];
			@Pc(79) int local79 = local7.anInt506 + this.anInt541 * 10;
			for (@Pc(81) int local81 = 0; local81 < this.anInt541; local81++) {
				this.anIntArray141[local81] = local7.method360();
				this.anIntArray142[local81] = local7.method359();
				this.anIntArray143[local81] = local7.method359();
				this.anIntArray144[local81] = local79;
				local79 += this.anIntArray143[local81];
			}
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("78045, " + arg0 + ", " + -42597 + ", " + local126.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QDHHNYHL", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
	public byte[] method426(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(3) int local3 = 0;
		@Pc(6) String local6 = arg0.toUpperCase();
		for (@Pc(8) int local8 = 0; local8 < local6.length(); local8++) {
			local3 = local3 * 61 + local6.charAt(local8) - 32;
		}
		for (@Pc(27) int local27 = 0; local27 < this.anInt541; local27++) {
			if (this.anIntArray141[local27] == local3) {
				if (arg1 == null) {
					arg1 = new byte[this.anIntArray142[local27]];
				}
				if (this.aBoolean142) {
					for (@Pc(67) int local67 = 0; local67 < this.anIntArray142[local27]; local67++) {
						arg1[local67] = this.aByteArray11[this.anIntArray144[local27] + local67];
					}
				} else {
					Class26.method305(arg1, this.anIntArray142[local27], this.aByteArray11, this.anIntArray143[local27], this.anIntArray144[local27]);
				}
				return arg1;
			}
		}
		return null;
	}
}
