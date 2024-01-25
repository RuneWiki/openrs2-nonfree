import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public final class Class92_Sub1 extends Class92 implements Interface6 {

	@OriginalMember(owner = "client!lp", name = "g", descriptor = "I")
	private int anInt3691;

	@OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(Lclient!fu;I[BIZ)V")
	public Class92_Sub1(@OriginalArg(0) Class63_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt3691 = arg1;
	}

	@OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(Lclient!fu;ILjava/nio/ByteBuffer;Z)V")
	public Class92_Sub1(@OriginalArg(0) Class63_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) ByteBuffer arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, 34962, arg2, arg3);
		this.anInt3691 = arg1;
	}

	@OriginalMember(owner = "client!lp", name = "d", descriptor = "(Lclient!fm;)V")
	@Override
	public void method3369(@OriginalArg(0) Class72 arg0) {
		this.aClass63_Sub2_30.anOpengl2.glColorPointer(arg0.aByte8, arg0.aShort19, this.anInt3691, (long) arg0.aByte9);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Lclient!fm;)V")
	@Override
	public void method3365(@OriginalArg(0) Class72 arg0) {
		this.aClass63_Sub2_30.anOpengl2.glTexCoordPointer(arg0.aByte8, arg0.aShort19, this.anInt3691, (long) arg0.aByte9);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "()I")
	@Override
	public int method3588() {
		return super.method3588();
	}

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "(Lclient!fm;)V")
	@Override
	public void method3367(@OriginalArg(0) Class72 arg0) {
		this.aClass63_Sub2_30.anOpengl2.glNormalPointer(arg0.aShort19, this.anInt3691, (long) arg0.aByte9);
	}

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(Lclient!fm;)V")
	@Override
	public void method3366(@OriginalArg(0) Class72 arg0) {
		this.aClass63_Sub2_30.anOpengl2.glVertexPointer(arg0.aByte8, arg0.aShort19, this.anInt3691, (long) arg0.aByte9);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method3368(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method3589(arg1, arg2);
		this.anInt3691 = arg0;
	}

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "()V")
	@Override
	protected void method3590() {
		this.aClass63_Sub2_30.method2117(this);
	}
}
