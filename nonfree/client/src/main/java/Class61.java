import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cda")
public final class Class61 {

	@OriginalMember(owner = "client!cda", name = "g", descriptor = "[Lclient!wp;")
	private Interface26[] anInterface26Array1 = null;

	@OriginalMember(owner = "client!cda", name = "l", descriptor = "Lclient!oea;")
	public Interface19 anInterface19_1 = null;

	@OriginalMember(owner = "client!cda", name = "h", descriptor = "[Lclient!wp;")
	public Interface26[] anInterface26Array2 = null;

	@OriginalMember(owner = "client!cda", name = "j", descriptor = "Lclient!oea;")
	public Interface19 anInterface19_2 = null;

	@OriginalMember(owner = "client!cda", name = "n", descriptor = "Lclient!kd;")
	private final Class57_Sub3 aClass57_Sub3_4;

	@OriginalMember(owner = "client!cda", name = "i", descriptor = "Z")
	public boolean aBoolean95;

	@OriginalMember(owner = "client!cda", name = "<init>", descriptor = "(Lclient!kd;)V")
	public Class61(@OriginalArg(0) Class57_Sub3 arg0) {
		this.aClass57_Sub3_4 = arg0;
		this.aBoolean95 = this.aClass57_Sub3_4.aBoolean687;
		if (this.aBoolean95 && !this.aClass57_Sub3_4.method7744(Static560.aClass114_18, Static453.aClass278_13)) {
			this.aBoolean95 = false;
		}
		if (this.aBoolean95 || this.aClass57_Sub3_4.method7844(Static453.aClass278_13, Static560.aClass114_18)) {
			Static276.method4067();
			if (this.aBoolean95) {
				@Pc(144) byte[] local144 = Static355.method5319(false, Static138.anObject3);
				this.anInterface19_1 = this.aClass57_Sub3_4.method7868(local144, Static560.aClass114_18);
				@Pc(160) byte[] local160 = Static355.method5319(false, Static215.anObject5);
				this.aClass57_Sub3_4.method7868(local160, Static560.aClass114_18);
			} else {
				this.anInterface26Array2 = new Interface26[16];
				for (@Pc(63) int local63 = 0; local63 < 16; local63++) {
					@Pc(79) byte[] local79 = Static556.method8031(local63 * 128 * 128 * 2, Static138.anObject3);
					this.anInterface26Array2[local63] = this.aClass57_Sub3_4.method7788(true, Static560.aClass114_18, 128, local79, 128);
				}
				this.anInterface26Array1 = new Interface26[16];
				for (@Pc(106) int local106 = 0; local106 < 16; local106++) {
					@Pc(120) byte[] local120 = Static556.method8031(2 * 128 * local106 * 128, Static215.anObject5);
					this.anInterface26Array1[local106] = this.aClass57_Sub3_4.method7788(true, Static560.aClass114_18, 128, local120, 128);
				}
			}
		}
	}

	@OriginalMember(owner = "client!cda", name = "d", descriptor = "(I)Z")
	public boolean method1091() {
		if (this.anInterface19_2 == null) {
			@Pc(24) byte[] local24;
			if (Static62.anObject2 == null) {
				local24 = Static148.method2089(4.0F, 0.5F, 16.0F, 4.0F, 0.6F, new Class186_Sub1(419684));
				Static62.anObject2 = Static631.method8844(local24);
			}
			local24 = Static355.method5319(false, Static62.anObject2);
			@Pc(40) byte[] local40 = new byte[local24.length * 4];
			@Pc(42) int local42 = 0;
			for (@Pc(44) int local44 = 0; local44 < 16; local44++) {
				@Pc(52) int local52 = 128 * 128 * local44;
				@Pc(54) int local54 = local52;
				for (@Pc(56) int local56 = 0; local56 < 128; local56++) {
					@Pc(65) int local65 = local54 + local56 * 128;
					@Pc(75) int local75 = (local56 - 1 & 0x7F) * 128 + local54;
					@Pc(86) int local86 = local54 + (local56 + 1 & 0x7F) * 128;
					for (@Pc(88) int local88 = 0; local88 < 128; local88++) {
						@Pc(107) float local107 = (float) ((local24[local75 + local88] & 0xFF) - (local24[local88 + local86] & 0xFF));
						@Pc(134) float local134 = (float) ((local24[(local88 - 1 & 0x7F) + local65] & 0xFF) - (local24[local65 + (local88 + 1 & 0x7F)] & 0xFF));
						@Pc(149) float local149 = (float) (128.0D / Math.sqrt((double) (local107 * local107 + local134 * local134 + 16384.0F)));
						local40[local42++] = (byte) (int) (local149 * local134 + 127.0F);
						local40[local42++] = (byte) (int) (local149 * 128.0F + 127.0F);
						local40[local42++] = (byte) (int) (local149 * local107 + 127.0F);
						local40[local42++] = local24[local52++];
					}
				}
			}
			this.anInterface19_2 = this.aClass57_Sub3_4.method7868(local40, Static412.aClass114_17);
		}
		return this.anInterface19_2 != null;
	}

	@OriginalMember(owner = "client!cda", name = "b", descriptor = "(I)Z")
	public boolean method1092() {
		if (this.aBoolean95) {
			return this.anInterface19_1 != null;
		} else {
			return this.anInterface26Array2 != null;
		}
	}
}
