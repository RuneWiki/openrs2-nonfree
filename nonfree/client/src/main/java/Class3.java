import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class3 {

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
	private static int anInt50;

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
	public static int anInt51;

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "[Lclient!bc;")
	public static Class3[] aClass3Array1;

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
	public int anInt52;

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "Ljava/lang/String;")
	public String aString1;

	@OriginalMember(owner = "client!bc", name = "i", descriptor = "I")
	public int anInt54;

	@OriginalMember(owner = "client!bc", name = "j", descriptor = "I")
	public int anInt55;

	@OriginalMember(owner = "client!bc", name = "k", descriptor = "I")
	public int anInt56;

	@OriginalMember(owner = "client!bc", name = "l", descriptor = "I")
	public int anInt57;

	@OriginalMember(owner = "client!bc", name = "m", descriptor = "I")
	public int anInt58;

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
	public int anInt53 = -1;

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "Z")
	private boolean aBoolean11 = false;

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "Z")
	public boolean aBoolean12 = true;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!tb;I)V")
	public static void method33(@OriginalArg(0) Class34 arg0) {
		@Pc(9) Class1_Sub3_Sub3 local9 = new Class1_Sub3_Sub3(arg0.method428(null, "flo.dat"), (byte) 63);
		anInt51 = local9.method333();
		if (aClass3Array1 == null) {
			aClass3Array1 = new Class3[anInt51];
		}
		for (@Pc(19) int local19 = 0; local19 < anInt51; local19++) {
			if (aClass3Array1[local19] == null) {
				aClass3Array1[local19] = new Class3();
			}
			aClass3Array1[local19].method34(local9);
		}
	}

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "()V")
	private Class3() {
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(BLclient!jb;)V")
	private void method34(@OriginalArg(1) Class1_Sub3_Sub3 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method331();
			if (local9 == 0) {
				return;
			}
			if (local9 == 1) {
				this.anInt52 = arg0.method335();
				this.method35(this.anInt52);
			} else if (local9 == 2) {
				this.anInt53 = arg0.method331();
			} else if (local9 == 3) {
				this.aBoolean11 = true;
			} else if (local9 == 5) {
				this.aBoolean12 = false;
			} else if (local9 == 6) {
				this.aString1 = arg0.method338();
			} else {
				System.out.println("Error unrecognised config code: " + local9);
			}
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)V")
	private void method35(@OriginalArg(0) int arg0) {
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
		this.anInt54 = (int) (local56 * 256.0D);
		this.anInt55 = (int) (local58 * 256.0D);
		this.anInt56 = (int) (local64 * 256.0D);
		if (this.anInt55 < 0) {
			this.anInt55 = 0;
		} else if (this.anInt55 > 255) {
			this.anInt55 = 255;
		}
		if (this.anInt56 < 0) {
			this.anInt56 = 0;
		} else if (this.anInt56 > 255) {
			this.anInt56 = 255;
		}
		if (local64 > 0.5D) {
			this.anInt58 = (int) ((1.0D - local64) * local58 * 512.0D);
		} else {
			this.anInt58 = (int) (local64 * local58 * 512.0D);
		}
		if (this.anInt58 < 1) {
			this.anInt58 = 1;
		}
		this.anInt57 = (int) (local56 * (double) this.anInt58);
	}
}
