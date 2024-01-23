import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public final class Class1_Sub8 extends Class1 {

	@OriginalMember(owner = "client!bh", name = "n", descriptor = "I")
	public int anInt349;

	@OriginalMember(owner = "client!bh", name = "o", descriptor = "I")
	public int anInt350;

	@OriginalMember(owner = "client!bh", name = "p", descriptor = "Lclient!wj;")
	public Class181 aClass181_1;

	@OriginalMember(owner = "client!bh", name = "s", descriptor = "I")
	public int anInt353;

	@OriginalMember(owner = "client!bh", name = "u", descriptor = "Lclient!fj;")
	public Class14_Sub2_Sub1 aClass14_Sub2_Sub1_1;

	@OriginalMember(owner = "client!bh", name = "w", descriptor = "I")
	public int anInt356;

	@OriginalMember(owner = "client!bh", name = "y", descriptor = "[I")
	public int[] anIntArray43;

	@OriginalMember(owner = "client!bh", name = "z", descriptor = "Z")
	public boolean aBoolean29;

	@OriginalMember(owner = "client!bh", name = "B", descriptor = "I")
	public int anInt358;

	@OriginalMember(owner = "client!bh", name = "D", descriptor = "Lclient!ek;")
	public Class1_Sub5_Sub1 aClass1_Sub5_Sub1_1;

	@OriginalMember(owner = "client!bh", name = "E", descriptor = "Lclient!sc;")
	public Class14_Sub2_Sub2 aClass14_Sub2_Sub2_1;

	@OriginalMember(owner = "client!bh", name = "F", descriptor = "I")
	public int anInt359;

	@OriginalMember(owner = "client!bh", name = "H", descriptor = "I")
	public int anInt361;

	@OriginalMember(owner = "client!bh", name = "I", descriptor = "I")
	public int anInt362;

	@OriginalMember(owner = "client!bh", name = "J", descriptor = "Lclient!ek;")
	public Class1_Sub5_Sub1 aClass1_Sub5_Sub1_2;

	@OriginalMember(owner = "client!bh", name = "L", descriptor = "I")
	public int anInt363;

	@OriginalMember(owner = "client!bh", name = "M", descriptor = "I")
	public int anInt364;

	@OriginalMember(owner = "client!bh", name = "N", descriptor = "I")
	public int anInt365;

	@OriginalMember(owner = "client!bh", name = "t", descriptor = "I")
	public int anInt354 = 0;

	@OriginalMember(owner = "client!bh", name = "e", descriptor = "(B)V")
	public void method364() {
		@Pc(4) int local4 = this.anInt364;
		if (this.aClass181_1 != null) {
			@Pc(94) Class181 local94 = this.aClass181_1.method4427();
			if (local94 == null) {
				this.anInt353 = 0;
				this.anInt364 = -1;
				this.anIntArray43 = null;
				this.anInt362 = 0;
				this.anInt365 = 0;
				this.anInt350 = 0;
			} else {
				this.anInt365 = local94.anInt5563 * 128;
				this.anInt364 = local94.anInt5535;
				this.anInt362 = local94.anInt5546;
				this.anIntArray43 = local94.anIntArray551;
				this.anInt353 = local94.anInt5557;
				this.anInt350 = local94.anInt5543;
			}
		} else if (this.aClass14_Sub2_Sub2_1 != null) {
			@Pc(46) int local46 = Static207.method3769(this.aClass14_Sub2_Sub2_1);
			if (local46 != local4) {
				this.anInt364 = local46;
				@Pc(57) Class46 local57 = this.aClass14_Sub2_Sub2_1.aClass46_1;
				if (local57.anIntArray148 != null) {
					local57 = local57.method1283();
				}
				if (local57 == null) {
					this.anInt362 = this.anInt365 = 0;
				} else {
					this.anInt365 = local57.anInt1531 * 128;
					this.anInt362 = local57.anInt1556;
				}
			}
		} else if (this.aClass14_Sub2_Sub1_1 != null) {
			this.anInt364 = Static202.method3261(this.aClass14_Sub2_Sub1_1);
			this.anInt365 = this.aClass14_Sub2_Sub1_1.anInt1718 * 128;
			this.anInt362 = this.aClass14_Sub2_Sub1_1.anInt1737;
		}
		if (local4 != this.anInt364 && this.aClass1_Sub5_Sub1_1 != null) {
			Static141.aClass1_Sub5_Sub4_1.method4380(this.aClass1_Sub5_Sub1_1);
			this.aClass1_Sub5_Sub1_1 = null;
		}
	}
}
