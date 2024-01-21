import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class Class1_Sub1_Sub1_Sub3 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!ng", name = "X", descriptor = "I")
	private int anInt2864 = 0;

	@OriginalMember(owner = "client!ng", name = "lb", descriptor = "Z")
	public boolean aBoolean140 = false;

	@OriginalMember(owner = "client!ng", name = "kb", descriptor = "I")
	private int anInt2873 = 0;

	@OriginalMember(owner = "client!ng", name = "ub", descriptor = "I")
	public final int anInt2878;

	@OriginalMember(owner = "client!ng", name = "mb", descriptor = "I")
	public final int anInt2874;

	@OriginalMember(owner = "client!ng", name = "pb", descriptor = "I")
	public final int anInt2875;

	@OriginalMember(owner = "client!ng", name = "fb", descriptor = "I")
	public final int anInt2870;

	@OriginalMember(owner = "client!ng", name = "qb", descriptor = "I")
	private final int anInt2876;

	@OriginalMember(owner = "client!ng", name = "gb", descriptor = "I")
	public final int anInt2871;

	@OriginalMember(owner = "client!ng", name = "jb", descriptor = "Lclient!wf;")
	private Class1_Sub1_Sub18 aClass1_Sub1_Sub18_1;

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(IIIIIII)V")
	public Class1_Sub1_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt2878 = arg1;
		this.anInt2874 = arg3;
		this.anInt2875 = arg6 + arg5;
		this.anInt2870 = arg2;
		this.anInt2876 = arg0;
		this.anInt2871 = arg4;
		@Pc(37) int local37 = Static13.method251(this.anInt2876).anInt4142;
		if (local37 == -1) {
			this.aBoolean140 = true;
		} else {
			this.aBoolean140 = false;
			this.aClass1_Sub1_Sub18_1 = Static157.method2652(local37);
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)V")
	public void method1987(@OriginalArg(0) int arg0) {
		if (this.aBoolean140) {
			return;
		}
		this.anInt2864 += arg0;
		while (this.anInt2864 > this.aClass1_Sub1_Sub18_1.anIntArray601[this.anInt2873]) {
			this.anInt2864 -= this.aClass1_Sub1_Sub18_1.anIntArray601[this.anInt2873];
			this.anInt2873++;
			if (this.aClass1_Sub1_Sub18_1.anIntArray602.length <= this.anInt2873) {
				this.aBoolean140 = true;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ng", name = "h", descriptor = "(I)Lclient!w;")
	@Override
	protected Class1_Sub1_Sub1_Sub2 method3157() {
		@Pc(15) Class1_Sub1_Sub16 local15 = Static13.method251(this.anInt2876);
		@Pc(26) Class1_Sub1_Sub1_Sub2 local26;
		if (this.aBoolean140) {
			local26 = local15.method2919(-1);
		} else {
			local26 = local15.method2919(this.anInt2873);
		}
		return local26 == null ? null : local26;
	}
}
