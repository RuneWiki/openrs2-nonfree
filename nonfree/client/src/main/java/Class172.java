import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class172 {

	@OriginalMember(owner = "client!ic", name = "j", descriptor = "[Lclient!pt;")
	private Interface16[] anInterface16Array1 = null;

	@OriginalMember(owner = "client!ic", name = "i", descriptor = "Lclient!rm;")
	public Interface19 anInterface19_1 = null;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "Lclient!rm;")
	public Interface19 anInterface19_2 = null;

	@OriginalMember(owner = "client!ic", name = "m", descriptor = "[Lclient!pt;")
	public Interface16[] anInterface16Array2 = null;

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "Lclient!jca;")
	private final Class22_Sub2 aClass22_Sub2_9;

	@OriginalMember(owner = "client!ic", name = "n", descriptor = "Z")
	public boolean aBoolean278;

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Lclient!jca;)V")
	public Class172(@OriginalArg(0) Class22_Sub2 arg0) {
		this.aClass22_Sub2_9 = arg0;
		this.aBoolean278 = this.aClass22_Sub2_9.aBoolean700;
		if (this.aBoolean278 && !this.aClass22_Sub2_9.method8895(Static109.aClass335_4, Static259.aClass167_7)) {
			this.aBoolean278 = false;
		}
		if (this.aBoolean278 || this.aClass22_Sub2_9.method8953(Static259.aClass167_7, Static109.aClass335_4)) {
			Static292.method4055();
			if (this.aBoolean278) {
				@Pc(62) byte[] local62 = Static601.method7729(false, Static26.anObject2);
				this.anInterface19_1 = this.aClass22_Sub2_9.method8850(local62, Static109.aClass335_4);
				@Pc(78) byte[] local78 = Static601.method7729(false, Static25.anObject1);
				this.aClass22_Sub2_9.method8850(local78, Static109.aClass335_4);
			} else {
				this.anInterface16Array2 = new Interface16[16];
				for (@Pc(95) int local95 = 0; local95 < 16; local95++) {
					@Pc(111) byte[] local111 = Static40.method1149(local95 * 128 * 128 * 2, Static26.anObject2);
					this.anInterface16Array2[local95] = this.aClass22_Sub2_9.method8934(128, 128, Static109.aClass335_4, local111, true);
				}
				this.anInterface16Array1 = new Interface16[16];
				for (@Pc(138) int local138 = 0; local138 < 16; local138++) {
					@Pc(152) byte[] local152 = Static40.method1149(local138 * 2 * 128 * 128, Static25.anObject1);
					this.anInterface16Array1[local138] = this.aClass22_Sub2_9.method8934(128, 128, Static109.aClass335_4, local152, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)Z")
	public boolean method3804() {
		if (this.aBoolean278) {
			return this.anInterface19_1 != null;
		} else {
			return this.anInterface16Array2 != null;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)Z")
	public boolean method3807() {
		if (this.anInterface19_2 == null) {
			@Pc(24) byte[] local24;
			if (Static104.anObject6 == null) {
				local24 = Static196.method3481(0.5F, 4.0F, 4.0F, 16.0F, 0.6F, new Class75_Sub1(419684));
				Static104.anObject6 = Static508.method6908(local24);
			}
			local24 = Static601.method7729(false, Static104.anObject6);
			@Pc(40) byte[] local40 = new byte[local24.length * 4];
			@Pc(42) int local42 = 0;
			for (@Pc(44) int local44 = 0; local44 < 16; local44++) {
				@Pc(52) int local52 = 128 * 128 * local44;
				@Pc(54) int local54 = local52;
				for (@Pc(56) int local56 = 0; local56 < 128; local56++) {
					@Pc(64) int local64 = local56 * 128 + local54;
					@Pc(74) int local74 = (local56 - 1 & 0x7F) * 128 + local54;
					@Pc(84) int local84 = local54 + (local56 + 1 & 0x7F) * 128;
					for (@Pc(86) int local86 = 0; local86 < 128; local86++) {
						@Pc(106) float local106 = (float) ((local24[local86 + local74] & 0xFF) - (local24[local86 + local84] & 0xFF));
						@Pc(133) float local133 = (float) ((local24[local64 + (local86 - 1 & 0x7F)] & 0xFF) - (local24[local64 + (local86 + 1 & 0x7F)] & 0xFF));
						@Pc(148) float local148 = (float) (128.0D / Math.sqrt((double) (local106 * local106 + local133 * local133 + 16384.0F)));
						local40[local42++] = (byte) (int) (local148 * local133 + 127.0F);
						local40[local42++] = (byte) (int) (local148 * 128.0F + 127.0F);
						local40[local42++] = (byte) (int) (local106 * local148 + 127.0F);
						local40[local42++] = local24[local52++];
					}
				}
			}
			this.anInterface19_2 = this.aClass22_Sub2_9.method8850(local40, Static646.aClass335_14);
		}
		return this.anInterface19_2 != null;
	}
}
