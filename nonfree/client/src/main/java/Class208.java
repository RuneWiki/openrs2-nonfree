import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vm")
public final class Class208 {

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "Lclient!qq;")
	public Class169 aClass169_1;

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "[I")
	public int[] anIntArray542;

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "I")
	public int anInt6504;

	@OriginalMember(owner = "client!vm", name = "d", descriptor = "[Lclient!qq;")
	public Class169[] aClass169Array1;

	@OriginalMember(owner = "client!vm", name = "f", descriptor = "[I")
	public int[] anIntArray543;

	@OriginalMember(owner = "client!vm", name = "h", descriptor = "[I")
	public int[] anIntArray544;

	@OriginalMember(owner = "client!vm", name = "i", descriptor = "[[I")
	public int[][] anIntArrayArray60;

	@OriginalMember(owner = "client!vm", name = "j", descriptor = "[[I")
	public int[][] anIntArrayArray61;

	@OriginalMember(owner = "client!vm", name = "m", descriptor = "[I")
	public int[] anIntArray545;

	@OriginalMember(owner = "client!vm", name = "n", descriptor = "[I")
	public int[] anIntArray546;

	@OriginalMember(owner = "client!vm", name = "q", descriptor = "I")
	public int anInt6511;

	@OriginalMember(owner = "client!vm", name = "s", descriptor = "[I")
	public int[] anIntArray547;

	@OriginalMember(owner = "client!vm", name = "t", descriptor = "I")
	public int anInt6513;

	@OriginalMember(owner = "client!vm", name = "k", descriptor = "I")
	public final int anInt6507;

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "([BI)V")
	public Class208(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt6507 = Static12.method221(arg0, arg0.length);
		if (this.anInt6507 != arg1) {
			throw new RuntimeException();
		}
		this.method5498(arg0);
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(I[B)V")
	private void method5498(@OriginalArg(1) byte[] arg0) {
		@Pc(12) Class3_Sub4 local12 = new Class3_Sub4(Static274.method5037(arg0));
		@Pc(16) int local16 = local12.method3643();
		if (local16 != 5 && local16 != 6) {
			throw new RuntimeException();
		}
		if (local16 >= 6) {
			this.anInt6513 = local12.method3642();
		} else {
			this.anInt6513 = 0;
		}
		@Pc(45) int local45 = local12.method3643();
		this.anInt6511 = local12.method3649();
		@Pc(52) int local52 = 0;
		@Pc(54) int local54 = -1;
		this.anIntArray545 = new int[this.anInt6511];
		for (@Pc(61) int local61 = 0; local61 < this.anInt6511; local61++) {
			this.anIntArray545[local61] = local52 += local12.method3649();
			if (this.anIntArray545[local61] > local54) {
				local54 = this.anIntArray545[local61];
			}
		}
		this.anInt6504 = local54 + 1;
		this.anIntArray547 = new int[this.anInt6504];
		this.anIntArray543 = new int[this.anInt6504];
		this.anIntArray542 = new int[this.anInt6504];
		this.anIntArrayArray61 = new int[this.anInt6504][];
		this.anIntArray546 = new int[this.anInt6504];
		@Pc(129) int local129;
		@Pc(147) int local147;
		if (local45 != 0) {
			this.anIntArray544 = new int[this.anInt6504];
			for (local129 = 0; local129 < this.anInt6504; local129++) {
				this.anIntArray544[local129] = -1;
			}
			for (local147 = 0; local147 < this.anInt6511; local147++) {
				this.anIntArray544[this.anIntArray545[local147]] = local12.method3642();
			}
			this.aClass169_1 = new Class169(this.anIntArray544);
		}
		for (local129 = 0; local129 < this.anInt6511; local129++) {
			this.anIntArray547[this.anIntArray545[local129]] = local12.method3642();
		}
		for (local147 = 0; local147 < this.anInt6511; local147++) {
			this.anIntArray543[this.anIntArray545[local147]] = local12.method3642();
		}
		for (@Pc(227) int local227 = 0; local227 < this.anInt6511; local227++) {
			this.anIntArray542[this.anIntArray545[local227]] = local12.method3649();
		}
		@Pc(257) int local257;
		@Pc(264) int local264;
		@Pc(272) int local272;
		@Pc(274) int local274;
		@Pc(291) int local291;
		for (@Pc(250) int local250 = 0; local250 < this.anInt6511; local250++) {
			local257 = this.anIntArray545[local250];
			local52 = 0;
			local264 = this.anIntArray542[local257];
			this.anIntArrayArray61[local257] = new int[local264];
			local272 = -1;
			for (local274 = 0; local274 < local264; local274++) {
				local291 = this.anIntArrayArray61[local257][local274] = local52 += local12.method3649();
				if (local272 < local291) {
					local272 = local291;
				}
			}
			this.anIntArray546[local257] = local272 + 1;
			if (local272 + 1 == local264) {
				this.anIntArrayArray61[local257] = null;
			}
		}
		if (local45 == 0) {
			return;
		}
		this.anIntArrayArray60 = new int[local54 + 1][];
		this.aClass169Array1 = new Class169[local54 + 1];
		for (local257 = 0; local257 < this.anInt6511; local257++) {
			local264 = this.anIntArray545[local257];
			local272 = this.anIntArray542[local264];
			this.anIntArrayArray60[local264] = new int[this.anIntArray546[local264]];
			for (local274 = 0; local274 < this.anIntArray546[local264]; local274++) {
				this.anIntArrayArray60[local264][local274] = -1;
			}
			for (local291 = 0; local291 < local272; local291++) {
				@Pc(400) int local400;
				if (this.anIntArrayArray61[local264] == null) {
					local400 = local291;
				} else {
					local400 = this.anIntArrayArray61[local264][local291];
				}
				this.anIntArrayArray60[local264][local400] = local12.method3642();
			}
			this.aClass169Array1[local264] = new Class169(this.anIntArrayArray60[local264]);
		}
	}
}
