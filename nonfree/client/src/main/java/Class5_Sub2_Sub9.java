import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dj")
public final class Class5_Sub2_Sub9 extends Class5_Sub2 {

	@OriginalMember(owner = "client!dj", name = "v", descriptor = "[I")
	public int[] anIntArray180;

	@OriginalMember(owner = "client!dj", name = "y", descriptor = "[I")
	public int[] anIntArray181;

	@OriginalMember(owner = "client!dj", name = "B", descriptor = "[C")
	public char[] aCharArray2;

	@OriginalMember(owner = "client!dj", name = "F", descriptor = "[C")
	public char[] aCharArray3;

	@OriginalMember(owner = "client!dj", name = "H", descriptor = "Ljava/lang/String;")
	public String aString29;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V")
	public void method1972() {
		@Pc(6) int local6;
		if (this.anIntArray181 != null) {
			for (local6 = 0; local6 < this.anIntArray181.length; local6++) {
				this.anIntArray181[local6] |= 0x8000;
			}
		}
		if (this.anIntArray180 != null) {
			for (local6 = 0; local6 < this.anIntArray180.length; local6++) {
				this.anIntArray180[local6] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lclient!co;Z)V")
	public void method1974(@OriginalArg(0) Class5_Sub3 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4220();
			if (local5 == 0) {
				return;
			}
			this.method1977(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(CI)I")
	public int method1975(@OriginalArg(0) char arg0) {
		if (this.anIntArray180 == null) {
			return -1;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray180.length; local17++) {
			if (this.aCharArray3[local17] == arg0) {
				return this.anIntArray180[local17];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IILclient!co;)V")
	private void method1977(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub3 arg1) {
		if (arg0 == 1) {
			this.aString29 = arg1.method4234();
			return;
		}
		@Pc(14) int local14;
		@Pc(24) int local24;
		@Pc(37) byte local37;
		if (arg0 == 2) {
			local14 = arg1.method4220();
			this.aCharArray3 = new char[local14];
			this.anIntArray180 = new int[local14];
			for (local24 = 0; local24 < local14; local24++) {
				this.anIntArray180[local24] = arg1.method4227();
				local37 = arg1.method4196();
				this.aCharArray3[local24] = local37 == 0 ? 0 : Static260.method6803(local37);
			}
		} else if (arg0 == 3) {
			local14 = arg1.method4220();
			this.aCharArray2 = new char[local14];
			this.anIntArray181 = new int[local14];
			for (local24 = 0; local24 < local14; local24++) {
				this.anIntArray181[local24] = arg1.method4227();
				local37 = arg1.method4196();
				this.aCharArray2[local24] = local37 == 0 ? 0 : Static260.method6803(local37);
			}
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(CB)I")
	public int method1980(@OriginalArg(0) char arg0) {
		if (this.anIntArray181 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray181.length; local12++) {
			if (this.aCharArray2[local12] == arg0) {
				return this.anIntArray181[local12];
			}
		}
		return -1;
	}
}
