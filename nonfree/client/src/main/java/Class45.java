import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!yb")
public final class Class45 {

	@OriginalMember(owner = "client!yb", name = "g", descriptor = "[B")
	private byte[] aByteArray21;

	@OriginalMember(owner = "client!yb", name = "h", descriptor = "I")
	private int anInt990;

	@OriginalMember(owner = "client!yb", name = "i", descriptor = "[I")
	private int[] anIntArray253;

	@OriginalMember(owner = "client!yb", name = "j", descriptor = "[I")
	private int[] anIntArray254;

	@OriginalMember(owner = "client!yb", name = "k", descriptor = "[I")
	private int[] anIntArray255;

	@OriginalMember(owner = "client!yb", name = "l", descriptor = "[I")
	private int[] anIntArray256;

	@OriginalMember(owner = "client!yb", name = "m", descriptor = "Z")
	private boolean aBoolean198;

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "Z")
	private boolean aBoolean195 = false;

	@OriginalMember(owner = "client!yb", name = "b", descriptor = "I")
	private int anInt987 = 69;

	@OriginalMember(owner = "client!yb", name = "c", descriptor = "Z")
	private boolean aBoolean196 = true;

	@OriginalMember(owner = "client!yb", name = "d", descriptor = "Z")
	private boolean aBoolean197 = false;

	@OriginalMember(owner = "client!yb", name = "e", descriptor = "I")
	private int anInt988 = -504;

	@OriginalMember(owner = "client!yb", name = "f", descriptor = "I")
	private int anInt989 = 281;

	@OriginalMember(owner = "client!yb", name = "<init>", descriptor = "([BB)V")
	public Class45(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte arg1) {
		try {
			this.method638(arg0, this.aBoolean195);
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("17128, " + arg0 + ", " + arg1 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "([BZ)V")
	private void method638(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1) {
		try {
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3(699, arg0);
			@Pc(10) int local10 = local7.method471();
			@Pc(13) int local13 = local7.method471();
			if (local13 == local10) {
				this.aByteArray21 = arg0;
				this.aBoolean198 = false;
			} else {
				@Pc(19) byte[] local19 = new byte[local10];
				Class38.method600(local19, local10, arg0, local13, 6);
				this.aByteArray21 = local19;
				local7 = new Class1_Sub1_Sub3(699, this.aByteArray21);
				this.aBoolean198 = true;
			}
			this.anInt990 = local7.method469();
			this.anIntArray253 = new int[this.anInt990];
			this.anIntArray254 = new int[this.anInt990];
			this.anIntArray255 = new int[this.anInt990];
			this.anIntArray256 = new int[this.anInt990];
			if (arg1) {
				this.anInt989 = 350;
			}
			@Pc(84) int local84 = local7.anInt771 + this.anInt990 * 10;
			for (@Pc(86) int local86 = 0; local86 < this.anInt990; local86++) {
				this.anIntArray253[local86] = local7.method472();
				this.anIntArray254[local86] = local7.method471();
				this.anIntArray255[local86] = local7.method471();
				this.anIntArray256[local86] = local84;
				local84 += this.anIntArray255[local86];
			}
		} catch (@Pc(125) RuntimeException local125) {
			signlink.reporterror("65358, " + arg0 + ", " + arg1 + ", " + local125.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
	public byte[] method639(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(3) int local3 = 0;
		@Pc(6) String local6 = arg0.toUpperCase();
		for (@Pc(8) int local8 = 0; local8 < local6.length(); local8++) {
			local3 = local3 * 61 + local6.charAt(local8) - 32;
		}
		for (@Pc(27) int local27 = 0; local27 < this.anInt990; local27++) {
			if (this.anIntArray253[local27] == local3) {
				try {
					if (arg1 == null) {
						arg1 = new byte[this.anIntArray254[local27]];
					}
					if (this.aBoolean198) {
						for (@Pc(67) int local67 = 0; local67 < this.anIntArray254[local27]; local67++) {
							arg1[local67] = this.aByteArray21[this.anIntArray256[local27] + local67];
						}
					} else {
						Class38.method600(arg1, this.anIntArray254[local27], this.aByteArray21, this.anIntArray255[local27], this.anIntArray256[local27]);
					}
					return arg1;
				} catch (@Pc(91) Exception local91) {
					@Pc(95) CRC32 local95 = new CRC32();
					local95.reset();
					local95.update(arg1);
					@Pc(104) int local104 = (int) local95.getValue();
					signlink.reporterror("jf-er: " + local6 + "," + this.anInt990 + "," + local27 + "," + this.aBoolean198 + "," + this.anIntArray254[local27] + "," + this.anIntArray255[local27] + "," + this.anIntArray256[local27] + "," + local104);
				}
			}
		}
		return null;
	}
}
