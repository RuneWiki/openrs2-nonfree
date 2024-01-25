import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class201 {

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "[[I")
	public int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!mb", name = "r", descriptor = "[[I")
	public int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!mb", name = "y", descriptor = "[Lclient!ql;")
	private Class154[] aClass154Array1;

	@OriginalMember(owner = "client!mb", name = "S", descriptor = "[I")
	public int[] anIntArray377;

	@OriginalMember(owner = "client!mb", name = "W", descriptor = "[I")
	public int[] anIntArray378;

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
	public int anInt6315 = -1;

	@OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
	public int anInt6317 = -1;

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "[I")
	public int[] anIntArray375 = null;

	@OriginalMember(owner = "client!mb", name = "m", descriptor = "I")
	public int anInt6319 = -1;

	@OriginalMember(owner = "client!mb", name = "s", descriptor = "I")
	private int anInt6323 = 0;

	@OriginalMember(owner = "client!mb", name = "x", descriptor = "I")
	public int anInt6328 = 0;

	@OriginalMember(owner = "client!mb", name = "w", descriptor = "I")
	public int anInt6327 = 0;

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
	public int anInt6311 = -1;

	@OriginalMember(owner = "client!mb", name = "o", descriptor = "I")
	public int anInt6320 = -1;

	@OriginalMember(owner = "client!mb", name = "u", descriptor = "I")
	public int anInt6325 = -1;

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "I")
	public int anInt6314 = -1;

	@OriginalMember(owner = "client!mb", name = "t", descriptor = "I")
	public int anInt6324 = -1;

	@OriginalMember(owner = "client!mb", name = "J", descriptor = "I")
	public int anInt6338 = -1;

	@OriginalMember(owner = "client!mb", name = "C", descriptor = "I")
	public int anInt6331 = -1;

	@OriginalMember(owner = "client!mb", name = "v", descriptor = "I")
	public int anInt6326 = 0;

	@OriginalMember(owner = "client!mb", name = "A", descriptor = "I")
	public int anInt6330 = -1;

	@OriginalMember(owner = "client!mb", name = "M", descriptor = "I")
	public int anInt6340 = -1;

	@OriginalMember(owner = "client!mb", name = "p", descriptor = "I")
	public int anInt6321 = -1;

	@OriginalMember(owner = "client!mb", name = "B", descriptor = "[I")
	public int[] anIntArray376 = null;

	@OriginalMember(owner = "client!mb", name = "G", descriptor = "I")
	public int anInt6335 = -1;

	@OriginalMember(owner = "client!mb", name = "K", descriptor = "I")
	public int anInt6339 = -1;

	@OriginalMember(owner = "client!mb", name = "H", descriptor = "I")
	public int anInt6336 = 0;

	@OriginalMember(owner = "client!mb", name = "O", descriptor = "I")
	public int anInt6342 = -1;

	@OriginalMember(owner = "client!mb", name = "Q", descriptor = "I")
	public int anInt6344 = -1;

	@OriginalMember(owner = "client!mb", name = "E", descriptor = "I")
	public int anInt6333 = -1;

	@OriginalMember(owner = "client!mb", name = "N", descriptor = "I")
	public int anInt6341 = 0;

	@OriginalMember(owner = "client!mb", name = "F", descriptor = "I")
	public int anInt6334 = -1;

	@OriginalMember(owner = "client!mb", name = "P", descriptor = "I")
	public int anInt6343 = 0;

	@OriginalMember(owner = "client!mb", name = "L", descriptor = "Z")
	public boolean aBoolean417 = true;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
	public int anInt6309 = 0;

	@OriginalMember(owner = "client!mb", name = "D", descriptor = "I")
	public int anInt6332 = -1;

	@OriginalMember(owner = "client!mb", name = "Z", descriptor = "I")
	public int anInt6350 = -1;

	@OriginalMember(owner = "client!mb", name = "T", descriptor = "I")
	public int anInt6346 = 0;

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
	public int anInt6313 = 0;

	@OriginalMember(owner = "client!mb", name = "cb", descriptor = "I")
	public int anInt6352 = -1;

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
	public int anInt6310 = 0;

	@OriginalMember(owner = "client!mb", name = "Y", descriptor = "I")
	public int anInt6349 = 0;

	@OriginalMember(owner = "client!mb", name = "db", descriptor = "I")
	private final int anInt6353 = -1;

	@OriginalMember(owner = "client!mb", name = "I", descriptor = "I")
	public int anInt6337 = -1;

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
	public int anInt6312 = -1;

	@OriginalMember(owner = "client!mb", name = "q", descriptor = "I")
	public int anInt6322 = -1;

	@OriginalMember(owner = "client!mb", name = "X", descriptor = "I")
	public int anInt6348 = 0;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)Z")
	public boolean method5478(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (arg0 == this.anInt6340) {
			return true;
		} else {
			if (this.anIntArray376 != null) {
				for (@Pc(30) int local30 = 0; local30 < this.anIntArray376.length; local30++) {
					if (arg0 == this.anIntArray376[local30]) {
						return true;
					}
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Z)I")
	public int method5479() {
		if (this.anInt6340 != -1) {
			return this.anInt6340;
		} else if (this.anIntArray376 == null) {
			return -1;
		} else {
			@Pc(27) int local27 = (int) ((double) this.anInt6323 * Math.random());
			@Pc(29) int local29;
			for (local29 = 0; this.anIntArray375[local29] <= local27; local29++) {
				local27 -= this.anIntArray375[local29];
			}
			return this.anIntArray376[local29];
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!rg;B)V")
	public void method5480(@OriginalArg(0) Class6_Sub40 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method8604();
			if (local7 == 0) {
				return;
			}
			this.method5482(local7, arg0);
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILclient!ha;)[Lclient!ql;")
	public Class154[] method5481(@OriginalArg(1) Class100 arg0) {
		if (this.aClass154Array1 != null && this.anInt6353 == arg0.anInt10378) {
			return this.aClass154Array1;
		} else if (this.anIntArrayArray25 == null) {
			return null;
		} else {
			this.aClass154Array1 = new Class154[this.anIntArrayArray25.length];
			for (@Pc(37) int local37 = 0; local37 < this.anIntArrayArray25.length; local37++) {
				@Pc(41) int local41 = 0;
				@Pc(43) int local43 = 0;
				@Pc(45) int local45 = 0;
				@Pc(47) int local47 = 0;
				@Pc(49) int local49 = 0;
				@Pc(51) int local51 = 0;
				if (this.anIntArrayArray25[local37] != null) {
					local47 = this.anIntArrayArray25[local37][3] << 3;
					local51 = this.anIntArrayArray25[local37][5] << 3;
					local49 = this.anIntArrayArray25[local37][4] << 3;
					local41 = this.anIntArrayArray25[local37][0];
					local45 = this.anIntArrayArray25[local37][2];
					local43 = this.anIntArrayArray25[local37][1];
				}
				if (local41 != 0 || local43 != 0 || local45 != 0 || local47 != 0 || local49 != 0 || local51 != 0) {
					@Pc(130) Class154 local130 = this.aClass154Array1[local37] = arg0.method8838();
					if (local51 != 0) {
						local130.method6572(local51);
					}
					if (local47 != 0) {
						local130.method6557(local47);
					}
					if (local49 != 0) {
						local130.method6566(local49);
					}
					local130.method6570(local41, local43, local45);
				}
			}
			return this.aClass154Array1;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILclient!rg;B)V")
	private void method5482(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub40 arg1) {
		if (arg0 == 1) {
			this.anInt6340 = arg1.method8571();
			this.anInt6352 = arg1.method8571();
			if (this.anInt6352 == 65535) {
				this.anInt6352 = -1;
			}
			if (this.anInt6340 == 65535) {
				this.anInt6340 = -1;
			}
		} else if (arg0 == 2) {
			this.anInt6338 = arg1.method8571();
		} else if (arg0 == 3) {
			this.anInt6350 = arg1.method8571();
		} else if (arg0 == 4) {
			this.anInt6337 = arg1.method8571();
		} else if (arg0 == 5) {
			this.anInt6317 = arg1.method8571();
		} else if (arg0 == 6) {
			this.anInt6319 = arg1.method8571();
		} else if (arg0 == 7) {
			this.anInt6339 = arg1.method8571();
		} else if (arg0 == 8) {
			this.anInt6324 = arg1.method8571();
		} else if (arg0 == 9) {
			this.anInt6334 = arg1.method8571();
		} else if (arg0 == 26) {
			this.anInt6348 = (short) (arg1.method8604() * 4);
			this.anInt6341 = (short) (arg1.method8604() * 4);
		} else {
			@Pc(92) int local92;
			@Pc(342) int local342;
			if (arg0 == 27) {
				if (this.anIntArrayArray25 == null) {
					this.anIntArrayArray25 = new int[12][];
				}
				local92 = arg1.method8604();
				this.anIntArrayArray25[local92] = new int[6];
				for (local342 = 0; local342 < 6; local342++) {
					this.anIntArrayArray25[local92][local342] = arg1.method8615();
				}
			} else if (arg0 == 28) {
				this.anIntArray377 = new int[12];
				for (local92 = 0; local92 < 12; local92++) {
					this.anIntArray377[local92] = arg1.method8604();
					if (this.anIntArray377[local92] == 255) {
						this.anIntArray377[local92] = -1;
					}
				}
			} else if (arg0 == 29) {
				this.anInt6336 = arg1.method8604();
			} else if (arg0 == 30) {
				this.anInt6349 = arg1.method8571();
			} else if (arg0 == 31) {
				this.anInt6327 = arg1.method8604();
			} else if (arg0 == 32) {
				this.anInt6346 = arg1.method8571();
			} else if (arg0 == 33) {
				this.anInt6309 = arg1.method8615();
			} else if (arg0 == 34) {
				this.anInt6313 = arg1.method8604();
			} else if (arg0 == 35) {
				this.anInt6328 = arg1.method8571();
			} else if (arg0 == 36) {
				this.anInt6343 = arg1.method8615();
			} else if (arg0 == 37) {
				this.anInt6333 = arg1.method8604();
			} else if (arg0 == 38) {
				this.anInt6335 = arg1.method8571();
			} else if (arg0 == 39) {
				this.anInt6322 = arg1.method8571();
			} else if (arg0 == 40) {
				this.anInt6311 = arg1.method8571();
			} else if (arg0 == 41) {
				this.anInt6320 = arg1.method8571();
			} else if (arg0 == 42) {
				this.anInt6321 = arg1.method8571();
			} else if (arg0 == 43) {
				this.anInt6344 = arg1.method8571();
			} else if (arg0 == 44) {
				this.anInt6325 = arg1.method8571();
			} else if (arg0 == 45) {
				this.anInt6315 = arg1.method8571();
			} else if (arg0 == 46) {
				this.anInt6342 = arg1.method8571();
			} else if (arg0 == 47) {
				this.anInt6332 = arg1.method8571();
			} else if (arg0 == 48) {
				this.anInt6331 = arg1.method8571();
			} else if (arg0 == 49) {
				this.anInt6312 = arg1.method8571();
			} else if (arg0 == 50) {
				this.anInt6314 = arg1.method8571();
			} else if (arg0 == 51) {
				this.anInt6330 = arg1.method8571();
			} else if (arg0 == 52) {
				local92 = arg1.method8604();
				this.anIntArray375 = new int[local92];
				this.anIntArray376 = new int[local92];
				for (local342 = 0; local342 < local92; local342++) {
					this.anIntArray376[local342] = arg1.method8571();
					@Pc(387) int local387 = arg1.method8604();
					this.anIntArray375[local342] = local387;
					this.anInt6323 += local387;
				}
			} else if (arg0 == 53) {
				this.aBoolean417 = false;
				return;
			} else if (arg0 == 54) {
				this.anInt6310 = arg1.method8604() << 6;
				this.anInt6326 = arg1.method8604() << 6;
				return;
			} else if (arg0 == 55) {
				if (this.anIntArray378 == null) {
					this.anIntArray378 = new int[12];
				}
				local92 = arg1.method8604();
				this.anIntArray378[local92] = arg1.method8571();
				return;
			} else if (arg0 == 56) {
				if (this.anIntArrayArray26 == null) {
					this.anIntArrayArray26 = new int[12][];
				}
				local92 = arg1.method8604();
				this.anIntArrayArray26[local92] = new int[3];
				for (local342 = 0; local342 < 3; local342++) {
					this.anIntArrayArray26[local92][local342] = arg1.method8615();
				}
				return;
			}
		}
	}
}
