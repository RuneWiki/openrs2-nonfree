import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class1_Sub1_Sub19 extends Class1_Sub1 {

	@OriginalMember(owner = "client!oe", name = "I", descriptor = "[I")
	public int[] anIntArray409;

	@OriginalMember(owner = "client!oe", name = "V", descriptor = "[Lclient!kh;")
	private Class60[] aClass60Array23;

	@OriginalMember(owner = "client!oe", name = "X", descriptor = "[[I")
	private int[][] anIntArrayArray48;

	@OriginalMember(owner = "client!oe", name = "bb", descriptor = "[I")
	private int[] anIntArray410;

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)V")
	public void method2396() {
		if (this.anIntArray409 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anIntArray409.length; local6++) {
				this.anIntArray409[local6] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!nc;Z)Lclient!kh;")
	public Class60 method2397(@OriginalArg(0) Class1_Sub9 arg0) {
		@Pc(14) Class60 local14 = Static32.method599(80);
		if (this.anIntArray410 != null) {
			for (@Pc(19) int local19 = 0; local19 < this.anIntArray410.length; local19++) {
				local14.method1823(this.aClass60Array23[local19]);
				local14.method1823(Static114.method1968(this.anIntArray410[local19], arg0.method936(Static59.anIntArray171[this.anIntArray410[local19]]), this.anIntArrayArray48[local19]));
			}
		}
		local14.method1823(this.aClass60Array23[this.aClass60Array23.length - 1]);
		return local14.method1795();
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(Z)I")
	public int method2399() {
		return this.anIntArray410 == null ? 0 : this.anIntArray410.length;
	}

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "(I)Lclient!kh;")
	public Class60 method2401() {
		@Pc(9) Class60 local9 = Static32.method599(80);
		if (this.aClass60Array23 == null) {
			return Static165.aClass60_1032;
		}
		local9.method1823(this.aClass60Array23[0]);
		for (@Pc(24) int local24 = 1; local24 < this.aClass60Array23.length; local24++) {
			local9.method1823(Static167.aClass60_1250);
			local9.method1823(this.aClass60Array23[local24]);
		}
		return local9.method1795();
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)I")
	public int method2403(@OriginalArg(0) int arg0) {
		return this.anIntArray410 == null || arg0 < 0 || arg0 > this.anIntArray410.length ? -1 : this.anIntArray410[arg0];
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(I[ILclient!nc;)V")
	public void method2404(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class1_Sub9 arg1) {
		if (this.anIntArray410 == null) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < this.anIntArray410.length; local19++) {
			if (arg0.length <= local19) {
				return;
			}
			@Pc(28) int local28 = Static186.anIntArray519[this.method2403(local19)];
			if (local28 > 0) {
				arg1.method903((long) arg0[local19], local28);
			}
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(BLclient!nc;)V")
	public void method2406(@OriginalArg(1) Class1_Sub9 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method895();
			if (local14 == 0) {
				return;
			}
			this.method2408(local14, arg0);
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZII)I")
	public int method2407(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray410 == null || arg1 < 0 || this.anIntArray410.length < arg1) {
			return -1;
		} else if (this.anIntArrayArray48[arg1] == null || arg0 < 0 || this.anIntArrayArray48[arg1].length < arg0) {
			return -1;
		} else {
			return this.anIntArrayArray48[arg1][arg0];
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILclient!nc;I)V")
	private void method2408(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub9 arg1) {
		if (arg0 == 1) {
			this.aClass60Array23 = arg1.method935().method1807(60);
			return;
		}
		@Pc(16) int local16;
		@Pc(26) int local26;
		if (arg0 == 2) {
			local16 = arg1.method895();
			this.anIntArray409 = new int[local16];
			for (local26 = 0; local26 < local16; local26++) {
				this.anIntArray409[local26] = arg1.method946();
			}
		} else if (arg0 == 3) {
			local16 = arg1.method895();
			this.anIntArray410 = new int[local16];
			this.anIntArrayArray48 = new int[local16][];
			for (local26 = 0; local26 < local16; local26++) {
				@Pc(32) int local32 = arg1.method946();
				this.anIntArray410[local26] = local32;
				this.anIntArrayArray48[local26] = new int[Static185.anIntArray515[local32]];
				for (@Pc(47) int local47 = 0; local47 < Static185.anIntArray515[local32]; local47++) {
					this.anIntArrayArray48[local26][local47] = arg1.method946();
				}
			}
		}
	}
}
