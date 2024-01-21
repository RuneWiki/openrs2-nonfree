import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public abstract class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!df", name = "v", descriptor = "Lclient!sh;")
	protected Class80 aClass80_41;

	@OriginalMember(owner = "client!df", name = "z", descriptor = "I")
	public int anInt4096;

	@OriginalMember(owner = "client!df", name = "H", descriptor = "I")
	public int anInt4100;

	@OriginalMember(owner = "client!df", name = "L", descriptor = "Lclient!ii;")
	protected Class40 aClass40_41;

	@OriginalMember(owner = "client!df", name = "E", descriptor = "Z")
	public boolean aBoolean319;

	@OriginalMember(owner = "client!df", name = "y", descriptor = "[Lclient!df;")
	public final Class1_Sub1[] aClass1_Sub1Array42;

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "(IZ)V")
	protected Class1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean319 = arg1;
		this.aClass1_Sub1Array42 = new Class1_Sub1[arg0];
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(B)I")
	public int method3005() {
		return -1;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(II)[[I")
	public int[][] method3006(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!df", name = "c", descriptor = "(B)I")
	public int method3007() {
		return -1;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(BI)[I")
	public int[] method3008(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Z)V")
	public void method3009() {
	}

	@OriginalMember(owner = "client!df", name = "c", descriptor = "(I)V")
	public final void method3010() {
		if (this.aBoolean319) {
			this.aClass80_41.method2739();
			this.aClass80_41 = null;
		} else {
			this.aClass40_41.method1585();
			this.aClass40_41 = null;
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IILclient!ce;)V")
	public void method3011(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIB)[I")
	protected final int[] method3012(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aClass1_Sub1Array42[arg0].aBoolean319 ? this.aClass1_Sub1Array42[arg0].method3008(arg1) : this.aClass1_Sub1Array42[arg0].method3006(arg1)[0];
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(III)[[I")
	protected final int[][] method3013(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass1_Sub1Array42[arg1].aBoolean319) {
			@Pc(30) int[] local30 = this.aClass1_Sub1Array42[arg1].method3008(arg0);
			return new int[][] { local30, local30, local30 };
		} else {
			return this.aClass1_Sub1Array42[arg1].method3006(arg0);
		}
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(III)V")
	public final void method3015(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(22) int local22 = this.anInt4100 == 255 ? arg1 : this.anInt4100;
		if (this.aBoolean319) {
			this.aClass80_41 = new Class80(local22, arg1, arg0);
		} else {
			this.aClass40_41 = new Class40(local22, arg1, arg0);
		}
	}
}
