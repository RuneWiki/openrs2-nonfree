import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oca")
public final class Class247 {

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "[Lclient!bw;")
	public Interface2[] anInterface2Array1 = null;

	@OriginalMember(owner = "client!oca", name = "f", descriptor = "[Lclient!bw;")
	private Interface2[] anInterface2Array2 = null;

	@OriginalMember(owner = "client!oca", name = "j", descriptor = "Lclient!at;")
	public Interface1 anInterface1_2 = null;

	@OriginalMember(owner = "client!oca", name = "d", descriptor = "Lclient!at;")
	public Interface1 anInterface1_1 = null;

	@OriginalMember(owner = "client!oca", name = "c", descriptor = "Lclient!lba;")
	private final Class132_Sub1 aClass132_Sub1_19;

	@OriginalMember(owner = "client!oca", name = "e", descriptor = "Z")
	public boolean aBoolean481;

	@OriginalMember(owner = "client!oca", name = "<init>", descriptor = "(Lclient!lba;)V")
	public Class247(@OriginalArg(0) Class132_Sub1 arg0) {
		this.aClass132_Sub1_19 = arg0;
		this.aBoolean481 = this.aClass132_Sub1_19.aBoolean640;
		if (this.aBoolean481 && !this.aClass132_Sub1_19.method7585(Static417.aClass250_14, Static98.aClass265_16)) {
			this.aBoolean481 = false;
		}
		if (this.aBoolean481 || this.aClass132_Sub1_19.method7634(Static417.aClass250_14, Static98.aClass265_16)) {
			Static664.method9006();
			if (this.aBoolean481) {
				@Pc(57) byte[] local57 = Static519.method7337(Static503.anObject21, false);
				this.anInterface1_1 = this.aClass132_Sub1_19.method7575(Static98.aClass265_16, local57);
				@Pc(73) byte[] local73 = Static519.method7337(Static340.anObject18, false);
				this.aClass132_Sub1_19.method7575(Static98.aClass265_16, local73);
			} else {
				this.anInterface2Array1 = new Interface2[16];
				for (@Pc(90) int local90 = 0; local90 < 16; local90++) {
					@Pc(102) byte[] local102 = Static118.method1840(Static503.anObject21, 2 * 16384 * local90);
					this.anInterface2Array1[local90] = this.aClass132_Sub1_19.method7550(128, 128, local102, true, Static98.aClass265_16);
				}
				this.anInterface2Array2 = new Interface2[16];
				for (@Pc(125) int local125 = 0; local125 < 16; local125++) {
					@Pc(137) byte[] local137 = Static118.method1840(Static340.anObject18, local125 * 2 * 16384);
					this.anInterface2Array2[local125] = this.aClass132_Sub1_19.method7550(128, 128, local137, true, Static98.aClass265_16);
				}
			}
		}
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(I)Z")
	public boolean method6208() {
		if (this.aBoolean481) {
			return this.anInterface1_1 != null;
		} else {
			return this.anInterface2Array1 != null;
		}
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(B)Z")
	public boolean method6209() {
		if (this.anInterface1_2 == null) {
			@Pc(30) byte[] local30;
			if (Static360.anObject26 == null) {
				local30 = Static151.method2163(16.0F, 0.6F, 0.5F, new Class71_Sub1(419684), 4.0F, 4.0F);
				Static360.anObject26 = Static486.method7063(local30);
			}
			local30 = Static519.method7337(Static360.anObject26, false);
			@Pc(46) byte[] local46 = new byte[local30.length * 4];
			@Pc(48) int local48 = 0;
			for (@Pc(50) int local50 = 0; local50 < 16; local50++) {
				@Pc(58) int local58 = 128 * 128 * local50;
				@Pc(60) int local60 = local58;
				for (@Pc(62) int local62 = 0; local62 < 128; local62++) {
					@Pc(70) int local70 = local62 * 128 + local60;
					@Pc(80) int local80 = (local62 - 1 & 0x7F) * 128 + local60;
					@Pc(90) int local90 = (local62 + 1 & 0x7F) * 128 + local60;
					for (@Pc(92) int local92 = 0; local92 < 128; local92++) {
						@Pc(113) float local113 = (float) ((local30[local80 + local92] & 0xFF) - (local30[local90 + local92] & 0xFF));
						@Pc(138) float local138 = (float) ((local30[(local92 - 1 & 0x7F) + local70] & 0xFF) - (local30[(local92 + 1 & 0x7F) + local70] & 0xFF));
						@Pc(153) float local153 = (float) (128.0D / Math.sqrt((double) (local138 * local138 + local113 * local113 + 16384.0F)));
						local46[local48++] = (byte) (int) (local153 * local138 + 127.0F);
						local46[local48++] = (byte) (int) (local153 * 128.0F + 127.0F);
						local46[local48++] = (byte) (int) (local113 * local153 + 127.0F);
						local46[local48++] = local30[local58++];
					}
				}
			}
			this.anInterface1_2 = this.aClass132_Sub1_19.method7575(Static169.aClass265_9, local46);
		}
		return this.anInterface1_2 != null;
	}
}
