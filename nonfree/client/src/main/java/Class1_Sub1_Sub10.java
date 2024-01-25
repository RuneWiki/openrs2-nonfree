import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lda")
public final class Class1_Sub1_Sub10 extends Class1_Sub1 {

	@OriginalMember(owner = "client!lda", name = "o", descriptor = "Lclient!bo;")
	public Class32 aClass32_1;

	@OriginalMember(owner = "client!lda", name = "s", descriptor = "[I")
	private int[] anIntArray522;

	@OriginalMember(owner = "client!lda", name = "v", descriptor = "[[I")
	private int[][] anIntArrayArray62;

	@OriginalMember(owner = "client!lda", name = "x", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray27;

	@OriginalMember(owner = "client!lda", name = "H", descriptor = "[I")
	public int[] anIntArray523;

	@OriginalMember(owner = "client!lda", name = "G", descriptor = "Z")
	public boolean aBoolean362 = true;

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(Lclient!ge;B)Ljava/lang/String;")
	public String method4428(@OriginalArg(0) Class1_Sub6 arg0) {
		@Pc(16) StringBuffer local16 = new StringBuffer(80);
		if (this.anIntArray522 != null) {
			for (@Pc(21) int local21 = 0; local21 < this.anIntArray522.length; local21++) {
				local16.append(this.aStringArray27[local21]);
				local16.append(this.aClass32_1.method923(this.method4434(local21), this.anIntArrayArray62[local21], arg0.method3951(Static537.method7444(this.anIntArray522[local21]).anInt906)));
			}
		}
		local16.append(this.aStringArray27[this.aStringArray27.length - 1]);
		return local16.toString();
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(III)I")
	public int method4429(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray522 == null || arg0 < 0 || arg0 > this.anIntArray522.length) {
			return -1;
		} else if (this.anIntArrayArray62[arg0] == null || arg1 < 0 || this.anIntArrayArray62[arg0].length < arg1) {
			return -1;
		} else {
			return this.anIntArrayArray62[arg0][arg1];
		}
	}

	@OriginalMember(owner = "client!lda", name = "b", descriptor = "(I)Ljava/lang/String;")
	public String method4430() {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.aStringArray27 == null) {
			return "";
		}
		local10.append(this.aStringArray27[0]);
		for (@Pc(31) int local31 = 1; local31 < this.aStringArray27.length; local31++) {
			local10.append("...");
			local10.append(this.aStringArray27[local31]);
		}
		return local10.toString();
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(IILclient!ge;)V")
	private void method4431(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub6 arg1) {
		if (arg0 == 1) {
			this.aStringArray27 = Static254.method4297('<', arg1.method3954());
			return;
		}
		@Pc(21) int local21;
		@Pc(27) int local27;
		if (arg0 == 2) {
			local21 = arg1.method3922();
			this.anIntArray523 = new int[local21];
			for (local27 = 0; local27 < local21; local27++) {
				this.anIntArray523[local27] = arg1.method3967();
			}
		} else if (arg0 == 3) {
			local21 = arg1.method3922();
			this.anIntArrayArray62 = new int[local21][];
			this.anIntArray522 = new int[local21];
			for (local27 = 0; local27 < local21; local27++) {
				@Pc(73) int local73 = arg1.method3967();
				@Pc(77) Class31 local77 = Static537.method7444(local73);
				if (local77 != null) {
					this.anIntArray522[local27] = local73;
					this.anIntArrayArray62[local27] = new int[local77.anInt904];
					for (@Pc(93) int local93 = 0; local93 < local77.anInt904; local93++) {
						this.anIntArrayArray62[local27][local93] = arg1.method3967();
					}
				}
			}
		} else if (arg0 == 4) {
			this.aBoolean362 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!lda", name = "c", descriptor = "(I)I")
	public int method4433() {
		return this.anIntArray522 == null ? 0 : this.anIntArray522.length;
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(II)Lclient!bn;")
	public Class31 method4434(@OriginalArg(1) int arg0) {
		return this.anIntArray522 == null || arg0 < 0 || arg0 > this.anIntArray522.length ? null : Static537.method7444(this.anIntArray522[arg0]);
	}

	@OriginalMember(owner = "client!lda", name = "h", descriptor = "(I)V")
	public void method4436() {
		if (this.anIntArray523 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anIntArray523.length; local6++) {
				this.anIntArray523[local6] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(Lclient!ge;[II)V")
	public void method4437(@OriginalArg(0) Class1_Sub6 arg0, @OriginalArg(1) int[] arg1) {
		if (this.anIntArray522 == null) {
			return;
		}
		for (@Pc(9) int local9 = 0; local9 < this.anIntArray522.length; local9++) {
			if (arg1.length <= local9) {
				return;
			}
			@Pc(19) int local19 = this.method4434(local9).anInt903;
			if (local19 > 0) {
				arg0.method3945(local19, (long) arg1[local9]);
			}
		}
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(Lclient!ge;I)V")
	public void method4438(@OriginalArg(0) Class1_Sub6 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method3922();
			if (local9 == 0) {
				return;
			}
			this.method4431(local9, arg0);
		}
	}
}
