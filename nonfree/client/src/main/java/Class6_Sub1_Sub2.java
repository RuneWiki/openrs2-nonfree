import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ak")
public final class Class6_Sub1_Sub2 extends Class6_Sub1 {

	@OriginalMember(owner = "client!ak", name = "w", descriptor = "[I")
	public int[] anIntArray20;

	@OriginalMember(owner = "client!ak", name = "B", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray1;

	@OriginalMember(owner = "client!ak", name = "E", descriptor = "[I")
	private int[] anIntArray22;

	@OriginalMember(owner = "client!ak", name = "L", descriptor = "[[I")
	private int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!ak", name = "R", descriptor = "Lclient!cd;")
	public Class44 aClass44_3;

	@OriginalMember(owner = "client!ak", name = "N", descriptor = "Z")
	public boolean aBoolean10 = true;

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(BLclient!dga;)V")
	public void method197(@OriginalArg(1) Class6_Sub14 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method6041();
			if (local9 == 0) {
				return;
			}
			this.method198(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IILclient!dga;)V")
	private void method198(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub14 arg1) {
		if (arg0 == 1) {
			this.aStringArray1 = Static128.method1936(arg1.method5991(), '<');
			return;
		}
		@Pc(23) int local23;
		@Pc(29) int local29;
		if (arg0 == 2) {
			local23 = arg1.method6041();
			this.anIntArray20 = new int[local23];
			for (local29 = 0; local29 < local23; local29++) {
				this.anIntArray20[local29] = arg1.method6006();
			}
		} else if (arg0 == 3) {
			local23 = arg1.method6041();
			this.anIntArray22 = new int[local23];
			this.anIntArrayArray1 = new int[local23][];
			for (local29 = 0; local29 < local23; local29++) {
				@Pc(81) int local81 = arg1.method6006();
				@Pc(85) Class188 local85 = Static562.method7687(local81);
				if (local85 != null) {
					this.anIntArray22[local29] = local81;
					this.anIntArrayArray1[local29] = new int[local85.anInt4773];
					for (@Pc(101) int local101 = 0; local101 < local85.anInt4773; local101++) {
						this.anIntArrayArray1[local29][local101] = arg1.method6006();
					}
				}
			}
		} else if (arg0 == 4) {
			this.aBoolean10 = false;
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)Ljava/lang/String;")
	public String method199() {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.aStringArray1 == null) {
			return "";
		}
		local10.append(this.aStringArray1[0]);
		for (@Pc(24) int local24 = 1; local24 < this.aStringArray1.length; local24++) {
			local10.append("...");
			local10.append(this.aStringArray1[local24]);
		}
		return local10.toString();
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(III)I")
	public int method201(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray22 == null || arg1 < 0 || arg1 > this.anIntArray22.length) {
			return -1;
		} else if (this.anIntArrayArray1[arg1] == null || arg0 < 0 || this.anIntArrayArray1[arg1].length < arg0) {
			return -1;
		} else {
			return this.anIntArrayArray1[arg1][arg0];
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILclient!dga;)Ljava/lang/String;")
	public String method202(@OriginalArg(1) Class6_Sub14 arg0) {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.anIntArray22 != null) {
			for (@Pc(23) int local23 = 0; local23 < this.anIntArray22.length; local23++) {
				local10.append(this.aStringArray1[local23]);
				local10.append(this.aClass44_3.method692(this.anIntArrayArray1[local23], arg0.method6002(Static562.method7687(this.anIntArray22[local23]).anInt4771), this.method204(local23)));
			}
		}
		local10.append(this.aStringArray1[this.aStringArray1.length - 1]);
		return local10.toString();
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IB)Lclient!lp;")
	public Class188 method204(@OriginalArg(0) int arg0) {
		return this.anIntArray22 == null || arg0 < 0 || this.anIntArray22.length < arg0 ? null : Static562.method7687(this.anIntArray22[arg0]);
	}

	@OriginalMember(owner = "client!ak", name = "g", descriptor = "(I)I")
	public int method205() {
		return this.anIntArray22 == null ? 0 : this.anIntArray22.length;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lclient!dga;B[I)V")
	public void method206(@OriginalArg(0) Class6_Sub14 arg0, @OriginalArg(2) int[] arg1) {
		if (this.anIntArray22 == null) {
			return;
		}
		for (@Pc(9) int local9 = 0; local9 < this.anIntArray22.length; local9++) {
			if (arg1.length <= local9) {
				return;
			}
			@Pc(19) int local19 = this.method204(local9).anInt4772;
			if (local19 > 0) {
				arg0.method6022((long) arg1[local9], local19);
			}
		}
	}

	@OriginalMember(owner = "client!ak", name = "h", descriptor = "(I)V")
	public void method207() {
		if (this.anIntArray20 != null) {
			for (@Pc(14) int local14 = 0; local14 < this.anIntArray20.length; local14++) {
				this.anIntArray20[local14] |= 0x8000;
			}
		}
	}
}
