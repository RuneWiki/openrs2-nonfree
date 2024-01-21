import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class5_Sub1_Sub8 extends Class5_Sub1 {

	@OriginalMember(owner = "client!gf", name = "O", descriptor = "I")
	public int anInt1052;

	@OriginalMember(owner = "client!gf", name = "P", descriptor = "I")
	public int anInt1053;

	@OriginalMember(owner = "client!gf", name = "R", descriptor = "I")
	public int anInt1055;

	@OriginalMember(owner = "client!gf", name = "S", descriptor = "I")
	public int anInt1056;

	@OriginalMember(owner = "client!gf", name = "Y", descriptor = "I")
	public int anInt1059;

	@OriginalMember(owner = "client!gf", name = "eb", descriptor = "I")
	public int anInt1064;

	@OriginalMember(owner = "client!gf", name = "Q", descriptor = "I")
	public int anInt1054 = -1;

	@OriginalMember(owner = "client!gf", name = "W", descriptor = "Z")
	public boolean aBoolean46 = true;

	@OriginalMember(owner = "client!gf", name = "X", descriptor = "I")
	public int anInt1058 = 0;

	@OriginalMember(owner = "client!gf", name = "bb", descriptor = "I")
	public int anInt1062 = -1;

	@OriginalMember(owner = "client!gf", name = "d", descriptor = "(B)V")
	public void method760() {
		if (this.anInt1054 != -1) {
			this.method761(this.anInt1054);
			this.anInt1059 = this.anInt1052;
			this.anInt1056 = this.anInt1055;
			this.anInt1053 = this.anInt1064;
		}
		this.method761(this.anInt1058);
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(II)V")
	private void method761(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local23 < local14) {
			local32 = local23;
		}
		@Pc(40) double local40 = local14;
		@Pc(42) double local42 = 0.0D;
		if (local14 < local23) {
			local40 = local23;
		}
		if (local32 > local30) {
			local32 = local30;
		}
		@Pc(57) double local57 = (double) 0;
		if (local40 < local30) {
			local40 = local30;
		}
		@Pc(69) double local69 = (local40 + local32) / 2.0D;
		if (local40 != local32) {
			if (local40 == local14) {
				local42 = (local23 - local30) / (local40 - local32);
			} else if (local40 == local23) {
				local42 = (local30 - local14) / (local40 - local32) + 2.0D;
			} else if (local40 == local30) {
				local42 = (local14 - local23) / (local40 - local32) + 4.0D;
			}
			if (local69 < 0.5D) {
				local57 = (local40 - local32) / (local40 + local32);
			}
			if (local69 >= 0.5D) {
				local57 = (local40 - local32) / (2.0D - local40 - local32);
			}
		}
		this.anInt1064 = (int) (local69 * 256.0D);
		if (this.anInt1064 < 0) {
			this.anInt1064 = 0;
		} else if (this.anInt1064 > 255) {
			this.anInt1064 = 255;
		}
		this.anInt1055 = (int) (local57 * 256.0D);
		if (this.anInt1055 < 0) {
			this.anInt1055 = 0;
		} else if (this.anInt1055 > 255) {
			this.anInt1055 = 255;
		}
		local42 /= 6.0D;
		this.anInt1052 = (int) (local42 * 256.0D);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!qe;III)V")
	private void method762(@OriginalArg(0) Class5_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1) {
			this.anInt1058 = arg0.method1530();
		} else if (arg1 == 2) {
			this.anInt1062 = arg0.method1546();
		} else if (arg1 == 5) {
			this.aBoolean46 = false;
			return;
		} else if (arg1 == 7) {
			this.anInt1054 = arg0.method1530();
			return;
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!qe;II)V")
	public void method765(@OriginalArg(0) Class5_Sub11 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(9) int local9 = arg0.method1546();
			if (local9 == 0) {
				return;
			}
			this.method762(arg0, local9, arg1);
		}
	}
}
