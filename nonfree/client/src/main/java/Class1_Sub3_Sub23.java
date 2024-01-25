import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nca")
public final class Class1_Sub3_Sub23 extends Class1_Sub3 {

	@OriginalMember(owner = "client!nca", name = "F", descriptor = "I")
	private int anInt6016;

	@OriginalMember(owner = "client!nca", name = "G", descriptor = "[I")
	private int[] anIntArray424;

	@OriginalMember(owner = "client!nca", name = "J", descriptor = "I")
	private int anInt6019;

	@OriginalMember(owner = "client!nca", name = "K", descriptor = "[[I")
	private int[][] anIntArrayArray49;

	@OriginalMember(owner = "client!nca", name = "T", descriptor = "I")
	private int anInt6027;

	@OriginalMember(owner = "client!nca", name = "V", descriptor = "[[I")
	private int[][] anIntArrayArray50;

	@OriginalMember(owner = "client!nca", name = "H", descriptor = "I")
	private int anInt6017 = 204;

	@OriginalMember(owner = "client!nca", name = "L", descriptor = "I")
	private int anInt6020 = 8;

	@OriginalMember(owner = "client!nca", name = "P", descriptor = "I")
	private int anInt6024 = 409;

	@OriginalMember(owner = "client!nca", name = "N", descriptor = "I")
	private int anInt6022 = 1024;

	@OriginalMember(owner = "client!nca", name = "C", descriptor = "I")
	private int anInt6013 = 4;

	@OriginalMember(owner = "client!nca", name = "W", descriptor = "I")
	private int anInt6028 = 1024;

	@OriginalMember(owner = "client!nca", name = "bb", descriptor = "I")
	private int anInt6030 = 0;

	@OriginalMember(owner = "client!nca", name = "D", descriptor = "I")
	private int anInt6014 = 81;

	@OriginalMember(owner = "client!nca", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub23() {
		super(0, true);
	}

	@OriginalMember(owner = "client!nca", name = "i", descriptor = "(I)V")
	private void method5200() {
		@Pc(18) Random local18 = new Random((long) this.anInt6020);
		this.anInt6019 = 4096 / this.anInt6020;
		this.anInt6027 = this.anInt6014 / 2;
		this.anInt6016 = 4096 / this.anInt6013;
		@Pc(41) int local41 = this.anInt6016 / 2;
		this.anIntArrayArray49 = new int[this.anInt6020][this.anInt6013];
		this.anIntArray424 = new int[this.anInt6020 + 1];
		this.anIntArrayArray50 = new int[this.anInt6020][this.anInt6013 + 1];
		@Pc(69) int local69 = this.anInt6019 / 2;
		this.anIntArray424[0] = 0;
		for (@Pc(76) int local76 = 0; local76 < this.anInt6020; local76++) {
			@Pc(86) int local86;
			@Pc(98) int local98;
			if (local76 > 0) {
				local86 = this.anInt6019;
				local98 = (Static499.method7152(4096, local18) - 2048) * this.anInt6017 >> 12;
				@Pc(106) int local106 = local86 + (local98 * local69 >> 12);
				this.anIntArray424[local76] = local106 + this.anIntArray424[local76 - 1];
			}
			this.anIntArrayArray50[local76][0] = 0;
			for (local86 = 0; local86 < this.anInt6013; local86++) {
				if (local86 > 0) {
					local98 = this.anInt6016;
					@Pc(149) int local149 = (Static499.method7152(4096, local18) - 2048) * this.anInt6024 >> 12;
					local98 += local41 * local149 >> 12;
					this.anIntArrayArray50[local76][local86] = local98 + this.anIntArrayArray50[local76][local86 - 1];
				}
				this.anIntArrayArray49[local76][local86] = this.anInt6028 <= 0 ? 4096 : 4096 - Static499.method7152(this.anInt6028, local18);
			}
			this.anIntArrayArray50[local76][this.anInt6013] = 4096;
		}
		this.anIntArray424[this.anInt6020] = 4096;
	}

	@OriginalMember(owner = "client!nca", name = "g", descriptor = "(I)V")
	@Override
	public void method7912() {
		this.method5200();
	}

	@OriginalMember(owner = "client!nca", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method7906(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass227_41.method5672(arg0);
		if (super.aClass227_41.aBoolean433) {
			@Pc(24) int local24 = 0;
			@Pc(31) int local31;
			for (local31 = this.anInt6030 + Static305.anIntArray416[arg0]; local31 < 0; local31 += 4096) {
			}
			while (local31 > 4096) {
				local31 -= 4096;
			}
			while (local24 < this.anInt6020 && local31 >= this.anIntArray424[local24]) {
				local24++;
			}
			@Pc(68) int local68 = local24 - 1;
			@Pc(79) boolean local79 = (local24 & 0x1) == 0;
			@Pc(84) int local84 = this.anIntArray424[local24];
			@Pc(91) int local91 = this.anIntArray424[local24 - 1];
			if (this.anInt6027 + local91 < local31 && local84 - this.anInt6027 > local31) {
				for (@Pc(116) int local116 = 0; local116 < Static236.anInt4609; local116++) {
					@Pc(120) int local120 = 0;
					@Pc(129) int local129 = local79 ? this.anInt6022 : -this.anInt6022;
					@Pc(140) int local140;
					for (local140 = Static201.anIntArray324[local116] + (this.anInt6016 * local129 >> 12); local140 < 0; local140 += 4096) {
					}
					while (local140 > 4096) {
						local140 -= 4096;
					}
					while (local120 < this.anInt6013 && this.anIntArrayArray50[local68][local120] <= local140) {
						local120++;
					}
					@Pc(181) int local181 = local120 - 1;
					@Pc(188) int local188 = this.anIntArrayArray50[local68][local181];
					@Pc(195) int local195 = this.anIntArrayArray50[local68][local120];
					if (local140 > local188 + this.anInt6027 && local195 - this.anInt6027 > local140) {
						local11[local116] = this.anIntArrayArray49[local68][local181];
					} else {
						local11[local116] = 0;
					}
				}
			} else {
				Static555.method5097(local11, 0, Static236.anInt4609, 0);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(Lclient!gw;II)V")
	@Override
	public void method7901(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6013 = arg0.method3043();
		} else if (arg1 == 1) {
			this.anInt6020 = arg0.method3043();
		} else if (arg1 == 2) {
			this.anInt6024 = arg0.method3056();
		} else if (arg1 == 3) {
			this.anInt6017 = arg0.method3056();
		} else if (arg1 == 4) {
			this.anInt6022 = arg0.method3056();
		} else if (arg1 == 5) {
			this.anInt6030 = arg0.method3056();
		} else if (arg1 == 6) {
			this.anInt6014 = arg0.method3056();
		} else if (arg1 == 7) {
			this.anInt6028 = arg0.method3056();
		}
	}
}
