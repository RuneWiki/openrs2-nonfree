import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!UUIGNTAD")
public final class Class38 {

	@OriginalMember(owner = "client!UUIGNTAD", name = "d", descriptor = "[B")
	private byte[] aByteArray18;

	@OriginalMember(owner = "client!UUIGNTAD", name = "e", descriptor = "I")
	private int anInt705;

	@OriginalMember(owner = "client!UUIGNTAD", name = "f", descriptor = "[I")
	private int[] anIntArray184;

	@OriginalMember(owner = "client!UUIGNTAD", name = "g", descriptor = "[I")
	private int[] anIntArray185;

	@OriginalMember(owner = "client!UUIGNTAD", name = "h", descriptor = "[I")
	private int[] anIntArray186;

	@OriginalMember(owner = "client!UUIGNTAD", name = "i", descriptor = "[I")
	private int[] anIntArray187;

	@OriginalMember(owner = "client!UUIGNTAD", name = "j", descriptor = "Z")
	private boolean aBoolean160;

	@OriginalMember(owner = "client!UUIGNTAD", name = "a", descriptor = "Z")
	private boolean aBoolean158 = true;

	@OriginalMember(owner = "client!UUIGNTAD", name = "b", descriptor = "I")
	private int anInt704 = 536;

	@OriginalMember(owner = "client!UUIGNTAD", name = "c", descriptor = "Z")
	private boolean aBoolean159 = true;

	@OriginalMember(owner = "client!UUIGNTAD", name = "<init>", descriptor = "(I[B)V")
	public Class38(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		try {
			this.method511(arg1);
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("19685, " + arg0 + ", " + arg1 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UUIGNTAD", name = "a", descriptor = "([BZ)V")
	private void method511(@OriginalArg(0) byte[] arg0) {
		try {
			@Pc(11) Class1_Sub1_Sub3 local11 = new Class1_Sub1_Sub3(arg0, this.anInt704);
			@Pc(14) int local14 = local11.method59();
			@Pc(17) int local17 = local11.method59();
			if (local17 == local14) {
				this.aByteArray18 = arg0;
				this.aBoolean160 = false;
			} else {
				@Pc(23) byte[] local23 = new byte[local14];
				Class8.method122(local23, local14, arg0, local17, 6);
				this.aByteArray18 = local23;
				local11 = new Class1_Sub1_Sub3(this.aByteArray18, this.anInt704);
				this.aBoolean160 = true;
			}
			this.anInt705 = local11.method57();
			this.anIntArray184 = new int[this.anInt705];
			this.anIntArray185 = new int[this.anInt705];
			this.anIntArray186 = new int[this.anInt705];
			this.anIntArray187 = new int[this.anInt705];
			@Pc(84) int local84 = local11.anInt78 + this.anInt705 * 10;
			for (@Pc(86) int local86 = 0; local86 < this.anInt705; local86++) {
				this.anIntArray184[local86] = local11.method60();
				this.anIntArray185[local86] = local11.method59();
				this.anIntArray186[local86] = local11.method59();
				this.anIntArray187[local86] = local84;
				local84 += this.anIntArray186[local86];
			}
		} catch (@Pc(125) RuntimeException local125) {
			signlink.reporterror("67187, " + arg0 + ", " + true + ", " + local125.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UUIGNTAD", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
	public byte[] method512(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(3) int local3 = 0;
		@Pc(6) String local6 = arg0.toUpperCase();
		for (@Pc(8) int local8 = 0; local8 < local6.length(); local8++) {
			local3 = local3 * 61 + local6.charAt(local8) - 32;
		}
		for (@Pc(27) int local27 = 0; local27 < this.anInt705; local27++) {
			if (this.anIntArray184[local27] == local3) {
				if (arg1 == null) {
					arg1 = new byte[this.anIntArray185[local27]];
				}
				if (this.aBoolean160) {
					for (@Pc(67) int local67 = 0; local67 < this.anIntArray185[local27]; local67++) {
						arg1[local67] = this.aByteArray18[this.anIntArray187[local27] + local67];
					}
				} else {
					Class8.method122(arg1, this.anIntArray185[local27], this.aByteArray18, this.anIntArray186[local27], this.anIntArray187[local27]);
				}
				return arg1;
			}
		}
		return null;
	}
}
