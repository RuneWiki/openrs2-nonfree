import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jl")
public final class Class1_Sub2_Sub13 extends Class1_Sub2 {

	@OriginalMember(owner = "client!jl", name = "C", descriptor = "[I")
	private int[] anIntArray260;

	@OriginalMember(owner = "client!jl", name = "D", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray37;

	@OriginalMember(owner = "client!jl", name = "M", descriptor = "[I")
	public int[] anIntArray261;

	@OriginalMember(owner = "client!jl", name = "N", descriptor = "[[I")
	private int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!jl", name = "K", descriptor = "Z")
	public boolean aBoolean214 = true;

	@OriginalMember(owner = "client!jl", name = "d", descriptor = "(I)I")
	public int method2207() {
		return this.anIntArray260 == null ? 0 : this.anIntArray260.length;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(I[ILclient!cg;)V")
	public void method2208(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class1_Sub11 arg1) {
		if (this.anIntArray260 == null) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < this.anIntArray260.length && local13 < arg0.length; local13++) {
			@Pc(33) int local33 = Static247.anIntArray430[this.method2213(local13)];
			if (local33 > 0) {
				arg1.method2680((long) arg0[local13], local33);
			}
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(BLclient!cg;)Ljava/lang/String;")
	public String method2210(@OriginalArg(1) Class1_Sub11 arg0) {
		@Pc(16) StringBuffer local16 = new StringBuffer(80);
		if (this.anIntArray260 != null) {
			for (@Pc(23) int local23 = 0; local23 < this.anIntArray260.length; local23++) {
				local16.append(this.aStringArray37[local23]);
				local16.append(Static113.method2070(this.anIntArrayArray10[local23], arg0.method2671(Static169.anIntArray323[this.anIntArray260[local23]]), this.anIntArray260[local23]));
			}
		}
		local16.append(this.aStringArray37[this.aStringArray37.length - 1]);
		return local16.toString();
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)I")
	public int method2213(@OriginalArg(0) int arg0) {
		return this.anIntArray260 == null || arg0 < 0 || this.anIntArray260.length < arg0 ? -1 : this.anIntArray260[arg0];
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIB)I")
	public int method2215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray260 == null || arg1 < 0 || arg1 > this.anIntArray260.length) {
			return -1;
		} else if (this.anIntArrayArray10[arg1] == null || arg0 < 0 || this.anIntArrayArray10[arg1].length < arg0) {
			return -1;
		} else {
			return this.anIntArrayArray10[arg1][arg0];
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lclient!cg;IB)V")
	private void method2216(@OriginalArg(0) Class1_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aStringArray37 = Static201.method3251(arg0.method2629(), '<');
			return;
		}
		@Pc(13) int local13;
		@Pc(19) int local19;
		if (arg1 == 2) {
			local13 = arg0.method2690();
			this.anIntArray261 = new int[local13];
			for (local19 = 0; local19 < local13; local19++) {
				this.anIntArray261[local19] = arg0.method2691();
			}
		} else if (arg1 == 3) {
			local13 = arg0.method2690();
			this.anIntArrayArray10 = new int[local13][];
			this.anIntArray260 = new int[local13];
			for (local19 = 0; local19 < local13; local19++) {
				@Pc(64) int local64 = arg0.method2691();
				this.anIntArray260[local19] = local64;
				this.anIntArrayArray10[local19] = new int[Static56.anIntArray129[local64]];
				for (@Pc(79) int local79 = 0; local79 < Static56.anIntArray129[local64]; local79++) {
					this.anIntArrayArray10[local19][local79] = arg0.method2691();
				}
			}
		} else if (arg1 == 4) {
			this.aBoolean214 = false;
		}
	}

	@OriginalMember(owner = "client!jl", name = "f", descriptor = "(I)Ljava/lang/String;")
	public String method2217() {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.aStringArray37 == null) {
			return "";
		}
		local10.append(this.aStringArray37[0]);
		for (@Pc(24) int local24 = 1; local24 < this.aStringArray37.length; local24++) {
			local10.append("...");
			local10.append(this.aStringArray37[local24]);
		}
		return local10.toString();
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILclient!cg;)V")
	public void method2219(@OriginalArg(1) Class1_Sub11 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method2690();
			if (local10 == 0) {
				return;
			}
			this.method2216(arg0, local10);
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Z)V")
	public void method2221() {
		if (this.anIntArray261 != null) {
			for (@Pc(11) int local11 = 0; local11 < this.anIntArray261.length; local11++) {
				this.anIntArray261[local11] |= 0x8000;
			}
		}
	}
}
