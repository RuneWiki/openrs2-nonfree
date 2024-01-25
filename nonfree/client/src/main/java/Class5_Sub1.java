import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vn")
public abstract class Class5_Sub1 extends Class5 {

	@OriginalMember(owner = "client!vn", name = "k", descriptor = "I")
	public int anInt8835;

	@OriginalMember(owner = "client!vn", name = "l", descriptor = "Lclient!ft;")
	protected Class104 aClass104_41;

	@OriginalMember(owner = "client!vn", name = "q", descriptor = "Lclient!qw;")
	protected Class249 aClass249_41;

	@OriginalMember(owner = "client!vn", name = "t", descriptor = "Z")
	public boolean aBoolean642;

	@OriginalMember(owner = "client!vn", name = "s", descriptor = "[Lclient!vn;")
	public final Class5_Sub1[] aClass5_Sub1Array42;

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(IZ)V")
	protected Class5_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean642 = arg1;
		this.aClass5_Sub1Array42 = new Class5_Sub1[arg0];
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(III)[[I")
	protected final int[][] method7154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass5_Sub1Array42[arg0].aBoolean642) {
			@Pc(24) int[] local24 = this.aClass5_Sub1Array42[arg0].method7155(arg1);
			return new int[][] { local24, local24, local24 };
		} else {
			return this.aClass5_Sub1Array42[arg0].method7163(arg1);
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(II)[I")
	public int[] method7155(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(III)V")
	public void method7156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = this.anInt8835 == 255 ? arg1 : this.anInt8835;
		if (this.aBoolean642) {
			this.aClass104_41 = new Class104(local12, arg1, arg0);
		} else {
			this.aClass249_41 = new Class249(local12, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)V")
	public void method7157() {
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)I")
	public int method7158() {
		return -1;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIB)[I")
	protected final int[] method7160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aClass5_Sub1Array42[arg0].aBoolean642 ? this.aClass5_Sub1Array42[arg0].method7155(arg1) : this.aClass5_Sub1Array42[arg0].method7163(arg1)[0];
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)V")
	public void method7162() {
		if (this.aBoolean642) {
			this.aClass104_41.method2753();
			this.aClass104_41 = null;
		} else {
			this.aClass249_41.method5993();
			this.aClass249_41 = null;
		}
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(II)[[I")
	public int[][] method7163(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(BILclient!co;)V")
	public void method7164(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub3 arg1) {
	}

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "(I)I")
	public int method7165() {
		return -1;
	}
}
