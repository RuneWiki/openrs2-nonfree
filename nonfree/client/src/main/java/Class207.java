import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qn")
public final class Class207 {

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "[I")
	public int[] anIntArray468;

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "I")
	public int anInt5647;

	@OriginalMember(owner = "client!qn", name = "d", descriptor = "[I")
	public int[] anIntArray469;

	@OriginalMember(owner = "client!qn", name = "e", descriptor = "I")
	public int anInt5649;

	@OriginalMember(owner = "client!qn", name = "f", descriptor = "[[I")
	public int[][] anIntArrayArray55;

	@OriginalMember(owner = "client!qn", name = "h", descriptor = "[I")
	public int[] anIntArray470;

	@OriginalMember(owner = "client!qn", name = "j", descriptor = "Lclient!sr;")
	public Class228 aClass228_1;

	@OriginalMember(owner = "client!qn", name = "l", descriptor = "[I")
	public int[] anIntArray471;

	@OriginalMember(owner = "client!qn", name = "m", descriptor = "[I")
	public int[] anIntArray472;

	@OriginalMember(owner = "client!qn", name = "n", descriptor = "[[I")
	public int[][] anIntArrayArray56;

	@OriginalMember(owner = "client!qn", name = "o", descriptor = "[I")
	public int[] anIntArray473;

	@OriginalMember(owner = "client!qn", name = "q", descriptor = "I")
	public int anInt5653;

	@OriginalMember(owner = "client!qn", name = "r", descriptor = "[Lclient!sr;")
	public Class228[] aClass228Array1;

	@OriginalMember(owner = "client!qn", name = "p", descriptor = "I")
	public final int anInt5652;

	@OriginalMember(owner = "client!qn", name = "<init>", descriptor = "([BI)V")
	public Class207(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt5652 = Static150.method3424(arg0, arg0.length);
		if (arg1 != this.anInt5652) {
			throw new RuntimeException();
		}
		this.method4553(arg0);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(I[B)V")
	private void method4553(@OriginalArg(1) byte[] arg0) {
		@Pc(12) Class2_Sub23 local12 = new Class2_Sub23(Static309.method4376(arg0));
		@Pc(16) int local16 = local12.method5495();
		if (local16 != 5 && local16 != 6) {
			throw new RuntimeException();
		}
		if (local16 < 6) {
			this.anInt5647 = 0;
		} else {
			this.anInt5647 = local12.method5508();
		}
		@Pc(47) int local47 = local12.method5495();
		this.anInt5653 = local12.method5500();
		@Pc(54) int local54 = 0;
		@Pc(56) int local56 = -1;
		this.anIntArray473 = new int[this.anInt5653];
		for (@Pc(63) int local63 = 0; local63 < this.anInt5653; local63++) {
			this.anIntArray473[local63] = local54 += local12.method5500();
			if (local56 < this.anIntArray473[local63]) {
				local56 = this.anIntArray473[local63];
			}
		}
		this.anInt5649 = local56 + 1;
		this.anIntArrayArray55 = new int[this.anInt5649][];
		this.anIntArray468 = new int[this.anInt5649];
		this.anIntArray470 = new int[this.anInt5649];
		this.anIntArray469 = new int[this.anInt5649];
		this.anIntArray472 = new int[this.anInt5649];
		@Pc(138) int local138;
		@Pc(152) int local152;
		if (local47 != 0) {
			this.anIntArray471 = new int[this.anInt5649];
			for (local138 = 0; local138 < this.anInt5649; local138++) {
				this.anIntArray471[local138] = -1;
			}
			for (local152 = 0; local152 < this.anInt5653; local152++) {
				this.anIntArray471[this.anIntArray473[local152]] = local12.method5508();
			}
			this.aClass228_1 = new Class228(this.anIntArray471);
		}
		for (local138 = 0; local138 < this.anInt5653; local138++) {
			this.anIntArray470[this.anIntArray473[local138]] = local12.method5508();
		}
		for (local152 = 0; local152 < this.anInt5653; local152++) {
			this.anIntArray469[this.anIntArray473[local152]] = local12.method5508();
		}
		for (@Pc(224) int local224 = 0; local224 < this.anInt5653; local224++) {
			this.anIntArray472[this.anIntArray473[local224]] = local12.method5500();
		}
		@Pc(250) int local250;
		@Pc(255) int local255;
		@Pc(259) int local259;
		@Pc(267) int local267;
		@Pc(284) int local284;
		for (@Pc(243) int local243 = 0; local243 < this.anInt5653; local243++) {
			local250 = this.anIntArray473[local243];
			local255 = this.anIntArray472[local250];
			local54 = 0;
			local259 = -1;
			this.anIntArrayArray55[local250] = new int[local255];
			for (local267 = 0; local267 < local255; local267++) {
				local284 = this.anIntArrayArray55[local250][local267] = local54 += local12.method5500();
				if (local259 < local284) {
					local259 = local284;
				}
			}
			this.anIntArray468[local250] = local259 + 1;
			if (local255 == local259 + 1) {
				this.anIntArrayArray55[local250] = null;
			}
		}
		if (local47 == 0) {
			return;
		}
		this.aClass228Array1 = new Class228[local56 + 1];
		this.anIntArrayArray56 = new int[local56 + 1][];
		for (local250 = 0; local250 < this.anInt5653; local250++) {
			local255 = this.anIntArray473[local250];
			local259 = this.anIntArray472[local255];
			this.anIntArrayArray56[local255] = new int[this.anIntArray468[local255]];
			for (local267 = 0; local267 < this.anIntArray468[local255]; local267++) {
				this.anIntArrayArray56[local255][local267] = -1;
			}
			for (local284 = 0; local284 < local259; local284++) {
				@Pc(389) int local389;
				if (this.anIntArrayArray55[local255] == null) {
					local389 = local284;
				} else {
					local389 = this.anIntArrayArray55[local255][local284];
				}
				this.anIntArrayArray56[local255][local389] = local12.method5508();
			}
			this.aClass228Array1[local255] = new Class228(this.anIntArrayArray56[local255]);
		}
	}
}
