import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public final class Class23_Sub2 extends Class23 implements Interface6 {

	@OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
	private int anInt1888;

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Lclient!fu;I[BI)V")
	public Class23_Sub2(@OriginalArg(0) Class63_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt1888 = arg1;
	}

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Lclient!fu;ILjava/nio/ByteBuffer;)V")
	public Class23_Sub2(@OriginalArg(0) Class63_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) ByteBuffer arg2) {
		super(arg0, arg2);
		this.anInt1888 = arg1;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lclient!fm;)V")
	@Override
	public void method3365(@OriginalArg(0) Class72 arg0) {
		this.aClass63_Sub2_14.anOpengl2.glTexCoordPointer(arg0.aByte8, arg0.aShort19, this.anInt1888, this.aByteBuffer3.position(arg0.aByte9));
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method3368(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method1837(arg1, arg2);
		this.anInt1888 = arg0;
	}

	@OriginalMember(owner = "client!fj", name = "c", descriptor = "(Lclient!fm;)V")
	@Override
	public void method3367(@OriginalArg(0) Class72 arg0) {
		this.aClass63_Sub2_14.anOpengl2.glNormalPointer(arg0.aShort19, this.anInt1888, this.aByteBuffer3.position(arg0.aByte9));
	}

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(Lclient!fm;)V")
	@Override
	public void method3366(@OriginalArg(0) Class72 arg0) {
		this.aClass63_Sub2_14.anOpengl2.glVertexPointer(arg0.aByte8, arg0.aShort19, this.anInt1888, this.aByteBuffer3.position(arg0.aByte9));
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "()I")
	@Override
	public int method3588() {
		return 0;
	}

	@OriginalMember(owner = "client!fj", name = "d", descriptor = "(Lclient!fm;)V")
	@Override
	public void method3369(@OriginalArg(0) Class72 arg0) {
		this.aClass63_Sub2_14.anOpengl2.glColorPointer(arg0.aByte8, arg0.aShort19, this.anInt1888, this.aByteBuffer3.position(arg0.aByte9));
	}
}
