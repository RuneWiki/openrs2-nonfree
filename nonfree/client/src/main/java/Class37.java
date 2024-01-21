import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!RSPRYUFS")
public final class Class37 {

	@OriginalMember(owner = "client!RSPRYUFS", name = "b", descriptor = "[B")
	private byte[] aByteArray11;

	@OriginalMember(owner = "client!RSPRYUFS", name = "c", descriptor = "I")
	private int anInt474;

	@OriginalMember(owner = "client!RSPRYUFS", name = "d", descriptor = "[I")
	private int[] anIntArray137;

	@OriginalMember(owner = "client!RSPRYUFS", name = "e", descriptor = "[I")
	private int[] anIntArray138;

	@OriginalMember(owner = "client!RSPRYUFS", name = "f", descriptor = "[I")
	private int[] anIntArray139;

	@OriginalMember(owner = "client!RSPRYUFS", name = "g", descriptor = "[I")
	private int[] anIntArray140;

	@OriginalMember(owner = "client!RSPRYUFS", name = "h", descriptor = "Z")
	private boolean aBoolean153;

	@OriginalMember(owner = "client!RSPRYUFS", name = "a", descriptor = "Z")
	private boolean aBoolean152 = true;

	@OriginalMember(owner = "client!RSPRYUFS", name = "<init>", descriptor = "([BB)V")
	public Class37(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte arg1) {
		try {
			this.method357(arg0);
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("41480, " + arg0 + ", " + arg1 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RSPRYUFS", name = "a", descriptor = "([BI)V")
	private void method357(@OriginalArg(0) byte[] arg0) {
		try {
			@Pc(7) Class6_Sub2_Sub3 local7 = new Class6_Sub2_Sub3(-587, arg0);
			@Pc(10) int local10 = local7.method266();
			@Pc(13) int local13 = local7.method266();
			if (local13 == local10) {
				this.aByteArray11 = arg0;
				this.aBoolean153 = false;
			} else {
				@Pc(19) byte[] local19 = new byte[local10];
				Class29.method323(local19, local10, arg0, local13, 6);
				this.aByteArray11 = local19;
				local7 = new Class6_Sub2_Sub3(-587, this.aByteArray11);
				this.aBoolean153 = true;
			}
			this.anInt474 = local7.method264();
			this.anIntArray137 = new int[this.anInt474];
			this.anIntArray138 = new int[this.anInt474];
			this.anIntArray139 = new int[this.anInt474];
			this.anIntArray140 = new int[this.anInt474];
			@Pc(89) int local89 = local7.anInt404 + this.anInt474 * 10;
			for (@Pc(91) int local91 = 0; local91 < this.anInt474; local91++) {
				this.anIntArray137[local91] = local7.method267();
				this.anIntArray138[local91] = local7.method266();
				this.anIntArray139[local91] = local7.method266();
				this.anIntArray140[local91] = local89;
				local89 += this.anIntArray139[local91];
			}
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("31158, " + arg0 + ", " + 196 + ", " + local130.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RSPRYUFS", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
	public byte[] method358(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(3) int local3 = 0;
		@Pc(6) String local6 = arg0.toUpperCase();
		for (@Pc(8) int local8 = 0; local8 < local6.length(); local8++) {
			local3 = local3 * 61 + local6.charAt(local8) - 32;
		}
		for (@Pc(27) int local27 = 0; local27 < this.anInt474; local27++) {
			if (this.anIntArray137[local27] == local3) {
				if (arg1 == null) {
					arg1 = new byte[this.anIntArray138[local27]];
				}
				if (this.aBoolean153) {
					for (@Pc(67) int local67 = 0; local67 < this.anIntArray138[local27]; local67++) {
						arg1[local67] = this.aByteArray11[this.anIntArray140[local27] + local67];
					}
				} else {
					Class29.method323(arg1, this.anIntArray138[local27], this.aByteArray11, this.anIntArray139[local27], this.anIntArray140[local27]);
				}
				return arg1;
			}
		}
		return null;
	}
}
