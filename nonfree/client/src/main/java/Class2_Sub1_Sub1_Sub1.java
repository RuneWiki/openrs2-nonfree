import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aa")
public final class Class2_Sub1_Sub1_Sub1 extends Class2_Sub1_Sub1 {

	@OriginalMember(owner = "client!aa", name = "rb", descriptor = "I")
	private int anInt111 = 0;

	@OriginalMember(owner = "client!aa", name = "sb", descriptor = "I")
	private int anInt112 = 0;

	@OriginalMember(owner = "client!aa", name = "qb", descriptor = "Z")
	public boolean aBoolean10 = false;

	@OriginalMember(owner = "client!aa", name = "ub", descriptor = "I")
	public final int anInt114;

	@OriginalMember(owner = "client!aa", name = "gb", descriptor = "I")
	public final int anInt104;

	@OriginalMember(owner = "client!aa", name = "tb", descriptor = "I")
	public final int anInt113;

	@OriginalMember(owner = "client!aa", name = "yb", descriptor = "I")
	public final int anInt117;

	@OriginalMember(owner = "client!aa", name = "ib", descriptor = "I")
	public final int anInt105;

	@OriginalMember(owner = "client!aa", name = "Cb", descriptor = "I")
	private final int anInt119;

	@OriginalMember(owner = "client!aa", name = "Db", descriptor = "Lclient!h;")
	private Class2_Sub1_Sub8 aClass2_Sub1_Sub8_1;

	@OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(IIIIIII)V")
	public Class2_Sub1_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt114 = arg3;
		this.anInt104 = arg2;
		this.anInt113 = arg1;
		this.anInt117 = arg4;
		this.anInt105 = arg5 + arg6;
		this.anInt119 = arg0;
		@Pc(36) int local36 = Static106.method1805(this.anInt119).anInt2199;
		if (local36 == -1) {
			this.aBoolean10 = true;
		} else {
			this.aBoolean10 = false;
			this.aClass2_Sub1_Sub8_1 = Static93.method1443(local36);
		}
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(II)V")
	public void method58(@OriginalArg(0) int arg0) {
		if (this.aBoolean10) {
			return;
		}
		this.anInt111 += arg0;
		while (this.aClass2_Sub1_Sub8_1.anIntArray174[this.anInt112] < this.anInt111) {
			this.anInt111 -= this.aClass2_Sub1_Sub8_1.anIntArray174[this.anInt112];
			this.anInt112++;
			if (this.anInt112 >= this.aClass2_Sub1_Sub8_1.anIntArray176.length) {
				this.aBoolean10 = true;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(Z)Lclient!be;")
	@Override
	public Class2_Sub1_Sub1_Sub2 method1423() {
		@Pc(17) Class2_Sub1_Sub12 local17 = Static106.method1805(this.anInt119);
		@Pc(25) Class2_Sub1_Sub1_Sub2 local25;
		if (this.aBoolean10) {
			local25 = local17.method1343(-1);
		} else {
			local25 = local17.method1343(this.anInt112);
		}
		return local25 == null ? null : local25;
	}
}
