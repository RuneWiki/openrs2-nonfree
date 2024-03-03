import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class2_Sub3_Sub32 extends Class2_Sub3 {

	@OriginalMember(owner = "client!sb", name = "S", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_209 = new Class145(5, 7);

	@OriginalMember(owner = "client!sb", name = "X", descriptor = "I")
	public static int anInt5866 = 0;

	@OriginalMember(owner = "client!sb", name = "R", descriptor = "I")
	private int anInt5862 = 1;

	@OriginalMember(owner = "client!sb", name = "O", descriptor = "I")
	private int anInt5860 = 204;

	@OriginalMember(owner = "client!sb", name = "W", descriptor = "I")
	private int anInt5865 = 1;

	static {
		new Class79("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
	}

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "()V", line = 96)
	public Class2_Sub3_Sub32() {
		super(0, true);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(BI)[I", line = 8)
	@Override
	public int[] method6486(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass158_41.method3997(arg0);
		if (super.aClass158_41.aBoolean265) {
			for (@Pc(17) int local17 = 0; local17 < Static211.anInt4031; local17++) {
				@Pc(23) int local23 = Static311.anIntArray424[local17];
				@Pc(27) int local27 = Static16.anIntArray322[arg0];
				@Pc(34) int local34 = local23 * this.anInt5862 >> 12;
				@Pc(41) int local41 = local27 * this.anInt5865 >> 12;
				@Pc(51) int local51 = this.anInt5862 * (local23 % (4096 / this.anInt5862));
				@Pc(61) int local61 = this.anInt5865 * (local27 % (4096 / this.anInt5865));
				if (local61 < this.anInt5860) {
					for (local34 -= local41; local34 < 0; local34 += 4) {
					}
					while (local34 > 3) {
						local34 -= 4;
					}
					if (local34 != 1) {
						local11[local17] = 0;
						continue;
					}
					if (this.anInt5860 > local51) {
						local11[local17] = 0;
						continue;
					}
				}
				if (local51 < this.anInt5860) {
					for (local34 -= local41; local34 < 0; local34 += 4) {
					}
					while (local34 > 3) {
						local34 -= 4;
					}
					if (local34 > 0) {
						local11[local17] = 0;
						continue;
					}
				}
				local11[local17] = 4096;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILclient!bt;I)V", line = 127)
	@Override
	public void method6485(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt5862 = arg1.method4816();
		} else if (arg0 == 1) {
			this.anInt5865 = arg1.method4816();
		} else if (arg0 == 2) {
			this.anInt5860 = arg1.method4830();
		}
	}
}
