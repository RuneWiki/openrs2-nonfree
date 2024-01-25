import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public final class Class242 {

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "Lclient!wca;")
	public Interface23 anInterface23_1 = null;

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "Lclient!wca;")
	public Interface23 anInterface23_2 = null;

	@OriginalMember(owner = "client!ob", name = "h", descriptor = "[Lclient!dca;")
	public Interface4[] anInterface4Array2 = null;

	@OriginalMember(owner = "client!ob", name = "g", descriptor = "[Lclient!dca;")
	private Interface4[] anInterface4Array1 = null;

	@OriginalMember(owner = "client!ob", name = "j", descriptor = "Lclient!nh;")
	private final Class7_Sub1 aClass7_Sub1_14;

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "Z")
	public boolean aBoolean489;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lclient!nh;)V")
	public Class242(@OriginalArg(0) Class7_Sub1 arg0) {
		this.aClass7_Sub1_14 = arg0;
		this.aBoolean489 = this.aClass7_Sub1_14.aBoolean532;
		if (this.aBoolean489 && !this.aClass7_Sub1_14.method5734(Static470.aClass161_16, Static424.aClass273_12)) {
			this.aBoolean489 = false;
		}
		if (this.aBoolean489 || this.aClass7_Sub1_14.method5660(Static470.aClass161_16, Static424.aClass273_12)) {
			Static466.method6799();
			if (this.aBoolean489) {
				@Pc(132) byte[] local132 = Static141.method8245(Static590.anObject157, false);
				this.anInterface23_2 = this.aClass7_Sub1_14.method5784(Static470.aClass161_16, local132);
				@Pc(148) byte[] local148 = Static141.method8245(Static37.anObject12, false);
				this.aClass7_Sub1_14.method5784(Static470.aClass161_16, local148);
			} else {
				this.anInterface4Array2 = new Interface4[16];
				for (@Pc(58) int local58 = 0; local58 < 16; local58++) {
					@Pc(72) byte[] local72 = Static161.method2668(Static590.anObject157, local58 * 128 * 128 * 2);
					this.anInterface4Array2[local58] = this.aClass7_Sub1_14.method5665(local72, 128, Static470.aClass161_16, 128, true);
				}
				this.anInterface4Array1 = new Interface4[16];
				for (@Pc(97) int local97 = 0; local97 < 16; local97++) {
					@Pc(109) byte[] local109 = Static161.method2668(Static37.anObject12, local97 * 16384 * 2);
					this.anInterface4Array1[local97] = this.aClass7_Sub1_14.method5665(local109, 128, Static470.aClass161_16, 128, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z)Z")
	public boolean method5532() {
		if (this.anInterface23_1 == null) {
			@Pc(32) byte[] local32;
			if (Static561.anObject152 == null) {
				local32 = Static439.method6483(16.0F, 4.0F, 0.6F, 0.5F, 4.0F, new Class26_Sub1(419684));
				Static561.anObject152 = Static111.method2038(local32);
			}
			local32 = Static141.method8245(Static561.anObject152, false);
			@Pc(48) byte[] local48 = new byte[local32.length * 4];
			@Pc(50) int local50 = 0;
			for (@Pc(52) int local52 = 0; local52 < 16; local52++) {
				@Pc(60) int local60 = local52 * 128 * 128;
				@Pc(62) int local62 = local60;
				for (@Pc(64) int local64 = 0; local64 < 128; local64++) {
					@Pc(73) int local73 = local62 + local64 * 128;
					@Pc(83) int local83 = (local64 - 1 & 0x7F) * 128 + local62;
					@Pc(93) int local93 = local62 + (local64 + 1 & 0x7F) * 128;
					for (@Pc(95) int local95 = 0; local95 < 128; local95++) {
						@Pc(114) float local114 = (float) ((local32[local95 + local83] & 0xFF) - (local32[local95 + local93] & 0xFF));
						@Pc(140) float local140 = (float) ((local32[(local95 - 1 & 0x7F) + local73] & 0xFF) - (local32[local73 + (local95 + 1 & 0x7F)] & 0xFF));
						@Pc(155) float local155 = (float) (128.0D / Math.sqrt((double) (local140 * local140 + local114 * local114 + 16384.0F)));
						local48[local50++] = (byte) (local155 * local140 + 127.0F);
						local48[local50++] = (byte) (local155 * 128.0F + 127.0F);
						local48[local50++] = (byte) (local114 * local155 + 127.0F);
						local48[local50++] = local32[local60++];
					}
				}
			}
			this.anInterface23_1 = this.aClass7_Sub1_14.method5784(Static151.aClass161_6, local48);
		}
		return this.anInterface23_1 != null;
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)Z")
	public boolean method5534() {
		if (this.aBoolean489) {
			return this.anInterface23_2 != null;
		} else {
			return this.anInterface4Array2 != null;
		}
	}
}
