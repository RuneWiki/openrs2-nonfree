import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public final class Class99_Sub1 extends Class99 implements Interface2 {

	@OriginalMember(owner = "client!ho", name = "c", descriptor = "I")
	private int anInt2947;

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Lclient!ic;ILjava/nio/ByteBuffer;)V")
	public Class99_Sub1(@OriginalArg(0) Class48_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) ByteBuffer arg2) {
		super(arg0, arg2);
		this.anInt2947 = arg1;
	}

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Lclient!ic;I[BI)V")
	public Class99_Sub1(@OriginalArg(0) Class48_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt2947 = arg1;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(Lclient!fh;)V")
	@Override
	public void method2373(@OriginalArg(0) Class75 arg0) {
		this.aClass48_Sub2_19.anOpengl2.glNormalPointer(arg0.aShort33, this.anInt2947, this.aByteBuffer6.position(arg0.aByte24));
	}

	@OriginalMember(owner = "client!ho", name = "d", descriptor = "(Lclient!fh;)V")
	@Override
	public void method2377(@OriginalArg(0) Class75 arg0) {
		this.aClass48_Sub2_19.anOpengl2.glColorPointer(arg0.aByte23, arg0.aShort33, this.anInt2947, this.aByteBuffer6.position(arg0.aByte24));
	}

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "(Lclient!fh;)V")
	@Override
	public void method2374(@OriginalArg(0) Class75 arg0) {
		this.aClass48_Sub2_19.anOpengl2.glVertexPointer(arg0.aByte23, arg0.aShort33, this.anInt2947, this.aByteBuffer6.position(arg0.aByte24));
	}

	@OriginalMember(owner = "client!ho", name = "c", descriptor = "(Lclient!fh;)V")
	@Override
	public void method2376(@OriginalArg(0) Class75 arg0) {
		this.aClass48_Sub2_19.anOpengl2.glTexCoordPointer(arg0.aByte23, arg0.aShort33, this.anInt2947, this.aByteBuffer6.position(arg0.aByte24));
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "()I")
	@Override
	public int method5135() {
		return 0;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method2372(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method3554(arg1, arg2);
		this.anInt2947 = arg0;
	}
}
