import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vt")
public final class Class3_Sub4_Sub38 extends Class3_Sub4 {

	@OriginalMember(owner = "client!vt", name = "O", descriptor = "I")
	private int anInt7401 = 4096;

	@OriginalMember(owner = "client!vt", name = "K", descriptor = "I")
	private int anInt7398 = 16;

	@OriginalMember(owner = "client!vt", name = "P", descriptor = "I")
	private int anInt7402 = 2000;

	@OriginalMember(owner = "client!vt", name = "S", descriptor = "I")
	private int anInt7405 = 0;

	@OriginalMember(owner = "client!vt", name = "Z", descriptor = "I")
	private int anInt7410 = 0;

	@OriginalMember(owner = "client!vt", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub38() {
		super(0, true);
	}

	@OriginalMember(owner = "client!vt", name = "e", descriptor = "(I)V")
	@Override
	public void method5963() {
		Static251.method3833();
	}

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5966(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass146_41.method3700(arg0);
		if (super.aClass146_41.aBoolean342) {
			@Pc(25) int local25 = this.anInt7401 >> 1;
			@Pc(30) int[][] local30 = super.aClass146_41.method3701();
			@Pc(37) Random local37 = new Random((long) this.anInt7410);
			for (@Pc(39) int local39 = 0; local39 < this.anInt7402; local39++) {
				@Pc(58) int local58 = this.anInt7401 <= 0 ? this.anInt7405 : this.anInt7405 + Static36.method851(local37, this.anInt7401) - local25;
				@Pc(64) int local64 = local58 >> 4 & 0xFF;
				@Pc(69) int local69 = Static36.method851(local37, Static106.anInt2356);
				@Pc(74) int local74 = Static36.method851(local37, Static340.anInt6286);
				@Pc(85) int local85 = (Static21.anIntArray46[local64] * this.anInt7398 >> 12) + local69;
				@Pc(97) int local97 = local74 + (Static441.anIntArray571[local64] * this.anInt7398 >> 12);
				@Pc(102) int local102 = local97 - local74;
				@Pc(107) int local107 = local85 - local69;
				if (local107 != 0 || local102 != 0) {
					if (local102 < 0) {
						local102 = -local102;
					}
					if (local107 < 0) {
						local107 = -local107;
					}
					@Pc(135) boolean local135 = local102 > local107;
					@Pc(139) int local139;
					@Pc(143) int local143;
					if (local135) {
						local139 = local69;
						local69 = local74;
						local143 = local85;
						local74 = local139;
						local85 = local97;
						local97 = local143;
					}
					if (local85 < local69) {
						local139 = local69;
						local143 = local74;
						local69 = local85;
						local74 = local97;
						local85 = local139;
						local97 = local143;
					}
					local139 = local74;
					local143 = local85 - local69;
					@Pc(180) int local180 = local97 - local74;
					@Pc(185) int local185 = -local143 / 2;
					@Pc(189) int local189 = 2048 / local143;
					@Pc(199) int local199 = 1024 - (Static36.method851(local37, 4096) >> 2);
					@Pc(206) int local206 = local97 > local74 ? 1 : -1;
					if (local180 < 0) {
						local180 = -local180;
					}
					for (@Pc(216) int local216 = local69; local216 < local85; local216++) {
						@Pc(228) int local228 = local189 * (local216 - local69) + local199 + 1024;
						@Pc(232) int local232 = local216 & Static396.anInt6840;
						@Pc(236) int local236 = Static311.anInt5681 & local139;
						local185 += local180;
						if (local135) {
							local30[local236][local232] = local228;
						} else {
							local30[local232][local236] = local228;
						}
						if (local185 > 0) {
							local139 -= -local206;
							local185 += -local143;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(IILclient!bt;)V")
	@Override
	public void method5958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt7410 = arg1.method6053();
		} else if (arg0 == 1) {
			this.anInt7402 = arg1.method6004();
		} else if (arg0 == 2) {
			this.anInt7398 = arg1.method6053();
		} else if (arg0 == 3) {
			this.anInt7405 = arg1.method6004();
		} else if (arg0 == 4) {
			this.anInt7401 = arg1.method6004();
		}
	}
}
