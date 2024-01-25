import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!baa")
public final class Class6_Sub4_Sub1 extends Class6_Sub4 {

	@OriginalMember(owner = "client!baa", name = "D", descriptor = "[[I")
	private int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!baa", name = "G", descriptor = "Lclient!nba;")
	public Class221 aClass221_1;

	@OriginalMember(owner = "client!baa", name = "L", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray5;

	@OriginalMember(owner = "client!baa", name = "M", descriptor = "[I")
	private int[] anIntArray62;

	@OriginalMember(owner = "client!baa", name = "N", descriptor = "[I")
	public int[] anIntArray63;

	@OriginalMember(owner = "client!baa", name = "I", descriptor = "Z")
	public boolean aBoolean81 = true;

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(B)V")
	public void method957() {
		if (this.anIntArray63 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anIntArray63.length; local6++) {
				this.anIntArray63[local6] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(ILclient!iaa;I)V")
	private void method958(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub26 arg1) {
		if (arg0 == 1) {
			this.aStringArray5 = Static288.method4721(arg1.method4941(), '<');
			return;
		}
		@Pc(23) int local23;
		@Pc(29) int local29;
		if (arg0 == 2) {
			local23 = arg1.method4966();
			this.anIntArray63 = new int[local23];
			for (local29 = 0; local29 < local23; local29++) {
				this.anIntArray63[local29] = arg1.method4999();
			}
			return;
		}
		if (arg0 == 3) {
			local23 = arg1.method4966();
			this.anIntArray62 = new int[local23];
			this.anIntArrayArray3 = new int[local23][];
			for (local29 = 0; local29 < local23; local29++) {
				@Pc(70) int local70 = arg1.method4999();
				@Pc(74) Class112 local74 = Static289.method4772(local70);
				if (local74 != null) {
					this.anIntArray62[local29] = local70;
					this.anIntArrayArray3[local29] = new int[local74.anInt3346];
					for (@Pc(90) int local90 = 0; local90 < local74.anInt3346; local90++) {
						this.anIntArrayArray3[local29][local90] = arg1.method4999();
					}
				}
			}
			return;
		}
		if (arg0 == 4) {
			this.aBoolean81 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!baa", name = "e", descriptor = "(B)I")
	public int method959() {
		return this.anIntArray62 == null ? 0 : this.anIntArray62.length;
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(II)Lclient!fv;")
	public Class112 method960(@OriginalArg(0) int arg0) {
		return this.anIntArray62 == null || arg0 < 0 || this.anIntArray62.length < arg0 ? null : Static289.method4772(this.anIntArray62[arg0]);
	}

	@OriginalMember(owner = "client!baa", name = "b", descriptor = "(I)Ljava/lang/String;")
	public String method961() {
		@Pc(18) StringBuffer local18 = new StringBuffer(80);
		if (this.aStringArray5 == null) {
			return "";
		}
		local18.append(this.aStringArray5[0]);
		for (@Pc(32) int local32 = 1; local32 < this.aStringArray5.length; local32++) {
			local18.append("...");
			local18.append(this.aStringArray5[local32]);
		}
		return local18.toString();
	}

	@OriginalMember(owner = "client!baa", name = "b", descriptor = "(III)I")
	public int method962(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray62 == null || arg1 < 0 || this.anIntArray62.length < arg1) {
			return -1;
		} else if (this.anIntArrayArray3[arg1] == null || arg0 < 0 || arg0 > this.anIntArrayArray3[arg1].length) {
			return -1;
		} else {
			return this.anIntArrayArray3[arg1][arg0];
		}
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(ILclient!iaa;)V")
	public void method964(@OriginalArg(1) Class6_Sub26 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method4966();
			if (local14 == 0) {
				return;
			}
			this.method958(local14, arg0);
		}
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(Lclient!iaa;I)Ljava/lang/String;")
	public String method965(@OriginalArg(0) Class6_Sub26 arg0) {
		@Pc(15) StringBuffer local15 = new StringBuffer(80);
		if (this.anIntArray62 != null) {
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray62.length; local20++) {
				local15.append(this.aStringArray5[local20]);
				local15.append(this.aClass221_1.method5318(this.anIntArrayArray3[local20], this.method960(local20), arg0.method4975(Static289.method4772(this.anIntArray62[local20]).anInt3350)));
			}
		}
		local15.append(this.aStringArray5[this.aStringArray5.length - 1]);
		return local15.toString();
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(Lclient!iaa;[II)V")
	public void method967(@OriginalArg(0) Class6_Sub26 arg0, @OriginalArg(1) int[] arg1) {
		if (this.anIntArray62 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anIntArray62.length; local11++) {
			if (local11 >= arg1.length) {
				return;
			}
			@Pc(25) int local25 = this.method960(local11).anInt3348;
			if (local25 > 0) {
				arg0.method4951(local25, (long) arg1[local11]);
			}
		}
	}
}
