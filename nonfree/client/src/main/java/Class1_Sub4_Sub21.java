import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wn")
public final class Class1_Sub4_Sub21 extends Class1_Sub4 {

	@OriginalMember(owner = "client!wn", name = "u", descriptor = "[I")
	public int[] anIntArray532;

	@OriginalMember(owner = "client!wn", name = "y", descriptor = "Ljava/lang/String;")
	public String aString68;

	@OriginalMember(owner = "client!wn", name = "z", descriptor = "[C")
	public char[] aCharArray7;

	@OriginalMember(owner = "client!wn", name = "B", descriptor = "[I")
	public int[] anIntArray533;

	@OriginalMember(owner = "client!wn", name = "E", descriptor = "[C")
	public char[] aCharArray8;

	@OriginalMember(owner = "client!wn", name = "d", descriptor = "(B)V")
	public void method5635() {
		@Pc(14) int local14;
		if (this.anIntArray533 != null) {
			for (local14 = 0; local14 < this.anIntArray533.length; local14++) {
				this.anIntArray533[local14] |= 0x8000;
			}
		}
		if (this.anIntArray532 != null) {
			for (local14 = 0; local14 < this.anIntArray532.length; local14++) {
				this.anIntArray532[local14] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lclient!bg;II)V")
	private void method5636(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString68 = arg0.method4534();
			return;
		}
		@Pc(29) int local29;
		@Pc(39) int local39;
		@Pc(52) byte local52;
		if (arg1 == 2) {
			local29 = arg0.method4532();
			this.aCharArray7 = new char[local29];
			this.anIntArray532 = new int[local29];
			for (local39 = 0; local39 < local29; local39++) {
				this.anIntArray532[local39] = arg0.method4556();
				local52 = arg0.method4558();
				this.aCharArray7[local39] = local52 == 0 ? 0 : Static29.method765(local52);
			}
		} else if (arg1 == 3) {
			local29 = arg0.method4532();
			this.aCharArray8 = new char[local29];
			this.anIntArray533 = new int[local29];
			for (local39 = 0; local39 < local29; local39++) {
				this.anIntArray533[local39] = arg0.method4556();
				local52 = arg0.method4558();
				this.aCharArray8[local39] = local52 == 0 ? 0 : Static29.method765(local52);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(CI)I")
	public int method5638(@OriginalArg(0) char arg0) {
		if (this.anIntArray532 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray532.length; local12++) {
			if (this.aCharArray7[local12] == arg0) {
				return this.anIntArray532[local12];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "(CI)I")
	public int method5639(@OriginalArg(0) char arg0) {
		if (this.anIntArray533 == null) {
			return -1;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray533.length; local17++) {
			if (this.aCharArray8[local17] == arg0) {
				return this.anIntArray533[local17];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(ILclient!bg;)V")
	public void method5642(@OriginalArg(1) Class1_Sub8 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method4532();
			if (local11 == 0) {
				return;
			}
			this.method5636(arg0, local11);
		}
	}
}
