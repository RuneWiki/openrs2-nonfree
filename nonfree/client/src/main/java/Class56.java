import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!e")
public final class Class56 {

	@OriginalMember(owner = "client!e", name = "k", descriptor = "[I")
	public static final int[] anIntArray119 = new int[16384];

	@OriginalMember(owner = "client!e", name = "n", descriptor = "[I")
	public static final int[] anIntArray120 = new int[16384];

	@OriginalMember(owner = "client!e", name = "a", descriptor = "I")
	public int anInt1928;

	@OriginalMember(owner = "client!e", name = "d", descriptor = "I")
	public int anInt1930;

	@OriginalMember(owner = "client!e", name = "e", descriptor = "I")
	public int anInt1931;

	@OriginalMember(owner = "client!e", name = "f", descriptor = "I")
	public int anInt1932;

	@OriginalMember(owner = "client!e", name = "h", descriptor = "I")
	public int anInt1934;

	@OriginalMember(owner = "client!e", name = "l", descriptor = "I")
	public int anInt1937;

	@OriginalMember(owner = "client!e", name = "o", descriptor = "I")
	public int anInt1939;

	@OriginalMember(owner = "client!e", name = "q", descriptor = "I")
	public int anInt1941;

	@OriginalMember(owner = "client!e", name = "r", descriptor = "Lclient!e;")
	public Class56 aClass56_1;

	@OriginalMember(owner = "client!e", name = "s", descriptor = "I")
	public int anInt1942;

	@OriginalMember(owner = "client!e", name = "i", descriptor = "I")
	private final int anInt1935;

	@OriginalMember(owner = "client!e", name = "t", descriptor = "I")
	public final int anInt1943;

	@OriginalMember(owner = "client!e", name = "b", descriptor = "B")
	public final byte aByte41;

	@OriginalMember(owner = "client!e", name = "g", descriptor = "I")
	public final int anInt1933;

	@OriginalMember(owner = "client!e", name = "p", descriptor = "I")
	public final int anInt1940;

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			anIntArray119[local9] = (int) (Math.sin(local7 * (double) local9) * 32768.0D);
			anIntArray120[local9] = (int) (Math.cos(local7 * (double) local9) * 32768.0D);
		}
	}

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "(IIIIB)V")
	public Class56(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt1935 = arg0;
		this.anInt1943 = arg3;
		this.aByte41 = arg4;
		this.anInt1933 = arg1;
		this.anInt1940 = arg2;
	}

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "(Lclient!e;I)V")
	public Class56(@OriginalArg(0) Class56 arg0, @OriginalArg(1) int arg1) {
		this.aClass56_1 = arg0;
		this.aByte41 = this.aClass56_1.aByte41;
		this.anInt1940 = this.aClass56_1.anInt1940 + arg1;
		this.anInt1933 = arg1 + this.aClass56_1.anInt1933;
		this.anInt1943 = arg1 + this.aClass56_1.anInt1943;
		this.anInt1935 = this.aClass56_1.anInt1935;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Z)Lclient!jl;")
	public Class130 method1455() {
		return Static38.method708(this.anInt1935);
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIII)Lclient!e;")
	public Class56 method1458(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return new Class56(this.anInt1935, arg1, arg2, arg0, this.aByte41);
	}
}
