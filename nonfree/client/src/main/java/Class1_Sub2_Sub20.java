import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public final class Class1_Sub2_Sub20 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ui", name = "F", descriptor = "[I")
	public int[] anIntArray580;

	@OriginalMember(owner = "client!ui", name = "K", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray33;

	@OriginalMember(owner = "client!ui", name = "L", descriptor = "[I")
	private int[] anIntArray581;

	@OriginalMember(owner = "client!ui", name = "P", descriptor = "[[I")
	private int[][] anIntArrayArray42;

	@OriginalMember(owner = "client!ui", name = "E", descriptor = "Z")
	public boolean aBoolean306 = true;

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "(I)Ljava/lang/String;")
	public String method4522() {
		@Pc(18) StringBuffer local18 = new StringBuffer(80);
		if (this.aStringArray33 == null) {
			return "";
		}
		local18.append(this.aStringArray33[0]);
		for (@Pc(32) int local32 = 1; local32 < this.aStringArray33.length; local32++) {
			local18.append("...");
			local18.append(this.aStringArray33[local32]);
		}
		return local18.toString();
	}

	@OriginalMember(owner = "client!ui", name = "d", descriptor = "(B)V")
	public void method4523() {
		if (this.anIntArray580 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anIntArray580.length; local10++) {
				this.anIntArray580[local10] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILclient!im;Z)V")
	private void method4524(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub16 arg1) {
		if (arg0 == 1) {
			this.aStringArray33 = Static191.method3403('<', arg1.method2611());
			return;
		}
		@Pc(32) int local32;
		@Pc(42) int local42;
		if (arg0 == 2) {
			local32 = arg1.method2655();
			this.anIntArray580 = new int[local32];
			for (local42 = 0; local42 < local32; local42++) {
				this.anIntArray580[local42] = arg1.method2652();
			}
		} else if (arg0 == 3) {
			local32 = arg1.method2655();
			this.anIntArrayArray42 = new int[local32][];
			this.anIntArray581 = new int[local32];
			for (local42 = 0; local42 < local32; local42++) {
				@Pc(53) int local53 = arg1.method2652();
				this.anIntArray581[local42] = local53;
				this.anIntArrayArray42[local42] = new int[Static178.anIntArray361[local53]];
				for (@Pc(68) int local68 = 0; local68 < Static178.anIntArray361[local53]; local68++) {
					this.anIntArrayArray42[local42][local68] = arg1.method2652();
				}
			}
		} else if (arg0 == 4) {
			this.aBoolean306 = false;
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(I[ILclient!im;)V")
	public void method4525(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class1_Sub16 arg1) {
		if (this.anIntArray581 == null) {
			return;
		}
		for (@Pc(21) int local21 = 0; local21 < this.anIntArray581.length && arg0.length > local21; local21++) {
			@Pc(37) int local37 = Static74.anIntArray193[this.method4527(local21)];
			if (local37 > 0) {
				arg1.method2619((long) arg0[local21], local37);
			}
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IB)I")
	public int method4527(@OriginalArg(0) int arg0) {
		return this.anIntArray581 == null || arg0 < 0 || this.anIntArray581.length < arg0 ? -1 : this.anIntArray581[arg0];
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!im;I)Ljava/lang/String;")
	public String method4528(@OriginalArg(0) Class1_Sub16 arg0) {
		@Pc(6) StringBuffer local6 = new StringBuffer(80);
		if (this.anIntArray581 != null) {
			for (@Pc(12) int local12 = 0; local12 < this.anIntArray581.length; local12++) {
				local6.append(this.aStringArray33[local12]);
				local6.append(Static216.method3797(this.anIntArrayArray42[local12], arg0.method2625(Static233.anIntArray531[this.anIntArray581[local12]]), this.anIntArray581[local12]));
			}
		}
		local6.append(this.aStringArray33[this.aStringArray33.length - 1]);
		return local6.toString();
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIB)I")
	public int method4529(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray581 == null || arg1 < 0 || arg1 > this.anIntArray581.length) {
			return -1;
		} else if (this.anIntArrayArray42[arg1] == null || arg0 < 0 || arg0 > this.anIntArrayArray42[arg1].length) {
			return -1;
		} else {
			return this.anIntArrayArray42[arg1][arg0];
		}
	}

	@OriginalMember(owner = "client!ui", name = "d", descriptor = "(I)I")
	public int method4532() {
		return this.anIntArray581 == null ? 0 : this.anIntArray581.length;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!im;Z)V")
	public void method4534(@OriginalArg(0) Class1_Sub16 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method2655();
			if (local13 == 0) {
				return;
			}
			this.method4524(local13, arg0);
		}
	}
}
