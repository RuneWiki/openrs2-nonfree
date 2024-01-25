import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!es")
public final class Class3_Sub4_Sub6 extends Class3_Sub4 {

	@OriginalMember(owner = "client!es", name = "K", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray9;

	@OriginalMember(owner = "client!es", name = "A", descriptor = "[I")
	private int[] anIntArray141;

	@OriginalMember(owner = "client!es", name = "y", descriptor = "[I")
	public int[] anIntArray142;

	@OriginalMember(owner = "client!es", name = "M", descriptor = "Lclient!lo;")
	public Class233 aClass233_1;

	@OriginalMember(owner = "client!es", name = "L", descriptor = "[[I")
	private int[][] anIntArrayArray16;

	@OriginalMember(owner = "client!es", name = "x", descriptor = "Z")
	public boolean aBoolean236 = true;

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(BLclient!rba;[I)V")
	public void method2542(@OriginalArg(1) Class3_Sub28 arg0, @OriginalArg(2) int[] arg1) {
		if (this.anIntArray141 == null) {
			return;
		}
		for (@Pc(10) int local10 = 0; local10 < this.anIntArray141.length; local10++) {
			if (arg1.length <= local10) {
				return;
			}
			@Pc(21) int local21 = this.method2548(local10).anInt6027;
			if (local21 > 0) {
				arg0.method5300((long) arg1[local10], local21);
			}
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(ILclient!rba;)Ljava/lang/String;")
	public String method2543(@OriginalArg(1) Class3_Sub28 arg0) {
		@Pc(19) StringBuffer local19 = new StringBuffer(80);
		if (this.anIntArray141 != null) {
			for (@Pc(24) int local24 = 0; local24 < this.anIntArray141.length; local24++) {
				local19.append(this.aStringArray9[local24]);
				local19.append(this.aClass233_1.method5419(arg0.method5302(Static548.method7765(this.anIntArray141[local24]).anInt6023), this.anIntArrayArray16[local24], this.method2548(local24)));
			}
		}
		local19.append(this.aStringArray9[this.aStringArray9.length - 1]);
		return local19.toString();
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(III)I")
	public int method2544(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray141 == null || arg0 < 0 || arg0 > this.anIntArray141.length) {
			return -1;
		} else if (this.anIntArrayArray16[arg0] == null || arg1 < 0 || this.anIntArrayArray16[arg0].length < arg1) {
			return -1;
		} else {
			return this.anIntArrayArray16[arg0][arg1];
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(B)I")
	public int method2545() {
		return this.anIntArray141 == null ? 0 : this.anIntArray141.length;
	}

	@OriginalMember(owner = "client!es", name = "e", descriptor = "(I)Ljava/lang/String;")
	public String method2546() {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.aStringArray9 == null) {
			return "";
		}
		local10.append(this.aStringArray9[0]);
		for (@Pc(32) int local32 = 1; local32 < this.aStringArray9.length; local32++) {
			local10.append("...");
			local10.append(this.aStringArray9[local32]);
		}
		return local10.toString();
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(II)Lclient!lda;")
	public Class225 method2548(@OriginalArg(0) int arg0) {
		return this.anIntArray141 == null || arg0 < 0 || this.anIntArray141.length < arg0 ? null : Static548.method7765(this.anIntArray141[arg0]);
	}

	@OriginalMember(owner = "client!es", name = "h", descriptor = "(I)V")
	public void method2549() {
		if (this.anIntArray142 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anIntArray142.length; local10++) {
				this.anIntArray142[local10] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(Lclient!rba;I)V")
	public void method2551(@OriginalArg(0) Class3_Sub28 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5322(-116);
			if (local9 == 0) {
				return;
			}
			this.method2552(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(ILclient!rba;B)V")
	private void method2552(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub28 arg1) {
		if (arg0 == 1) {
			this.aStringArray9 = Static349.method5051('<', arg1.method5295());
			return;
		}
		@Pc(41) int local41;
		@Pc(47) int local47;
		if (arg0 == 2) {
			local41 = arg1.method5322(-74);
			this.anIntArray142 = new int[local41];
			for (local47 = 0; local47 < local41; local47++) {
				this.anIntArray142[local47] = arg1.method5272();
			}
		} else if (arg0 == 3) {
			local41 = arg1.method5322(-46);
			this.anIntArray141 = new int[local41];
			this.anIntArrayArray16 = new int[local41][];
			for (local47 = 0; local47 < local41; local47++) {
				@Pc(92) int local92 = arg1.method5272();
				@Pc(96) Class225 local96 = Static548.method7765(local92);
				if (local96 != null) {
					this.anIntArray141[local47] = local92;
					this.anIntArrayArray16[local47] = new int[local96.anInt6024];
					for (@Pc(112) int local112 = 0; local112 < local96.anInt6024; local112++) {
						this.anIntArrayArray16[local47][local112] = arg1.method5272();
					}
				}
			}
		} else if (arg0 == 4) {
			this.aBoolean236 = false;
		}
	}
}
