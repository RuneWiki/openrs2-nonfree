import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public final class Class54_Sub2 extends Class54 implements Interface3 {

	@OriginalMember(owner = "client!hs", name = "g", descriptor = "I")
	private int anInt2782;

	@OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(Lclient!sq;I[BIZ)V")
	public Class54_Sub2(@OriginalArg(0) Class46_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt2782 = arg1;
	}

	@OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(Lclient!sq;ILjava/nio/ByteBuffer;Z)V")
	public Class54_Sub2(@OriginalArg(0) Class46_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) ByteBuffer arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, 34962, arg2, arg3);
		this.anInt2782 = arg1;
	}

	@OriginalMember(owner = "client!hs", name = "d", descriptor = "(Lclient!qd;)V")
	@Override
	public void method5384(@OriginalArg(0) Class168 arg0) {
		this.aClass46_Sub2_16.anOpengl1.glNormalPointer(arg0.aShort71, this.anInt2782, (long) arg0.aByte53);
	}

	@OriginalMember(owner = "client!hs", name = "c", descriptor = "(Lclient!qd;)V")
	@Override
	public void method5383(@OriginalArg(0) Class168 arg0) {
		this.aClass46_Sub2_16.anOpengl1.glColorPointer(arg0.aByte54, arg0.aShort71, this.anInt2782, (long) arg0.aByte53);
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "()I")
	@Override
	public int method5385() {
		return super.method5385();
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method5386(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method2650(arg1, arg2);
		this.anInt2782 = arg0;
	}

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(Lclient!qd;)V")
	@Override
	public void method5382(@OriginalArg(0) Class168 arg0) {
		this.aClass46_Sub2_16.anOpengl1.glTexCoordPointer(arg0.aByte54, arg0.aShort71, this.anInt2782, (long) arg0.aByte53);
	}

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "()V")
	@Override
	protected void method2649() {
		this.aClass46_Sub2_16.method5224(this);
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Lclient!qd;)V")
	@Override
	public void method5381(@OriginalArg(0) Class168 arg0) {
		this.aClass46_Sub2_16.anOpengl1.glVertexPointer(arg0.aByte54, arg0.aShort71, this.anInt2782, (long) arg0.aByte53);
	}
}
