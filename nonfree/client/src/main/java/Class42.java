import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!VSUYIIVA")
public final class Class42 {

	@OriginalMember(owner = "client!VSUYIIVA", name = "d", descriptor = "[B")
	private byte[] aByteArray19;

	@OriginalMember(owner = "client!VSUYIIVA", name = "e", descriptor = "I")
	private int anInt753;

	@OriginalMember(owner = "client!VSUYIIVA", name = "f", descriptor = "[I")
	private int[] anIntArray185;

	@OriginalMember(owner = "client!VSUYIIVA", name = "g", descriptor = "[I")
	private int[] anIntArray186;

	@OriginalMember(owner = "client!VSUYIIVA", name = "h", descriptor = "[I")
	private int[] anIntArray187;

	@OriginalMember(owner = "client!VSUYIIVA", name = "i", descriptor = "[I")
	private int[] anIntArray188;

	@OriginalMember(owner = "client!VSUYIIVA", name = "j", descriptor = "Z")
	private boolean aBoolean208;

	@OriginalMember(owner = "client!VSUYIIVA", name = "a", descriptor = "I")
	private int anInt751 = 4;

	@OriginalMember(owner = "client!VSUYIIVA", name = "b", descriptor = "I")
	private int anInt752 = -830;

	@OriginalMember(owner = "client!VSUYIIVA", name = "c", descriptor = "Z")
	private boolean aBoolean207 = false;

	@OriginalMember(owner = "client!VSUYIIVA", name = "<init>", descriptor = "([BZ)V")
	public Class42(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1) {
		try {
			this.method538(arg0);
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("73656, " + arg0 + ", " + arg1 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VSUYIIVA", name = "a", descriptor = "([BI)V")
	private void method538(@OriginalArg(0) byte[] arg0) {
		try {
			@Pc(7) Class1_Sub1_Sub2 local7 = new Class1_Sub1_Sub2(arg0, 792);
			@Pc(10) int local10 = local7.method63();
			@Pc(13) int local13 = local7.method63();
			if (local13 == local10) {
				this.aByteArray19 = arg0;
				this.aBoolean208 = false;
			} else {
				@Pc(19) byte[] local19 = new byte[local10];
				Class19.method269(local19, local10, arg0, local13, 6);
				this.aByteArray19 = local19;
				local7 = new Class1_Sub1_Sub2(this.aByteArray19, 792);
				this.aBoolean208 = true;
			}
			this.anInt753 = local7.method61();
			this.anIntArray185 = new int[this.anInt753];
			this.anIntArray186 = new int[this.anInt753];
			if (this.anInt751 != 4) {
				this.anInt751 = -206;
			}
			this.anIntArray187 = new int[this.anInt753];
			this.anIntArray188 = new int[this.anInt753];
			@Pc(86) int local86 = local7.anInt153 + this.anInt753 * 10;
			for (@Pc(88) int local88 = 0; local88 < this.anInt753; local88++) {
				this.anIntArray185[local88] = local7.method64();
				this.anIntArray186[local88] = local7.method63();
				this.anIntArray187[local88] = local7.method63();
				this.anIntArray188[local88] = local86;
				local86 += this.anIntArray187[local88];
			}
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("61020, " + arg0 + ", " + 4 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VSUYIIVA", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
	public byte[] method539(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(3) int local3 = 0;
		@Pc(6) String local6 = arg0.toUpperCase();
		for (@Pc(8) int local8 = 0; local8 < local6.length(); local8++) {
			local3 = local3 * 61 + local6.charAt(local8) - 32;
		}
		for (@Pc(27) int local27 = 0; local27 < this.anInt753; local27++) {
			if (this.anIntArray185[local27] == local3) {
				if (arg1 == null) {
					arg1 = new byte[this.anIntArray186[local27]];
				}
				if (this.aBoolean208) {
					for (@Pc(67) int local67 = 0; local67 < this.anIntArray186[local27]; local67++) {
						arg1[local67] = this.aByteArray19[this.anIntArray188[local27] + local67];
					}
				} else {
					Class19.method269(arg1, this.anIntArray186[local27], this.aByteArray19, this.anIntArray187[local27], this.anIntArray188[local27]);
				}
				return arg1;
			}
		}
		return null;
	}
}
