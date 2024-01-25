import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vt")
public final class Class348 {

	@OriginalMember(owner = "client!vt", name = "c", descriptor = "Lclient!ck;")
	public Interface4 anInterface4_1 = null;

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "[Lclient!co;")
	private Interface6[] anInterface6Array1 = null;

	@OriginalMember(owner = "client!vt", name = "l", descriptor = "Lclient!ck;")
	public Interface4 anInterface4_2 = null;

	@OriginalMember(owner = "client!vt", name = "e", descriptor = "[Lclient!co;")
	public Interface6[] anInterface6Array2 = null;

	@OriginalMember(owner = "client!vt", name = "h", descriptor = "Lclient!ifa;")
	private final Class44_Sub2 aClass44_Sub2_23;

	@OriginalMember(owner = "client!vt", name = "k", descriptor = "Z")
	public boolean aBoolean705;

	@OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(Lclient!ifa;)V")
	public Class348(@OriginalArg(0) Class44_Sub2 arg0) {
		this.aClass44_Sub2_23 = arg0;
		this.aBoolean705 = this.aClass44_Sub2_23.aBoolean345;
		if (this.aBoolean705 && !this.aClass44_Sub2_23.method4280(Static480.aClass97_55, Static53.aClass42_4)) {
			this.aBoolean705 = false;
		}
		if (this.aBoolean705 || this.aClass44_Sub2_23.method4311(Static480.aClass97_55, Static53.aClass42_4)) {
			Static477.method7164();
			if (this.aBoolean705) {
				@Pc(57) byte[] local57 = Static501.method5647(Static17.anObject2, false);
				this.anInterface4_2 = this.aClass44_Sub2_23.method4366(local57, Static480.aClass97_55);
				@Pc(73) byte[] local73 = Static501.method5647(Static193.anObject12, false);
				this.aClass44_Sub2_23.method4366(local73, Static480.aClass97_55);
			} else {
				this.anInterface6Array2 = new Interface6[16];
				for (@Pc(90) int local90 = 0; local90 < 16; local90++) {
					@Pc(102) byte[] local102 = Static155.method2874(local90 * 256 * 128, Static17.anObject2);
					this.anInterface6Array2[local90] = this.aClass44_Sub2_23.method4337(128, true, local102, 128, Static480.aClass97_55);
				}
				this.anInterface6Array1 = new Interface6[16];
				for (@Pc(125) int local125 = 0; local125 < 16; local125++) {
					@Pc(135) byte[] local135 = Static155.method2874(local125 * 32768, Static193.anObject12);
					this.anInterface6Array1[local125] = this.aClass44_Sub2_23.method4337(128, true, local135, 128, Static480.aClass97_55);
				}
			}
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(Z)Z")
	public boolean method8144() {
		if (this.aBoolean705) {
			return this.anInterface4_2 != null;
		} else {
			return this.anInterface6Array2 != null;
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(I)Z")
	public boolean method8146() {
		if (this.anInterface4_1 == null) {
			@Pc(31) byte[] local31;
			if (Static40.anObject3 == null) {
				local31 = Static284.method4883(0.5F, 4.0F, 16.0F, 4.0F, 0.6F, new Class100_Sub1(419684));
				Static40.anObject3 = Static305.method5221(local31);
			}
			local31 = Static501.method5647(Static40.anObject3, false);
			@Pc(47) byte[] local47 = new byte[local31.length * 4];
			@Pc(49) int local49 = 0;
			for (@Pc(51) int local51 = 0; local51 < 16; local51++) {
				@Pc(59) int local59 = local51 * 128 * 128;
				@Pc(61) int local61 = local59;
				for (@Pc(63) int local63 = 0; local63 < 128; local63++) {
					@Pc(72) int local72 = local61 + local63 * 128;
					@Pc(82) int local82 = local61 + (local63 - 1 & 0x7F) * 128;
					@Pc(92) int local92 = (local63 + 1 & 0x7F) * 128 + local61;
					for (@Pc(94) int local94 = 0; local94 < 128; local94++) {
						@Pc(114) float local114 = (float) ((local31[local94 + local82] & 0xFF) - (local31[local94 + local92] & 0xFF));
						@Pc(142) float local142 = (float) ((local31[local72 + (local94 - 1 & 0x7F)] & 0xFF) - (local31[local72 + (local94 + 1 & 0x7F)] & 0xFF));
						@Pc(157) float local157 = (float) (128.0D / Math.sqrt((double) (local142 * local142 + local114 * local114 + 16384.0F)));
						local47[local49++] = (byte) (local142 * local157 + 127.0F);
						local47[local49++] = (byte) (local157 * 128.0F + 127.0F);
						local47[local49++] = (byte) (local157 * local114 + 127.0F);
						local47[local49++] = local31[local59++];
					}
				}
			}
			this.anInterface4_1 = this.aClass44_Sub2_23.method4366(local47, Static7.aClass97_5);
		}
		return this.anInterface4_1 != null;
	}
}
