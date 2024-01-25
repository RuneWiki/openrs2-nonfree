import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class143 {

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "[I")
	public int[] anIntArray312;

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "[I")
	public int[] anIntArray313;

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "[I")
	public int[] anIntArray314;

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "Lclient!vj;")
	public Class255 aClass255_1;

	@OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
	public int anInt3688;

	@OriginalMember(owner = "client!lf", name = "g", descriptor = "I")
	public int anInt3689;

	@OriginalMember(owner = "client!lf", name = "h", descriptor = "[I")
	public int[] anIntArray315;

	@OriginalMember(owner = "client!lf", name = "i", descriptor = "[[I")
	public int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!lf", name = "j", descriptor = "[[I")
	public int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!lf", name = "l", descriptor = "[I")
	public int[] anIntArray316;

	@OriginalMember(owner = "client!lf", name = "m", descriptor = "I")
	public int anInt3691;

	@OriginalMember(owner = "client!lf", name = "n", descriptor = "[Lclient!vj;")
	public Class255[] aClass255Array1;

	@OriginalMember(owner = "client!lf", name = "o", descriptor = "[I")
	public int[] anIntArray317;

	@OriginalMember(owner = "client!lf", name = "p", descriptor = "I")
	public final int anInt3692;

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "([BI)V")
	public Class143(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt3692 = Static257.method3285(arg0, arg0.length);
		if (this.anInt3692 != arg1) {
			throw new RuntimeException();
		}
		this.method2972(arg0);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(B[B)V")
	private void method2972(@OriginalArg(1) byte[] arg0) {
		@Pc(12) Class2_Sub13 local12 = new Class2_Sub13(Static331.method4431(arg0));
		@Pc(16) int local16 = local12.method3580();
		if (local16 != 5 && local16 != 6) {
			throw new RuntimeException();
		}
		if (local16 >= 6) {
			this.anInt3691 = local12.method3574();
		} else {
			this.anInt3691 = 0;
		}
		@Pc(45) int local45 = local12.method3580();
		this.anInt3688 = local12.method3555();
		@Pc(52) int local52 = 0;
		@Pc(54) int local54 = -1;
		this.anIntArray314 = new int[this.anInt3688];
		for (@Pc(61) int local61 = 0; local61 < this.anInt3688; local61++) {
			this.anIntArray314[local61] = local52 += local12.method3555();
			if (local54 < this.anIntArray314[local61]) {
				local54 = this.anIntArray314[local61];
			}
		}
		this.anInt3689 = local54 + 1;
		this.anIntArray313 = new int[this.anInt3689];
		this.anIntArrayArray22 = new int[this.anInt3689][];
		this.anIntArray316 = new int[this.anInt3689];
		this.anIntArray315 = new int[this.anInt3689];
		this.anIntArray312 = new int[this.anInt3689];
		@Pc(140) int local140;
		@Pc(158) int local158;
		if (local45 != 0) {
			this.anIntArray317 = new int[this.anInt3689];
			for (local140 = 0; local140 < this.anInt3689; local140++) {
				this.anIntArray317[local140] = -1;
			}
			for (local158 = 0; local158 < this.anInt3688; local158++) {
				this.anIntArray317[this.anIntArray314[local158]] = local12.method3574();
			}
			this.aClass255_1 = new Class255(this.anIntArray317);
		}
		for (local140 = 0; local140 < this.anInt3688; local140++) {
			this.anIntArray316[this.anIntArray314[local140]] = local12.method3574();
		}
		for (local158 = 0; local158 < this.anInt3688; local158++) {
			this.anIntArray315[this.anIntArray314[local158]] = local12.method3574();
		}
		for (@Pc(234) int local234 = 0; local234 < this.anInt3688; local234++) {
			this.anIntArray312[this.anIntArray314[local234]] = local12.method3555();
		}
		@Pc(264) int local264;
		@Pc(271) int local271;
		@Pc(279) int local279;
		@Pc(281) int local281;
		@Pc(298) int local298;
		for (@Pc(257) int local257 = 0; local257 < this.anInt3688; local257++) {
			local264 = this.anIntArray314[local257];
			local52 = 0;
			local271 = this.anIntArray312[local264];
			this.anIntArrayArray22[local264] = new int[local271];
			local279 = -1;
			for (local281 = 0; local281 < local271; local281++) {
				local298 = this.anIntArrayArray22[local264][local281] = local52 += local12.method3555();
				if (local279 < local298) {
					local279 = local298;
				}
			}
			this.anIntArray313[local264] = local279 + 1;
			if (local279 + 1 == local271) {
				this.anIntArrayArray22[local264] = null;
			}
		}
		if (local45 == 0) {
			return;
		}
		this.aClass255Array1 = new Class255[local54 + 1];
		this.anIntArrayArray21 = new int[local54 + 1][];
		for (local264 = 0; local264 < this.anInt3688; local264++) {
			local271 = this.anIntArray314[local264];
			local279 = this.anIntArray312[local271];
			this.anIntArrayArray21[local271] = new int[this.anIntArray313[local271]];
			for (local281 = 0; local281 < this.anIntArray313[local271]; local281++) {
				this.anIntArrayArray21[local271][local281] = -1;
			}
			for (local298 = 0; local298 < local279; local298++) {
				@Pc(414) int local414;
				if (this.anIntArrayArray22[local271] == null) {
					local414 = local298;
				} else {
					local414 = this.anIntArrayArray22[local271][local298];
				}
				this.anIntArrayArray21[local271][local414] = local12.method3574();
			}
			this.aClass255Array1[local271] = new Class255(this.anIntArrayArray21[local271]);
		}
	}
}
