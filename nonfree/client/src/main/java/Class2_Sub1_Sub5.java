import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class2_Sub1_Sub5 extends Class2_Sub1 {

	@OriginalMember(owner = "client!fc", name = "yb", descriptor = "I")
	public int anInt1087;

	@OriginalMember(owner = "client!fc", name = "Ib", descriptor = "I")
	public int anInt1093;

	@OriginalMember(owner = "client!fc", name = "Kb", descriptor = "I")
	public int anInt1095;

	@OriginalMember(owner = "client!fc", name = "Mb", descriptor = "I")
	public int anInt1096;

	@OriginalMember(owner = "client!fc", name = "Pb", descriptor = "I")
	public int anInt1098;

	@OriginalMember(owner = "client!fc", name = "Yb", descriptor = "I")
	public int anInt1105;

	@OriginalMember(owner = "client!fc", name = "Qb", descriptor = "Z")
	public boolean aBoolean50 = true;

	@OriginalMember(owner = "client!fc", name = "Ab", descriptor = "I")
	public int anInt1089 = -1;

	@OriginalMember(owner = "client!fc", name = "Ob", descriptor = "I")
	public int anInt1097 = -1;

	@OriginalMember(owner = "client!fc", name = "Xb", descriptor = "I")
	public int anInt1104 = 0;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(BILclient!ba;)V")
	public void method753(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub3 arg1) {
		while (true) {
			@Pc(5) int local5 = arg1.method791();
			if (local5 == 0) {
				return;
			}
			this.method756(arg0, arg1, local5);
		}
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(B)V")
	public void method755() {
		if (this.anInt1097 != -1) {
			this.method761(this.anInt1097);
			this.anInt1093 = this.anInt1087;
			this.anInt1105 = this.anInt1098;
			this.anInt1096 = this.anInt1095;
		}
		this.method761(this.anInt1104);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILclient!ba;IB)V")
	private void method756(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub3 arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			this.anInt1104 = arg1.method811();
		} else if (arg2 == 2) {
			this.anInt1089 = arg1.method791();
		} else if (arg2 == 5) {
			this.aBoolean50 = false;
		} else if (arg2 == 7) {
			this.anInt1097 = arg1.method811();
			return;
		}
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(II)V")
	private void method761(@OriginalArg(0) int arg0) {
		@Pc(22) double local22 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(31) double local31 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(38) double local38 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(40) double local40 = local22;
		if (local31 < local22) {
			local40 = local31;
		}
		if (local40 > local38) {
			local40 = local38;
		}
		@Pc(54) double local54 = local22;
		if (local31 > local22) {
			local54 = local31;
		}
		@Pc(62) double local62 = 0.0D;
		@Pc(64) double local64 = 0.0D;
		if (local38 > local54) {
			local54 = local38;
		}
		@Pc(76) double local76 = (local54 + local40) / 2.0D;
		if (local40 != local54) {
			if (local76 < 0.5D) {
				local64 = (local54 - local40) / (local54 + local40);
			}
			if (local76 >= 0.5D) {
				local64 = (local54 - local40) / ((2.0D - local54) - local40);
			}
			if (local54 == local22) {
				local62 = (local31 - local38) / (local54 - local40);
			} else if (local31 == local54) {
				local62 = (local38 - local22) / (local54 - local40) + 2.0D;
			} else if (local54 == local38) {
				local62 = (local22 - local31) / (-local40 + local54) + 4.0D;
			}
		}
		local62 /= 6.0D;
		this.anInt1095 = (int) (local62 * 256.0D);
		this.anInt1087 = (int) (local76 * 256.0D);
		this.anInt1098 = (int) (local64 * 256.0D);
		if (this.anInt1098 < 0) {
			this.anInt1098 = 0;
		} else if (this.anInt1098 > 255) {
			this.anInt1098 = 255;
		}
		if (this.anInt1087 < 0) {
			this.anInt1087 = 0;
		} else if (this.anInt1087 > 255) {
			this.anInt1087 = 255;
		}
	}
}
