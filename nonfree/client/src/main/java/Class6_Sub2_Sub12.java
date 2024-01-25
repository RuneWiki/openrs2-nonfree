import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kv")
public final class Class6_Sub2_Sub12 extends Class6_Sub2 {

	@OriginalMember(owner = "client!kv", name = "s", descriptor = "Ljava/lang/String;")
	public String aString40;

	@OriginalMember(owner = "client!kv", name = "t", descriptor = "[C")
	public char[] aCharArray5;

	@OriginalMember(owner = "client!kv", name = "w", descriptor = "[I")
	public int[] anIntArray393;

	@OriginalMember(owner = "client!kv", name = "z", descriptor = "[I")
	public int[] anIntArray394;

	@OriginalMember(owner = "client!kv", name = "B", descriptor = "[C")
	public char[] aCharArray6;

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(ZC)I")
	public int method4510(@OriginalArg(1) char arg0) {
		if (this.anIntArray393 == null) {
			return -1;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray393.length; local17++) {
			if (this.aCharArray5[local17] == arg0) {
				return this.anIntArray393[local17];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(B)V")
	public void method4511() {
		@Pc(6) int local6;
		if (this.anIntArray394 != null) {
			for (local6 = 0; local6 < this.anIntArray394.length; local6++) {
				this.anIntArray394[local6] |= 0x8000;
			}
		}
		if (this.anIntArray393 != null) {
			for (local6 = 0; local6 < this.anIntArray393.length; local6++) {
				this.anIntArray393[local6] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(ILclient!ji;I)V")
	private void method4512(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub21 arg1) {
		if (arg0 == 1) {
			this.aString40 = arg1.method6044();
			return;
		}
		@Pc(27) int local27;
		@Pc(37) int local37;
		@Pc(50) byte local50;
		if (arg0 == 2) {
			local27 = arg1.method6069();
			this.anIntArray393 = new int[local27];
			this.aCharArray5 = new char[local27];
			for (local37 = 0; local37 < local27; local37++) {
				this.anIntArray393[local37] = arg1.method6003();
				local50 = arg1.method6055();
				this.aCharArray5[local37] = local50 == 0 ? 0 : Static439.method6249(local50);
			}
		} else if (arg0 == 3) {
			local27 = arg1.method6069();
			this.aCharArray6 = new char[local27];
			this.anIntArray394 = new int[local27];
			for (local37 = 0; local37 < local27; local37++) {
				this.anIntArray394[local37] = arg1.method6003();
				local50 = arg1.method6055();
				this.aCharArray6[local37] = local50 == 0 ? 0 : Static439.method6249(local50);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(ILclient!ji;)V")
	public void method4513(@OriginalArg(1) Class6_Sub21 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method6069();
			if (local9 == 0) {
				return;
			}
			this.method4512(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(CI)I")
	public int method4516(@OriginalArg(0) char arg0) {
		if (this.anIntArray394 == null) {
			return -1;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray394.length; local17++) {
			if (arg0 == this.aCharArray6[local17]) {
				return this.anIntArray394[local17];
			}
		}
		return -1;
	}
}
