import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gr")
public final class Class1_Sub1_Sub15 extends Class1_Sub1 {

	@OriginalMember(owner = "client!gr", name = "C", descriptor = "I")
	private int anInt3180;

	@OriginalMember(owner = "client!gr", name = "J", descriptor = "I")
	private int anInt3185;

	@OriginalMember(owner = "client!gr", name = "K", descriptor = "I")
	private int anInt3186;

	@OriginalMember(owner = "client!gr", name = "O", descriptor = "I")
	private int anInt3188;

	@OriginalMember(owner = "client!gr", name = "R", descriptor = "I")
	private int anInt3190;

	@OriginalMember(owner = "client!gr", name = "S", descriptor = "I")
	private int anInt3191;

	@OriginalMember(owner = "client!gr", name = "G", descriptor = "I")
	private int anInt3183 = 0;

	@OriginalMember(owner = "client!gr", name = "I", descriptor = "I")
	private int anInt3184 = 0;

	@OriginalMember(owner = "client!gr", name = "M", descriptor = "I")
	private int anInt3187 = 0;

	@OriginalMember(owner = "client!gr", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub15() {
		super(1, false);
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method7883(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass153_41.method3557(arg0);
		if (super.aClass153_41.aBoolean340) {
			@Pc(31) int[][] local31 = this.method7880(arg0, 0);
			@Pc(35) int[] local35 = local31[0];
			@Pc(39) int[] local39 = local31[1];
			@Pc(43) int[] local43 = local31[2];
			@Pc(47) int[] local47 = local11[0];
			@Pc(51) int[] local51 = local11[1];
			@Pc(55) int[] local55 = local11[2];
			for (@Pc(57) int local57 = 0; local57 < Static87.anInt1964; local57++) {
				this.method2699(local43[local57], local39[local57], local35[local57]);
				this.anInt3186 += this.anInt3184;
				this.anInt3188 += this.anInt3187;
				this.anInt3180 += this.anInt3183;
				while (this.anInt3188 < 0) {
					this.anInt3188 += 4096;
				}
				if (this.anInt3186 < 0) {
					this.anInt3186 = 0;
				}
				while (this.anInt3188 > 4096) {
					this.anInt3188 -= 4096;
				}
				if (this.anInt3186 > 4096) {
					this.anInt3186 = 4096;
				}
				if (this.anInt3180 < 0) {
					this.anInt3180 = 0;
				}
				if (this.anInt3180 > 4096) {
					this.anInt3180 = 4096;
				}
				this.method2696(this.anInt3188, this.anInt3186, this.anInt3180);
				local47[local57] = this.anInt3191;
				local51[local57] = this.anInt3190;
				local55[local57] = this.anInt3185;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(ILclient!io;I)V")
	@Override
	public void method7881(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt3187 = arg1.method4391();
		} else if (arg0 == 1) {
			this.anInt3184 = (arg1.method4432() << 12) / 100;
		} else if (arg0 == 2) {
			this.anInt3183 = (arg1.method4432() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIII)V")
	private void method2696(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(33) int local33 = arg2 <= 2048 ? arg2 * (arg1 + 4096) >> 12 : arg2 + arg1 - (arg1 * arg2 >> 12);
		if (local33 <= 0) {
			this.anInt3191 = this.anInt3190 = this.anInt3185 = arg2;
			return;
		}
		@Pc(52) int local52 = arg0 * 6;
		@Pc(60) int local60 = arg2 + arg2 - local33;
		@Pc(69) int local69 = (local33 - local60 << 12) / local33;
		@Pc(73) int local73 = local52 >> 12;
		@Pc(80) int local80 = local52 - (local73 << 12);
		@Pc(88) int local88 = local69 * local33 >> 12;
		@Pc(94) int local94 = local88 * local80 >> 12;
		@Pc(98) int local98 = local94 + local60;
		@Pc(102) int local102 = local33 - local94;
		if (local73 == 0) {
			this.anInt3190 = local98;
			this.anInt3185 = local60;
			this.anInt3191 = local33;
		} else if (local73 == 1) {
			this.anInt3185 = local60;
			this.anInt3190 = local33;
			this.anInt3191 = local102;
		} else if (local73 == 2) {
			this.anInt3185 = local98;
			this.anInt3190 = local33;
			this.anInt3191 = local60;
		} else if (local73 == 3) {
			this.anInt3185 = local33;
			this.anInt3191 = local60;
			this.anInt3190 = local102;
		} else if (local73 == 4) {
			this.anInt3191 = local98;
			this.anInt3190 = local60;
			this.anInt3185 = local33;
		} else if (local73 == 5) {
			this.anInt3191 = local33;
			this.anInt3185 = local102;
			this.anInt3190 = local60;
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIIB)V")
	private void method2699(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(16) int local16 = arg1 >= arg2 ? arg1 : arg2;
		@Pc(27) int local27 = arg2 >= arg1 ? arg1 : arg2;
		@Pc(34) int local34 = local16 >= arg0 ? local16 : arg0;
		@Pc(41) int local41 = arg0 >= local27 ? local27 : arg0;
		@Pc(46) int local46 = local34 - local41;
		this.anInt3180 = (local34 + local41) / 2;
		if (local46 <= 0) {
			this.anInt3188 = 0;
		} else {
			@Pc(69) int local69 = (local34 - arg2 << 12) / local46;
			@Pc(78) int local78 = (local34 - arg1 << 12) / local46;
			@Pc(87) int local87 = (local34 - arg0 << 12) / local46;
			if (local34 == arg2) {
				this.anInt3188 = local41 == arg1 ? local87 + 20480 : 4096 - local78;
			} else if (local34 == arg1) {
				this.anInt3188 = local41 == arg0 ? local69 + 4096 : -local87 + 12288;
			} else {
				this.anInt3188 = local41 == arg2 ? local78 + 12288 : -local69 + 20480;
			}
			this.anInt3188 /= 6;
		}
		if (this.anInt3180 > 0 && this.anInt3180 < 4096) {
			this.anInt3186 = (local46 << 12) / (this.anInt3180 <= 2048 ? this.anInt3180 * 2 : 8192 - this.anInt3180 * 2);
		} else {
			this.anInt3186 = 0;
		}
	}
}
