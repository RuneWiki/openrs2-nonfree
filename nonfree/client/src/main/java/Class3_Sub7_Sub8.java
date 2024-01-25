import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hq")
public final class Class3_Sub7_Sub8 extends Class3_Sub7 {

	@OriginalMember(owner = "client!hq", name = "v", descriptor = "[C")
	public char[] aCharArray3;

	@OriginalMember(owner = "client!hq", name = "w", descriptor = "[I")
	public int[] anIntArray162;

	@OriginalMember(owner = "client!hq", name = "z", descriptor = "[I")
	public int[] anIntArray163;

	@OriginalMember(owner = "client!hq", name = "C", descriptor = "Ljava/lang/String;")
	public String aString94;

	@OriginalMember(owner = "client!hq", name = "I", descriptor = "[C")
	public char[] aCharArray4;

	@OriginalMember(owner = "client!hq", name = "d", descriptor = "(I)V")
	public void method2136() {
		@Pc(14) int local14;
		if (this.anIntArray163 != null) {
			for (local14 = 0; local14 < this.anIntArray163.length; local14++) {
				this.anIntArray163[local14] |= 0x8000;
			}
		}
		if (this.anIntArray162 != null) {
			for (local14 = 0; local14 < this.anIntArray162.length; local14++) {
				this.anIntArray162[local14] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lclient!fb;IB)V")
	private void method2140(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aString94 = arg0.method3671();
			return;
		}
		@Pc(15) int local15;
		@Pc(25) int local25;
		@Pc(38) byte local38;
		if (arg1 == 2) {
			local15 = arg0.method3643();
			this.aCharArray4 = new char[local15];
			this.anIntArray162 = new int[local15];
			for (local25 = 0; local25 < local15; local25++) {
				this.anIntArray162[local25] = arg0.method3649();
				local38 = arg0.method3621();
				this.aCharArray4[local25] = local38 == 0 ? 0 : Static178.method2913(local38);
			}
		} else if (arg1 == 3) {
			local15 = arg0.method3643();
			this.anIntArray163 = new int[local15];
			this.aCharArray3 = new char[local15];
			for (local25 = 0; local25 < local15; local25++) {
				this.anIntArray163[local25] = arg0.method3649();
				local38 = arg0.method3621();
				this.aCharArray3[local25] = local38 == 0 ? 0 : Static178.method2913(local38);
			}
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(ZLclient!fb;)V")
	public void method2141(@OriginalArg(1) Class3_Sub4 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method3643();
			if (local11 == 0) {
				return;
			}
			this.method2140(arg0, local11);
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(CB)I")
	public int method2142(@OriginalArg(0) char arg0) {
		if (this.anIntArray162 == null) {
			return -1;
		}
		for (@Pc(18) int local18 = 0; local18 < this.anIntArray162.length; local18++) {
			if (arg0 == this.aCharArray4[local18]) {
				return this.anIntArray162[local18];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(CI)I")
	public int method2144(@OriginalArg(0) char arg0) {
		if (this.anIntArray163 == null) {
			return -1;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray163.length; local17++) {
			if (this.aCharArray3[local17] == arg0) {
				return this.anIntArray163[local17];
			}
		}
		return -1;
	}
}
