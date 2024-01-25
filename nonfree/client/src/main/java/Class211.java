import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mt")
public final class Class211 {

	@OriginalMember(owner = "client!mt", name = "g", descriptor = "Lclient!ff;")
	public Interface11 anInterface11_2 = null;

	@OriginalMember(owner = "client!mt", name = "j", descriptor = "[Lclient!js;")
	public Interface15[] anInterface15Array1 = null;

	@OriginalMember(owner = "client!mt", name = "d", descriptor = "Lclient!ff;")
	public Interface11 anInterface11_1 = null;

	@OriginalMember(owner = "client!mt", name = "m", descriptor = "[Lclient!js;")
	private Interface15[] anInterface15Array2 = null;

	@OriginalMember(owner = "client!mt", name = "l", descriptor = "Lclient!uv;")
	private final Class5_Sub2 aClass5_Sub2_16;

	@OriginalMember(owner = "client!mt", name = "h", descriptor = "Z")
	public boolean aBoolean554;

	@OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(Lclient!uv;)V")
	public Class211(@OriginalArg(0) Class5_Sub2 arg0) {
		this.aClass5_Sub2_16 = arg0;
		this.aBoolean554 = this.aClass5_Sub2_16.aBoolean386;
		if (this.aBoolean554 && !this.aClass5_Sub2_16.method3980(Static302.aClass176_8, Static137.aClass178_5)) {
			this.aBoolean554 = false;
		}
		if (this.aBoolean554 || this.aClass5_Sub2_16.method3945(Static137.aClass178_5, Static302.aClass176_8)) {
			Static462.method6944();
			if (this.aBoolean554) {
				@Pc(132) byte[] local132 = Static56.method1712(Static427.anObject17, false);
				this.anInterface11_1 = this.aClass5_Sub2_16.method4047(Static137.aClass178_5, local132);
				@Pc(148) byte[] local148 = Static56.method1712(Static570.anObject20, false);
				this.aClass5_Sub2_16.method4047(Static137.aClass178_5, local148);
			} else {
				this.anInterface15Array1 = new Interface15[16];
				for (@Pc(58) int local58 = 0; local58 < 16; local58++) {
					@Pc(72) byte[] local72 = Static337.method5604(2 * 128 * local58 * 128, Static427.anObject17);
					this.anInterface15Array1[local58] = this.aClass5_Sub2_16.method4056(128, Static137.aClass178_5, local72, true, 128);
				}
				this.anInterface15Array2 = new Interface15[16];
				for (@Pc(97) int local97 = 0; local97 < 16; local97++) {
					@Pc(109) byte[] local109 = Static337.method5604(local97 * 16384 * 2, Static570.anObject20);
					this.anInterface15Array2[local97] = this.aClass5_Sub2_16.method4056(128, Static137.aClass178_5, local109, true, 128);
				}
			}
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(I)Z")
	public boolean method5816() {
		if (this.aBoolean554) {
			return this.anInterface11_1 != null;
		} else {
			return this.anInterface15Array1 != null;
		}
	}

	@OriginalMember(owner = "client!mt", name = "d", descriptor = "(I)Z")
	public boolean method5821() {
		if (this.anInterface11_2 == null) {
			@Pc(34) byte[] local34;
			if (Static407.anObject16 == null) {
				local34 = Static362.method5841(16.0F, 0.5F, 0.6F, new Class53_Sub1(419684), 4.0F, 4.0F);
				Static407.anObject16 = Static591.method8149(local34);
			}
			local34 = Static56.method1712(Static407.anObject16, false);
			@Pc(50) byte[] local50 = new byte[local34.length * 4];
			@Pc(52) int local52 = 0;
			for (@Pc(54) int local54 = 0; local54 < 16; local54++) {
				@Pc(62) int local62 = local54 * 128 * 128;
				@Pc(64) int local64 = local62;
				for (@Pc(66) int local66 = 0; local66 < 128; local66++) {
					@Pc(74) int local74 = local64 + local66 * 128;
					@Pc(85) int local85 = local64 + (local66 - 1 & 0x7F) * 128;
					@Pc(95) int local95 = local64 + (local66 + 1 & 0x7F) * 128;
					for (@Pc(97) int local97 = 0; local97 < 128; local97++) {
						@Pc(116) float local116 = (float) ((local34[local97 + local85] & 0xFF) - (local34[local95 + local97] & 0xFF));
						@Pc(141) float local141 = (float) ((local34[(local97 - 1 & 0x7F) + local74] & 0xFF) - (local34[(local97 + 1 & 0x7F) + local74] & 0xFF));
						@Pc(156) float local156 = (float) (128.0D / Math.sqrt((double) (local116 * local116 + local141 * local141 + 16384.0F)));
						local50[local52++] = (byte) (int) (local141 * local156 + 127.0F);
						local50[local52++] = (byte) (int) (local156 * 128.0F + 127.0F);
						local50[local52++] = (byte) (int) (local156 * local116 + 127.0F);
						local50[local52++] = local34[local62++];
					}
				}
			}
			this.anInterface11_2 = this.aClass5_Sub2_16.method4047(Static120.aClass178_4, local50);
		}
		return this.anInterface11_2 != null;
	}
}
