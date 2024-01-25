import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public final class Class80_Sub1 extends Class80 implements Interface6 {

	@OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
	private int anInt1779;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lclient!tb;ILjava/nio/ByteBuffer;Z)V")
	public Class80_Sub1(@OriginalArg(0) Class129_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) ByteBuffer arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, 34962, arg2, arg3);
		this.anInt1779 = arg1;
	}

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lclient!tb;I[BIZ)V")
	public Class80_Sub1(@OriginalArg(0) Class129_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt1779 = arg1;
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(Lclient!q;)V")
	@Override
	public void method1920(@OriginalArg(0) Class160 arg0) {
		this.aClass129_Sub2_34.anOpengl2.glVertexPointer(arg0.aByte57, arg0.aShort70, this.anInt1779, (long) arg0.aByte58);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method1924(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method4428(arg1, arg2);
		this.anInt1779 = arg0;
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "()V")
	@Override
	protected void method4429() {
		this.aClass129_Sub2_34.method5093(this);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method1919(@OriginalArg(0) Class160 arg0) {
		this.aClass129_Sub2_34.anOpengl2.glColorPointer(arg0.aByte57, arg0.aShort70, this.anInt1779, (long) arg0.aByte58);
	}

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "(Lclient!q;)V")
	@Override
	public void method1923(@OriginalArg(0) Class160 arg0) {
		this.aClass129_Sub2_34.anOpengl2.glNormalPointer(arg0.aShort70, this.anInt1779, (long) arg0.aByte58);
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "(Lclient!q;)V")
	@Override
	public void method1921(@OriginalArg(0) Class160 arg0) {
		this.aClass129_Sub2_34.anOpengl2.glTexCoordPointer(arg0.aByte57, arg0.aShort70, this.anInt1779, (long) arg0.aByte58);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "()I")
	@Override
	public int method4888() {
		return super.method4888();
	}
}
