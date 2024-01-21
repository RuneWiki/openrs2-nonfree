import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ub")
public final class Class36 {

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
	private int anInt606;

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "[B")
	private byte[] aByteArray11;

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
	private int anInt607;

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "[I")
	private int[] anIntArray195;

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "[I")
	private int[] anIntArray196;

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "[I")
	private int[] anIntArray197;

	@OriginalMember(owner = "client!ub", name = "h", descriptor = "[I")
	private int[] anIntArray198;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "Z")
	private boolean aBoolean140 = true;

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "([BZ)V")
	public Class36(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1) {
		try {
			this.method478(arg0, (byte) 2);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("59999, " + arg0 + ", " + arg1 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "([BB)V")
	private void method478(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(7) Class1_Sub3_Sub3 local7 = new Class1_Sub3_Sub3(arg0, 4);
			@Pc(10) int local10 = local7.method384();
			@Pc(15) boolean local15 = false;
			@Pc(23) int local23 = local7.method384();
			if (local23 == local10) {
				this.aByteArray11 = arg0;
			} else {
				@Pc(29) byte[] local29 = new byte[local10];
				Class31.method462(local29, local10, arg0, local23, 6);
				this.aByteArray11 = local29;
				local7 = new Class1_Sub3_Sub3(this.aByteArray11, 4);
			}
			this.anInt607 = local7.method382();
			this.anIntArray195 = new int[this.anInt607];
			this.anIntArray196 = new int[this.anInt607];
			this.anIntArray197 = new int[this.anInt607];
			this.anIntArray198 = new int[this.anInt607];
			@Pc(83) int local83 = local7.anInt433 + this.anInt607 * 10;
			for (@Pc(85) int local85 = 0; local85 < this.anInt607; local85++) {
				this.anIntArray195[local85] = local7.method385();
				this.anIntArray196[local85] = local7.method384();
				this.anIntArray197[local85] = local7.method384();
				this.anIntArray198[local85] = local83;
				local83 += this.anIntArray197[local85];
			}
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("38290, " + arg0 + ", " + arg1 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(B[BLjava/lang/String;)[B")
	public byte[] method479(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) String arg2) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(17) int local17 = 0;
			@Pc(20) String local20 = arg2.toUpperCase();
			for (@Pc(22) int local22 = 0; local22 < local20.length(); local22++) {
				local17 = local17 * 61 + local20.charAt(local22) - 32;
			}
			for (@Pc(41) int local41 = 0; local41 < this.anInt607; local41++) {
				if (this.anIntArray195[local41] == local17) {
					if (arg1 == null) {
						arg1 = new byte[this.anIntArray196[local41]];
					}
					if (this.anIntArray196[local41] == this.anIntArray197[local41]) {
						for (@Pc(87) int local87 = 0; local87 < this.anIntArray196[local41]; local87++) {
							arg1[local87] = this.aByteArray11[this.anIntArray198[local41] + local87];
						}
					} else {
						Class31.method462(arg1, this.anIntArray196[local41], this.aByteArray11, this.anIntArray197[local41], this.anIntArray198[local41]);
					}
					return arg1;
				}
			}
			return null;
		} catch (@Pc(118) RuntimeException local118) {
			signlink.reporterror("47516, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local118.toString());
			throw new RuntimeException();
		}
	}
}
