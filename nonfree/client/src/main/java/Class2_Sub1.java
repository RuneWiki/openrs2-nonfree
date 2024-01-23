import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public abstract class Class2_Sub1 extends Class2 {

	@OriginalMember(owner = "client!ua", name = "F", descriptor = "I")
	public int anInt6204;

	@OriginalMember(owner = "client!ua", name = "J", descriptor = "Lclient!rn;")
	protected Class150 aClass150_41;

	@OriginalMember(owner = "client!ua", name = "P", descriptor = "Lclient!pg;")
	protected Class136 aClass136_41;

	@OriginalMember(owner = "client!ua", name = "N", descriptor = "[Lclient!ua;")
	public Class2_Sub1[] aClass2_Sub1Array42;

	@OriginalMember(owner = "client!ua", name = "y", descriptor = "Z")
	public boolean aBoolean492;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(IZ)V")
	protected Class2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass2_Sub1Array42 = new Class2_Sub1[arg0];
		this.aBoolean492 = arg1;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)V")
	public void method4934() {
	}

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "(I)V")
	public void method4936() {
		if (this.aBoolean492) {
			this.aClass136_41.method3405();
			this.aClass136_41 = null;
		} else {
			this.aClass150_41.method3893();
			this.aClass150_41 = null;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IBI)[[I")
	protected final int[][] method4937(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass2_Sub1Array42[arg0].aBoolean492) {
			@Pc(24) int[] local24 = this.aClass2_Sub1Array42[arg0].method4940(arg1);
			return new int[][] { local24, local24, local24 };
		} else {
			return this.aClass2_Sub1Array42[arg0].method4941(arg1);
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!wm;II)V")
	public void method4938(@OriginalArg(0) Class2_Sub26 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)[I")
	public int[] method4940(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(II)[[I")
	public int[][] method4941(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "(B)I")
	public int method4942() {
		return -1;
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(III)V")
	public final void method4944(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(20) int local20 = this.anInt6204 == 255 ? arg0 : this.anInt6204;
		if (this.aBoolean492) {
			this.aClass136_41 = new Class136(local20, arg0, arg1);
		} else {
			this.aClass150_41 = new Class150(local20, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "(I)I")
	public int method4945() {
		return -1;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIB)[I")
	protected final int[] method4946(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aClass2_Sub1Array42[arg1].aBoolean492 ? this.aClass2_Sub1Array42[arg1].method4940(arg0) : this.aClass2_Sub1Array42[arg1].method4941(arg0)[0];
	}
}
