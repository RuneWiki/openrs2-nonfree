import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public final class Class2_Sub1_Sub1_Sub3 extends Class2_Sub1_Sub1 {

	@OriginalMember(owner = "client!j", name = "Wb", descriptor = "I")
	private final int anInt1601;

	@OriginalMember(owner = "client!j", name = "cc", descriptor = "I")
	private final int anInt1606;

	@OriginalMember(owner = "client!j", name = "Ub", descriptor = "I")
	private final int anInt1599;

	@OriginalMember(owner = "client!j", name = "Lb", descriptor = "I")
	private final int anInt1591;

	@OriginalMember(owner = "client!j", name = "Xb", descriptor = "I")
	private final int anInt1602;

	@OriginalMember(owner = "client!j", name = "Jb", descriptor = "I")
	private final int anInt1589;

	@OriginalMember(owner = "client!j", name = "Ob", descriptor = "I")
	private final int anInt1593;

	@OriginalMember(owner = "client!j", name = "bc", descriptor = "Lclient!he;")
	private Class2_Sub1_Sub9 aClass2_Sub1_Sub9_2;

	@OriginalMember(owner = "client!j", name = "Tb", descriptor = "I")
	private int anInt1598;

	@OriginalMember(owner = "client!j", name = "Rb", descriptor = "I")
	private int anInt1596;

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "(IIIIIIIIZ)V")
	public Class2_Sub1_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		this.anInt1601 = arg3;
		this.anInt1606 = arg0;
		this.anInt1599 = arg6;
		this.anInt1591 = arg2;
		this.anInt1602 = arg4;
		this.anInt1589 = arg5;
		this.anInt1593 = arg1;
		if (arg7 != -1) {
			this.aClass2_Sub1_Sub9_2 = Static4.method192(arg7);
			this.anInt1598 = 0;
			this.anInt1596 = Static69.anInt2806 - 1;
			if (arg8 && this.aClass2_Sub1_Sub9_2.anInt1444 != -1) {
				this.anInt1598 = (int) ((double) this.aClass2_Sub1_Sub9_2.anIntArray147.length * Math.random());
				this.anInt1596 -= (int) (Math.random() * (double) this.aClass2_Sub1_Sub9_2.anIntArray144[this.anInt1598]);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!j", name = "f", descriptor = "(I)Lclient!pa;")
	@Override
	public Class2_Sub1_Sub1_Sub5 method1778() {
		if (this.aClass2_Sub1_Sub9_2 != null) {
			@Pc(10) int local10 = Static69.anInt2806 - this.anInt1596;
			if (local10 > 100 && this.aClass2_Sub1_Sub9_2.anInt1444 > 0) {
				local10 = 100;
			}
			label37: {
				do {
					do {
						if (this.aClass2_Sub1_Sub9_2.anIntArray144[this.anInt1598] >= local10) {
							break label37;
						}
						local10 -= this.aClass2_Sub1_Sub9_2.anIntArray144[this.anInt1598];
						this.anInt1598++;
					} while (this.aClass2_Sub1_Sub9_2.anIntArray147.length > this.anInt1598);
					this.anInt1598 -= this.aClass2_Sub1_Sub9_2.anInt1444;
				} while (this.anInt1598 >= 0 && this.aClass2_Sub1_Sub9_2.anIntArray147.length > this.anInt1598);
				this.aClass2_Sub1_Sub9_2 = null;
			}
			this.anInt1596 = Static69.anInt2806 - local10;
		}
		@Pc(103) Class2_Sub1_Sub10 local103 = Static28.method739(this.anInt1606);
		if (local103.anIntArray154 != null) {
			local103 = local103.method1018();
		}
		return local103 == null ? null : local103.method1014(this.anInt1601, this.anInt1602, this.anInt1598, this.anInt1593, this.anInt1591, this.aClass2_Sub1_Sub9_2, this.anInt1599, this.anInt1589);
	}
}
