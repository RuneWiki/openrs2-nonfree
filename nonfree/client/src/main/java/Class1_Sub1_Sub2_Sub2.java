import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class1_Sub1_Sub2_Sub2 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!ce", name = "qb", descriptor = "Z")
	public boolean aBoolean55 = false;

	@OriginalMember(owner = "client!ce", name = "zb", descriptor = "I")
	private int anInt622 = 0;

	@OriginalMember(owner = "client!ce", name = "Fb", descriptor = "I")
	private int anInt627 = 0;

	@OriginalMember(owner = "client!ce", name = "pb", descriptor = "I")
	public final int anInt615;

	@OriginalMember(owner = "client!ce", name = "Eb", descriptor = "I")
	public final int anInt626;

	@OriginalMember(owner = "client!ce", name = "ub", descriptor = "I")
	public final int anInt619;

	@OriginalMember(owner = "client!ce", name = "Ob", descriptor = "I")
	public final int anInt632;

	@OriginalMember(owner = "client!ce", name = "Rb", descriptor = "I")
	private final int anInt634;

	@OriginalMember(owner = "client!ce", name = "Db", descriptor = "I")
	public final int anInt625;

	@OriginalMember(owner = "client!ce", name = "Nb", descriptor = "Lclient!f;")
	private Class1_Sub1_Sub7 aClass1_Sub1_Sub7_1;

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(IIIIIII)V")
	public Class1_Sub1_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt615 = arg5 + arg6;
		this.anInt626 = arg1;
		this.anInt619 = arg4;
		this.anInt632 = arg3;
		this.anInt634 = arg0;
		this.anInt625 = arg2;
		@Pc(36) int local36 = Static64.method1146(this.anInt634).anInt2616;
		if (local36 == -1) {
			this.aBoolean55 = true;
		} else {
			this.aBoolean55 = false;
			this.aClass1_Sub1_Sub7_1 = Static82.method1398(local36);
		}
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "(I)Lclient!na;")
	@Override
	public Class1_Sub1_Sub2_Sub7 method1790() {
		@Pc(17) Class1_Sub1_Sub14 local17 = Static64.method1146(this.anInt634);
		@Pc(26) Class1_Sub1_Sub2_Sub7 local26;
		if (this.aBoolean55) {
			local26 = local17.method1840(-1);
		} else {
			local26 = local17.method1840(this.anInt622);
		}
		return local26 == null ? null : local26;
	}

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "(II)V")
	public void method359(@OriginalArg(1) int arg0) {
		if (this.aBoolean55) {
			return;
		}
		this.anInt627 += arg0;
		while (this.aClass1_Sub1_Sub7_1.anIntArray149[this.anInt622] < this.anInt627) {
			this.anInt627 -= this.aClass1_Sub1_Sub7_1.anIntArray149[this.anInt622];
			this.anInt622++;
			if (this.anInt622 >= this.aClass1_Sub1_Sub7_1.anIntArray151.length) {
				this.aBoolean55 = true;
				return;
			}
		}
	}
}
