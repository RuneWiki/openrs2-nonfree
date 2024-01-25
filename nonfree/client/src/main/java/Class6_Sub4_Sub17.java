import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rn")
public final class Class6_Sub4_Sub17 extends Class6_Sub4 {

	@OriginalMember(owner = "client!rn", name = "z", descriptor = "Ljava/lang/String;")
	public String aString117;

	@OriginalMember(owner = "client!rn", name = "A", descriptor = "[I")
	public int[] anIntArray564;

	@OriginalMember(owner = "client!rn", name = "D", descriptor = "[C")
	public char[] aCharArray7;

	@OriginalMember(owner = "client!rn", name = "J", descriptor = "[I")
	public int[] anIntArray565;

	@OriginalMember(owner = "client!rn", name = "K", descriptor = "[C")
	public char[] aCharArray8;

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IC)I")
	public int method7285(@OriginalArg(1) char arg0) {
		if (this.anIntArray565 == null) {
			return -1;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray565.length; local17++) {
			if (arg0 == this.aCharArray8[local17]) {
				return this.anIntArray565[local17];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!rn", name = "g", descriptor = "(I)V")
	public void method7288() {
		@Pc(11) int local11;
		if (this.anIntArray565 != null) {
			for (local11 = 0; local11 < this.anIntArray565.length; local11++) {
				this.anIntArray565[local11] |= 0x8000;
			}
		}
		if (this.anIntArray564 != null) {
			for (local11 = 0; local11 < this.anIntArray564.length; local11++) {
				this.anIntArray564[local11] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(BLclient!gga;)V")
	public void method7289(@OriginalArg(1) Class6_Sub23 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8374();
			if (local5 == 0) {
				return;
			}
			this.method7292(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(BC)I")
	public int method7290(@OriginalArg(1) char arg0) {
		if (this.anIntArray564 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray564.length; local12++) {
			if (this.aCharArray7[local12] == arg0) {
				return this.anIntArray564[local12];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lclient!gga;II)V")
	private void method7292(@OriginalArg(0) Class6_Sub23 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aString117 = arg0.method8354();
			return;
		}
		@Pc(25) int local25;
		@Pc(35) int local35;
		@Pc(48) byte local48;
		if (arg1 == 2) {
			local25 = arg0.method8374();
			this.anIntArray564 = new int[local25];
			this.aCharArray7 = new char[local25];
			for (local35 = 0; local35 < local25; local35++) {
				this.anIntArray564[local35] = arg0.method8363();
				local48 = arg0.method8391();
				this.aCharArray7[local35] = local48 == 0 ? 0 : Static622.method8571(local48);
			}
		} else if (arg1 == 3) {
			local25 = arg0.method8374();
			this.anIntArray565 = new int[local25];
			this.aCharArray8 = new char[local25];
			for (local35 = 0; local35 < local25; local35++) {
				this.anIntArray565[local35] = arg0.method8363();
				local48 = arg0.method8391();
				this.aCharArray8[local35] = local48 == 0 ? 0 : Static622.method8571(local48);
			}
		}
	}
}
