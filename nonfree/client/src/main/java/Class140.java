import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class140 {

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "[I")
	public int[] anIntArray463;

	@OriginalMember(owner = "client!qc", name = "h", descriptor = "I")
	public int anInt4192;

	@OriginalMember(owner = "client!qc", name = "i", descriptor = "I")
	public int anInt4193;

	@OriginalMember(owner = "client!qc", name = "j", descriptor = "Lclient!rl;")
	public Class149 aClass149_1;

	@OriginalMember(owner = "client!qc", name = "k", descriptor = "[Lclient!rl;")
	public Class149[] aClass149Array1;

	@OriginalMember(owner = "client!qc", name = "n", descriptor = "[[I")
	public int[][] anIntArrayArray29;

	@OriginalMember(owner = "client!qc", name = "o", descriptor = "[I")
	public int[] anIntArray464;

	@OriginalMember(owner = "client!qc", name = "p", descriptor = "[I")
	public int[] anIntArray465;

	@OriginalMember(owner = "client!qc", name = "q", descriptor = "I")
	public int anInt4196;

	@OriginalMember(owner = "client!qc", name = "s", descriptor = "[I")
	public int[] anIntArray466;

	@OriginalMember(owner = "client!qc", name = "t", descriptor = "[I")
	public int[] anIntArray467;

	@OriginalMember(owner = "client!qc", name = "u", descriptor = "[[I")
	public int[][] anIntArrayArray30;

	@OriginalMember(owner = "client!qc", name = "v", descriptor = "[I")
	public int[] anIntArray468;

	@OriginalMember(owner = "client!qc", name = "l", descriptor = "I")
	public int anInt4194;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "([BI)V")
	public Class140(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt4194 = Static9.method168(arg0, arg0.length);
		if (this.anInt4194 != arg1) {
			throw new RuntimeException();
		}
		this.method3599(arg0);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I[B)V")
	private void method3599(@OriginalArg(1) byte[] arg0) {
		@Pc(12) Class1_Sub13 local12 = new Class1_Sub13(Static178.method3132(arg0));
		@Pc(16) int local16 = local12.method1853();
		if (local16 != 5 && local16 != 6) {
			throw new RuntimeException();
		}
		if (local16 < 6) {
			this.anInt4196 = 0;
		} else {
			this.anInt4196 = local12.method1860();
		}
		@Pc(48) int local48 = local12.method1853();
		@Pc(50) int local50 = -1;
		this.anInt4192 = local12.method1879();
		@Pc(59) int local59 = 0;
		this.anIntArray463 = new int[this.anInt4192];
		@Pc(66) int local66;
		for (local66 = 0; local66 < this.anInt4192; local66++) {
			this.anIntArray463[local66] = local59 += local12.method1879();
			if (local50 < this.anIntArray463[local66]) {
				local50 = this.anIntArray463[local66];
			}
		}
		this.anInt4193 = local50 + 1;
		this.anIntArray468 = new int[this.anInt4193];
		this.anIntArray465 = new int[this.anInt4193];
		this.anIntArray466 = new int[this.anInt4193];
		this.anIntArray467 = new int[this.anInt4193];
		this.anIntArrayArray30 = new int[this.anInt4193][];
		if (local48 != 0) {
			this.anIntArray464 = new int[this.anInt4193];
			for (local66 = 0; local66 < this.anInt4193; local66++) {
				this.anIntArray464[local66] = -1;
			}
			for (local66 = 0; local66 < this.anInt4192; local66++) {
				this.anIntArray464[this.anIntArray463[local66]] = local12.method1860();
			}
			this.aClass149_1 = new Class149(this.anIntArray464);
		}
		for (local66 = 0; local66 < this.anInt4192; local66++) {
			this.anIntArray467[this.anIntArray463[local66]] = local12.method1860();
		}
		for (local66 = 0; local66 < this.anInt4192; local66++) {
			this.anIntArray468[this.anIntArray463[local66]] = local12.method1860();
		}
		for (local66 = 0; local66 < this.anInt4192; local66++) {
			this.anIntArray466[this.anIntArray463[local66]] = local12.method1879();
		}
		@Pc(277) int local277;
		@Pc(282) int local282;
		@Pc(284) int local284;
		@Pc(292) int local292;
		for (local66 = 0; local66 < this.anInt4192; local66++) {
			local59 = 0;
			local277 = this.anIntArray463[local66];
			local282 = this.anIntArray466[local277];
			local284 = -1;
			this.anIntArrayArray30[local277] = new int[local282];
			for (local292 = 0; local292 < local282; local292++) {
				@Pc(314) int local314 = this.anIntArrayArray30[local277][local292] = local59 += local12.method1879();
				if (local314 > local284) {
					local284 = local314;
				}
			}
			this.anIntArray465[local277] = local284 + 1;
			if (local284 + 1 == local282) {
				this.anIntArrayArray30[local277] = null;
			}
		}
		if (local48 == 0) {
			return;
		}
		this.aClass149Array1 = new Class149[local50 + 1];
		this.anIntArrayArray29 = new int[local50 + 1][];
		for (local66 = 0; local66 < this.anInt4192; local66++) {
			local277 = this.anIntArray463[local66];
			local282 = this.anIntArray466[local277];
			this.anIntArrayArray29[local277] = new int[this.anIntArray465[local277]];
			for (local284 = 0; local284 < this.anIntArray465[local277]; local284++) {
				this.anIntArrayArray29[local277][local284] = -1;
			}
			for (local284 = 0; local284 < local282; local284++) {
				if (this.anIntArrayArray30[local277] == null) {
					local292 = local284;
				} else {
					local292 = this.anIntArrayArray30[local277][local284];
				}
				this.anIntArrayArray29[local277][local292] = local12.method1860();
			}
			this.aClass149Array1[local277] = new Class149(this.anIntArrayArray29[local277]);
		}
	}
}
