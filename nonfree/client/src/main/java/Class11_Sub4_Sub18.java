import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tq")
public final class Class11_Sub4_Sub18 extends Class11_Sub4 {

	@OriginalMember(owner = "client!tq", name = "x", descriptor = "[I")
	public int[] anIntArray500;

	@OriginalMember(owner = "client!tq", name = "y", descriptor = "[C")
	public char[] aCharArray4;

	@OriginalMember(owner = "client!tq", name = "z", descriptor = "Ljava/lang/String;")
	public String aString60;

	@OriginalMember(owner = "client!tq", name = "D", descriptor = "[I")
	public int[] anIntArray501;

	@OriginalMember(owner = "client!tq", name = "G", descriptor = "[C")
	public char[] aCharArray5;

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(CB)I")
	public int method5244(@OriginalArg(0) char arg0) {
		if (this.anIntArray501 == null) {
			return -1;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray501.length; local17++) {
			if (arg0 == this.aCharArray4[local17]) {
				return this.anIntArray501[local17];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lclient!kh;I)V")
	public void method5246(@OriginalArg(0) Class11_Sub25 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5185();
			if (local9 == 0) {
				return;
			}
			this.method5250(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IILclient!kh;)V")
	private void method5250(@OriginalArg(0) int arg0, @OriginalArg(2) Class11_Sub25 arg1) {
		if (arg0 == 1) {
			this.aString60 = arg1.method5184();
			return;
		}
		@Pc(29) int local29;
		@Pc(39) int local39;
		@Pc(52) byte local52;
		if (arg0 == 2) {
			local29 = arg1.method5185();
			this.aCharArray4 = new char[local29];
			this.anIntArray501 = new int[local29];
			for (local39 = 0; local39 < local29; local39++) {
				this.anIntArray501[local39] = arg1.method5187();
				local52 = arg1.method5175();
				this.aCharArray4[local39] = local52 == 0 ? 0 : Static35.method516(local52);
			}
		} else if (arg0 == 3) {
			local29 = arg1.method5185();
			this.aCharArray5 = new char[local29];
			this.anIntArray500 = new int[local29];
			for (local39 = 0; local39 < local29; local39++) {
				this.anIntArray500[local39] = arg1.method5187();
				local52 = arg1.method5175();
				this.aCharArray5[local39] = local52 == 0 ? 0 : Static35.method516(local52);
			}
		}
	}

	@OriginalMember(owner = "client!tq", name = "e", descriptor = "(I)V")
	public void method5251() {
		@Pc(6) int local6;
		if (this.anIntArray500 != null) {
			for (local6 = 0; local6 < this.anIntArray500.length; local6++) {
				this.anIntArray500[local6] |= 0x8000;
			}
		}
		if (this.anIntArray501 != null) {
			for (local6 = 0; local6 < this.anIntArray501.length; local6++) {
				this.anIntArray501[local6] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IC)I")
	public int method5252(@OriginalArg(1) char arg0) {
		if (this.anIntArray500 == null) {
			return -1;
		}
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray500.length; local20++) {
			if (arg0 == this.aCharArray5[local20]) {
				return this.anIntArray500[local20];
			}
		}
		return -1;
	}
}
