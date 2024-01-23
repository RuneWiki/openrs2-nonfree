import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class2_Sub2_Sub2 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ae", name = "U", descriptor = "I")
	private int anInt184 = 2000;

	@OriginalMember(owner = "client!ae", name = "bb", descriptor = "I")
	private int anInt191 = 4096;

	@OriginalMember(owner = "client!ae", name = "W", descriptor = "I")
	private int anInt186 = 0;

	@OriginalMember(owner = "client!ae", name = "cb", descriptor = "I")
	private int anInt192 = 16;

	@OriginalMember(owner = "client!ae", name = "db", descriptor = "I")
	private int anInt193 = 0;

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub2() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(BLclient!nh;I)V")
	@Override
	public void method3957(@OriginalArg(1) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt186 = arg0.method2122();
		} else if (arg1 == 1) {
			this.anInt184 = arg0.method2095();
		} else if (arg1 == 2) {
			this.anInt192 = arg0.method2122();
		} else if (arg1 == 3) {
			this.anInt193 = arg0.method2095();
		} else if (arg1 == 4) {
			this.anInt191 = arg0.method2095();
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3961(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass16_41.method300(arg0);
		if (super.aClass16_41.aBoolean12) {
			@Pc(25) int local25 = this.anInt191 >> 1;
			@Pc(30) int[][] local30 = super.aClass16_41.method299();
			@Pc(37) Random local37 = new Random((long) this.anInt186);
			for (@Pc(39) int local39 = 0; local39 < this.anInt184; local39++) {
				@Pc(62) int local62 = this.anInt191 <= 0 ? this.anInt193 : this.anInt193 + Static8.method184(local37, this.anInt191) - local25;
				@Pc(68) int local68 = local62 >> 4 & 0xFF;
				@Pc(73) int local73 = Static8.method184(local37, Static54.anInt953);
				@Pc(78) int local78 = Static8.method184(local37, Static11.anInt313);
				@Pc(89) int local89 = (this.anInt192 * Static157.anIntArray603[local68] >> 12) + local73;
				@Pc(94) int local94 = local89 - local73;
				@Pc(105) int local105 = (Static60.anIntArray168[local68] * this.anInt192 >> 12) + local78;
				@Pc(110) int local110 = local105 - local78;
				if (local94 != 0 || local110 != 0) {
					if (local94 < 0) {
						local94 = -local94;
					}
					if (local110 < 0) {
						local110 = -local110;
					}
					@Pc(144) boolean local144 = local110 > local94;
					@Pc(148) int local148;
					@Pc(154) int local154;
					if (local144) {
						local148 = local73;
						local73 = local78;
						local78 = local148;
						local154 = local89;
						local89 = local105;
						local105 = local154;
					}
					if (local89 < local73) {
						local148 = local73;
						local154 = local78;
						local73 = local89;
						local89 = local148;
						local78 = local105;
						local105 = local154;
					}
					@Pc(181) int local181 = local105 - local78;
					local154 = local89 - local73;
					@Pc(189) int local189 = 2048 / local154;
					@Pc(194) int local194 = -local154 / 2;
					if (local181 < 0) {
						local181 = -local181;
					}
					local148 = local78;
					@Pc(208) int local208 = local105 <= local78 ? -1 : 1;
					@Pc(218) int local218 = 1024 - (Static8.method184(local37, 4096) >> 2);
					for (@Pc(220) int local220 = local73; local220 < local89; local220++) {
						local194 += local181;
						@Pc(237) int local237 = (local220 - local73) * local189 + local218 + 1024;
						@Pc(241) int local241 = Static156.anInt3604 & local148;
						if (local194 > 0) {
							local194 -= local154;
							local148 -= -local208;
						}
						@Pc(256) int local256 = local220 & Static74.anInt1601;
						if (local144) {
							local30[local241][local256] = local237;
						} else {
							local30[local256][local241] = local237;
						}
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "(I)V")
	@Override
	public void method3958() {
		Static97.method1685();
	}
}
