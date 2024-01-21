import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!HRXSNEYZ")
public final class Class15 {

	@OriginalMember(owner = "client!HRXSNEYZ", name = "c", descriptor = "[B")
	private byte[] aByteArray1;

	@OriginalMember(owner = "client!HRXSNEYZ", name = "d", descriptor = "I")
	private int anInt320;

	@OriginalMember(owner = "client!HRXSNEYZ", name = "e", descriptor = "[I")
	private int[] anIntArray50;

	@OriginalMember(owner = "client!HRXSNEYZ", name = "f", descriptor = "[I")
	private int[] anIntArray51;

	@OriginalMember(owner = "client!HRXSNEYZ", name = "g", descriptor = "[I")
	private int[] anIntArray52;

	@OriginalMember(owner = "client!HRXSNEYZ", name = "h", descriptor = "[I")
	private int[] anIntArray53;

	@OriginalMember(owner = "client!HRXSNEYZ", name = "i", descriptor = "Z")
	private boolean aBoolean77;

	@OriginalMember(owner = "client!HRXSNEYZ", name = "a", descriptor = "B")
	private byte aByte20 = 6;

	@OriginalMember(owner = "client!HRXSNEYZ", name = "b", descriptor = "I")
	private int anInt319 = -308;

	@OriginalMember(owner = "client!HRXSNEYZ", name = "<init>", descriptor = "([BB)V")
	public Class15(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte arg1) {
		try {
			this.method219(arg0);
			if (arg1 != this.aByte20) {
				throw new NullPointerException();
			}
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("89319, " + arg0 + ", " + arg1 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HRXSNEYZ", name = "a", descriptor = "(I[B)V")
	private void method219(@OriginalArg(1) byte[] arg0) {
		try {
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3(arg0, 8);
			@Pc(10) int local10 = local7.method242();
			@Pc(13) int local13 = local7.method242();
			if (local13 == local10) {
				this.aByteArray1 = arg0;
				this.aBoolean77 = false;
			} else {
				@Pc(19) byte[] local19 = new byte[local10];
				Class35.method347(local19, local10, arg0, local13, 6);
				this.aByteArray1 = local19;
				local7 = new Class1_Sub1_Sub3(this.aByteArray1, 8);
				this.aBoolean77 = true;
			}
			this.anInt320 = local7.method240();
			this.anIntArray50 = new int[this.anInt320];
			this.anIntArray51 = new int[this.anInt320];
			this.anIntArray52 = new int[this.anInt320];
			this.anIntArray53 = new int[this.anInt320];
			@Pc(90) int local90 = local7.anInt352 + this.anInt320 * 10;
			for (@Pc(92) int local92 = 0; local92 < this.anInt320; local92++) {
				this.anIntArray50[local92] = local7.method243();
				this.anIntArray51[local92] = local7.method242();
				this.anIntArray52[local92] = local7.method242();
				this.anIntArray53[local92] = local90;
				local90 += this.anIntArray52[local92];
			}
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("76779, " + -713 + ", " + arg0 + ", " + local131.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HRXSNEYZ", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
	public byte[] method220(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(3) int local3 = 0;
		@Pc(6) String local6 = arg0.toUpperCase();
		for (@Pc(8) int local8 = 0; local8 < local6.length(); local8++) {
			local3 = local3 * 61 + local6.charAt(local8) - 32;
		}
		for (@Pc(27) int local27 = 0; local27 < this.anInt320; local27++) {
			if (this.anIntArray50[local27] == local3) {
				if (arg1 == null) {
					arg1 = new byte[this.anIntArray51[local27]];
				}
				if (this.aBoolean77) {
					for (@Pc(67) int local67 = 0; local67 < this.anIntArray51[local27]; local67++) {
						arg1[local67] = this.aByteArray1[this.anIntArray53[local27] + local67];
					}
				} else {
					Class35.method347(arg1, this.anIntArray51[local27], this.aByteArray1, this.anIntArray52[local27], this.anIntArray53[local27]);
				}
				return arg1;
			}
		}
		return null;
	}
}
