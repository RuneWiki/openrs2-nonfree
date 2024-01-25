import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vg")
public final class Class3_Sub3_Sub17 extends Class3_Sub3 {

	@OriginalMember(owner = "client!vg", name = "z", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray48;

	@OriginalMember(owner = "client!vg", name = "A", descriptor = "[I")
	public int[] anIntArray659;

	@OriginalMember(owner = "client!vg", name = "B", descriptor = "[I")
	private int[] anIntArray660;

	@OriginalMember(owner = "client!vg", name = "E", descriptor = "[[I")
	private int[][] anIntArrayArray66;

	@OriginalMember(owner = "client!vg", name = "H", descriptor = "Lclient!rm;")
	public Class290 aClass290_2;

	@OriginalMember(owner = "client!vg", name = "u", descriptor = "Z")
	public boolean aBoolean701 = true;

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V")
	public void method7454() {
		if (this.anIntArray659 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anIntArray659.length; local6++) {
				this.anIntArray659[local6] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "(Z)I")
	public int method7455() {
		return this.anIntArray660 == null ? 0 : this.anIntArray660.length;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(BLclient!qh;I)V")
	private void method7456(@OriginalArg(1) Class3_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aStringArray48 = Static583.method7710('<', arg0.method3133());
			return;
		}
		@Pc(31) int local31;
		@Pc(37) int local37;
		if (arg1 == 2) {
			local31 = arg0.method3118();
			this.anIntArray659 = new int[local31];
			for (local37 = 0; local37 < local31; local37++) {
				this.anIntArray659[local37] = arg0.method3109();
			}
		} else if (arg1 == 3) {
			local31 = arg0.method3118();
			this.anIntArray660 = new int[local31];
			this.anIntArrayArray66 = new int[local31][];
			for (local37 = 0; local37 < local31; local37++) {
				@Pc(81) int local81 = arg0.method3109();
				@Pc(85) Class158 local85 = Static373.method5520(local81);
				if (local85 != null) {
					this.anIntArray660[local37] = local81;
					this.anIntArrayArray66[local37] = new int[local85.anInt4464];
					for (@Pc(101) int local101 = 0; local101 < local85.anInt4464; local101++) {
						this.anIntArrayArray66[local37][local101] = arg0.method3109();
					}
				}
			}
		} else if (arg1 == 4) {
			this.aBoolean701 = false;
		}
	}

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "(Lclient!qh;I)V")
	public void method7457(@OriginalArg(0) Class3_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3118();
			if (local5 == 0) {
				return;
			}
			this.method7456(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IZI)I")
	public int method7458(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray660 == null || arg1 < 0 || this.anIntArray660.length < arg1) {
			return -1;
		} else if (this.anIntArrayArray66[arg1] == null || arg0 < 0 || this.anIntArrayArray66[arg1].length < arg0) {
			return -1;
		} else {
			return this.anIntArrayArray66[arg1][arg0];
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "([ILclient!qh;B)V")
	public void method7459(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class3_Sub11 arg1) {
		if (this.anIntArray660 == null) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < this.anIntArray660.length; local16++) {
			if (arg0.length <= local16) {
				return;
			}
			@Pc(24) int local24 = this.method7460(local16).anInt4466;
			if (local24 > 0) {
				arg1.method3086(local24, (long) arg0[local16]);
			}
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)Lclient!ja;")
	public Class158 method7460(@OriginalArg(0) int arg0) {
		return this.anIntArray660 == null || arg0 < 0 || arg0 > this.anIntArray660.length ? null : Static373.method5520(this.anIntArray660[arg0]);
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(BLclient!qh;)Ljava/lang/String;")
	public String method7462(@OriginalArg(1) Class3_Sub11 arg0) {
		@Pc(15) StringBuffer local15 = new StringBuffer(80);
		if (this.anIntArray660 != null) {
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray660.length; local20++) {
				local15.append(this.aStringArray48[local20]);
				local15.append(this.aClass290_2.method6376(arg0.method3114(Static373.method5520(this.anIntArray660[local20]).anInt4463), this.method7460(local20), this.anIntArrayArray66[local20]));
			}
		}
		local15.append(this.aStringArray48[this.aStringArray48.length - 1]);
		return local15.toString();
	}

	@OriginalMember(owner = "client!vg", name = "g", descriptor = "(I)Ljava/lang/String;")
	public String method7463() {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.aStringArray48 == null) {
			return "";
		}
		local10.append(this.aStringArray48[0]);
		for (@Pc(30) int local30 = 1; local30 < this.aStringArray48.length; local30++) {
			local10.append("...");
			local10.append(this.aStringArray48[local30]);
		}
		return local10.toString();
	}
}
