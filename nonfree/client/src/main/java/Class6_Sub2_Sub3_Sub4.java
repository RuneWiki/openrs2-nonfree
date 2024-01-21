import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public final class Class6_Sub2_Sub3_Sub4 extends Class6_Sub2_Sub3 {

	@OriginalMember(owner = "client!la", name = "ob", descriptor = "I")
	private final int anInt1639;

	@OriginalMember(owner = "client!la", name = "zb", descriptor = "I")
	private final int anInt1644;

	@OriginalMember(owner = "client!la", name = "Sb", descriptor = "I")
	private final int anInt1652;

	@OriginalMember(owner = "client!la", name = "Jb", descriptor = "I")
	private final int anInt1650;

	@OriginalMember(owner = "client!la", name = "Cb", descriptor = "I")
	private final int anInt1646;

	@OriginalMember(owner = "client!la", name = "vb", descriptor = "I")
	private final int anInt1641;

	@OriginalMember(owner = "client!la", name = "nb", descriptor = "I")
	private final int anInt1638;

	@OriginalMember(owner = "client!la", name = "Nb", descriptor = "Lclient!tb;")
	private Class6_Sub2_Sub13 aClass6_Sub2_Sub13_2;

	@OriginalMember(owner = "client!la", name = "Qb", descriptor = "I")
	private int anInt1651;

	@OriginalMember(owner = "client!la", name = "Hb", descriptor = "I")
	private int anInt1649;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(IIIIIIIIZLclient!k;)V")
	public Class6_Sub2_Sub3_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) Class6_Sub2_Sub3 arg9) {
		this.anInt1639 = arg4;
		this.anInt1644 = arg6;
		this.anInt1652 = arg5;
		this.anInt1650 = arg1;
		this.anInt1646 = arg3;
		this.anInt1641 = arg2;
		this.anInt1638 = arg0;
		if (arg7 != -1) {
			this.aClass6_Sub2_Sub13_2 = Static4.method1608(arg7);
			this.anInt1651 = 0;
			this.anInt1649 = Static85.anInt2389 - 1;
			if (this.aClass6_Sub2_Sub13_2.anInt2820 == 0 && arg9 != null && arg9 instanceof Class6_Sub2_Sub3_Sub4) {
				@Pc(51) Class6_Sub2_Sub3_Sub4 local51 = (Class6_Sub2_Sub3_Sub4) arg9;
				if (local51.aClass6_Sub2_Sub13_2 == this.aClass6_Sub2_Sub13_2) {
					this.anInt1649 = local51.anInt1649;
					this.anInt1651 = local51.anInt1651;
					return;
				}
			}
			if (arg8 && this.aClass6_Sub2_Sub13_2.anInt2804 != -1) {
				this.anInt1651 = (int) (Math.random() * (double) this.aClass6_Sub2_Sub13_2.anIntArray264.length);
				this.anInt1649 -= (int) (Math.random() * (double) this.aClass6_Sub2_Sub13_2.anIntArray261[this.anInt1651]);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "f", descriptor = "(I)Lclient!jb;")
	@Override
	public Class6_Sub2_Sub3_Sub3 method2063() {
		if (this.aClass6_Sub2_Sub13_2 != null) {
			@Pc(10) int local10 = Static85.anInt2389 - this.anInt1649;
			if (local10 > 100 && this.aClass6_Sub2_Sub13_2.anInt2804 > 0) {
				local10 = 100;
			}
			label37: {
				do {
					do {
						if (local10 <= this.aClass6_Sub2_Sub13_2.anIntArray261[this.anInt1651]) {
							break label37;
						}
						local10 -= this.aClass6_Sub2_Sub13_2.anIntArray261[this.anInt1651];
						this.anInt1651++;
					} while (this.aClass6_Sub2_Sub13_2.anIntArray264.length > this.anInt1651);
					this.anInt1651 -= this.aClass6_Sub2_Sub13_2.anInt2804;
				} while (this.anInt1651 >= 0 && this.anInt1651 < this.aClass6_Sub2_Sub13_2.anIntArray264.length);
				this.aClass6_Sub2_Sub13_2 = null;
			}
			this.anInt1649 = Static85.anInt2389 - local10;
		}
		@Pc(102) Class6_Sub2_Sub15 local102 = Static8.method333(this.anInt1638);
		if (local102.anIntArray278 != null) {
			local102 = local102.method1937();
		}
		return local102 == null ? null : local102.method1936(this.anInt1651, this.anInt1644, this.aClass6_Sub2_Sub13_2, this.anInt1639, this.anInt1646, this.anInt1650, this.anInt1641, this.anInt1652);
	}
}
