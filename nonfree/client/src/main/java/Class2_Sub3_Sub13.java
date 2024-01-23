import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hg")
public final class Class2_Sub3_Sub13 extends Class2_Sub3 {

	@OriginalMember(owner = "client!hg", name = "N", descriptor = "F")
	private float aFloat2;

	@OriginalMember(owner = "client!hg", name = "R", descriptor = "[I")
	private int[] anIntArray329;

	@OriginalMember(owner = "client!hg", name = "cb", descriptor = "Z")
	public boolean aBoolean69 = false;

	@OriginalMember(owner = "client!hg", name = "S", descriptor = "Lclient!ah;")
	private Class6 aClass6_1;

	@OriginalMember(owner = "client!hg", name = "X", descriptor = "Z")
	private boolean aBoolean68;

	@OriginalMember(owner = "client!hg", name = "P", descriptor = "Z")
	private boolean aBoolean67;

	@OriginalMember(owner = "client!hg", name = "V", descriptor = "I")
	private int anInt1805;

	@OriginalMember(owner = "client!hg", name = "K", descriptor = "I")
	private int anInt1800;

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Lclient!nh;)V")
	public Class2_Sub3_Sub13(@OriginalArg(0) Class2_Sub23 arg0) {
		this.aClass6_1 = new Class6(arg0);
		this.aBoolean68 = arg0.method2122() == 1;
		this.aBoolean67 = arg0.method2122() == 1;
		arg0.method2122();
		arg0.method2122();
		@Pc(46) int local46 = arg0.method2122() & 0x3;
		this.anInt1805 = arg0.method2114();
		this.anInt1800 = arg0.method2114();
		arg0.method2122();
		arg0.method2122();
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!vf;ZLclient!oe;)Z")
	public boolean method1463(@OriginalArg(0) Interface4 arg0, @OriginalArg(2) Class72 arg1) {
		return this.aClass6_1.method188(arg0, arg1);
	}

	@OriginalMember(owner = "client!hg", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		super.finalize();
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZLclient!oe;FLclient!vf;Z)[I")
	public int[] method1464(@OriginalArg(1) Class72 arg0, @OriginalArg(2) float arg1, @OriginalArg(3) Interface4 arg2, @OriginalArg(4) boolean arg3) {
		if (this.anIntArray329 == null || this.aFloat2 != arg1) {
			if (!this.aClass6_1.method188(arg2, arg0)) {
				return null;
			}
			@Pc(33) int local33 = arg3 ? 64 : 128;
			this.anIntArray329 = this.aClass6_1.method192(this.aBoolean67, arg0, local33, arg2, local33, (double) arg1, true);
			this.aFloat2 = arg1;
			if (this.aBoolean68) {
				@Pc(57) int[] local57 = new int[local33];
				@Pc(60) int[] local60 = new int[local33];
				@Pc(63) int[] local63 = new int[local33];
				@Pc(68) int[] local68 = new int[local33 * local33];
				@Pc(74) int local74 = local33 - 1;
				@Pc(80) int local80 = local33 - 1;
				@Pc(84) int local84 = local33 * local33;
				@Pc(87) int local87 = local33;
				@Pc(88) int local88 = local33;
				@Pc(94) int local94;
				for (@Pc(90) int local90 = 2; local90 >= 0; local90--) {
					for (local94 = local80; local94 >= 0; local94--) {
						local87--;
						@Pc(102) int local102 = this.anIntArray329[local87];
						local57[local94] += local102 >> 16 & 0xFF;
						local60[local94] += local102 >> 8 & 0xFF;
						local63[local94] += local102 & 0xFF;
					}
					if (local87 == 0) {
						local87 = local84;
					}
				}
				@Pc(148) int local148 = local84;
				for (@Pc(150) int local150 = local74; local150 >= 0; local150--) {
					@Pc(155) int local155 = 0;
					@Pc(157) int local157 = 0;
					@Pc(158) int local158 = 0;
					@Pc(160) int local160 = 1;
					@Pc(162) int local162 = 1;
					for (local94 = 2; local94 >= 0; local94--) {
						local162--;
						local158 += local57[local162];
						local155 += local60[local162];
						local157 += local63[local162];
						if (local162 == 0) {
							local162 = local33;
						}
					}
					for (local94 = local80; local94 >= 0; local94--) {
						@Pc(200) int local200 = local155 / 9;
						local160--;
						local162--;
						@Pc(206) int local206 = local158 / 9;
						@Pc(210) int local210 = local157 / 9;
						local148--;
						local68[local148] = local200 << 8 | local206 << 16 | local210;
						local158 += local57[local162] - local57[local160];
						local157 += local63[local162] - local63[local160];
						local155 += local60[local162] - local60[local160];
						if (local160 == 0) {
							local160 = local33;
						}
						if (local162 == 0) {
							local162 = local33;
						}
					}
					for (local94 = local80; local94 >= 0; local94--) {
						local88--;
						@Pc(286) int local286 = this.anIntArray329[local88];
						local87--;
						@Pc(292) int local292 = this.anIntArray329[local87];
						local57[local94] += (local292 >> 16 & 0xFF) - (local286 >> 16 & 0xFF);
						local60[local94] += (local292 >> 8 & 0xFF) - ((local286 & 0xFF43) >> 8);
						local63[local94] += (local292 & 0xFF) - (local286 & 0xFF);
					}
					if (local87 == 0) {
						local87 = local84;
					}
					if (local88 == 0) {
						local88 = local84;
					}
				}
				this.anIntArray329 = local68;
			}
		}
		return this.anIntArray329;
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(II)V")
	public void method1466(@OriginalArg(1) int arg0) {
		if (this.anIntArray329 == null || this.anInt1800 == 0 && this.anInt1805 == 0) {
			return;
		}
		if (Static72.anIntArray746 == null || this.anIntArray329.length > Static72.anIntArray746.length) {
			Static72.anIntArray746 = new int[this.anIntArray329.length];
		}
		@Pc(47) int local47 = this.anIntArray329.length == 4096 ? 64 : 128;
		@Pc(51) int local51 = local47 - 1;
		@Pc(56) int local56 = arg0 * this.anInt1805;
		@Pc(63) int local63 = local47 * arg0 * this.anInt1800;
		@Pc(67) int local67 = this.anIntArray329.length;
		@Pc(71) int local71 = local67 - 1;
		for (@Pc(73) int local73 = 0; local73 < local67; local73 += local47) {
			@Pc(80) int local80 = local71 & local63 + local73;
			for (@Pc(82) int local82 = 0; local82 < local47; local82++) {
				@Pc(87) int local87 = local82 + local73;
				@Pc(95) int local95 = (local82 + local56 & local51) + local80;
				Static72.anIntArray746[local87] = this.anIntArray329[local95];
			}
		}
		@Pc(116) int[] local116 = this.anIntArray329;
		this.anIntArray329 = Static72.anIntArray746;
		Static72.anIntArray746 = local116;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!oe;ILclient!vf;Z)[I")
	public int[] method1467(@OriginalArg(0) Class72 arg0, @OriginalArg(2) Interface4 arg1, @OriginalArg(3) boolean arg2) {
		if (this.aClass6_1.method188(arg1, arg0)) {
			@Pc(18) int local18 = arg2 ? 64 : 128;
			return this.aClass6_1.method192(this.aBoolean67, arg0, local18, arg1, local18, 1.0D, false);
		} else {
			return null;
		}
	}
}
