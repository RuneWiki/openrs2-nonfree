import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class6_Sub3_Sub1_Sub5 extends Class6_Sub3_Sub1 {

	@OriginalMember(owner = "client!ib", name = "ub", descriptor = "I")
	private final int anInt1562;

	@OriginalMember(owner = "client!ib", name = "tb", descriptor = "I")
	private final int anInt1561;

	@OriginalMember(owner = "client!ib", name = "ob", descriptor = "I")
	private final int anInt1559;

	@OriginalMember(owner = "client!ib", name = "Tb", descriptor = "I")
	private final int anInt1577;

	@OriginalMember(owner = "client!ib", name = "Gb", descriptor = "I")
	private final int anInt1570;

	@OriginalMember(owner = "client!ib", name = "vb", descriptor = "I")
	private final int anInt1563;

	@OriginalMember(owner = "client!ib", name = "Bb", descriptor = "I")
	private final int anInt1566;

	@OriginalMember(owner = "client!ib", name = "sb", descriptor = "Lclient!gd;")
	private Class6_Sub3_Sub7 aClass6_Sub3_Sub7_2;

	@OriginalMember(owner = "client!ib", name = "rb", descriptor = "I")
	private int anInt1560;

	@OriginalMember(owner = "client!ib", name = "yb", descriptor = "I")
	private int anInt1564;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(IIIIIIIIZLclient!id;)V")
	public Class6_Sub3_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) Class6_Sub3_Sub1 arg9) {
		this.anInt1562 = arg0;
		this.anInt1561 = arg5;
		this.anInt1559 = arg4;
		this.anInt1577 = arg3;
		this.anInt1570 = arg6;
		this.anInt1563 = arg1;
		this.anInt1566 = arg2;
		if (arg7 != -1) {
			this.aClass6_Sub3_Sub7_2 = Static30.method721(arg7);
			this.anInt1560 = Static73.anInt2064 - 1;
			this.anInt1564 = 0;
			if (this.aClass6_Sub3_Sub7_2.anInt1302 == 0 && arg9 != null && arg9 instanceof Class6_Sub3_Sub1_Sub5) {
				@Pc(51) Class6_Sub3_Sub1_Sub5 local51 = (Class6_Sub3_Sub1_Sub5) arg9;
				if (this.aClass6_Sub3_Sub7_2 == local51.aClass6_Sub3_Sub7_2) {
					this.anInt1560 = local51.anInt1560;
					this.anInt1564 = local51.anInt1564;
					return;
				}
			}
			if (arg8 && this.aClass6_Sub3_Sub7_2.anInt1310 != -1) {
				this.anInt1564 = (int) ((double) this.aClass6_Sub3_Sub7_2.anIntArray152.length * Math.random());
				this.anInt1560 -= (int) ((double) this.aClass6_Sub3_Sub7_2.anIntArray149[this.anInt1564] * Math.random());
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "g", descriptor = "(I)Lclient!df;")
	@Override
	public Class6_Sub3_Sub1_Sub3 method2062() {
		if (this.aClass6_Sub3_Sub7_2 != null) {
			@Pc(10) int local10 = Static73.anInt2064 - this.anInt1560;
			if (local10 > 100 && this.aClass6_Sub3_Sub7_2.anInt1310 > 0) {
				local10 = 100;
			}
			label37: {
				do {
					do {
						if (local10 <= this.aClass6_Sub3_Sub7_2.anIntArray149[this.anInt1564]) {
							break label37;
						}
						local10 -= this.aClass6_Sub3_Sub7_2.anIntArray149[this.anInt1564];
						this.anInt1564++;
					} while (this.anInt1564 < this.aClass6_Sub3_Sub7_2.anIntArray152.length);
					this.anInt1564 -= this.aClass6_Sub3_Sub7_2.anInt1310;
				} while (this.anInt1564 >= 0 && this.aClass6_Sub3_Sub7_2.anIntArray152.length > this.anInt1564);
				this.aClass6_Sub3_Sub7_2 = null;
			}
			this.anInt1560 = Static73.anInt2064 - local10;
		}
		@Pc(102) Class6_Sub3_Sub10 local102 = Static123.method2172(this.anInt1562);
		if (local102.anIntArray185 != null) {
			local102 = local102.method1123();
		}
		return local102 == null ? null : local102.method1125(this.aClass6_Sub3_Sub7_2, this.anInt1570, this.anInt1561, this.anInt1566, this.anInt1564, this.anInt1563, this.anInt1577, this.anInt1559);
	}
}
