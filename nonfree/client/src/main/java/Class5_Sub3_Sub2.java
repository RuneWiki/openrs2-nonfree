import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dm")
public final class Class5_Sub3_Sub2 extends Class5_Sub3 {

	@OriginalMember(owner = "client!dm", name = "t", descriptor = "[I")
	private int[] anIntArray84;

	@OriginalMember(owner = "client!dm", name = "B", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray15;

	@OriginalMember(owner = "client!dm", name = "E", descriptor = "Lclient!iga;")
	public Class163 aClass163_1;

	@OriginalMember(owner = "client!dm", name = "G", descriptor = "[I")
	public int[] anIntArray85;

	@OriginalMember(owner = "client!dm", name = "K", descriptor = "[[I")
	private int[][] anIntArrayArray7;

	@OriginalMember(owner = "client!dm", name = "H", descriptor = "Z")
	public boolean aBoolean218 = true;

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lclient!mc;B)V")
	public void method2131(@OriginalArg(0) Class5_Sub41 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method7816();
			if (local7 == 0) {
				return;
			}
			this.method2135(arg0, local7);
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lclient!mc;I)Ljava/lang/String;")
	public String method2133(@OriginalArg(0) Class5_Sub41 arg0) {
		@Pc(8) StringBuffer local8 = new StringBuffer(80);
		if (this.anIntArray84 != null) {
			for (@Pc(13) int local13 = 0; local13 < this.anIntArray84.length; local13++) {
				local8.append(this.aStringArray15[local13]);
				local8.append(this.aClass163_1.method3902(this.method2134(local13), arg0.method7797(Static240.method3770(this.anIntArray84[local13]).anInt3773), this.anIntArrayArray7[local13]));
			}
		}
		local8.append(this.aStringArray15[this.aStringArray15.length - 1]);
		return local8.toString();
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IB)Lclient!gh;")
	public Class131 method2134(@OriginalArg(0) int arg0) {
		return this.anIntArray84 == null || arg0 < 0 || arg0 > this.anIntArray84.length ? null : Static240.method3770(this.anIntArray84[arg0]);
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(BLclient!mc;I)V")
	private void method2135(@OriginalArg(1) Class5_Sub41 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aStringArray15 = Static147.method2668('<', arg0.method7847());
			return;
		}
		@Pc(34) int local34;
		@Pc(40) int local40;
		if (arg1 == 2) {
			local34 = arg0.method7816();
			this.anIntArray85 = new int[local34];
			for (local40 = 0; local40 < local34; local40++) {
				this.anIntArray85[local40] = arg0.method7860();
			}
		} else if (arg1 == 3) {
			local34 = arg0.method7816();
			this.anIntArray84 = new int[local34];
			this.anIntArrayArray7 = new int[local34][];
			for (local40 = 0; local40 < local34; local40++) {
				@Pc(77) int local77 = arg0.method7860();
				@Pc(81) Class131 local81 = Static240.method3770(local77);
				if (local81 != null) {
					this.anIntArray84[local40] = local77;
					this.anIntArrayArray7[local40] = new int[local81.anInt3775];
					for (@Pc(97) int local97 = 0; local97 < local81.anInt3775; local97++) {
						this.anIntArrayArray7[local40][local97] = arg0.method7860();
					}
				}
			}
		} else if (arg1 == 4) {
			this.aBoolean218 = false;
		}
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(I)V")
	public void method2137() {
		if (this.anIntArray85 != null) {
			for (@Pc(8) int local8 = 0; local8 < this.anIntArray85.length; local8++) {
				this.anIntArray85[local8] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(III)I")
	public int method2138(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray84 == null || arg1 < 0 || this.anIntArray84.length < arg1) {
			return -1;
		} else if (this.anIntArrayArray7[arg1] == null || arg0 < 0 || arg0 > this.anIntArrayArray7[arg1].length) {
			return -1;
		} else {
			return this.anIntArrayArray7[arg1][arg0];
		}
	}

	@OriginalMember(owner = "client!dm", name = "e", descriptor = "(B)I")
	public int method2140() {
		return this.anIntArray84 == null ? 0 : this.anIntArray84.length;
	}

	@OriginalMember(owner = "client!dm", name = "e", descriptor = "(I)Ljava/lang/String;")
	public String method2141() {
		@Pc(8) StringBuffer local8 = new StringBuffer(80);
		if (this.aStringArray15 == null) {
			return "";
		}
		local8.append(this.aStringArray15[0]);
		for (@Pc(30) int local30 = 1; local30 < this.aStringArray15.length; local30++) {
			local8.append("...");
			local8.append(this.aStringArray15[local30]);
		}
		return local8.toString();
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lclient!mc;[IZ)V")
	public void method2142(@OriginalArg(0) Class5_Sub41 arg0, @OriginalArg(1) int[] arg1) {
		if (this.anIntArray84 == null) {
			return;
		}
		for (@Pc(9) int local9 = 0; local9 < this.anIntArray84.length; local9++) {
			if (arg1.length <= local9) {
				return;
			}
			@Pc(19) int local19 = this.method2134(local9).anInt3771;
			if (local19 > 0) {
				arg0.method7805(local19, (long) arg1[local9]);
			}
		}
	}
}
