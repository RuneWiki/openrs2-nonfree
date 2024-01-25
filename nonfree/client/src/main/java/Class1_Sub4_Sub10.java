import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gl")
public final class Class1_Sub4_Sub10 extends Class1_Sub4 {

	@OriginalMember(owner = "client!gl", name = "I", descriptor = "Ljava/lang/String;")
	public String aString10;

	@OriginalMember(owner = "client!gl", name = "K", descriptor = "[C")
	public char[] aCharArray14;

	@OriginalMember(owner = "client!gl", name = "M", descriptor = "[C")
	public char[] aCharArray15;

	@OriginalMember(owner = "client!gl", name = "N", descriptor = "[I")
	public int[] anIntArray172;

	@OriginalMember(owner = "client!gl", name = "R", descriptor = "[I")
	public int[] anIntArray173;

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IC)I")
	public int method2244(@OriginalArg(1) char arg0) {
		if (this.anIntArray173 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray173.length; local12++) {
			if (this.aCharArray14[local12] == arg0) {
				return this.anIntArray173[local12];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lclient!at;B)V")
	public void method2245(@OriginalArg(0) Class1_Sub7 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2132();
			if (local9 == 0) {
				return;
			}
			this.method2247(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(CI)I")
	public int method2246(@OriginalArg(0) char arg0) {
		if (this.anIntArray172 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray172.length; local12++) {
			if (arg0 == this.aCharArray15[local12]) {
				return this.anIntArray172[local12];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILclient!at;I)V")
	private void method2247(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub7 arg1) {
		if (arg0 == 1) {
			this.aString10 = arg1.method2109();
			return;
		}
		@Pc(21) int local21;
		@Pc(31) int local31;
		@Pc(44) byte local44;
		if (arg0 == 2) {
			local21 = arg1.method2132();
			this.aCharArray15 = new char[local21];
			this.anIntArray172 = new int[local21];
			for (local31 = 0; local31 < local21; local31++) {
				this.anIntArray172[local31] = arg1.method2161();
				local44 = arg1.method2122();
				this.aCharArray15[local31] = local44 == 0 ? 0 : Static19.method532(local44);
			}
		} else if (arg0 == 3) {
			local21 = arg1.method2132();
			this.anIntArray173 = new int[local21];
			this.aCharArray14 = new char[local21];
			for (local31 = 0; local31 < local21; local31++) {
				this.anIntArray173[local31] = arg1.method2161();
				local44 = arg1.method2122();
				this.aCharArray14[local31] = local44 == 0 ? 0 : Static19.method532(local44);
			}
		}
	}

	@OriginalMember(owner = "client!gl", name = "f", descriptor = "(I)V")
	public void method2250() {
		@Pc(6) int local6;
		if (this.anIntArray173 != null) {
			for (local6 = 0; local6 < this.anIntArray173.length; local6++) {
				this.anIntArray173[local6] |= 0x8000;
			}
		}
		if (this.anIntArray172 != null) {
			for (local6 = 0; local6 < this.anIntArray172.length; local6++) {
				this.anIntArray172[local6] |= 0x8000;
			}
		}
	}
}
