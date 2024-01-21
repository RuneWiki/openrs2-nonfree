import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dh")
public final class Class3_Sub3_Sub7 extends Class3_Sub3 {

	@OriginalMember(owner = "client!dh", name = "M", descriptor = "F")
	private float aFloat2;

	@OriginalMember(owner = "client!dh", name = "bb", descriptor = "[I")
	private int[] anIntArray42;

	@OriginalMember(owner = "client!dh", name = "cb", descriptor = "Z")
	public boolean aBoolean51 = false;

	@OriginalMember(owner = "client!dh", name = "X", descriptor = "Lclient!fe;")
	private final Class32 aClass32_1;

	@OriginalMember(owner = "client!dh", name = "R", descriptor = "Z")
	public boolean aBoolean49;

	@OriginalMember(owner = "client!dh", name = "G", descriptor = "Z")
	public final boolean aBoolean47;

	@OriginalMember(owner = "client!dh", name = "K", descriptor = "I")
	public final int anInt849;

	@OriginalMember(owner = "client!dh", name = "ab", descriptor = "Z")
	private boolean aBoolean50;

	@OriginalMember(owner = "client!dh", name = "P", descriptor = "Z")
	private boolean aBoolean48;

	@OriginalMember(owner = "client!dh", name = "Q", descriptor = "I")
	public int anInt852;

	@OriginalMember(owner = "client!dh", name = "V", descriptor = "I")
	private int anInt855;

	@OriginalMember(owner = "client!dh", name = "Y", descriptor = "I")
	private int anInt857;

	@OriginalMember(owner = "client!dh", name = "H", descriptor = "I")
	private int anInt847;

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(Lclient!ce;)V")
	public Class3_Sub3_Sub7(@OriginalArg(0) Class3_Sub4 arg0) {
		this.aClass32_1 = new Class32(arg0);
		@Pc(14) int local14 = arg0.method1278();
		this.aBoolean49 = (local14 & 0x2) != 0;
		this.aBoolean47 = (local14 & 0x1) != 0;
		@Pc(48) int local48 = arg0.method1278();
		this.anInt849 = 0x1 << (local48 & 0x7) + 1;
		this.aBoolean50 = (local48 & 0x8) != 0;
		this.aBoolean48 = (local48 & 0x80) != 0;
		this.anInt852 = arg0.method1270();
		this.anInt855 = arg0.method1278();
		if (this.anInt855 == 255) {
			this.anInt855 = 256;
		}
		this.anInt857 = arg0.method1248();
		this.anInt847 = arg0.method1248();
		arg0.method1278();
		arg0.method1278();
		arg0.method1278();
	}

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "()V")
	public Class3_Sub3_Sub7() {
		this.aClass32_1 = new Class32();
		this.aBoolean47 = true;
		this.anInt849 = 64;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lclient!ae;Lclient!ke;FII)[I")
	public int[] method665(@OriginalArg(0) Interface1 arg0, @OriginalArg(1) Class52 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3) {
		if (this.anIntArray42 == null || arg2 != this.aFloat2) {
			if (!this.aClass32_1.method885(arg0, arg1)) {
				return null;
			}
			@Pc(41) int local41 = arg3 >= this.anInt849 ? this.anInt849 : arg3;
			this.anIntArray42 = this.aClass32_1.method886(arg0, arg1, this.aBoolean48, local41, local41, true, (double) arg2);
			this.aFloat2 = arg2;
			if (this.aBoolean50) {
				@Pc(65) int[] local65 = new int[local41];
				@Pc(68) int[] local68 = new int[local41];
				@Pc(71) int[] local71 = new int[local41];
				@Pc(76) int[] local76 = new int[local41 * local41];
				@Pc(81) int local81 = local41;
				@Pc(82) int local82 = local41;
				@Pc(88) int local88 = local41 - 1;
				@Pc(92) int local92 = local41 - 1;
				@Pc(96) int local96 = local41 * local41;
				@Pc(102) int local102;
				for (@Pc(98) int local98 = 2; local98 >= 0; local98--) {
					for (local102 = local92; local102 >= 0; local102--) {
						local81--;
						@Pc(110) int local110 = this.anIntArray42[local81];
						local65[local102] += local110 >> 16 & 0xFF;
						local68[local102] += local110 >> 8 & 0xFF;
						local71[local102] += local110 & 0xFF;
					}
					if (local81 == 0) {
						local81 = local96;
					}
				}
				@Pc(159) int local159 = local96;
				for (@Pc(161) int local161 = local88; local161 >= 0; local161--) {
					@Pc(166) int local166 = 0;
					@Pc(168) int local168 = 0;
					@Pc(169) int local169 = 0;
					@Pc(171) int local171 = 1;
					@Pc(173) int local173 = 1;
					for (local102 = 2; local102 >= 0; local102--) {
						local171--;
						local166 += local68[local171];
						local168 += local71[local171];
						local169 += local65[local171];
						if (local171 == 0) {
							local171 = local41;
						}
					}
					for (local102 = local92; local102 >= 0; local102--) {
						@Pc(214) int local214 = local166 / 9;
						local173--;
						@Pc(219) int local219 = local169 / 9;
						local171--;
						@Pc(224) int local224 = local168 / 9;
						local159--;
						local76[local159] = local219 << 16 | local214 << 8 | local224;
						local168 += local71[local171] - local71[local173];
						local166 += local68[local171] - local68[local173];
						local169 += local65[local171] - local65[local173];
						if (local171 == 0) {
							local171 = local41;
						}
						if (local173 == 0) {
							local173 = local41;
						}
					}
					for (local102 = local92; local102 >= 0; local102--) {
						local82--;
						@Pc(295) int local295 = this.anIntArray42[local82];
						local81--;
						@Pc(301) int local301 = this.anIntArray42[local81];
						local65[local102] += (local301 >> 16 & 0xFF) - (local295 >> 16 & 0xFF);
						local68[local102] += (local301 >> 8 & 0xFF) - (local295 >> 8 & 0xFF);
						local71[local102] += (local301 & 0xFF) - (local295 & 0xFF);
					}
					if (local81 == 0) {
						local81 = local96;
					}
					if (local82 == 0) {
						local82 = local96;
					}
				}
				this.anIntArray42 = local76;
			}
		}
		return this.anIntArray42;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(BLclient!ke;Lclient!ae;)Z")
	public boolean method666(@OriginalArg(1) Class52 arg0, @OriginalArg(2) Interface1 arg1) {
		return this.aClass32_1.method885(arg1, arg0);
	}

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "(II)V")
	public void method668(@OriginalArg(1) int arg0) {
		if (this.anIntArray42 == null || this.anInt847 == 0 && this.anInt857 == 0) {
			return;
		}
		if (Static15.anIntArray26 == null || Static15.anIntArray26.length < this.anIntArray42.length) {
			Static15.anIntArray26 = new int[this.anIntArray42.length];
		}
		@Pc(51) int local51 = this.anIntArray42.length == 4096 ? 64 : 128;
		@Pc(56) int local56 = this.anInt857 * arg0;
		@Pc(60) int local60 = this.anIntArray42.length;
		@Pc(64) int local64 = local51 - 1;
		@Pc(71) int local71 = this.anInt847 * arg0 * local51;
		@Pc(75) int local75 = local60 - 1;
		for (@Pc(77) int local77 = 0; local77 < local60; local77 += local51) {
			@Pc(85) int local85 = local77 + local71 & local75;
			for (@Pc(87) int local87 = 0; local87 < local51; local87++) {
				@Pc(94) int local94 = local77 + local87;
				@Pc(103) int local103 = (local64 & local87 + local56) + local85;
				Static15.anIntArray26[local94] = this.anIntArray42[local103];
			}
		}
		@Pc(124) int[] local124 = this.anIntArray42;
		this.anIntArray42 = Static15.anIntArray26;
		Static15.anIntArray26 = local124;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lclient!ae;IILclient!ke;)[I")
	public int[] method671(@OriginalArg(0) Interface1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class52 arg2) {
		if (this.aClass32_1.method885(arg0, arg2)) {
			@Pc(31) int local31 = this.anInt849 <= arg1 ? this.anInt849 : arg1;
			return this.aClass32_1.method886(arg0, arg2, this.aBoolean48, local31, local31, false, 1.0D);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!dh", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		super.finalize();
	}
}
