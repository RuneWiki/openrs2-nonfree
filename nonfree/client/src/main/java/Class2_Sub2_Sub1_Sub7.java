import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class2_Sub2_Sub1_Sub7 extends Class2_Sub2_Sub1 {

	@OriginalMember(owner = "client!vc", name = "kb", descriptor = "I")
	private int anInt4185 = 0;

	@OriginalMember(owner = "client!vc", name = "rb", descriptor = "Z")
	public boolean aBoolean172 = false;

	@OriginalMember(owner = "client!vc", name = "sb", descriptor = "I")
	private int anInt4191 = 0;

	@OriginalMember(owner = "client!vc", name = "vb", descriptor = "I")
	public final int anInt4194;

	@OriginalMember(owner = "client!vc", name = "ub", descriptor = "I")
	public final int anInt4193;

	@OriginalMember(owner = "client!vc", name = "lb", descriptor = "I")
	public final int anInt4186;

	@OriginalMember(owner = "client!vc", name = "qb", descriptor = "I")
	private final int anInt4190;

	@OriginalMember(owner = "client!vc", name = "jb", descriptor = "I")
	public final int anInt4184;

	@OriginalMember(owner = "client!vc", name = "tb", descriptor = "I")
	public final int anInt4192;

	@OriginalMember(owner = "client!vc", name = "wb", descriptor = "Lclient!tc;")
	private Class2_Sub2_Sub15 aClass2_Sub2_Sub15_3;

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(IIIIIII)V")
	public Class2_Sub2_Sub1_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt4194 = arg4;
		this.anInt4193 = arg3;
		this.anInt4186 = arg5 + arg6;
		this.anInt4190 = arg0;
		this.anInt4184 = arg2;
		this.anInt4192 = arg1;
		@Pc(36) int local36 = Static41.method808(this.anInt4190).anInt1862;
		if (local36 == -1) {
			this.aBoolean172 = true;
		} else {
			this.aBoolean172 = false;
			this.aClass2_Sub2_Sub15_3 = Static140.method2333(local36);
		}
	}

	@OriginalMember(owner = "client!vc", name = "f", descriptor = "(I)Lclient!cd;")
	@Override
	protected Class2_Sub2_Sub1_Sub2 method2908() {
		@Pc(8) Class2_Sub2_Sub11 local8 = Static41.method808(this.anInt4190);
		@Pc(17) Class2_Sub2_Sub1_Sub2 local17;
		if (this.aBoolean172) {
			local17 = local8.method1342(-1);
		} else {
			local17 = local8.method1342(this.anInt4185);
		}
		return local17 == null ? null : local17;
	}

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "(II)V")
	public void method2832(@OriginalArg(0) int arg0) {
		if (this.aBoolean172) {
			return;
		}
		this.anInt4191 += arg0;
		while (this.anInt4191 > this.aClass2_Sub2_Sub15_3.anIntArray549[this.anInt4185]) {
			this.anInt4191 -= this.aClass2_Sub2_Sub15_3.anIntArray549[this.anInt4185];
			this.anInt4185++;
			if (this.anInt4185 >= this.aClass2_Sub2_Sub15_3.anIntArray548.length) {
				this.aBoolean172 = true;
				return;
			}
		}
	}
}
