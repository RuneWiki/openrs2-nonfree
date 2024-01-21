import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!RPFMUSNN")
public final class Class35 {

	@OriginalMember(owner = "client!RPFMUSNN", name = "b", descriptor = "[B")
	private byte[] aByteArray15;

	@OriginalMember(owner = "client!RPFMUSNN", name = "c", descriptor = "I")
	private int anInt520;

	@OriginalMember(owner = "client!RPFMUSNN", name = "d", descriptor = "[I")
	private int[] anIntArray111;

	@OriginalMember(owner = "client!RPFMUSNN", name = "e", descriptor = "[I")
	private int[] anIntArray112;

	@OriginalMember(owner = "client!RPFMUSNN", name = "f", descriptor = "[I")
	private int[] anIntArray113;

	@OriginalMember(owner = "client!RPFMUSNN", name = "g", descriptor = "[I")
	private int[] anIntArray114;

	@OriginalMember(owner = "client!RPFMUSNN", name = "h", descriptor = "Z")
	private boolean aBoolean114;

	@OriginalMember(owner = "client!RPFMUSNN", name = "a", descriptor = "I")
	private int anInt519 = -638;

	@OriginalMember(owner = "client!RPFMUSNN", name = "<init>", descriptor = "(I[B)V")
	public Class35(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		try {
			this.method340(arg1);
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("52019, " + arg0 + ", " + arg1 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RPFMUSNN", name = "a", descriptor = "([BI)V")
	private void method340(@OriginalArg(0) byte[] arg0) {
		try {
			@Pc(7) Class3_Sub1_Sub4 local7 = new Class3_Sub1_Sub4((byte) -58, arg0);
			@Pc(10) int local10 = local7.method462();
			@Pc(13) int local13 = local7.method462();
			if (local13 == local10) {
				this.aByteArray15 = arg0;
				this.aBoolean114 = false;
			} else {
				@Pc(19) byte[] local19 = new byte[local10];
				Class50.method567(local19, local10, arg0, local13, 6);
				this.aByteArray15 = local19;
				local7 = new Class3_Sub1_Sub4((byte) -58, this.aByteArray15);
				this.aBoolean114 = true;
			}
			this.anInt520 = local7.method460();
			this.anIntArray111 = new int[this.anInt520];
			this.anIntArray112 = new int[this.anInt520];
			this.anIntArray113 = new int[this.anInt520];
			this.anIntArray114 = new int[this.anInt520];
			@Pc(84) int local84 = local7.anInt666 + this.anInt520 * 10;
			for (@Pc(86) int local86 = 0; local86 < this.anInt520; local86++) {
				this.anIntArray111[local86] = local7.method463();
				this.anIntArray112[local86] = local7.method462();
				this.anIntArray113[local86] = local7.method462();
				this.anIntArray114[local86] = local84;
				local84 += this.anIntArray113[local86];
			}
		} catch (@Pc(125) RuntimeException local125) {
			signlink.reporterror("75295, " + arg0 + ", " + 0 + ", " + local125.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RPFMUSNN", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
	public byte[] method341(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(3) int local3 = 0;
		@Pc(6) String local6 = arg0.toUpperCase();
		for (@Pc(8) int local8 = 0; local8 < local6.length(); local8++) {
			local3 = local3 * 61 + local6.charAt(local8) - 32;
		}
		for (@Pc(27) int local27 = 0; local27 < this.anInt520; local27++) {
			if (this.anIntArray111[local27] == local3) {
				if (arg1 == null) {
					arg1 = new byte[this.anIntArray112[local27]];
				}
				if (this.aBoolean114) {
					for (@Pc(67) int local67 = 0; local67 < this.anIntArray112[local27]; local67++) {
						arg1[local67] = this.aByteArray15[this.anIntArray114[local27] + local67];
					}
				} else {
					Class50.method567(arg1, this.anIntArray112[local27], this.aByteArray15, this.anIntArray113[local27], this.anIntArray114[local27]);
				}
				return arg1;
			}
		}
		return null;
	}
}
