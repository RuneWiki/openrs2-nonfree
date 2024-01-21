import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!xb")
public final class Class47 {

	@OriginalMember(owner = "client!xb", name = "d", descriptor = "[B")
	private byte[] aByteArray21;

	@OriginalMember(owner = "client!xb", name = "e", descriptor = "I")
	private int anInt982;

	@OriginalMember(owner = "client!xb", name = "f", descriptor = "[I")
	private int[] anIntArray262;

	@OriginalMember(owner = "client!xb", name = "g", descriptor = "[I")
	private int[] anIntArray263;

	@OriginalMember(owner = "client!xb", name = "h", descriptor = "[I")
	private int[] anIntArray264;

	@OriginalMember(owner = "client!xb", name = "i", descriptor = "[I")
	private int[] anIntArray265;

	@OriginalMember(owner = "client!xb", name = "j", descriptor = "Z")
	private boolean aBoolean235;

	@OriginalMember(owner = "client!xb", name = "a", descriptor = "I")
	private int anInt980 = 9;

	@OriginalMember(owner = "client!xb", name = "b", descriptor = "I")
	private int anInt981 = 29615;

	@OriginalMember(owner = "client!xb", name = "c", descriptor = "Z")
	private boolean aBoolean234 = true;

	@OriginalMember(owner = "client!xb", name = "<init>", descriptor = "(I[B)V")
	public Class47(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		try {
			this.method658(arg1);
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("26017, " + arg0 + ", " + arg1 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!xb", name = "a", descriptor = "(I[B)V")
	private void method658(@OriginalArg(1) byte[] arg0) {
		try {
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3(arg0, (byte) 1);
			@Pc(10) int local10 = local7.method477();
			@Pc(13) int local13 = local7.method477();
			if (local13 == local10) {
				this.aByteArray21 = arg0;
				this.aBoolean235 = false;
			} else {
				@Pc(19) byte[] local19 = new byte[local10];
				Class38.method574(local19, local10, arg0, local13, 6);
				this.aByteArray21 = local19;
				local7 = new Class1_Sub1_Sub3(this.aByteArray21, (byte) 1);
				this.aBoolean235 = true;
			}
			this.anInt982 = local7.method475();
			this.anIntArray262 = new int[this.anInt982];
			this.anIntArray263 = new int[this.anInt982];
			this.anIntArray264 = new int[this.anInt982];
			this.anIntArray265 = new int[this.anInt982];
			@Pc(85) int local85 = local7.anInt743 + this.anInt982 * 10;
			for (@Pc(87) int local87 = 0; local87 < this.anInt982; local87++) {
				this.anIntArray262[local87] = local7.method478();
				this.anIntArray263[local87] = local7.method477();
				this.anIntArray264[local87] = local7.method477();
				this.anIntArray265[local87] = local85;
				local85 += this.anIntArray264[local87];
			}
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("69959, " + -6097 + ", " + arg0 + ", " + local126.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!xb", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
	public byte[] method659(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(3) int local3 = 0;
		@Pc(6) String local6 = arg0.toUpperCase();
		for (@Pc(8) int local8 = 0; local8 < local6.length(); local8++) {
			local3 = local3 * 61 + local6.charAt(local8) - 32;
		}
		for (@Pc(27) int local27 = 0; local27 < this.anInt982; local27++) {
			if (this.anIntArray262[local27] == local3) {
				if (arg1 == null) {
					arg1 = new byte[this.anIntArray263[local27]];
				}
				if (this.aBoolean235) {
					for (@Pc(67) int local67 = 0; local67 < this.anIntArray263[local27]; local67++) {
						arg1[local67] = this.aByteArray21[this.anIntArray265[local27] + local67];
					}
				} else {
					Class38.method574(arg1, this.anIntArray263[local27], this.aByteArray21, this.anIntArray264[local27], this.anIntArray265[local27]);
				}
				return arg1;
			}
		}
		return null;
	}
}
