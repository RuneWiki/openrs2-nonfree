import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public final class Class94_Sub1 extends Class94 implements Interface2 {

	@OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
	private int anInt2849;

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lclient!ic;ILjava/nio/ByteBuffer;Z)V")
	public Class94_Sub1(@OriginalArg(0) Class48_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) ByteBuffer arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, 34962, arg2, arg3);
		this.anInt2849 = arg1;
	}

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lclient!ic;I[BIZ)V")
	public Class94_Sub1(@OriginalArg(0) Class48_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt2849 = arg1;
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "()V")
	@Override
	protected void method5134() {
		this.aClass48_Sub2_30.method2614(this);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method2372(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method5133(arg1, arg2);
		this.anInt2849 = arg0;
	}

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "(Lclient!fh;)V")
	@Override
	public void method2376(@OriginalArg(0) Class75 arg0) {
		this.aClass48_Sub2_30.anOpengl2.glTexCoordPointer(arg0.aByte23, arg0.aShort33, this.anInt2849, (long) arg0.aByte24);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lclient!fh;)V")
	@Override
	public void method2373(@OriginalArg(0) Class75 arg0) {
		this.aClass48_Sub2_30.anOpengl2.glNormalPointer(arg0.aShort33, this.anInt2849, (long) arg0.aByte24);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "()I")
	@Override
	public int method5135() {
		return super.method5135();
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(Lclient!fh;)V")
	@Override
	public void method2374(@OriginalArg(0) Class75 arg0) {
		this.aClass48_Sub2_30.anOpengl2.glVertexPointer(arg0.aByte23, arg0.aShort33, this.anInt2849, (long) arg0.aByte24);
	}

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "(Lclient!fh;)V")
	@Override
	public void method2377(@OriginalArg(0) Class75 arg0) {
		this.aClass48_Sub2_30.anOpengl2.glColorPointer(arg0.aByte23, arg0.aShort33, this.anInt2849, (long) arg0.aByte24);
	}
}
