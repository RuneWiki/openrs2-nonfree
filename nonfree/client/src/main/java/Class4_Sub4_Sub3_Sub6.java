import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tf")
public final class Class4_Sub4_Sub3_Sub6 extends Class4_Sub4_Sub3 {

	@OriginalMember(owner = "client!tf", name = "Y", descriptor = "I")
	private final int anInt2490;

	@OriginalMember(owner = "client!tf", name = "hb", descriptor = "I")
	private final int anInt2496;

	@OriginalMember(owner = "client!tf", name = "jb", descriptor = "I")
	private final int anInt2498;

	@OriginalMember(owner = "client!tf", name = "ib", descriptor = "I")
	private final int anInt2497;

	@OriginalMember(owner = "client!tf", name = "fb", descriptor = "I")
	private final int anInt2494;

	@OriginalMember(owner = "client!tf", name = "Z", descriptor = "I")
	private final int anInt2491;

	@OriginalMember(owner = "client!tf", name = "eb", descriptor = "Lclient!kc;")
	private Class4_Sub4_Sub9 aClass4_Sub4_Sub9_3;

	@OriginalMember(owner = "client!tf", name = "cb", descriptor = "I")
	private int anInt2493;

	@OriginalMember(owner = "client!tf", name = "lb", descriptor = "I")
	private int anInt2499;

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(IIIIIIIZLclient!jd;)V")
	public Class4_Sub4_Sub3_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) Class4_Sub4_Sub3 arg8) {
		this.anInt2490 = arg5;
		this.anInt2496 = arg0;
		this.anInt2498 = arg1;
		this.anInt2497 = arg4;
		this.anInt2494 = arg2;
		this.anInt2491 = arg3;
		if (arg6 != -1) {
			this.aClass4_Sub4_Sub9_3 = Static118.method1796(arg6);
			this.anInt2493 = Static78.anInt1981 - 1;
			this.anInt2499 = 0;
			if (this.aClass4_Sub4_Sub9_3.anInt1563 == 0 && arg8 != null && arg8 instanceof Class4_Sub4_Sub3_Sub6) {
				@Pc(48) Class4_Sub4_Sub3_Sub6 local48 = (Class4_Sub4_Sub3_Sub6) arg8;
				if (local48.aClass4_Sub4_Sub9_3 == this.aClass4_Sub4_Sub9_3) {
					this.anInt2493 = local48.anInt2493;
					this.anInt2499 = local48.anInt2499;
					return;
				}
			}
			if (arg7 && this.aClass4_Sub4_Sub9_3.anInt1569 != -1) {
				this.anInt2499 = (int) ((double) this.aClass4_Sub4_Sub9_3.anIntArray196.length * Math.random());
				this.anInt2493 -= (int) ((double) this.aClass4_Sub4_Sub9_3.anIntArray200[this.anInt2499] * Math.random());
				return;
			}
		}
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(B)Lclient!u;")
	@Override
	public Class4_Sub4_Sub3_Sub7 method1754() {
		if (this.aClass4_Sub4_Sub9_3 != null) {
			@Pc(14) int local14 = Static78.anInt1981 - this.anInt2493;
			if (local14 > 100 && this.aClass4_Sub4_Sub9_3.anInt1569 > 0) {
				local14 = 100;
			}
			label46: {
				do {
					do {
						if (local14 <= this.aClass4_Sub4_Sub9_3.anIntArray200[this.anInt2499]) {
							break label46;
						}
						local14 -= this.aClass4_Sub4_Sub9_3.anIntArray200[this.anInt2499];
						this.anInt2499++;
					} while (this.aClass4_Sub4_Sub9_3.anIntArray196.length > this.anInt2499);
					this.anInt2499 -= this.aClass4_Sub4_Sub9_3.anInt1569;
				} while (this.anInt2499 >= 0 && this.anInt2499 < this.aClass4_Sub4_Sub9_3.anIntArray196.length);
				this.aClass4_Sub4_Sub9_3 = null;
			}
			this.anInt2493 = Static78.anInt1981 - local14;
		}
		@Pc(102) Class4_Sub4_Sub8 local102 = Static104.method1600(this.anInt2496);
		if (local102.anIntArray192 != null) {
			local102 = local102.method994();
		}
		if (local102 == null) {
			return null;
		}
		@Pc(124) int local124;
		@Pc(127) int local127;
		if (this.anInt2494 == 1 || this.anInt2494 == 3) {
			local127 = local102.anInt1498;
			local124 = local102.anInt1505;
		} else {
			local124 = local102.anInt1498;
			local127 = local102.anInt1505;
		}
		@Pc(142) int local142 = this.anInt2497 + (local124 >> 1);
		@Pc(151) int local151 = this.anInt2497 + (local124 + 1 >> 1);
		@Pc(158) int local158 = this.anInt2490 + (local127 >> 1);
		@Pc(167) int local167 = (local127 + 1 >> 1) + this.anInt2490;
		@Pc(179) int[][] local179 = Static66.anIntArrayArrayArray3[this.anInt2491];
		@Pc(206) int local206 = local179[local142][local167] + local179[local142][local158] + local179[local151][local158] + local179[local151][local167] >> 2;
		@Pc(215) int local215 = (this.anInt2497 << 7) + (local124 << 6);
		@Pc(225) int local225 = (this.anInt2490 << 7) + (local127 << 6);
		return local102.method993(this.anInt2494, local206, this.aClass4_Sub4_Sub9_3, local215, this.anInt2499, local179, local225, this.anInt2498);
	}
}
