import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public final class Class2_Sub1_Sub27 extends Class2_Sub1 {

	@OriginalMember(owner = "client!m", name = "I", descriptor = "[[I")
	private int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!m", name = "T", descriptor = "[[I")
	private int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!m", name = "X", descriptor = "[I")
	private int[] anIntArray367;

	@OriginalMember(owner = "client!m", name = "cb", descriptor = "I")
	private int anInt3745;

	@OriginalMember(owner = "client!m", name = "fb", descriptor = "I")
	private int anInt3748;

	@OriginalMember(owner = "client!m", name = "ib", descriptor = "I")
	private int anInt3750;

	@OriginalMember(owner = "client!m", name = "L", descriptor = "I")
	private int anInt3731 = 81;

	@OriginalMember(owner = "client!m", name = "R", descriptor = "I")
	private int anInt3737 = 8;

	@OriginalMember(owner = "client!m", name = "U", descriptor = "I")
	private int anInt3739 = 4;

	@OriginalMember(owner = "client!m", name = "N", descriptor = "I")
	private int anInt3733 = 204;

	@OriginalMember(owner = "client!m", name = "eb", descriptor = "I")
	private int anInt3747 = 1024;

	@OriginalMember(owner = "client!m", name = "gb", descriptor = "I")
	private int anInt3749 = 1024;

	@OriginalMember(owner = "client!m", name = "S", descriptor = "I")
	private int anInt3738 = 409;

	@OriginalMember(owner = "client!m", name = "jb", descriptor = "I")
	private int anInt3751 = 0;

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub27() {
		super(0, true);
	}

	@OriginalMember(owner = "client!m", name = "e", descriptor = "(I)V")
	@Override
	public void method4595() {
		this.method3080();
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!oe;IB)V")
	@Override
	public void method4594(@OriginalArg(0) Class2_Sub16 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3739 = arg0.method2146();
		} else if (arg1 == 1) {
			this.anInt3737 = arg0.method2146();
		} else if (arg1 == 2) {
			this.anInt3738 = arg0.method2130();
		} else if (arg1 == 3) {
			this.anInt3733 = arg0.method2130();
		} else if (arg1 == 4) {
			this.anInt3747 = arg0.method2130();
		} else if (arg1 == 5) {
			this.anInt3751 = arg0.method2130();
		} else if (arg1 == 6) {
			this.anInt3731 = arg0.method2130();
		} else if (arg1 == 7) {
			this.anInt3749 = arg0.method2130();
		}
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4587(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = this.aClass174_41.method4334(arg0);
		if (this.aClass174_41.aBoolean364) {
			@Pc(25) int local25 = 0;
			@Pc(32) int local32;
			for (local32 = Static272.anIntArray521[arg0] + this.anInt3751; local32 < 0; local32 += 4096) {
			}
			while (local32 > 4096) {
				local32 -= 4096;
			}
			while (this.anInt3737 > local25 && local32 >= this.anIntArray367[local25]) {
				local25++;
			}
			@Pc(63) int local63 = local25 - 1;
			@Pc(74) boolean local74 = (local25 & 0x1) == 0;
			@Pc(79) int local79 = this.anIntArray367[local25];
			@Pc(86) int local86 = this.anIntArray367[local25 - 1];
			if (local32 > this.anInt3748 + local86 && local32 < local79 - this.anInt3748) {
				for (@Pc(105) int local105 = 0; local105 < Static281.anInt5558; local105++) {
					@Pc(110) int local110 = 0;
					@Pc(119) int local119 = local74 ? this.anInt3747 : -this.anInt3747;
					@Pc(130) int local130;
					for (local130 = Static234.anIntArray462[local105] + (local119 * this.anInt3750 >> 12); local130 < 0; local130 += 4096) {
					}
					while (local130 > 4096) {
						local130 -= 4096;
					}
					while (this.anInt3739 > local110 && local130 >= this.anIntArrayArray22[local63][local110]) {
						local110++;
					}
					@Pc(170) int local170 = this.anIntArrayArray22[local63][local110];
					@Pc(174) int local174 = local110 - 1;
					@Pc(181) int local181 = this.anIntArrayArray22[local63][local174];
					if (this.anInt3748 + local181 < local130 && local170 - this.anInt3748 > local130) {
						local19[local105] = this.anIntArrayArray21[local63][local174];
					} else {
						local19[local105] = 0;
					}
				}
			} else {
				Static323.method3553(local19, 0, Static281.anInt5558, 0);
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!m", name = "g", descriptor = "(I)V")
	private void method3080() {
		@Pc(8) Random local8 = new Random((long) this.anInt3737);
		this.anIntArray367 = new int[this.anInt3737 + 1];
		this.anIntArrayArray21 = new int[this.anInt3737][this.anInt3739];
		this.anInt3750 = 4096 / this.anInt3739;
		@Pc(39) int local39 = this.anInt3750 / 2;
		this.anIntArray367[0] = 0;
		this.anIntArrayArray22 = new int[this.anInt3737][this.anInt3739 + 1];
		this.anInt3745 = 4096 / this.anInt3737;
		this.anInt3748 = this.anInt3731 / 2;
		@Pc(74) int local74 = this.anInt3745 / 2;
		for (@Pc(76) int local76 = 0; local76 < this.anInt3737; local76++) {
			@Pc(86) int local86;
			@Pc(100) int local100;
			if (local76 > 0) {
				local86 = this.anInt3745;
				local100 = (Static222.method3672(local8, 4096) - 2048) * this.anInt3733 >> 12;
				@Pc(108) int local108 = local86 + (local100 * local74 >> 12);
				this.anIntArray367[local76] = local108 + this.anIntArray367[local76 - 1];
			}
			this.anIntArrayArray22[local76][0] = 0;
			for (local86 = 0; local86 < this.anInt3739; local86++) {
				if (local86 > 0) {
					local100 = this.anInt3750;
					@Pc(158) int local158 = (Static222.method3672(local8, 4096) - 2048) * this.anInt3738 >> 12;
					local100 += local39 * local158 >> 12;
					this.anIntArrayArray22[local76][local86] = local100 + this.anIntArrayArray22[local76][local86 - 1];
				}
				this.anIntArrayArray21[local76][local86] = this.anInt3749 > 0 ? 4096 - Static222.method3672(local8, this.anInt3749) : 4096;
			}
			this.anIntArrayArray22[local76][this.anInt3739] = 4096;
		}
		this.anIntArray367[this.anInt3737] = 4096;
	}
}
