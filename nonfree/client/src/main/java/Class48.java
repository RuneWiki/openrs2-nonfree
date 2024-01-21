import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!YDUFKDFX")
public final class Class48 {

	@OriginalMember(owner = "client!YDUFKDFX", name = "c", descriptor = "I")
	private static int anInt774;

	@OriginalMember(owner = "client!YDUFKDFX", name = "d", descriptor = "[Lclient!YDUFKDFX;")
	public static Class48[] aClass48Array1;

	@OriginalMember(owner = "client!YDUFKDFX", name = "a", descriptor = "Z")
	private static boolean aBoolean170 = true;

	@OriginalMember(owner = "client!YDUFKDFX", name = "e", descriptor = "Ljava/lang/String;")
	private String aString16;

	@OriginalMember(owner = "client!YDUFKDFX", name = "f", descriptor = "I")
	public int anInt775;

	@OriginalMember(owner = "client!YDUFKDFX", name = "j", descriptor = "I")
	public int anInt777;

	@OriginalMember(owner = "client!YDUFKDFX", name = "k", descriptor = "I")
	public int anInt778;

	@OriginalMember(owner = "client!YDUFKDFX", name = "l", descriptor = "I")
	public int anInt779;

	@OriginalMember(owner = "client!YDUFKDFX", name = "m", descriptor = "I")
	public int anInt780;

	@OriginalMember(owner = "client!YDUFKDFX", name = "n", descriptor = "I")
	public int anInt781;

	@OriginalMember(owner = "client!YDUFKDFX", name = "o", descriptor = "I")
	public int anInt782;

	@OriginalMember(owner = "client!YDUFKDFX", name = "b", descriptor = "I")
	private int anInt773 = 7;

	@OriginalMember(owner = "client!YDUFKDFX", name = "g", descriptor = "I")
	public int anInt776 = -1;

	@OriginalMember(owner = "client!YDUFKDFX", name = "h", descriptor = "Z")
	private boolean aBoolean171 = false;

	@OriginalMember(owner = "client!YDUFKDFX", name = "i", descriptor = "Z")
	public boolean aBoolean172 = true;

	@OriginalMember(owner = "client!YDUFKDFX", name = "a", descriptor = "(Lclient!AWEEREDT;I)V")
	public static void method526(@OriginalArg(0) Class2 arg0) {
		try {
			@Pc(16) Class8_Sub1_Sub3 local16 = new Class8_Sub1_Sub3(arg0.method14("flo.dat", null), 713);
			anInt774 = local16.method154();
			if (aClass48Array1 == null) {
				aClass48Array1 = new Class48[anInt774];
			}
			for (@Pc(26) int local26 = 0; local26 < anInt774; local26++) {
				if (aClass48Array1[local26] == null) {
					aClass48Array1[local26] = new Class48();
				}
				aClass48Array1[local26].method527(local16, (byte) 1);
			}
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("13589, " + arg0 + ", " + 0 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YDUFKDFX", name = "<init>", descriptor = "()V")
	private Class48() {
	}

	@OriginalMember(owner = "client!YDUFKDFX", name = "a", descriptor = "(Lclient!IUVBENCV;B)V")
	private void method527(@OriginalArg(0) Class8_Sub1_Sub3 arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(6) boolean local6 = false;
			while (true) {
				@Pc(18) int local18 = arg0.method152();
				if (local18 == 0) {
					return;
				}
				if (local18 == 1) {
					this.anInt775 = arg0.method156();
					this.method528(this.anInt775);
				} else if (local18 == 2) {
					this.anInt776 = arg0.method152();
				} else if (local18 == 3) {
					this.aBoolean171 = true;
				} else if (local18 == 5) {
					this.aBoolean172 = false;
				} else if (local18 == 6) {
					this.aString16 = arg0.method159();
				} else if (local18 == 7) {
					@Pc(75) int local75 = this.anInt777;
					@Pc(78) int local78 = this.anInt778;
					@Pc(81) int local81 = this.anInt779;
					@Pc(84) int local84 = this.anInt780;
					@Pc(87) int local87 = arg0.method156();
					this.method528(local87);
					this.anInt777 = local75;
					this.anInt778 = local78;
					this.anInt779 = local81;
					this.anInt780 = local84;
					this.anInt781 = local84;
				} else {
					System.out.println("Error unrecognised config code: " + local18);
				}
			}
		} catch (@Pc(119) RuntimeException local119) {
			signlink.reporterror("33581, " + arg0 + ", " + arg1 + ", " + local119.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YDUFKDFX", name = "a", descriptor = "(II)V")
	private void method528(@OriginalArg(1) int arg0) {
		try {
			if (arg0 == 16711935) {
				arg0 = 0;
			}
			@Pc(15) double local15 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
			@Pc(24) double local24 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
			@Pc(37) double local37 = (double) (arg0 & 0xFF) / 256.0D;
			@Pc(39) double local39 = local15;
			if (local24 < local15) {
				local39 = local24;
			}
			if (local37 < local39) {
				local39 = local37;
			}
			@Pc(53) double local53 = local15;
			if (local24 > local15) {
				local53 = local24;
			}
			if (local37 > local53) {
				local53 = local37;
			}
			@Pc(67) double local67 = 0.0D;
			@Pc(69) double local69 = 0.0D;
			@Pc(75) double local75 = (local39 + local53) / 2.0D;
			if (local39 != local53) {
				if (local75 < 0.5D) {
					local69 = (local53 - local39) / (local53 + local39);
				}
				if (local75 >= 0.5D) {
					local69 = (local53 - local39) / (2.0D - local53 - local39);
				}
				if (local15 == local53) {
					local67 = (local24 - local37) / (local53 - local39);
				} else if (local24 == local53) {
					local67 = (local37 - local15) / (local53 - local39) + 2.0D;
				} else if (local37 == local53) {
					local67 = (local15 - local24) / (local53 - local39) + 4.0D;
				}
			}
			local67 /= 6.0D;
			this.anInt777 = (int) (local67 * 256.0D);
			this.anInt778 = (int) (local69 * 256.0D);
			this.anInt779 = (int) (local75 * 256.0D);
			if (this.anInt778 < 0) {
				this.anInt778 = 0;
			} else if (this.anInt778 > 255) {
				this.anInt778 = 255;
			}
			if (this.anInt779 < 0) {
				this.anInt779 = 0;
			} else if (this.anInt779 > 255) {
				this.anInt779 = 255;
			}
			if (local75 > 0.5D) {
				this.anInt781 = (int) ((1.0D - local75) * local69 * 512.0D);
			} else {
				this.anInt781 = (int) (local75 * local69 * 512.0D);
			}
			if (this.anInt781 < 1) {
				this.anInt781 = 1;
			}
			this.anInt780 = (int) (local67 * (double) this.anInt781);
			@Pc(250) int local250 = this.anInt777 + (int) (Math.random() * 16.0D) - 8;
			if (local250 < 0) {
				local250 = 0;
			} else if (local250 > 255) {
				local250 = 255;
			}
			@Pc(271) int local271 = this.anInt778 + (int) (Math.random() * 48.0D) - 24;
			if (local271 < 0) {
				local271 = 0;
			} else if (local271 > 255) {
				local271 = 255;
			}
			@Pc(292) int local292 = this.anInt779 + (int) (Math.random() * 48.0D) - 24;
			if (local292 < 0) {
				local292 = 0;
			} else if (local292 > 255) {
				local292 = 255;
			}
			this.anInt782 = this.method529(local250, local271, local292);
		} catch (@Pc(312) RuntimeException local312) {
			signlink.reporterror("14374, " + -823 + ", " + arg0 + ", " + local312.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YDUFKDFX", name = "a", descriptor = "(III)I")
	private int method529(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
