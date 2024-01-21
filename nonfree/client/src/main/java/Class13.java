import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!HBJEXSJX")
public final class Class13 {

	@OriginalMember(owner = "client!HBJEXSJX", name = "c", descriptor = "[B")
	private byte[] aByteArray9;

	@OriginalMember(owner = "client!HBJEXSJX", name = "d", descriptor = "I")
	private int anInt398;

	@OriginalMember(owner = "client!HBJEXSJX", name = "e", descriptor = "[I")
	private int[] anIntArray63;

	@OriginalMember(owner = "client!HBJEXSJX", name = "f", descriptor = "[I")
	private int[] anIntArray64;

	@OriginalMember(owner = "client!HBJEXSJX", name = "g", descriptor = "[I")
	private int[] anIntArray65;

	@OriginalMember(owner = "client!HBJEXSJX", name = "h", descriptor = "[I")
	private int[] anIntArray66;

	@OriginalMember(owner = "client!HBJEXSJX", name = "i", descriptor = "Z")
	private boolean aBoolean71;

	@OriginalMember(owner = "client!HBJEXSJX", name = "a", descriptor = "I")
	private int anInt397 = -28345;

	@OriginalMember(owner = "client!HBJEXSJX", name = "b", descriptor = "Z")
	private boolean aBoolean70 = true;

	@OriginalMember(owner = "client!HBJEXSJX", name = "<init>", descriptor = "(Z[B)V")
	public Class13(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1) {
		try {
			this.method277(arg1);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("29068, " + arg0 + ", " + arg1 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HBJEXSJX", name = "a", descriptor = "(I[B)V")
	private void method277(@OriginalArg(1) byte[] arg0) {
		try {
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3(arg0, 0);
			@Pc(15) int local15 = local7.method159();
			@Pc(18) int local18 = local7.method159();
			if (local18 == local15) {
				this.aByteArray9 = arg0;
				this.aBoolean71 = false;
			} else {
				@Pc(24) byte[] local24 = new byte[local15];
				Class28.method405(local24, local15, arg0, local18, 6);
				this.aByteArray9 = local24;
				local7 = new Class1_Sub1_Sub3(this.aByteArray9, 0);
				this.aBoolean71 = true;
			}
			this.anInt398 = local7.method157();
			this.anIntArray63 = new int[this.anInt398];
			this.anIntArray64 = new int[this.anInt398];
			this.anIntArray65 = new int[this.anInt398];
			this.anIntArray66 = new int[this.anInt398];
			@Pc(84) int local84 = local7.anInt301 + this.anInt398 * 10;
			for (@Pc(86) int local86 = 0; local86 < this.anInt398; local86++) {
				this.anIntArray63[local86] = local7.method160();
				this.anIntArray64[local86] = local7.method159();
				this.anIntArray65[local86] = local7.method159();
				this.anIntArray66[local86] = local84;
				local84 += this.anIntArray65[local86];
			}
		} catch (@Pc(125) RuntimeException local125) {
			signlink.reporterror("76749, " + -412 + ", " + arg0 + ", " + local125.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HBJEXSJX", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
	public byte[] method278(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(3) int local3 = 0;
		@Pc(6) String local6 = arg0.toUpperCase();
		for (@Pc(8) int local8 = 0; local8 < local6.length(); local8++) {
			local3 = local3 * 61 + local6.charAt(local8) - 32;
		}
		for (@Pc(27) int local27 = 0; local27 < this.anInt398; local27++) {
			if (this.anIntArray63[local27] == local3) {
				if (arg1 == null) {
					arg1 = new byte[this.anIntArray64[local27]];
				}
				if (this.aBoolean71) {
					for (@Pc(67) int local67 = 0; local67 < this.anIntArray64[local27]; local67++) {
						arg1[local67] = this.aByteArray9[this.anIntArray66[local27] + local67];
					}
				} else {
					Class28.method405(arg1, this.anIntArray64[local27], this.aByteArray9, this.anIntArray65[local27], this.anIntArray66[local27]);
				}
				return arg1;
			}
		}
		return null;
	}
}
