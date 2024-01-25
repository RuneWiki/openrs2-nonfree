import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dp")
public final class Class6_Sub1_Sub6 extends Class6_Sub1 {

	@OriginalMember(owner = "client!dp", name = "w", descriptor = "[I")
	public int[] anIntArray176;

	@OriginalMember(owner = "client!dp", name = "y", descriptor = "[C")
	public char[] aCharArray2;

	@OriginalMember(owner = "client!dp", name = "A", descriptor = "Ljava/lang/String;")
	public String aString29;

	@OriginalMember(owner = "client!dp", name = "D", descriptor = "[I")
	public int[] anIntArray177;

	@OriginalMember(owner = "client!dp", name = "H", descriptor = "[C")
	public char[] aCharArray3;

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(Lclient!dga;I)V")
	public void method1471(@OriginalArg(0) Class6_Sub14 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method6041();
			if (local9 == 0) {
				return;
			}
			this.method1473(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(CI)I")
	public int method1472(@OriginalArg(0) char arg0) {
		if (this.anIntArray177 == null) {
			return -1;
		}
		for (@Pc(18) int local18 = 0; local18 < this.anIntArray177.length; local18++) {
			if (this.aCharArray2[local18] == arg0) {
				return this.anIntArray177[local18];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(BILclient!dga;)V")
	private void method1473(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub14 arg1) {
		if (arg0 == 1) {
			this.aString29 = arg1.method5991();
			return;
		}
		@Pc(33) int local33;
		@Pc(43) int local43;
		@Pc(56) byte local56;
		if (arg0 == 2) {
			local33 = arg1.method6041();
			this.anIntArray177 = new int[local33];
			this.aCharArray2 = new char[local33];
			for (local43 = 0; local43 < local33; local43++) {
				this.anIntArray177[local43] = arg1.method6006();
				local56 = arg1.method6034();
				this.aCharArray2[local43] = local56 == 0 ? 0 : Static276.method3963(local56);
			}
		} else if (arg0 == 3) {
			local33 = arg1.method6041();
			this.anIntArray176 = new int[local33];
			this.aCharArray3 = new char[local33];
			for (local43 = 0; local43 < local33; local43++) {
				this.anIntArray176[local43] = arg1.method6006();
				local56 = arg1.method6034();
				this.aCharArray3[local43] = local56 == 0 ? 0 : Static276.method3963(local56);
			}
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)V")
	public void method1474() {
		@Pc(6) int local6;
		if (this.anIntArray176 != null) {
			for (local6 = 0; local6 < this.anIntArray176.length; local6++) {
				this.anIntArray176[local6] |= 0x8000;
			}
		}
		if (this.anIntArray177 != null) {
			for (local6 = 0; local6 < this.anIntArray177.length; local6++) {
				this.anIntArray177[local6] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "(CI)I")
	public int method1475(@OriginalArg(0) char arg0) {
		if (this.anIntArray176 == null) {
			return -1;
		}
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray176.length; local20++) {
			if (this.aCharArray3[local20] == arg0) {
				return this.anIntArray176[local20];
			}
		}
		return -1;
	}
}
