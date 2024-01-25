import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public final class Class48_Sub1 extends Class48 implements Interface8 {

	@OriginalMember(owner = "client!e", name = "g", descriptor = "I")
	private int anInt1788;

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "(Lclient!ig;I[BIZ)V")
	public Class48_Sub1(@OriginalArg(0) Class47_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt1788 = arg1;
	}

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "(Lclient!ig;ILjava/nio/ByteBuffer;Z)V")
	public Class48_Sub1(@OriginalArg(0) Class47_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) ByteBuffer arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, 34962, arg2, arg3);
		this.anInt1788 = arg1;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "()I")
	@Override
	public int method4256() {
		return super.method4256();
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(Lclient!wi;)V")
	@Override
	public void method2115(@OriginalArg(0) Class217 arg0) {
		this.aClass47_Sub2_25.anOpengl2.glVertexPointer(arg0.aByte76, arg0.aShort94, this.anInt1788, (long) arg0.aByte75);
	}

	@OriginalMember(owner = "client!e", name = "d", descriptor = "(Lclient!wi;)V")
	@Override
	public void method2118(@OriginalArg(0) Class217 arg0) {
		this.aClass47_Sub2_25.anOpengl2.glNormalPointer(arg0.aShort94, this.anInt1788, (long) arg0.aByte75);
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method2114(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method3863(arg1, arg2);
		this.anInt1788 = arg0;
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "()V")
	@Override
	protected void method3862() {
		this.aClass47_Sub2_25.method2812(this);
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!wi;)V")
	@Override
	public void method2113(@OriginalArg(0) Class217 arg0) {
		this.aClass47_Sub2_25.anOpengl2.glColorPointer(arg0.aByte76, arg0.aShort94, this.anInt1788, (long) arg0.aByte75);
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "(Lclient!wi;)V")
	@Override
	public void method2117(@OriginalArg(0) Class217 arg0) {
		this.aClass47_Sub2_25.anOpengl2.glTexCoordPointer(arg0.aByte76, arg0.aShort94, this.anInt1788, (long) arg0.aByte75);
	}
}
