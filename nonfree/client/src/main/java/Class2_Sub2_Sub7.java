import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ei")
public final class Class2_Sub2_Sub7 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ei", name = "B", descriptor = "F")
	private float aFloat2;

	@OriginalMember(owner = "client!ei", name = "K", descriptor = "[I")
	private int[] anIntArray96;

	@OriginalMember(owner = "client!ei", name = "Y", descriptor = "Z")
	public boolean aBoolean70 = false;

	@OriginalMember(owner = "client!ei", name = "P", descriptor = "Lclient!oh;")
	private final Class73 aClass73_1;

	@OriginalMember(owner = "client!ei", name = "Q", descriptor = "Z")
	public final boolean aBoolean69;

	@OriginalMember(owner = "client!ei", name = "z", descriptor = "Z")
	public boolean aBoolean66;

	@OriginalMember(owner = "client!ei", name = "M", descriptor = "I")
	public final int anInt1218;

	@OriginalMember(owner = "client!ei", name = "F", descriptor = "Z")
	private boolean aBoolean67;

	@OriginalMember(owner = "client!ei", name = "J", descriptor = "Z")
	private boolean aBoolean68;

	@OriginalMember(owner = "client!ei", name = "G", descriptor = "I")
	public int anInt1215;

	@OriginalMember(owner = "client!ei", name = "w", descriptor = "I")
	private int anInt1211;

	@OriginalMember(owner = "client!ei", name = "E", descriptor = "I")
	private int anInt1214;

	@OriginalMember(owner = "client!ei", name = "y", descriptor = "I")
	private int anInt1212;

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Lclient!ra;)V")
	public Class2_Sub2_Sub7(@OriginalArg(0) Class2_Sub3 arg0) {
		this.aClass73_1 = new Class73(arg0);
		@Pc(14) int local14 = arg0.method260();
		this.aBoolean69 = (local14 & 0x1) != 0;
		this.aBoolean66 = (local14 & 0x2) != 0;
		@Pc(48) int local48 = arg0.method260();
		this.anInt1218 = 0x1 << (local48 & 0x7) + 1;
		this.aBoolean67 = (local48 & 0x80) != 0;
		this.aBoolean68 = (local48 & 0x8) != 0;
		this.anInt1215 = arg0.method269();
		this.anInt1211 = arg0.method260();
		if (this.anInt1211 == 255) {
			this.anInt1211 = 256;
		}
		this.anInt1214 = arg0.method221();
		this.anInt1212 = arg0.method221();
		arg0.method260();
		arg0.method260();
		arg0.method260();
	}

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub7() {
		this.aClass73_1 = new Class73();
		this.anInt1218 = 64;
		this.aBoolean69 = true;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!wh;Lclient!eh;II)[I")
	public int[] method936(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass73_1.method2252(arg1, arg0)) {
			@Pc(31) int local31 = arg2 >= this.anInt1218 ? this.anInt1218 : arg2;
			return this.aClass73_1.method2251(false, arg1, 1.0D, this.aBoolean67, arg0, local31, local31);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IBLclient!wh;FLclient!eh;)[I")
	public int[] method937(@OriginalArg(0) int arg0, @OriginalArg(2) Interface3 arg1, @OriginalArg(3) float arg2, @OriginalArg(4) Class28 arg3) {
		if (this.anIntArray96 == null || this.aFloat2 != arg2) {
			if (!this.aClass73_1.method2252(arg3, arg1)) {
				return null;
			}
			@Pc(37) int local37 = arg0 < this.anInt1218 ? arg0 : this.anInt1218;
			this.anIntArray96 = this.aClass73_1.method2251(true, arg3, (double) arg2, this.aBoolean67, arg1, local37, local37);
			this.aFloat2 = arg2;
			if (this.aBoolean68) {
				@Pc(61) int[] local61 = new int[local37];
				@Pc(64) int[] local64 = new int[local37];
				@Pc(67) int[] local67 = new int[local37];
				@Pc(72) int[] local72 = new int[local37 * local37];
				@Pc(77) int local77 = local37;
				@Pc(78) int local78 = local37;
				@Pc(84) int local84 = local37 - 1;
				@Pc(88) int local88 = local37 - 1;
				@Pc(92) int local92 = local37 * local37;
				@Pc(98) int local98;
				for (@Pc(94) int local94 = 2; local94 >= 0; local94--) {
					for (local98 = local84; local98 >= 0; local98--) {
						local77--;
						@Pc(106) int local106 = this.anIntArray96[local77];
						local61[local98] += local106 >> 16 & 0xFF;
						local64[local98] += local106 >> 8 & 0xFF;
						local67[local98] += local106 & 0xFF;
					}
					if (local77 == 0) {
						local77 = local92;
					}
				}
				@Pc(152) int local152 = local92;
				for (@Pc(154) int local154 = local88; local154 >= 0; local154--) {
					@Pc(158) int local158 = 1;
					@Pc(161) int local161 = 0;
					@Pc(163) int local163 = 0;
					@Pc(164) int local164 = 0;
					@Pc(166) int local166 = 1;
					for (local98 = 2; local98 >= 0; local98--) {
						local166--;
						local161 += local64[local166];
						local163 += local67[local166];
						local164 += local61[local166];
						if (local166 == 0) {
							local166 = local37;
						}
					}
					for (local98 = local84; local98 >= 0; local98--) {
						@Pc(207) int local207 = local161 / 9;
						@Pc(211) int local211 = local164 / 9;
						local166--;
						@Pc(216) int local216 = local163 / 9;
						local158--;
						local152--;
						local72[local152] = local216 | local207 << 8 | local211 << 16;
						local163 += local67[local166] - local67[local158];
						local161 += local64[local166] - local64[local158];
						local164 += local61[local166] - local61[local158];
						if (local166 == 0) {
							local166 = local37;
						}
						if (local158 == 0) {
							local158 = local37;
						}
					}
					for (local98 = local84; local98 >= 0; local98--) {
						local77--;
						@Pc(287) int local287 = this.anIntArray96[local77];
						local78--;
						@Pc(293) int local293 = this.anIntArray96[local78];
						local61[local98] += (local287 >> 16 & 0xFF) - (local293 >> 16 & 0xFF);
						local64[local98] += (local287 >> 8 & 0xFF) - ((local293 & 0xFF27) >> 8);
						local67[local98] += (local287 & 0xFF) - (local293 & 0xFF);
					}
					if (local78 == 0) {
						local78 = local92;
					}
					if (local77 == 0) {
						local77 = local92;
					}
				}
				this.anIntArray96 = local72;
			}
		}
		return this.anIntArray96;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(BLclient!eh;Lclient!wh;)Z")
	public boolean method939(@OriginalArg(1) Class28 arg0, @OriginalArg(2) Interface3 arg1) {
		return this.aClass73_1.method2252(arg0, arg1);
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IB)V")
	public void method940(@OriginalArg(0) int arg0) {
		if (this.anIntArray96 == null || this.anInt1212 == 0 && this.anInt1214 == 0) {
			return;
		}
		if (Static154.anIntArray305 == null || this.anIntArray96.length > Static154.anIntArray305.length) {
			Static154.anIntArray305 = new int[this.anIntArray96.length];
		}
		@Pc(45) int local45 = arg0 * this.anInt1214;
		@Pc(54) int local54 = this.anIntArray96.length == 4096 ? 64 : 128;
		@Pc(61) int local61 = arg0 * local54 * this.anInt1212;
		@Pc(65) int local65 = this.anIntArray96.length;
		@Pc(69) int local69 = local54 - 1;
		@Pc(73) int local73 = local65 - 1;
		for (@Pc(75) int local75 = 0; local75 < local65; local75 += local54) {
			@Pc(83) int local83 = local61 + local75 & local73;
			for (@Pc(85) int local85 = 0; local85 < local54; local85++) {
				@Pc(95) int local95 = local83 + (local85 + local45 & local69);
				@Pc(99) int local99 = local85 + local75;
				Static154.anIntArray305[local99] = this.anIntArray96[local95];
			}
		}
		@Pc(128) int[] local128 = this.anIntArray96;
		this.anIntArray96 = Static154.anIntArray305;
		Static154.anIntArray305 = local128;
	}

	@OriginalMember(owner = "client!ei", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		super.finalize();
	}
}
