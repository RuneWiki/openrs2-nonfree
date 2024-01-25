import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mm")
public final class Class3_Sub2_Sub23 extends Class3_Sub2 {

	@OriginalMember(owner = "client!mm", name = "G", descriptor = "I")
	private int anInt7155 = 16;

	@OriginalMember(owner = "client!mm", name = "F", descriptor = "I")
	private int anInt7157 = 0;

	@OriginalMember(owner = "client!mm", name = "O", descriptor = "I")
	private int anInt7161 = 2000;

	@OriginalMember(owner = "client!mm", name = "D", descriptor = "I")
	private int anInt7163 = 0;

	@OriginalMember(owner = "client!mm", name = "H", descriptor = "I")
	private int anInt7159 = 4096;

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub23() {
		super(0, true);
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(ILclient!rba;I)V")
	@Override
	public void method9214(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub28 arg1) {
		if (arg0 == 0) {
			this.anInt7157 = arg1.method5322(-43);
		} else if (arg0 == 1) {
			this.anInt7161 = arg1.method5272();
		} else if (arg0 == 2) {
			this.anInt7155 = arg1.method5322(-40);
		} else if (arg0 == 3) {
			this.anInt7163 = arg1.method5272();
		} else if (arg0 == 4) {
			this.anInt7159 = arg1.method5272();
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9209(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass293_41.method7200(arg0);
		if (super.aClass293_41.aBoolean641) {
			@Pc(27) int local27 = this.anInt7159 >> 1;
			@Pc(32) int[][] local32 = super.aClass293_41.method7202();
			@Pc(39) Random local39 = new Random((long) this.anInt7157);
			for (@Pc(41) int local41 = 0; local41 < this.anInt7161; local41++) {
				@Pc(67) int local67 = this.anInt7159 > 0 ? this.anInt7163 + Static63.method794(this.anInt7159, local39) - local27 : this.anInt7163;
				@Pc(73) int local73 = local67 >> 4 & 0xFF;
				@Pc(78) int local78 = Static63.method794(Static636.anInt10302, local39);
				@Pc(83) int local83 = Static63.method794(Static443.anInt7682, local39);
				@Pc(94) int local94 = (this.anInt7155 * Static263.anIntArray275[local73] >> 12) + local78;
				@Pc(105) int local105 = local83 + (Static500.anIntArray466[local73] * this.anInt7155 >> 12);
				@Pc(109) int local109 = local105 - local83;
				@Pc(114) int local114 = local94 - local78;
				if (local114 != 0 || local109 != 0) {
					if (local109 < 0) {
						local109 = -local109;
					}
					if (local114 < 0) {
						local114 = -local114;
					}
					@Pc(150) boolean local150 = local109 > local114;
					@Pc(154) int local154;
					@Pc(158) int local158;
					if (local150) {
						local154 = local78;
						local78 = local83;
						local158 = local94;
						local83 = local154;
						local94 = local105;
						local105 = local158;
					}
					if (local94 < local78) {
						local154 = local78;
						local158 = local83;
						local78 = local94;
						local83 = local105;
						local94 = local154;
						local105 = local158;
					}
					local154 = local83;
					local158 = local94 - local78;
					@Pc(194) int local194 = local105 - local83;
					@Pc(199) int local199 = -local158 / 2;
					@Pc(203) int local203 = 2048 / local158;
					@Pc(213) int local213 = 1024 - (Static63.method794(4096, local39) >> 2);
					@Pc(225) int local225 = local83 >= local105 ? -1 : 1;
					if (local194 < 0) {
						local194 = -local194;
					}
					for (@Pc(235) int local235 = local78; local235 < local94; local235++) {
						@Pc(248) int local248 = local213 + (-local78 + local235) * local203 + 1024;
						@Pc(252) int local252 = local235 & Static144.anInt2744;
						@Pc(256) int local256 = local154 & Static599.anInt9773;
						if (local150) {
							local32[local256][local252] = local248;
						} else {
							local32[local252][local256] = local248;
						}
						local199 += local194;
						if (local199 > 0) {
							local199 += -local158;
							local154 += local225;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V")
	@Override
	public void method9205() {
		Static333.method4978();
	}
}
