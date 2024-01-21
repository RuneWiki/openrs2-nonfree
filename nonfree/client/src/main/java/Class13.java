import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!FXNTEMPE")
public final class Class13 {

	@OriginalMember(owner = "client!FXNTEMPE", name = "b", descriptor = "[B")
	private byte[] aByteArray10;

	@OriginalMember(owner = "client!FXNTEMPE", name = "c", descriptor = "I")
	private int anInt160;

	@OriginalMember(owner = "client!FXNTEMPE", name = "d", descriptor = "[I")
	private int[] anIntArray40;

	@OriginalMember(owner = "client!FXNTEMPE", name = "e", descriptor = "[I")
	private int[] anIntArray41;

	@OriginalMember(owner = "client!FXNTEMPE", name = "f", descriptor = "[I")
	private int[] anIntArray42;

	@OriginalMember(owner = "client!FXNTEMPE", name = "g", descriptor = "[I")
	private int[] anIntArray43;

	@OriginalMember(owner = "client!FXNTEMPE", name = "h", descriptor = "Z")
	private boolean aBoolean48;

	@OriginalMember(owner = "client!FXNTEMPE", name = "a", descriptor = "Z")
	private boolean aBoolean47 = false;

	@OriginalMember(owner = "client!FXNTEMPE", name = "<init>", descriptor = "([BB)V")
	public Class13(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(9) boolean local9 = false;
			this.method116(arg0);
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("38896, " + arg0 + ", " + arg1 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FXNTEMPE", name = "a", descriptor = "([BI)V")
	private void method116(@OriginalArg(0) byte[] arg0) {
		try {
			@Pc(7) Class2_Sub1_Sub4 local7 = new Class2_Sub1_Sub4(arg0, -46859);
			@Pc(10) int local10 = local7.method344();
			@Pc(13) int local13 = local7.method344();
			if (local13 == local10) {
				this.aByteArray10 = arg0;
				this.aBoolean48 = false;
			} else {
				@Pc(19) byte[] local19 = new byte[local10];
				Class20.method201(local19, local10, arg0, local13, 6);
				this.aByteArray10 = local19;
				local7 = new Class2_Sub1_Sub4(this.aByteArray10, -46859);
				this.aBoolean48 = true;
			}
			this.anInt160 = local7.method342();
			this.anIntArray40 = new int[this.anInt160];
			this.anIntArray41 = new int[this.anInt160];
			this.anIntArray42 = new int[this.anInt160];
			this.anIntArray43 = new int[this.anInt160];
			@Pc(83) int local83 = local7.anInt556 + this.anInt160 * 10;
			for (@Pc(85) int local85 = 0; local85 < this.anInt160; local85++) {
				this.anIntArray40[local85] = local7.method345();
				this.anIntArray41[local85] = local7.method344();
				this.anIntArray42[local85] = local7.method344();
				this.anIntArray43[local85] = local83;
				local83 += this.anIntArray42[local85];
			}
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("62188, " + arg0 + ", " + 39298 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FXNTEMPE", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
	public byte[] method117(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(3) int local3 = 0;
		@Pc(6) String local6 = arg0.toUpperCase();
		for (@Pc(8) int local8 = 0; local8 < local6.length(); local8++) {
			local3 = local3 * 61 + local6.charAt(local8) - 32;
		}
		for (@Pc(27) int local27 = 0; local27 < this.anInt160; local27++) {
			if (this.anIntArray40[local27] == local3) {
				if (arg1 == null) {
					arg1 = new byte[this.anIntArray41[local27]];
				}
				if (this.aBoolean48) {
					for (@Pc(67) int local67 = 0; local67 < this.anIntArray41[local27]; local67++) {
						arg1[local67] = this.aByteArray10[this.anIntArray43[local27] + local67];
					}
				} else {
					Class20.method201(arg1, this.anIntArray41[local27], this.aByteArray10, this.anIntArray42[local27], this.anIntArray43[local27]);
				}
				return arg1;
			}
		}
		return null;
	}
}
