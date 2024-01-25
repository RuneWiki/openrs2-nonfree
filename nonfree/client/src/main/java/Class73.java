import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class73 {

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "Lclient!ob;")
	public Interface17 anInterface17_1 = null;

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "[Lclient!baa;")
	private Interface2[] anInterface2Array1 = null;

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "[Lclient!baa;")
	public Interface2[] anInterface2Array2 = null;

	@OriginalMember(owner = "client!eb", name = "j", descriptor = "Lclient!ob;")
	public Interface17 anInterface17_2 = null;

	@OriginalMember(owner = "client!eb", name = "l", descriptor = "Lclient!bm;")
	private final Class33_Sub1 aClass33_Sub1_4;

	@OriginalMember(owner = "client!eb", name = "i", descriptor = "Z")
	public boolean aBoolean236;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lclient!bm;)V")
	public Class73(@OriginalArg(0) Class33_Sub1 arg0) {
		this.aClass33_Sub1_4 = arg0;
		this.aBoolean236 = this.aClass33_Sub1_4.aBoolean176;
		if (this.aBoolean236 && !this.aClass33_Sub1_4.method2017(Static201.aClass82_6, Static137.aClass89_8)) {
			this.aBoolean236 = false;
		}
		if (this.aBoolean236 || this.aClass33_Sub1_4.method2007(Static137.aClass89_8, Static201.aClass82_6)) {
			Static426.method6557();
			if (this.aBoolean236) {
				@Pc(130) byte[] local130 = Static530.method7538(Static392.anObject15, false);
				this.anInterface17_2 = this.aClass33_Sub1_4.method2009(Static201.aClass82_6, local130);
				@Pc(146) byte[] local146 = Static530.method7538(Static482.anObject16, false);
				this.aClass33_Sub1_4.method2009(Static201.aClass82_6, local146);
			} else {
				this.anInterface2Array2 = new Interface2[16];
				for (@Pc(58) int local58 = 0; local58 < 16; local58++) {
					@Pc(70) byte[] local70 = Static106.method2588(local58 * 128 * 256, Static392.anObject15);
					this.anInterface2Array2[local58] = this.aClass33_Sub1_4.method1992(128, 128, local70, true, Static201.aClass82_6);
				}
				this.anInterface2Array1 = new Interface2[16];
				for (@Pc(93) int local93 = 0; local93 < 16; local93++) {
					@Pc(107) byte[] local107 = Static106.method2588(2 * 128 * local93 * 128, Static482.anObject16);
					this.anInterface2Array1[local93] = this.aClass33_Sub1_4.method1992(128, 128, local107, true, Static201.aClass82_6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)Z")
	public boolean method2711() {
		if (this.anInterface17_1 == null) {
			@Pc(32) byte[] local32;
			if (Static36.anObject1 == null) {
				local32 = Static191.method3804(0.5F, 16.0F, 0.6F, 4.0F, 4.0F, new Class134_Sub1(419684));
				Static36.anObject1 = Static368.method5897(local32);
			}
			local32 = Static530.method7538(Static36.anObject1, false);
			@Pc(48) byte[] local48 = new byte[local32.length * 4];
			@Pc(50) int local50 = 0;
			for (@Pc(52) int local52 = 0; local52 < 16; local52++) {
				@Pc(58) int local58 = local52 * 16384;
				@Pc(60) int local60 = local58;
				for (@Pc(62) int local62 = 0; local62 < 128; local62++) {
					@Pc(70) int local70 = local62 * 128 + local60;
					@Pc(80) int local80 = local60 + (local62 - 1 & 0x7F) * 128;
					@Pc(90) int local90 = (local62 + 1 & 0x7F) * 128 + local60;
					for (@Pc(92) int local92 = 0; local92 < 128; local92++) {
						@Pc(112) float local112 = (float) ((local32[local92 + local80] & 0xFF) - (local32[local90 + local92] & 0xFF));
						@Pc(138) float local138 = (float) ((local32[(local92 - 1 & 0x7F) + local70] & 0xFF) - (local32[local70 + (local92 + 1 & 0x7F)] & 0xFF));
						@Pc(153) float local153 = (float) (128.0D / Math.sqrt((double) (local112 * local112 + local138 * local138 + 16384.0F)));
						local48[local50++] = (byte) (local153 * local138 + 127.0F);
						local48[local50++] = (byte) (local153 * 128.0F + 127.0F);
						local48[local50++] = (byte) (local153 * local112 + 127.0F);
						local48[local50++] = local32[local58++];
					}
				}
			}
			this.anInterface17_1 = this.aClass33_Sub1_4.method2009(Static333.aClass82_9, local48);
		}
		return this.anInterface17_1 != null;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)Z")
	public boolean method2713() {
		if (this.aBoolean236) {
			return this.anInterface17_2 != null;
		} else {
			return this.anInterface2Array2 != null;
		}
	}
}
