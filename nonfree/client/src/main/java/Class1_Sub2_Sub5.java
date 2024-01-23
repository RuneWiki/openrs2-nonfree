import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ck")
public final class Class1_Sub2_Sub5 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ck", name = "O", descriptor = "F")
	private float aFloat3;

	@OriginalMember(owner = "client!ck", name = "hb", descriptor = "[I")
	private int[] anIntArray77;

	@OriginalMember(owner = "client!ck", name = "jb", descriptor = "Z")
	public boolean aBoolean54 = false;

	@OriginalMember(owner = "client!ck", name = "nb", descriptor = "Lclient!cd;")
	private Class21 aClass21_1;

	@OriginalMember(owner = "client!ck", name = "lb", descriptor = "Z")
	private boolean aBoolean55;

	@OriginalMember(owner = "client!ck", name = "Q", descriptor = "Z")
	private boolean aBoolean53;

	@OriginalMember(owner = "client!ck", name = "ib", descriptor = "I")
	private int anInt641;

	@OriginalMember(owner = "client!ck", name = "bb", descriptor = "I")
	private int anInt639;

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lclient!vf;)V")
	public Class1_Sub2_Sub5(@OriginalArg(0) Class1_Sub26 arg0) {
		this.aClass21_1 = new Class21(arg0);
		this.aBoolean55 = arg0.method2945() == 1;
		this.aBoolean53 = arg0.method2945() == 1;
		arg0.method2945();
		arg0.method2945();
		@Pc(46) int local46 = arg0.method2945() & 0x3;
		this.anInt641 = arg0.method2992();
		this.anInt639 = arg0.method2992();
		arg0.method2945();
		arg0.method2945();
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILclient!wf;Lclient!jb;Z)[I")
	public int[] method629(@OriginalArg(1) Interface4 arg0, @OriginalArg(2) Class28 arg1, @OriginalArg(3) boolean arg2) {
		if (this.aClass21_1.method482(arg1, arg0)) {
			@Pc(26) int local26 = arg2 ? 64 : 128;
			return this.aClass21_1.method480(arg1, this.aBoolean53, local26, arg0, 1.0D, local26, false);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "(II)V")
	public void method632(@OriginalArg(0) int arg0) {
		if (this.anIntArray77 == null || this.anInt639 == 0 && this.anInt641 == 0) {
			return;
		}
		if (Static152.anIntArray296 == null || Static152.anIntArray296.length < this.anIntArray77.length) {
			Static152.anIntArray296 = new int[this.anIntArray77.length];
		}
		@Pc(39) int local39 = this.anIntArray77.length;
		@Pc(44) int local44 = this.anInt641 * arg0;
		@Pc(55) int local55 = this.anIntArray77.length == 4096 ? 64 : 128;
		@Pc(62) int local62 = arg0 * local55 * this.anInt639;
		@Pc(66) int local66 = local55 - 1;
		@Pc(70) int local70 = local39 - 1;
		for (@Pc(72) int local72 = 0; local72 < local39; local72 += local55) {
			@Pc(81) int local81 = local70 & local72 + local62;
			for (@Pc(83) int local83 = 0; local83 < local55; local83++) {
				@Pc(94) int local94 = local81 + (local66 & local44 + local83);
				@Pc(98) int local98 = local83 + local72;
				Static152.anIntArray296[local98] = this.anIntArray77[local94];
			}
		}
		@Pc(119) int[] local119 = this.anIntArray77;
		this.anIntArray77 = Static152.anIntArray296;
		Static152.anIntArray296 = local119;
	}

	@OriginalMember(owner = "client!ck", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		super.finalize();
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lclient!jb;ILclient!wf;)Z")
	public boolean method633(@OriginalArg(0) Class28 arg0, @OriginalArg(2) Interface4 arg1) {
		return this.aClass21_1.method482(arg0, arg1);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZFLclient!jb;Lclient!wf;Z)[I")
	public int[] method634(@OriginalArg(0) boolean arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class28 arg2, @OriginalArg(3) Interface4 arg3) {
		if (this.anIntArray77 == null || arg1 != this.aFloat3) {
			if (!this.aClass21_1.method482(arg2, arg3)) {
				return null;
			}
			@Pc(33) int local33 = arg0 ? 64 : 128;
			this.anIntArray77 = this.aClass21_1.method480(arg2, this.aBoolean53, local33, arg3, (double) arg1, local33, true);
			this.aFloat3 = arg1;
			if (this.aBoolean55) {
				@Pc(57) int[] local57 = new int[local33];
				@Pc(62) int[] local62 = new int[local33 * local33];
				@Pc(65) int[] local65 = new int[local33];
				@Pc(68) int[] local68 = new int[local33];
				@Pc(73) int local73 = local33;
				@Pc(74) int local74 = local33;
				@Pc(80) int local80 = local33 * local33;
				@Pc(84) int local84 = local33 - 1;
				@Pc(90) int local90;
				for (@Pc(86) int local86 = 2; local86 >= 0; local86--) {
					for (local90 = local84; local90 >= 0; local90--) {
						local73--;
						@Pc(98) int local98 = this.anIntArray77[local73];
						local65[local90] += local98 >> 16 & 0xFF;
						local68[local90] += local98 >> 8 & 0xFF;
						local57[local90] += local98 & 0xFF;
					}
					if (local73 == 0) {
						local73 = local80;
					}
				}
				@Pc(152) int local152 = local33 - 1;
				@Pc(154) int local154 = local80;
				for (@Pc(156) int local156 = local152; local156 >= 0; local156--) {
					@Pc(160) int local160 = 1;
					@Pc(162) int local162 = 1;
					@Pc(165) int local165 = 0;
					@Pc(167) int local167 = 0;
					@Pc(168) int local168 = 0;
					for (local90 = 2; local90 >= 0; local90--) {
						local160--;
						local167 += local57[local160];
						local165 += local68[local160];
						local168 += local65[local160];
						if (local160 == 0) {
							local160 = local33;
						}
					}
					for (local90 = local84; local90 >= 0; local90--) {
						@Pc(212) int local212 = local168 / 9;
						@Pc(216) int local216 = local165 / 9;
						@Pc(220) int local220 = local167 / 9;
						local160--;
						local162--;
						local154--;
						local62[local154] = local216 << 8 | local212 << 16 | local220;
						local167 += local57[local160] - local57[local162];
						local165 += local68[local160] - local68[local162];
						local168 += local65[local160] - local65[local162];
						if (local162 == 0) {
							local162 = local33;
						}
						if (local160 == 0) {
							local160 = local33;
						}
					}
					for (local90 = local84; local90 >= 0; local90--) {
						local73--;
						@Pc(287) int local287 = this.anIntArray77[local73];
						local74--;
						@Pc(293) int local293 = this.anIntArray77[local74];
						local65[local90] += (local287 >> 16 & 0xFF) - ((local293 & 0xFF4865) >> 16);
						local68[local90] += (local287 >> 8 & 0xFF) - ((local293 & 0xFFD2) >> 8);
						local57[local90] += (local287 & 0xFF) - (local293 & 0xFF);
					}
					if (local73 == 0) {
						local73 = local80;
					}
					if (local74 == 0) {
						local74 = local80;
					}
				}
				this.anIntArray77 = local62;
			}
		}
		return this.anIntArray77;
	}
}
