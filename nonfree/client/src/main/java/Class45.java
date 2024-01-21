import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!XRWUKRPO")
public final class Class45 {

	@OriginalMember(owner = "client!XRWUKRPO", name = "c", descriptor = "[B")
	private byte[] aByteArray19;

	@OriginalMember(owner = "client!XRWUKRPO", name = "d", descriptor = "I")
	private int anInt785;

	@OriginalMember(owner = "client!XRWUKRPO", name = "e", descriptor = "[I")
	private int[] anIntArray187;

	@OriginalMember(owner = "client!XRWUKRPO", name = "f", descriptor = "[I")
	private int[] anIntArray188;

	@OriginalMember(owner = "client!XRWUKRPO", name = "g", descriptor = "[I")
	private int[] anIntArray189;

	@OriginalMember(owner = "client!XRWUKRPO", name = "h", descriptor = "[I")
	private int[] anIntArray190;

	@OriginalMember(owner = "client!XRWUKRPO", name = "i", descriptor = "Z")
	private boolean aBoolean178;

	@OriginalMember(owner = "client!XRWUKRPO", name = "a", descriptor = "B")
	private byte aByte36 = 112;

	@OriginalMember(owner = "client!XRWUKRPO", name = "b", descriptor = "Z")
	private boolean aBoolean177 = false;

	@OriginalMember(owner = "client!XRWUKRPO", name = "<init>", descriptor = "(I[B)V")
	public Class45(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		try {
			this.method552(this.aByte36, arg1);
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("55233, " + arg0 + ", " + arg1 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XRWUKRPO", name = "a", descriptor = "(B[B)V")
	private void method552(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1) {
		try {
			@Pc(7) Class8_Sub1_Sub3 local7 = new Class8_Sub1_Sub3(arg1, -49015);
			@Pc(10) int local10 = local7.method169();
			@Pc(13) int local13 = local7.method169();
			if (local13 == local10) {
				this.aByteArray19 = arg1;
				this.aBoolean178 = false;
			} else {
				@Pc(19) byte[] local19 = new byte[local10];
				Class30.method342(local19, local10, arg1, local13, 6);
				this.aByteArray19 = local19;
				local7 = new Class8_Sub1_Sub3(this.aByteArray19, -49015);
				this.aBoolean178 = true;
			}
			this.anInt785 = local7.method167();
			this.anIntArray187 = new int[this.anInt785];
			this.anIntArray188 = new int[this.anInt785];
			@Pc(66) int local66;
			if (arg0 != 112) {
				for (local66 = 1; local66 > 0; local66++) {
				}
			}
			this.anIntArray189 = new int[this.anInt785];
			this.anIntArray190 = new int[this.anInt785];
			local66 = local7.anInt253 + this.anInt785 * 10;
			for (@Pc(91) int local91 = 0; local91 < this.anInt785; local91++) {
				this.anIntArray187[local91] = local7.method170();
				this.anIntArray188[local91] = local7.method169();
				this.anIntArray189[local91] = local7.method169();
				this.anIntArray190[local91] = local66;
				local66 += this.anIntArray189[local91];
			}
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("49602, " + arg0 + ", " + arg1 + ", " + local130.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XRWUKRPO", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
	public byte[] method553(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(3) int local3 = 0;
		@Pc(6) String local6 = arg0.toUpperCase();
		for (@Pc(8) int local8 = 0; local8 < local6.length(); local8++) {
			local3 = local3 * 61 + local6.charAt(local8) - 32;
		}
		for (@Pc(27) int local27 = 0; local27 < this.anInt785; local27++) {
			if (this.anIntArray187[local27] == local3) {
				if (arg1 == null) {
					arg1 = new byte[this.anIntArray188[local27]];
				}
				if (this.aBoolean178) {
					for (@Pc(67) int local67 = 0; local67 < this.anIntArray188[local27]; local67++) {
						arg1[local67] = this.aByteArray19[this.anIntArray190[local27] + local67];
					}
				} else {
					Class30.method342(arg1, this.anIntArray188[local27], this.aByteArray19, this.anIntArray189[local27], this.anIntArray190[local27]);
				}
				return arg1;
			}
		}
		return null;
	}
}
