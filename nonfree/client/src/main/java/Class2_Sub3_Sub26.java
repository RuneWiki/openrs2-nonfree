import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class2_Sub3_Sub26 extends Class2_Sub3 {

	@OriginalMember(owner = "client!qb", name = "H", descriptor = "[I")
	private int[] anIntArray424;

	@OriginalMember(owner = "client!qb", name = "T", descriptor = "I")
	private int anInt5454;

	@OriginalMember(owner = "client!qb", name = "V", descriptor = "I")
	private int anInt5456;

	@OriginalMember(owner = "client!qb", name = "K", descriptor = "I")
	private int anInt5448 = -1;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub26() {
		super(0, false);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IILclient!ef;)V")
	@Override
	public void method5704(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt5448 = arg1.method3104();
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z)I")
	@Override
	public int method5706() {
		return this.anInt5448;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(III)V")
	@Override
	public void method5698(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.method5698(arg0, arg1);
		if (this.anInt5448 >= 0 && Static166.anInterface3_4 != null) {
			@Pc(29) int local29 = Static166.anInterface3_4.method166(this.anInt5448).aBoolean249 ? 64 : 128;
			this.anIntArray424 = Static166.anInterface3_4.method165(local29, false, local29, 1.0F, this.anInt5448);
			this.anInt5456 = local29;
			this.anInt5454 = local29;
		}
	}

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "(I)V")
	@Override
	public void method5705() {
		super.method5705();
		this.anIntArray424 = null;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5702(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass90_41.method2391(arg0);
		if (super.aClass90_41.aBoolean257) {
			@Pc(40) int local40 = this.anInt5456 * (Static363.anInt6995 == this.anInt5454 ? arg0 : arg0 * this.anInt5454 / Static363.anInt6995);
			@Pc(44) int[] local44 = local16[0];
			@Pc(48) int[] local48 = local16[1];
			@Pc(52) int[] local52 = local16[2];
			@Pc(58) int local58;
			@Pc(66) int local66;
			if (this.anInt5456 == Static263.anInt5504) {
				for (local58 = 0; local58 < Static263.anInt5504; local58++) {
					local66 = this.anIntArray424[local40++];
					local52[local58] = (local66 & 0xFF) << 4;
					local48[local58] = local66 >> 4 & 0xFF0;
					local44[local58] = local66 >> 12 & 0xFF0;
				}
			} else {
				for (local58 = 0; local58 < Static263.anInt5504; local58++) {
					local66 = local58 * this.anInt5456 / Static263.anInt5504;
					@Pc(119) int local119 = this.anIntArray424[local40 + local66];
					local52[local58] = (local119 & 0xFF) << 4;
					local48[local58] = local119 >> 4 & 0xFF0;
					local44[local58] = local119 >> 12 & 0xFF0;
				}
			}
		}
		return local16;
	}
}
