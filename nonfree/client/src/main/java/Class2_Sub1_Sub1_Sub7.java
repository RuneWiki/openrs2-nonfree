import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class2_Sub1_Sub1_Sub7 extends Class2_Sub1_Sub1 {

	@OriginalMember(owner = "client!jc", name = "Eb", descriptor = "I")
	private final int anInt1726;

	@OriginalMember(owner = "client!jc", name = "hb", descriptor = "I")
	private final int anInt1714;

	@OriginalMember(owner = "client!jc", name = "vb", descriptor = "I")
	private final int anInt1721;

	@OriginalMember(owner = "client!jc", name = "gb", descriptor = "I")
	private final int anInt1713;

	@OriginalMember(owner = "client!jc", name = "zb", descriptor = "I")
	private final int anInt1723;

	@OriginalMember(owner = "client!jc", name = "ub", descriptor = "I")
	private final int anInt1720;

	@OriginalMember(owner = "client!jc", name = "nb", descriptor = "I")
	private final int anInt1717;

	@OriginalMember(owner = "client!jc", name = "Db", descriptor = "Lclient!h;")
	private Class2_Sub1_Sub8 aClass2_Sub1_Sub8_3;

	@OriginalMember(owner = "client!jc", name = "Ab", descriptor = "I")
	private int anInt1724;

	@OriginalMember(owner = "client!jc", name = "yb", descriptor = "I")
	private int anInt1722;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(IIIIIIIIZLclient!e;)V")
	public Class2_Sub1_Sub1_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) Class2_Sub1_Sub1 arg9) {
		this.anInt1726 = arg4;
		this.anInt1714 = arg0;
		this.anInt1721 = arg2;
		this.anInt1713 = arg6;
		this.anInt1723 = arg1;
		this.anInt1720 = arg5;
		this.anInt1717 = arg3;
		if (arg7 != -1) {
			this.aClass2_Sub1_Sub8_3 = Static93.method1443(arg7);
			this.anInt1724 = Static10.anInt300 - 1;
			this.anInt1722 = 0;
			if (this.aClass2_Sub1_Sub8_3.anInt1346 == 0 && arg9 != null && arg9 instanceof Class2_Sub1_Sub1_Sub7) {
				@Pc(51) Class2_Sub1_Sub1_Sub7 local51 = (Class2_Sub1_Sub1_Sub7) arg9;
				if (this.aClass2_Sub1_Sub8_3 == local51.aClass2_Sub1_Sub8_3) {
					this.anInt1724 = local51.anInt1724;
					this.anInt1722 = local51.anInt1722;
					return;
				}
			}
			if (arg8 && this.aClass2_Sub1_Sub8_3.anInt1352 != -1) {
				this.anInt1722 = (int) (Math.random() * (double) this.aClass2_Sub1_Sub8_3.anIntArray176.length);
				this.anInt1724 -= (int) (Math.random() * (double) this.aClass2_Sub1_Sub8_3.anIntArray174[this.anInt1722]);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(Z)Lclient!be;")
	@Override
	public Class2_Sub1_Sub1_Sub2 method1423() {
		if (this.aClass2_Sub1_Sub8_3 != null) {
			@Pc(14) int local14 = Static10.anInt300 - this.anInt1724;
			if (local14 > 100 && this.aClass2_Sub1_Sub8_3.anInt1352 > 0) {
				local14 = 100;
			}
			label37: {
				do {
					do {
						if (this.aClass2_Sub1_Sub8_3.anIntArray174[this.anInt1722] >= local14) {
							break label37;
						}
						local14 -= this.aClass2_Sub1_Sub8_3.anIntArray174[this.anInt1722];
						this.anInt1722++;
					} while (this.anInt1722 < this.aClass2_Sub1_Sub8_3.anIntArray176.length);
					this.anInt1722 -= this.aClass2_Sub1_Sub8_3.anInt1352;
				} while (this.anInt1722 >= 0 && this.aClass2_Sub1_Sub8_3.anIntArray176.length > this.anInt1722);
				this.aClass2_Sub1_Sub8_3 = null;
			}
			this.anInt1724 = Static10.anInt300 - local14;
		}
		@Pc(95) Class2_Sub1_Sub10 local95 = Static18.method404(this.anInt1714);
		if (local95.anIntArray207 != null) {
			local95 = local95.method965();
		}
		return local95 == null ? null : local95.method962(this.anInt1721, this.anInt1717, this.anInt1723, this.anInt1720, this.anInt1722, this.aClass2_Sub1_Sub8_3, this.anInt1726, this.anInt1713);
	}
}
