import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public final class Class19_Sub1 extends Class19 implements Interface3 {

	@OriginalMember(owner = "client!jk", name = "g", descriptor = "I")
	private int anInt3179;

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Lclient!nm;I[BIZ)V")
	public Class19_Sub1(@OriginalArg(0) Class164_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt3179 = arg1;
	}

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Lclient!nm;ILjava/nio/ByteBuffer;Z)V")
	public Class19_Sub1(@OriginalArg(0) Class164_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) ByteBuffer arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, 34962, arg2, arg3);
		this.anInt3179 = arg1;
	}

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "(Lclient!jt;)V")
	@Override
	public void method2569(@OriginalArg(0) Class126 arg0) {
		this.aClass164_Sub1_28.anOpengl1.glColorPointer(arg0.aByte44, arg0.aShort57, this.anInt3179, (long) arg0.aByte43);
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method2572(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method3102(arg1, arg2);
		this.anInt3179 = arg0;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "()I")
	@Override
	public int method3103() {
		return super.method3103();
	}

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "()V")
	@Override
	protected void method3101() {
		this.aClass164_Sub1_28.method3611(this);
	}

	@OriginalMember(owner = "client!jk", name = "c", descriptor = "(Lclient!jt;)V")
	@Override
	public void method2570(@OriginalArg(0) Class126 arg0) {
		this.aClass164_Sub1_28.anOpengl1.glVertexPointer(arg0.aByte44, arg0.aShort57, this.anInt3179, (long) arg0.aByte43);
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lclient!jt;)V")
	@Override
	public void method2568(@OriginalArg(0) Class126 arg0) {
		this.aClass164_Sub1_28.anOpengl1.glTexCoordPointer(arg0.aByte44, arg0.aShort57, this.anInt3179, (long) arg0.aByte43);
	}

	@OriginalMember(owner = "client!jk", name = "d", descriptor = "(Lclient!jt;)V")
	@Override
	public void method2571(@OriginalArg(0) Class126 arg0) {
		this.aClass164_Sub1_28.anOpengl1.glNormalPointer(arg0.aShort57, this.anInt3179, (long) arg0.aByte43);
	}
}
