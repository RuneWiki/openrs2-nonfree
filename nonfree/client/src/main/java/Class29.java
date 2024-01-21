import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!OXBPHQKK")
public final class Class29 {

	@OriginalMember(owner = "client!OXBPHQKK", name = "b", descriptor = "I")
	private static int anInt501;

	@OriginalMember(owner = "client!OXBPHQKK", name = "c", descriptor = "[Lclient!OXBPHQKK;")
	public static Class29[] aClass29Array1;

	@OriginalMember(owner = "client!OXBPHQKK", name = "d", descriptor = "I")
	public int anInt502;

	@OriginalMember(owner = "client!OXBPHQKK", name = "e", descriptor = "[I")
	public int[] anIntArray140;

	@OriginalMember(owner = "client!OXBPHQKK", name = "f", descriptor = "[I")
	public int[] anIntArray141;

	@OriginalMember(owner = "client!OXBPHQKK", name = "g", descriptor = "[I")
	private int[] anIntArray142;

	@OriginalMember(owner = "client!OXBPHQKK", name = "i", descriptor = "[I")
	public int[] anIntArray143;

	@OriginalMember(owner = "client!OXBPHQKK", name = "q", descriptor = "I")
	public int anInt510;

	@OriginalMember(owner = "client!OXBPHQKK", name = "r", descriptor = "I")
	private int anInt511;

	@OriginalMember(owner = "client!OXBPHQKK", name = "a", descriptor = "Z")
	private boolean aBoolean130 = false;

	@OriginalMember(owner = "client!OXBPHQKK", name = "h", descriptor = "I")
	public int anInt503 = -1;

	@OriginalMember(owner = "client!OXBPHQKK", name = "j", descriptor = "Z")
	public boolean aBoolean131 = false;

	@OriginalMember(owner = "client!OXBPHQKK", name = "k", descriptor = "I")
	public int anInt504 = 5;

	@OriginalMember(owner = "client!OXBPHQKK", name = "l", descriptor = "I")
	public int anInt505 = -1;

	@OriginalMember(owner = "client!OXBPHQKK", name = "m", descriptor = "I")
	public int anInt506 = -1;

	@OriginalMember(owner = "client!OXBPHQKK", name = "n", descriptor = "I")
	public int anInt507 = 99;

	@OriginalMember(owner = "client!OXBPHQKK", name = "o", descriptor = "I")
	public int anInt508 = -1;

	@OriginalMember(owner = "client!OXBPHQKK", name = "p", descriptor = "I")
	public int anInt509 = -1;

	@OriginalMember(owner = "client!OXBPHQKK", name = "a", descriptor = "(Lclient!MNPBQFWE;B)V")
	public static void method376(@OriginalArg(0) Class27 arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub2 local8 = new Class1_Sub1_Sub2(false, arg0.method340("seq.dat", null));
			anInt501 = local8.method24();
			if (aClass29Array1 == null) {
				aClass29Array1 = new Class29[anInt501];
			}
			for (@Pc(18) int local18 = 0; local18 < anInt501; local18++) {
				if (aClass29Array1[local18] == null) {
					aClass29Array1[local18] = new Class29();
				}
				aClass29Array1[local18].method378(local8);
			}
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("87343, " + arg0 + ", " + 0 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OXBPHQKK", name = "<init>", descriptor = "()V")
	private Class29() {
	}

	@OriginalMember(owner = "client!OXBPHQKK", name = "a", descriptor = "(IZ)I")
	public int method377(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		try {
			if (arg1) {
				this.aBoolean130 = !this.aBoolean130;
			}
			@Pc(14) int local14 = this.anIntArray142[arg0];
			if (local14 == 0) {
				@Pc(23) Class42 local23 = Class42.method478(this.anIntArray140[arg0]);
				if (local23 != null) {
					local14 = this.anIntArray142[arg0] = local23.anInt726;
				}
			}
			if (local14 == 0) {
				local14 = 1;
			}
			return local14;
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("60747, " + arg0 + ", " + arg1 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OXBPHQKK", name = "a", descriptor = "(ILclient!BJPWOXRJ;)V")
	private void method378(@OriginalArg(1) Class1_Sub1_Sub2 arg0) {
		try {
			while (true) {
				@Pc(13) int local13 = arg0.method22();
				if (local13 == 0) {
					if (this.anInt502 == 0) {
						this.anInt502 = 1;
						this.anIntArray140 = new int[1];
						this.anIntArray140[0] = -1;
						this.anIntArray141 = new int[1];
						this.anIntArray141[0] = -1;
						this.anIntArray142 = new int[1];
						this.anIntArray142[0] = -1;
					}
					if (this.anInt508 == -1) {
						if (this.anIntArray143 == null) {
							this.anInt508 = 0;
						} else {
							this.anInt508 = 2;
						}
					}
					if (this.anInt509 == -1) {
						if (this.anIntArray143 != null) {
							this.anInt509 = 2;
							return;
						}
						this.anInt509 = 0;
						return;
					}
					return;
				}
				@Pc(40) int local40;
				if (local13 == 1) {
					this.anInt502 = arg0.method22();
					this.anIntArray140 = new int[this.anInt502];
					this.anIntArray141 = new int[this.anInt502];
					this.anIntArray142 = new int[this.anInt502];
					for (local40 = 0; local40 < this.anInt502; local40++) {
						this.anIntArray140[local40] = arg0.method24();
						this.anIntArray141[local40] = arg0.method24();
						if (this.anIntArray141[local40] == 65535) {
							this.anIntArray141[local40] = -1;
						}
						this.anIntArray142[local40] = arg0.method24();
					}
				} else if (local13 == 2) {
					this.anInt503 = arg0.method24();
				} else if (local13 == 3) {
					local40 = arg0.method22();
					this.anIntArray143 = new int[local40 + 1];
					for (@Pc(101) int local101 = 0; local101 < local40; local101++) {
						this.anIntArray143[local101] = arg0.method22();
					}
					this.anIntArray143[local40] = 9999999;
				} else if (local13 == 4) {
					this.aBoolean131 = true;
				} else if (local13 == 5) {
					this.anInt504 = arg0.method22();
				} else if (local13 == 6) {
					this.anInt505 = arg0.method24();
				} else if (local13 == 7) {
					this.anInt506 = arg0.method24();
				} else if (local13 == 8) {
					this.anInt507 = arg0.method22();
				} else if (local13 == 9) {
					this.anInt508 = arg0.method22();
				} else if (local13 == 10) {
					this.anInt509 = arg0.method22();
				} else if (local13 == 11) {
					this.anInt510 = arg0.method22();
				} else if (local13 == 12) {
					this.anInt511 = arg0.method27();
				} else {
					System.out.println("Error unrecognised seq config code: " + local13);
				}
			}
		} catch (@Pc(275) RuntimeException local275) {
			signlink.reporterror("61595, " + 674 + ", " + arg0 + ", " + local275.toString());
			throw new RuntimeException();
		}
	}
}
