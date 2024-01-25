import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public abstract class Class3_Sub1 extends Class3 {

	@OriginalMember(owner = "client!jd", name = "q", descriptor = "Lclient!rn;")
	protected Class206 aClass206_41;

	@OriginalMember(owner = "client!jd", name = "z", descriptor = "Lclient!ac;")
	protected Class4 aClass4_41;

	@OriginalMember(owner = "client!jd", name = "E", descriptor = "I")
	public int anInt6208;

	@OriginalMember(owner = "client!jd", name = "D", descriptor = "[Lclient!jd;")
	public final Class3_Sub1[] aClass3_Sub1Array42;

	@OriginalMember(owner = "client!jd", name = "w", descriptor = "Z")
	public boolean aBoolean487;

	static {
		new Class57("Ok", "Okay", "OK", "Ok");
	}

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(IZ)V")
	protected Class3_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass3_Sub1Array42 = new Class3_Sub1[arg0];
		this.aBoolean487 = arg1;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)[[I")
	public int[][] method5541(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "(B)I")
	public int method5542() {
		return -1;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
	public void method5543() {
		if (this.aBoolean487) {
			this.aClass4_41.method59();
			this.aClass4_41 = null;
		} else {
			this.aClass206_41.method4689();
			this.aClass206_41 = null;
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(III)V")
	public void method5544(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = this.anInt6208 == 255 ? arg1 : this.anInt6208;
		if (this.aBoolean487) {
			this.aClass4_41 = new Class4(local14, arg1, arg0);
		} else {
			this.aClass206_41 = new Class206(local14, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!rp;BI)V")
	public void method5545(@OriginalArg(0) Class3_Sub5 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(BII)[I")
	protected final int[] method5547(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass3_Sub1Array42[arg1].aBoolean487 ? this.aClass3_Sub1Array42[arg1].method5550(arg0) : this.aClass3_Sub1Array42[arg1].method5541(arg0)[0];
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(II)[I")
	public int[] method5550(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(III)[[I")
	protected final int[][] method5551(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass3_Sub1Array42[arg0].aBoolean487) {
			@Pc(33) int[] local33 = this.aClass3_Sub1Array42[arg0].method5550(arg1);
			return new int[][] { local33, local33, local33 };
		} else {
			return this.aClass3_Sub1Array42[arg0].method5541(arg1);
		}
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V")
	public void method5552() {
	}

	@OriginalMember(owner = "client!jd", name = "f", descriptor = "(B)I")
	public int method5553() {
		return -1;
	}
}
