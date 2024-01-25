import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bu")
public abstract class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!bu", name = "r", descriptor = "Lclient!gr;")
	protected Class99 aClass99_41;

	@OriginalMember(owner = "client!bu", name = "s", descriptor = "I")
	public int anInt7401;

	@OriginalMember(owner = "client!bu", name = "A", descriptor = "Lclient!av;")
	protected Class22 aClass22_41;

	@OriginalMember(owner = "client!bu", name = "x", descriptor = "[Lclient!bu;")
	public final Class1_Sub2[] aClass1_Sub2Array42;

	@OriginalMember(owner = "client!bu", name = "v", descriptor = "Z")
	public boolean aBoolean650;

	@OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(IZ)V")
	protected Class1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass1_Sub2Array42 = new Class1_Sub2[arg0];
		this.aBoolean650 = arg1;
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(I)V")
	public void method5958() {
		if (this.aBoolean650) {
			this.aClass22_41.method307();
			this.aClass22_41 = null;
		} else {
			this.aClass99_41.method1769();
			this.aClass99_41 = null;
		}
	}

	@OriginalMember(owner = "client!bu", name = "e", descriptor = "(I)I")
	public int method5959() {
		return -1;
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(B)I")
	public int method5960() {
		return -1;
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(II)[I")
	public int[] method5961(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(Lclient!wm;II)V")
	public void method5962(@OriginalArg(0) Class1_Sub19 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(III)[I")
	protected final int[] method5964(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass1_Sub2Array42[arg1].aBoolean650 ? this.aClass1_Sub2Array42[arg1].method5961(arg0) : this.aClass1_Sub2Array42[arg1].method5965(arg0)[0];
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(IB)[[I")
	public int[][] method5965(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!bu", name = "b", descriptor = "(III)V")
	public void method5966(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = this.anInt7401 == 255 ? arg1 : this.anInt7401;
		if (this.aBoolean650) {
			this.aClass22_41 = new Class22(local14, arg1, arg0);
		} else {
			this.aClass99_41 = new Class99(local14, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!bu", name = "g", descriptor = "(I)V")
	public void method5967() {
	}

	@OriginalMember(owner = "client!bu", name = "c", descriptor = "(III)[[I")
	protected final int[][] method5968(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass1_Sub2Array42[arg0].aBoolean650) {
			@Pc(29) int[] local29 = this.aClass1_Sub2Array42[arg0].method5961(arg1);
			return new int[][] { local29, local29, local29 };
		} else {
			return this.aClass1_Sub2Array42[arg0].method5965(arg1);
		}
	}
}
