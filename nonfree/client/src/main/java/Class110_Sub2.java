import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public final class Class110_Sub2 extends Class110 implements Interface7 {

	@OriginalMember(owner = "client!vi", name = "g", descriptor = "I")
	private int anInt6670;

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Lclient!cg;ILjava/nio/ByteBuffer;Z)V")
	public Class110_Sub2(@OriginalArg(0) Class37_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) ByteBuffer arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, 34962, arg2, arg3);
		this.anInt6670 = arg1;
	}

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Lclient!cg;I[BIZ)V")
	public Class110_Sub2(@OriginalArg(0) Class37_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt6670 = arg1;
	}

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "(Lclient!tf;)V")
	@Override
	public void method5588(@OriginalArg(0) Class190 arg0) {
		this.aClass37_Sub1_41.anOpengl1.glColorPointer(arg0.aByte66, arg0.aShort85, this.anInt6670, (long) arg0.aByte65);
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lclient!tf;)V")
	@Override
	public void method5585(@OriginalArg(0) Class190 arg0) {
		this.aClass37_Sub1_41.anOpengl1.glNormalPointer(arg0.aShort85, this.anInt6670, (long) arg0.aByte65);
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(Lclient!tf;)V")
	@Override
	public void method5586(@OriginalArg(0) Class190 arg0) {
		this.aClass37_Sub1_41.anOpengl1.glTexCoordPointer(arg0.aByte66, arg0.aShort85, this.anInt6670, (long) arg0.aByte65);
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "()I")
	@Override
	public int method5582() {
		return super.method5582();
	}

	@OriginalMember(owner = "client!vi", name = "d", descriptor = "(Lclient!tf;)V")
	@Override
	public void method5589(@OriginalArg(0) Class190 arg0) {
		this.aClass37_Sub1_41.anOpengl1.glVertexPointer(arg0.aByte66, arg0.aShort85, this.anInt6670, (long) arg0.aByte65);
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "()V")
	@Override
	protected void method5583() {
		this.aClass37_Sub1_41.method770(this);
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method5587(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method5584(arg1, arg2);
		this.anInt6670 = arg0;
	}
}
