import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dma")
public final class Class76 {

	@OriginalMember(owner = "client!dma", name = "j", descriptor = "Lclient!bf;")
	public Interface1 anInterface1_1 = null;

	@OriginalMember(owner = "client!dma", name = "f", descriptor = "[Lclient!gp;")
	private Interface6[] anInterface6Array1 = null;

	@OriginalMember(owner = "client!dma", name = "c", descriptor = "[Lclient!gp;")
	public Interface6[] anInterface6Array2 = null;

	@OriginalMember(owner = "client!dma", name = "g", descriptor = "Lclient!bf;")
	public Interface1 anInterface1_2 = null;

	@OriginalMember(owner = "client!dma", name = "l", descriptor = "Lclient!nb;")
	private final Class67_Sub1 aClass67_Sub1_3;

	@OriginalMember(owner = "client!dma", name = "a", descriptor = "Z")
	public boolean aBoolean190;

	@OriginalMember(owner = "client!dma", name = "<init>", descriptor = "(Lclient!nb;)V")
	public Class76(@OriginalArg(0) Class67_Sub1 arg0) {
		this.aClass67_Sub1_3 = arg0;
		this.aBoolean190 = this.aClass67_Sub1_3.aBoolean505;
		if (this.aBoolean190 && !this.aClass67_Sub1_3.method5664(Static349.aClass145_9, Static438.aClass261_14)) {
			this.aBoolean190 = false;
		}
		if (this.aBoolean190 || this.aClass67_Sub1_3.method5563(Static438.aClass261_14, Static349.aClass145_9)) {
			Static87.method1166();
			if (this.aBoolean190) {
				@Pc(140) byte[] local140 = Static543.method7616(Static583.anObject22, false);
				this.anInterface1_1 = this.aClass67_Sub1_3.method5562(Static349.aClass145_9, local140);
				@Pc(156) byte[] local156 = Static543.method7616(Static95.anObject7, false);
				this.aClass67_Sub1_3.method5562(Static349.aClass145_9, local156);
			} else {
				this.anInterface6Array2 = new Interface6[16];
				for (@Pc(63) int local63 = 0; local63 < 16; local63++) {
					@Pc(77) byte[] local77 = Static68.method841(Static583.anObject22, 31054, local63 * 128 * 256, 32768);
					this.anInterface6Array2[local63] = this.aClass67_Sub1_3.method5670(local77, 128, true, Static349.aClass145_9, 128);
				}
				this.anInterface6Array1 = new Interface6[16];
				for (@Pc(104) int local104 = 0; local104 < 16; local104++) {
					@Pc(116) byte[] local116 = Static68.method841(Static95.anObject7, 31054, 2 * 16384 * local104, 32768);
					this.anInterface6Array1[local104] = this.aClass67_Sub1_3.method5670(local116, 128, true, Static349.aClass145_9, 128);
				}
			}
		}
	}

	@OriginalMember(owner = "client!dma", name = "a", descriptor = "(Z)Z")
	public boolean method2072() {
		if (this.aBoolean190) {
			return this.anInterface1_1 != null;
		} else {
			return this.anInterface6Array2 != null;
		}
	}

	@OriginalMember(owner = "client!dma", name = "a", descriptor = "(I)Z")
	public boolean method2073() {
		if (this.anInterface1_2 == null) {
			@Pc(24) byte[] local24;
			if (Static452.anObject20 == null) {
				local24 = Static543.method7618(0.6F, 16.0F, 0.5F, 4.0F, new Class34_Sub1(419684), 4.0F);
				Static452.anObject20 = Static710.method9254(local24);
			}
			local24 = Static543.method7616(Static452.anObject20, false);
			@Pc(44) byte[] local44 = new byte[local24.length * 4];
			@Pc(46) int local46 = 0;
			for (@Pc(48) int local48 = 0; local48 < 16; local48++) {
				@Pc(54) int local54 = local48 * 16384;
				@Pc(56) int local56 = local54;
				for (@Pc(58) int local58 = 0; local58 < 128; local58++) {
					@Pc(67) int local67 = local56 + local58 * 128;
					@Pc(78) int local78 = local56 + (local58 - 1 & 0x7F) * 128;
					@Pc(88) int local88 = (local58 + 1 & 0x7F) * 128 + local56;
					for (@Pc(90) int local90 = 0; local90 < 128; local90++) {
						@Pc(111) float local111 = (float) ((local24[local78 + local90] & 0xFF) - (local24[local90 + local88] & 0xFF));
						@Pc(137) float local137 = (float) ((local24[local67 + (local90 - 1 & 0x7F)] & 0xFF) - (local24[local67 + (local90 + 1 & 0x7F)] & 0xFF));
						@Pc(152) float local152 = (float) (128.0D / Math.sqrt((double) (local111 * local111 + local137 * local137 + 16384.0F)));
						local44[local46++] = (byte) (int) (local152 * local137 + 127.0F);
						local44[local46++] = (byte) (int) (local152 * 128.0F + 127.0F);
						local44[local46++] = (byte) (int) (local111 * local152 + 127.0F);
						local44[local46++] = local24[local54++];
					}
				}
			}
			this.anInterface1_2 = this.aClass67_Sub1_3.method5562(Static557.aClass145_14, local44);
		}
		return this.anInterface1_2 != null;
	}
}
