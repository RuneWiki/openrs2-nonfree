import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public final class Class33_Sub2 extends Class33 implements Interface3 {

	@OriginalMember(owner = "client!ri", name = "g", descriptor = "I")
	private int anInt5392;

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(Lclient!hd;ILjava/nio/ByteBuffer;Z)V")
	public Class33_Sub2(@OriginalArg(0) Class89_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) ByteBuffer arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, 34962, arg2, arg3);
		this.anInt5392 = arg1;
	}

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(Lclient!hd;I[BIZ)V")
	public Class33_Sub2(@OriginalArg(0) Class89_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt5392 = arg1;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method4547(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method4542(arg1, arg2);
		this.anInt5392 = arg0;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "()I")
	@Override
	public int method5710() {
		return super.method5710();
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(Lclient!rs;)V")
	@Override
	public void method4546(@OriginalArg(0) Class181 arg0) {
		this.aClass89_Sub1_34.anOpengl2.glVertexPointer(arg0.aByte64, arg0.aShort76, this.anInt5392, (long) arg0.aByte65);
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILclient!rs;)V")
	@Override
	public void method4549(@OriginalArg(0) int arg0, @OriginalArg(1) Class181 arg1) {
		this.aClass89_Sub1_34.anOpengl2.glClientActiveTexture(arg0 + 33984);
		this.aClass89_Sub1_34.anOpengl2.glTexCoordPointer(arg1.aByte64, arg1.aShort76, this.anInt5392, (long) arg1.aByte65);
	}

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "(Lclient!rs;)V")
	@Override
	public void method4548(@OriginalArg(0) Class181 arg0) {
		this.aClass89_Sub1_34.anOpengl2.glNormalPointer(arg0.aShort76, this.anInt5392, (long) arg0.aByte65);
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "()V")
	@Override
	protected void method4544() {
		this.aClass89_Sub1_34.method2423(this);
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lclient!rs;)V")
	@Override
	public void method4545(@OriginalArg(0) Class181 arg0) {
		this.aClass89_Sub1_34.anOpengl2.glColorPointer(arg0.aByte64, arg0.aShort76, this.anInt5392, (long) arg0.aByte65);
	}
}
