import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class Class55 {

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "[[I")
	public int[][] anIntArrayArray13;

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "[I")
	public int[] anIntArray116;

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "[I")
	public int[] anIntArray117;

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "[[I")
	public int[][] anIntArrayArray14;

	@OriginalMember(owner = "client!dg", name = "e", descriptor = "[I")
	public int[] anIntArray118;

	@OriginalMember(owner = "client!dg", name = "h", descriptor = "Lclient!tl;")
	public Class225 aClass225_1;

	@OriginalMember(owner = "client!dg", name = "i", descriptor = "I")
	public int anInt1275;

	@OriginalMember(owner = "client!dg", name = "j", descriptor = "[I")
	public int[] anIntArray119;

	@OriginalMember(owner = "client!dg", name = "k", descriptor = "[I")
	public int[] anIntArray120;

	@OriginalMember(owner = "client!dg", name = "n", descriptor = "[Lclient!tl;")
	public Class225[] aClass225Array1;

	@OriginalMember(owner = "client!dg", name = "o", descriptor = "I")
	public int anInt1277;

	@OriginalMember(owner = "client!dg", name = "p", descriptor = "I")
	public int anInt1278;

	@OriginalMember(owner = "client!dg", name = "q", descriptor = "[I")
	public int[] anIntArray121;

	@OriginalMember(owner = "client!dg", name = "m", descriptor = "I")
	public final int anInt1276;

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "([BI)V")
	public Class55(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt1276 = Static32.method487(arg0, arg0.length);
		if (this.anInt1276 != arg1) {
			throw new RuntimeException();
		}
		this.method1100(arg0);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(I[B)V")
	private void method1100(@OriginalArg(1) byte[] arg0) {
		@Pc(12) Class3_Sub5 local12 = new Class3_Sub5(Static351.method2912(arg0));
		@Pc(16) int local16 = local12.method2739();
		if (local16 != 5 && local16 != 6) {
			throw new RuntimeException();
		}
		if (local16 >= 6) {
			this.anInt1275 = local12.method2726();
		} else {
			this.anInt1275 = 0;
		}
		@Pc(45) int local45 = local12.method2739();
		this.anInt1278 = local12.method2767();
		@Pc(54) int local54 = 0;
		@Pc(56) int local56 = -1;
		this.anIntArray117 = new int[this.anInt1278];
		for (@Pc(63) int local63 = 0; local63 < this.anInt1278; local63++) {
			this.anIntArray117[local63] = local54 += local12.method2767();
			if (this.anIntArray117[local63] > local56) {
				local56 = this.anIntArray117[local63];
			}
		}
		this.anInt1277 = local56 + 1;
		this.anIntArrayArray14 = new int[this.anInt1277][];
		this.anIntArray121 = new int[this.anInt1277];
		this.anIntArray116 = new int[this.anInt1277];
		this.anIntArray119 = new int[this.anInt1277];
		this.anIntArray120 = new int[this.anInt1277];
		@Pc(139) int local139;
		@Pc(153) int local153;
		if (local45 != 0) {
			this.anIntArray118 = new int[this.anInt1277];
			for (local139 = 0; local139 < this.anInt1277; local139++) {
				this.anIntArray118[local139] = -1;
			}
			for (local153 = 0; local153 < this.anInt1278; local153++) {
				this.anIntArray118[this.anIntArray117[local153]] = local12.method2726();
			}
			this.aClass225_1 = new Class225(this.anIntArray118);
		}
		for (local139 = 0; local139 < this.anInt1278; local139++) {
			this.anIntArray120[this.anIntArray117[local139]] = local12.method2726();
		}
		for (local153 = 0; local153 < this.anInt1278; local153++) {
			this.anIntArray116[this.anIntArray117[local153]] = local12.method2726();
		}
		for (@Pc(227) int local227 = 0; local227 < this.anInt1278; local227++) {
			this.anIntArray121[this.anIntArray117[local227]] = local12.method2767();
		}
		@Pc(259) int local259;
		@Pc(264) int local264;
		@Pc(268) int local268;
		@Pc(276) int local276;
		@Pc(293) int local293;
		for (@Pc(252) int local252 = 0; local252 < this.anInt1278; local252++) {
			local259 = this.anIntArray117[local252];
			local264 = this.anIntArray121[local259];
			local54 = 0;
			local268 = -1;
			this.anIntArrayArray14[local259] = new int[local264];
			for (local276 = 0; local276 < local264; local276++) {
				local293 = this.anIntArrayArray14[local259][local276] = local54 += local12.method2767();
				if (local268 < local293) {
					local268 = local293;
				}
			}
			this.anIntArray119[local259] = local268 + 1;
			if (local264 == local268 + 1) {
				this.anIntArrayArray14[local259] = null;
			}
		}
		if (local45 == 0) {
			return;
		}
		this.anIntArrayArray13 = new int[local56 + 1][];
		this.aClass225Array1 = new Class225[local56 + 1];
		for (local259 = 0; local259 < this.anInt1278; local259++) {
			local264 = this.anIntArray117[local259];
			local268 = this.anIntArray121[local264];
			this.anIntArrayArray13[local264] = new int[this.anIntArray119[local264]];
			for (local276 = 0; local276 < this.anIntArray119[local264]; local276++) {
				this.anIntArrayArray13[local264][local276] = -1;
			}
			for (local293 = 0; local293 < local268; local293++) {
				@Pc(394) int local394;
				if (this.anIntArrayArray14[local264] == null) {
					local394 = local293;
				} else {
					local394 = this.anIntArrayArray14[local264][local293];
				}
				this.anIntArrayArray13[local264][local394] = local12.method2726();
			}
			this.aClass225Array1[local264] = new Class225(this.anIntArrayArray13[local264]);
		}
	}
}
