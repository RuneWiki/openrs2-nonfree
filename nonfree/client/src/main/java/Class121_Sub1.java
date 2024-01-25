import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public final class Class121_Sub1 extends Class121 implements Interface6 {

	@OriginalMember(owner = "client!lg", name = "g", descriptor = "I")
	private int anInt3801;

	@OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(Lclient!se;I[BIZ)V")
	public Class121_Sub1(@OriginalArg(0) Class122_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt3801 = arg1;
	}

	@OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(Lclient!se;ILjava/nio/ByteBuffer;Z)V")
	public Class121_Sub1(@OriginalArg(0) Class122_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) ByteBuffer arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, 34962, arg2, arg3);
		this.anInt3801 = arg1;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "()I")
	@Override
	public int method5253() {
		return super.method5253();
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method3004(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method5255(arg1, arg2);
		this.anInt3801 = arg0;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILclient!kr;)V")
	@Override
	public void method3005(@OriginalArg(0) int arg0, @OriginalArg(1) Class117 arg1) {
		this.aClass122_Sub2_42.anOpengl2.glClientActiveTexture(arg0 + 33984);
		this.aClass122_Sub2_42.anOpengl2.glTexCoordPointer(arg1.aByte34, arg1.aShort46, this.anInt3801, (long) arg1.aByte35);
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lclient!kr;)V")
	@Override
	public void method3001(@OriginalArg(0) Class117 arg0) {
		this.aClass122_Sub2_42.anOpengl2.glVertexPointer(arg0.aByte34, arg0.aShort46, this.anInt3801, (long) arg0.aByte35);
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "()V")
	@Override
	protected void method5254() {
		this.aClass122_Sub2_42.method4862(this);
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(Lclient!kr;)V")
	@Override
	public void method3002(@OriginalArg(0) Class117 arg0) {
		this.aClass122_Sub2_42.anOpengl2.glColorPointer(arg0.aByte34, arg0.aShort46, this.anInt3801, (long) arg0.aByte35);
	}

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "(Lclient!kr;)V")
	@Override
	public void method3003(@OriginalArg(0) Class117 arg0) {
		this.aClass122_Sub2_42.anOpengl2.glNormalPointer(arg0.aShort46, this.anInt3801, (long) arg0.aByte35);
	}
}
