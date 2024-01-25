import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ig")
public final class Class1_Sub6_Sub8 extends Class1_Sub6 {

	@OriginalMember(owner = "client!ig", name = "v", descriptor = "Ljava/lang/String;")
	public String aString25;

	@OriginalMember(owner = "client!ig", name = "A", descriptor = "[C")
	public char[] aCharArray1;

	@OriginalMember(owner = "client!ig", name = "B", descriptor = "[I")
	public int[] anIntArray332;

	@OriginalMember(owner = "client!ig", name = "D", descriptor = "[C")
	public char[] aCharArray2;

	@OriginalMember(owner = "client!ig", name = "E", descriptor = "[I")
	public int[] anIntArray333;

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IC)I")
	public int method2301(@OriginalArg(1) char arg0) {
		if (this.anIntArray333 == null) {
			return -1;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray333.length; local17++) {
			if (arg0 == this.aCharArray2[local17]) {
				return this.anIntArray333[local17];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(ZLclient!re;)V")
	public void method2302(@OriginalArg(1) Class1_Sub33 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5174();
			if (local5 == 0) {
				return;
			}
			this.method2304(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILclient!re;I)V")
	private void method2304(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub33 arg1) {
		if (arg0 == 1) {
			this.aString25 = arg1.method5128();
			return;
		}
		@Pc(13) int local13;
		@Pc(23) int local23;
		@Pc(36) byte local36;
		if (arg0 == 2) {
			local13 = arg1.method5174();
			this.anIntArray332 = new int[local13];
			this.aCharArray1 = new char[local13];
			for (local23 = 0; local23 < local13; local23++) {
				this.anIntArray332[local23] = arg1.method5177();
				local36 = arg1.method5188();
				this.aCharArray1[local23] = local36 == 0 ? 0 : Static243.method3660(local36);
			}
		} else if (arg0 == 3) {
			local13 = arg1.method5174();
			this.anIntArray333 = new int[local13];
			this.aCharArray2 = new char[local13];
			for (local23 = 0; local23 < local13; local23++) {
				this.anIntArray333[local23] = arg1.method5177();
				local36 = arg1.method5188();
				this.aCharArray2[local23] = local36 == 0 ? 0 : Static243.method3660(local36);
			}
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Z)V")
	public void method2305() {
		@Pc(14) int local14;
		if (this.anIntArray333 != null) {
			for (local14 = 0; local14 < this.anIntArray333.length; local14++) {
				this.anIntArray333[local14] |= 0x8000;
			}
		}
		if (this.anIntArray332 != null) {
			for (local14 = 0; local14 < this.anIntArray332.length; local14++) {
				this.anIntArray332[local14] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(CI)I")
	public int method2307(@OriginalArg(0) char arg0) {
		if (this.anIntArray332 == null) {
			return -1;
		}
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray332.length; local20++) {
			if (this.aCharArray1[local20] == arg0) {
				return this.anIntArray332[local20];
			}
		}
		return -1;
	}
}
