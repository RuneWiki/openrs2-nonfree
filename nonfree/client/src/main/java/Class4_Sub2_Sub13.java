import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ol")
public final class Class4_Sub2_Sub13 extends Class4_Sub2 {

	@OriginalMember(owner = "client!ol", name = "r", descriptor = "[C")
	public char[] aCharArray6;

	@OriginalMember(owner = "client!ol", name = "s", descriptor = "[I")
	public int[] anIntArray383;

	@OriginalMember(owner = "client!ol", name = "t", descriptor = "[C")
	public char[] aCharArray7;

	@OriginalMember(owner = "client!ol", name = "x", descriptor = "Ljava/lang/String;")
	public String aString43;

	@OriginalMember(owner = "client!ol", name = "A", descriptor = "[I")
	public int[] anIntArray384;

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(ILclient!fh;)V")
	public void method3760(@OriginalArg(1) Class4_Sub9 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method5007();
			if (local11 == 0) {
				return;
			}
			this.method3763(arg0, local11);
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(CI)I")
	public int method3761(@OriginalArg(0) char arg0) {
		if (this.anIntArray383 == null) {
			return -1;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray383.length; local17++) {
			if (arg0 == this.aCharArray7[local17]) {
				return this.anIntArray383[local17];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V")
	public void method3762() {
		@Pc(18) int local18;
		if (this.anIntArray383 != null) {
			for (local18 = 0; local18 < this.anIntArray383.length; local18++) {
				this.anIntArray383[local18] |= 0x8000;
			}
		}
		if (this.anIntArray384 != null) {
			for (local18 = 0; local18 < this.anIntArray384.length; local18++) {
				this.anIntArray384[local18] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lclient!fh;IB)V")
	private void method3763(@OriginalArg(0) Class4_Sub9 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aString43 = arg0.method5038();
			return;
		}
		@Pc(25) int local25;
		@Pc(35) int local35;
		@Pc(50) byte local50;
		if (arg1 == 2) {
			local25 = arg0.method5007();
			this.aCharArray6 = new char[local25];
			this.anIntArray384 = new int[local25];
			for (local35 = 0; local35 < local25; local35++) {
				this.anIntArray384[local35] = arg0.method5028();
				local50 = arg0.method5063();
				this.aCharArray6[local35] = local50 == 0 ? 0 : Static57.method814(local50);
			}
		} else if (arg1 == 3) {
			local25 = arg0.method5007();
			this.aCharArray7 = new char[local25];
			this.anIntArray383 = new int[local25];
			for (local35 = 0; local35 < local25; local35++) {
				this.anIntArray383[local35] = arg0.method5028();
				local50 = arg0.method5063();
				this.aCharArray7[local35] = local50 == 0 ? 0 : Static57.method814(local50);
			}
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(CB)I")
	public int method3764(@OriginalArg(0) char arg0) {
		if (this.anIntArray384 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray384.length; local12++) {
			if (this.aCharArray6[local12] == arg0) {
				return this.anIntArray384[local12];
			}
		}
		return -1;
	}
}
