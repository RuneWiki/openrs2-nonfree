import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!SLGAFVQN")
public final class Class37 {

	@OriginalMember(owner = "client!SLGAFVQN", name = "b", descriptor = "I")
	private static int anInt524;

	@OriginalMember(owner = "client!SLGAFVQN", name = "c", descriptor = "[Lclient!SLGAFVQN;")
	public static Class37[] aClass37Array1;

	@OriginalMember(owner = "client!SLGAFVQN", name = "d", descriptor = "I")
	private static int anInt525;

	@OriginalMember(owner = "client!SLGAFVQN", name = "e", descriptor = "[I")
	private static int[] anIntArray119;

	@OriginalMember(owner = "client!SLGAFVQN", name = "a", descriptor = "Z")
	private static boolean aBoolean117 = true;

	@OriginalMember(owner = "client!SLGAFVQN", name = "f", descriptor = "Ljava/lang/String;")
	private String aString12;

	@OriginalMember(owner = "client!SLGAFVQN", name = "g", descriptor = "I")
	private int anInt526;

	@OriginalMember(owner = "client!SLGAFVQN", name = "h", descriptor = "I")
	private int anInt527;

	@OriginalMember(owner = "client!SLGAFVQN", name = "k", descriptor = "I")
	public int anInt528;

	@OriginalMember(owner = "client!SLGAFVQN", name = "m", descriptor = "I")
	private int anInt529;

	@OriginalMember(owner = "client!SLGAFVQN", name = "n", descriptor = "I")
	private int anInt530;

	@OriginalMember(owner = "client!SLGAFVQN", name = "i", descriptor = "Z")
	private boolean aBoolean118 = false;

	@OriginalMember(owner = "client!SLGAFVQN", name = "j", descriptor = "Z")
	private boolean aBoolean119 = true;

	@OriginalMember(owner = "client!SLGAFVQN", name = "l", descriptor = "Z")
	private boolean aBoolean120 = false;

	@OriginalMember(owner = "client!SLGAFVQN", name = "o", descriptor = "Z")
	public boolean aBoolean121 = false;

	@OriginalMember(owner = "client!SLGAFVQN", name = "p", descriptor = "I")
	private int anInt531 = -1;

	@OriginalMember(owner = "client!SLGAFVQN", name = "q", descriptor = "Z")
	private boolean aBoolean122 = true;

	@OriginalMember(owner = "client!SLGAFVQN", name = "a", descriptor = "(BLclient!RPFMUSNN;)V")
	public static void method348(@OriginalArg(1) Class35 arg0) {
		try {
			@Pc(8) Class3_Sub1_Sub4 local8 = new Class3_Sub1_Sub4((byte) -58, arg0.method341("varp.dat", null));
			anInt525 = 0;
			anInt524 = local8.method460();
			if (aClass37Array1 == null) {
				aClass37Array1 = new Class37[anInt524];
			}
			if (anIntArray119 == null) {
				anIntArray119 = new int[anInt524];
			}
			for (@Pc(29) int local29 = 0; local29 < anInt524; local29++) {
				if (aClass37Array1[local29] == null) {
					aClass37Array1[local29] = new Class37();
				}
				aClass37Array1[local29].method349(local29, local8, aBoolean117);
			}
			if (local8.anInt666 != local8.aByteArray20.length) {
				System.out.println("varptype load mismatch");
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("47012, " + -114 + ", " + arg0 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SLGAFVQN", name = "<init>", descriptor = "()V")
	private Class37() {
	}

	@OriginalMember(owner = "client!SLGAFVQN", name = "a", descriptor = "(ILclient!WNCFPLWV;Z)V")
	private void method349(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub4 arg1, @OriginalArg(2) boolean arg2) {
		try {
			if (!arg2) {
				aBoolean117 = !aBoolean117;
			}
			while (true) {
				@Pc(12) int local12 = arg1.method458();
				if (local12 == 0) {
					return;
				}
				if (local12 == 1) {
					this.anInt526 = arg1.method458();
				} else if (local12 == 2) {
					this.anInt527 = arg1.method458();
				} else if (local12 == 3) {
					this.aBoolean118 = true;
					anIntArray119[anInt525++] = arg0;
				} else if (local12 == 4) {
					this.aBoolean119 = false;
				} else if (local12 == 5) {
					this.anInt528 = arg1.method460();
				} else if (local12 == 6) {
					this.aBoolean120 = true;
				} else if (local12 == 7) {
					this.anInt529 = arg1.method463();
				} else if (local12 == 8) {
					this.anInt530 = 1;
					this.aBoolean121 = true;
				} else if (local12 == 10) {
					this.aString12 = arg1.method465();
				} else if (local12 == 11) {
					this.aBoolean121 = true;
				} else if (local12 == 12) {
					this.anInt531 = arg1.method463();
				} else if (local12 == 13) {
					this.anInt530 = 2;
					this.aBoolean121 = true;
				} else if (local12 == 14) {
					this.aBoolean122 = false;
				} else {
					System.out.println("Error unrecognised config code: " + local12);
				}
			}
		} catch (@Pc(150) RuntimeException local150) {
			signlink.reporterror("47302, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local150.toString());
			throw new RuntimeException();
		}
	}
}
