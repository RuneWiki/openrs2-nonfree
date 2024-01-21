import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!DTIATKJO")
public final class Class7 {

	@OriginalMember(owner = "client!DTIATKJO", name = "e", descriptor = "[B")
	private byte[] aByteArray2;

	@OriginalMember(owner = "client!DTIATKJO", name = "f", descriptor = "I")
	private int anInt61;

	@OriginalMember(owner = "client!DTIATKJO", name = "g", descriptor = "[I")
	private int[] anIntArray11;

	@OriginalMember(owner = "client!DTIATKJO", name = "h", descriptor = "[I")
	private int[] anIntArray12;

	@OriginalMember(owner = "client!DTIATKJO", name = "i", descriptor = "[I")
	private int[] anIntArray13;

	@OriginalMember(owner = "client!DTIATKJO", name = "j", descriptor = "[I")
	private int[] anIntArray14;

	@OriginalMember(owner = "client!DTIATKJO", name = "k", descriptor = "Z")
	private boolean aBoolean11;

	@OriginalMember(owner = "client!DTIATKJO", name = "a", descriptor = "B")
	private byte aByte2 = 8;

	@OriginalMember(owner = "client!DTIATKJO", name = "b", descriptor = "B")
	private byte aByte3 = -57;

	@OriginalMember(owner = "client!DTIATKJO", name = "c", descriptor = "I")
	private int anInt60 = -401;

	@OriginalMember(owner = "client!DTIATKJO", name = "d", descriptor = "Z")
	private boolean aBoolean10 = false;

	@OriginalMember(owner = "client!DTIATKJO", name = "<init>", descriptor = "(B[B)V")
	public Class7(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1) {
		try {
			if (arg0 != this.aByte2) {
				this.aBoolean10 = !this.aBoolean10;
			}
			this.method29(arg1, this.aByte3);
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("92937, " + arg0 + ", " + arg1 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DTIATKJO", name = "a", descriptor = "([BB)V")
	private void method29(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(7) Class3_Sub1_Sub2 local7 = new Class3_Sub1_Sub2(-527, arg0);
			@Pc(10) int local10 = local7.method93();
			@Pc(13) int local13 = local7.method93();
			if (local13 == local10) {
				this.aByteArray2 = arg0;
				this.aBoolean11 = false;
			} else {
				@Pc(19) byte[] local19 = new byte[local10];
				Class34.method466(local19, local10, arg0, local13, 6);
				this.aByteArray2 = local19;
				local7 = new Class3_Sub1_Sub2(-527, this.aByteArray2);
				this.aBoolean11 = true;
			}
			this.anInt61 = local7.method91();
			if (arg1 == -57) {
				this.anIntArray11 = new int[this.anInt61];
				this.anIntArray12 = new int[this.anInt61];
				this.anIntArray13 = new int[this.anInt61];
				this.anIntArray14 = new int[this.anInt61];
				@Pc(83) int local83 = local7.anInt257 + this.anInt61 * 10;
				for (@Pc(85) int local85 = 0; local85 < this.anInt61; local85++) {
					this.anIntArray11[local85] = local7.method94();
					this.anIntArray12[local85] = local7.method93();
					this.anIntArray13[local85] = local7.method93();
					this.anIntArray14[local85] = local83;
					local83 += this.anIntArray13[local85];
				}
			}
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("64027, " + arg0 + ", " + arg1 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DTIATKJO", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
	public byte[] method30(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(3) int local3 = 0;
		@Pc(6) String local6 = arg0.toUpperCase();
		for (@Pc(8) int local8 = 0; local8 < local6.length(); local8++) {
			local3 = local3 * 61 + local6.charAt(local8) - 32;
		}
		for (@Pc(27) int local27 = 0; local27 < this.anInt61; local27++) {
			if (this.anIntArray11[local27] == local3) {
				if (arg1 == null) {
					arg1 = new byte[this.anIntArray12[local27]];
				}
				if (this.aBoolean11) {
					for (@Pc(67) int local67 = 0; local67 < this.anIntArray12[local27]; local67++) {
						arg1[local67] = this.aByteArray2[this.anIntArray14[local27] + local67];
					}
				} else {
					Class34.method466(arg1, this.anIntArray12[local27], this.aByteArray2, this.anIntArray13[local27], this.anIntArray14[local27]);
				}
				return arg1;
			}
		}
		return null;
	}
}
