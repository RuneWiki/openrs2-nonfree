import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mfa")
public abstract class Class3_Sub1 extends Class3 {

	@OriginalMember(owner = "client!mfa", name = "k", descriptor = "I")
	public int anInt9360;

	@OriginalMember(owner = "client!mfa", name = "p", descriptor = "Lclient!ida;")
	protected Class144 aClass144_41;

	@OriginalMember(owner = "client!mfa", name = "q", descriptor = "Lclient!et;")
	protected Class85 aClass85_41;

	@OriginalMember(owner = "client!mfa", name = "D", descriptor = "Z")
	public boolean aBoolean728;

	@OriginalMember(owner = "client!mfa", name = "t", descriptor = "[Lclient!mfa;")
	public final Class3_Sub1[] aClass3_Sub1Array42;

	@OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "(IZ)V")
	protected Class3_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean728 = arg1;
		this.aClass3_Sub1Array42 = new Class3_Sub1[arg0];
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(Lclient!qh;II)V")
	public void method7761(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(B)I")
	public int method7762() {
		return -1;
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(I)V")
	public void method7763() {
	}

	@OriginalMember(owner = "client!mfa", name = "e", descriptor = "(I)V")
	public void method7764() {
		if (this.aBoolean728) {
			this.aClass85_41.method2545();
			this.aClass85_41 = null;
		} else {
			this.aClass144_41.method3784();
			this.aClass144_41 = null;
		}
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(III)[I")
	protected final int[] method7765(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass3_Sub1Array42[arg0].aBoolean728 ? this.aClass3_Sub1Array42[arg0].method7767(arg1) : this.aClass3_Sub1Array42[arg0].method7773(arg1)[0];
	}

	@OriginalMember(owner = "client!mfa", name = "b", descriptor = "(III)[[I")
	protected final int[][] method7766(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass3_Sub1Array42[arg0].aBoolean728) {
			@Pc(33) int[] local33 = this.aClass3_Sub1Array42[arg0].method7767(arg1);
			return new int[][] { local33, local33, local33 };
		} else {
			return this.aClass3_Sub1Array42[arg0].method7773(arg1);
		}
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(II)[I")
	public int[] method7767(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!mfa", name = "f", descriptor = "(I)I")
	public int method7770() {
		return -1;
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(IBI)V")
	public void method7771(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = this.anInt9360 == 255 ? arg0 : this.anInt9360;
		if (this.aBoolean728) {
			this.aClass85_41 = new Class85(local12, arg0, arg1);
		} else {
			this.aClass144_41 = new Class144(local12, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!mfa", name = "c", descriptor = "(II)[[I")
	public int[][] method7773(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}
}
