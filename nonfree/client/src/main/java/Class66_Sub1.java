import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public final class Class66_Sub1 extends Class66 implements Interface8 {

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
	private int anInt2396;

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(Lclient!ig;I[BI)V")
	public Class66_Sub1(@OriginalArg(0) Class47_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt2396 = arg1;
	}

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(Lclient!ig;ILjava/nio/ByteBuffer;)V")
	public Class66_Sub1(@OriginalArg(0) Class47_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) ByteBuffer arg2) {
		super(arg0, arg2);
		this.anInt2396 = arg1;
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(Lclient!wi;)V")
	@Override
	public void method2115(@OriginalArg(0) Class217 arg0) {
		this.aClass47_Sub2_29.anOpengl2.glVertexPointer(arg0.aByte76, arg0.aShort94, this.anInt2396, this.aByteBuffer6.position(arg0.aByte75));
	}

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "(Lclient!wi;)V")
	@Override
	public void method2117(@OriginalArg(0) Class217 arg0) {
		this.aClass47_Sub2_29.anOpengl2.glTexCoordPointer(arg0.aByte76, arg0.aShort94, this.anInt2396, this.aByteBuffer6.position(arg0.aByte75));
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "()I")
	@Override
	public int method4256() {
		return 0;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method2114(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method4255(arg1, arg2);
		this.anInt2396 = arg0;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!wi;)V")
	@Override
	public void method2113(@OriginalArg(0) Class217 arg0) {
		this.aClass47_Sub2_29.anOpengl2.glColorPointer(arg0.aByte76, arg0.aShort94, this.anInt2396, this.aByteBuffer6.position(arg0.aByte75));
	}

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "(Lclient!wi;)V")
	@Override
	public void method2118(@OriginalArg(0) Class217 arg0) {
		this.aClass47_Sub2_29.anOpengl2.glNormalPointer(arg0.aShort94, this.anInt2396, this.aByteBuffer6.position(arg0.aByte75));
	}
}
