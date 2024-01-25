import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!daa")
public final class Class1_Sub8_Sub3 extends Class1_Sub8 {

	@OriginalMember(owner = "client!daa", name = "y", descriptor = "[I")
	public int[] anIntArray67;

	@OriginalMember(owner = "client!daa", name = "B", descriptor = "[C")
	public char[] aCharArray2;

	@OriginalMember(owner = "client!daa", name = "C", descriptor = "[I")
	public int[] anIntArray68;

	@OriginalMember(owner = "client!daa", name = "E", descriptor = "Ljava/lang/String;")
	public String aString14;

	@OriginalMember(owner = "client!daa", name = "K", descriptor = "[C")
	public char[] aCharArray3;

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(Lclient!ac;II)V")
	private void method1320(@OriginalArg(0) Class1_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aString14 = arg0.method7951();
			return;
		}
		@Pc(16) int local16;
		@Pc(26) int local26;
		@Pc(39) byte local39;
		if (arg1 == 2) {
			local16 = arg0.method7974();
			this.anIntArray68 = new int[local16];
			this.aCharArray3 = new char[local16];
			for (local26 = 0; local26 < local16; local26++) {
				this.anIntArray68[local26] = arg0.method7945();
				local39 = arg0.method7963();
				this.aCharArray3[local26] = local39 == 0 ? 0 : Static313.method4655(local39);
			}
		} else if (arg1 == 3) {
			local16 = arg0.method7974();
			this.anIntArray67 = new int[local16];
			this.aCharArray2 = new char[local16];
			for (local26 = 0; local26 < local16; local26++) {
				this.anIntArray67[local26] = arg0.method7945();
				local39 = arg0.method7963();
				this.aCharArray2[local26] = local39 == 0 ? 0 : Static313.method4655(local39);
			}
		}
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(IC)I")
	public int method1322(@OriginalArg(1) char arg0) {
		if (this.anIntArray68 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray68.length; local12++) {
			if (arg0 == this.aCharArray3[local12]) {
				return this.anIntArray68[local12];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!daa", name = "d", descriptor = "(I)V")
	public void method1324() {
		@Pc(11) int local11;
		if (this.anIntArray67 != null) {
			for (local11 = 0; local11 < this.anIntArray67.length; local11++) {
				this.anIntArray67[local11] |= 0x8000;
			}
		}
		if (this.anIntArray68 != null) {
			for (local11 = 0; local11 < this.anIntArray68.length; local11++) {
				this.anIntArray68[local11] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(CB)I")
	public int method1325(@OriginalArg(0) char arg0) {
		if (this.anIntArray67 == null) {
			return -1;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray67.length; local17++) {
			if (arg0 == this.aCharArray2[local17]) {
				return this.anIntArray67[local17];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(Lclient!ac;I)V")
	public void method1326(@OriginalArg(0) Class1_Sub3 arg0) {
		while (true) {
			@Pc(8) int local8 = arg0.method7974();
			if (local8 == 0) {
				return;
			}
			this.method1320(arg0, local8);
		}
	}
}
