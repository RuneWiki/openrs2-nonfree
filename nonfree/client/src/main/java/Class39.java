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
	private int anInt758;

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "[I")
	private int[] anIntArray221;

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "[I")
	private int[] anIntArray222;

	@OriginalMember(owner = "client!ub", name = "h", descriptor = "[I")
	private int[] anIntArray223;

	@OriginalMember(owner = "client!ub", name = "i", descriptor = "[I")
	private int[] anIntArray224;

	@OriginalMember(owner = "client!ub", name = "j", descriptor = "Z")
	private boolean aBoolean172;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "Z")
	private boolean aBoolean171 = true;

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
	private int anInt756 = 742;

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
	private int anInt757 = 8;

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Z[B)V")
	public Class39(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1) {
		try {
			this.method527(arg1);
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("17541, " + arg0 + ", " + arg1 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "([BI)V")
	private void method527(@OriginalArg(0) byte[] arg0) {
		try {
			@Pc(7) Class1_Sub3_Sub3 local7 = new Class1_Sub3_Sub3(arg0, 0);
			@Pc(10) int local10 = local7.method387();
			@Pc(13) int local13 = local7.method387();
			if (local13 == local10) {
				this.aByteArray14 = arg0;
				this.aBoolean172 = false;
			} else {
				@Pc(19) byte[] local19 = new byte[local10];
				Class34.method511(local19, local10, arg0, local13, 6);
				this.aByteArray14 = local19;
				local7 = new Class1_Sub3_Sub3(this.aByteArray14, 0);
				this.aBoolean172 = true;
			}
			this.anInt758 = local7.method385();
			this.anIntArray221 = new int[this.anInt758];
			this.anIntArray222 = new int[this.anInt758];
			this.anIntArray223 = new int[this.anInt758];
			this.anIntArray224 = new int[this.anInt758];
			@Pc(84) int local84 = local7.anInt548 + this.anInt758 * 10;
			for (@Pc(86) int local86 = 0; local86 < this.anInt758; local86++) {
				this.anIntArray221[local86] = local7.method388();
				this.anIntArray222[local86] = local7.method387();
				this.anIntArray223[local86] = local7.method387();
				this.anIntArray224[local86] = local84;
				local84 += this.anIntArray223[local86];
			}
		} catch (@Pc(125) RuntimeException local125) {
			signlink.reporterror("28617, " + arg0 + ", " + -641 + ", " + local125.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(BLjava/lang/String;[B)[B")
	public byte[] method528(@OriginalArg(0) byte arg0, @OriginalArg(1) String arg1, @OriginalArg(2) byte[] arg2) {
		try {
			@Pc(3) int local3 = 0;
			if (arg0 != 4) {
				throw new NullPointerException();
			}
			@Pc(13) String local13 = arg1.toUpperCase();
			for (@Pc(15) int local15 = 0; local15 < local13.length(); local15++) {
				local3 = local3 * 61 + local13.charAt(local15) - 32;
			}
			for (@Pc(34) int local34 = 0; local34 < this.anInt758; local34++) {
				if (this.anIntArray221[local34] == local3) {
					if (arg2 == null) {
						arg2 = new byte[this.anIntArray222[local34]];
					}
					if (this.aBoolean172) {
						for (@Pc(74) int local74 = 0; local74 < this.anIntArray222[local34]; local74++) {
							arg2[local74] = this.aByteArray14[this.anIntArray224[local34] + local74];
						}
					} else {
						Class34.method511(arg2, this.anIntArray222[local34], this.aByteArray14, this.anIntArray223[local34], this.anIntArray224[local34]);
					}
					return arg2;
				}
			}
			return null;
		} catch (@Pc(105) RuntimeException local105) {
			signlink.reporterror("32881, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local105.toString());
			throw new RuntimeException();
		}
	}
}
