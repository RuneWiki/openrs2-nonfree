import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eca")
public abstract class Class6_Sub3 extends Class6 {

	@OriginalMember(owner = "client!eca", name = "n", descriptor = "I")
	public int anInt9975;

	@OriginalMember(owner = "client!eca", name = "p", descriptor = "Lclient!qf;")
	protected Class263 aClass263_41;

	@OriginalMember(owner = "client!eca", name = "A", descriptor = "Lclient!hv;")
	protected Class137 aClass137_41;

	@OriginalMember(owner = "client!eca", name = "t", descriptor = "Z")
	public boolean aBoolean674;

	@OriginalMember(owner = "client!eca", name = "y", descriptor = "[Lclient!eca;")
	public final Class6_Sub3[] aClass6_Sub3Array42;

	@OriginalMember(owner = "client!eca", name = "<init>", descriptor = "(IZ)V")
	protected Class6_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean674 = arg1;
		this.aClass6_Sub3Array42 = new Class6_Sub3[arg0];
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(IIB)[I")
	protected final int[] method7950(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aClass6_Sub3Array42[arg0].aBoolean674 ? this.aClass6_Sub3Array42[arg0].method7954(arg1) : this.aClass6_Sub3Array42[arg0].method7959(arg1)[0];
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(I)I")
	public int method7951() {
		return -1;
	}

	@OriginalMember(owner = "client!eca", name = "b", descriptor = "(I)I")
	public int method7952() {
		return -1;
	}

	@OriginalMember(owner = "client!eca", name = "f", descriptor = "(I)V")
	public void method7953() {
		if (this.aBoolean674) {
			this.aClass137_41.method3409();
			this.aClass137_41 = null;
		} else {
			this.aClass263_41.method5965();
			this.aClass263_41 = null;
		}
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(II)[I")
	public int[] method7954(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(ILclient!jr;B)V")
	public void method7955(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub12 arg1) {
	}

	@OriginalMember(owner = "client!eca", name = "b", descriptor = "(III)V")
	public void method7956(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = this.anInt9975 == 255 ? arg1 : this.anInt9975;
		if (this.aBoolean674) {
			this.aClass137_41 = new Class137(local14, arg1, arg0);
		} else {
			this.aClass263_41 = new Class263(local14, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!eca", name = "g", descriptor = "(I)V")
	public void method7957() {
	}

	@OriginalMember(owner = "client!eca", name = "c", descriptor = "(II)[[I")
	public int[][] method7959(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!eca", name = "c", descriptor = "(III)[[I")
	protected final int[][] method7961(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass6_Sub3Array42[arg1].aBoolean674) {
			@Pc(32) int[] local32 = this.aClass6_Sub3Array42[arg1].method7954(arg0);
			return new int[][] { local32, local32, local32 };
		} else {
			return this.aClass6_Sub3Array42[arg1].method7959(arg0);
		}
	}
}
