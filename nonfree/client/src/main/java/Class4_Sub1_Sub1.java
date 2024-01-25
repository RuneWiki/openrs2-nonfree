import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class4_Sub1_Sub1 extends Class4_Sub1 {

	@OriginalMember(owner = "client!ac", name = "B", descriptor = "Ljava/lang/String;")
	public String aString4;

	@OriginalMember(owner = "client!ac", name = "D", descriptor = "[C")
	public char[] aCharArray1;

	@OriginalMember(owner = "client!ac", name = "E", descriptor = "[I")
	public int[] anIntArray11;

	@OriginalMember(owner = "client!ac", name = "J", descriptor = "[C")
	public char[] aCharArray2;

	@OriginalMember(owner = "client!ac", name = "O", descriptor = "[I")
	public int[] anIntArray12;

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "(I)V")
	public void method108() {
		@Pc(10) int local10;
		if (this.anIntArray12 != null) {
			for (local10 = 0; local10 < this.anIntArray12.length; local10++) {
				this.anIntArray12[local10] |= 0x8000;
			}
		}
		if (this.anIntArray11 != null) {
			for (local10 = 0; local10 < this.anIntArray11.length; local10++) {
				this.anIntArray11[local10] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IC)I")
	public int method109(@OriginalArg(1) char arg0) {
		if (this.anIntArray11 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray11.length; local12++) {
			if (arg0 == this.aCharArray2[local12]) {
				return this.anIntArray11[local12];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(IC)I")
	public int method111(@OriginalArg(1) char arg0) {
		if (this.anIntArray12 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray12.length; local12++) {
			if (this.aCharArray1[local12] == arg0) {
				return this.anIntArray12[local12];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!tl;I)V")
	public void method112(@OriginalArg(0) Class4_Sub30 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method4864();
			if (local9 == 0) {
				return;
			}
			this.method113(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BLclient!tl;I)V")
	private void method113(@OriginalArg(1) Class4_Sub30 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString4 = arg0.method4867();
			return;
		}
		@Pc(21) int local21;
		@Pc(31) int local31;
		@Pc(44) byte local44;
		if (arg1 == 2) {
			local21 = arg0.method4864();
			this.aCharArray2 = new char[local21];
			this.anIntArray11 = new int[local21];
			for (local31 = 0; local31 < local21; local31++) {
				this.anIntArray11[local31] = arg0.method4877();
				local44 = arg0.method4865();
				this.aCharArray2[local31] = local44 == 0 ? 0 : Static414.method5433(local44);
			}
		} else if (arg1 == 3) {
			local21 = arg0.method4864();
			this.aCharArray1 = new char[local21];
			this.anIntArray12 = new int[local21];
			for (local31 = 0; local31 < local21; local31++) {
				this.anIntArray12[local31] = arg0.method4877();
				local44 = arg0.method4865();
				this.aCharArray1[local31] = local44 == 0 ? 0 : Static414.method5433(local44);
			}
		}
	}
}
