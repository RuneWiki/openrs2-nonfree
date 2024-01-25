import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pn")
public abstract class Class4_Sub3 extends Class4 {

	@OriginalMember(owner = "client!pn", name = "t", descriptor = "Lclient!hc;")
	protected Class93 aClass93_41;

	@OriginalMember(owner = "client!pn", name = "z", descriptor = "Lclient!me;")
	protected Class157 aClass157_41;

	@OriginalMember(owner = "client!pn", name = "D", descriptor = "I")
	public int anInt8008;

	@OriginalMember(owner = "client!pn", name = "A", descriptor = "[Lclient!pn;")
	public final Class4_Sub3[] aClass4_Sub3Array42;

	@OriginalMember(owner = "client!pn", name = "s", descriptor = "Z")
	public boolean aBoolean587;

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(IZ)V")
	protected Class4_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass4_Sub3Array42 = new Class4_Sub3[arg0];
		this.aBoolean587 = arg1;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(BII)[[I")
	protected final int[][] method6331(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass4_Sub3Array42[arg1].aBoolean587) {
			@Pc(31) int[] local31 = this.aClass4_Sub3Array42[arg1].method6339(arg0);
			return new int[][] { local31, local31, local31 };
		} else {
			return this.aClass4_Sub3Array42[arg1].method6335(arg0);
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(I)I")
	public int method6332() {
		return -1;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(B)I")
	public int method6333() {
		return -1;
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(I)V")
	public void method6334() {
		if (this.aBoolean587) {
			this.aClass157_41.method4023();
			this.aClass157_41 = null;
		} else {
			this.aClass93_41.method2619();
			this.aClass93_41 = null;
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(II)[[I")
	public int[][] method6335(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IZI)V")
	public void method6336(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = this.anInt8008 == 255 ? arg0 : this.anInt8008;
		if (this.aBoolean587) {
			this.aClass157_41 = new Class157(local14, arg0, arg1);
		} else {
			this.aClass93_41 = new Class93(local14, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(III)[I")
	protected final int[] method6337(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass4_Sub3Array42[arg0].aBoolean587 ? this.aClass4_Sub3Array42[arg0].method6339(arg1) : this.aClass4_Sub3Array42[arg0].method6335(arg1)[0];
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(II)[I")
	public int[] method6339(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(ILclient!wn;I)V")
	public void method6340(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub20 arg1) {
	}

	@OriginalMember(owner = "client!pn", name = "e", descriptor = "(B)V")
	public void method6341() {
	}
}
