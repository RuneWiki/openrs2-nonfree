import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wv")
public final class Class378 {

	@OriginalMember(owner = "client!wv", name = "e", descriptor = "[Lclient!wda;")
	private Interface26[] anInterface26Array2 = null;

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "Lclient!ii;")
	public Interface11 anInterface11_1 = null;

	@OriginalMember(owner = "client!wv", name = "d", descriptor = "[Lclient!wda;")
	public Interface26[] anInterface26Array1 = null;

	@OriginalMember(owner = "client!wv", name = "i", descriptor = "Lclient!ii;")
	public Interface11 anInterface11_2 = null;

	@OriginalMember(owner = "client!wv", name = "l", descriptor = "Lclient!gt;")
	private final Class87_Sub1 aClass87_Sub1_23;

	@OriginalMember(owner = "client!wv", name = "m", descriptor = "Z")
	public boolean aBoolean758;

	@OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(Lclient!gt;)V")
	public Class378(@OriginalArg(0) Class87_Sub1 arg0) {
		this.aClass87_Sub1_23 = arg0;
		this.aBoolean758 = this.aClass87_Sub1_23.aBoolean445;
		if (this.aBoolean758 && !this.aClass87_Sub1_23.method5137(Static545.aClass324_12, Static457.aClass187_13)) {
			this.aBoolean758 = false;
		}
		if (this.aBoolean758 || this.aClass87_Sub1_23.method5091(Static545.aClass324_12, Static457.aClass187_13)) {
			Static631.method8484();
			if (this.aBoolean758) {
				@Pc(128) byte[] local128 = Static187.method3389(Static371.anObject13, false);
				this.anInterface11_1 = this.aClass87_Sub1_23.method5056(Static457.aClass187_13, local128);
				@Pc(144) byte[] local144 = Static187.method3389(Static480.anObject14, false);
				this.aClass87_Sub1_23.method5056(Static457.aClass187_13, local144);
			} else {
				this.anInterface26Array1 = new Interface26[16];
				for (@Pc(56) int local56 = 0; local56 < 16; local56++) {
					@Pc(69) byte[] local69 = Static331.method4924(128 * 128 * local56 * 2, Static371.anObject13);
					this.anInterface26Array1[local56] = this.aClass87_Sub1_23.method5113(local69, true, 128, Static457.aClass187_13, 128);
				}
				this.anInterface26Array2 = new Interface26[16];
				for (@Pc(92) int local92 = 0; local92 < 16; local92++) {
					@Pc(105) byte[] local105 = Static331.method4924(2 * 128 * local92 * 128, Static480.anObject14);
					this.anInterface26Array2[local92] = this.aClass87_Sub1_23.method5113(local105, true, 128, Static457.aClass187_13, 128);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(I)Z")
	public boolean method8579() {
		if (this.aBoolean758) {
			return this.anInterface11_1 != null;
		} else {
			return this.anInterface26Array1 != null;
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(B)Z")
	public boolean method8582() {
		if (this.anInterface11_2 == null) {
			@Pc(31) byte[] local31;
			if (Static94.anObject5 == null) {
				local31 = Static569.method7835(4.0F, new Class256_Sub1(419684), 0.6F, 16.0F, 0.5F, 4.0F);
				Static94.anObject5 = Static609.method8332(local31);
			}
			local31 = Static187.method3389(Static94.anObject5, false);
			@Pc(47) byte[] local47 = new byte[local31.length * 4];
			@Pc(49) int local49 = 0;
			for (@Pc(51) int local51 = 0; local51 < 16; local51++) {
				@Pc(59) int local59 = local51 * 128 * 128;
				@Pc(61) int local61 = local59;
				for (@Pc(63) int local63 = 0; local63 < 128; local63++) {
					@Pc(72) int local72 = local61 + local63 * 128;
					@Pc(82) int local82 = (local63 - 1 & 0x7F) * 128 + local61;
					@Pc(92) int local92 = (local63 + 1 & 0x7F) * 128 + local61;
					for (@Pc(94) int local94 = 0; local94 < 128; local94++) {
						@Pc(115) float local115 = (float) ((local31[local94 + local82] & 0xFF) - (local31[local92 + local94] & 0xFF));
						@Pc(141) float local141 = (float) ((local31[local72 + (local94 - 1 & 0x7F)] & 0xFF) - (local31[local72 + (local94 + 1 & 0x7F)] & 0xFF));
						@Pc(156) float local156 = (float) (128.0D / Math.sqrt((double) (local141 * local141 + local115 * local115 + 16384.0F)));
						local47[local49++] = (byte) (local141 * local156 + 127.0F);
						local47[local49++] = (byte) (local156 * 128.0F + 127.0F);
						local47[local49++] = (byte) (local156 * local115 + 127.0F);
						local47[local49++] = local31[local59++];
					}
				}
			}
			this.anInterface11_2 = this.aClass87_Sub1_23.method5056(Static524.aClass187_15, local47);
		}
		return this.anInterface11_2 != null;
	}
}
