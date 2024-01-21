import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!MJLXHQTQ")
public final class Class31 {

	@OriginalMember(owner = "client!MJLXHQTQ", name = "d", descriptor = "[B")
	private byte[] aByteArray9;

	@OriginalMember(owner = "client!MJLXHQTQ", name = "e", descriptor = "I")
	private int anInt439;

	@OriginalMember(owner = "client!MJLXHQTQ", name = "f", descriptor = "[I")
	private int[] anIntArray92;

	@OriginalMember(owner = "client!MJLXHQTQ", name = "g", descriptor = "[I")
	private int[] anIntArray93;

	@OriginalMember(owner = "client!MJLXHQTQ", name = "h", descriptor = "[I")
	private int[] anIntArray94;

	@OriginalMember(owner = "client!MJLXHQTQ", name = "i", descriptor = "[I")
	private int[] anIntArray95;

	@OriginalMember(owner = "client!MJLXHQTQ", name = "j", descriptor = "Z")
	private boolean aBoolean130;

	@OriginalMember(owner = "client!MJLXHQTQ", name = "a", descriptor = "I")
	private int anInt438 = -42286;

	@OriginalMember(owner = "client!MJLXHQTQ", name = "b", descriptor = "Z")
	private boolean aBoolean128 = true;

	@OriginalMember(owner = "client!MJLXHQTQ", name = "c", descriptor = "Z")
	private boolean aBoolean129 = false;

	@OriginalMember(owner = "client!MJLXHQTQ", name = "<init>", descriptor = "(I[B)V")
	public Class31(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		try {
			this.method226(arg1);
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("9928, " + arg0 + ", " + arg1 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MJLXHQTQ", name = "a", descriptor = "(Z[B)V")
	private void method226(@OriginalArg(1) byte[] arg0) {
		try {
			@Pc(7) Class5_Sub1_Sub4 local7 = new Class5_Sub1_Sub4(arg0, -82);
			@Pc(10) int local10 = local7.method441();
			@Pc(13) int local13 = local7.method441();
			if (local13 == local10) {
				this.aByteArray9 = arg0;
				this.aBoolean130 = false;
			} else {
				@Pc(19) byte[] local19 = new byte[local10];
				Class49.method525(local19, local10, arg0, local13, 6);
				this.aByteArray9 = local19;
				local7 = new Class5_Sub1_Sub4(this.aByteArray9, -82);
				this.aBoolean130 = true;
			}
			this.anInt439 = local7.method439();
			this.anIntArray92 = new int[this.anInt439];
			this.anIntArray93 = new int[this.anInt439];
			this.anIntArray94 = new int[this.anInt439];
			this.anIntArray95 = new int[this.anInt439];
			@Pc(89) int local89 = local7.anInt755 + this.anInt439 * 10;
			for (@Pc(91) int local91 = 0; local91 < this.anInt439; local91++) {
				this.anIntArray92[local91] = local7.method442();
				this.anIntArray93[local91] = local7.method441();
				this.anIntArray94[local91] = local7.method441();
				this.anIntArray95[local91] = local89;
				local89 += this.anIntArray94[local91];
			}
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("99405, " + true + ", " + arg0 + ", " + local130.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MJLXHQTQ", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
	public byte[] method227(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(3) int local3 = 0;
		@Pc(6) String local6 = arg0.toUpperCase();
		for (@Pc(8) int local8 = 0; local8 < local6.length(); local8++) {
			local3 = local3 * 61 + local6.charAt(local8) - 32;
		}
		for (@Pc(27) int local27 = 0; local27 < this.anInt439; local27++) {
			if (this.anIntArray92[local27] == local3) {
				if (arg1 == null) {
					arg1 = new byte[this.anIntArray93[local27]];
				}
				if (this.aBoolean130) {
					for (@Pc(67) int local67 = 0; local67 < this.anIntArray93[local27]; local67++) {
						arg1[local67] = this.aByteArray9[this.anIntArray95[local27] + local67];
					}
				} else {
					Class49.method525(arg1, this.anIntArray93[local27], this.aByteArray9, this.anIntArray94[local27], this.anIntArray95[local27]);
				}
				return arg1;
			}
		}
		return null;
	}
}
