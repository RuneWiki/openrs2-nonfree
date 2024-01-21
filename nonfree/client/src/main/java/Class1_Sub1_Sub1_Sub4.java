import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class1_Sub1_Sub1_Sub4 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!fd", name = "zb", descriptor = "I")
	private final int anInt841;

	@OriginalMember(owner = "client!fd", name = "ub", descriptor = "I")
	private final int anInt836;

	@OriginalMember(owner = "client!fd", name = "vb", descriptor = "I")
	private final int anInt837;

	@OriginalMember(owner = "client!fd", name = "yb", descriptor = "I")
	private final int anInt840;

	@OriginalMember(owner = "client!fd", name = "tb", descriptor = "I")
	private final int anInt835;

	@OriginalMember(owner = "client!fd", name = "Ib", descriptor = "I")
	private final int anInt844;

	@OriginalMember(owner = "client!fd", name = "Gb", descriptor = "Lclient!tb;")
	private Class1_Sub1_Sub15 aClass1_Sub1_Sub15_3;

	@OriginalMember(owner = "client!fd", name = "Mb", descriptor = "I")
	private int anInt848;

	@OriginalMember(owner = "client!fd", name = "Lb", descriptor = "I")
	private int anInt847;

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(IIIIIIIZLclient!wc;)V")
	public Class1_Sub1_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) Class1_Sub1_Sub1 arg8) {
		this.anInt841 = arg3;
		this.anInt836 = arg5;
		this.anInt837 = arg2;
		this.anInt840 = arg0;
		this.anInt835 = arg1;
		this.anInt844 = arg4;
		if (arg6 != -1) {
			this.aClass1_Sub1_Sub15_3 = Static56.method1247(arg6);
			this.anInt848 = 0;
			this.anInt847 = Static22.anInt636 - 1;
			if (this.aClass1_Sub1_Sub15_3.anInt2658 == 0 && arg8 != null && arg8 instanceof Class1_Sub1_Sub1_Sub4) {
				@Pc(50) Class1_Sub1_Sub1_Sub4 local50 = (Class1_Sub1_Sub1_Sub4) arg8;
				if (local50.aClass1_Sub1_Sub15_3 == this.aClass1_Sub1_Sub15_3) {
					this.anInt847 = local50.anInt847;
					this.anInt848 = local50.anInt848;
					return;
				}
			}
			if (arg7 && this.aClass1_Sub1_Sub15_3.anInt2657 != -1) {
				this.anInt848 = (int) ((double) this.aClass1_Sub1_Sub15_3.anIntArray450.length * Math.random());
				this.anInt847 -= (int) ((double) this.aClass1_Sub1_Sub15_3.anIntArray452[this.anInt848] * Math.random());
				return;
			}
		}
	}

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "(I)Lclient!lb;")
	@Override
	public Class1_Sub1_Sub1_Sub6 method1897() {
		if (this.aClass1_Sub1_Sub15_3 != null) {
			@Pc(13) int local13 = Static22.anInt636 - this.anInt847;
			if (local13 > 100 && this.aClass1_Sub1_Sub15_3.anInt2657 > 0) {
				local13 = 100;
			}
			label46: {
				do {
					do {
						if (this.aClass1_Sub1_Sub15_3.anIntArray452[this.anInt848] >= local13) {
							break label46;
						}
						local13 -= this.aClass1_Sub1_Sub15_3.anIntArray452[this.anInt848];
						this.anInt848++;
					} while (this.aClass1_Sub1_Sub15_3.anIntArray450.length > this.anInt848);
					this.anInt848 -= this.aClass1_Sub1_Sub15_3.anInt2657;
				} while (this.anInt848 >= 0 && this.aClass1_Sub1_Sub15_3.anIntArray450.length > this.anInt848);
				this.aClass1_Sub1_Sub15_3 = null;
			}
			this.anInt847 = Static22.anInt636 - local13;
		}
		@Pc(102) Class1_Sub1_Sub9 local102 = Static122.method1995(this.anInt840);
		if (local102.anIntArray338 != null) {
			local102 = local102.method1440();
		}
		if (local102 == null) {
			return null;
		}
		@Pc(128) int local128;
		@Pc(131) int local131;
		if (this.anInt837 == 1 || this.anInt837 == 3) {
			local128 = local102.anInt2083;
			local131 = local102.anInt2065;
		} else {
			local131 = local102.anInt2083;
			local128 = local102.anInt2065;
		}
		@Pc(148) int local148 = this.anInt836 + (local131 + 1 >> 1);
		@Pc(155) int local155 = this.anInt844 + (local128 >> 1);
		@Pc(162) int local162 = this.anInt836 + (local131 >> 1);
		@Pc(167) int[][] local167 = Static44.anIntArrayArrayArray3[this.anInt841];
		@Pc(176) int local176 = (this.anInt844 << 7) + (local128 << 6);
		@Pc(192) int local192 = this.anInt844 + (local128 + 1 >> 1);
		@Pc(201) int local201 = (this.anInt836 << 7) + (local131 << 6);
		@Pc(227) int local227 = local167[local155][local148] + local167[local192][local162] + local167[local155][local162] + local167[local192][local148] >> 2;
		return local102.method1451(this.anInt837, this.anInt835, local176, local227, this.aClass1_Sub1_Sub15_3, local167, local201, this.anInt848);
	}
}
