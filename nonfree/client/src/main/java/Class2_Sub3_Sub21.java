import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public final class Class2_Sub3_Sub21 extends Class2_Sub3 {

	@OriginalMember(owner = "client!m", name = "G", descriptor = "[I")
	private int[] anIntArray316;

	@OriginalMember(owner = "client!m", name = "T", descriptor = "[[I")
	private int[][] anIntArrayArray36;

	@OriginalMember(owner = "client!m", name = "W", descriptor = "I")
	private int anInt4249;

	@OriginalMember(owner = "client!m", name = "Y", descriptor = "I")
	private int anInt4251;

	@OriginalMember(owner = "client!m", name = "Z", descriptor = "I")
	private int anInt4252;

	@OriginalMember(owner = "client!m", name = "gb", descriptor = "[[I")
	private int[][] anIntArrayArray37;

	@OriginalMember(owner = "client!m", name = "I", descriptor = "I")
	private int anInt4237 = 204;

	@OriginalMember(owner = "client!m", name = "M", descriptor = "I")
	private int anInt4240 = 1024;

	@OriginalMember(owner = "client!m", name = "X", descriptor = "I")
	private int anInt4250 = 81;

	@OriginalMember(owner = "client!m", name = "R", descriptor = "I")
	private int anInt4245 = 8;

	@OriginalMember(owner = "client!m", name = "S", descriptor = "I")
	private int anInt4246 = 1024;

	@OriginalMember(owner = "client!m", name = "ab", descriptor = "I")
	private int anInt4253 = 4;

	@OriginalMember(owner = "client!m", name = "P", descriptor = "I")
	private int anInt4243 = 0;

	@OriginalMember(owner = "client!m", name = "fb", descriptor = "I")
	private int anInt4257 = 409;

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub21() {
		super(0, true);
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IILclient!ef;)V")
	@Override
	public void method5704(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt4253 = arg1.method3124();
		} else if (arg0 == 1) {
			this.anInt4245 = arg1.method3124();
		} else if (arg0 == 2) {
			this.anInt4257 = arg1.method3104();
		} else if (arg0 == 3) {
			this.anInt4237 = arg1.method3104();
		} else if (arg0 == 4) {
			this.anInt4240 = arg1.method3104();
		} else if (arg0 == 5) {
			this.anInt4243 = arg1.method3104();
		} else if (arg0 == 6) {
			this.anInt4250 = arg1.method3104();
		} else if (arg0 == 7) {
			this.anInt4246 = arg1.method3104();
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5699(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass137_41.method3984(arg0);
		if (super.aClass137_41.aBoolean400) {
			@Pc(25) int local25 = 0;
			@Pc(33) int local33;
			for (local33 = Static76.anIntArray121[arg0] + this.anInt4243; local33 < 0; local33 += 4096) {
			}
			while (local33 > 4096) {
				local33 -= 4096;
			}
			while (this.anInt4245 > local25 && local33 >= this.anIntArray316[local25]) {
				local25++;
			}
			@Pc(61) int local61 = local25 - 1;
			@Pc(69) boolean local69 = (local25 & 0x1) == 0;
			@Pc(74) int local74 = this.anIntArray316[local25];
			@Pc(81) int local81 = this.anIntArray316[local25 - 1];
			if (this.anInt4251 + local81 < local33 && local74 - this.anInt4251 > local33) {
				for (@Pc(100) int local100 = 0; local100 < Static263.anInt5504; local100++) {
					@Pc(104) int local104 = 0;
					@Pc(113) int local113 = local69 ? this.anInt4240 : -this.anInt4240;
					@Pc(125) int local125;
					for (local125 = Static269.anIntArray507[local100] + (this.anInt4252 * local113 >> 12); local125 < 0; local125 += 4096) {
					}
					while (local125 > 4096) {
						local125 -= 4096;
					}
					while (local104 < this.anInt4253 && this.anIntArrayArray36[local61][local104] <= local125) {
						local104++;
					}
					@Pc(155) int local155 = local104 - 1;
					@Pc(162) int local162 = this.anIntArrayArray36[local61][local155];
					@Pc(169) int local169 = this.anIntArrayArray36[local61][local104];
					if (local162 + this.anInt4251 < local125 && local169 - this.anInt4251 > local125) {
						local19[local100] = this.anIntArrayArray37[local61][local155];
					} else {
						local19[local100] = 0;
					}
				}
			} else {
				Static369.method2580(local19, 0, Static263.anInt5504, 0);
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!m", name = "e", descriptor = "(B)V")
	private void method3609() {
		@Pc(17) Random local17 = new Random((long) this.anInt4245);
		this.anInt4251 = this.anInt4250 / 2;
		this.anInt4252 = 4096 / this.anInt4253;
		this.anInt4249 = 4096 / this.anInt4245;
		@Pc(40) int local40 = this.anInt4252 / 2;
		this.anIntArrayArray37 = new int[this.anInt4245][this.anInt4253];
		this.anIntArrayArray36 = new int[this.anInt4245][this.anInt4253 + 1];
		this.anIntArray316 = new int[this.anInt4245 + 1];
		@Pc(68) int local68 = this.anInt4249 / 2;
		this.anIntArray316[0] = 0;
		for (@Pc(75) int local75 = 0; local75 < this.anInt4245; local75++) {
			@Pc(82) int local82;
			@Pc(94) int local94;
			if (local75 > 0) {
				local82 = this.anInt4249;
				local94 = (Static172.method3391(4096, local17) - 2048) * this.anInt4237 >> 12;
				@Pc(102) int local102 = local82 + (local94 * local68 >> 12);
				this.anIntArray316[local75] = local102 + this.anIntArray316[local75 - 1];
			}
			this.anIntArrayArray36[local75][0] = 0;
			for (local82 = 0; local82 < this.anInt4253; local82++) {
				if (local82 > 0) {
					local94 = this.anInt4252;
					@Pc(142) int local142 = (Static172.method3391(4096, local17) - 2048) * this.anInt4257 >> 12;
					local94 += local40 * local142 >> 12;
					this.anIntArrayArray36[local75][local82] = local94 + this.anIntArrayArray36[local75][local82 - 1];
				}
				this.anIntArrayArray37[local75][local82] = this.anInt4246 > 0 ? 4096 - Static172.method3391(this.anInt4246, local17) : 4096;
			}
			this.anIntArrayArray36[local75][this.anInt4253] = 4096;
		}
		this.anIntArray316[this.anInt4245] = 4096;
	}

	@OriginalMember(owner = "client!m", name = "e", descriptor = "(I)V")
	@Override
	public void method5708() {
		this.method3609();
	}
}
