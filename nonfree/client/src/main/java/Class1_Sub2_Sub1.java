import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aea")
public final class Class1_Sub2_Sub1 extends Class1_Sub2 {

	@OriginalMember(owner = "client!aea", name = "A", descriptor = "[C")
	private static final char[] aCharArray1 = new char[64];

	@OriginalMember(owner = "client!aea", name = "I", descriptor = "[F")
	public static final float[] aFloatArray4;

	@OriginalMember(owner = "client!aea", name = "G", descriptor = "[F")
	public static final float[] aFloatArray3;

	@OriginalMember(owner = "client!aea", name = "L", descriptor = "I")
	public static int anInt228;

	@OriginalMember(owner = "client!aea", name = "B", descriptor = "[C")
	public char[] aCharArray2;

	@OriginalMember(owner = "client!aea", name = "C", descriptor = "[I")
	public int[] anIntArray20;

	@OriginalMember(owner = "client!aea", name = "D", descriptor = "[I")
	public int[] anIntArray21;

	@OriginalMember(owner = "client!aea", name = "J", descriptor = "Ljava/lang/String;")
	public String aString5;

	@OriginalMember(owner = "client!aea", name = "K", descriptor = "[C")
	public char[] aCharArray3;

	static {
		for (@Pc(4) int local4 = 0; local4 < 26; local4++) {
			aCharArray1[local4] = (char) (local4 + 65);
		}
		for (@Pc(18) int local18 = 26; local18 < 52; local18++) {
			aCharArray1[local18] = (char) (local18 + 71);
		}
		@Pc(32) int local32;
		for (local32 = 52; local32 < 62; local32++) {
			aCharArray1[local32] = (char) (local32 + 48 - 52);
		}
		aCharArray1[63] = '-';
		aCharArray1[62] = '*';
		aFloatArray4 = new float[16384];
		aFloatArray3 = new float[16384];
		anInt228 = -1;
		@Pc(64) double local64 = 3.834951969714103E-4D;
		for (local32 = 0; local32 < 16384; local32++) {
			aFloatArray3[local32] = (float) Math.sin((double) local32 * local64);
			aFloatArray4[local32] = (float) Math.cos(local64 * (double) local32);
		}
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(IILclient!os;)V")
	private void method424(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 1) {
			this.aString5 = arg1.method4491();
			return;
		}
		@Pc(18) int local18;
		@Pc(28) int local28;
		@Pc(41) byte local41;
		if (arg0 == 2) {
			local18 = arg1.method4487();
			this.aCharArray2 = new char[local18];
			this.anIntArray20 = new int[local18];
			for (local28 = 0; local28 < local18; local28++) {
				this.anIntArray20[local28] = arg1.method4494();
				local41 = arg1.method4482();
				this.aCharArray2[local28] = local41 == 0 ? 0 : Static253.method4580(local41);
			}
		} else if (arg0 == 3) {
			local18 = arg1.method4487();
			this.aCharArray3 = new char[local18];
			this.anIntArray21 = new int[local18];
			for (local28 = 0; local28 < local18; local28++) {
				this.anIntArray21[local28] = arg1.method4494();
				local41 = arg1.method4482();
				this.aCharArray3[local28] = local41 == 0 ? 0 : Static253.method4580(local41);
			}
		}
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(IC)I")
	public int method425(@OriginalArg(1) char arg0) {
		if (this.anIntArray20 == null) {
			return -1;
		}
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray20.length; local20++) {
			if (arg0 == this.aCharArray2[local20]) {
				return this.anIntArray20[local20];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(ILclient!os;)V")
	public void method427(@OriginalArg(1) Class1_Sub17 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method4487();
			if (local9 == 0) {
				return;
			}
			this.method424(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(B)V")
	public void method428() {
		@Pc(6) int local6;
		if (this.anIntArray21 != null) {
			for (local6 = 0; local6 < this.anIntArray21.length; local6++) {
				this.anIntArray21[local6] |= 0x8000;
			}
		}
		if (this.anIntArray20 != null) {
			for (local6 = 0; local6 < this.anIntArray20.length; local6++) {
				this.anIntArray20[local6] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(CB)I")
	public int method429(@OriginalArg(0) char arg0) {
		if (this.anIntArray21 == null) {
			return -1;
		}
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray21.length; local20++) {
			if (arg0 == this.aCharArray3[local20]) {
				return this.anIntArray21[local20];
			}
		}
		return -1;
	}
}
