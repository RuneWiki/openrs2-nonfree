import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class3_Sub1_Sub4_Sub6 extends Class3_Sub1_Sub4 {

	@OriginalMember(owner = "client!nb", name = "ib", descriptor = "I")
	private final int anInt2461;

	@OriginalMember(owner = "client!nb", name = "gb", descriptor = "I")
	private final int anInt2459;

	@OriginalMember(owner = "client!nb", name = "rb", descriptor = "I")
	private final int anInt2467;

	@OriginalMember(owner = "client!nb", name = "bb", descriptor = "I")
	private final int anInt2456;

	@OriginalMember(owner = "client!nb", name = "cb", descriptor = "I")
	private final int anInt2457;

	@OriginalMember(owner = "client!nb", name = "eb", descriptor = "I")
	private final int anInt2458;

	@OriginalMember(owner = "client!nb", name = "qb", descriptor = "Lclient!gg;")
	private Class3_Sub1_Sub8 aClass3_Sub1_Sub8_3;

	@OriginalMember(owner = "client!nb", name = "ob", descriptor = "I")
	private int anInt2466;

	@OriginalMember(owner = "client!nb", name = "hb", descriptor = "I")
	private int anInt2460;

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(IIIIIIIZLclient!ed;)V")
	public Class3_Sub1_Sub4_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) Class3_Sub1_Sub4 arg8) {
		this.anInt2461 = arg4;
		this.anInt2459 = arg2;
		this.anInt2467 = arg0;
		this.anInt2456 = arg5;
		this.anInt2457 = arg1;
		this.anInt2458 = arg3;
		if (arg6 != -1) {
			this.aClass3_Sub1_Sub8_3 = Static98.method1697(arg6);
			this.anInt2466 = 0;
			this.anInt2460 = Static44.anInt1024 - 1;
			if (this.aClass3_Sub1_Sub8_3.anInt1321 == 0 && arg8 != null && arg8 instanceof Class3_Sub1_Sub4_Sub6) {
				@Pc(48) Class3_Sub1_Sub4_Sub6 local48 = (Class3_Sub1_Sub4_Sub6) arg8;
				if (this.aClass3_Sub1_Sub8_3 == local48.aClass3_Sub1_Sub8_3) {
					this.anInt2466 = local48.anInt2466;
					this.anInt2460 = local48.anInt2460;
					return;
				}
			}
			if (arg7 && this.aClass3_Sub1_Sub8_3.anInt1316 != -1) {
				this.anInt2466 = (int) ((double) this.aClass3_Sub1_Sub8_3.anIntArray138.length * Math.random());
				this.anInt2460 -= (int) ((double) this.aClass3_Sub1_Sub8_3.anIntArray136[this.anInt2466] * Math.random());
				return;
			}
		}
	}

	@OriginalMember(owner = "client!nb", name = "i", descriptor = "(I)Lclient!o;")
	@Override
	protected Class3_Sub1_Sub4_Sub5 method2261() {
		if (this.aClass3_Sub1_Sub8_3 != null) {
			@Pc(10) int local10 = Static44.anInt1024 - this.anInt2460;
			if (local10 > 100 && this.aClass3_Sub1_Sub8_3.anInt1316 > 0) {
				local10 = 100;
			}
			label46: {
				do {
					do {
						if (this.aClass3_Sub1_Sub8_3.anIntArray136[this.anInt2466] >= local10) {
							break label46;
						}
						local10 -= this.aClass3_Sub1_Sub8_3.anIntArray136[this.anInt2466];
						this.anInt2466++;
					} while (this.anInt2466 < this.aClass3_Sub1_Sub8_3.anIntArray138.length);
					this.anInt2466 -= this.aClass3_Sub1_Sub8_3.anInt1316;
				} while (this.anInt2466 >= 0 && this.aClass3_Sub1_Sub8_3.anIntArray138.length > this.anInt2466);
				this.aClass3_Sub1_Sub8_3 = null;
			}
			this.anInt2460 = Static44.anInt1024 - local10;
		}
		@Pc(101) Class3_Sub1_Sub15 local101 = Static151.method2466(this.anInt2467);
		if (local101.anIntArray314 != null) {
			local101 = local101.method2191();
		}
		if (local101 == null) {
			return null;
		}
		@Pc(123) int local123;
		@Pc(126) int local126;
		if (this.anInt2459 == 1 || this.anInt2459 == 3) {
			local126 = local101.anInt3012;
			local123 = local101.anInt3014;
		} else {
			local123 = local101.anInt3012;
			local126 = local101.anInt3014;
		}
		@Pc(141) int local141 = this.anInt2461 + (local123 >> 1);
		@Pc(148) int local148 = (local126 >> 1) + this.anInt2456;
		@Pc(157) int local157 = (local126 + 1 >> 1) + this.anInt2456;
		@Pc(167) int local167 = (this.anInt2461 << 7) + (local123 << 6);
		@Pc(176) int local176 = this.anInt2461 + (local123 + 1 >> 1);
		@Pc(188) int[][] local188 = Static65.anIntArrayArrayArray5[this.anInt2458];
		@Pc(197) int local197 = (this.anInt2456 << 7) + (local126 << 6);
		@Pc(223) int local223 = local188[local176][local157] + local188[local141][local157] + local188[local141][local148] + local188[local176][local148] >> 2;
		return local101.method2199(local167, local197, this.anInt2466, this.aClass3_Sub1_Sub8_3, local188, this.anInt2457, local223, this.anInt2459);
	}
}
