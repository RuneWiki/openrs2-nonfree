import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!GLVFVUWP")
public final class Class18 {

	@OriginalMember(owner = "client!GLVFVUWP", name = "b", descriptor = "I")
	private static int anInt295;

	@OriginalMember(owner = "client!GLVFVUWP", name = "c", descriptor = "[Lclient!GLVFVUWP;")
	public static Class18[] aClass18Array1;

	@OriginalMember(owner = "client!GLVFVUWP", name = "a", descriptor = "Z")
	private static boolean aBoolean79 = true;

	@OriginalMember(owner = "client!GLVFVUWP", name = "d", descriptor = "Ljava/lang/String;")
	private String aString7;

	@OriginalMember(owner = "client!GLVFVUWP", name = "e", descriptor = "I")
	public int anInt296;

	@OriginalMember(owner = "client!GLVFVUWP", name = "i", descriptor = "I")
	public int anInt298;

	@OriginalMember(owner = "client!GLVFVUWP", name = "j", descriptor = "I")
	public int anInt299;

	@OriginalMember(owner = "client!GLVFVUWP", name = "k", descriptor = "I")
	public int anInt300;

	@OriginalMember(owner = "client!GLVFVUWP", name = "l", descriptor = "I")
	public int anInt301;

	@OriginalMember(owner = "client!GLVFVUWP", name = "m", descriptor = "I")
	public int anInt302;

	@OriginalMember(owner = "client!GLVFVUWP", name = "n", descriptor = "I")
	public int anInt303;

	@OriginalMember(owner = "client!GLVFVUWP", name = "f", descriptor = "I")
	public int anInt297 = -1;

	@OriginalMember(owner = "client!GLVFVUWP", name = "g", descriptor = "Z")
	private boolean aBoolean80 = false;

	@OriginalMember(owner = "client!GLVFVUWP", name = "h", descriptor = "Z")
	public boolean aBoolean81 = true;

	@OriginalMember(owner = "client!GLVFVUWP", name = "a", descriptor = "(ILclient!TKEGJSFV;)V")
	public static void method225(@OriginalArg(1) Class38 arg0) {
		try {
			@Pc(8) Class4_Sub1_Sub3 local8 = new Class4_Sub1_Sub3(arg0.method514("flo.dat", null), false);
			anInt295 = local8.method169();
			if (aClass18Array1 == null) {
				aClass18Array1 = new Class18[anInt295];
			}
			for (@Pc(26) int local26 = 0; local26 < anInt295; local26++) {
				if (aClass18Array1[local26] == null) {
					aClass18Array1[local26] = new Class18();
				}
				aClass18Array1[local26].method226(local8);
			}
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("54683, " + 0 + ", " + arg0 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GLVFVUWP", name = "<init>", descriptor = "()V")
	private Class18() {
	}

	@OriginalMember(owner = "client!GLVFVUWP", name = "a", descriptor = "(Lclient!EGCCHUZS;Z)V")
	private void method226(@OriginalArg(0) Class4_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(10) int local10 = arg0.method167();
				if (local10 == 0) {
					return;
				}
				if (local10 == 1) {
					this.anInt296 = arg0.method171();
					this.method227(this.anInt296);
				} else if (local10 == 2) {
					this.anInt297 = arg0.method167();
				} else if (local10 == 3) {
					this.aBoolean80 = true;
				} else if (local10 == 5) {
					this.aBoolean81 = false;
				} else if (local10 == 6) {
					this.aString7 = arg0.method174();
				} else if (local10 == 7) {
					@Pc(67) int local67 = this.anInt298;
					@Pc(70) int local70 = this.anInt299;
					@Pc(73) int local73 = this.anInt300;
					@Pc(76) int local76 = this.anInt301;
					@Pc(79) int local79 = arg0.method171();
					this.method227(local79);
					this.anInt298 = local67;
					this.anInt299 = local70;
					this.anInt300 = local73;
					this.anInt301 = local76;
					this.anInt302 = local76;
				} else {
					System.out.println("Error unrecognised config code: " + local10);
				}
			}
		} catch (@Pc(111) RuntimeException local111) {
			signlink.reporterror("41047, " + arg0 + ", " + true + ", " + local111.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GLVFVUWP", name = "a", descriptor = "(II)V")
	private void method227(@OriginalArg(1) int arg0) {
		try {
			@Pc(10) double local10 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
			@Pc(19) double local19 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
			@Pc(26) double local26 = (double) (arg0 & 0xFF) / 256.0D;
			@Pc(28) double local28 = local10;
			if (local19 < local10) {
				local28 = local19;
			}
			if (local26 < local28) {
				local28 = local26;
			}
			@Pc(42) double local42 = local10;
			if (local19 > local10) {
				local42 = local19;
			}
			if (local26 > local42) {
				local42 = local26;
			}
			@Pc(56) double local56 = 0.0D;
			@Pc(58) double local58 = 0.0D;
			@Pc(64) double local64 = (local28 + local42) / 2.0D;
			if (local28 != local42) {
				if (local64 < 0.5D) {
					local58 = (local42 - local28) / (local42 + local28);
				}
				if (local64 >= 0.5D) {
					local58 = (local42 - local28) / (2.0D - local42 - local28);
				}
				if (local10 == local42) {
					local56 = (local19 - local26) / (local42 - local28);
				} else if (local19 == local42) {
					local56 = (local26 - local10) / (local42 - local28) + 2.0D;
				} else if (local26 == local42) {
					local56 = (local10 - local19) / (local42 - local28) + 4.0D;
				}
			}
			local56 /= 6.0D;
			this.anInt298 = (int) (local56 * 256.0D);
			this.anInt299 = (int) (local58 * 256.0D);
			this.anInt300 = (int) (local64 * 256.0D);
			if (this.anInt299 < 0) {
				this.anInt299 = 0;
			} else if (this.anInt299 > 255) {
				this.anInt299 = 255;
			}
			if (this.anInt300 < 0) {
				this.anInt300 = 0;
			} else if (this.anInt300 > 255) {
				this.anInt300 = 255;
			}
			if (local64 > 0.5D) {
				this.anInt302 = (int) ((1.0D - local64) * local58 * 512.0D);
			} else {
				this.anInt302 = (int) (local64 * local58 * 512.0D);
			}
			if (this.anInt302 < 1) {
				this.anInt302 = 1;
			}
			this.anInt301 = (int) (local56 * (double) this.anInt302);
			@Pc(239) int local239 = this.anInt298 + (int) (Math.random() * 16.0D) - 8;
			if (local239 < 0) {
				local239 = 0;
			} else if (local239 > 255) {
				local239 = 255;
			}
			@Pc(260) int local260 = this.anInt299 + (int) (Math.random() * 48.0D) - 24;
			if (local260 < 0) {
				local260 = 0;
			} else if (local260 > 255) {
				local260 = 255;
			}
			@Pc(281) int local281 = this.anInt300 + (int) (Math.random() * 48.0D) - 24;
			if (local281 < 0) {
				local281 = 0;
			} else if (local281 > 255) {
				local281 = 255;
			}
			this.anInt303 = this.method228(local239, local260, local281);
		} catch (@Pc(311) RuntimeException local311) {
			signlink.reporterror("8936, " + 1 + ", " + arg0 + ", " + local311.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GLVFVUWP", name = "a", descriptor = "(III)I")
	private int method228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > 179) {
			arg1 /= 2;
		}
		if (arg2 > 192) {
			arg1 /= 2;
		}
		if (arg2 > 217) {
			arg1 /= 2;
		}
		if (arg2 > 243) {
			arg1 /= 2;
		}
		return (arg0 / 4 << 10) + (arg1 / 32 << 7) + arg2 / 2;
	}
}
