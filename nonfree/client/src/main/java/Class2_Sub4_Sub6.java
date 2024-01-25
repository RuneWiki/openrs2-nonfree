import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bp")
public final class Class2_Sub4_Sub6 extends Class2_Sub4 {

	@OriginalMember(owner = "client!bp", name = "R", descriptor = "I")
	private int anInt669;

	@OriginalMember(owner = "client!bp", name = "U", descriptor = "I")
	private int anInt670;

	@OriginalMember(owner = "client!bp", name = "Y", descriptor = "[I")
	private int[] anIntArray143;

	@OriginalMember(owner = "client!bp", name = "X", descriptor = "I")
	private int anInt672 = -1;

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub6() {
		super(0, false);
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(B)I")
	@Override
	public int method5590() {
		return this.anInt672;
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(BLclient!kk;I)V")
	@Override
	public void method5601(@OriginalArg(1) Class2_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt672 = arg0.method5312();
		}
	}

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "(BI)[[I")
	@Override
	public int[][] method5594(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass170_41.method3736(arg0);
		if (super.aClass170_41.aBoolean309) {
			@Pc(36) int local36 = (Static193.anInt3629 == this.anInt669 ? arg0 : arg0 * this.anInt669 / Static193.anInt3629) * this.anInt670;
			@Pc(40) int[] local40 = local16[0];
			@Pc(44) int[] local44 = local16[1];
			@Pc(48) int[] local48 = local16[2];
			@Pc(58) int local58;
			@Pc(66) int local66;
			if (this.anInt670 == Static76.anInt1458) {
				for (local58 = 0; local58 < Static76.anInt1458; local58++) {
					local66 = this.anIntArray143[local36++];
					local48[local58] = (local66 & 0xFF) << 4;
					local44[local58] = local66 >> 4 & 0xFF0;
					local40[local58] = local66 >> 12 & 0xFF0;
				}
			} else {
				for (local58 = 0; local58 < Static76.anInt1458; local58++) {
					local66 = this.anInt670 * local58 / Static76.anInt1458;
					@Pc(114) int local114 = this.anIntArray143[local66 + local36];
					local48[local58] = (local114 & 0xFF) << 4;
					local44[local58] = local114 >> 4 & 0xFF0;
					local40[local58] = local114 >> 12 & 0xFF0;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IIB)V")
	@Override
	public void method5592(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.method5592(arg0, arg1);
		if (this.anInt672 >= 0 && Static176.anInterface9_4 != null) {
			@Pc(32) int local32 = Static176.anInterface9_4.method139(this.anInt672).aBoolean249 ? 64 : 128;
			this.anIntArray143 = Static176.anInterface9_4.method143(this.anInt672, local32, local32, false, 1.0F);
			this.anInt670 = local32;
			this.anInt669 = local32;
		}
	}

	@OriginalMember(owner = "client!bp", name = "d", descriptor = "(I)V")
	@Override
	public void method5587() {
		super.method5587();
		this.anIntArray143 = null;
	}
}
