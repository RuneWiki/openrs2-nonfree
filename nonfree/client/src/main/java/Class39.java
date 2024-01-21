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
	private int anInt778;

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "[I")
	private int[] anIntArray221;

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "[I")
	private int[] anIntArray222;

	@OriginalMember(owner = "client!ub", name = "h", descriptor = "[I")
	private int[] anIntArray223;

	@OriginalMember(owner = "client!ub", name = "i", descriptor = "[I")
	private int[] anIntArray224;

	@OriginalMember(owner = "client!ub", name = "j", descriptor = "Z")
	private boolean aBoolean157;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "B")
	private byte aByte41 = 0;

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
	private int anInt777 = -12745;

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "Z")
	private boolean aBoolean156 = true;

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Z[B)V")
	public Class39(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1) {
		try {
			this.method527(927, arg1);
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("56392, " + arg0 + ", " + arg1 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I[B)V")
	private void method527(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		try {
			@Pc(7) Class1_Sub3_Sub3 local7 = new Class1_Sub3_Sub3(0, arg1);
			@Pc(11) boolean local11 = false;
			@Pc(14) int local14 = local7.method387();
			@Pc(17) int local17 = local7.method387();
			if (local17 == local14) {
				this.aByteArray14 = arg1;
				this.aBoolean157 = false;
			} else {
				@Pc(23) byte[] local23 = new byte[local14];
				Class34.method511(local23, local14, arg1, local17, 6);
				this.aByteArray14 = local23;
				local7 = new Class1_Sub3_Sub3(0, this.aByteArray14);
				this.aBoolean157 = true;
			}
			this.anInt778 = local7.method385();
			this.anIntArray221 = new int[this.anInt778];
			this.anIntArray222 = new int[this.anInt778];
			this.anIntArray223 = new int[this.anInt778];
			this.anIntArray224 = new int[this.anInt778];
			@Pc(83) int local83 = local7.anInt566 + this.anInt778 * 10;
			for (@Pc(85) int local85 = 0; local85 < this.anInt778; local85++) {
				this.anIntArray221[local85] = local7.method388();
				this.anIntArray222[local85] = local7.method387();
				this.anIntArray223[local85] = local7.method387();
				this.anIntArray224[local85] = local83;
				local83 += this.anIntArray223[local85];
			}
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("4993, " + arg0 + ", " + arg1 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Ljava/lang/String;[BI)[B")
	public byte[] method528(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1) {
		try {
			@Pc(3) int local3 = 0;
			@Pc(6) String local6 = arg0.toUpperCase();
			for (@Pc(8) int local8 = 0; local8 < local6.length(); local8++) {
				local3 = local3 * 61 + local6.charAt(local8) - 32;
			}
			for (@Pc(27) int local27 = 0; local27 < this.anInt778; local27++) {
				if (this.anIntArray221[local27] == local3) {
					if (arg1 == null) {
						arg1 = new byte[this.anIntArray222[local27]];
					}
					if (this.aBoolean157) {
						for (@Pc(67) int local67 = 0; local67 < this.anIntArray222[local27]; local67++) {
							arg1[local67] = this.aByteArray14[this.anIntArray224[local27] + local67];
						}
					} else {
						Class34.method511(arg1, this.anIntArray222[local27], this.aByteArray14, this.anIntArray223[local27], this.anIntArray224[local27]);
					}
					return arg1;
				}
			}
			return null;
		} catch (@Pc(105) RuntimeException local105) {
			signlink.reporterror("55598, " + arg0 + ", " + arg1 + ", " + 8 + ", " + local105.toString());
			throw new RuntimeException();
		}
	}
}
