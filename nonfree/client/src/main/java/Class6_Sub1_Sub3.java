import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bk")
public final class Class6_Sub1_Sub3 extends Class6_Sub1 {

	@OriginalMember(owner = "client!bk", name = "u", descriptor = "[I")
	public int[] anIntArray44;

	@OriginalMember(owner = "client!bk", name = "v", descriptor = "[C")
	public char[] aCharArray1;

	@OriginalMember(owner = "client!bk", name = "w", descriptor = "[I")
	public int[] anIntArray45;

	@OriginalMember(owner = "client!bk", name = "y", descriptor = "[C")
	public char[] aCharArray2;

	@OriginalMember(owner = "client!bk", name = "B", descriptor = "Ljava/lang/String;")
	public String aString5;

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lclient!ha;B)V")
	public void method421(@OriginalArg(0) Class6_Sub15 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method3111();
			if (local17 == 0) {
				return;
			}
			this.method423(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(CZ)I")
	public int method422(@OriginalArg(0) char arg0) {
		if (this.anIntArray45 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray45.length; local12++) {
			if (arg0 == this.aCharArray1[local12]) {
				return this.anIntArray45[local12];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lclient!ha;II)V")
	private void method423(@OriginalArg(0) Class6_Sub15 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aString5 = arg0.method3093();
			return;
		}
		@Pc(21) int local21;
		@Pc(31) int local31;
		@Pc(44) byte local44;
		if (arg1 == 2) {
			local21 = arg0.method3111();
			this.anIntArray45 = new int[local21];
			this.aCharArray1 = new char[local21];
			for (local31 = 0; local31 < local21; local31++) {
				this.anIntArray45[local31] = arg0.method3108();
				local44 = arg0.method3116();
				this.aCharArray1[local31] = local44 == 0 ? 0 : Static151.method2480(local44);
			}
		} else if (arg1 == 3) {
			local21 = arg0.method3111();
			this.aCharArray2 = new char[local21];
			this.anIntArray44 = new int[local21];
			for (local31 = 0; local31 < local21; local31++) {
				this.anIntArray44[local31] = arg0.method3108();
				local44 = arg0.method3116();
				this.aCharArray2[local31] = local44 == 0 ? 0 : Static151.method2480(local44);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(CI)I")
	public int method425(@OriginalArg(0) char arg0) {
		if (this.anIntArray44 == null) {
			return -1;
		}
		for (@Pc(18) int local18 = 0; local18 < this.anIntArray44.length; local18++) {
			if (arg0 == this.aCharArray2[local18]) {
				return this.anIntArray44[local18];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!bk", name = "f", descriptor = "(I)V")
	public void method426() {
		@Pc(10) int local10;
		if (this.anIntArray44 != null) {
			for (local10 = 0; local10 < this.anIntArray44.length; local10++) {
				this.anIntArray44[local10] |= 0x8000;
			}
		}
		if (this.anIntArray45 != null) {
			for (local10 = 0; local10 < this.anIntArray45.length; local10++) {
				this.anIntArray45[local10] |= 0x8000;
			}
		}
	}
}
