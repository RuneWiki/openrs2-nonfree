import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vn")
public final class Class2_Sub11_Sub36 extends Class2_Sub11 {

	@OriginalMember(owner = "client!vn", name = "O", descriptor = "I")
	private int anInt10578 = 16;

	@OriginalMember(owner = "client!vn", name = "J", descriptor = "I")
	private int anInt10577 = 0;

	@OriginalMember(owner = "client!vn", name = "I", descriptor = "I")
	private int anInt10579 = 0;

	@OriginalMember(owner = "client!vn", name = "K", descriptor = "I")
	private int anInt10576 = 4096;

	@OriginalMember(owner = "client!vn", name = "F", descriptor = "I")
	private int anInt10581 = 2000;

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "()V")
	public Class2_Sub11_Sub36() {
		super(0, true);
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(ILclient!et;Z)V")
	@Override
	public void method9532(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt10579 = arg1.method8581(-17416);
		} else if (arg0 == 1) {
			this.anInt10581 = arg1.method8575();
		} else if (arg0 == 2) {
			this.anInt10578 = arg1.method8581(-17416);
		} else if (arg0 == 3) {
			this.anInt10577 = arg1.method8575();
		} else if (arg0 == 4) {
			this.anInt10576 = arg1.method8575();
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9531(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass174_41.method3748(arg0, 1);
		if (super.aClass174_41.aBoolean369) {
			@Pc(30) int local30 = this.anInt10576 >> 1;
			@Pc(35) int[][] local35 = super.aClass174_41.method3749();
			@Pc(42) Random local42 = new Random((long) this.anInt10579);
			for (@Pc(44) int local44 = 0; local44 < this.anInt10581; local44++) {
				@Pc(67) int local67 = this.anInt10576 <= 0 ? this.anInt10577 : this.anInt10577 + Static289.method4068(this.anInt10576, local42) - local30;
				@Pc(73) int local73 = local67 >> 4 & 0xFF;
				@Pc(78) int local78 = Static289.method4068(Static301.anInt10214, local42);
				@Pc(83) int local83 = Static289.method4068(Static609.anInt9448, local42);
				@Pc(94) int local94 = (this.anInt10578 * Static519.anIntArray590[local73] >> 12) + local78;
				@Pc(106) int local106 = local83 + (Static611.anIntArray688[local73] * this.anInt10578 >> 12);
				@Pc(111) int local111 = local106 - local83;
				@Pc(116) int local116 = local94 - local78;
				if (local116 != 0 || local111 != 0) {
					if (local116 < 0) {
						local116 = -local116;
					}
					if (local111 < 0) {
						local111 = -local111;
					}
					@Pc(148) boolean local148 = local116 < local111;
					@Pc(152) int local152;
					@Pc(156) int local156;
					if (local148) {
						local152 = local78;
						local78 = local83;
						local156 = local94;
						local94 = local106;
						local83 = local152;
						local106 = local156;
					}
					if (local94 < local78) {
						local152 = local78;
						local78 = local94;
						local156 = local83;
						local83 = local106;
						local94 = local152;
						local106 = local156;
					}
					local152 = local83;
					local156 = local94 - local78;
					@Pc(189) int local189 = local106 - local83;
					@Pc(194) int local194 = -local156 / 2;
					@Pc(198) int local198 = 2048 / local156;
					@Pc(208) int local208 = 1024 - (Static289.method4068(4096, local42) >> 2);
					@Pc(216) int local216 = local83 >= local106 ? -1 : 1;
					if (local189 < 0) {
						local189 = -local189;
					}
					for (@Pc(226) int local226 = local78; local226 < local94; local226++) {
						@Pc(240) int local240 = local208 + (local226 - local78) * local198 + 1024;
						@Pc(244) int local244 = local226 & Static78.anInt1356;
						@Pc(248) int local248 = Static332.anInt5074 & local152;
						if (local148) {
							local35[local248][local244] = local240;
						} else {
							local35[local244][local248] = local240;
						}
						local194 += local189;
						if (local194 > 0) {
							local152 += local216;
							local194 += -local156;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(B)V")
	@Override
	public void method9530() {
		Static652.method8957();
	}
}
