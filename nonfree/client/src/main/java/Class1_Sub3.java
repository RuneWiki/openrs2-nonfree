import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oh")
public abstract class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!oh", name = "v", descriptor = "Lclient!nr;")
	protected Class172 aClass172_41;

	@OriginalMember(owner = "client!oh", name = "w", descriptor = "I")
	public int anInt7832;

	@OriginalMember(owner = "client!oh", name = "C", descriptor = "Lclient!bc;")
	protected Class20 aClass20_41;

	@OriginalMember(owner = "client!oh", name = "p", descriptor = "[Lclient!oh;")
	public final Class1_Sub3[] aClass1_Sub3Array42;

	@OriginalMember(owner = "client!oh", name = "z", descriptor = "Z")
	public boolean aBoolean494;

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(IZ)V")
	protected Class1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass1_Sub3Array42 = new Class1_Sub3[arg0];
		this.aBoolean494 = arg1;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(III)[[I")
	protected final int[][] method6072(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass1_Sub3Array42[arg0].aBoolean494) {
			@Pc(30) int[] local30 = this.aClass1_Sub3Array42[arg0].method6084(arg1);
			return new int[][] { local30, local30, local30 };
		} else {
			return this.aClass1_Sub3Array42[arg0].method6083(arg1);
		}
	}

	@OriginalMember(owner = "client!oh", name = "d", descriptor = "(I)V")
	public void method6074() {
	}

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "(B)I")
	public int method6075() {
		return -1;
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(III)[I")
	protected final int[] method6076(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass1_Sub3Array42[arg0].aBoolean494 ? this.aClass1_Sub3Array42[arg0].method6084(arg1) : this.aClass1_Sub3Array42[arg0].method6083(arg1)[0];
	}

	@OriginalMember(owner = "client!oh", name = "e", descriptor = "(I)I")
	public int method6077() {
		return -1;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!lh;II)V")
	public void method6079(@OriginalArg(0) Class1_Sub1 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Z)V")
	public void method6080() {
		if (this.aBoolean494) {
			this.aClass172_41.method3958();
			this.aClass172_41 = null;
		} else {
			this.aClass20_41.method473();
			this.aClass20_41 = null;
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(BII)V")
	public void method6081(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = this.anInt7832 == 255 ? arg1 : this.anInt7832;
		if (this.aBoolean494) {
			this.aClass172_41 = new Class172(local14, arg1, arg0);
		} else {
			this.aClass20_41 = new Class20(local14, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)[[I")
	public int[][] method6083(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(II)[I")
	public int[] method6084(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}
}
