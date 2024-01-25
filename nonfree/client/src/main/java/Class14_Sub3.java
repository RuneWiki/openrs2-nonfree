import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!na")
public abstract class Class14_Sub3 extends Class14 {

	@OriginalMember(owner = "client!na", name = "n", descriptor = "Lclient!f;")
	protected Class58 aClass58_41;

	@OriginalMember(owner = "client!na", name = "q", descriptor = "I")
	public int anInt6731;

	@OriginalMember(owner = "client!na", name = "y", descriptor = "Lclient!of;")
	protected Class157 aClass157_41;

	@OriginalMember(owner = "client!na", name = "D", descriptor = "Z")
	public boolean aBoolean446;

	@OriginalMember(owner = "client!na", name = "x", descriptor = "[Lclient!na;")
	public final Class14_Sub3[] aClass14_Sub3Array42;

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "(IZ)V")
	protected Class14_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean446 = arg1;
		this.aClass14_Sub3Array42 = new Class14_Sub3[arg0];
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(B)I")
	public int method5992() {
		return -1;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BII)V")
	public void method5993(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = this.anInt6731 == 255 ? arg0 : this.anInt6731;
		if (this.aBoolean446) {
			this.aClass157_41 = new Class157(local14, arg0, arg1);
		} else {
			this.aClass58_41 = new Class58(local14, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BI)[[I")
	public int[][] method5994(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!na", name = "d", descriptor = "(I)I")
	public int method5995() {
		return -1;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(III)[[I")
	protected final int[][] method5997(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass14_Sub3Array42[arg1].aBoolean446) {
			@Pc(23) int[] local23 = this.aClass14_Sub3Array42[arg1].method6003(arg0);
			return new int[][] { local23, local23, local23 };
		} else {
			return this.aClass14_Sub3Array42[arg1].method5994(arg0);
		}
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(B)V")
	public void method5998() {
	}

	@OriginalMember(owner = "client!na", name = "d", descriptor = "(B)V")
	public void method5999() {
		if (this.aBoolean446) {
			this.aClass157_41.method4027();
			this.aClass157_41 = null;
		} else {
			this.aClass58_41.method1960();
			this.aClass58_41 = null;
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!jg;II)V")
	public void method6000(@OriginalArg(0) Class14_Sub4 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IB)[I")
	public int[] method6003(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(BII)[I")
	protected final int[] method6004(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass14_Sub3Array42[arg0].aBoolean446 ? this.aClass14_Sub3Array42[arg0].method6003(arg1) : this.aClass14_Sub3Array42[arg0].method5994(arg1)[0];
	}
}
