import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class5_Sub1_Sub1_Sub6 extends Class5_Sub1_Sub1 {

	@OriginalMember(owner = "client!te", name = "nb", descriptor = "I")
	private int anInt2614 = 0;

	@OriginalMember(owner = "client!te", name = "hb", descriptor = "Z")
	public boolean aBoolean117 = false;

	@OriginalMember(owner = "client!te", name = "xb", descriptor = "I")
	private int anInt2621 = 0;

	@OriginalMember(owner = "client!te", name = "lb", descriptor = "I")
	private final int anInt2612;

	@OriginalMember(owner = "client!te", name = "gb", descriptor = "I")
	public final int anInt2608;

	@OriginalMember(owner = "client!te", name = "jb", descriptor = "I")
	public final int anInt2610;

	@OriginalMember(owner = "client!te", name = "ob", descriptor = "I")
	public final int anInt2615;

	@OriginalMember(owner = "client!te", name = "sb", descriptor = "I")
	public final int anInt2618;

	@OriginalMember(owner = "client!te", name = "ib", descriptor = "I")
	public final int anInt2609;

	@OriginalMember(owner = "client!te", name = "yb", descriptor = "Lclient!wc;")
	private Class5_Sub1_Sub18 aClass5_Sub1_Sub18_3;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "(IIIIIII)V")
	public Class5_Sub1_Sub1_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt2612 = arg0;
		this.anInt2608 = arg2;
		this.anInt2610 = arg4;
		this.anInt2615 = arg3;
		this.anInt2618 = arg5 + arg6;
		this.anInt2609 = arg1;
		@Pc(36) int local36 = Static109.method1740(this.anInt2612).anInt2101;
		if (local36 == -1) {
			this.aBoolean117 = true;
		} else {
			this.aBoolean117 = false;
			this.aClass5_Sub1_Sub18_3 = Static57.method1017(local36);
		}
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(Z)Lclient!bf;")
	@Override
	public Class5_Sub1_Sub1_Sub2 method1976() {
		@Pc(13) Class5_Sub1_Sub13 local13 = Static109.method1740(this.anInt2612);
		@Pc(21) Class5_Sub1_Sub1_Sub2 local21;
		if (this.aBoolean117) {
			local21 = local13.method1435(-1);
		} else {
			local21 = local13.method1435(this.anInt2614);
		}
		return local21 == null ? null : local21;
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(II)V")
	public void method1738(@OriginalArg(1) int arg0) {
		if (this.aBoolean117) {
			return;
		}
		this.anInt2621 += arg0;
		while (this.anInt2621 > this.aClass5_Sub1_Sub18_3.anIntArray290[this.anInt2614]) {
			this.anInt2621 -= this.aClass5_Sub1_Sub18_3.anIntArray290[this.anInt2614];
			this.anInt2614++;
			if (this.anInt2614 >= this.aClass5_Sub1_Sub18_3.anIntArray294.length) {
				this.aBoolean117 = true;
				return;
			}
		}
	}
}
