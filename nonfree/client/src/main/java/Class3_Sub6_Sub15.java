import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iaa")
public final class Class3_Sub6_Sub15 extends Class3_Sub6 {

	@OriginalMember(owner = "client!iaa", name = "D", descriptor = "I")
	private int anInt3868;

	@OriginalMember(owner = "client!iaa", name = "N", descriptor = "I")
	private int anInt3876;

	@OriginalMember(owner = "client!iaa", name = "O", descriptor = "[I")
	private int[] anIntArray204;

	@OriginalMember(owner = "client!iaa", name = "F", descriptor = "I")
	private int anInt3870 = -1;

	@OriginalMember(owner = "client!iaa", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub15() {
		super(0, false);
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(ILclient!np;I)V")
	@Override
	public void method7771(@OriginalArg(1) Class3_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3870 = arg0.method5198();
		}
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(III)V")
	@Override
	public void method7765(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.method7765(arg0, arg1);
		if (this.anInt3870 >= 0 && Static17.anInterface3_1 != null) {
			@Pc(24) int local24 = Static17.anInterface3_1.method4776(this.anInt3870).aBoolean141 ? 64 : 128;
			this.anIntArray204 = Static17.anInterface3_1.method4779(local24, false, 1.0F, local24, this.anInt3870);
			this.anInt3868 = local24;
			this.anInt3876 = local24;
		}
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(Z)I")
	@Override
	public int method7766() {
		return this.anInt3870;
	}

	@OriginalMember(owner = "client!iaa", name = "b", descriptor = "(Z)V")
	@Override
	public void method7770() {
		super.method7770();
		this.anIntArray204 = null;
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method7776(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass155_41.method3666(arg0);
		if (super.aClass155_41.aBoolean306) {
			@Pc(43) int local43 = (this.anInt3876 == Static522.anInt8394 ? arg0 : this.anInt3876 * arg0 / Static522.anInt8394) * this.anInt3868;
			@Pc(47) int[] local47 = local19[0];
			@Pc(51) int[] local51 = local19[1];
			@Pc(55) int[] local55 = local19[2];
			@Pc(61) int local61;
			@Pc(70) int local70;
			if (Static521.anInt8383 == this.anInt3868) {
				for (local61 = 0; local61 < Static521.anInt8383; local61++) {
					local70 = this.anIntArray204[local43++];
					local55[local61] = (local70 & 0xFF) << 4;
					local51[local61] = local70 >> 4 & 0xFF0;
					local47[local61] = local70 >> 12 & 0xFF0;
				}
			} else {
				for (local61 = 0; local61 < Static521.anInt8383; local61++) {
					local70 = local61 * this.anInt3868 / Static521.anInt8383;
					@Pc(78) int local78 = this.anIntArray204[local43 + local70];
					local55[local61] = (local78 & 0xFF) << 4;
					local51[local61] = local78 >> 4 & 0xFF0;
					local47[local61] = local78 >> 12 & 0xFF0;
				}
			}
		}
		return local19;
	}
}
