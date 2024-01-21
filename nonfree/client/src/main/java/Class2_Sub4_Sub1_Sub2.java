import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public final class Class2_Sub4_Sub1_Sub2 extends Class2_Sub4_Sub1 {

	@OriginalMember(owner = "client!c", name = "Jb", descriptor = "I")
	private int anInt729 = 0;

	@OriginalMember(owner = "client!c", name = "Eb", descriptor = "I")
	private int anInt724 = 0;

	@OriginalMember(owner = "client!c", name = "Ob", descriptor = "Z")
	public boolean aBoolean22 = false;

	@OriginalMember(owner = "client!c", name = "Fb", descriptor = "I")
	public final int anInt725;

	@OriginalMember(owner = "client!c", name = "Tb", descriptor = "I")
	private final int anInt734;

	@OriginalMember(owner = "client!c", name = "Pb", descriptor = "I")
	public final int anInt731;

	@OriginalMember(owner = "client!c", name = "Rb", descriptor = "I")
	public final int anInt732;

	@OriginalMember(owner = "client!c", name = "Mb", descriptor = "I")
	public final int anInt730;

	@OriginalMember(owner = "client!c", name = "Xb", descriptor = "I")
	public final int anInt735;

	@OriginalMember(owner = "client!c", name = "Ub", descriptor = "Lclient!ah;")
	private Class2_Sub4_Sub2 aClass2_Sub4_Sub2_1;

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "(IIIIIII)V")
	public Class2_Sub4_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt725 = arg1;
		this.anInt734 = arg0;
		this.anInt731 = arg4;
		this.anInt732 = arg2;
		this.anInt730 = arg3;
		this.anInt735 = arg5 + arg6;
		@Pc(36) int local36 = Static19.method611(this.anInt734).anInt1224;
		if (local36 == -1) {
			this.aBoolean22 = true;
		} else {
			this.aBoolean22 = false;
			this.aClass2_Sub4_Sub2_1 = Static49.method926(local36);
		}
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(I)Lclient!df;")
	@Override
	protected Class2_Sub4_Sub1_Sub3 method2858() {
		@Pc(8) Class2_Sub4_Sub7 local8 = Static19.method611(this.anInt734);
		@Pc(16) Class2_Sub4_Sub1_Sub3 local16;
		if (this.aBoolean22) {
			local16 = local8.method892(-1);
		} else {
			local16 = local8.method892(this.anInt729);
		}
		return local16 == null ? null : local16;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IB)V")
	public void method470(@OriginalArg(0) int arg0) {
		if (this.aBoolean22) {
			return;
		}
		this.anInt724 += arg0;
		while (this.aClass2_Sub4_Sub2_1.anIntArray36[this.anInt729] < this.anInt724) {
			this.anInt724 -= this.aClass2_Sub4_Sub2_1.anIntArray36[this.anInt729];
			this.anInt729++;
			if (this.anInt729 >= this.aClass2_Sub4_Sub2_1.anIntArray37.length) {
				this.aBoolean22 = true;
				break;
			}
		}
	}
}
