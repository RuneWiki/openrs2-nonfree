import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class34 {

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "[B")
	private byte[] aByteArray11;

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
	private int anInt567;

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "[I")
	private int[] anIntArray189;

	@OriginalMember(owner = "client!tb", name = "f", descriptor = "[I")
	private int[] anIntArray190;

	@OriginalMember(owner = "client!tb", name = "g", descriptor = "[I")
	private int[] anIntArray191;

	@OriginalMember(owner = "client!tb", name = "h", descriptor = "[I")
	private int[] anIntArray192;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
	private int anInt566 = -958;

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "Z")
	private boolean aBoolean108 = true;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "([BI)V")
	public Class34(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.method427(arg0);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(B[B)V")
	private void method427(@OriginalArg(1) byte[] arg0) {
		@Pc(7) Class1_Sub3_Sub3 local7 = new Class1_Sub3_Sub3(arg0, (byte) 63);
		@Pc(10) int local10 = local7.method335();
		@Pc(13) int local13 = local7.method335();
		if (local13 == local10) {
			this.aByteArray11 = arg0;
		} else {
			@Pc(19) byte[] local19 = new byte[local10];
			Class29.method411(local19, local10, arg0, local13, 6);
			this.aByteArray11 = local19;
			local7 = new Class1_Sub3_Sub3(this.aByteArray11, (byte) 63);
		}
		this.anInt567 = local7.method333();
		this.anIntArray189 = new int[this.anInt567];
		this.anIntArray190 = new int[this.anInt567];
		this.anIntArray191 = new int[this.anInt567];
		this.anIntArray192 = new int[this.anInt567];
		@Pc(84) int local84 = local7.anInt394 + this.anInt567 * 10;
		for (@Pc(86) int local86 = 0; local86 < this.anInt567; local86++) {
			this.anIntArray189[local86] = local7.method336();
			this.anIntArray190[local86] = local7.method335();
			this.anIntArray191[local86] = local7.method335();
			this.anIntArray192[local86] = local84;
			local84 += this.anIntArray191[local86];
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I[BLjava/lang/String;)[B")
	public byte[] method428(@OriginalArg(1) byte[] arg0, @OriginalArg(2) String arg1) {
		@Pc(3) int local3 = 0;
		@Pc(6) String local6 = arg1.toUpperCase();
		for (@Pc(8) int local8 = 0; local8 < local6.length(); local8++) {
			local3 = local3 * 61 + local6.charAt(local8) - 32;
		}
		for (@Pc(27) int local27 = 0; local27 < this.anInt567; local27++) {
			if (this.anIntArray189[local27] == local3) {
				if (arg0 == null) {
					arg0 = new byte[this.anIntArray190[local27]];
				}
				if (this.anIntArray190[local27] == this.anIntArray191[local27]) {
					for (@Pc(73) int local73 = 0; local73 < this.anIntArray190[local27]; local73++) {
						arg0[local73] = this.aByteArray11[this.anIntArray192[local27] + local73];
					}
				} else {
					Class29.method411(arg0, this.anIntArray190[local27], this.aByteArray11, this.anIntArray191[local27], this.anIntArray192[local27]);
				}
				return arg0;
			}
		}
		return null;
	}
}
