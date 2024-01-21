import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!xb")
public final class Class47 {

	@OriginalMember(owner = "client!xb", name = "c", descriptor = "[B")
	private byte[] aByteArray21;

	@OriginalMember(owner = "client!xb", name = "d", descriptor = "I")
	private int anInt980;

	@OriginalMember(owner = "client!xb", name = "e", descriptor = "[I")
	private int[] anIntArray262;

	@OriginalMember(owner = "client!xb", name = "f", descriptor = "[I")
	private int[] anIntArray263;

	@OriginalMember(owner = "client!xb", name = "g", descriptor = "[I")
	private int[] anIntArray264;

	@OriginalMember(owner = "client!xb", name = "h", descriptor = "[I")
	private int[] anIntArray265;

	@OriginalMember(owner = "client!xb", name = "i", descriptor = "Z")
	private boolean aBoolean251;

	@OriginalMember(owner = "client!xb", name = "a", descriptor = "I")
	private int anInt979 = 35839;

	@OriginalMember(owner = "client!xb", name = "b", descriptor = "Z")
	private boolean aBoolean250 = false;

	@OriginalMember(owner = "client!xb", name = "<init>", descriptor = "(I[B)V")
	public Class47(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		try {
			this.method659(arg1);
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("23438, " + arg0 + ", " + arg1 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!xb", name = "a", descriptor = "(I[B)V")
	private void method659(@OriginalArg(1) byte[] arg0) {
		try {
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3(arg0, 185);
			@Pc(10) int local10 = local7.method478();
			@Pc(13) int local13 = local7.method478();
			if (local13 == local10) {
				this.aByteArray21 = arg0;
				this.aBoolean251 = false;
			} else {
				@Pc(19) byte[] local19 = new byte[local10];
				Class38.method575(local19, local10, arg0, local13, 6);
				this.aByteArray21 = local19;
				local7 = new Class1_Sub1_Sub3(this.aByteArray21, 185);
				this.aBoolean251 = true;
			}
			this.anInt980 = local7.method476();
			this.anIntArray262 = new int[this.anInt980];
			this.anIntArray263 = new int[this.anInt980];
			this.anIntArray264 = new int[this.anInt980];
			this.anIntArray265 = new int[this.anInt980];
			@Pc(79) int local79 = local7.anInt738 + this.anInt980 * 10;
			for (@Pc(92) int local92 = 0; local92 < this.anInt980; local92++) {
				this.anIntArray262[local92] = local7.method479();
				this.anIntArray263[local92] = local7.method478();
				this.anIntArray264[local92] = local7.method478();
				this.anIntArray265[local92] = local79;
				local79 += this.anIntArray264[local92];
			}
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("13479, " + 9 + ", " + arg0 + ", " + local131.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!xb", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
	public byte[] method660(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(3) int local3 = 0;
		@Pc(6) String local6 = arg0.toUpperCase();
		for (@Pc(8) int local8 = 0; local8 < local6.length(); local8++) {
			local3 = local3 * 61 + local6.charAt(local8) - 32;
		}
		for (@Pc(27) int local27 = 0; local27 < this.anInt980; local27++) {
			if (this.anIntArray262[local27] == local3) {
				if (arg1 == null) {
					arg1 = new byte[this.anIntArray263[local27]];
				}
				if (this.aBoolean251) {
					for (@Pc(67) int local67 = 0; local67 < this.anIntArray263[local27]; local67++) {
						arg1[local67] = this.aByteArray21[this.anIntArray265[local27] + local67];
					}
				} else {
					Class38.method575(arg1, this.anIntArray263[local27], this.aByteArray21, this.anIntArray264[local27], this.anIntArray265[local27]);
				}
				return arg1;
			}
		}
		return null;
	}
}
