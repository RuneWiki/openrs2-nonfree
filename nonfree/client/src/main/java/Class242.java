import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class Class242 {

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "Lclient!oq;")
	public Interface13 anInterface13_1 = null;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "[Lclient!lba;")
	public Interface10[] anInterface10Array1 = null;

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "Lclient!oq;")
	public Interface13 anInterface13_2 = null;

	@OriginalMember(owner = "client!nc", name = "g", descriptor = "[Lclient!lba;")
	private Interface10[] anInterface10Array2 = null;

	@OriginalMember(owner = "client!nc", name = "j", descriptor = "Lclient!mj;")
	private final Class101_Sub1 aClass101_Sub1_18;

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "Z")
	public boolean aBoolean552;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lclient!mj;)V")
	public Class242(@OriginalArg(0) Class101_Sub1 arg0) {
		this.aClass101_Sub1_18 = arg0;
		this.aBoolean552 = this.aClass101_Sub1_18.aBoolean486;
		if (this.aBoolean552 && !this.aClass101_Sub1_18.method5876(Static105.aClass244_4, Static114.aClass79_7)) {
			this.aBoolean552 = false;
		}
		if (this.aBoolean552 || this.aClass101_Sub1_18.method5850(Static105.aClass244_4, Static114.aClass79_7)) {
			Static581.method8769();
			if (this.aBoolean552) {
				@Pc(136) byte[] local136 = Static221.method4081(Static424.anObject16, false);
				this.anInterface13_2 = this.aClass101_Sub1_18.method5834(Static105.aClass244_4, local136);
				@Pc(152) byte[] local152 = Static221.method4081(Static431.anObject8, false);
				this.aClass101_Sub1_18.method5834(Static105.aClass244_4, local152);
			} else {
				this.anInterface10Array1 = new Interface10[16];
				for (@Pc(58) int local58 = 0; local58 < 16; local58++) {
					@Pc(72) byte[] local72 = Static197.method3784(local58 * 128 * 128 * 2, Static424.anObject16);
					this.anInterface10Array1[local58] = this.aClass101_Sub1_18.method5917(Static105.aClass244_4, true, 128, local72, 128);
				}
				this.anInterface10Array2 = new Interface10[16];
				for (@Pc(97) int local97 = 0; local97 < 16; local97++) {
					@Pc(111) byte[] local111 = Static197.method3784(local97 * 128 * 128 * 2, Static431.anObject8);
					this.anInterface10Array2[local97] = this.aClass101_Sub1_18.method5917(Static105.aClass244_4, true, 128, local111, 128);
				}
			}
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Z)Z")
	public boolean method6564() {
		if (this.aBoolean552) {
			return this.anInterface13_2 != null;
		} else {
			return this.anInterface10Array1 != null;
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)Z")
	public boolean method6565() {
		if (this.anInterface13_1 == null) {
			@Pc(22) byte[] local22;
			if (Static51.anObject1 == null) {
				local22 = Static574.method8719(0.6F, 4.0F, 16.0F, 4.0F, 0.5F, new Class225_Sub1(419684));
				Static51.anObject1 = Static340.method5715(local22);
			}
			local22 = Static221.method4081(Static51.anObject1, false);
			@Pc(38) byte[] local38 = new byte[local22.length * 4];
			@Pc(40) int local40 = 0;
			for (@Pc(42) int local42 = 0; local42 < 16; local42++) {
				@Pc(48) int local48 = local42 * 16384;
				@Pc(50) int local50 = local48;
				for (@Pc(52) int local52 = 0; local52 < 128; local52++) {
					@Pc(60) int local60 = local52 * 128 + local50;
					@Pc(71) int local71 = local50 + (local52 - 1 & 0x7F) * 128;
					@Pc(81) int local81 = (local52 + 1 & 0x7F) * 128 + local50;
					for (@Pc(83) int local83 = 0; local83 < 128; local83++) {
						@Pc(104) float local104 = (float) ((local22[local83 + local71] & 0xFF) - (local22[local81 + local83] & 0xFF));
						@Pc(130) float local130 = (float) ((local22[local60 + (local83 - 1 & 0x7F)] & 0xFF) - (local22[(local83 + 1 & 0x7F) + local60] & 0xFF));
						@Pc(145) float local145 = (float) (128.0D / Math.sqrt((double) (local130 * local130 + local104 * local104 + 16384.0F)));
						local38[local40++] = (byte) (int) (local145 * local130 + 127.0F);
						local38[local40++] = (byte) (int) (local145 * 128.0F + 127.0F);
						local38[local40++] = (byte) (int) (local145 * local104 + 127.0F);
						local38[local40++] = local22[local48++];
					}
				}
			}
			this.anInterface13_1 = this.aClass101_Sub1_18.method5834(Static584.aClass244_9, local38);
		}
		return this.anInterface13_1 != null;
	}
}
