import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ij")
public final class Class92 {

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "[I")
	public int[] anIntArray255;

	@OriginalMember(owner = "client!ij", name = "d", descriptor = "[[I")
	public int[][] anIntArrayArray43;

	@OriginalMember(owner = "client!ij", name = "e", descriptor = "[[I")
	public int[][] anIntArrayArray44;

	@OriginalMember(owner = "client!ij", name = "h", descriptor = "[Lclient!me;")
	public Class135[] aClass135Array1;

	@OriginalMember(owner = "client!ij", name = "k", descriptor = "Lclient!me;")
	public Class135 aClass135_1;

	@OriginalMember(owner = "client!ij", name = "m", descriptor = "[I")
	public int[] anIntArray256;

	@OriginalMember(owner = "client!ij", name = "o", descriptor = "I")
	public int anInt2864;

	@OriginalMember(owner = "client!ij", name = "q", descriptor = "[I")
	public int[] anIntArray257;

	@OriginalMember(owner = "client!ij", name = "r", descriptor = "I")
	public int anInt2865;

	@OriginalMember(owner = "client!ij", name = "s", descriptor = "[I")
	public int[] anIntArray258;

	@OriginalMember(owner = "client!ij", name = "t", descriptor = "[I")
	public int[] anIntArray259;

	@OriginalMember(owner = "client!ij", name = "v", descriptor = "I")
	public int anInt2867;

	@OriginalMember(owner = "client!ij", name = "w", descriptor = "[I")
	public int[] anIntArray260;

	@OriginalMember(owner = "client!ij", name = "l", descriptor = "I")
	public final int anInt2863;

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "([BI)V")
	public Class92(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt2863 = Static66.method1650(arg0.length, arg0);
		if (this.anInt2863 != arg1) {
			throw new RuntimeException();
		}
		this.method2728(arg0);
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(B[B)V")
	private void method2728(@OriginalArg(1) byte[] arg0) {
		@Pc(12) Class14_Sub4 local12 = new Class14_Sub4(Static181.method3507(arg0));
		@Pc(16) int local16 = local12.method2548();
		if (local16 != 5 && local16 != 6) {
			throw new RuntimeException();
		}
		if (local16 >= 6) {
			this.anInt2867 = local12.method2510();
		} else {
			this.anInt2867 = 0;
		}
		@Pc(47) int local47 = local12.method2548();
		this.anInt2864 = local12.method2498();
		@Pc(54) int local54 = 0;
		@Pc(56) int local56 = -1;
		this.anIntArray256 = new int[this.anInt2864];
		for (@Pc(71) int local71 = 0; local71 < this.anInt2864; local71++) {
			this.anIntArray256[local71] = local54 += local12.method2498();
			if (local56 < this.anIntArray256[local71]) {
				local56 = this.anIntArray256[local71];
			}
		}
		this.anInt2865 = local56 + 1;
		this.anIntArray255 = new int[this.anInt2865];
		this.anIntArrayArray44 = new int[this.anInt2865][];
		this.anIntArray260 = new int[this.anInt2865];
		this.anIntArray259 = new int[this.anInt2865];
		this.anIntArray258 = new int[this.anInt2865];
		@Pc(146) int local146;
		@Pc(164) int local164;
		if (local47 != 0) {
			this.anIntArray257 = new int[this.anInt2865];
			for (local146 = 0; local146 < this.anInt2865; local146++) {
				this.anIntArray257[local146] = -1;
			}
			for (local164 = 0; local164 < this.anInt2864; local164++) {
				this.anIntArray257[this.anIntArray256[local164]] = local12.method2510();
			}
			this.aClass135_1 = new Class135(this.anIntArray257);
		}
		for (local146 = 0; local146 < this.anInt2864; local146++) {
			this.anIntArray260[this.anIntArray256[local146]] = local12.method2510();
		}
		for (local164 = 0; local164 < this.anInt2864; local164++) {
			this.anIntArray255[this.anIntArray256[local164]] = local12.method2510();
		}
		for (@Pc(240) int local240 = 0; local240 < this.anInt2864; local240++) {
			this.anIntArray258[this.anIntArray256[local240]] = local12.method2498();
		}
		@Pc(266) int local266;
		@Pc(273) int local273;
		@Pc(281) int local281;
		@Pc(283) int local283;
		@Pc(300) int local300;
		for (@Pc(259) int local259 = 0; local259 < this.anInt2864; local259++) {
			local266 = this.anIntArray256[local259];
			local54 = 0;
			local273 = this.anIntArray258[local266];
			this.anIntArrayArray44[local266] = new int[local273];
			local281 = -1;
			for (local283 = 0; local283 < local273; local283++) {
				local300 = this.anIntArrayArray44[local266][local283] = local54 += local12.method2498();
				if (local281 < local300) {
					local281 = local300;
				}
			}
			this.anIntArray259[local266] = local281 + 1;
			if (local281 + 1 == local273) {
				this.anIntArrayArray44[local266] = null;
			}
		}
		if (local47 == 0) {
			return;
		}
		this.anIntArrayArray43 = new int[local56 + 1][];
		this.aClass135Array1 = new Class135[local56 + 1];
		for (local266 = 0; local266 < this.anInt2864; local266++) {
			local273 = this.anIntArray256[local266];
			local281 = this.anIntArray258[local273];
			this.anIntArrayArray43[local273] = new int[this.anIntArray259[local273]];
			for (local283 = 0; local283 < this.anIntArray259[local273]; local283++) {
				this.anIntArrayArray43[local273][local283] = -1;
			}
			for (local300 = 0; local300 < local281; local300++) {
				@Pc(410) int local410;
				if (this.anIntArrayArray44[local273] == null) {
					local410 = local300;
				} else {
					local410 = this.anIntArrayArray44[local273][local300];
				}
				this.anIntArrayArray43[local273][local410] = local12.method2510();
			}
			this.aClass135Array1[local273] = new Class135(this.anIntArrayArray43[local273]);
		}
	}
}
