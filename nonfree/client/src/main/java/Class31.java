import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!NXFIIFAD")
public final class Class31 {

	@OriginalMember(owner = "client!NXFIIFAD", name = "d", descriptor = "[B")
	private byte[] aByteArray11;

	@OriginalMember(owner = "client!NXFIIFAD", name = "e", descriptor = "I")
	private int anInt495;

	@OriginalMember(owner = "client!NXFIIFAD", name = "f", descriptor = "[I")
	private int[] anIntArray113;

	@OriginalMember(owner = "client!NXFIIFAD", name = "g", descriptor = "[I")
	private int[] anIntArray114;

	@OriginalMember(owner = "client!NXFIIFAD", name = "h", descriptor = "[I")
	private int[] anIntArray115;

	@OriginalMember(owner = "client!NXFIIFAD", name = "i", descriptor = "[I")
	private int[] anIntArray116;

	@OriginalMember(owner = "client!NXFIIFAD", name = "j", descriptor = "Z")
	private boolean aBoolean105;

	@OriginalMember(owner = "client!NXFIIFAD", name = "a", descriptor = "Z")
	private boolean aBoolean103 = false;

	@OriginalMember(owner = "client!NXFIIFAD", name = "b", descriptor = "Z")
	private boolean aBoolean104 = true;

	@OriginalMember(owner = "client!NXFIIFAD", name = "c", descriptor = "I")
	private int anInt494 = 503;

	@OriginalMember(owner = "client!NXFIIFAD", name = "<init>", descriptor = "([BZ)V")
	public Class31(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1) {
		try {
			if (!arg1) {
				this.aBoolean103 = !this.aBoolean103;
			}
			this.method351(arg0);
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("13975, " + arg0 + ", " + arg1 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NXFIIFAD", name = "a", descriptor = "(Z[B)V")
	private void method351(@OriginalArg(1) byte[] arg0) {
		try {
			@Pc(7) Class1_Sub2_Sub3 local7 = new Class1_Sub2_Sub3(arg0, -670);
			@Pc(10) int local10 = local7.method311();
			@Pc(18) int local18 = local7.method311();
			if (local18 == local10) {
				this.aByteArray11 = arg0;
				this.aBoolean105 = false;
			} else {
				@Pc(24) byte[] local24 = new byte[local10];
				Class5.method89(local24, local10, arg0, local18, 6);
				this.aByteArray11 = local24;
				local7 = new Class1_Sub2_Sub3(this.aByteArray11, -670);
				this.aBoolean105 = true;
			}
			this.anInt495 = local7.method309();
			this.anIntArray113 = new int[this.anInt495];
			this.anIntArray114 = new int[this.anInt495];
			this.anIntArray115 = new int[this.anInt495];
			this.anIntArray116 = new int[this.anInt495];
			@Pc(84) int local84 = local7.anInt474 + this.anInt495 * 10;
			for (@Pc(86) int local86 = 0; local86 < this.anInt495; local86++) {
				this.anIntArray113[local86] = local7.method312();
				this.anIntArray114[local86] = local7.method311();
				this.anIntArray115[local86] = local7.method311();
				this.anIntArray116[local86] = local84;
				local84 += this.anIntArray115[local86];
			}
		} catch (@Pc(125) RuntimeException local125) {
			signlink.reporterror("94628, " + false + ", " + arg0 + ", " + local125.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NXFIIFAD", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
	public byte[] method352(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(3) int local3 = 0;
		@Pc(6) String local6 = arg0.toUpperCase();
		for (@Pc(8) int local8 = 0; local8 < local6.length(); local8++) {
			local3 = local3 * 61 + local6.charAt(local8) - 32;
		}
		for (@Pc(27) int local27 = 0; local27 < this.anInt495; local27++) {
			if (this.anIntArray113[local27] == local3) {
				if (arg1 == null) {
					arg1 = new byte[this.anIntArray114[local27]];
				}
				if (this.aBoolean105) {
					for (@Pc(67) int local67 = 0; local67 < this.anIntArray114[local27]; local67++) {
						arg1[local67] = this.aByteArray11[this.anIntArray116[local27] + local67];
					}
				} else {
					Class5.method89(arg1, this.anIntArray114[local27], this.aByteArray11, this.anIntArray115[local27], this.anIntArray116[local27]);
				}
				return arg1;
			}
		}
		return null;
	}
}
