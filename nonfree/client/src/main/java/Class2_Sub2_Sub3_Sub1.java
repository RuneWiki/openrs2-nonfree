import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public final class Class2_Sub2_Sub3_Sub1 extends Class2_Sub2_Sub3 {

	@OriginalMember(owner = "client!bh", name = "gb", descriptor = "I")
	private final int anInt374;

	@OriginalMember(owner = "client!bh", name = "mb", descriptor = "I")
	private final int anInt379;

	@OriginalMember(owner = "client!bh", name = "qb", descriptor = "I")
	private final int anInt383;

	@OriginalMember(owner = "client!bh", name = "lb", descriptor = "I")
	private final int anInt378;

	@OriginalMember(owner = "client!bh", name = "nb", descriptor = "I")
	private final int anInt380;

	@OriginalMember(owner = "client!bh", name = "hb", descriptor = "I")
	private final int anInt375;

	@OriginalMember(owner = "client!bh", name = "ab", descriptor = "Lclient!bi;")
	private Class2_Sub2_Sub4 aClass2_Sub2_Sub4_1;

	@OriginalMember(owner = "client!bh", name = "db", descriptor = "I")
	private int anInt372;

	@OriginalMember(owner = "client!bh", name = "pb", descriptor = "I")
	private int anInt382;

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(IIIIIIIZLclient!ka;)V")
	public Class2_Sub2_Sub3_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) Class2_Sub2_Sub3 arg8) {
		this.anInt374 = arg4;
		this.anInt379 = arg2;
		this.anInt383 = arg5;
		this.anInt378 = arg0;
		this.anInt380 = arg1;
		this.anInt375 = arg3;
		if (arg6 != -1) {
			this.aClass2_Sub2_Sub4_1 = Static29.method543(arg6);
			this.anInt372 = Static127.anInt2757 - 1;
			this.anInt382 = 0;
			if (this.aClass2_Sub2_Sub4_1.anInt406 == 0 && arg8 != null && arg8 instanceof Class2_Sub2_Sub3_Sub1) {
				@Pc(48) Class2_Sub2_Sub3_Sub1 local48 = (Class2_Sub2_Sub3_Sub1) arg8;
				if (local48.aClass2_Sub2_Sub4_1 == this.aClass2_Sub2_Sub4_1) {
					this.anInt372 = local48.anInt372;
					this.anInt382 = local48.anInt382;
					return;
				}
			}
			if (arg7 && this.aClass2_Sub2_Sub4_1.anInt407 != -1) {
				this.anInt382 = (int) (Math.random() * (double) this.aClass2_Sub2_Sub4_1.anIntArray35.length);
				this.anInt372 -= (int) (Math.random() * (double) this.aClass2_Sub2_Sub4_1.anIntArray36[this.anInt382]);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)Lclient!ue;")
	@Override
	protected Class2_Sub2_Sub3_Sub4 method2725() {
		if (this.aClass2_Sub2_Sub4_1 != null) {
			@Pc(10) int local10 = Static127.anInt2757 - this.anInt372;
			if (local10 > 100 && this.aClass2_Sub2_Sub4_1.anInt407 > 0) {
				local10 = 100;
			}
			label46: {
				do {
					do {
						if (local10 <= this.aClass2_Sub2_Sub4_1.anIntArray36[this.anInt382]) {
							break label46;
						}
						local10 -= this.aClass2_Sub2_Sub4_1.anIntArray36[this.anInt382];
						this.anInt382++;
					} while (this.aClass2_Sub2_Sub4_1.anIntArray35.length > this.anInt382);
					this.anInt382 -= this.aClass2_Sub2_Sub4_1.anInt407;
				} while (this.anInt382 >= 0 && this.aClass2_Sub2_Sub4_1.anIntArray35.length > this.anInt382);
				this.aClass2_Sub2_Sub4_1 = null;
			}
			this.anInt372 = Static127.anInt2757 - local10;
		}
		@Pc(95) Class2_Sub2_Sub9 local95 = Static124.method2146(this.anInt378);
		if (local95.anIntArray177 != null) {
			local95 = local95.method1196();
		}
		if (local95 == null) {
			return null;
		}
		@Pc(119) int local119;
		@Pc(122) int local122;
		if (this.anInt379 == 1 || this.anInt379 == 3) {
			local119 = local95.anInt1480;
			local122 = local95.anInt1482;
		} else {
			local119 = local95.anInt1482;
			local122 = local95.anInt1480;
		}
		@Pc(139) int local139 = (local119 + 1 >> 1) + this.anInt374;
		@Pc(148) int local148 = this.anInt383 + (local122 + 1 >> 1);
		@Pc(155) int local155 = (local122 >> 1) + this.anInt383;
		@Pc(162) int local162 = (local119 >> 1) + this.anInt374;
		@Pc(167) int[][] local167 = Static162.anIntArrayArrayArray7[this.anInt375];
		@Pc(195) int local195 = local167[local139][local155] + local167[local162][local155] + local167[local162][local148] + local167[local139][local148] >> 2;
		@Pc(212) int local212 = (this.anInt383 << 7) + (local122 << 6);
		@Pc(222) int local222 = (this.anInt374 << 7) + (local119 << 6);
		return local95.method1206(this.aClass2_Sub2_Sub4_1, this.anInt380, local222, this.anInt382, local212, this.anInt379, local195, local167);
	}
}
