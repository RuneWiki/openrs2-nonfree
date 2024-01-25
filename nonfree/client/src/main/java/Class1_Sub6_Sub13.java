import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public final class Class1_Sub6_Sub13 extends Class1_Sub6 {

	@OriginalMember(owner = "client!rh", name = "y", descriptor = "Lclient!wv;")
	public Class366 aClass366_2;

	@OriginalMember(owner = "client!rh", name = "z", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray32;

	@OriginalMember(owner = "client!rh", name = "E", descriptor = "[I")
	private int[] anIntArray601;

	@OriginalMember(owner = "client!rh", name = "F", descriptor = "[[I")
	private int[][] anIntArrayArray171;

	@OriginalMember(owner = "client!rh", name = "K", descriptor = "[I")
	public int[] anIntArray602;

	@OriginalMember(owner = "client!rh", name = "v", descriptor = "Z")
	public boolean aBoolean598 = true;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)Ljava/lang/String;")
	public String method6223() {
		@Pc(15) StringBuffer local15 = new StringBuffer(80);
		if (this.aStringArray32 == null) {
			return "";
		}
		local15.append(this.aStringArray32[0]);
		for (@Pc(29) int local29 = 1; local29 < this.aStringArray32.length; local29++) {
			local15.append("...");
			local15.append(this.aStringArray32[local29]);
		}
		return local15.toString();
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILclient!mo;)V")
	public void method6224(@OriginalArg(1) Class1_Sub35 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method5750();
			if (local12 == 0) {
				return;
			}
			this.method6232(arg0, local12);
		}
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(ILclient!mo;)Ljava/lang/String;")
	public String method6225(@OriginalArg(1) Class1_Sub35 arg0) {
		@Pc(16) StringBuffer local16 = new StringBuffer(80);
		if (this.anIntArray601 != null) {
			for (@Pc(21) int local21 = 0; local21 < this.anIntArray601.length; local21++) {
				local16.append(this.aStringArray32[local21]);
				local16.append(this.aClass366_2.method7867(this.anIntArrayArray171[local21], arg0.method5741(Static203.method3256(this.anIntArray601[local21]).anInt2582), this.method6233(local21)));
			}
		}
		local16.append(this.aStringArray32[this.aStringArray32.length - 1]);
		return local16.toString();
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(III)I")
	public int method6227(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray601 == null || arg1 < 0 || this.anIntArray601.length < arg1) {
			return -1;
		} else if (this.anIntArrayArray171[arg1] == null || arg0 < 0 || this.anIntArrayArray171[arg1].length < arg0) {
			return -1;
		} else {
			return this.anIntArrayArray171[arg1][arg0];
		}
	}

	@OriginalMember(owner = "client!rh", name = "e", descriptor = "(I)V")
	public void method6228() {
		if (this.anIntArray602 != null) {
			for (@Pc(13) int local13 = 0; local13 < this.anIntArray602.length; local13++) {
				this.anIntArray602[local13] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "([ILclient!mo;B)V")
	public void method6229(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class1_Sub35 arg1) {
		if (this.anIntArray601 == null) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < this.anIntArray601.length; local19++) {
			if (local19 >= arg0.length) {
				return;
			}
			@Pc(27) int local27 = this.method6233(local19).anInt2585;
			if (local27 > 0) {
				arg1.method5770((long) arg0[local19], local27);
			}
		}
	}

	@OriginalMember(owner = "client!rh", name = "f", descriptor = "(I)I")
	public int method6230() {
		return this.anIntArray601 == null ? 0 : this.anIntArray601.length;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!mo;IB)V")
	private void method6232(@OriginalArg(0) Class1_Sub35 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aStringArray32 = Static500.method7455('<', arg0.method5760());
			return;
		}
		@Pc(22) int local22;
		@Pc(32) int local32;
		if (arg1 == 2) {
			local22 = arg0.method5750();
			this.anIntArray602 = new int[local22];
			for (local32 = 0; local32 < local22; local32++) {
				this.anIntArray602[local32] = arg0.method5771();
			}
		} else if (arg1 == 3) {
			local22 = arg0.method5750();
			this.anIntArrayArray171 = new int[local22][];
			this.anIntArray601 = new int[local22];
			for (local32 = 0; local32 < local22; local32++) {
				@Pc(38) int local38 = arg0.method5771();
				@Pc(42) Class101 local42 = Static203.method3256(local38);
				if (local42 != null) {
					this.anIntArray601[local32] = local38;
					this.anIntArrayArray171[local32] = new int[local42.anInt2587];
					for (@Pc(58) int local58 = 0; local58 < local42.anInt2587; local58++) {
						this.anIntArrayArray171[local32][local58] = arg0.method5771();
					}
				}
			}
			return;
		} else if (arg1 == 4) {
			this.aBoolean598 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)Lclient!ff;")
	public Class101 method6233(@OriginalArg(0) int arg0) {
		return this.anIntArray601 == null || arg0 < 0 || arg0 > this.anIntArray601.length ? null : Static203.method3256(this.anIntArray601[arg0]);
	}
}
