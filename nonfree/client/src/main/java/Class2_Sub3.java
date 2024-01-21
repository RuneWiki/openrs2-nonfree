import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public abstract class Class2_Sub3 extends Class2 {

	@OriginalMember(owner = "client!v", name = "x", descriptor = "Lclient!cc;")
	protected Class12 aClass12_39;

	@OriginalMember(owner = "client!v", name = "K", descriptor = "I")
	public int anInt4057;

	@OriginalMember(owner = "client!v", name = "O", descriptor = "Lclient!i;")
	protected Class33 aClass33_39;

	@OriginalMember(owner = "client!v", name = "R", descriptor = "I")
	public int anInt4060;

	@OriginalMember(owner = "client!v", name = "W", descriptor = "[Lclient!v;")
	public final Class2_Sub3[] aClass2_Sub3Array40;

	@OriginalMember(owner = "client!v", name = "A", descriptor = "Z")
	public boolean aBoolean173;

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "(IZ)V")
	protected Class2_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass2_Sub3Array40 = new Class2_Sub3[arg0];
		this.aBoolean173 = arg1;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(II)[I")
	public int[] method2889(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(BII)V")
	public final void method2891(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(20) int local20 = this.anInt4060 == 255 ? arg1 : this.anInt4060;
		if (this.aBoolean173) {
			this.aClass33_39 = new Class33(local20, arg1, arg0);
		} else {
			this.aClass12_39 = new Class12(local20, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(Z)V")
	public void method2892() {
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(B)I")
	public int method2893() {
		return -1;
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(II)[[I")
	public int[][] method2894(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(B)V")
	public final void method2898() {
		if (this.aBoolean173) {
			this.aClass33_39.method1307();
			this.aClass33_39 = null;
		} else {
			this.aClass12_39.method480();
			this.aClass12_39 = null;
		}
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(BII)[[I")
	protected final int[][] method2900(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass2_Sub3Array40[arg1].aBoolean173) {
			@Pc(30) int[] local30 = this.aClass2_Sub3Array40[arg1].method2889(arg0);
			return new int[][] { local30, local30, local30 };
		} else {
			return this.aClass2_Sub3Array40[arg1].method2894(arg0);
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(III)[I")
	protected final int[] method2901(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aClass2_Sub3Array40[arg0].aBoolean173 ? this.aClass2_Sub3Array40[arg0].method2889(arg1) : this.aClass2_Sub3Array40[arg0].method2894(arg1)[0];
	}

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(B)I")
	public int method2903() {
		return -1;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IBLclient!ab;)V")
	public void method2904(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub2 arg1) {
	}
}
