import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!FNOQZAYQ")
public final class Class8 {

	@OriginalMember(owner = "client!FNOQZAYQ", name = "b", descriptor = "I")
	private int anInt189;

	@OriginalMember(owner = "client!FNOQZAYQ", name = "c", descriptor = "[B")
	private byte[] aByteArray3;

	@OriginalMember(owner = "client!FNOQZAYQ", name = "d", descriptor = "I")
	private int anInt190;

	@OriginalMember(owner = "client!FNOQZAYQ", name = "e", descriptor = "[I")
	private int[] anIntArray35;

	@OriginalMember(owner = "client!FNOQZAYQ", name = "f", descriptor = "[I")
	private int[] anIntArray36;

	@OriginalMember(owner = "client!FNOQZAYQ", name = "g", descriptor = "[I")
	private int[] anIntArray37;

	@OriginalMember(owner = "client!FNOQZAYQ", name = "h", descriptor = "[I")
	private int[] anIntArray38;

	@OriginalMember(owner = "client!FNOQZAYQ", name = "i", descriptor = "Z")
	private boolean aBoolean49;

	@OriginalMember(owner = "client!FNOQZAYQ", name = "a", descriptor = "Z")
	private boolean aBoolean48 = true;

	@OriginalMember(owner = "client!FNOQZAYQ", name = "<init>", descriptor = "([BI)V")
	public Class8(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		try {
			this.method164(arg0, (byte) 2);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("76821, " + arg0 + ", " + arg1 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FNOQZAYQ", name = "a", descriptor = "([BB)V")
	private void method164(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(18) Class2_Sub1_Sub4 local18 = new Class2_Sub1_Sub4(arg0, this.aBoolean48);
			@Pc(21) int local21 = local18.method98();
			@Pc(24) int local24 = local18.method98();
			if (local24 == local21) {
				this.aByteArray3 = arg0;
				this.aBoolean49 = false;
			} else {
				@Pc(30) byte[] local30 = new byte[local21];
				Class39.method366(local30, local21, arg0, local24, 6);
				this.aByteArray3 = local30;
				local18 = new Class2_Sub1_Sub4(this.aByteArray3, this.aBoolean48);
				this.aBoolean49 = true;
			}
			this.anInt190 = local18.method96();
			this.anIntArray35 = new int[this.anInt190];
			this.anIntArray36 = new int[this.anInt190];
			this.anIntArray37 = new int[this.anInt190];
			this.anIntArray38 = new int[this.anInt190];
			@Pc(91) int local91 = local18.anInt166 + this.anInt190 * 10;
			for (@Pc(93) int local93 = 0; local93 < this.anInt190; local93++) {
				this.anIntArray35[local93] = local18.method99();
				this.anIntArray36[local93] = local18.method98();
				this.anIntArray37[local93] = local18.method98();
				this.anIntArray38[local93] = local91;
				local91 += this.anIntArray37[local93];
			}
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("24362, " + arg0 + ", " + arg1 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FNOQZAYQ", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
	public byte[] method165(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(3) int local3 = 0;
		@Pc(6) String local6 = arg0.toUpperCase();
		for (@Pc(8) int local8 = 0; local8 < local6.length(); local8++) {
			local3 = local3 * 61 + local6.charAt(local8) - 32;
		}
		for (@Pc(27) int local27 = 0; local27 < this.anInt190; local27++) {
			if (this.anIntArray35[local27] == local3) {
				if (arg1 == null) {
					arg1 = new byte[this.anIntArray36[local27]];
				}
				if (this.aBoolean49) {
					for (@Pc(67) int local67 = 0; local67 < this.anIntArray36[local27]; local67++) {
						arg1[local67] = this.aByteArray3[this.anIntArray38[local27] + local67];
					}
				} else {
					Class39.method366(arg1, this.anIntArray36[local27], this.aByteArray3, this.anIntArray37[local27], this.anIntArray38[local27]);
				}
				return arg1;
			}
		}
		return null;
	}
}
