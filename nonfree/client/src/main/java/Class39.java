import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ub")
public final class Class39 {

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "[B")
	private byte[] aByteArray15;

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
	private int anInt750;

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "[I")
	private int[] anIntArray221;

	@OriginalMember(owner = "client!ub", name = "h", descriptor = "[I")
	private int[] anIntArray222;

	@OriginalMember(owner = "client!ub", name = "i", descriptor = "[I")
	private int[] anIntArray223;

	@OriginalMember(owner = "client!ub", name = "j", descriptor = "[I")
	private int[] anIntArray224;

	@OriginalMember(owner = "client!ub", name = "k", descriptor = "Z")
	private boolean aBoolean174;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
	private int anInt748 = 265;

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "Z")
	private boolean aBoolean172 = true;

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
	private int anInt749 = 32137;

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "Z")
	private boolean aBoolean173 = true;

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "([BI)V")
	public Class39(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		try {
			this.method515(arg0, 422);
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("12233, " + arg0 + ", " + arg1 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "([BI)V")
	private void method515(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(8) Class1_Sub3_Sub3 local8 = new Class1_Sub3_Sub3(arg0, this.aBoolean173);
			@Pc(11) int local11 = local8.method376();
			@Pc(15) boolean local15 = false;
			@Pc(18) int local18 = local8.method376();
			if (local18 == local11) {
				this.aByteArray15 = arg0;
				this.aBoolean174 = false;
			} else {
				@Pc(24) byte[] local24 = new byte[local11];
				Class34.method499(local24, local11, arg0, local18, 6);
				this.aByteArray15 = local24;
				local8 = new Class1_Sub3_Sub3(this.aByteArray15, this.aBoolean173);
				this.aBoolean174 = true;
			}
			this.anInt750 = local8.method374();
			this.anIntArray221 = new int[this.anInt750];
			this.anIntArray222 = new int[this.anInt750];
			this.anIntArray223 = new int[this.anInt750];
			this.anIntArray224 = new int[this.anInt750];
			@Pc(85) int local85 = local8.anInt539 + this.anInt750 * 10;
			for (@Pc(87) int local87 = 0; local87 < this.anInt750; local87++) {
				this.anIntArray221[local87] = local8.method377();
				this.anIntArray222[local87] = local8.method376();
				this.anIntArray223[local87] = local8.method376();
				this.anIntArray224[local87] = local85;
				local85 += this.anIntArray223[local87];
			}
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("41467, " + arg0 + ", " + arg1 + ", " + local126.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Ljava/lang/String;Z[B)[B")
	public byte[] method516(@OriginalArg(0) String arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(3) int local3 = 0;
			@Pc(6) String local6 = arg0.toUpperCase();
			for (@Pc(8) int local8 = 0; local8 < local6.length(); local8++) {
				local3 = local3 * 61 + local6.charAt(local8) - 32;
			}
			for (@Pc(33) int local33 = 0; local33 < this.anInt750; local33++) {
				if (this.anIntArray221[local33] == local3) {
					if (arg1 == null) {
						arg1 = new byte[this.anIntArray222[local33]];
					}
					if (this.aBoolean174) {
						for (@Pc(73) int local73 = 0; local73 < this.anIntArray222[local33]; local73++) {
							arg1[local73] = this.aByteArray15[this.anIntArray224[local33] + local73];
						}
					} else {
						Class34.method499(arg1, this.anIntArray222[local33], this.aByteArray15, this.anIntArray223[local33], this.anIntArray224[local33]);
					}
					return arg1;
				}
			}
			return null;
		} catch (@Pc(104) RuntimeException local104) {
			signlink.reporterror("40215, " + arg0 + ", " + true + ", " + arg1 + ", " + local104.toString());
			throw new RuntimeException();
		}
	}
}
