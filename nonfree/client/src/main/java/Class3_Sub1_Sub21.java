import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class3_Sub1_Sub21 extends Class3_Sub1 {

	@OriginalMember(owner = "client!kc", name = "O", descriptor = "I")
	private int anInt3208 = 585;

	static {
		new Class57("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
	}

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub21() {
		super(0, true);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!rp;BI)V")
	@Override
	public void method5545(@OriginalArg(0) Class3_Sub5 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3208 = arg0.method2767();
		}
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5550(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass4_41.method61(arg0);
		if (super.aClass4_41.aBoolean7) {
			@Pc(24) int local24 = Static351.anIntArray371[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static238.anInt4221; local26++) {
				@Pc(32) int local32 = Static187.anIntArray379[local26];
				@Pc(70) int local70;
				if (local32 > this.anInt3208 && local32 < 4096 - this.anInt3208 && local24 > 2048 - this.anInt3208 && this.anInt3208 + 2048 > local24) {
					local70 = 2048 - local32;
					local70 = local70 >= 0 ? local70 : -local70;
					local70 <<= 0xC;
					local70 /= 2048 - this.anInt3208;
					local11[local26] = 4096 - local70;
				} else if (2048 - this.anInt3208 < local32 && local32 < this.anInt3208 + 2048) {
					local70 = local24 - 2048;
					local70 = local70 < 0 ? -local70 : local70;
					local70 -= this.anInt3208;
					local70 <<= 0xC;
					local11[local26] = local70 / (2048 - this.anInt3208);
				} else if (this.anInt3208 > local24 || 4096 - this.anInt3208 < local24) {
					local70 = local32 - 2048;
					@Pc(175) int local175 = local70 >= 0 ? local70 : -local70;
					@Pc(180) int local180 = local175 - this.anInt3208;
					@Pc(184) int local184 = local180 << 12;
					local11[local26] = local184 / (2048 - this.anInt3208);
				} else if (local32 >= this.anInt3208 && 4096 - this.anInt3208 >= local32) {
					local11[local26] = 0;
				} else {
					local70 = 2048 - local24;
					local70 = local70 < 0 ? -local70 : local70;
					local70 <<= 0xC;
					local70 /= 2048 - this.anInt3208;
					local11[local26] = 4096 - local70;
				}
			}
		}
		return local11;
	}
}
