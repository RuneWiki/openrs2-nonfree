import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public final class Class67 {

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "[[I")
	public int[][] anIntArrayArray24;

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
	public int anInt2190;

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "[I")
	public int[] anIntArray210;

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "[I")
	public int[] anIntArray211;

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
	public int anInt2192;

	@OriginalMember(owner = "client!ha", name = "l", descriptor = "I")
	public int anInt2195;

	@OriginalMember(owner = "client!ha", name = "m", descriptor = "[[I")
	public int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!ha", name = "n", descriptor = "[I")
	public int[] anIntArray214;

	@OriginalMember(owner = "client!ha", name = "o", descriptor = "[I")
	public int[] anIntArray215;

	@OriginalMember(owner = "client!ha", name = "p", descriptor = "Lclient!di;")
	public Class38 aClass38_1;

	@OriginalMember(owner = "client!ha", name = "q", descriptor = "[Lclient!di;")
	public Class38[] aClass38Array1;

	@OriginalMember(owner = "client!ha", name = "s", descriptor = "[I")
	public int[] anIntArray216;

	@OriginalMember(owner = "client!ha", name = "v", descriptor = "[I")
	public int[] anIntArray217;

	@OriginalMember(owner = "client!ha", name = "r", descriptor = "I")
	public int anInt2196;

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "([BI)V")
	public Class67(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt2196 = Static269.method4063(arg0.length, arg0);
		if (this.anInt2196 != arg1) {
			throw new RuntimeException();
		}
		this.method1621(arg0);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I[B)V")
	private void method1621(@OriginalArg(1) byte[] arg0) {
		@Pc(12) Class1_Sub14 local12 = new Class1_Sub14(Static79.method1349(arg0));
		@Pc(16) int local16 = local12.method2199();
		if (local16 != 5 && local16 != 6) {
			throw new RuntimeException();
		}
		if (local16 >= 6) {
			this.anInt2192 = local12.method2194();
		} else {
			this.anInt2192 = 0;
		}
		@Pc(45) int local45 = -1;
		@Pc(47) int local47 = 0;
		@Pc(51) int local51 = local12.method2199();
		this.anInt2195 = local12.method2244();
		this.anIntArray217 = new int[this.anInt2195];
		@Pc(63) int local63;
		for (local63 = 0; local63 < this.anInt2195; local63++) {
			this.anIntArray217[local63] = local47 += local12.method2244();
			if (local45 < this.anIntArray217[local63]) {
				local45 = this.anIntArray217[local63];
			}
		}
		this.anInt2190 = local45 + 1;
		this.anIntArray210 = new int[this.anInt2190];
		this.anIntArray215 = new int[this.anInt2190];
		this.anIntArray211 = new int[this.anInt2190];
		this.anIntArrayArray25 = new int[this.anInt2190][];
		this.anIntArray216 = new int[this.anInt2190];
		if (local51 != 0) {
			this.anIntArray214 = new int[this.anInt2190];
			for (local63 = 0; local63 < this.anInt2190; local63++) {
				this.anIntArray214[local63] = -1;
			}
			for (local63 = 0; local63 < this.anInt2195; local63++) {
				this.anIntArray214[this.anIntArray217[local63]] = local12.method2194();
			}
			this.aClass38_1 = new Class38(this.anIntArray214);
		}
		for (local63 = 0; local63 < this.anInt2195; local63++) {
			this.anIntArray215[this.anIntArray217[local63]] = local12.method2194();
		}
		for (local63 = 0; local63 < this.anInt2195; local63++) {
			this.anIntArray210[this.anIntArray217[local63]] = local12.method2194();
		}
		for (local63 = 0; local63 < this.anInt2195; local63++) {
			this.anIntArray216[this.anIntArray217[local63]] = local12.method2244();
		}
		@Pc(244) int local244;
		@Pc(249) int local249;
		@Pc(251) int local251;
		@Pc(259) int local259;
		for (local63 = 0; local63 < this.anInt2195; local63++) {
			local47 = 0;
			local244 = this.anIntArray217[local63];
			local249 = this.anIntArray216[local244];
			local251 = -1;
			this.anIntArrayArray25[local244] = new int[local249];
			for (local259 = 0; local259 < local249; local259++) {
				@Pc(281) int local281 = this.anIntArrayArray25[local244][local259] = local47 += local12.method2244();
				if (local281 > local251) {
					local251 = local281;
				}
			}
			this.anIntArray211[local244] = local251 + 1;
			if (local249 == local251 + 1) {
				this.anIntArrayArray25[local244] = null;
			}
		}
		if (local51 == 0) {
			return;
		}
		this.anIntArrayArray24 = new int[local45 + 1][];
		this.aClass38Array1 = new Class38[local45 + 1];
		for (local63 = 0; local63 < this.anInt2195; local63++) {
			local244 = this.anIntArray217[local63];
			local249 = this.anIntArray216[local244];
			this.anIntArrayArray24[local244] = new int[this.anIntArray211[local244]];
			for (local251 = 0; local251 < this.anIntArray211[local244]; local251++) {
				this.anIntArrayArray24[local244][local251] = -1;
			}
			for (local251 = 0; local251 < local249; local251++) {
				if (this.anIntArrayArray25[local244] == null) {
					local259 = local251;
				} else {
					local259 = this.anIntArrayArray25[local244][local251];
				}
				this.anIntArrayArray24[local244][local259] = local12.method2194();
			}
			this.aClass38Array1[local244] = new Class38(this.anIntArrayArray24[local244]);
		}
	}
}
