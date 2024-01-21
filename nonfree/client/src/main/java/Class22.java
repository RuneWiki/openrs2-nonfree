import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!LKPVZAQN")
public final class Class22 {

	@OriginalMember(owner = "client!LKPVZAQN", name = "d", descriptor = "[B")
	private byte[] aByteArray15;

	@OriginalMember(owner = "client!LKPVZAQN", name = "e", descriptor = "I")
	private int anInt333;

	@OriginalMember(owner = "client!LKPVZAQN", name = "f", descriptor = "[I")
	private int[] anIntArray94;

	@OriginalMember(owner = "client!LKPVZAQN", name = "g", descriptor = "[I")
	private int[] anIntArray95;

	@OriginalMember(owner = "client!LKPVZAQN", name = "h", descriptor = "[I")
	private int[] anIntArray96;

	@OriginalMember(owner = "client!LKPVZAQN", name = "i", descriptor = "[I")
	private int[] anIntArray97;

	@OriginalMember(owner = "client!LKPVZAQN", name = "j", descriptor = "Z")
	private boolean aBoolean83;

	@OriginalMember(owner = "client!LKPVZAQN", name = "a", descriptor = "I")
	private int anInt331 = 787;

	@OriginalMember(owner = "client!LKPVZAQN", name = "b", descriptor = "Z")
	private boolean aBoolean82 = false;

	@OriginalMember(owner = "client!LKPVZAQN", name = "c", descriptor = "I")
	private int anInt332 = 3982;

	@OriginalMember(owner = "client!LKPVZAQN", name = "<init>", descriptor = "([BI)V")
	public Class22(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		try {
			this.method206(arg0);
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("74345, " + arg0 + ", " + arg1 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LKPVZAQN", name = "a", descriptor = "(Z[B)V")
	private void method206(@OriginalArg(1) byte[] arg0) {
		try {
			@Pc(7) Class3_Sub3_Sub4 local7 = new Class3_Sub3_Sub4((byte) -115, arg0);
			@Pc(15) int local15 = local7.method472();
			@Pc(18) int local18 = local7.method472();
			if (local18 == local15) {
				this.aByteArray15 = arg0;
				this.aBoolean83 = false;
			} else {
				@Pc(24) byte[] local24 = new byte[local15];
				Class47.method527(local24, local15, arg0, local18, 6);
				this.aByteArray15 = local24;
				local7 = new Class3_Sub3_Sub4((byte) -115, this.aByteArray15);
				this.aBoolean83 = true;
			}
			this.anInt333 = local7.method470();
			this.anIntArray94 = new int[this.anInt333];
			this.anIntArray95 = new int[this.anInt333];
			this.anIntArray96 = new int[this.anInt333];
			this.anIntArray97 = new int[this.anInt333];
			@Pc(84) int local84 = local7.anInt738 + this.anInt333 * 10;
			for (@Pc(86) int local86 = 0; local86 < this.anInt333; local86++) {
				this.anIntArray94[local86] = local7.method473();
				this.anIntArray95[local86] = local7.method472();
				this.anIntArray96[local86] = local7.method472();
				this.anIntArray97[local86] = local84;
				local84 += this.anIntArray96[local86];
			}
		} catch (@Pc(125) RuntimeException local125) {
			signlink.reporterror("74902, " + true + ", " + arg0 + ", " + local125.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LKPVZAQN", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
	public byte[] method207(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(3) int local3 = 0;
		@Pc(6) String local6 = arg0.toUpperCase();
		for (@Pc(8) int local8 = 0; local8 < local6.length(); local8++) {
			local3 = local3 * 61 + local6.charAt(local8) - 32;
		}
		for (@Pc(27) int local27 = 0; local27 < this.anInt333; local27++) {
			if (this.anIntArray94[local27] == local3) {
				if (arg1 == null) {
					arg1 = new byte[this.anIntArray95[local27]];
				}
				if (this.aBoolean83) {
					for (@Pc(67) int local67 = 0; local67 < this.anIntArray95[local27]; local67++) {
						arg1[local67] = this.aByteArray15[this.anIntArray97[local27] + local67];
					}
				} else {
					Class47.method527(arg1, this.anIntArray95[local27], this.aByteArray15, this.anIntArray96[local27], this.anIntArray97[local27]);
				}
				return arg1;
			}
		}
		return null;
	}
}
