import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public abstract class Class3_Sub1 extends Class3 {

	@OriginalMember(owner = "client!lf", name = "z", descriptor = "Lclient!aa;")
	protected Class2 aClass2_39;

	@OriginalMember(owner = "client!lf", name = "B", descriptor = "I")
	public int anInt4122;

	@OriginalMember(owner = "client!lf", name = "F", descriptor = "Lclient!e;")
	protected Class22 aClass22_39;

	@OriginalMember(owner = "client!lf", name = "K", descriptor = "I")
	public int anInt4128;

	@OriginalMember(owner = "client!lf", name = "J", descriptor = "[Lclient!lf;")
	public final Class3_Sub1[] aClass3_Sub1Array40;

	@OriginalMember(owner = "client!lf", name = "s", descriptor = "Z")
	public boolean aBoolean191;

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(IZ)V")
	protected Class3_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass3_Sub1Array40 = new Class3_Sub1[arg0];
		this.aBoolean191 = arg1;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILclient!hd;I)V")
	public void method3118(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub8 arg1) {
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)I")
	public int method3119() {
		return -1;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IZI)[I")
	protected final int[] method3120(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass3_Sub1Array40[arg0].aBoolean191 ? this.aClass3_Sub1Array40[arg0].method3130(arg1) : this.aClass3_Sub1Array40[arg0].method3121(arg1)[0];
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IZ)[[I")
	public int[][] method3121(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IBI)[[I")
	protected final int[][] method3124(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass3_Sub1Array40[arg0].aBoolean191) {
			@Pc(25) int[] local25 = this.aClass3_Sub1Array40[arg0].method3130(arg1);
			return new int[][] { local25, local25, local25 };
		} else {
			return this.aClass3_Sub1Array40[arg0].method3121(arg1);
		}
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(IBI)V")
	public final void method3126(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = this.anInt4128 == 255 ? arg1 : this.anInt4128;
		if (this.aBoolean191) {
			this.aClass22_39 = new Class22(local18, arg1, arg0);
		} else {
			this.aClass2_39 = new Class2(local18, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "(I)I")
	public int method3128() {
		return -1;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IB)[I")
	public int[] method3130(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "(I)V")
	public void method3131() {
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(Z)V")
	public final void method3132() {
		if (this.aBoolean191) {
			this.aClass22_39.method844();
			this.aClass22_39 = null;
		} else {
			this.aClass2_39.method6();
			this.aClass2_39 = null;
		}
	}
}
