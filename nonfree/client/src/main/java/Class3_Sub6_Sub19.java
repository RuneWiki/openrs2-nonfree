import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tj")
public final class Class3_Sub6_Sub19 extends Class3_Sub6 {

	@OriginalMember(owner = "client!tj", name = "z", descriptor = "[I")
	public int[] anIntArray600;

	@OriginalMember(owner = "client!tj", name = "A", descriptor = "[C")
	public char[] aCharArray7;

	@OriginalMember(owner = "client!tj", name = "C", descriptor = "Ljava/lang/String;")
	public String aString115;

	@OriginalMember(owner = "client!tj", name = "E", descriptor = "[I")
	public int[] anIntArray601;

	@OriginalMember(owner = "client!tj", name = "M", descriptor = "[C")
	public char[] aCharArray8;

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)V")
	public void method7764() {
		@Pc(11) int local11;
		if (this.anIntArray601 != null) {
			for (local11 = 0; local11 < this.anIntArray601.length; local11++) {
				this.anIntArray601[local11] |= 0x8000;
			}
		}
		if (this.anIntArray600 != null) {
			for (local11 = 0; local11 < this.anIntArray600.length; local11++) {
				this.anIntArray600[local11] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(CI)I")
	public int method7766(@OriginalArg(0) char arg0) {
		if (this.anIntArray600 == null) {
			return -1;
		}
		for (@Pc(10) int local10 = 0; local10 < this.anIntArray600.length; local10++) {
			if (this.aCharArray8[local10] == arg0) {
				return this.anIntArray600[local10];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IILclient!fca;)V")
	private void method7769(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub17 arg1) {
		if (arg0 == 1) {
			this.aString115 = arg1.method4847();
			return;
		}
		@Pc(20) int local20;
		@Pc(30) int local30;
		@Pc(45) byte local45;
		if (arg0 == 2) {
			local20 = arg1.method4888();
			this.anIntArray600 = new int[local20];
			this.aCharArray8 = new char[local20];
			for (local30 = 0; local30 < local20; local30++) {
				this.anIntArray600[local30] = arg1.method4858();
				local45 = arg1.method4861();
				this.aCharArray8[local30] = local45 == 0 ? 0 : Static669.method8682(local45);
			}
		} else if (arg0 == 3) {
			local20 = arg1.method4888();
			this.anIntArray601 = new int[local20];
			this.aCharArray7 = new char[local20];
			for (local30 = 0; local30 < local20; local30++) {
				this.anIntArray601[local30] = arg1.method4858();
				local45 = arg1.method4861();
				this.aCharArray7[local30] = local45 == 0 ? 0 : Static669.method8682(local45);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(CI)I")
	public int method7770(@OriginalArg(0) char arg0) {
		if (this.anIntArray601 == null) {
			return -1;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray601.length; local17++) {
			if (this.aCharArray7[local17] == arg0) {
				return this.anIntArray601[local17];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILclient!fca;)V")
	public void method7772(@OriginalArg(1) Class3_Sub17 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4888();
			if (local5 == 0) {
				return;
			}
			this.method7769(local5, arg0);
		}
	}
}
