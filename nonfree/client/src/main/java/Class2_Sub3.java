import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public abstract class Class2_Sub3 extends Class2 {

	@OriginalMember(owner = "client!j", name = "q", descriptor = "Lclient!jh;")
	protected Class43 aClass43_41;

	@OriginalMember(owner = "client!j", name = "A", descriptor = "I")
	public int anInt4037;

	@OriginalMember(owner = "client!j", name = "B", descriptor = "I")
	public int anInt4038;

	@OriginalMember(owner = "client!j", name = "H", descriptor = "Lclient!ma;")
	protected Class51 aClass51_41;

	@OriginalMember(owner = "client!j", name = "G", descriptor = "[Lclient!j;")
	public final Class2_Sub3[] aClass2_Sub3Array41;

	@OriginalMember(owner = "client!j", name = "x", descriptor = "Z")
	public boolean aBoolean175;

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "(IZ)V")
	protected Class2_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass2_Sub3Array41 = new Class2_Sub3[arg0];
		this.aBoolean175 = arg1;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(III)[I")
	protected final int[] method3011(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass2_Sub3Array41[arg1].aBoolean175 ? this.aClass2_Sub3Array41[arg1].method3016(arg0) : this.aClass2_Sub3Array41[arg1].method3023(arg0)[0];
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(BILclient!ja;)V")
	public void method3013(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub13 arg1) {
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(II)[I")
	public int[] method3016(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(ZII)[[I")
	protected final int[][] method3017(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass2_Sub3Array41[arg1].aBoolean175) {
			@Pc(30) int[] local30 = this.aClass2_Sub3Array41[arg1].method3016(arg0);
			return new int[][] { local30, local30, local30 };
		} else {
			return this.aClass2_Sub3Array41[arg1].method3023(arg0);
		}
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(I)I")
	public int method3018() {
		return -1;
	}

	@OriginalMember(owner = "client!j", name = "c", descriptor = "(I)V")
	public void method3019() {
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(BII)V")
	public final void method3020(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = this.anInt4037 == 255 ? arg1 : this.anInt4037;
		if (this.aBoolean175) {
			this.aClass51_41 = new Class51(local14, arg1, arg0);
		} else {
			this.aClass43_41 = new Class43(local14, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!j", name = "d", descriptor = "(I)I")
	public int method3021() {
		return -1;
	}

	@OriginalMember(owner = "client!j", name = "c", descriptor = "(B)V")
	public final void method3022() {
		if (this.aBoolean175) {
			this.aClass51_41.method1732();
			this.aClass51_41 = null;
		} else {
			this.aClass43_41.method1444();
			this.aClass43_41 = null;
		}
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(II)[[I")
	public int[][] method3023(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}
}
