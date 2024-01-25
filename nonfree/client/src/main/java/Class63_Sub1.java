import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public final class Class63_Sub1 extends Class63 implements Interface6 {

	@OriginalMember(owner = "client!es", name = "c", descriptor = "I")
	private int anInt1689;

	@OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Lclient!se;ILjava/nio/ByteBuffer;)V")
	public Class63_Sub1(@OriginalArg(0) Class122_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) ByteBuffer arg2) {
		super(arg0, arg2);
		this.anInt1689 = arg1;
	}

	@OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Lclient!se;I[BI)V")
	public Class63_Sub1(@OriginalArg(0) Class122_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt1689 = arg1;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method3004(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method4939(arg1, arg2);
		this.anInt1689 = arg0;
	}

	@OriginalMember(owner = "client!es", name = "c", descriptor = "(Lclient!kr;)V")
	@Override
	public void method3003(@OriginalArg(0) Class117 arg0) {
		this.aClass122_Sub2_39.anOpengl2.glNormalPointer(arg0.aShort46, this.anInt1689, this.aByteBuffer5.position(arg0.aByte35));
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "()I")
	@Override
	public int method5253() {
		return 0;
	}

	@OriginalMember(owner = "client!es", name = "b", descriptor = "(Lclient!kr;)V")
	@Override
	public void method3002(@OriginalArg(0) Class117 arg0) {
		this.aClass122_Sub2_39.anOpengl2.glColorPointer(arg0.aByte34, arg0.aShort46, this.anInt1689, this.aByteBuffer5.position(arg0.aByte35));
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(Lclient!kr;)V")
	@Override
	public void method3001(@OriginalArg(0) Class117 arg0) {
		this.aClass122_Sub2_39.anOpengl2.glVertexPointer(arg0.aByte34, arg0.aShort46, this.anInt1689, this.aByteBuffer5.position(arg0.aByte35));
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(ILclient!kr;)V")
	@Override
	public void method3005(@OriginalArg(0) int arg0, @OriginalArg(1) Class117 arg1) {
		this.aClass122_Sub2_39.anOpengl2.glClientActiveTexture(arg0 + 33984);
		this.aClass122_Sub2_39.anOpengl2.glTexCoordPointer(arg1.aByte34, arg1.aShort46, this.anInt1689, this.aByteBuffer5.position(arg1.aByte35));
	}
}
