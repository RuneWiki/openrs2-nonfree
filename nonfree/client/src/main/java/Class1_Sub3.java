import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tl")
public abstract class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!tl", name = "v", descriptor = "Lclient!ah;")
	protected Class8 aClass8_41;

	@OriginalMember(owner = "client!tl", name = "y", descriptor = "Lclient!cd;")
	protected Class21 aClass21_41;

	@OriginalMember(owner = "client!tl", name = "A", descriptor = "I")
	public int anInt5414;

	@OriginalMember(owner = "client!tl", name = "K", descriptor = "[Lclient!tl;")
	public Class1_Sub3[] aClass1_Sub3Array42;

	@OriginalMember(owner = "client!tl", name = "E", descriptor = "Z")
	public boolean aBoolean275;

	@OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(IZ)V")
	protected Class1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass1_Sub3Array42 = new Class1_Sub3[arg0];
		this.aBoolean275 = arg1;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IBI)[I")
	protected final int[] method4117(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass1_Sub3Array42[arg0].aBoolean275 ? this.aClass1_Sub3Array42[arg0].method4123(arg1) : this.aClass1_Sub3Array42[arg0].method4120(arg1)[0];
	}

	@OriginalMember(owner = "client!tl", name = "e", descriptor = "(I)V")
	public void method4118() {
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(III)V")
	public final void method4119(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(20) int local20 = this.anInt5414 == 255 ? arg0 : this.anInt5414;
		if (this.aBoolean275) {
			this.aClass8_41 = new Class8(local20, arg0, arg1);
		} else {
			this.aClass21_41 = new Class21(local20, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IB)[[I")
	public int[][] method4120(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lclient!ql;IZ)V")
	public void method4121(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!tl", name = "c", descriptor = "(B)I")
	public int method4122() {
		return -1;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)[I")
	public int[] method4123(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!tl", name = "d", descriptor = "(B)I")
	public int method4126() {
		return -1;
	}

	@OriginalMember(owner = "client!tl", name = "e", descriptor = "(B)V")
	public void method4128() {
		if (this.aBoolean275) {
			this.aClass8_41.method109();
			this.aClass8_41 = null;
		} else {
			this.aClass21_41.method586();
			this.aClass21_41 = null;
		}
	}

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(III)[[I")
	protected final int[][] method4129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass1_Sub3Array42[arg0].aBoolean275) {
			@Pc(26) int[] local26 = this.aClass1_Sub3Array42[arg0].method4123(arg1);
			return new int[][] { local26, local26, local26 };
		} else {
			return this.aClass1_Sub3Array42[arg0].method4120(arg1);
		}
	}
}
