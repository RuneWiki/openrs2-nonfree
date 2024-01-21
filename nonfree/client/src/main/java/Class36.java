import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!QKFGLETG")
public final class Class36 {

	@OriginalMember(owner = "client!QKFGLETG", name = "d", descriptor = "[B")
	private byte[] aByteArray8;

	@OriginalMember(owner = "client!QKFGLETG", name = "e", descriptor = "I")
	private int anInt593;

	@OriginalMember(owner = "client!QKFGLETG", name = "f", descriptor = "[I")
	private int[] anIntArray147;

	@OriginalMember(owner = "client!QKFGLETG", name = "g", descriptor = "[I")
	private int[] anIntArray148;

	@OriginalMember(owner = "client!QKFGLETG", name = "h", descriptor = "[I")
	private int[] anIntArray149;

	@OriginalMember(owner = "client!QKFGLETG", name = "i", descriptor = "[I")
	private int[] anIntArray150;

	@OriginalMember(owner = "client!QKFGLETG", name = "j", descriptor = "Z")
	private boolean aBoolean116;

	@OriginalMember(owner = "client!QKFGLETG", name = "a", descriptor = "I")
	private int anInt590 = 7;

	@OriginalMember(owner = "client!QKFGLETG", name = "c", descriptor = "I")
	private int anInt592 = 303;

	@OriginalMember(owner = "client!QKFGLETG", name = "b", descriptor = "I")
	private int anInt591;

	@OriginalMember(owner = "client!QKFGLETG", name = "<init>", descriptor = "([BI)V")
	public Class36(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 < 1 || arg1 > 1) {
				this.anInt591 = 401;
			}
			this.method336(arg0);
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("40142, " + arg0 + ", " + arg1 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QKFGLETG", name = "a", descriptor = "([BZ)V")
	private void method336(@OriginalArg(0) byte[] arg0) {
		try {
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3((byte) 9, arg0);
			@Pc(10) int local10 = local7.method502();
			@Pc(13) int local13 = local7.method502();
			if (local13 == local10) {
				this.aByteArray8 = arg0;
				this.aBoolean116 = false;
			} else {
				@Pc(19) byte[] local19 = new byte[local10];
				Class39.method355(local19, local10, arg0, local13, 6);
				this.aByteArray8 = local19;
				local7 = new Class1_Sub1_Sub3((byte) 9, this.aByteArray8);
				this.aBoolean116 = true;
			}
			this.anInt593 = local7.method500();
			this.anIntArray147 = new int[this.anInt593];
			this.anIntArray148 = new int[this.anInt593];
			this.anIntArray149 = new int[this.anInt593];
			this.anIntArray150 = new int[this.anInt593];
			@Pc(88) int local88 = local7.anInt806 + this.anInt593 * 10;
			for (@Pc(90) int local90 = 0; local90 < this.anInt593; local90++) {
				this.anIntArray147[local90] = local7.method503();
				this.anIntArray148[local90] = local7.method502();
				this.anIntArray149[local90] = local7.method502();
				this.anIntArray150[local90] = local88;
				local88 += this.anIntArray149[local90];
			}
		} catch (@Pc(129) RuntimeException local129) {
			signlink.reporterror("31244, " + arg0 + ", " + false + ", " + local129.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QKFGLETG", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
	public byte[] method337(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(3) int local3 = 0;
		@Pc(6) String local6 = arg0.toUpperCase();
		for (@Pc(8) int local8 = 0; local8 < local6.length(); local8++) {
			local3 = local3 * 61 + local6.charAt(local8) - 32;
		}
		for (@Pc(27) int local27 = 0; local27 < this.anInt593; local27++) {
			if (this.anIntArray147[local27] == local3) {
				if (arg1 == null) {
					arg1 = new byte[this.anIntArray148[local27]];
				}
				if (this.aBoolean116) {
					for (@Pc(67) int local67 = 0; local67 < this.anIntArray148[local27]; local67++) {
						arg1[local67] = this.aByteArray8[this.anIntArray150[local27] + local67];
					}
				} else {
					Class39.method355(arg1, this.anIntArray148[local27], this.aByteArray8, this.anIntArray149[local27], this.anIntArray150[local27]);
				}
				return arg1;
			}
		}
		return null;
	}
}
