import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vw")
public final class Class364 {

	@OriginalMember(owner = "client!vw", name = "c", descriptor = "[[I")
	public int[][] anIntArrayArray60;

	@OriginalMember(owner = "client!vw", name = "d", descriptor = "[I")
	public int[] anIntArray692;

	@OriginalMember(owner = "client!vw", name = "e", descriptor = "Lclient!cj;")
	public Class60 aClass60_1;

	@OriginalMember(owner = "client!vw", name = "f", descriptor = "[I")
	public int[] anIntArray693;

	@OriginalMember(owner = "client!vw", name = "g", descriptor = "[I")
	public int[] anIntArray694;

	@OriginalMember(owner = "client!vw", name = "i", descriptor = "I")
	public int anInt10770;

	@OriginalMember(owner = "client!vw", name = "j", descriptor = "[Lclient!cj;")
	public Class60[] aClass60Array1;

	@OriginalMember(owner = "client!vw", name = "k", descriptor = "[I")
	public int[] anIntArray696;

	@OriginalMember(owner = "client!vw", name = "l", descriptor = "[[B")
	public byte[][] aByteArrayArray25;

	@OriginalMember(owner = "client!vw", name = "n", descriptor = "I")
	public int anInt10772;

	@OriginalMember(owner = "client!vw", name = "o", descriptor = "[I")
	public int[] anIntArray697;

	@OriginalMember(owner = "client!vw", name = "p", descriptor = "I")
	public int anInt10773;

	@OriginalMember(owner = "client!vw", name = "q", descriptor = "[[I")
	public int[][] anIntArrayArray61;

	@OriginalMember(owner = "client!vw", name = "t", descriptor = "[I")
	public int[] anIntArray698;

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "I")
	public final int anInt10768;

	@OriginalMember(owner = "client!vw", name = "v", descriptor = "[B")
	private byte[] aByteArray133;

	@OriginalMember(owner = "client!vw", name = "<init>", descriptor = "([BI[B)V")
	public Class364(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.anInt10768 = Static487.method7985(arg0.length, arg0);
		if (arg1 != this.anInt10768) {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			if (arg2.length != 64) {
				throw new RuntimeException();
			}
			this.aByteArray133 = Static98.method2590(0, arg0, arg0.length);
			for (@Pc(40) int local40 = 0; local40 < 64; local40++) {
				if (arg2[local40] != this.aByteArray133[local40]) {
					throw new RuntimeException();
				}
			}
		}
		this.method8980(arg0);
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(B[B)V")
	private void method8980(@OriginalArg(1) byte[] arg0) {
		@Pc(12) Class2_Sub11 local12 = new Class2_Sub11(Static562.method8438(arg0));
		@Pc(16) int local16 = local12.method8383();
		if (local16 < 5 || local16 > 6) {
			throw new RuntimeException();
		}
		if (local16 < 6) {
			this.anInt10772 = 0;
		} else {
			this.anInt10772 = local12.method8381();
		}
		@Pc(45) int local45 = local12.method8383();
		@Pc(56) boolean local56 = (local45 & 0x1) != 0;
		@Pc(64) boolean local64 = (local45 & 0x2) != 0;
		this.anInt10770 = local12.method8326();
		@Pc(71) int local71 = 0;
		this.anIntArray698 = new int[this.anInt10770];
		@Pc(78) int local78 = -1;
		for (@Pc(80) int local80 = 0; local80 < this.anInt10770; local80++) {
			this.anIntArray698[local80] = local71 += local12.method8326();
			if (local78 < this.anIntArray698[local80]) {
				local78 = this.anIntArray698[local80];
			}
		}
		this.anInt10773 = local78 + 1;
		if (local64) {
			this.aByteArrayArray25 = new byte[this.anInt10773][];
		}
		this.anIntArray696 = new int[this.anInt10773];
		this.anIntArray693 = new int[this.anInt10773];
		this.anIntArray694 = new int[this.anInt10773];
		this.anIntArray692 = new int[this.anInt10773];
		this.anIntArrayArray60 = new int[this.anInt10773][];
		@Pc(159) int local159;
		@Pc(173) int local173;
		if (local56) {
			this.anIntArray697 = new int[this.anInt10773];
			for (local159 = 0; local159 < this.anInt10773; local159++) {
				this.anIntArray697[local159] = -1;
			}
			for (local173 = 0; local173 < this.anInt10770; local173++) {
				this.anIntArray697[this.anIntArray698[local173]] = local12.method8381();
			}
			this.aClass60_1 = new Class60(this.anIntArray697);
		}
		for (local159 = 0; local159 < this.anInt10770; local159++) {
			this.anIntArray696[this.anIntArray698[local159]] = local12.method8381();
		}
		if (local64) {
			for (local173 = 0; local173 < this.anInt10770; local173++) {
				@Pc(240) byte[] local240 = new byte[64];
				local12.method8385(0, 64, local240);
				this.aByteArrayArray25[this.anIntArray698[local173]] = local240;
			}
		}
		for (local173 = 0; local173 < this.anInt10770; local173++) {
			this.anIntArray692[this.anIntArray698[local173]] = local12.method8381();
		}
		for (@Pc(280) int local280 = 0; local280 < this.anInt10770; local280++) {
			this.anIntArray694[this.anIntArray698[local280]] = local12.method8326();
		}
		@Pc(306) int local306;
		@Pc(313) int local313;
		@Pc(315) int local315;
		@Pc(323) int local323;
		@Pc(340) int local340;
		for (@Pc(299) int local299 = 0; local299 < this.anInt10770; local299++) {
			local306 = this.anIntArray698[local299];
			local71 = 0;
			local313 = this.anIntArray694[local306];
			local315 = -1;
			this.anIntArrayArray60[local306] = new int[local313];
			for (local323 = 0; local323 < local313; local323++) {
				local340 = this.anIntArrayArray60[local306][local323] = local71 += local12.method8326();
				if (local340 > local315) {
					local315 = local340;
				}
			}
			this.anIntArray693[local306] = local315 + 1;
			if (local313 == local315 + 1) {
				this.anIntArrayArray60[local306] = null;
			}
		}
		if (!local56) {
			return;
		}
		this.anIntArrayArray61 = new int[local78 + 1][];
		this.aClass60Array1 = new Class60[local78 + 1];
		for (local306 = 0; local306 < this.anInt10770; local306++) {
			local313 = this.anIntArray698[local306];
			local315 = this.anIntArray694[local313];
			this.anIntArrayArray61[local313] = new int[this.anIntArray693[local313]];
			for (local323 = 0; local323 < this.anIntArray693[local313]; local323++) {
				this.anIntArrayArray61[local313][local323] = -1;
			}
			for (local340 = 0; local340 < local315; local340++) {
				@Pc(458) int local458;
				if (this.anIntArrayArray60[local313] == null) {
					local458 = local340;
				} else {
					local458 = this.anIntArrayArray60[local313][local340];
				}
				this.anIntArrayArray61[local313][local458] = local12.method8381();
			}
			this.aClass60Array1[local313] = new Class60(this.anIntArrayArray61[local313]);
		}
	}
}
