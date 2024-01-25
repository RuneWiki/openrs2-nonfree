import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lq")
public final class Class6_Sub2_Sub14 extends Class6_Sub2 {

	@OriginalMember(owner = "client!lq", name = "F", descriptor = "[I")
	public int[] anIntArray367;

	@OriginalMember(owner = "client!lq", name = "L", descriptor = "[I")
	private int[] anIntArray368;

	@OriginalMember(owner = "client!lq", name = "M", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray48;

	@OriginalMember(owner = "client!lq", name = "N", descriptor = "Lclient!tia;")
	public Class327 aClass327_1;

	@OriginalMember(owner = "client!lq", name = "R", descriptor = "[[I")
	private int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!lq", name = "Q", descriptor = "Z")
	public boolean aBoolean415 = true;

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)V")
	public void method5398() {
		if (this.anIntArray367 != null) {
			for (@Pc(12) int local12 = 0; local12 < this.anIntArray367.length; local12++) {
				this.anIntArray367[local12] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(ILclient!rg;)Ljava/lang/String;")
	public String method5399(@OriginalArg(1) Class6_Sub40 arg0) {
		@Pc(16) StringBuffer local16 = new StringBuffer(80);
		if (this.anIntArray368 != null) {
			for (@Pc(21) int local21 = 0; local21 < this.anIntArray368.length; local21++) {
				local16.append(this.aStringArray48[local21]);
				local16.append(this.aClass327_1.method7978(this.anIntArrayArray22[local21], this.method5402(local21), arg0.method8592(Static18.method329(this.anIntArray368[local21]).anInt2684)));
			}
		}
		local16.append(this.aStringArray48[this.aStringArray48.length - 1]);
		return local16.toString();
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(III)I")
	public int method5400(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray368 == null || arg0 < 0 || this.anIntArray368.length < arg0) {
			return -1;
		} else if (this.anIntArrayArray22[arg0] == null || arg1 < 0 || arg1 > this.anIntArrayArray22[arg0].length) {
			return -1;
		} else {
			return this.anIntArrayArray22[arg0][arg1];
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lclient!rg;I[I)V")
	public void method5401(@OriginalArg(0) Class6_Sub40 arg0, @OriginalArg(2) int[] arg1) {
		if (this.anIntArray368 == null) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < this.anIntArray368.length; local19++) {
			if (arg1.length <= local19) {
				return;
			}
			@Pc(27) int local27 = this.method5402(local19).anInt2685;
			if (local27 > 0) {
				arg0.method8607((long) arg1[local19], local27);
			}
		}
	}

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "(II)Lclient!fa;")
	public Class89 method5402(@OriginalArg(1) int arg0) {
		return this.anIntArray368 == null || arg0 < 0 || arg0 > this.anIntArray368.length ? null : Static18.method329(this.anIntArray368[arg0]);
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lclient!rg;BI)V")
	private void method5403(@OriginalArg(0) Class6_Sub40 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aStringArray48 = Static513.method7614(arg0.method8611(), '<');
			return;
		}
		@Pc(42) int local42;
		@Pc(52) int local52;
		if (arg1 == 2) {
			local42 = arg0.method8604();
			this.anIntArray367 = new int[local42];
			for (local52 = 0; local52 < local42; local52++) {
				this.anIntArray367[local52] = arg0.method8571();
			}
		} else if (arg1 == 3) {
			local42 = arg0.method8604();
			this.anIntArrayArray22 = new int[local42][];
			this.anIntArray368 = new int[local42];
			for (local52 = 0; local52 < local42; local52++) {
				@Pc(58) int local58 = arg0.method8571();
				@Pc(62) Class89 local62 = Static18.method329(local58);
				if (local62 != null) {
					this.anIntArray368[local52] = local58;
					this.anIntArrayArray22[local52] = new int[local62.anInt2687];
					for (@Pc(78) int local78 = 0; local78 < local62.anInt2687; local78++) {
						this.anIntArrayArray22[local52][local78] = arg0.method8571();
					}
				}
			}
		} else if (arg1 == 4) {
			this.aBoolean415 = false;
		}
	}

	@OriginalMember(owner = "client!lq", name = "e", descriptor = "(I)I")
	public int method5404() {
		return this.anIntArray368 == null ? 0 : this.anIntArray368.length;
	}

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "(ILclient!rg;)V")
	public void method5405(@OriginalArg(1) Class6_Sub40 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method8604();
			if (local17 == 0) {
				return;
			}
			this.method5403(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "(B)Ljava/lang/String;")
	public String method5406() {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.aStringArray48 == null) {
			return "";
		}
		local10.append(this.aStringArray48[0]);
		for (@Pc(31) int local31 = 1; local31 < this.aStringArray48.length; local31++) {
			local10.append("...");
			local10.append(this.aStringArray48[local31]);
		}
		return local10.toString();
	}
}
