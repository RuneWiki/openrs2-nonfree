import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ur")
public final class Class347 {

	@OriginalMember(owner = "client!ur", name = "c", descriptor = "Lclient!ir;")
	public Interface13 anInterface13_1 = null;

	@OriginalMember(owner = "client!ur", name = "f", descriptor = "Lclient!ir;")
	public Interface13 anInterface13_2 = null;

	@OriginalMember(owner = "client!ur", name = "e", descriptor = "[Lclient!wfa;")
	private Interface27[] anInterface27Array1 = null;

	@OriginalMember(owner = "client!ur", name = "j", descriptor = "[Lclient!wfa;")
	public Interface27[] anInterface27Array2 = null;

	@OriginalMember(owner = "client!ur", name = "h", descriptor = "Lclient!wga;")
	private final Class20_Sub2 aClass20_Sub2_23;

	@OriginalMember(owner = "client!ur", name = "i", descriptor = "Z")
	public boolean aBoolean711;

	@OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(Lclient!wga;)V")
	public Class347(@OriginalArg(0) Class20_Sub2 arg0) {
		this.aClass20_Sub2_23 = arg0;
		this.aBoolean711 = this.aClass20_Sub2_23.aBoolean128;
		if (this.aBoolean711 && !this.aClass20_Sub2_23.method1565(Static463.aClass375_39, Static29.aClass26_4)) {
			this.aBoolean711 = false;
		}
		if (this.aBoolean711 || this.aClass20_Sub2_23.method1514(Static29.aClass26_4, Static463.aClass375_39)) {
			Static507.method7814();
			if (this.aBoolean711) {
				@Pc(134) byte[] local134 = Static172.method3628(false, Static12.anObject1);
				this.anInterface13_1 = this.aClass20_Sub2_23.method1506(Static463.aClass375_39, local134);
				@Pc(150) byte[] local150 = Static172.method3628(false, Static515.anObject16);
				this.aClass20_Sub2_23.method1506(Static463.aClass375_39, local150);
			} else {
				this.anInterface27Array2 = new Interface27[16];
				for (@Pc(58) int local58 = 0; local58 < 16; local58++) {
					@Pc(72) byte[] local72 = Static434.method6895(Static12.anObject1, local58 * 128 * 128 * 2);
					this.anInterface27Array2[local58] = this.aClass20_Sub2_23.method1578(local72, 128, Static463.aClass375_39, true, 128);
				}
				this.anInterface27Array1 = new Interface27[16];
				for (@Pc(95) int local95 = 0; local95 < 16; local95++) {
					@Pc(109) byte[] local109 = Static434.method6895(Static515.anObject16, 128 * 128 * local95 * 2);
					this.anInterface27Array1[local95] = this.aClass20_Sub2_23.method1578(local109, 128, Static463.aClass375_39, true, 128);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(I)Z")
	public boolean method8640() {
		if (this.aBoolean711) {
			return this.anInterface13_1 != null;
		} else {
			return this.anInterface27Array2 != null;
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(B)Z")
	public boolean method8642() {
		if (this.anInterface13_2 == null) {
			@Pc(27) byte[] local27;
			if (Static571.anObject17 == null) {
				local27 = Static327.method5622(0.6F, 4.0F, 4.0F, 0.5F, 16.0F, new Class185_Sub1(419684));
				Static571.anObject17 = Static51.method1759(local27);
			}
			local27 = Static172.method3628(false, Static571.anObject17);
			@Pc(43) byte[] local43 = new byte[local27.length * 4];
			@Pc(45) int local45 = 0;
			for (@Pc(47) int local47 = 0; local47 < 16; local47++) {
				@Pc(55) int local55 = local47 * 128 * 128;
				@Pc(57) int local57 = local55;
				for (@Pc(59) int local59 = 0; local59 < 128; local59++) {
					@Pc(67) int local67 = local59 * 128 + local57;
					@Pc(77) int local77 = (local59 - 1 & 0x7F) * 128 + local57;
					@Pc(87) int local87 = local57 + (local59 + 1 & 0x7F) * 128;
					for (@Pc(89) int local89 = 0; local89 < 128; local89++) {
						@Pc(108) float local108 = (float) ((local27[local89 + local77] & 0xFF) - (local27[local89 + local87] & 0xFF));
						@Pc(134) float local134 = (float) ((local27[(local89 - 1 & 0x7F) + local67] & 0xFF) - (local27[local67 + (local89 + 1 & 0x7F)] & 0xFF));
						@Pc(149) float local149 = (float) (128.0D / Math.sqrt((double) (local108 * local108 + local134 * local134 + 16384.0F)));
						local43[local45++] = (byte) (local134 * local149 + 127.0F);
						local43[local45++] = (byte) (local149 * 128.0F + 127.0F);
						local43[local45++] = (byte) (local149 * local108 + 127.0F);
						local43[local45++] = local27[local55++];
					}
				}
			}
			this.anInterface13_2 = this.aClass20_Sub2_23.method1506(Static354.aClass375_31, local43);
		}
		return this.anInterface13_2 != null;
	}
}
