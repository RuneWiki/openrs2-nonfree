import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!XTGLDHGX")
public final class Class44 {

	@OriginalMember(owner = "client!XTGLDHGX", name = "d", descriptor = "[B")
	private byte[] aByteArray19;

	@OriginalMember(owner = "client!XTGLDHGX", name = "e", descriptor = "I")
	private int anInt724;

	@OriginalMember(owner = "client!XTGLDHGX", name = "f", descriptor = "[I")
	private int[] anIntArray151;

	@OriginalMember(owner = "client!XTGLDHGX", name = "g", descriptor = "[I")
	private int[] anIntArray152;

	@OriginalMember(owner = "client!XTGLDHGX", name = "h", descriptor = "[I")
	private int[] anIntArray153;

	@OriginalMember(owner = "client!XTGLDHGX", name = "i", descriptor = "[I")
	private int[] anIntArray154;

	@OriginalMember(owner = "client!XTGLDHGX", name = "j", descriptor = "Z")
	private boolean aBoolean183;

	@OriginalMember(owner = "client!XTGLDHGX", name = "a", descriptor = "B")
	private byte aByte22 = 0;

	@OriginalMember(owner = "client!XTGLDHGX", name = "b", descriptor = "I")
	private int anInt722 = 9;

	@OriginalMember(owner = "client!XTGLDHGX", name = "c", descriptor = "I")
	private int anInt723 = -29508;

	@OriginalMember(owner = "client!XTGLDHGX", name = "<init>", descriptor = "(I[B)V")
	public Class44(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		try {
			this.method483(arg1, this.aByte22);
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("19672, " + arg0 + ", " + arg1 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XTGLDHGX", name = "a", descriptor = "([BB)V")
	private void method483(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3(arg0, 891);
			@Pc(10) int local10 = local7.method272();
			@Pc(13) int local13 = local7.method272();
			if (local13 == local10) {
				this.aByteArray19 = arg0;
				this.aBoolean183 = false;
			} else {
				@Pc(19) byte[] local19 = new byte[local10];
				Class15.method206(local19, local10, arg0, local13, 6);
				this.aByteArray19 = local19;
				local7 = new Class1_Sub1_Sub3(this.aByteArray19, 891);
				this.aBoolean183 = true;
			}
			this.anInt724 = local7.method270();
			if (arg1 == 0) {
				this.anIntArray151 = new int[this.anInt724];
				this.anIntArray152 = new int[this.anInt724];
				this.anIntArray153 = new int[this.anInt724];
				this.anIntArray154 = new int[this.anInt724];
				@Pc(82) int local82 = local7.anInt468 + this.anInt724 * 10;
				for (@Pc(84) int local84 = 0; local84 < this.anInt724; local84++) {
					this.anIntArray151[local84] = local7.method273();
					this.anIntArray152[local84] = local7.method272();
					this.anIntArray153[local84] = local7.method272();
					this.anIntArray154[local84] = local82;
					local82 += this.anIntArray153[local84];
				}
			}
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("33190, " + arg0 + ", " + arg1 + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XTGLDHGX", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
	public byte[] method484(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(3) int local3 = 0;
		@Pc(6) String local6 = arg0.toUpperCase();
		for (@Pc(8) int local8 = 0; local8 < local6.length(); local8++) {
			local3 = local3 * 61 + local6.charAt(local8) - 32;
		}
		for (@Pc(27) int local27 = 0; local27 < this.anInt724; local27++) {
			if (this.anIntArray151[local27] == local3) {
				if (arg1 == null) {
					arg1 = new byte[this.anIntArray152[local27]];
				}
				if (this.aBoolean183) {
					for (@Pc(67) int local67 = 0; local67 < this.anIntArray152[local27]; local67++) {
						arg1[local67] = this.aByteArray19[this.anIntArray154[local27] + local67];
					}
				} else {
					Class15.method206(arg1, this.anIntArray152[local27], this.aByteArray19, this.anIntArray153[local27], this.anIntArray154[local27]);
				}
				return arg1;
			}
		}
		return null;
	}
}
