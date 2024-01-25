import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public abstract class Class1_Sub5 extends Class1 {

	@OriginalMember(owner = "client!fa", name = "n", descriptor = "I")
	public int anInt6691;

	@OriginalMember(owner = "client!fa", name = "w", descriptor = "Lclient!wb;")
	protected Class214 aClass214_41;

	@OriginalMember(owner = "client!fa", name = "C", descriptor = "Lclient!ol;")
	protected Class151 aClass151_41;

	@OriginalMember(owner = "client!fa", name = "A", descriptor = "Z")
	public boolean aBoolean552;

	@OriginalMember(owner = "client!fa", name = "F", descriptor = "[Lclient!fa;")
	public final Class1_Sub5[] aClass1_Sub5Array42;

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(IZ)V")
	protected Class1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean552 = arg1;
		this.aClass1_Sub5Array42 = new Class1_Sub5[arg0];
	}

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "(I)V")
	public void method5801() {
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(III)[I")
	protected final int[] method5802(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass1_Sub5Array42[arg0].aBoolean552 ? this.aClass1_Sub5Array42[arg0].method5805(arg1) : this.aClass1_Sub5Array42[arg0].method5811(arg1)[0];
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)[I")
	public int[] method5805(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(B)I")
	public int method5806() {
		return -1;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IBI)[[I")
	protected final int[][] method5807(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass1_Sub5Array42[arg1].aBoolean552) {
			@Pc(34) int[] local34 = this.aClass1_Sub5Array42[arg1].method5805(arg0);
			return new int[][] { local34, local34, local34 };
		} else {
			return this.aClass1_Sub5Array42[arg1].method5811(arg0);
		}
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(Z)I")
	public int method5809() {
		return -1;
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(III)V")
	public void method5810(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = this.anInt6691 == 255 ? arg1 : this.anInt6691;
		if (this.aBoolean552) {
			this.aClass214_41 = new Class214(local14, arg1, arg0);
		} else {
			this.aClass151_41 = new Class151(local14, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(II)[[I")
	public int[][] method5811(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "(I)V")
	public void method5812() {
		if (this.aBoolean552) {
			this.aClass214_41.method5648();
			this.aClass214_41 = null;
		} else {
			this.aClass151_41.method4017();
			this.aClass151_41 = null;
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!nj;II)V")
	public void method5814(@OriginalArg(0) Class1_Sub21 arg0, @OriginalArg(1) int arg1) {
	}
}
