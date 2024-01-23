import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class4_Sub6_Sub23 extends Class4_Sub6 {

	@OriginalMember(owner = "client!oc", name = "N", descriptor = "I")
	private int anInt3758;

	@OriginalMember(owner = "client!oc", name = "O", descriptor = "I")
	private int anInt3759;

	@OriginalMember(owner = "client!oc", name = "P", descriptor = "I")
	private int anInt3760;

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub23() {
		this(0);
	}

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(I)V")
	private Class4_Sub6_Sub23(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method2995(arg0);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!p;II)V")
	@Override
	public void method4381(@OriginalArg(0) Class4_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.method2995(arg0.method1835());
		}
	}

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "(BI)V")
	private void method2995(@OriginalArg(1) int arg0) {
		this.anInt3760 = arg0 >> 4 & 0xFF0;
		this.anInt3758 = arg0 >> 12 & 0xFF0;
		this.anInt3759 = (arg0 & 0xFF) << 4;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4379(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = this.aClass84_41.method2153(arg0);
		if (this.aClass84_41.aBoolean183) {
			@Pc(20) int[] local20 = local11[0];
			@Pc(24) int[] local24 = local11[1];
			@Pc(28) int[] local28 = local11[2];
			for (@Pc(30) int local30 = 0; local30 < Static2.anInt19; local30++) {
				local20[local30] = this.anInt3758;
				local24[local30] = this.anInt3760;
				local28[local30] = this.anInt3759;
			}
		}
		return local11;
	}
}
