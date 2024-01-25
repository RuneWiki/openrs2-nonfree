import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public final class Class16_Sub2 extends Class16 implements Interface3 {

	@OriginalMember(owner = "client!ls", name = "g", descriptor = "I")
	private int anInt3861;

	@OriginalMember(owner = "client!ls", name = "h", descriptor = "I")
	private int anInt3862;

	@OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(Lclient!qi;I[BIZ)V")
	public Class16_Sub2(@OriginalArg(0) Class82_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt3861 = arg1;
		this.anInt3862 = this.aClass82_Sub2_25.method4578(this.anInt3861);
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method3548(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method3545(arg0, arg1);
		this.anInt3861 = 5123;
		this.anInt3862 = this.aClass82_Sub2_25.method4578(this.anInt3861);
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "()I")
	@Override
	public int method5130() {
		return super.method5130();
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(III)V")
	@Override
	public void method3547(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass82_Sub2_25.anOpengl2.glDrawElements(4, arg1, this.anInt3861, (long) (arg0 * this.anInt3862));
	}

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "()V")
	@Override
	protected void method3544() {
		this.aClass82_Sub2_25.method4581(this);
	}
}
