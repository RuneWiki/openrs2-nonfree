import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public final class Class40_Sub1 extends Class40 implements Interface2 {

	@OriginalMember(owner = "client!co", name = "g", descriptor = "I")
	private int anInt1165;

	@OriginalMember(owner = "client!co", name = "h", descriptor = "I")
	private int anInt1166;

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "(Lclient!po;I[BIZ)V")
	public Class40_Sub1(@OriginalArg(0) Class59_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt1165 = arg1;
		this.anInt1166 = this.aClass59_Sub1_39.method4339(this.anInt1165);
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "()I")
	@Override
	public int method5698() {
		return super.method5698();
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(III)V")
	@Override
	public void method2595(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass59_Sub1_39.anOpengl2.glDrawElements(4, arg1, this.anInt1165, (long) (arg0 * this.anInt1166));
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method2597(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method5699(arg0, arg1);
		this.anInt1165 = 5123;
		this.anInt1166 = this.aClass59_Sub1_39.method4339(this.anInt1165);
	}

	@OriginalMember(owner = "client!co", name = "b", descriptor = "()V")
	@Override
	protected void method5700() {
		this.aClass59_Sub1_39.method4331(this);
	}
}
