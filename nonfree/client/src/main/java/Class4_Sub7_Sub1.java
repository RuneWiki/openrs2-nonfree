import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bda")
public final class Class4_Sub7_Sub1 extends Class4_Sub7 {

	@OriginalMember(owner = "client!bda", name = "t", descriptor = "[C")
	public char[] aCharArray1;

	@OriginalMember(owner = "client!bda", name = "x", descriptor = "Ljava/lang/String;")
	public String aString10;

	@OriginalMember(owner = "client!bda", name = "A", descriptor = "[I")
	public int[] anIntArray120;

	@OriginalMember(owner = "client!bda", name = "C", descriptor = "[I")
	public int[] anIntArray121;

	@OriginalMember(owner = "client!bda", name = "F", descriptor = "[C")
	public char[] aCharArray2;

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(CI)I")
	public int method597(@OriginalArg(0) char arg0) {
		if (this.anIntArray120 == null) {
			return -1;
		}
		for (@Pc(18) int local18 = 0; local18 < this.anIntArray120.length; local18++) {
			if (arg0 == this.aCharArray1[local18]) {
				return this.anIntArray120[local18];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lclient!eh;Z)V")
	public void method598(@OriginalArg(0) Class4_Sub9 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method6015();
			if (local9 == 0) {
				return;
			}
			this.method602(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!bda", name = "c", descriptor = "(B)V")
	public void method599() {
		@Pc(18) int local18;
		if (this.anIntArray121 != null) {
			for (local18 = 0; local18 < this.anIntArray121.length; local18++) {
				this.anIntArray121[local18] |= 0x8000;
			}
		}
		if (this.anIntArray120 != null) {
			for (local18 = 0; local18 < this.anIntArray120.length; local18++) {
				this.anIntArray120[local18] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lclient!eh;IB)V")
	private void method602(@OriginalArg(0) Class4_Sub9 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aString10 = arg0.method6010();
			return;
		}
		@Pc(22) int local22;
		@Pc(32) int local32;
		@Pc(45) byte local45;
		if (arg1 == 2) {
			local22 = arg0.method6015();
			this.anIntArray120 = new int[local22];
			this.aCharArray1 = new char[local22];
			for (local32 = 0; local32 < local22; local32++) {
				this.anIntArray120[local32] = arg0.method5982();
				local45 = arg0.method6021();
				this.aCharArray1[local32] = local45 == 0 ? 0 : Static413.method5932(local45);
			}
		} else if (arg1 == 3) {
			local22 = arg0.method6015();
			this.anIntArray121 = new int[local22];
			this.aCharArray2 = new char[local22];
			for (local32 = 0; local32 < local22; local32++) {
				this.anIntArray121[local32] = arg0.method5982();
				local45 = arg0.method6021();
				this.aCharArray2[local32] = local45 == 0 ? 0 : Static413.method5932(local45);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(CB)I")
	public int method604(@OriginalArg(0) char arg0) {
		if (this.anIntArray121 == null) {
			return -1;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray121.length; local17++) {
			if (this.aCharArray2[local17] == arg0) {
				return this.anIntArray121[local17];
			}
		}
		return -1;
	}
}
