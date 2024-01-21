import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ub")
public final class Class39 {

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "[B")
	private byte[] aByteArray14;

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
	private int anInt764;

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "[I")
	private int[] anIntArray221;

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "[I")
	private int[] anIntArray222;

	@OriginalMember(owner = "client!ub", name = "h", descriptor = "[I")
	private int[] anIntArray223;

	@OriginalMember(owner = "client!ub", name = "i", descriptor = "[I")
	private int[] anIntArray224;

	@OriginalMember(owner = "client!ub", name = "j", descriptor = "Z")
	private boolean aBoolean153;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
	private int anInt763 = 17060;

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "Z")
	private boolean aBoolean151 = false;

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "Z")
	private boolean aBoolean152 = false;

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(I[B)V")
	public Class39(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		try {
			this.method535(arg1);
			if (arg0 != 0) {
				for (@Pc(18) int local18 = 1; local18 > 0; local18++) {
				}
			}
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("68297, " + arg0 + ", " + arg1 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "([BI)V")
	private void method535(@OriginalArg(0) byte[] arg0) {
		try {
			@Pc(7) Class1_Sub3_Sub3 local7 = new Class1_Sub3_Sub3((byte) 64, arg0);
			@Pc(10) int local10 = local7.method395();
			@Pc(13) int local13 = local7.method395();
			if (local13 == local10) {
				this.aByteArray14 = arg0;
				this.aBoolean153 = false;
			} else {
				@Pc(19) byte[] local19 = new byte[local10];
				Class34.method519(local19, local10, arg0, local13, 6);
				this.aByteArray14 = local19;
				local7 = new Class1_Sub3_Sub3((byte) 64, this.aByteArray14);
				this.aBoolean153 = true;
			}
			this.anInt764 = local7.method393();
			this.anIntArray221 = new int[this.anInt764];
			this.anIntArray222 = new int[this.anInt764];
			this.anIntArray223 = new int[this.anInt764];
			this.anIntArray224 = new int[this.anInt764];
			@Pc(88) int local88 = local7.anInt554 + this.anInt764 * 10;
			for (@Pc(90) int local90 = 0; local90 < this.anInt764; local90++) {
				this.anIntArray221[local90] = local7.method396();
				this.anIntArray222[local90] = local7.method395();
				this.anIntArray223[local90] = local7.method395();
				this.anIntArray224[local90] = local88;
				local88 += this.anIntArray223[local90];
			}
		} catch (@Pc(129) RuntimeException local129) {
			signlink.reporterror("51843, " + arg0 + ", " + -240 + ", " + local129.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "([BLjava/lang/String;I)[B")
	public byte[] method536(@OriginalArg(0) byte[] arg0, @OriginalArg(1) String arg1) {
		try {
			@Pc(3) int local3 = 0;
			@Pc(6) String local6 = arg1.toUpperCase();
			for (@Pc(18) int local18 = 0; local18 < local6.length(); local18++) {
				local3 = local3 * 61 + local6.charAt(local18) - 32;
			}
			for (@Pc(37) int local37 = 0; local37 < this.anInt764; local37++) {
				if (this.anIntArray221[local37] == local3) {
					if (arg0 == null) {
						arg0 = new byte[this.anIntArray222[local37]];
					}
					if (this.aBoolean153) {
						for (@Pc(77) int local77 = 0; local77 < this.anIntArray222[local37]; local77++) {
							arg0[local77] = this.aByteArray14[this.anIntArray224[local37] + local77];
						}
					} else {
						Class34.method519(arg0, this.anIntArray222[local37], this.aByteArray14, this.anIntArray223[local37], this.anIntArray224[local37]);
					}
					return arg0;
				}
			}
			return null;
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("77037, " + arg0 + ", " + arg1 + ", " + -31149 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}
}
