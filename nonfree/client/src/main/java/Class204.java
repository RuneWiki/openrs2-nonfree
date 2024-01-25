import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ln")
public final class Class204 {

	@OriginalMember(owner = "client!ln", name = "e", descriptor = "Lclient!dea;")
	public Interface4 anInterface4_1 = null;

	@OriginalMember(owner = "client!ln", name = "j", descriptor = "[Lclient!gn;")
	public Interface8[] anInterface8Array2 = null;

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "[Lclient!gn;")
	private Interface8[] anInterface8Array1 = null;

	@OriginalMember(owner = "client!ln", name = "m", descriptor = "Lclient!dea;")
	public Interface4 anInterface4_2 = null;

	@OriginalMember(owner = "client!ln", name = "f", descriptor = "Lclient!qq;")
	private final Class12_Sub2 aClass12_Sub2_16;

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "Z")
	public boolean aBoolean413;

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Lclient!qq;)V")
	public Class204(@OriginalArg(0) Class12_Sub2 arg0) {
		this.aClass12_Sub2_16 = arg0;
		this.aBoolean413 = this.aClass12_Sub2_16.aBoolean544;
		if (this.aBoolean413 && !this.aClass12_Sub2_16.method6279(Static275.aClass297_8, Static554.aClass340_14)) {
			this.aBoolean413 = false;
		}
		if (this.aBoolean413 || this.aClass12_Sub2_16.method6219(Static554.aClass340_14, Static275.aClass297_8)) {
			Static166.method2554();
			if (this.aBoolean413) {
				@Pc(57) byte[] local57 = Static114.method1984(Static389.anObject14, false);
				this.anInterface4_1 = this.aClass12_Sub2_16.method6155(local57, Static275.aClass297_8);
				@Pc(73) byte[] local73 = Static114.method1984(Static510.anObject22, false);
				this.aClass12_Sub2_16.method6155(local73, Static275.aClass297_8);
			} else {
				this.anInterface8Array2 = new Interface8[16];
				for (@Pc(90) int local90 = 0; local90 < 16; local90++) {
					@Pc(104) byte[] local104 = Static595.method7932(128 * 128 * local90 * 2, Static389.anObject14);
					this.anInterface8Array2[local90] = this.aClass12_Sub2_16.method6217(Static275.aClass297_8, 128, local104, true, 128);
				}
				this.anInterface8Array1 = new Interface8[16];
				for (@Pc(127) int local127 = 0; local127 < 16; local127++) {
					@Pc(141) byte[] local141 = Static595.method7932(local127 * 128 * 128 * 2, Static510.anObject22);
					this.anInterface8Array1[local127] = this.aClass12_Sub2_16.method6217(Static275.aClass297_8, 128, local141, true, 128);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(B)Z")
	public boolean method4712() {
		if (this.aBoolean413) {
			return this.anInterface4_1 != null;
		} else {
			return this.anInterface8Array2 != null;
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)Z")
	public boolean method4714() {
		if (this.anInterface4_2 == null) {
			@Pc(26) byte[] local26;
			if (Static421.anObject17 == null) {
				local26 = Static449.method6371(0.6F, 4.0F, new Class130_Sub1(419684), 0.5F, 16.0F, 4.0F);
				Static421.anObject17 = Static183.method3216(local26);
			}
			local26 = Static114.method1984(Static421.anObject17, false);
			@Pc(42) byte[] local42 = new byte[local26.length * 4];
			@Pc(44) int local44 = 0;
			for (@Pc(46) int local46 = 0; local46 < 16; local46++) {
				@Pc(54) int local54 = 128 * 128 * local46;
				@Pc(56) int local56 = local54;
				for (@Pc(58) int local58 = 0; local58 < 128; local58++) {
					@Pc(66) int local66 = local58 * 128 + local56;
					@Pc(77) int local77 = local56 + (local58 - 1 & 0x7F) * 128;
					@Pc(87) int local87 = (local58 + 1 & 0x7F) * 128 + local56;
					for (@Pc(89) int local89 = 0; local89 < 128; local89++) {
						@Pc(109) float local109 = (float) ((local26[local89 + local77] & 0xFF) - (local26[local89 + local87] & 0xFF));
						@Pc(134) float local134 = (float) ((local26[(local89 - 1 & 0x7F) + local66] & 0xFF) - (local26[(local89 + 1 & 0x7F) + local66] & 0xFF));
						@Pc(149) float local149 = (float) (128.0D / Math.sqrt((double) (local134 * local134 + local109 * local109 + 16384.0F)));
						local42[local44++] = (byte) (local134 * local149 + 127.0F);
						local42[local44++] = (byte) (local149 * 128.0F + 127.0F);
						local42[local44++] = (byte) (local149 * local109 + 127.0F);
						local42[local44++] = local26[local54++];
					}
				}
			}
			this.anInterface4_2 = this.aClass12_Sub2_16.method6155(local42, Static253.aClass297_5);
		}
		return this.anInterface4_2 != null;
	}
}
