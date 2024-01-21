import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!GWOEELWB")
public final class Class13 {

	@OriginalMember(owner = "client!GWOEELWB", name = "c", descriptor = "[B")
	private byte[] aByteArray11;

	@OriginalMember(owner = "client!GWOEELWB", name = "d", descriptor = "I")
	private int anInt269;

	@OriginalMember(owner = "client!GWOEELWB", name = "e", descriptor = "[I")
	private int[] anIntArray102;

	@OriginalMember(owner = "client!GWOEELWB", name = "f", descriptor = "[I")
	private int[] anIntArray103;

	@OriginalMember(owner = "client!GWOEELWB", name = "g", descriptor = "[I")
	private int[] anIntArray104;

	@OriginalMember(owner = "client!GWOEELWB", name = "h", descriptor = "[I")
	private int[] anIntArray105;

	@OriginalMember(owner = "client!GWOEELWB", name = "i", descriptor = "Z")
	private boolean aBoolean54;

	@OriginalMember(owner = "client!GWOEELWB", name = "a", descriptor = "Z")
	private boolean aBoolean53 = true;

	@OriginalMember(owner = "client!GWOEELWB", name = "b", descriptor = "I")
	private int anInt268 = -578;

	@OriginalMember(owner = "client!GWOEELWB", name = "<init>", descriptor = "([BI)V")
	public Class13(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		try {
			this.method139(arg0);
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("39818, " + arg0 + ", " + arg1 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GWOEELWB", name = "a", descriptor = "([BI)V")
	private void method139(@OriginalArg(0) byte[] arg0) {
		try {
			@Pc(7) Class3_Sub1_Sub2 local7 = new Class3_Sub1_Sub2(true, arg0);
			@Pc(10) int local10 = local7.method204();
			@Pc(13) int local13 = local7.method204();
			if (local13 == local10) {
				this.aByteArray11 = arg0;
				this.aBoolean54 = false;
			} else {
				@Pc(19) byte[] local19 = new byte[local10];
				Class37.method516(local19, local10, arg0, local13, 6);
				this.aByteArray11 = local19;
				local7 = new Class3_Sub1_Sub2(true, this.aByteArray11);
				this.aBoolean54 = true;
			}
			this.anInt269 = local7.method202();
			this.anIntArray102 = new int[this.anInt269];
			this.anIntArray103 = new int[this.anInt269];
			this.anIntArray104 = new int[this.anInt269];
			this.anIntArray105 = new int[this.anInt269];
			@Pc(79) int local79 = local7.anInt429 + this.anInt269 * 10;
			for (@Pc(84) int local84 = 0; local84 < this.anInt269; local84++) {
				this.anIntArray102[local84] = local7.method205();
				this.anIntArray103[local84] = local7.method204();
				this.anIntArray104[local84] = local7.method204();
				this.anIntArray105[local84] = local79;
				local79 += this.anIntArray104[local84];
			}
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("25846, " + arg0 + ", " + -446 + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GWOEELWB", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
	public byte[] method140(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(3) int local3 = 0;
		@Pc(6) String local6 = arg0.toUpperCase();
		for (@Pc(8) int local8 = 0; local8 < local6.length(); local8++) {
			local3 = local3 * 61 + local6.charAt(local8) - 32;
		}
		for (@Pc(27) int local27 = 0; local27 < this.anInt269; local27++) {
			if (this.anIntArray102[local27] == local3) {
				if (arg1 == null) {
					arg1 = new byte[this.anIntArray103[local27]];
				}
				if (this.aBoolean54) {
					for (@Pc(67) int local67 = 0; local67 < this.anIntArray103[local27]; local67++) {
						arg1[local67] = this.aByteArray11[this.anIntArray105[local27] + local67];
					}
				} else {
					Class37.method516(arg1, this.anIntArray103[local27], this.aByteArray11, this.anIntArray104[local27], this.anIntArray105[local27]);
				}
				return arg1;
			}
		}
		return null;
	}
}
