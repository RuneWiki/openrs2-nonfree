import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!SMIVAFST")
public final class Class35 {

	@OriginalMember(owner = "client!SMIVAFST", name = "e", descriptor = "[B")
	private byte[] aByteArray14;

	@OriginalMember(owner = "client!SMIVAFST", name = "f", descriptor = "I")
	private int anInt656;

	@OriginalMember(owner = "client!SMIVAFST", name = "g", descriptor = "[I")
	private int[] anIntArray161;

	@OriginalMember(owner = "client!SMIVAFST", name = "h", descriptor = "[I")
	private int[] anIntArray162;

	@OriginalMember(owner = "client!SMIVAFST", name = "i", descriptor = "[I")
	private int[] anIntArray163;

	@OriginalMember(owner = "client!SMIVAFST", name = "j", descriptor = "[I")
	private int[] anIntArray164;

	@OriginalMember(owner = "client!SMIVAFST", name = "k", descriptor = "Z")
	private boolean aBoolean196;

	@OriginalMember(owner = "client!SMIVAFST", name = "b", descriptor = "I")
	private int anInt654 = 490;

	@OriginalMember(owner = "client!SMIVAFST", name = "c", descriptor = "Z")
	private boolean aBoolean195 = false;

	@OriginalMember(owner = "client!SMIVAFST", name = "d", descriptor = "I")
	private int anInt655 = 8990;

	@OriginalMember(owner = "client!SMIVAFST", name = "a", descriptor = "I")
	private int anInt653;

	@OriginalMember(owner = "client!SMIVAFST", name = "<init>", descriptor = "([BI)V")
	public Class35(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		try {
			this.method484(arg0);
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("68831, " + arg0 + ", " + arg1 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SMIVAFST", name = "a", descriptor = "(Z[B)V")
	private void method484(@OriginalArg(1) byte[] arg0) {
		try {
			@Pc(7) Class2_Sub1_Sub2 local7 = new Class2_Sub1_Sub2(arg0, (byte) 3);
			@Pc(10) int local10 = local7.method98();
			@Pc(13) int local13 = local7.method98();
			if (local13 == local10) {
				this.aByteArray14 = arg0;
				this.aBoolean196 = false;
			} else {
				@Pc(19) byte[] local19 = new byte[local10];
				Class23.method304(local19, local10, arg0, local13, 6);
				this.aByteArray14 = local19;
				local7 = new Class2_Sub1_Sub2(this.aByteArray14, (byte) 3);
				this.aBoolean196 = true;
			}
			this.anInt656 = local7.method96();
			this.anIntArray161 = new int[this.anInt656];
			this.anIntArray162 = new int[this.anInt656];
			this.anIntArray163 = new int[this.anInt656];
			this.anIntArray164 = new int[this.anInt656];
			@Pc(89) int local89 = local7.anInt81 + this.anInt656 * 10;
			for (@Pc(91) int local91 = 0; local91 < this.anInt656; local91++) {
				this.anIntArray161[local91] = local7.method99();
				this.anIntArray162[local91] = local7.method98();
				this.anIntArray163[local91] = local7.method98();
				this.anIntArray164[local91] = local89;
				local89 += this.anIntArray163[local91];
			}
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("82885, " + false + ", " + arg0 + ", " + local130.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SMIVAFST", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
	public byte[] method485(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(3) int local3 = 0;
		@Pc(6) String local6 = arg0.toUpperCase();
		for (@Pc(8) int local8 = 0; local8 < local6.length(); local8++) {
			local3 = local3 * 61 + local6.charAt(local8) - 32;
		}
		for (@Pc(27) int local27 = 0; local27 < this.anInt656; local27++) {
			if (this.anIntArray161[local27] == local3) {
				if (arg1 == null) {
					arg1 = new byte[this.anIntArray162[local27]];
				}
				if (this.aBoolean196) {
					for (@Pc(67) int local67 = 0; local67 < this.anIntArray162[local27]; local67++) {
						arg1[local67] = this.aByteArray14[this.anIntArray164[local27] + local67];
					}
				} else {
					Class23.method304(arg1, this.anIntArray162[local27], this.aByteArray14, this.anIntArray163[local27], this.anIntArray164[local27]);
				}
				return arg1;
			}
		}
		return null;
	}
}
