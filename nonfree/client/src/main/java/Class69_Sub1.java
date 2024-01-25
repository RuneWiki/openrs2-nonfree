import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public final class Class69_Sub1 extends Class69 implements Interface8 {

	@OriginalMember(owner = "client!fk", name = "g", descriptor = "I")
	private int anInt2120;

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Lclient!h;ILjava/nio/ByteBuffer;Z)V")
	public Class69_Sub1(@OriginalArg(0) Class32_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) ByteBuffer arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, 34962, arg2, arg3);
		this.anInt2120 = arg1;
	}

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Lclient!h;I[BIZ)V")
	public Class69_Sub1(@OriginalArg(0) Class32_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt2120 = arg1;
	}

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "(Lclient!ig;)V")
	@Override
	public void method1850(@OriginalArg(0) Class91 arg0) {
		this.aClass32_Sub2_17.anOpengl2.glColorPointer(arg0.aByte21, arg0.aShort30, this.anInt2120, (long) arg0.aByte20);
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(Lclient!ig;)V")
	@Override
	public void method1849(@OriginalArg(0) Class91 arg0) {
		this.aClass32_Sub2_17.anOpengl2.glVertexPointer(arg0.aByte21, arg0.aShort30, this.anInt2120, (long) arg0.aByte20);
	}

	@OriginalMember(owner = "client!fk", name = "d", descriptor = "(Lclient!ig;)V")
	@Override
	public void method1851(@OriginalArg(0) Class91 arg0) {
		this.aClass32_Sub2_17.anOpengl2.glTexCoordPointer(arg0.aByte21, arg0.aShort30, this.anInt2120, (long) arg0.aByte20);
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "()V")
	@Override
	protected void method2339() {
		this.aClass32_Sub2_17.method2251(this);
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method1847(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method2337(arg1, arg2);
		this.anInt2120 = arg0;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lclient!ig;)V")
	@Override
	public void method1848(@OriginalArg(0) Class91 arg0) {
		this.aClass32_Sub2_17.anOpengl2.glNormalPointer(arg0.aShort30, this.anInt2120, (long) arg0.aByte20);
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "()I")
	@Override
	public int method2573() {
		return super.method2573();
	}
}
