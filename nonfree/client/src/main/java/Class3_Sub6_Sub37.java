import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vo")
public final class Class3_Sub6_Sub37 extends Class3_Sub6 {

	@OriginalMember(owner = "client!vo", name = "D", descriptor = "I")
	private int anInt9171;

	@OriginalMember(owner = "client!vo", name = "K", descriptor = "I")
	private int anInt9176;

	@OriginalMember(owner = "client!vo", name = "M", descriptor = "I")
	private int anInt9178;

	@OriginalMember(owner = "client!vo", name = "N", descriptor = "I")
	private int anInt9179;

	@OriginalMember(owner = "client!vo", name = "Q", descriptor = "I")
	private int anInt9181;

	@OriginalMember(owner = "client!vo", name = "W", descriptor = "I")
	private int anInt9187;

	@OriginalMember(owner = "client!vo", name = "R", descriptor = "I")
	private int anInt9182 = 0;

	@OriginalMember(owner = "client!vo", name = "J", descriptor = "I")
	private int anInt9175 = 0;

	@OriginalMember(owner = "client!vo", name = "F", descriptor = "I")
	private int anInt9172 = 0;

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub37() {
		super(1, false);
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIII)V")
	private void method7585(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(35) int local35 = arg0 > 2048 ? arg0 + arg2 - (arg0 * arg2 >> 12) : (arg2 + 4096) * arg0 >> 12;
		if (local35 <= 0) {
			this.anInt9187 = this.anInt9181 = this.anInt9176 = arg0;
			return;
		}
		@Pc(54) int local54 = arg1 * 6;
		@Pc(61) int local61 = arg0 + arg0 - local35;
		@Pc(70) int local70 = (local35 - local61 << 12) / local35;
		@Pc(74) int local74 = local54 >> 12;
		@Pc(81) int local81 = local54 - (local74 << 12);
		@Pc(89) int local89 = local70 * local35 >> 12;
		@Pc(95) int local95 = local89 * local81 >> 12;
		@Pc(99) int local99 = local95 + local61;
		@Pc(104) int local104 = local35 - local95;
		if (local74 == 0) {
			this.anInt9181 = local99;
			this.anInt9187 = local35;
			this.anInt9176 = local61;
		} else if (local74 == 1) {
			this.anInt9181 = local35;
			this.anInt9187 = local104;
			this.anInt9176 = local61;
		} else if (local74 == 2) {
			this.anInt9187 = local61;
			this.anInt9176 = local99;
			this.anInt9181 = local35;
		} else if (local74 == 3) {
			this.anInt9187 = local61;
			this.anInt9181 = local104;
			this.anInt9176 = local35;
		} else if (local74 == 4) {
			this.anInt9176 = local35;
			this.anInt9187 = local99;
			this.anInt9181 = local61;
		} else if (local74 == 5) {
			this.anInt9181 = local61;
			this.anInt9176 = local104;
			this.anInt9187 = local35;
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method7776(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass155_41.method3666(arg0);
		if (super.aClass155_41.aBoolean306) {
			@Pc(27) int[][] local27 = this.method7773(0, arg0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local11[0];
			@Pc(47) int[] local47 = local11[1];
			@Pc(51) int[] local51 = local11[2];
			for (@Pc(53) int local53 = 0; local53 < Static521.anInt8383; local53++) {
				this.method7588(local35[local53], local31[local53], local39[local53]);
				this.anInt9179 += this.anInt9175;
				this.anInt9171 += this.anInt9172;
				this.anInt9178 += this.anInt9182;
				while (this.anInt9179 < 0) {
					this.anInt9179 += 4096;
				}
				if (this.anInt9171 < 0) {
					this.anInt9171 = 0;
				}
				while (this.anInt9179 > 4096) {
					this.anInt9179 -= 4096;
				}
				if (this.anInt9178 < 0) {
					this.anInt9178 = 0;
				}
				if (this.anInt9171 > 4096) {
					this.anInt9171 = 4096;
				}
				if (this.anInt9178 > 4096) {
					this.anInt9178 = 4096;
				}
				this.method7585(this.anInt9178, this.anInt9179, this.anInt9171);
				local43[local53] = this.anInt9187;
				local47[local53] = this.anInt9181;
				local51[local53] = this.anInt9176;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(ILclient!np;I)V")
	@Override
	public void method7771(@OriginalArg(1) Class3_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt9175 = arg0.method5231();
		} else if (arg1 == 1) {
			this.anInt9172 = (arg0.method5212() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt9182 = (arg0.method5212() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "(IIII)V")
	private void method7588(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(17) int local17 = arg1 > arg0 ? arg1 : arg0;
		@Pc(24) int local24 = arg2 > local17 ? arg2 : local17;
		@Pc(31) int local31 = arg1 < arg0 ? arg1 : arg0;
		@Pc(42) int local42 = local31 > arg2 ? arg2 : local31;
		this.anInt9178 = (local42 + local24) / 2;
		@Pc(53) int local53 = local24 - local42;
		if (local53 <= 0) {
			this.anInt9179 = 0;
		} else {
			@Pc(69) int local69 = (local24 - arg1 << 12) / local53;
			@Pc(78) int local78 = (local24 - arg0 << 12) / local53;
			@Pc(87) int local87 = (local24 - arg2 << 12) / local53;
			if (arg1 == local24) {
				this.anInt9179 = local42 == arg0 ? local87 + 20480 : -local78 + 4096;
			} else if (arg0 == local24) {
				this.anInt9179 = arg2 == local42 ? local69 + 4096 : -local87 + 12288;
			} else {
				this.anInt9179 = arg1 == local42 ? local78 + 12288 : -local69 + 20480;
			}
			this.anInt9179 /= 6;
		}
		if (this.anInt9178 > 0 && this.anInt9178 < 4096) {
			this.anInt9171 = (local53 << 12) / (this.anInt9178 <= 2048 ? this.anInt9178 * 2 : 8192 - this.anInt9178 * 2);
		} else {
			this.anInt9171 = 0;
		}
	}
}
