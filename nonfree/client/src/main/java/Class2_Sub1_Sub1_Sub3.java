import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public final class Class2_Sub1_Sub1_Sub3 extends Class2_Sub1_Sub1 {

	@OriginalMember(owner = "client!ef", name = "wb", descriptor = "Z")
	public boolean aBoolean28 = false;

	@OriginalMember(owner = "client!ef", name = "Bb", descriptor = "I")
	private int anInt693 = 0;

	@OriginalMember(owner = "client!ef", name = "ob", descriptor = "I")
	private int anInt687 = 0;

	@OriginalMember(owner = "client!ef", name = "jb", descriptor = "I")
	public final int anInt686;

	@OriginalMember(owner = "client!ef", name = "Ob", descriptor = "I")
	public final int anInt697;

	@OriginalMember(owner = "client!ef", name = "fb", descriptor = "I")
	private final int anInt685;

	@OriginalMember(owner = "client!ef", name = "sb", descriptor = "I")
	public final int anInt690;

	@OriginalMember(owner = "client!ef", name = "rb", descriptor = "I")
	public final int anInt689;

	@OriginalMember(owner = "client!ef", name = "db", descriptor = "I")
	public final int anInt684;

	@OriginalMember(owner = "client!ef", name = "pb", descriptor = "Lclient!ae;")
	private Class2_Sub1_Sub2 aClass2_Sub1_Sub2_2;

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(IIIIIII)V")
	public Class2_Sub1_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt686 = arg5 + arg6;
		this.anInt697 = arg2;
		this.anInt685 = arg0;
		this.anInt690 = arg4;
		this.anInt689 = arg3;
		this.anInt684 = arg1;
		@Pc(36) int local36 = Static69.method1228(this.anInt685).anInt1625;
		if (local36 == -1) {
			this.aBoolean28 = true;
		} else {
			this.aBoolean28 = false;
			this.aClass2_Sub1_Sub2_2 = Static23.method1313(local36);
		}
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(IB)V")
	public void method577(@OriginalArg(0) int arg0) {
		if (this.aBoolean28) {
			return;
		}
		this.anInt687 += arg0;
		while (this.anInt687 > this.aClass2_Sub1_Sub2_2.anIntArray21[this.anInt693]) {
			this.anInt687 -= this.aClass2_Sub1_Sub2_2.anIntArray21[this.anInt693];
			this.anInt693++;
			if (this.anInt693 >= this.aClass2_Sub1_Sub2_2.anIntArray19.length) {
				this.aBoolean28 = true;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "(I)Lclient!wb;")
	@Override
	public Class2_Sub1_Sub1_Sub7 method1996() {
		@Pc(13) Class2_Sub1_Sub9 local13 = Static69.method1228(this.anInt685);
		@Pc(24) Class2_Sub1_Sub1_Sub7 local24;
		if (this.aBoolean28) {
			local24 = local13.method1224(-1);
		} else {
			local24 = local13.method1224(this.anInt693);
		}
		return local24 == null ? null : local24;
	}
}
