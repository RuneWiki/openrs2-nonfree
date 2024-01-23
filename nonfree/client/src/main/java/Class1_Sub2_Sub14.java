import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kk")
public final class Class1_Sub2_Sub14 extends Class1_Sub2 {

	@OriginalMember(owner = "client!kk", name = "x", descriptor = "[I")
	public int[] anIntArray280;

	@OriginalMember(owner = "client!kk", name = "y", descriptor = "[C")
	public char[] aCharArray3;

	@OriginalMember(owner = "client!kk", name = "z", descriptor = "[I")
	public int[] anIntArray281;

	@OriginalMember(owner = "client!kk", name = "K", descriptor = "Ljava/lang/String;")
	public String aString181;

	@OriginalMember(owner = "client!kk", name = "M", descriptor = "[C")
	public char[] aCharArray4;

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(BC)I")
	public int method2363(@OriginalArg(1) char arg0) {
		if (this.anIntArray280 == null) {
			return -1;
		}
		for (@Pc(13) int local13 = 0; local13 < this.anIntArray280.length; local13++) {
			if (arg0 == this.aCharArray4[local13]) {
				return this.anIntArray280[local13];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(ILclient!cg;B)V")
	private void method2364(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub11 arg1) {
		if (arg0 == 1) {
			this.aString181 = arg1.method2629();
			return;
		}
		@Pc(29) int local29;
		@Pc(39) int local39;
		@Pc(57) byte local57;
		if (arg0 == 2) {
			local29 = arg1.method2690();
			this.anIntArray280 = new int[local29];
			this.aCharArray4 = new char[local29];
			for (local39 = 0; local39 < local29; local39++) {
				this.anIntArray280[local39] = arg1.method2691();
				local57 = arg1.method2663();
				this.aCharArray4[local39] = local57 == 0 ? 0 : Static170.method2924(local57);
			}
		} else if (arg0 == 3) {
			local29 = arg1.method2690();
			this.anIntArray281 = new int[local29];
			this.aCharArray3 = new char[local29];
			for (local39 = 0; local39 < local29; local39++) {
				this.anIntArray281[local39] = arg1.method2691();
				local57 = arg1.method2663();
				this.aCharArray3[local39] = local57 == 0 ? 0 : Static170.method2924(local57);
			}
		} else if (arg0 != 4) {
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lclient!cg;B)V")
	public void method2366(@OriginalArg(0) Class1_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2690();
			if (local5 == 0) {
				return;
			}
			this.method2364(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(CI)I")
	public int method2369(@OriginalArg(0) char arg0) {
		if (this.anIntArray281 == null) {
			return -1;
		}
		for (@Pc(18) int local18 = 0; local18 < this.anIntArray281.length; local18++) {
			if (arg0 == this.aCharArray3[local18]) {
				return this.anIntArray281[local18];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!kk", name = "e", descriptor = "(B)V")
	public void method2372() {
		@Pc(16) int local16;
		if (this.anIntArray281 != null) {
			for (local16 = 0; local16 < this.anIntArray281.length; local16++) {
				this.anIntArray281[local16] |= 0x8000;
			}
		}
		if (this.anIntArray280 != null) {
			for (local16 = 0; local16 < this.anIntArray280.length; local16++) {
				this.anIntArray280[local16] |= 0x8000;
			}
		}
	}
}
