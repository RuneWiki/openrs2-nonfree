import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!SPZBTZXL")
public final class Class35 {

	@OriginalMember(owner = "client!SPZBTZXL", name = "d", descriptor = "[B")
	private byte[] aByteArray17;

	@OriginalMember(owner = "client!SPZBTZXL", name = "e", descriptor = "I")
	private int anInt604;

	@OriginalMember(owner = "client!SPZBTZXL", name = "f", descriptor = "[I")
	private int[] anIntArray135;

	@OriginalMember(owner = "client!SPZBTZXL", name = "g", descriptor = "[I")
	private int[] anIntArray136;

	@OriginalMember(owner = "client!SPZBTZXL", name = "h", descriptor = "[I")
	private int[] anIntArray137;

	@OriginalMember(owner = "client!SPZBTZXL", name = "i", descriptor = "[I")
	private int[] anIntArray138;

	@OriginalMember(owner = "client!SPZBTZXL", name = "j", descriptor = "Z")
	private boolean aBoolean149;

	@OriginalMember(owner = "client!SPZBTZXL", name = "b", descriptor = "Z")
	private boolean aBoolean147 = false;

	@OriginalMember(owner = "client!SPZBTZXL", name = "c", descriptor = "Z")
	private boolean aBoolean148 = true;

	@OriginalMember(owner = "client!SPZBTZXL", name = "a", descriptor = "I")
	private int anInt603;

	@OriginalMember(owner = "client!SPZBTZXL", name = "<init>", descriptor = "([BI)V")
	public Class35(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		try {
			this.method490(arg0);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("67733, " + arg0 + ", " + arg1 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SPZBTZXL", name = "a", descriptor = "([BI)V")
	private void method490(@OriginalArg(0) byte[] arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(arg0, this.anInt603);
			@Pc(11) int local11 = local8.method363();
			@Pc(14) int local14 = local8.method363();
			if (local14 == local11) {
				this.aByteArray17 = arg0;
				this.aBoolean149 = false;
			} else {
				@Pc(20) byte[] local20 = new byte[local11];
				Class48.method554(local20, local11, arg0, local14, 6);
				this.aByteArray17 = local20;
				local8 = new Class1_Sub1_Sub3(this.aByteArray17, this.anInt603);
				this.aBoolean149 = true;
			}
			this.anInt604 = local8.method361();
			this.anIntArray135 = new int[this.anInt604];
			this.anIntArray136 = new int[this.anInt604];
			this.anIntArray137 = new int[this.anInt604];
			this.anIntArray138 = new int[this.anInt604];
			@Pc(81) int local81 = local8.anInt443 + this.anInt604 * 10;
			for (@Pc(86) int local86 = 0; local86 < this.anInt604; local86++) {
				this.anIntArray135[local86] = local8.method364();
				this.anIntArray136[local86] = local8.method363();
				this.anIntArray137[local86] = local8.method363();
				this.anIntArray138[local86] = local81;
				local81 += this.anIntArray137[local86];
			}
		} catch (@Pc(125) RuntimeException local125) {
			signlink.reporterror("95424, " + arg0 + ", " + 0 + ", " + local125.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SPZBTZXL", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
	public byte[] method491(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(3) int local3 = 0;
		@Pc(6) String local6 = arg0.toUpperCase();
		for (@Pc(8) int local8 = 0; local8 < local6.length(); local8++) {
			local3 = local3 * 61 + local6.charAt(local8) - 32;
		}
		for (@Pc(27) int local27 = 0; local27 < this.anInt604; local27++) {
			if (this.anIntArray135[local27] == local3) {
				if (arg1 == null) {
					arg1 = new byte[this.anIntArray136[local27]];
				}
				if (this.aBoolean149) {
					for (@Pc(67) int local67 = 0; local67 < this.anIntArray136[local27]; local67++) {
						arg1[local67] = this.aByteArray17[this.anIntArray138[local27] + local67];
					}
				} else {
					Class48.method554(arg1, this.anIntArray136[local27], this.aByteArray17, this.anIntArray137[local27], this.anIntArray138[local27]);
				}
				return arg1;
			}
		}
		return null;
	}
}
