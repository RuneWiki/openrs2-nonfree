import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public abstract class Class5_Sub2 extends Class5 {

	@OriginalMember(owner = "client!qd", name = "v", descriptor = "Lclient!tda;")
	protected Class333 aClass333_41;

	@OriginalMember(owner = "client!qd", name = "z", descriptor = "Lclient!jh;")
	protected Class180 aClass180_41;

	@OriginalMember(owner = "client!qd", name = "B", descriptor = "I")
	public int anInt10759;

	@OriginalMember(owner = "client!qd", name = "y", descriptor = "Z")
	public boolean aBoolean910;

	@OriginalMember(owner = "client!qd", name = "s", descriptor = "[Lclient!qd;")
	public final Class5_Sub2[] aClass5_Sub2Array42;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(IZ)V")
	protected Class5_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean910 = arg1;
		this.aClass5_Sub2Array42 = new Class5_Sub2[arg0];
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IB)[I")
	public int[] method8942(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(II)[[I")
	public int[][] method8943(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!mc;II)V")
	public void method8944(@OriginalArg(0) Class5_Sub41 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)[I")
	protected final int[] method8945(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass5_Sub2Array42[arg1].aBoolean910 ? this.aClass5_Sub2Array42[arg1].method8942(arg0) : this.aClass5_Sub2Array42[arg1].method8943(arg0)[0];
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)I")
	public int method8946() {
		return -1;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)V")
	public void method8947() {
		if (this.aBoolean910) {
			this.aClass333_41.method7745();
			this.aClass333_41 = null;
		} else {
			this.aClass180_41.method4551();
			this.aClass180_41 = null;
		}
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(III)V")
	public void method8949(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = this.anInt10759 == 255 ? arg0 : this.anInt10759;
		if (this.aBoolean910) {
			this.aClass333_41 = new Class333(local14, arg0, arg1);
		} else {
			this.aClass180_41 = new Class180(local14, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(B)V")
	public void method8951() {
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(BII)[[I")
	protected final int[][] method8952(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass5_Sub2Array42[arg0].aBoolean910) {
			@Pc(31) int[] local31 = this.aClass5_Sub2Array42[arg0].method8942(arg1);
			return new int[][] { local31, local31, local31 };
		} else {
			return this.aClass5_Sub2Array42[arg0].method8943(arg1);
		}
	}

	@OriginalMember(owner = "client!qd", name = "e", descriptor = "(I)I")
	public int method8953() {
		return -1;
	}
}
