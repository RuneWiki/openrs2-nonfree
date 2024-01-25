import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ap")
public final class Class5_Sub2_Sub2 extends Class5_Sub2 {

	@OriginalMember(owner = "client!ap", name = "E", descriptor = "I")
	private int anInt319 = 2000;

	@OriginalMember(owner = "client!ap", name = "G", descriptor = "I")
	private int anInt320 = 16;

	@OriginalMember(owner = "client!ap", name = "J", descriptor = "I")
	private int anInt322 = 4096;

	@OriginalMember(owner = "client!ap", name = "D", descriptor = "I")
	private int anInt318 = 0;

	@OriginalMember(owner = "client!ap", name = "O", descriptor = "I")
	private int anInt326 = 0;

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub2() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "(I)V")
	@Override
	public void method9044() {
		Static528.method7829();
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(ILclient!ofa;I)V")
	@Override
	public void method9040(@OriginalArg(1) Class5_Sub22 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt318 = arg0.method5966();
		} else if (arg1 == 1) {
			this.anInt319 = arg0.method5968();
		} else if (arg1 == 2) {
			this.anInt320 = arg0.method5966();
		} else if (arg1 == 3) {
			this.anInt326 = arg0.method5968();
		} else if (arg1 == 4) {
			this.anInt322 = arg0.method5968();
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method9034(@OriginalArg(0) int arg0) {
		@Pc(18) int[] local18 = super.aClass379_41.method9012(arg0);
		if (super.aClass379_41.aBoolean761) {
			@Pc(27) int local27 = this.anInt322 >> 1;
			@Pc(32) int[][] local32 = super.aClass379_41.method9009();
			@Pc(39) Random local39 = new Random((long) this.anInt318);
			for (@Pc(41) int local41 = 0; local41 < this.anInt319; local41++) {
				@Pc(63) int local63 = this.anInt322 <= 0 ? this.anInt326 : this.anInt326 + Static130.method1947(this.anInt322, local39) - local27;
				@Pc(69) int local69 = local63 >> 4 & 0xFF;
				@Pc(74) int local74 = Static130.method1947(Static597.anInt10025, local39);
				@Pc(79) int local79 = Static130.method1947(Static591.anInt9907, local39);
				@Pc(91) int local91 = local74 + (this.anInt320 * Static556.anIntArray515[local69] >> 12);
				@Pc(102) int local102 = (this.anInt320 * Static214.anIntArray205[local69] >> 12) + local79;
				@Pc(106) int local106 = local102 - local79;
				@Pc(111) int local111 = local91 - local74;
				if (local111 != 0 || local106 != 0) {
					if (local111 < 0) {
						local111 = -local111;
					}
					if (local106 < 0) {
						local106 = -local106;
					}
					@Pc(138) boolean local138 = local106 > local111;
					@Pc(142) int local142;
					@Pc(146) int local146;
					if (local138) {
						local142 = local74;
						local74 = local79;
						local146 = local91;
						local79 = local142;
						local91 = local102;
						local102 = local146;
					}
					if (local74 > local91) {
						local142 = local74;
						local146 = local79;
						local74 = local91;
						local79 = local102;
						local91 = local142;
						local102 = local146;
					}
					local142 = local79;
					local146 = local91 - local74;
					@Pc(179) int local179 = local102 - local79;
					@Pc(184) int local184 = -local146 / 2;
					@Pc(188) int local188 = 2048 / local146;
					@Pc(198) int local198 = 1024 - (Static130.method1947(4096, local39) >> 2);
					if (local179 < 0) {
						local179 = -local179;
					}
					@Pc(217) int local217 = local102 <= local79 ? -1 : 1;
					for (@Pc(219) int local219 = local74; local219 < local91; local219++) {
						@Pc(232) int local232 = local198 + local188 * (-local74 + local219) + 1024;
						@Pc(236) int local236 = Static28.anInt365 & local219;
						@Pc(240) int local240 = Static273.anInt4903 & local142;
						local184 += local179;
						if (local138) {
							local32[local240][local236] = local232;
						} else {
							local32[local236][local240] = local232;
						}
						if (local184 > 0) {
							local184 += -local146;
							local142 -= -local217;
						}
					}
				}
			}
		}
		return local18;
	}
}
