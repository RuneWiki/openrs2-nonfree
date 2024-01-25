import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ss")
public final class Class238 {

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "I")
	public int anInt6692;

	@OriginalMember(owner = "client!ss", name = "c", descriptor = "[I")
	public int[] anIntArray533;

	@OriginalMember(owner = "client!ss", name = "d", descriptor = "Lclient!ml;")
	public Class161 aClass161_1;

	@OriginalMember(owner = "client!ss", name = "e", descriptor = "I")
	public int anInt6694;

	@OriginalMember(owner = "client!ss", name = "g", descriptor = "[I")
	public int[] anIntArray534;

	@OriginalMember(owner = "client!ss", name = "h", descriptor = "[I")
	public int[] anIntArray535;

	@OriginalMember(owner = "client!ss", name = "l", descriptor = "[I")
	public int[] anIntArray536;

	@OriginalMember(owner = "client!ss", name = "m", descriptor = "[Lclient!ml;")
	public Class161[] aClass161Array1;

	@OriginalMember(owner = "client!ss", name = "o", descriptor = "[I")
	public int[] anIntArray537;

	@OriginalMember(owner = "client!ss", name = "p", descriptor = "I")
	public int anInt6698;

	@OriginalMember(owner = "client!ss", name = "q", descriptor = "[[I")
	public int[][] anIntArrayArray48;

	@OriginalMember(owner = "client!ss", name = "r", descriptor = "[I")
	public int[] anIntArray538;

	@OriginalMember(owner = "client!ss", name = "t", descriptor = "[[I")
	public int[][] anIntArrayArray49;

	@OriginalMember(owner = "client!ss", name = "n", descriptor = "I")
	public final int anInt6697;

	@OriginalMember(owner = "client!ss", name = "<init>", descriptor = "([BI)V")
	public Class238(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt6697 = Static22.method359(arg0.length, arg0);
		if (arg1 != this.anInt6697) {
			throw new RuntimeException();
		}
		this.method5407(arg0);
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "([BZ)V")
	private void method5407(@OriginalArg(0) byte[] arg0) {
		@Pc(12) Class4_Sub20 local12 = new Class4_Sub20(Static63.method1457(arg0));
		@Pc(16) int local16 = local12.method4614();
		if (local16 != 5 && local16 != 6) {
			throw new RuntimeException();
		}
		if (local16 < 6) {
			this.anInt6694 = 0;
		} else {
			this.anInt6694 = local12.method4595();
		}
		@Pc(45) int local45 = local12.method4614();
		this.anInt6692 = local12.method4560();
		@Pc(52) int local52 = 0;
		this.anIntArray538 = new int[this.anInt6692];
		@Pc(59) int local59 = -1;
		for (@Pc(61) int local61 = 0; local61 < this.anInt6692; local61++) {
			this.anIntArray538[local61] = local52 += local12.method4560();
			if (this.anIntArray538[local61] > local59) {
				local59 = this.anIntArray538[local61];
			}
		}
		this.anInt6698 = local59 + 1;
		this.anIntArray534 = new int[this.anInt6698];
		this.anIntArray537 = new int[this.anInt6698];
		this.anIntArray533 = new int[this.anInt6698];
		this.anIntArray536 = new int[this.anInt6698];
		this.anIntArrayArray48 = new int[this.anInt6698][];
		@Pc(144) int local144;
		@Pc(162) int local162;
		if (local45 != 0) {
			this.anIntArray535 = new int[this.anInt6698];
			for (local144 = 0; local144 < this.anInt6698; local144++) {
				this.anIntArray535[local144] = -1;
			}
			for (local162 = 0; local162 < this.anInt6692; local162++) {
				this.anIntArray535[this.anIntArray538[local162]] = local12.method4595();
			}
			this.aClass161_1 = new Class161(this.anIntArray535);
		}
		for (local144 = 0; local144 < this.anInt6692; local144++) {
			this.anIntArray537[this.anIntArray538[local144]] = local12.method4595();
		}
		for (local162 = 0; local162 < this.anInt6692; local162++) {
			this.anIntArray534[this.anIntArray538[local162]] = local12.method4595();
		}
		for (@Pc(226) int local226 = 0; local226 < this.anInt6692; local226++) {
			this.anIntArray533[this.anIntArray538[local226]] = local12.method4560();
		}
		@Pc(252) int local252;
		@Pc(259) int local259;
		@Pc(261) int local261;
		@Pc(269) int local269;
		@Pc(286) int local286;
		for (@Pc(245) int local245 = 0; local245 < this.anInt6692; local245++) {
			local252 = this.anIntArray538[local245];
			local52 = 0;
			local259 = this.anIntArray533[local252];
			local261 = -1;
			this.anIntArrayArray48[local252] = new int[local259];
			for (local269 = 0; local269 < local259; local269++) {
				local286 = this.anIntArrayArray48[local252][local269] = local52 += local12.method4560();
				if (local261 < local286) {
					local261 = local286;
				}
			}
			this.anIntArray536[local252] = local261 + 1;
			if (local261 + 1 == local259) {
				this.anIntArrayArray48[local252] = null;
			}
		}
		if (local45 == 0) {
			return;
		}
		this.aClass161Array1 = new Class161[local59 + 1];
		this.anIntArrayArray49 = new int[local59 + 1][];
		for (local252 = 0; local252 < this.anInt6692; local252++) {
			local259 = this.anIntArray538[local252];
			local261 = this.anIntArray533[local259];
			this.anIntArrayArray49[local259] = new int[this.anIntArray536[local259]];
			for (local269 = 0; local269 < this.anIntArray536[local259]; local269++) {
				this.anIntArrayArray49[local259][local269] = -1;
			}
			for (local286 = 0; local286 < local261; local286++) {
				@Pc(398) int local398;
				if (this.anIntArrayArray48[local259] == null) {
					local398 = local286;
				} else {
					local398 = this.anIntArrayArray48[local259][local286];
				}
				this.anIntArrayArray49[local259][local398] = local12.method4595();
			}
			this.aClass161Array1[local259] = new Class161(this.anIntArrayArray49[local259]);
		}
	}
}
