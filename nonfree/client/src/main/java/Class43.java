import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!XOJZVVDK")
public final class Class43 {

	@OriginalMember(owner = "client!XOJZVVDK", name = "a", descriptor = "[B")
	private byte[] aByteArray19;

	@OriginalMember(owner = "client!XOJZVVDK", name = "b", descriptor = "I")
	private int anInt736;

	@OriginalMember(owner = "client!XOJZVVDK", name = "c", descriptor = "[I")
	private int[] anIntArray196;

	@OriginalMember(owner = "client!XOJZVVDK", name = "d", descriptor = "[I")
	private int[] anIntArray197;

	@OriginalMember(owner = "client!XOJZVVDK", name = "e", descriptor = "[I")
	private int[] anIntArray198;

	@OriginalMember(owner = "client!XOJZVVDK", name = "f", descriptor = "[I")
	private int[] anIntArray199;

	@OriginalMember(owner = "client!XOJZVVDK", name = "g", descriptor = "Z")
	private boolean aBoolean180;

	@OriginalMember(owner = "client!XOJZVVDK", name = "<init>", descriptor = "([BI)V")
	public Class43(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 < 7 || arg1 > 7) {
				for (@Pc(9) int local9 = 1; local9 > 0; local9++) {
				}
			}
			this.method517(arg0);
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("29812, " + arg0 + ", " + arg1 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XOJZVVDK", name = "a", descriptor = "([BZ)V")
	private void method517(@OriginalArg(0) byte[] arg0) {
		try {
			@Pc(7) Class6_Sub1_Sub4 local7 = new Class6_Sub1_Sub4(888, arg0);
			@Pc(10) int local10 = local7.method243();
			@Pc(13) int local13 = local7.method243();
			if (local13 == local10) {
				this.aByteArray19 = arg0;
				this.aBoolean180 = false;
			} else {
				@Pc(19) byte[] local19 = new byte[local10];
				Class15.method115(local19, local10, arg0, local13, 6);
				this.aByteArray19 = local19;
				local7 = new Class6_Sub1_Sub4(888, this.aByteArray19);
				this.aBoolean180 = true;
			}
			this.anInt736 = local7.method241();
			this.anIntArray196 = new int[this.anInt736];
			this.anIntArray197 = new int[this.anInt736];
			this.anIntArray198 = new int[this.anInt736];
			this.anIntArray199 = new int[this.anInt736];
			@Pc(82) int local82 = local7.anInt390 + this.anInt736 * 10;
			for (@Pc(84) int local84 = 0; local84 < this.anInt736; local84++) {
				this.anIntArray196[local84] = local7.method244();
				this.anIntArray197[local84] = local7.method243();
				this.anIntArray198[local84] = local7.method243();
				this.anIntArray199[local84] = local82;
				local82 += this.anIntArray198[local84];
			}
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("68142, " + arg0 + ", " + true + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XOJZVVDK", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
	public byte[] method518(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(3) int local3 = 0;
		@Pc(6) String local6 = arg0.toUpperCase();
		for (@Pc(8) int local8 = 0; local8 < local6.length(); local8++) {
			local3 = local3 * 61 + local6.charAt(local8) - 32;
		}
		for (@Pc(27) int local27 = 0; local27 < this.anInt736; local27++) {
			if (this.anIntArray196[local27] == local3) {
				if (arg1 == null) {
					arg1 = new byte[this.anIntArray197[local27]];
				}
				if (this.aBoolean180) {
					for (@Pc(67) int local67 = 0; local67 < this.anIntArray197[local27]; local67++) {
						arg1[local67] = this.aByteArray19[this.anIntArray199[local27] + local67];
					}
				} else {
					Class15.method115(arg1, this.anIntArray197[local27], this.aByteArray19, this.anIntArray198[local27], this.anIntArray199[local27]);
				}
				return arg1;
			}
		}
		return null;
	}
}
