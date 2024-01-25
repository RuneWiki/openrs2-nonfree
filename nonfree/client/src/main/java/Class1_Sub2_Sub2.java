import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cm")
public final class Class1_Sub2_Sub2 extends Class1_Sub2 {

	@OriginalMember(owner = "client!cm", name = "J", descriptor = "[[I")
	private int[][] anIntArrayArray8;

	@OriginalMember(owner = "client!cm", name = "O", descriptor = "[I")
	public int[] anIntArray63;

	@OriginalMember(owner = "client!cm", name = "R", descriptor = "[I")
	private int[] anIntArray64;

	@OriginalMember(owner = "client!cm", name = "U", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray5;

	@OriginalMember(owner = "client!cm", name = "C", descriptor = "Z")
	public boolean aBoolean74 = true;

	@OriginalMember(owner = "client!cm", name = "e", descriptor = "(I)V")
	public void method874() {
		if (this.anIntArray63 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anIntArray63.length; local6++) {
				this.anIntArray63[local6] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lclient!nj;B)V")
	public void method875(@OriginalArg(0) Class1_Sub21 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method5720();
			if (local15 == 0) {
				return;
			}
			this.method878(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(II)I")
	public int method877(@OriginalArg(1) int arg0) {
		return this.anIntArray64 == null || arg0 < 0 || arg0 > this.anIntArray64.length ? -1 : this.anIntArray64[arg0];
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lclient!nj;II)V")
	private void method878(@OriginalArg(0) Class1_Sub21 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aStringArray5 = Static183.method3233(arg0.method5701(), '<');
			return;
		}
		@Pc(28) int local28;
		@Pc(38) int local38;
		if (arg1 == 2) {
			local28 = arg0.method5720();
			this.anIntArray63 = new int[local28];
			for (local38 = 0; local38 < local28; local38++) {
				this.anIntArray63[local38] = arg0.method5715();
			}
		} else if (arg1 == 3) {
			local28 = arg0.method5720();
			this.anIntArrayArray8 = new int[local28][];
			this.anIntArray64 = new int[local28];
			for (local38 = 0; local38 < local28; local38++) {
				@Pc(46) int local46 = arg0.method5715();
				this.anIntArray64[local38] = local46;
				this.anIntArrayArray8[local38] = new int[Static58.anIntArray98[local46]];
				for (@Pc(61) int local61 = 0; local61 < Static58.anIntArray98[local46]; local61++) {
					this.anIntArrayArray8[local38][local61] = arg0.method5715();
				}
			}
		} else if (arg1 == 4) {
			this.aBoolean74 = false;
		}
	}

	@OriginalMember(owner = "client!cm", name = "f", descriptor = "(I)I")
	public int method879() {
		return this.anIntArray64 == null ? 0 : this.anIntArray64.length;
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(Lclient!nj;B)Ljava/lang/String;")
	public String method880(@OriginalArg(0) Class1_Sub21 arg0) {
		@Pc(15) StringBuffer local15 = new StringBuffer(80);
		if (this.anIntArray64 != null) {
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray64.length; local20++) {
				local15.append(this.aStringArray5[local20]);
				local15.append(Static273.method4897(this.anIntArrayArray8[local20], this.anIntArray64[local20], arg0.method5736(Static111.anIntArray186[this.anIntArray64[local20]])));
			}
		}
		local15.append(this.aStringArray5[this.aStringArray5.length - 1]);
		return local15.toString();
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IZI)I")
	public int method883(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray64 == null || arg0 < 0 || arg0 > this.anIntArray64.length) {
			return -1;
		} else if (this.anIntArrayArray8[arg0] == null || arg1 < 0 || arg1 > this.anIntArrayArray8[arg0].length) {
			return -1;
		} else {
			return this.anIntArrayArray8[arg0][arg1];
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "([IBLclient!nj;)V")
	public void method884(@OriginalArg(0) int[] arg0, @OriginalArg(2) Class1_Sub21 arg1) {
		if (this.anIntArray64 == null) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray64.length; local17++) {
			if (arg0.length <= local17) {
				return;
			}
			@Pc(26) int local26 = Static48.anIntArray74[this.method877(local17)];
			if (local26 > 0) {
				arg1.method5740((long) arg0[local17], local26);
			}
		}
	}

	@OriginalMember(owner = "client!cm", name = "h", descriptor = "(I)Ljava/lang/String;")
	public String method886() {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.aStringArray5 == null) {
			return "";
		}
		local10.append(this.aStringArray5[0]);
		for (@Pc(24) int local24 = 1; local24 < this.aStringArray5.length; local24++) {
			local10.append("...");
			local10.append(this.aStringArray5[local24]);
		}
		return local10.toString();
	}
}
