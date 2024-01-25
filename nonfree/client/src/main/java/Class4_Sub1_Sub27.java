import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qca")
public final class Class4_Sub1_Sub27 extends Class4_Sub1 {

	@OriginalMember(owner = "client!qca", name = "H", descriptor = "I")
	private int anInt7863 = 16;

	@OriginalMember(owner = "client!qca", name = "J", descriptor = "I")
	private int anInt7865 = 2000;

	@OriginalMember(owner = "client!qca", name = "E", descriptor = "I")
	private int anInt7861 = 4096;

	@OriginalMember(owner = "client!qca", name = "F", descriptor = "I")
	private int anInt7862 = 0;

	@OriginalMember(owner = "client!qca", name = "N", descriptor = "I")
	private int anInt7869 = 0;

	@OriginalMember(owner = "client!qca", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub27() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(I)V")
	@Override
	public void method8391() {
		Static165.method3014();
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(IBLclient!un;)V")
	@Override
	public void method8389(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt7869 = arg1.method4905();
		} else if (arg0 == 1) {
			this.anInt7865 = arg1.method4936();
		} else if (arg0 == 2) {
			this.anInt7863 = arg1.method4905();
		} else if (arg0 == 3) {
			this.anInt7862 = arg1.method4936();
		} else if (arg0 == 4) {
			this.anInt7861 = arg1.method4936();
		}
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8384(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass185_41.method4444(arg0);
		if (super.aClass185_41.aBoolean366) {
			@Pc(28) int local28 = this.anInt7861 >> 1;
			@Pc(33) int[][] local33 = super.aClass185_41.method4443();
			@Pc(40) Random local40 = new Random((long) this.anInt7869);
			for (@Pc(42) int local42 = 0; local42 < this.anInt7865; local42++) {
				@Pc(62) int local62 = this.anInt7861 <= 0 ? this.anInt7862 : this.anInt7862 + Static406.method6391(local40, this.anInt7861) - local28;
				@Pc(68) int local68 = local62 >> 4 & 0xFF;
				@Pc(73) int local73 = Static406.method6391(local40, Static376.anInt7260);
				@Pc(78) int local78 = Static406.method6391(local40, Static477.anInt8774);
				@Pc(90) int local90 = local73 + (Static239.anIntArray474[local68] * this.anInt7863 >> 12);
				@Pc(101) int local101 = (Static569.anIntArray535[local68] * this.anInt7863 >> 12) + local78;
				@Pc(105) int local105 = local101 - local78;
				@Pc(109) int local109 = local90 - local73;
				if (local109 != 0 || local105 != 0) {
					if (local109 < 0) {
						local109 = -local109;
					}
					if (local105 < 0) {
						local105 = -local105;
					}
					@Pc(139) boolean local139 = local105 > local109;
					@Pc(143) int local143;
					@Pc(145) int local145;
					if (local139) {
						local143 = local73;
						local145 = local90;
						local73 = local78;
						local90 = local101;
						local78 = local143;
						local101 = local145;
					}
					if (local90 < local73) {
						local143 = local73;
						local145 = local78;
						local73 = local90;
						local78 = local101;
						local90 = local143;
						local101 = local145;
					}
					local143 = local78;
					local145 = local90 - local73;
					@Pc(179) int local179 = local101 - local78;
					@Pc(184) int local184 = -local145 / 2;
					@Pc(188) int local188 = 2048 / local145;
					@Pc(198) int local198 = 1024 - (Static406.method6391(local40, 4096) >> 2);
					@Pc(205) int local205 = local101 > local78 ? 1 : -1;
					if (local179 < 0) {
						local179 = -local179;
					}
					for (@Pc(212) int local212 = local73; local212 < local90; local212++) {
						@Pc(226) int local226 = local198 + (local212 + -local73) * local188 + 1024;
						@Pc(230) int local230 = Static569.anInt9982 & local212;
						@Pc(234) int local234 = local143 & Static237.anInt4286;
						local184 += local179;
						if (local139) {
							local33[local234][local230] = local226;
						} else {
							local33[local230][local234] = local226;
						}
						if (local184 > 0) {
							local184 += -local145;
							local143 += local205;
						}
					}
				}
			}
		}
		return local11;
	}
}
