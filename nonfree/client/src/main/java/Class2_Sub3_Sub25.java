import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pk")
public final class Class2_Sub3_Sub25 extends Class2_Sub3 {

	@OriginalMember(owner = "client!pk", name = "Q", descriptor = "Lclient!h;")
	public static final Class89 aClass89_184 = new Class89(2, 2);

	@OriginalMember(owner = "client!pk", name = "hb", descriptor = "Lclient!h;")
	public static final Class89 aClass89_185 = new Class89(78, 6);

	@OriginalMember(owner = "client!pk", name = "ib", descriptor = "I")
	public static int anInt5012 = -1;

	@OriginalMember(owner = "client!pk", name = "jb", descriptor = "Lclient!h;")
	public static final Class89 aClass89_186 = new Class89(0, 10);

	@OriginalMember(owner = "client!pk", name = "kb", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_180 = new Class145(0, 2);

	@OriginalMember(owner = "client!pk", name = "lb", descriptor = "Lclient!s;")
	public static final Class210 lb = new Class210(1, 15);

	@OriginalMember(owner = "client!pk", name = "mb", descriptor = "[I")
	public static final int[] anIntArray351 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!pk", name = "N", descriptor = "[[I")
	private int[][] anIntArrayArray41;

	@OriginalMember(owner = "client!pk", name = "R", descriptor = "I")
	private int anInt4998;

	@OriginalMember(owner = "client!pk", name = "U", descriptor = "I")
	private int anInt5001;

	@OriginalMember(owner = "client!pk", name = "W", descriptor = "[[I")
	private int[][] anIntArrayArray42;

	@OriginalMember(owner = "client!pk", name = "Y", descriptor = "[I")
	private int[] anIntArray350;

	@OriginalMember(owner = "client!pk", name = "fb", descriptor = "I")
	private int anInt5010;

	@OriginalMember(owner = "client!pk", name = "T", descriptor = "I")
	private int anInt5000 = 1024;

	@OriginalMember(owner = "client!pk", name = "X", descriptor = "I")
	private int anInt5003 = 8;

	@OriginalMember(owner = "client!pk", name = "O", descriptor = "I")
	private int anInt4996 = 409;

	@OriginalMember(owner = "client!pk", name = "S", descriptor = "I")
	private int anInt4999 = 0;

	@OriginalMember(owner = "client!pk", name = "cb", descriptor = "I")
	private int anInt5007 = 81;

	@OriginalMember(owner = "client!pk", name = "db", descriptor = "I")
	private int anInt5008 = 1024;

	@OriginalMember(owner = "client!pk", name = "ab", descriptor = "I")
	private int anInt5005 = 204;

	@OriginalMember(owner = "client!pk", name = "gb", descriptor = "I")
	private int anInt5011 = 4;

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "()V", line = 376)
	public Class2_Sub3_Sub25() {
		super(0, true);
	}

	@OriginalMember(owner = "client!pk", name = "d", descriptor = "(I)V", line = 3)
	@Override
	public void method6481() {
		this.method4596();
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(BI)[I", line = 90)
	@Override
	public int[] method6486(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass158_41.method3997(arg0);
		if (super.aClass158_41.aBoolean265) {
			@Pc(22) int local22 = 0;
			@Pc(29) int local29;
			for (local29 = Static16.anIntArray322[arg0] + this.anInt4999; local29 < 0; local29 += 4096) {
			}
			while (local29 > 4096) {
				local29 -= 4096;
			}
			while (local22 < this.anInt5003 && this.anIntArray350[local22] <= local29) {
				local22++;
			}
			@Pc(62) int local62 = local22 - 1;
			@Pc(73) boolean local73 = (local22 & 0x1) == 0;
			@Pc(78) int local78 = this.anIntArray350[local22];
			@Pc(85) int local85 = this.anIntArray350[local22 - 1];
			if (local29 > this.anInt5010 + local85 && local29 < local78 - this.anInt5010) {
				for (@Pc(103) int local103 = 0; local103 < Static211.anInt4031; local103++) {
					@Pc(107) int local107 = 0;
					@Pc(116) int local116 = local73 ? this.anInt5008 : -this.anInt5008;
					@Pc(128) int local128;
					for (local128 = Static311.anIntArray424[local103] + (this.anInt5001 * local116 >> 12); local128 < 0; local128 += 4096) {
					}
					while (local128 > 4096) {
						local128 -= 4096;
					}
					while (local107 < this.anInt5011 && local128 >= this.anIntArrayArray42[local62][local107]) {
						local107++;
					}
					@Pc(165) int local165 = local107 - 1;
					@Pc(172) int local172 = this.anIntArrayArray42[local62][local107];
					@Pc(179) int local179 = this.anIntArrayArray42[local62][local165];
					if (local179 + this.anInt5010 < local128 && local172 - this.anInt5010 > local128) {
						local11[local103] = this.anIntArrayArray41[local62][local165];
					} else {
						local11[local103] = 0;
					}
				}
			} else {
				Static390.method4611(local11, 0, Static211.anInt4031, 0);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILclient!bt;I)V", line = 189)
	@Override
	public void method6485(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt5011 = arg1.method4816();
		} else if (arg0 == 1) {
			this.anInt5003 = arg1.method4816();
		} else if (arg0 == 2) {
			this.anInt4996 = arg1.method4830();
		} else if (arg0 == 3) {
			this.anInt5005 = arg1.method4830();
		} else if (arg0 == 4) {
			this.anInt5008 = arg1.method4830();
		} else if (arg0 == 5) {
			this.anInt4999 = arg1.method4830();
		} else if (arg0 == 6) {
			this.anInt5007 = arg1.method4830();
		} else if (arg0 == 7) {
			this.anInt5000 = arg1.method4830();
		}
	}

	@OriginalMember(owner = "client!pk", name = "c", descriptor = "(Z)V", line = 313)
	private void method4596() {
		@Pc(12) Random local12 = new Random((long) this.anInt5003);
		this.anInt4998 = 4096 / this.anInt5003;
		this.anInt5010 = this.anInt5007 / 2;
		this.anInt5001 = 4096 / this.anInt5011;
		@Pc(35) int local35 = this.anInt5001 / 2;
		@Pc(46) int local46 = this.anInt4998 / 2;
		this.anIntArrayArray41 = new int[this.anInt5003][this.anInt5011];
		this.anIntArray350 = new int[this.anInt5003 + 1];
		this.anIntArrayArray42 = new int[this.anInt5003][this.anInt5011 + 1];
		this.anIntArray350[0] = 0;
		for (@Pc(76) int local76 = 0; local76 < this.anInt5003; local76++) {
			@Pc(83) int local83;
			@Pc(95) int local95;
			if (local76 > 0) {
				local83 = this.anInt4998;
				local95 = (Static356.method6362(4096, local12) - 2048) * this.anInt5005 >> 12;
				@Pc(103) int local103 = local83 + (local95 * local46 >> 12);
				this.anIntArray350[local76] = this.anIntArray350[local76 - 1] + local103;
			}
			this.anIntArrayArray42[local76][0] = 0;
			for (local83 = 0; local83 < this.anInt5011; local83++) {
				if (local83 > 0) {
					local95 = this.anInt5001;
					@Pc(144) int local144 = (Static356.method6362(4096, local12) - 2048) * this.anInt4996 >> 12;
					local95 += local144 * local35 >> 12;
					this.anIntArrayArray42[local76][local83] = this.anIntArrayArray42[local76][local83 - 1] + local95;
				}
				this.anIntArrayArray41[local76][local83] = this.anInt5000 > 0 ? 4096 - Static356.method6362(this.anInt5000, local12) : 4096;
			}
			this.anIntArrayArray42[local76][this.anInt5011] = 4096;
		}
		this.anIntArray350[this.anInt5003] = 4096;
	}
}
