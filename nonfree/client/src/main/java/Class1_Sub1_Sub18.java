import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class1_Sub1_Sub18 extends Class1_Sub1 {

	@OriginalMember(owner = "client!kb", name = "K", descriptor = "I")
	private int anInt4805 = 0;

	@OriginalMember(owner = "client!kb", name = "C", descriptor = "I")
	private int anInt4800 = 2000;

	@OriginalMember(owner = "client!kb", name = "N", descriptor = "I")
	private int anInt4808 = 16;

	@OriginalMember(owner = "client!kb", name = "M", descriptor = "I")
	private int anInt4807 = 0;

	@OriginalMember(owner = "client!kb", name = "I", descriptor = "I")
	private int anInt4803 = 4096;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub18() {
		super(0, true);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
	@Override
	public void method7885() {
		Static316.method4803();
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILclient!io;I)V")
	@Override
	public void method7881(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt4805 = arg1.method4393();
		} else if (arg0 == 1) {
			this.anInt4800 = arg1.method4426();
		} else if (arg0 == 2) {
			this.anInt4808 = arg1.method4393();
		} else if (arg0 == 3) {
			this.anInt4807 = arg1.method4426();
		} else if (arg0 == 4) {
			this.anInt4803 = arg1.method4426();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method7888(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass26_41.method788(arg0);
		if (super.aClass26_41.aBoolean77) {
			@Pc(26) int local26 = this.anInt4803 >> 1;
			@Pc(31) int[][] local31 = super.aClass26_41.method789();
			@Pc(38) Random local38 = new Random((long) this.anInt4805);
			for (@Pc(40) int local40 = 0; local40 < this.anInt4800; local40++) {
				@Pc(60) int local60 = this.anInt4803 <= 0 ? this.anInt4807 : this.anInt4807 + Static521.method7113(this.anInt4803, local38) - local26;
				@Pc(66) int local66 = local60 >> 4 & 0xFF;
				@Pc(71) int local71 = Static521.method7113(Static87.anInt1964, local38);
				@Pc(76) int local76 = Static521.method7113(Static4.anInt81, local38);
				@Pc(87) int local87 = (Static549.anIntArray610[local66] * this.anInt4808 >> 12) + local71;
				@Pc(98) int local98 = local76 + (Static279.anIntArray312[local66] * this.anInt4808 >> 12);
				@Pc(103) int local103 = local98 - local76;
				@Pc(107) int local107 = local87 - local71;
				if (local107 != 0 || local103 != 0) {
					if (local103 < 0) {
						local103 = -local103;
					}
					if (local107 < 0) {
						local107 = -local107;
					}
					@Pc(131) boolean local131 = local107 < local103;
					@Pc(135) int local135;
					@Pc(139) int local139;
					if (local131) {
						local135 = local71;
						local71 = local76;
						local139 = local87;
						local87 = local98;
						local76 = local135;
						local98 = local139;
					}
					if (local71 > local87) {
						local135 = local71;
						local71 = local87;
						local139 = local76;
						local87 = local135;
						local76 = local98;
						local98 = local139;
					}
					local135 = local76;
					local139 = local87 - local71;
					@Pc(170) int local170 = local98 - local76;
					@Pc(175) int local175 = -local139 / 2;
					@Pc(179) int local179 = 2048 / local139;
					@Pc(189) int local189 = 1024 - (Static521.method7113(4096, local38) >> 2);
					if (local170 < 0) {
						local170 = -local170;
					}
					@Pc(204) int local204 = local76 < local98 ? 1 : -1;
					for (@Pc(206) int local206 = local71; local206 < local87; local206++) {
						@Pc(219) int local219 = local189 + (-local71 + local206) * local179 + 1024;
						@Pc(223) int local223 = Static451.anInt8721 & local206;
						@Pc(227) int local227 = Static561.anInt6003 & local135;
						local175 += local170;
						if (local131) {
							local31[local227][local223] = local219;
						} else {
							local31[local223][local227] = local219;
						}
						if (local175 > 0) {
							local135 += local204;
							local175 += -local139;
						}
					}
				}
			}
		}
		return local11;
	}
}
