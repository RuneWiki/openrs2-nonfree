import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class6_Sub2_Sub7 extends Class6_Sub2 {

	@OriginalMember(owner = "client!fc", name = "s", descriptor = "[I")
	public static final int[] anIntArray177 = new int[16384];

	@OriginalMember(owner = "client!fc", name = "t", descriptor = "[I")
	public static final int[] anIntArray178 = new int[16384];

	@OriginalMember(owner = "client!fc", name = "u", descriptor = "I")
	public int anInt2942;

	@OriginalMember(owner = "client!fc", name = "w", descriptor = "I")
	public int anInt2944;

	@OriginalMember(owner = "client!fc", name = "z", descriptor = "I")
	public int anInt2947;

	@OriginalMember(owner = "client!fc", name = "D", descriptor = "Ljava/lang/String;")
	public String aString24;

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			anIntArray178[local9] = (int) (Math.sin((double) local9 * local7) * 16384.0D);
			anIntArray177[local9] = (int) (Math.cos(local7 * (double) local9) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(II)V")
	public Class6_Sub2_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong263 = (long) arg1 | (long) arg0 << 32;
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(Z)V")
	public void method2580() {
		super.aLong247 = Long.MIN_VALUE & super.aLong247 | Static8.method201() + 500L;
		Static304.aClass180_10.method4468(this);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)J")
	public long method2581() {
		return Long.MAX_VALUE & super.aLong247;
	}

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "(I)V")
	public void method2582() {
		super.aLong247 |= Long.MIN_VALUE;
		if (this.method2581() == 0L) {
			Static463.aClass180_11.method4468(this);
		}
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(B)I")
	public int method2586() {
		return (int) super.aLong263;
	}

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "(B)I")
	public int method2588() {
		return (int) (super.aLong263 >>> 32 & 0xFFL);
	}
}
