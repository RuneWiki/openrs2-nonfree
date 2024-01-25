import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public final class Class1_Sub3_Sub9 extends Class1_Sub3 {

	@OriginalMember(owner = "client!da", name = "H", descriptor = "I")
	private int anInt1407;

	@OriginalMember(owner = "client!da", name = "J", descriptor = "[I")
	private int[] anIntArray163;

	@OriginalMember(owner = "client!da", name = "Q", descriptor = "I")
	private int anInt1414;

	@OriginalMember(owner = "client!da", name = "P", descriptor = "I")
	private int anInt1413 = -1;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub9() {
		super(0, false);
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(I)V")
	@Override
	public void method7122() {
		super.method7122();
		this.anIntArray163 = null;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILclient!ge;I)V")
	@Override
	public void method7121(@OriginalArg(1) Class1_Sub6 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1413 = arg0.method3967();
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7125(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass225_41.method5319(arg0);
		if (super.aClass225_41.aBoolean456) {
			@Pc(36) int local36 = (this.anInt1407 == Static272.anInt5156 ? arg0 : this.anInt1407 * arg0 / Static272.anInt5156) * this.anInt1414;
			@Pc(40) int[] local40 = local11[0];
			@Pc(44) int[] local44 = local11[1];
			@Pc(48) int[] local48 = local11[2];
			@Pc(58) int local58;
			@Pc(66) int local66;
			if (this.anInt1414 == Static452.anInt7734) {
				for (local58 = 0; local58 < Static452.anInt7734; local58++) {
					local66 = this.anIntArray163[local36++];
					local48[local58] = (local66 & 0xFF) << 4;
					local44[local58] = local66 >> 4 & 0xFF0;
					local40[local58] = local66 >> 12 & 0xFF0;
				}
			} else {
				for (local58 = 0; local58 < Static452.anInt7734; local58++) {
					local66 = this.anInt1414 * local58 / Static452.anInt7734;
					@Pc(114) int local114 = this.anIntArray163[local36 + local66];
					local48[local58] = (local114 & 0xFF) << 4;
					local44[local58] = local114 >> 4 & 0xFF0;
					local40[local58] = local114 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!da", name = "h", descriptor = "(I)I")
	@Override
	public int method7127() {
		return this.anInt1413;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BII)V")
	@Override
	public void method7119(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.method7119(arg0, arg1);
		if (this.anInt1413 >= 0 && Static63.anInterface8_6 != null) {
			@Pc(24) int local24 = Static63.anInterface8_6.method878(this.anInt1413).aBoolean451 ? 64 : 128;
			this.anIntArray163 = Static63.anInterface8_6.method876(this.anInt1413, false, local24, 1.0F, local24);
			this.anInt1414 = local24;
			this.anInt1407 = local24;
		}
	}
}
