import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!TXPLZUUI")
public final class Class40 {

	@OriginalMember(owner = "client!TXPLZUUI", name = "a", descriptor = "[B")
	private byte[] aByteArray18;

	@OriginalMember(owner = "client!TXPLZUUI", name = "b", descriptor = "I")
	private int anInt676;

	@OriginalMember(owner = "client!TXPLZUUI", name = "c", descriptor = "[I")
	private int[] anIntArray174;

	@OriginalMember(owner = "client!TXPLZUUI", name = "d", descriptor = "[I")
	private int[] anIntArray175;

	@OriginalMember(owner = "client!TXPLZUUI", name = "e", descriptor = "[I")
	private int[] anIntArray176;

	@OriginalMember(owner = "client!TXPLZUUI", name = "f", descriptor = "[I")
	private int[] anIntArray177;

	@OriginalMember(owner = "client!TXPLZUUI", name = "g", descriptor = "Z")
	private boolean aBoolean178;

	@OriginalMember(owner = "client!TXPLZUUI", name = "<init>", descriptor = "([BZ)V")
	public Class40(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1) {
		try {
			this.method463(arg0, 599);
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("41887, " + arg0 + ", " + arg1 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TXPLZUUI", name = "a", descriptor = "([BI)V")
	private void method463(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(7) Class5_Sub1_Sub4 local7 = new Class5_Sub1_Sub4(arg0, 0);
			@Pc(10) int local10 = local7.method244();
			@Pc(13) int local13 = local7.method244();
			if (local13 == local10) {
				this.aByteArray18 = arg0;
				this.aBoolean178 = false;
			} else {
				@Pc(19) byte[] local19 = new byte[local10];
				Class25.method170(local19, local10, arg0, local13, 6);
				this.aByteArray18 = local19;
				local7 = new Class5_Sub1_Sub4(this.aByteArray18, 0);
				this.aBoolean178 = true;
			}
			this.anInt676 = local7.method242();
			this.anIntArray174 = new int[this.anInt676];
			this.anIntArray175 = new int[this.anInt676];
			this.anIntArray176 = new int[this.anInt676];
			this.anIntArray177 = new int[this.anInt676];
			@Pc(75) boolean local75 = false;
			@Pc(83) int local83 = local7.anInt429 + this.anInt676 * 10;
			for (@Pc(85) int local85 = 0; local85 < this.anInt676; local85++) {
				this.anIntArray174[local85] = local7.method245();
				this.anIntArray175[local85] = local7.method244();
				this.anIntArray176[local85] = local7.method244();
				this.anIntArray177[local85] = local83;
				local83 += this.anIntArray176[local85];
			}
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("29264, " + arg0 + ", " + arg1 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TXPLZUUI", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
	public byte[] method464(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(3) int local3 = 0;
		@Pc(6) String local6 = arg0.toUpperCase();
		for (@Pc(8) int local8 = 0; local8 < local6.length(); local8++) {
			local3 = local3 * 61 + local6.charAt(local8) - 32;
		}
		for (@Pc(27) int local27 = 0; local27 < this.anInt676; local27++) {
			if (this.anIntArray174[local27] == local3) {
				if (arg1 == null) {
					arg1 = new byte[this.anIntArray175[local27]];
				}
				if (this.aBoolean178) {
					for (@Pc(67) int local67 = 0; local67 < this.anIntArray175[local27]; local67++) {
						arg1[local67] = this.aByteArray18[this.anIntArray177[local27] + local67];
					}
				} else {
					Class25.method170(arg1, this.anIntArray175[local27], this.aByteArray18, this.anIntArray176[local27], this.anIntArray177[local27]);
				}
				return arg1;
			}
		}
		return null;
	}
}
