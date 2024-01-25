import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public final class Class10_Sub1_Sub9 extends Class10_Sub1 {

	@OriginalMember(owner = "client!jd", name = "v", descriptor = "[I")
	public int[] anIntArray386;

	@OriginalMember(owner = "client!jd", name = "y", descriptor = "[I")
	public int[] anIntArray387;

	@OriginalMember(owner = "client!jd", name = "C", descriptor = "Ljava/lang/String;")
	public String aString30;

	@OriginalMember(owner = "client!jd", name = "D", descriptor = "[C")
	public char[] aCharArray3;

	@OriginalMember(owner = "client!jd", name = "E", descriptor = "[C")
	public char[] aCharArray4;

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "(I)V")
	public void method3032() {
		@Pc(19) int local19;
		if (this.anIntArray386 != null) {
			for (local19 = 0; local19 < this.anIntArray386.length; local19++) {
				this.anIntArray386[local19] |= 0x8000;
			}
		}
		if (this.anIntArray387 != null) {
			for (local19 = 0; local19 < this.anIntArray387.length; local19++) {
				this.anIntArray387[local19] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(CI)I")
	public int method3033(@OriginalArg(0) char arg0) {
		if (this.anIntArray386 == null) {
			return -1;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray386.length; local17++) {
			if (this.aCharArray4[local17] == arg0) {
				return this.anIntArray386[local17];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(BLclient!nn;)V")
	public void method3034(@OriginalArg(1) Class10_Sub8 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method2502();
			if (local13 == 0) {
				return;
			}
			this.method3036(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(CI)I")
	public int method3035(@OriginalArg(0) char arg0) {
		if (this.anIntArray387 == null) {
			return -1;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray387.length; local17++) {
			if (arg0 == this.aCharArray3[local17]) {
				return this.anIntArray387[local17];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IILclient!nn;)V")
	private void method3036(@OriginalArg(0) int arg0, @OriginalArg(2) Class10_Sub8 arg1) {
		if (arg0 == 1) {
			this.aString30 = arg1.method2478();
			return;
		}
		@Pc(11) int local11;
		@Pc(21) int local21;
		@Pc(34) byte local34;
		if (arg0 == 2) {
			local11 = arg1.method2502();
			this.anIntArray387 = new int[local11];
			this.aCharArray3 = new char[local11];
			for (local21 = 0; local21 < local11; local21++) {
				this.anIntArray387[local21] = arg1.method2485();
				local34 = arg1.method2460();
				this.aCharArray3[local21] = local34 == 0 ? 0 : Static276.method2522(local34);
			}
		} else if (arg0 == 3) {
			local11 = arg1.method2502();
			this.anIntArray386 = new int[local11];
			this.aCharArray4 = new char[local11];
			for (local21 = 0; local21 < local11; local21++) {
				this.anIntArray386[local21] = arg1.method2485();
				local34 = arg1.method2460();
				this.aCharArray4[local21] = local34 == 0 ? 0 : Static276.method2522(local34);
			}
		}
	}
}
