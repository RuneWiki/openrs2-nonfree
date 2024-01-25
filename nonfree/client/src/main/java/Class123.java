import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gaa")
public final class Class123 {

	@OriginalMember(owner = "client!gaa", name = "b", descriptor = "Lclient!or;")
	public Interface20 anInterface20_1 = null;

	@OriginalMember(owner = "client!gaa", name = "c", descriptor = "Lclient!or;")
	public Interface20 anInterface20_2 = null;

	@OriginalMember(owner = "client!gaa", name = "e", descriptor = "[Lclient!fk;")
	public Interface8[] anInterface8Array1 = null;

	@OriginalMember(owner = "client!gaa", name = "j", descriptor = "[Lclient!fk;")
	private Interface8[] anInterface8Array2 = null;

	@OriginalMember(owner = "client!gaa", name = "g", descriptor = "Lclient!ee;")
	private final Class95_Sub1 aClass95_Sub1_8;

	@OriginalMember(owner = "client!gaa", name = "i", descriptor = "Z")
	public boolean aBoolean250;

	@OriginalMember(owner = "client!gaa", name = "<init>", descriptor = "(Lclient!ee;)V")
	public Class123(@OriginalArg(0) Class95_Sub1 arg0) {
		this.aClass95_Sub1_8 = arg0;
		this.aBoolean250 = this.aClass95_Sub1_8.aBoolean693;
		if (this.aBoolean250 && !this.aClass95_Sub1_8.method8206(Static511.aClass122_15, Static666.aClass389_16)) {
			this.aBoolean250 = false;
		}
		if (this.aBoolean250 || this.aClass95_Sub1_8.method8151(Static666.aClass389_16, Static511.aClass122_15)) {
			Static346.method5032();
			if (this.aBoolean250) {
				@Pc(57) byte[] local57 = Static553.method7314(Static414.anObject13, false);
				this.anInterface20_1 = this.aClass95_Sub1_8.method8136(Static511.aClass122_15, local57);
				@Pc(73) byte[] local73 = Static553.method7314(Static138.anObject10, false);
				this.aClass95_Sub1_8.method8136(Static511.aClass122_15, local73);
			} else {
				this.anInterface8Array1 = new Interface8[16];
				for (@Pc(90) int local90 = 0; local90 < 16; local90++) {
					@Pc(100) byte[] local100 = Static98.method397(local90 * 32768, Static414.anObject13);
					this.anInterface8Array1[local90] = this.aClass95_Sub1_8.method8112(128, 128, true, local100, Static511.aClass122_15);
				}
				this.anInterface8Array2 = new Interface8[16];
				for (@Pc(123) int local123 = 0; local123 < 16; local123++) {
					@Pc(135) byte[] local135 = Static98.method397(2 * 16384 * local123, Static138.anObject10);
					this.anInterface8Array2[local123] = this.aClass95_Sub1_8.method8112(128, 128, true, local135, Static511.aClass122_15);
				}
			}
		}
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Z)Z")
	public boolean method2906() {
		if (this.aBoolean250) {
			return this.anInterface20_1 != null;
		} else {
			return this.anInterface8Array1 != null;
		}
	}

	@OriginalMember(owner = "client!gaa", name = "b", descriptor = "(Z)Z")
	public boolean method2907() {
		if (this.anInterface20_2 == null) {
			@Pc(26) byte[] local26;
			if (Static341.anObject12 == null) {
				local26 = Static677.method9022(16.0F, 0.6F, 0.5F, 4.0F, new Class209_Sub1(419684), 4.0F);
				Static341.anObject12 = Static360.method5206(local26);
			}
			local26 = Static553.method7314(Static341.anObject12, false);
			@Pc(42) byte[] local42 = new byte[local26.length * 4];
			@Pc(44) int local44 = 0;
			for (@Pc(46) int local46 = 0; local46 < 16; local46++) {
				@Pc(54) int local54 = 128 * 128 * local46;
				@Pc(56) int local56 = local54;
				for (@Pc(58) int local58 = 0; local58 < 128; local58++) {
					@Pc(67) int local67 = local56 + local58 * 128;
					@Pc(77) int local77 = (local58 - 1 & 0x7F) * 128 + local56;
					@Pc(87) int local87 = local56 + (local58 + 1 & 0x7F) * 128;
					for (@Pc(89) int local89 = 0; local89 < 128; local89++) {
						@Pc(109) float local109 = (float) ((local26[local89 + local77] & 0xFF) - (local26[local87 + local89] & 0xFF));
						@Pc(135) float local135 = (float) ((local26[(local89 - 1 & 0x7F) + local67] & 0xFF) - (local26[local67 + (local89 + 1 & 0x7F)] & 0xFF));
						@Pc(150) float local150 = (float) (128.0D / Math.sqrt((double) (local135 * local135 + local109 * local109 + 16384.0F)));
						local42[local44++] = (byte) (int) (local135 * local150 + 127.0F);
						local42[local44++] = (byte) (int) (local150 * 128.0F + 127.0F);
						local42[local44++] = (byte) (int) (local109 * local150 + 127.0F);
						local42[local44++] = local26[local54++];
					}
				}
			}
			this.anInterface20_2 = this.aClass95_Sub1_8.method8136(Static21.aClass122_14, local42);
		}
		return this.anInterface20_2 != null;
	}
}
