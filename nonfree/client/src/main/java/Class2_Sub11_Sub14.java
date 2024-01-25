import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class Class2_Sub11_Sub14 extends Class2_Sub11 {

	@OriginalMember(owner = "client!oa", name = "J", descriptor = "[I")
	public int[] anIntArray339;

	@OriginalMember(owner = "client!oa", name = "M", descriptor = "[C")
	public char[] aCharArray10;

	@OriginalMember(owner = "client!oa", name = "O", descriptor = "[C")
	public char[] aCharArray11;

	@OriginalMember(owner = "client!oa", name = "Q", descriptor = "[I")
	public int[] anIntArray340;

	@OriginalMember(owner = "client!oa", name = "R", descriptor = "Ljava/lang/String;")
	public String aString37;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(CI)I")
	public int method3928(@OriginalArg(0) char arg0) {
		if (this.anIntArray339 == null) {
			return -1;
		}
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray339.length; local20++) {
			if (this.aCharArray11[local20] == arg0) {
				return this.anIntArray339[local20];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)V")
	public void method3929() {
		if (this.anIntArray340 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anIntArray340.length; local6++) {
				this.anIntArray340[local6] |= 0x8000;
			}
		}
		if (this.anIntArray339 != null) {
			for (@Pc(41) int local41 = 0; local41 < this.anIntArray339.length; local41++) {
				this.anIntArray339[local41] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IILclient!dg;)V")
	private void method3930(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub10 arg1) {
		if (arg0 == 1) {
			this.aString37 = arg1.method4409();
			return;
		}
		@Pc(18) int local18;
		@Pc(28) int local28;
		@Pc(41) byte local41;
		if (arg0 == 2) {
			local18 = arg1.method4421();
			this.anIntArray339 = new int[local18];
			this.aCharArray11 = new char[local18];
			for (local28 = 0; local28 < local18; local28++) {
				this.anIntArray339[local28] = arg1.method4464();
				local41 = arg1.method4436();
				this.aCharArray11[local28] = local41 == 0 ? 0 : Static194.method3503(local41);
			}
		} else if (arg0 == 3) {
			local18 = arg1.method4421();
			this.aCharArray10 = new char[local18];
			this.anIntArray340 = new int[local18];
			for (local28 = 0; local28 < local18; local28++) {
				this.anIntArray340[local28] = arg1.method4464();
				local41 = arg1.method4436();
				this.aCharArray10[local28] = local41 == 0 ? 0 : Static194.method3503(local41);
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IC)I")
	public int method3933(@OriginalArg(1) char arg0) {
		if (this.anIntArray340 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray340.length; local12++) {
			if (arg0 == this.aCharArray10[local12]) {
				return this.anIntArray340[local12];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILclient!dg;)V")
	public void method3934(@OriginalArg(1) Class2_Sub10 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method4421();
			if (local11 == 0) {
				return;
			}
			this.method3930(local11, arg0);
		}
	}
}
