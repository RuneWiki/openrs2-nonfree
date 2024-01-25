import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Class171 {

	@OriginalMember(owner = "client!r", name = "a", descriptor = "[[I")
	public int[][] anIntArrayArray145;

	@OriginalMember(owner = "client!r", name = "d", descriptor = "[I")
	public int[] anIntArray434;

	@OriginalMember(owner = "client!r", name = "e", descriptor = "Lclient!qd;")
	public Class163 aClass163_1;

	@OriginalMember(owner = "client!r", name = "f", descriptor = "[I")
	public int[] anIntArray435;

	@OriginalMember(owner = "client!r", name = "g", descriptor = "[I")
	public int[] anIntArray436;

	@OriginalMember(owner = "client!r", name = "i", descriptor = "I")
	public int anInt5364;

	@OriginalMember(owner = "client!r", name = "j", descriptor = "[Lclient!qd;")
	public Class163[] aClass163Array1;

	@OriginalMember(owner = "client!r", name = "k", descriptor = "[[I")
	public int[][] anIntArrayArray146;

	@OriginalMember(owner = "client!r", name = "l", descriptor = "[I")
	public int[] anIntArray437;

	@OriginalMember(owner = "client!r", name = "m", descriptor = "I")
	public int anInt5365;

	@OriginalMember(owner = "client!r", name = "n", descriptor = "[I")
	public int[] anIntArray438;

	@OriginalMember(owner = "client!r", name = "o", descriptor = "[I")
	public int[] anIntArray439;

	@OriginalMember(owner = "client!r", name = "p", descriptor = "I")
	public int anInt5366;

	@OriginalMember(owner = "client!r", name = "h", descriptor = "I")
	public final int anInt5363;

	static {
		new Class159(null, "Spieler nicht auf deiner Freunde-Liste.", null, null);
	}

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "([BI)V")
	public Class171(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt5363 = Static86.method2110(arg0.length, arg0);
		if (this.anInt5363 != arg1) {
			throw new RuntimeException();
		}
		this.method4613(arg0);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(B[B)V")
	private void method4613(@OriginalArg(1) byte[] arg0) {
		@Pc(12) Class4_Sub11 local12 = new Class4_Sub11(Static23.method380(arg0));
		@Pc(16) int local16 = local12.method3440();
		if (local16 != 5 && local16 != 6) {
			throw new RuntimeException();
		}
		if (local16 >= 6) {
			this.anInt5366 = local12.method3418();
		} else {
			this.anInt5366 = 0;
		}
		@Pc(45) int local45 = local12.method3440();
		this.anInt5364 = local12.method3401();
		@Pc(52) int local52 = 0;
		@Pc(54) int local54 = -1;
		this.anIntArray438 = new int[this.anInt5364];
		for (@Pc(61) int local61 = 0; local61 < this.anInt5364; local61++) {
			this.anIntArray438[local61] = local52 += local12.method3401();
			if (local54 < this.anIntArray438[local61]) {
				local54 = this.anIntArray438[local61];
			}
		}
		this.anInt5365 = local54 + 1;
		this.anIntArrayArray146 = new int[this.anInt5365][];
		this.anIntArray435 = new int[this.anInt5365];
		this.anIntArray437 = new int[this.anInt5365];
		this.anIntArray434 = new int[this.anInt5365];
		this.anIntArray439 = new int[this.anInt5365];
		@Pc(137) int local137;
		@Pc(155) int local155;
		if (local45 != 0) {
			this.anIntArray436 = new int[this.anInt5365];
			for (local137 = 0; local137 < this.anInt5365; local137++) {
				this.anIntArray436[local137] = -1;
			}
			for (local155 = 0; local155 < this.anInt5364; local155++) {
				this.anIntArray436[this.anIntArray438[local155]] = local12.method3418();
			}
			this.aClass163_1 = new Class163(this.anIntArray436);
		}
		for (local137 = 0; local137 < this.anInt5364; local137++) {
			this.anIntArray434[this.anIntArray438[local137]] = local12.method3418();
		}
		for (local155 = 0; local155 < this.anInt5364; local155++) {
			this.anIntArray435[this.anIntArray438[local155]] = local12.method3418();
		}
		for (@Pc(223) int local223 = 0; local223 < this.anInt5364; local223++) {
			this.anIntArray437[this.anIntArray438[local223]] = local12.method3401();
		}
		@Pc(256) int local256;
		@Pc(261) int local261;
		@Pc(265) int local265;
		@Pc(273) int local273;
		@Pc(290) int local290;
		for (@Pc(249) int local249 = 0; local249 < this.anInt5364; local249++) {
			local256 = this.anIntArray438[local249];
			local261 = this.anIntArray437[local256];
			local52 = 0;
			local265 = -1;
			this.anIntArrayArray146[local256] = new int[local261];
			for (local273 = 0; local273 < local261; local273++) {
				local290 = this.anIntArrayArray146[local256][local273] = local52 += local12.method3401();
				if (local290 > local265) {
					local265 = local290;
				}
			}
			this.anIntArray439[local256] = local265 + 1;
			if (local265 + 1 == local261) {
				this.anIntArrayArray146[local256] = null;
			}
		}
		if (local45 == 0) {
			return;
		}
		this.aClass163Array1 = new Class163[local54 + 1];
		this.anIntArrayArray145 = new int[local54 + 1][];
		for (local256 = 0; local256 < this.anInt5364; local256++) {
			local261 = this.anIntArray438[local256];
			local265 = this.anIntArray437[local261];
			this.anIntArrayArray145[local261] = new int[this.anIntArray439[local261]];
			for (local273 = 0; local273 < this.anIntArray439[local261]; local273++) {
				this.anIntArrayArray145[local261][local273] = -1;
			}
			for (local290 = 0; local290 < local265; local290++) {
				@Pc(407) int local407;
				if (this.anIntArrayArray146[local261] == null) {
					local407 = local290;
				} else {
					local407 = this.anIntArrayArray146[local261][local290];
				}
				this.anIntArrayArray145[local261][local407] = local12.method3418();
			}
			this.aClass163Array1[local261] = new Class163(this.anIntArrayArray145[local261]);
		}
	}
}
