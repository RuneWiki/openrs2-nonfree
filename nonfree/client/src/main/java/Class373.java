import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wda")
public final class Class373 {

	@OriginalMember(owner = "client!wda", name = "b", descriptor = "[Lclient!tr;")
	public Interface25[] anInterface25Array1 = null;

	@OriginalMember(owner = "client!wda", name = "h", descriptor = "[Lclient!tr;")
	private Interface25[] anInterface25Array2 = null;

	@OriginalMember(owner = "client!wda", name = "g", descriptor = "Lclient!op;")
	public Interface19 anInterface19_1 = null;

	@OriginalMember(owner = "client!wda", name = "k", descriptor = "Lclient!op;")
	public Interface19 anInterface19_2 = null;

	@OriginalMember(owner = "client!wda", name = "i", descriptor = "Lclient!rv;")
	private final Class126_Sub2 aClass126_Sub2_22;

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "Z")
	public boolean aBoolean823;

	@OriginalMember(owner = "client!wda", name = "<init>", descriptor = "(Lclient!rv;)V")
	public Class373(@OriginalArg(0) Class126_Sub2 arg0) {
		this.aClass126_Sub2_22 = arg0;
		this.aBoolean823 = this.aClass126_Sub2_22.aBoolean520;
		if (this.aBoolean823 && !this.aClass126_Sub2_22.method5564(Static385.aClass247_14, Static191.aClass281_9)) {
			this.aBoolean823 = false;
		}
		if (this.aBoolean823 || this.aClass126_Sub2_22.method5453(Static385.aClass247_14, Static191.aClass281_9)) {
			Static202.method3170();
			if (this.aBoolean823) {
				@Pc(57) byte[] local57 = Static383.method5945(Static281.anObject3, false);
				this.anInterface19_2 = this.aClass126_Sub2_22.method5531(local57, Static191.aClass281_9);
				@Pc(73) byte[] local73 = Static383.method5945(Static544.anObject17, false);
				this.aClass126_Sub2_22.method5531(local73, Static191.aClass281_9);
			} else {
				this.anInterface25Array1 = new Interface25[16];
				for (@Pc(90) int local90 = 0; local90 < 16; local90++) {
					@Pc(102) byte[] local102 = Static44.method754(Static281.anObject3, local90 * 128 * 256);
					this.anInterface25Array1[local90] = this.aClass126_Sub2_22.method5492(local102, 128, Static191.aClass281_9, 128, true);
				}
				this.anInterface25Array2 = new Interface25[16];
				for (@Pc(125) int local125 = 0; local125 < 16; local125++) {
					@Pc(139) byte[] local139 = Static44.method754(Static544.anObject17, 2 * 128 * 128 * local125);
					this.anInterface25Array2[local125] = this.aClass126_Sub2_22.method5492(local139, 128, Static191.aClass281_9, 128, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(I)Z")
	public boolean method8671() {
		if (this.anInterface19_1 == null) {
			@Pc(31) byte[] local31;
			if (Static627.anObject20 == null) {
				local31 = Static385.method5959(4.0F, 0.6F, 4.0F, new Class61_Sub1(419684), 16.0F, 0.5F);
				Static627.anObject20 = Static434.method6481(local31);
			}
			local31 = Static383.method5945(Static627.anObject20, false);
			@Pc(47) byte[] local47 = new byte[local31.length * 4];
			@Pc(49) int local49 = 0;
			for (@Pc(51) int local51 = 0; local51 < 16; local51++) {
				@Pc(59) int local59 = 128 * 128 * local51;
				@Pc(61) int local61 = local59;
				for (@Pc(63) int local63 = 0; local63 < 128; local63++) {
					@Pc(72) int local72 = local61 + local63 * 128;
					@Pc(82) int local82 = (local63 - 1 & 0x7F) * 128 + local61;
					@Pc(92) int local92 = (local63 + 1 & 0x7F) * 128 + local61;
					for (@Pc(94) int local94 = 0; local94 < 128; local94++) {
						@Pc(114) float local114 = (float) ((local31[local94 + local82] & 0xFF) - (local31[local94 + local92] & 0xFF));
						@Pc(139) float local139 = (float) ((local31[local72 + (local94 - 1 & 0x7F)] & 0xFF) - (local31[(local94 + 1 & 0x7F) + local72] & 0xFF));
						@Pc(154) float local154 = (float) (128.0D / Math.sqrt((double) (local139 * local139 + local114 * local114 + 16384.0F)));
						local47[local49++] = (byte) (int) (local154 * local139 + 127.0F);
						local47[local49++] = (byte) (int) (local154 * 128.0F + 127.0F);
						local47[local49++] = (byte) (int) (local114 * local154 + 127.0F);
						local47[local49++] = local31[local59++];
					}
				}
			}
			this.anInterface19_1 = this.aClass126_Sub2_22.method5531(local47, Static208.aClass281_10);
		}
		return this.anInterface19_1 != null;
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(B)Z")
	public boolean method8675() {
		if (this.aBoolean823) {
			return this.anInterface19_2 != null;
		} else {
			return this.anInterface25Array1 != null;
		}
	}
}
