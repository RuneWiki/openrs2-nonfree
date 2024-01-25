import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wv")
public final class Class4_Sub3_Sub39 extends Class4_Sub3 {

	@OriginalMember(owner = "client!wv", name = "L", descriptor = "I")
	private int anInt8014 = 0;

	@OriginalMember(owner = "client!wv", name = "S", descriptor = "I")
	private int anInt8021 = 4096;

	@OriginalMember(owner = "client!wv", name = "P", descriptor = "I")
	private int anInt8018 = 0;

	@OriginalMember(owner = "client!wv", name = "R", descriptor = "I")
	private int anInt8020 = 16;

	@OriginalMember(owner = "client!wv", name = "I", descriptor = "I")
	private int anInt8012 = 2000;

	@OriginalMember(owner = "client!wv", name = "<init>", descriptor = "()V")
	public Class4_Sub3_Sub39() {
		super(0, true);
	}

	@OriginalMember(owner = "client!wv", name = "e", descriptor = "(B)V")
	@Override
	public void method6341() {
		Static58.method1272();
	}

	@OriginalMember(owner = "client!wv", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6339(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass157_41.method4027(arg0);
		if (super.aClass157_41.aBoolean315) {
			@Pc(25) int local25 = this.anInt8021 >> 1;
			@Pc(30) int[][] local30 = super.aClass157_41.method4028();
			@Pc(37) Random local37 = new Random((long) this.anInt8018);
			for (@Pc(39) int local39 = 0; local39 < this.anInt8012; local39++) {
				@Pc(64) int local64 = this.anInt8021 > 0 ? this.anInt8014 + Static127.method2396(local37, this.anInt8021) - local25 : this.anInt8014;
				@Pc(70) int local70 = local64 >> 4 & 0xFF;
				@Pc(75) int local75 = Static127.method2396(local37, Static304.anInt5637);
				@Pc(80) int local80 = Static127.method2396(local37, Static191.anInt3822);
				@Pc(91) int local91 = (this.anInt8020 * Static131.anIntArray179[local70] >> 12) + local75;
				@Pc(102) int local102 = (Static275.anIntArray396[local70] * this.anInt8020 >> 12) + local80;
				@Pc(106) int local106 = local102 - local80;
				@Pc(111) int local111 = local91 - local75;
				if (local111 != 0 || local106 != 0) {
					if (local111 < 0) {
						local111 = -local111;
					}
					if (local106 < 0) {
						local106 = -local106;
					}
					@Pc(139) boolean local139 = local106 > local111;
					@Pc(143) int local143;
					@Pc(147) int local147;
					if (local139) {
						local143 = local75;
						local75 = local80;
						local147 = local91;
						local91 = local102;
						local80 = local143;
						local102 = local147;
					}
					if (local91 < local75) {
						local143 = local75;
						local75 = local91;
						local147 = local80;
						local80 = local102;
						local91 = local143;
						local102 = local147;
					}
					local143 = local80;
					local147 = local91 - local75;
					@Pc(179) int local179 = local102 - local80;
					@Pc(184) int local184 = -local147 / 2;
					@Pc(188) int local188 = 2048 / local147;
					@Pc(200) int local200 = 1024 - (Static127.method2396(local37, 4096) >> 2);
					if (local179 < 0) {
						local179 = -local179;
					}
					@Pc(216) int local216 = local80 >= local102 ? -1 : 1;
					for (@Pc(218) int local218 = local75; local218 < local91; local218++) {
						@Pc(231) int local231 = local200 + local188 * (-local75 + local218) + 1024;
						@Pc(235) int local235 = Static279.anInt5254 & local218;
						@Pc(239) int local239 = local143 & Static429.anInt7355;
						if (local139) {
							local30[local239][local235] = local231;
						} else {
							local30[local235][local239] = local231;
						}
						local184 += local179;
						if (local184 > 0) {
							local184 -= local147;
							local143 += local216;
						}
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(ILclient!wn;I)V")
	@Override
	public void method6340(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt8018 = arg1.method4614();
		} else if (arg0 == 1) {
			this.anInt8012 = arg1.method4560();
		} else if (arg0 == 2) {
			this.anInt8020 = arg1.method4614();
		} else if (arg0 == 3) {
			this.anInt8014 = arg1.method4560();
		} else if (arg0 == 4) {
			this.anInt8021 = arg1.method4560();
		}
	}
}
