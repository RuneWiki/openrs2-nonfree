import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!naa")
public final class Class1_Sub2_Sub11 extends Class1_Sub2 {

	@OriginalMember(owner = "client!naa", name = "w", descriptor = "[[I")
	private int[][] anIntArrayArray66;

	@OriginalMember(owner = "client!naa", name = "y", descriptor = "[I")
	public int[] anIntArray467;

	@OriginalMember(owner = "client!naa", name = "z", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray28;

	@OriginalMember(owner = "client!naa", name = "A", descriptor = "[I")
	private int[] anIntArray468;

	@OriginalMember(owner = "client!naa", name = "S", descriptor = "Lclient!caa;")
	public Class41 aClass41_2;

	@OriginalMember(owner = "client!naa", name = "Q", descriptor = "Z")
	public boolean aBoolean455 = true;

	@OriginalMember(owner = "client!naa", name = "b", descriptor = "(II)Lclient!js;")
	public Class156 method5419(@OriginalArg(1) int arg0) {
		return this.anIntArray468 == null || arg0 < 0 || this.anIntArray468.length < arg0 ? null : Static397.method6311(this.anIntArray468[arg0]);
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(Lclient!os;[II)V")
	public void method5421(@OriginalArg(0) Class1_Sub17 arg0, @OriginalArg(1) int[] arg1) {
		if (this.anIntArray468 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anIntArray468.length; local11++) {
			if (arg1.length <= local11) {
				return;
			}
			@Pc(19) int local19 = this.method5419(local11).anInt4530;
			if (local19 > 0) {
				arg0.method4490((long) arg1[local11], local19);
			}
		}
	}

	@OriginalMember(owner = "client!naa", name = "c", descriptor = "(I)V")
	public void method5422() {
		if (this.anIntArray467 != null) {
			for (@Pc(18) int local18 = 0; local18 < this.anIntArray467.length; local18++) {
				this.anIntArray467[local18] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!naa", name = "c", descriptor = "(III)I")
	public int method5423(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray468 == null || arg0 < 0 || this.anIntArray468.length < arg0) {
			return -1;
		} else if (this.anIntArrayArray66[arg0] == null || arg1 < 0 || this.anIntArrayArray66[arg0].length < arg1) {
			return -1;
		} else {
			return this.anIntArrayArray66[arg0][arg1];
		}
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(Lclient!os;I)Ljava/lang/String;")
	public String method5424(@OriginalArg(0) Class1_Sub17 arg0) {
		@Pc(15) StringBuffer local15 = new StringBuffer(80);
		if (this.anIntArray468 != null) {
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray468.length; local20++) {
				local15.append(this.aStringArray28[local20]);
				local15.append(this.aClass41_2.method1402(arg0.method4476(Static397.method6311(this.anIntArray468[local20]).anInt4524), this.anIntArrayArray66[local20], this.method5419(local20)));
			}
		}
		local15.append(this.aStringArray28[this.aStringArray28.length - 1]);
		return local15.toString();
	}

	@OriginalMember(owner = "client!naa", name = "f", descriptor = "(I)I")
	public int method5425() {
		return this.anIntArray468 == null ? 0 : this.anIntArray468.length;
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(ILclient!os;I)V")
	private void method5427(@OriginalArg(1) Class1_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aStringArray28 = Static340.method5715(arg0.method4491(), '<');
			return;
		}
		@Pc(29) int local29;
		@Pc(39) int local39;
		if (arg1 == 2) {
			local29 = arg0.method4487();
			this.anIntArray467 = new int[local29];
			for (local39 = 0; local39 < local29; local39++) {
				this.anIntArray467[local39] = arg0.method4494();
			}
		} else if (arg1 == 3) {
			local29 = arg0.method4487();
			this.anIntArrayArray66 = new int[local29][];
			this.anIntArray468 = new int[local29];
			for (local39 = 0; local39 < local29; local39++) {
				@Pc(45) int local45 = arg0.method4494();
				@Pc(49) Class156 local49 = Static397.method6311(local45);
				if (local49 != null) {
					this.anIntArray468[local39] = local45;
					this.anIntArrayArray66[local39] = new int[local49.anInt4527];
					for (@Pc(65) int local65 = 0; local65 < local49.anInt4527; local65++) {
						this.anIntArrayArray66[local39][local65] = arg0.method4494();
					}
				}
			}
		} else if (arg1 == 4) {
			this.aBoolean455 = false;
		}
	}

	@OriginalMember(owner = "client!naa", name = "b", descriptor = "(Lclient!os;I)V")
	public void method5429(@OriginalArg(0) Class1_Sub17 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4487();
			if (local5 == 0) {
				return;
			}
			this.method5427(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!naa", name = "g", descriptor = "(I)Ljava/lang/String;")
	public String method5431() {
		@Pc(16) StringBuffer local16 = new StringBuffer(80);
		if (this.aStringArray28 == null) {
			return "";
		}
		local16.append(this.aStringArray28[0]);
		for (@Pc(30) int local30 = 1; local30 < this.aStringArray28.length; local30++) {
			local16.append("...");
			local16.append(this.aStringArray28[local30]);
		}
		return local16.toString();
	}
}
