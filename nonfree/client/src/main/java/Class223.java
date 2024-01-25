import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lj")
public final class Class223 {

	@OriginalMember(owner = "client!lj", name = "g", descriptor = "Lclient!pw;")
	public Interface18 anInterface18_2 = null;

	@OriginalMember(owner = "client!lj", name = "j", descriptor = "Lclient!pw;")
	public Interface18 anInterface18_1 = null;

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "[Lclient!gka;")
	private Interface9[] anInterface9Array1 = null;

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "[Lclient!gka;")
	public Interface9[] anInterface9Array2 = null;

	@OriginalMember(owner = "client!lj", name = "e", descriptor = "Lclient!he;")
	private final Class144_Sub1 aClass144_Sub1_14;

	@OriginalMember(owner = "client!lj", name = "l", descriptor = "Z")
	public boolean aBoolean423;

	@OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(Lclient!he;)V")
	public Class223(@OriginalArg(0) Class144_Sub1 arg0) {
		this.aClass144_Sub1_14 = arg0;
		this.aBoolean423 = this.aClass144_Sub1_14.aBoolean449;
		if (this.aBoolean423 && !this.aClass144_Sub1_14.method5759(Static18.aClass19_4, Static608.aClass260_11)) {
			this.aBoolean423 = false;
		}
		if (this.aBoolean423 || this.aClass144_Sub1_14.method5757(Static18.aClass19_4, Static608.aClass260_11)) {
			Static147.method2176();
			if (this.aBoolean423) {
				@Pc(134) byte[] local134 = Static351.method9354(false, Static248.anObject8);
				this.anInterface18_1 = this.aClass144_Sub1_14.method5733(local134, Static608.aClass260_11);
				@Pc(150) byte[] local150 = Static351.method9354(false, Static508.anObject20);
				this.aClass144_Sub1_14.method5733(local150, Static608.aClass260_11);
			} else {
				this.anInterface9Array2 = new Interface9[16];
				for (@Pc(61) int local61 = 0; local61 < 16; local61++) {
					@Pc(74) byte[] local74 = Static264.method4388(local61 * 128 * 128 * 2, Static248.anObject8);
					this.anInterface9Array2[local61] = this.aClass144_Sub1_14.method5714(local74, 128, true, 128, Static608.aClass260_11);
				}
				this.anInterface9Array1 = new Interface9[16];
				for (@Pc(99) int local99 = 0; local99 < 16; local99++) {
					@Pc(110) byte[] local110 = Static264.method4388(local99 * 128 * 256, Static508.anObject20);
					this.anInterface9Array1[local99] = this.aClass144_Sub1_14.method5714(local110, 128, true, 128, Static608.aClass260_11);
				}
			}
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)Z")
	public boolean method5331() {
		if (this.aBoolean423) {
			return this.anInterface18_1 != null;
		} else {
			return this.anInterface9Array2 != null;
		}
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(B)Z")
	public boolean method5332() {
		if (this.anInterface18_2 == null) {
			@Pc(24) byte[] local24;
			if (Static433.anObject17 == null) {
				local24 = Static236.method3981(16.0F, 0.6F, 0.5F, 4.0F, new Class295_Sub1(419684), 4.0F);
				Static433.anObject17 = Static649.method9108(local24);
			}
			local24 = Static351.method9354(false, Static433.anObject17);
			@Pc(40) byte[] local40 = new byte[local24.length * 4];
			@Pc(42) int local42 = 0;
			for (@Pc(44) int local44 = 0; local44 < 16; local44++) {
				@Pc(52) int local52 = local44 * 128 * 128;
				@Pc(54) int local54 = local52;
				for (@Pc(56) int local56 = 0; local56 < 128; local56++) {
					@Pc(65) int local65 = local54 + local56 * 128;
					@Pc(75) int local75 = local54 + (local56 - 1 & 0x7F) * 128;
					@Pc(85) int local85 = local54 + (local56 + 1 & 0x7F) * 128;
					for (@Pc(87) int local87 = 0; local87 < 128; local87++) {
						@Pc(108) float local108 = (float) ((local24[local87 + local75] & 0xFF) - (local24[local85 + local87] & 0xFF));
						@Pc(134) float local134 = (float) ((local24[local65 + (local87 - 1 & 0x7F)] & 0xFF) - (local24[local65 + (local87 + 1 & 0x7F)] & 0xFF));
						@Pc(149) float local149 = (float) (128.0D / Math.sqrt((double) (local134 * local134 + local108 * local108 + 16384.0F)));
						local40[local42++] = (byte) (int) (local134 * local149 + 127.0F);
						local40[local42++] = (byte) (int) (local149 * 128.0F + 127.0F);
						local40[local42++] = (byte) (int) (local149 * local108 + 127.0F);
						local40[local42++] = local24[local52++];
					}
				}
			}
			this.anInterface18_2 = this.aClass144_Sub1_14.method5733(local40, Static641.aClass260_12);
		}
		return this.anInterface18_2 != null;
	}
}
