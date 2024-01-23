import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class1_Sub1_Sub3 extends Class1_Sub1 {

	@OriginalMember(owner = "client!bf", name = "I", descriptor = "[I")
	private int[] anIntArray68;

	@OriginalMember(owner = "client!bf", name = "S", descriptor = "F")
	private float aFloat1;

	@OriginalMember(owner = "client!bf", name = "M", descriptor = "Z")
	public boolean aBoolean34 = false;

	@OriginalMember(owner = "client!bf", name = "O", descriptor = "Lclient!ui;")
	private Class103 aClass103_1;

	@OriginalMember(owner = "client!bf", name = "N", descriptor = "Z")
	private boolean aBoolean35;

	@OriginalMember(owner = "client!bf", name = "J", descriptor = "Z")
	private boolean aBoolean33;

	@OriginalMember(owner = "client!bf", name = "cb", descriptor = "I")
	private int anInt434;

	@OriginalMember(owner = "client!bf", name = "L", descriptor = "I")
	private int anInt428;

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lclient!nc;)V")
	public Class1_Sub1_Sub3(@OriginalArg(0) Class1_Sub9 arg0) {
		this.aClass103_1 = new Class103(arg0);
		this.aBoolean35 = arg0.method895() == 1;
		this.aBoolean33 = arg0.method895() == 1;
		arg0.method895();
		arg0.method895();
		@Pc(46) int local46 = arg0.method895() & 0x3;
		this.anInt434 = arg0.method891();
		this.anInt428 = arg0.method891();
		arg0.method895();
		arg0.method895();
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!ic;Lclient!ai;B)Z")
	public boolean method307(@OriginalArg(0) Interface1 arg0, @OriginalArg(1) Class7 arg1) {
		return this.aClass103_1.method3165(arg0, arg1);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZILclient!ic;Lclient!ai;)[I")
	public int[] method308(@OriginalArg(0) boolean arg0, @OriginalArg(2) Interface1 arg1, @OriginalArg(3) Class7 arg2) {
		if (this.aClass103_1.method3165(arg1, arg2)) {
			@Pc(23) int local23 = arg0 ? 64 : 128;
			return this.aClass103_1.method3163(this.aBoolean33, arg1, local23, 1.0D, local23, false, arg2);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZFLclient!ic;Lclient!ai;I)[I")
	public int[] method311(@OriginalArg(0) boolean arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Interface1 arg2, @OriginalArg(3) Class7 arg3) {
		if (this.anIntArray68 == null || arg1 != this.aFloat1) {
			if (!this.aClass103_1.method3165(arg2, arg3)) {
				return null;
			}
			@Pc(28) int local28 = arg0 ? 64 : 128;
			this.anIntArray68 = this.aClass103_1.method3163(this.aBoolean33, arg2, local28, (double) arg1, local28, true, arg3);
			this.aFloat1 = arg1;
			if (this.aBoolean35) {
				@Pc(52) int[] local52 = new int[local28];
				@Pc(55) int[] local55 = new int[local28];
				@Pc(58) int[] local58 = new int[local28];
				@Pc(63) int[] local63 = new int[local28 * local28];
				@Pc(71) int local71 = local28 * local28;
				@Pc(75) int local75 = local28 - 1;
				@Pc(78) int local78 = local28;
				@Pc(79) int local79 = local28;
				@Pc(83) int local83 = local28 - 1;
				@Pc(89) int local89;
				for (@Pc(85) int local85 = 2; local85 >= 0; local85--) {
					for (local89 = local83; local89 >= 0; local89--) {
						local78--;
						@Pc(97) int local97 = this.anIntArray68[local78];
						local52[local89] += local97 >> 16 & 0xFF;
						local55[local89] += local97 >> 8 & 0xFF;
						local58[local89] += local97 & 0xFF;
					}
					if (local78 == 0) {
						local78 = local71;
					}
				}
				@Pc(143) int local143 = local71;
				for (@Pc(145) int local145 = local75; local145 >= 0; local145--) {
					@Pc(150) int local150 = 0;
					@Pc(152) int local152 = 0;
					@Pc(153) int local153 = 0;
					@Pc(155) int local155 = 1;
					for (local89 = 2; local89 >= 0; local89--) {
						local155--;
						local153 += local52[local155];
						local150 += local55[local155];
						local152 += local58[local155];
						if (local155 == 0) {
							local155 = local28;
						}
					}
					@Pc(187) int local187 = 1;
					for (local89 = local83; local89 >= 0; local89--) {
						@Pc(195) int local195 = local152 / 9;
						@Pc(199) int local199 = local150 / 9;
						local187--;
						@Pc(204) int local204 = local153 / 9;
						local143--;
						local63[local143] = local195 | local199 << 8 | local204 << 16;
						local155--;
						local150 += local55[local155] - local55[local187];
						local153 += local52[local155] - local52[local187];
						local152 += local58[local155] - local58[local187];
						if (local187 == 0) {
							local187 = local28;
						}
						if (local155 == 0) {
							local155 = local28;
						}
					}
					for (local89 = local83; local89 >= 0; local89--) {
						local78--;
						@Pc(275) int local275 = this.anIntArray68[local78];
						local79--;
						@Pc(281) int local281 = this.anIntArray68[local79];
						local52[local89] += (local275 >> 16 & 0xFF) - (local281 >> 16 & 0xFF);
						local55[local89] += (local275 >> 8 & 0xFF) - (local281 >> 8 & 0xFF);
						local58[local89] += (local275 & 0xFF) - (local281 & 0xFF);
					}
					if (local79 == 0) {
						local79 = local71;
					}
					if (local78 == 0) {
						local78 = local71;
					}
				}
				this.anIntArray68 = local63;
			}
		}
		return this.anIntArray68;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZI)V")
	public void method312(@OriginalArg(1) int arg0) {
		if (this.anIntArray68 == null || this.anInt428 == 0 && this.anInt434 == 0) {
			return;
		}
		if (Static40.anIntArray134 == null || Static40.anIntArray134.length < this.anIntArray68.length) {
			Static40.anIntArray134 = new int[this.anIntArray68.length];
		}
		@Pc(39) int local39 = this.anIntArray68.length == 4096 ? 64 : 128;
		@Pc(43) int local43 = this.anIntArray68.length;
		@Pc(48) int local48 = arg0 * this.anInt434;
		@Pc(52) int local52 = local39 - 1;
		@Pc(56) int local56 = local43 - 1;
		@Pc(63) int local63 = arg0 * local39 * this.anInt428;
		for (@Pc(65) int local65 = 0; local65 < local43; local65 += local39) {
			@Pc(73) int local73 = local56 & local63 + local65;
			for (@Pc(75) int local75 = 0; local75 < local39; local75++) {
				@Pc(86) int local86 = (local52 & local75 + local48) + local73;
				@Pc(90) int local90 = local75 + local65;
				Static40.anIntArray134[local90] = this.anIntArray68[local86];
			}
		}
		@Pc(111) int[] local111 = this.anIntArray68;
		this.anIntArray68 = Static40.anIntArray134;
		Static40.anIntArray134 = local111;
	}

	@OriginalMember(owner = "client!bf", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		super.finalize();
	}
}
