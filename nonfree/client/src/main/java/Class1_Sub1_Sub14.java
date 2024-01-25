import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mk")
public final class Class1_Sub1_Sub14 extends Class1_Sub1 {

	@OriginalMember(owner = "client!mk", name = "C", descriptor = "[I")
	public static final int[] anIntArray414 = new int[256];

	@OriginalMember(owner = "client!mk", name = "r", descriptor = "[C")
	public char[] aCharArray3;

	@OriginalMember(owner = "client!mk", name = "s", descriptor = "[I")
	public int[] anIntArray412;

	@OriginalMember(owner = "client!mk", name = "v", descriptor = "Ljava/lang/String;")
	public String aString57;

	@OriginalMember(owner = "client!mk", name = "x", descriptor = "[I")
	public int[] anIntArray413;

	@OriginalMember(owner = "client!mk", name = "A", descriptor = "[C")
	public char[] aCharArray4;

	static {
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(13) int local13 = local10;
			for (@Pc(15) int local15 = 0; local15 < 8; local15++) {
				if ((local13 & 0x1) == 1) {
					local13 = local13 >>> 1 ^ 0xEDB88320;
				} else {
					local13 >>>= 0x1;
				}
			}
			anIntArray414[local10] = local13;
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(ILclient!gw;B)V")
	private void method5050(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub13 arg1) {
		if (arg0 == 1) {
			this.aString57 = arg1.method3034();
			return;
		}
		@Pc(25) int local25;
		@Pc(35) int local35;
		@Pc(47) byte local47;
		if (arg0 == 2) {
			local25 = arg1.method3043();
			this.aCharArray4 = new char[local25];
			this.anIntArray412 = new int[local25];
			for (local35 = 0; local35 < local25; local35++) {
				this.anIntArray412[local35] = arg1.method3056();
				local47 = arg1.method3073();
				this.aCharArray4[local35] = local47 == 0 ? 0 : Static455.method6568(local47);
			}
		} else if (arg0 == 3) {
			local25 = arg1.method3043();
			this.aCharArray3 = new char[local25];
			this.anIntArray413 = new int[local25];
			for (local35 = 0; local35 < local25; local35++) {
				this.anIntArray413[local35] = arg1.method3056();
				local47 = arg1.method3073();
				this.aCharArray3[local35] = local47 == 0 ? 0 : Static455.method6568(local47);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(CI)I")
	public int method5051(@OriginalArg(0) char arg0) {
		if (this.anIntArray413 == null) {
			return -1;
		}
		for (@Pc(16) int local16 = 0; local16 < this.anIntArray413.length; local16++) {
			if (this.aCharArray3[local16] == arg0) {
				return this.anIntArray413[local16];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "(Z)V")
	public void method5052() {
		@Pc(14) int local14;
		if (this.anIntArray413 != null) {
			for (local14 = 0; local14 < this.anIntArray413.length; local14++) {
				this.anIntArray413[local14] |= 0x8000;
			}
		}
		if (this.anIntArray412 != null) {
			for (local14 = 0; local14 < this.anIntArray412.length; local14++) {
				this.anIntArray412[local14] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lclient!gw;Z)V")
	public void method5054(@OriginalArg(0) Class1_Sub13 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method3043();
			if (local11 == 0) {
				return;
			}
			this.method5050(local11, arg0);
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IC)I")
	public int method5056(@OriginalArg(1) char arg0) {
		if (this.anIntArray412 == null) {
			return -1;
		}
		for (@Pc(16) int local16 = 0; local16 < this.anIntArray412.length; local16++) {
			if (arg0 == this.aCharArray4[local16]) {
				return this.anIntArray412[local16];
			}
		}
		return -1;
	}
}
