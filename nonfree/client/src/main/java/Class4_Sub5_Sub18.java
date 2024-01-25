import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rga")
public final class Class4_Sub5_Sub18 extends Class4_Sub5 {

	@OriginalMember(owner = "client!rga", name = "v", descriptor = "[C")
	public char[] aCharArray5;

	@OriginalMember(owner = "client!rga", name = "w", descriptor = "[I")
	public int[] anIntArray549;

	@OriginalMember(owner = "client!rga", name = "z", descriptor = "[I")
	public int[] anIntArray550;

	@OriginalMember(owner = "client!rga", name = "C", descriptor = "Ljava/lang/String;")
	public String aString100;

	@OriginalMember(owner = "client!rga", name = "I", descriptor = "[C")
	public char[] aCharArray6;

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(CZ)I")
	public int method6992(@OriginalArg(0) char arg0) {
		if (this.anIntArray549 == null) {
			return -1;
		}
		for (@Pc(18) int local18 = 0; local18 < this.anIntArray549.length; local18++) {
			if (this.aCharArray6[local18] == arg0) {
				return this.anIntArray549[local18];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(IC)I")
	public int method6993(@OriginalArg(1) char arg0) {
		if (this.anIntArray550 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray550.length; local12++) {
			if (this.aCharArray5[local12] == arg0) {
				return this.anIntArray550[local12];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(BLclient!es;I)V")
	private void method6995(@OriginalArg(1) Class4_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString100 = arg0.method8853();
			return;
		}
		@Pc(38) int local38;
		@Pc(48) int local48;
		@Pc(61) byte local61;
		if (arg1 == 2) {
			local38 = arg0.method8865();
			this.aCharArray6 = new char[local38];
			this.anIntArray549 = new int[local38];
			for (local48 = 0; local48 < local38; local48++) {
				this.anIntArray549[local48] = arg0.method8859();
				local61 = arg0.method8861();
				this.aCharArray6[local48] = local61 == 0 ? 0 : Static305.method4280(local61);
			}
		} else if (arg1 == 3) {
			local38 = arg0.method8865();
			this.aCharArray5 = new char[local38];
			this.anIntArray550 = new int[local38];
			for (local48 = 0; local48 < local38; local48++) {
				this.anIntArray550[local48] = arg0.method8859();
				local61 = arg0.method8861();
				this.aCharArray5[local48] = local61 == 0 ? 0 : Static305.method4280(local61);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(Lclient!es;B)V")
	public void method6997(@OriginalArg(0) Class4_Sub11 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method8865();
			if (local9 == 0) {
				return;
			}
			this.method6995(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!rga", name = "b", descriptor = "(Z)V")
	public void method6998() {
		@Pc(10) int local10;
		if (this.anIntArray550 != null) {
			for (local10 = 0; local10 < this.anIntArray550.length; local10++) {
				this.anIntArray550[local10] |= 0x8000;
			}
		}
		if (this.anIntArray549 != null) {
			for (local10 = 0; local10 < this.anIntArray549.length; local10++) {
				this.anIntArray549[local10] |= 0x8000;
			}
		}
	}
}
