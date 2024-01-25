import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public final class Class11_Sub2_Sub8 extends Class11_Sub2 {

	@OriginalMember(owner = "client!eg", name = "P", descriptor = "I")
	private int anInt1346 = 585;

	static {
		new Class117("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
	}

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "()V")
	public Class11_Sub2_Sub8() {
		super(0, true);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!kh;BI)V")
	@Override
	public void method5711(@OriginalArg(0) Class11_Sub25 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1346 = arg0.method5187();
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method5716(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass124_41.method2853(arg0);
		if (super.aClass124_41.aBoolean221) {
			@Pc(24) int local24 = Static155.anIntArray196[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static339.anInt6549; local26++) {
				@Pc(32) int local32 = Static73.anIntArray91[local26];
				@Pc(71) int local71;
				if (this.anInt1346 < local32 && 4096 - this.anInt1346 > local32 && local24 > 2048 - this.anInt1346 && local24 < this.anInt1346 + 2048) {
					local71 = 2048 - local32;
					local71 = local71 < 0 ? -local71 : local71;
					local71 <<= 0xC;
					local71 /= 2048 - this.anInt1346;
					local11[local26] = 4096 - local71;
				} else if (local32 > 2048 - this.anInt1346 && this.anInt1346 + 2048 > local32) {
					local71 = local24 - 2048;
					local71 = local71 >= 0 ? local71 : -local71;
					local71 -= this.anInt1346;
					local71 <<= 0xC;
					local11[local26] = local71 / (2048 - this.anInt1346);
				} else if (this.anInt1346 > local24 || local24 > 4096 - this.anInt1346) {
					local71 = local32 - 2048;
					@Pc(186) int local186 = local71 >= 0 ? local71 : -local71;
					@Pc(191) int local191 = local186 - this.anInt1346;
					@Pc(195) int local195 = local191 << 12;
					local11[local26] = local195 / (2048 - this.anInt1346);
				} else if (this.anInt1346 <= local32 && local32 <= 4096 - this.anInt1346) {
					local11[local26] = 0;
				} else {
					local71 = 2048 - local24;
					local71 = local71 >= 0 ? local71 : -local71;
					local71 <<= 0xC;
					local71 /= 2048 - this.anInt1346;
					local11[local26] = 4096 - local71;
				}
			}
		}
		return local11;
	}
}
