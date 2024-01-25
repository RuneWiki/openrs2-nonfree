import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tf")
public final class Class6_Sub2_Sub18 extends Class6_Sub2 {

	@OriginalMember(owner = "client!tf", name = "w", descriptor = "[C")
	public char[] aCharArray7;

	@OriginalMember(owner = "client!tf", name = "A", descriptor = "[C")
	public char[] aCharArray8;

	@OriginalMember(owner = "client!tf", name = "C", descriptor = "[I")
	public int[] anIntArray640;

	@OriginalMember(owner = "client!tf", name = "H", descriptor = "Ljava/lang/String;")
	public String aString256;

	@OriginalMember(owner = "client!tf", name = "I", descriptor = "[I")
	public int[] anIntArray641;

	@OriginalMember(owner = "client!tf", name = "e", descriptor = "(I)V")
	public void method5129() {
		@Pc(10) int local10;
		if (this.anIntArray641 != null) {
			for (local10 = 0; local10 < this.anIntArray641.length; local10++) {
				this.anIntArray641[local10] |= 0x8000;
			}
		}
		if (this.anIntArray640 != null) {
			for (local10 = 0; local10 < this.anIntArray640.length; local10++) {
				this.anIntArray640[local10] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZC)I")
	public int method5131(@OriginalArg(1) char arg0) {
		if (this.anIntArray640 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray640.length; local12++) {
			if (this.aCharArray7[local12] == arg0) {
				return this.anIntArray640[local12];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(BILclient!ec;)V")
	private void method5132(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub10 arg1) {
		if (arg0 == 1) {
			this.aString256 = arg1.method4023();
			return;
		}
		@Pc(27) int local27;
		@Pc(37) int local37;
		@Pc(50) byte local50;
		if (arg0 == 2) {
			local27 = arg1.method3972();
			this.anIntArray640 = new int[local27];
			this.aCharArray7 = new char[local27];
			for (local37 = 0; local37 < local27; local37++) {
				this.anIntArray640[local37] = arg1.method4021();
				local50 = arg1.method3992();
				this.aCharArray7[local37] = local50 == 0 ? 0 : Static103.method2106(local50);
			}
		} else if (arg0 == 3) {
			local27 = arg1.method3972();
			this.aCharArray8 = new char[local27];
			this.anIntArray641 = new int[local27];
			for (local37 = 0; local37 < local27; local37++) {
				this.anIntArray641[local37] = arg1.method4021();
				local50 = arg1.method3992();
				this.aCharArray8[local37] = local50 == 0 ? 0 : Static103.method2106(local50);
			}
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!ec;Z)V")
	public void method5134(@OriginalArg(0) Class6_Sub10 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method3972();
			if (local17 == 0) {
				return;
			}
			this.method5132(local17, arg0);
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IC)I")
	public int method5137(@OriginalArg(1) char arg0) {
		if (this.anIntArray641 == null) {
			return -1;
		}
		for (@Pc(18) int local18 = 0; local18 < this.anIntArray641.length; local18++) {
			if (this.aCharArray8[local18] == arg0) {
				return this.anIntArray641[local18];
			}
		}
		return -1;
	}
}
