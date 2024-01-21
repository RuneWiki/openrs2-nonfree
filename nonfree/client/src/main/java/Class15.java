import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!IEMHZJLX")
public final class Class15 {

	@OriginalMember(owner = "client!IEMHZJLX", name = "a", descriptor = "[B")
	private byte[] aByteArray5;

	@OriginalMember(owner = "client!IEMHZJLX", name = "b", descriptor = "I")
	private int anInt355;

	@OriginalMember(owner = "client!IEMHZJLX", name = "c", descriptor = "[I")
	private int[] anIntArray63;

	@OriginalMember(owner = "client!IEMHZJLX", name = "d", descriptor = "[I")
	private int[] anIntArray64;

	@OriginalMember(owner = "client!IEMHZJLX", name = "e", descriptor = "[I")
	private int[] anIntArray65;

	@OriginalMember(owner = "client!IEMHZJLX", name = "f", descriptor = "[I")
	private int[] anIntArray66;

	@OriginalMember(owner = "client!IEMHZJLX", name = "g", descriptor = "Z")
	private boolean aBoolean76;

	@OriginalMember(owner = "client!IEMHZJLX", name = "<init>", descriptor = "(B[B)V")
	public Class15(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1) {
		try {
			this.method180(arg1);
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("33043, " + arg0 + ", " + arg1 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IEMHZJLX", name = "a", descriptor = "(Z[B)V")
	private void method180(@OriginalArg(1) byte[] arg0) {
		try {
			@Pc(10) Class1_Sub1_Sub4 local10 = new Class1_Sub1_Sub4(0, arg0);
			@Pc(13) int local13 = local10.method298();
			@Pc(16) int local16 = local10.method298();
			if (local16 == local13) {
				this.aByteArray5 = arg0;
				this.aBoolean76 = false;
			} else {
				@Pc(22) byte[] local22 = new byte[local13];
				Class47.method561(local22, local13, arg0, local16, 6);
				this.aByteArray5 = local22;
				local10 = new Class1_Sub1_Sub4(0, this.aByteArray5);
				this.aBoolean76 = true;
			}
			this.anInt355 = local10.method296();
			this.anIntArray63 = new int[this.anInt355];
			this.anIntArray64 = new int[this.anInt355];
			this.anIntArray65 = new int[this.anInt355];
			this.anIntArray66 = new int[this.anInt355];
			@Pc(82) int local82 = local10.anInt529 + this.anInt355 * 10;
			for (@Pc(84) int local84 = 0; local84 < this.anInt355; local84++) {
				this.anIntArray63[local84] = local10.method299();
				this.anIntArray64[local84] = local10.method298();
				this.anIntArray65[local84] = local10.method298();
				this.anIntArray66[local84] = local82;
				local82 += this.anIntArray65[local84];
			}
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("4389, " + true + ", " + arg0 + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IEMHZJLX", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
	public byte[] method181(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(3) int local3 = 0;
		@Pc(6) String local6 = arg0.toUpperCase();
		for (@Pc(8) int local8 = 0; local8 < local6.length(); local8++) {
			local3 = local3 * 61 + local6.charAt(local8) - 32;
		}
		for (@Pc(27) int local27 = 0; local27 < this.anInt355; local27++) {
			if (this.anIntArray63[local27] == local3) {
				if (arg1 == null) {
					arg1 = new byte[this.anIntArray64[local27]];
				}
				if (this.aBoolean76) {
					for (@Pc(67) int local67 = 0; local67 < this.anIntArray64[local27]; local67++) {
						arg1[local67] = this.aByteArray5[this.anIntArray66[local27] + local67];
					}
				} else {
					Class47.method561(arg1, this.anIntArray64[local27], this.aByteArray5, this.anIntArray65[local27], this.anIntArray66[local27]);
				}
				return arg1;
			}
		}
		return null;
	}
}
