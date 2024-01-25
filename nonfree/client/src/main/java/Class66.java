import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eh")
public final class Class66 {

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "[I")
	public int[] anIntArray113;

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "[[I")
	public int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!eh", name = "d", descriptor = "[I")
	public int[] anIntArray114;

	@OriginalMember(owner = "client!eh", name = "e", descriptor = "I")
	public int anInt2062;

	@OriginalMember(owner = "client!eh", name = "f", descriptor = "[I")
	public int[] anIntArray115;

	@OriginalMember(owner = "client!eh", name = "i", descriptor = "[I")
	public int[] anIntArray116;

	@OriginalMember(owner = "client!eh", name = "k", descriptor = "Lclient!qt;")
	public Class205 aClass205_1;

	@OriginalMember(owner = "client!eh", name = "m", descriptor = "[Lclient!qt;")
	public Class205[] aClass205Array1;

	@OriginalMember(owner = "client!eh", name = "n", descriptor = "I")
	public int anInt2067;

	@OriginalMember(owner = "client!eh", name = "p", descriptor = "[I")
	public int[] anIntArray117;

	@OriginalMember(owner = "client!eh", name = "q", descriptor = "[I")
	public int[] anIntArray118;

	@OriginalMember(owner = "client!eh", name = "r", descriptor = "I")
	public int anInt2069;

	@OriginalMember(owner = "client!eh", name = "s", descriptor = "[[I")
	public int[][] anIntArrayArray12;

	@OriginalMember(owner = "client!eh", name = "j", descriptor = "I")
	public final int anInt2065;

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "([BI)V")
	public Class66(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt2065 = Static65.method6075(arg0.length, arg0);
		if (arg1 != this.anInt2065) {
			throw new RuntimeException();
		}
		this.method1531(arg0);
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "([BB)V")
	private void method1531(@OriginalArg(0) byte[] arg0) {
		@Pc(12) Class2_Sub20 local12 = new Class2_Sub20(Static125.method1817(arg0));
		@Pc(16) int local16 = local12.method3737();
		if (local16 != 5 && local16 != 6) {
			throw new RuntimeException();
		}
		if (local16 >= 6) {
			this.anInt2069 = local12.method3731();
		} else {
			this.anInt2069 = 0;
		}
		@Pc(43) int local43 = local12.method3737();
		this.anInt2067 = local12.method3711();
		@Pc(50) int local50 = 0;
		@Pc(52) int local52 = -1;
		this.anIntArray117 = new int[this.anInt2067];
		for (@Pc(59) int local59 = 0; local59 < this.anInt2067; local59++) {
			this.anIntArray117[local59] = local50 += local12.method3711();
			if (local52 < this.anIntArray117[local59]) {
				local52 = this.anIntArray117[local59];
			}
		}
		this.anInt2062 = local52 + 1;
		this.anIntArray113 = new int[this.anInt2062];
		this.anIntArray114 = new int[this.anInt2062];
		this.anIntArray115 = new int[this.anInt2062];
		this.anIntArrayArray12 = new int[this.anInt2062][];
		this.anIntArray116 = new int[this.anInt2062];
		@Pc(140) int local140;
		@Pc(158) int local158;
		if (local43 != 0) {
			this.anIntArray118 = new int[this.anInt2062];
			for (local140 = 0; local140 < this.anInt2062; local140++) {
				this.anIntArray118[local140] = -1;
			}
			for (local158 = 0; local158 < this.anInt2067; local158++) {
				this.anIntArray118[this.anIntArray117[local158]] = local12.method3731();
			}
			this.aClass205_1 = new Class205(this.anIntArray118);
		}
		for (local140 = 0; local140 < this.anInt2067; local140++) {
			this.anIntArray115[this.anIntArray117[local140]] = local12.method3731();
		}
		for (local158 = 0; local158 < this.anInt2067; local158++) {
			this.anIntArray113[this.anIntArray117[local158]] = local12.method3731();
		}
		for (@Pc(230) int local230 = 0; local230 < this.anInt2067; local230++) {
			this.anIntArray114[this.anIntArray117[local230]] = local12.method3711();
		}
		@Pc(256) int local256;
		@Pc(261) int local261;
		@Pc(271) int local271;
		@Pc(273) int local273;
		@Pc(290) int local290;
		for (@Pc(249) int local249 = 0; local249 < this.anInt2067; local249++) {
			local256 = this.anIntArray117[local249];
			local261 = this.anIntArray114[local256];
			local50 = 0;
			this.anIntArrayArray12[local256] = new int[local261];
			local271 = -1;
			for (local273 = 0; local273 < local261; local273++) {
				local290 = this.anIntArrayArray12[local256][local273] = local50 += local12.method3711();
				if (local271 < local290) {
					local271 = local290;
				}
			}
			this.anIntArray116[local256] = local271 + 1;
			if (local271 + 1 == local261) {
				this.anIntArrayArray12[local256] = null;
			}
		}
		if (local43 == 0) {
			return;
		}
		this.aClass205Array1 = new Class205[local52 + 1];
		this.anIntArrayArray11 = new int[local52 + 1][];
		for (local256 = 0; local256 < this.anInt2067; local256++) {
			local261 = this.anIntArray117[local256];
			local271 = this.anIntArray114[local261];
			this.anIntArrayArray11[local261] = new int[this.anIntArray116[local261]];
			for (local273 = 0; local273 < this.anIntArray116[local261]; local273++) {
				this.anIntArrayArray11[local261][local273] = -1;
			}
			for (local290 = 0; local290 < local271; local290++) {
				@Pc(407) int local407;
				if (this.anIntArrayArray12[local261] == null) {
					local407 = local290;
				} else {
					local407 = this.anIntArrayArray12[local261][local290];
				}
				this.anIntArrayArray11[local261][local407] = local12.method3731();
			}
			this.aClass205Array1[local261] = new Class205(this.anIntArrayArray11[local261]);
		}
	}
}
