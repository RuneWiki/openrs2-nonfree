import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!MNPBQFWE")
public final class Class27 {

	@OriginalMember(owner = "client!MNPBQFWE", name = "c", descriptor = "[B")
	private byte[] aByteArray11;

	@OriginalMember(owner = "client!MNPBQFWE", name = "d", descriptor = "I")
	private int anInt483;

	@OriginalMember(owner = "client!MNPBQFWE", name = "e", descriptor = "[I")
	private int[] anIntArray128;

	@OriginalMember(owner = "client!MNPBQFWE", name = "f", descriptor = "[I")
	private int[] anIntArray129;

	@OriginalMember(owner = "client!MNPBQFWE", name = "g", descriptor = "[I")
	private int[] anIntArray130;

	@OriginalMember(owner = "client!MNPBQFWE", name = "h", descriptor = "[I")
	private int[] anIntArray131;

	@OriginalMember(owner = "client!MNPBQFWE", name = "i", descriptor = "Z")
	private boolean aBoolean122;

	@OriginalMember(owner = "client!MNPBQFWE", name = "a", descriptor = "Z")
	private boolean aBoolean121 = false;

	@OriginalMember(owner = "client!MNPBQFWE", name = "b", descriptor = "I")
	private int anInt482 = 6;

	@OriginalMember(owner = "client!MNPBQFWE", name = "<init>", descriptor = "(I[B)V")
	public Class27(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		try {
			this.method339(arg1, this.aBoolean121);
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("57308, " + arg0 + ", " + arg1 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MNPBQFWE", name = "a", descriptor = "([BZ)V")
	private void method339(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1) {
		try {
			@Pc(7) Class1_Sub1_Sub2 local7 = new Class1_Sub1_Sub2(false, arg0);
			@Pc(10) int local10 = local7.method26();
			@Pc(13) int local13 = local7.method26();
			@Pc(17) int local17;
			if (arg1) {
				for (local17 = 1; local17 > 0; local17++) {
				}
			}
			if (local13 == local10) {
				this.aByteArray11 = arg0;
				this.aBoolean122 = false;
			} else {
				@Pc(28) byte[] local28 = new byte[local10];
				Class43.method480(local28, local10, arg0, local13, 6);
				this.aByteArray11 = local28;
				local7 = new Class1_Sub1_Sub2(false, this.aByteArray11);
				this.aBoolean122 = true;
			}
			this.anInt483 = local7.method24();
			this.anIntArray128 = new int[this.anInt483];
			this.anIntArray129 = new int[this.anInt483];
			this.anIntArray130 = new int[this.anInt483];
			this.anIntArray131 = new int[this.anInt483];
			local17 = local7.anInt10 + this.anInt483 * 10;
			for (@Pc(90) int local90 = 0; local90 < this.anInt483; local90++) {
				this.anIntArray128[local90] = local7.method27();
				this.anIntArray129[local90] = local7.method26();
				this.anIntArray130[local90] = local7.method26();
				this.anIntArray131[local90] = local17;
				local17 += this.anIntArray130[local90];
			}
		} catch (@Pc(129) RuntimeException local129) {
			signlink.reporterror("68611, " + arg0 + ", " + arg1 + ", " + local129.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MNPBQFWE", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
	public byte[] method340(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(3) int local3 = 0;
		@Pc(6) String local6 = arg0.toUpperCase();
		for (@Pc(8) int local8 = 0; local8 < local6.length(); local8++) {
			local3 = local3 * 61 + local6.charAt(local8) - 32;
		}
		for (@Pc(27) int local27 = 0; local27 < this.anInt483; local27++) {
			if (this.anIntArray128[local27] == local3) {
				if (arg1 == null) {
					arg1 = new byte[this.anIntArray129[local27]];
				}
				if (this.aBoolean122) {
					for (@Pc(67) int local67 = 0; local67 < this.anIntArray129[local27]; local67++) {
						arg1[local67] = this.aByteArray11[this.anIntArray131[local27] + local67];
					}
				} else {
					Class43.method480(arg1, this.anIntArray129[local27], this.aByteArray11, this.anIntArray130[local27], this.anIntArray131[local27]);
				}
				return arg1;
			}
		}
		return null;
	}
}
