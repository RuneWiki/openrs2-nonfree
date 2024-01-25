import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public final class Class4_Sub1 extends Class4 implements Interface8 {

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
	private int anInt87;

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Lclient!h;ILjava/nio/ByteBuffer;)V")
	public Class4_Sub1(@OriginalArg(0) Class32_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) ByteBuffer arg2) {
		super(arg0, arg2);
		this.anInt87 = arg1;
	}

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Lclient!h;I[BI)V")
	public Class4_Sub1(@OriginalArg(0) Class32_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt87 = arg1;
	}

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "(Lclient!ig;)V")
	@Override
	public void method1851(@OriginalArg(0) Class91 arg0) {
		this.aClass32_Sub2_19.anOpengl2.glTexCoordPointer(arg0.aByte21, arg0.aShort30, this.anInt87, this.aByteBuffer5.position(arg0.aByte20));
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(Lclient!ig;)V")
	@Override
	public void method1849(@OriginalArg(0) Class91 arg0) {
		this.aClass32_Sub2_19.anOpengl2.glVertexPointer(arg0.aByte21, arg0.aShort30, this.anInt87, this.aByteBuffer5.position(arg0.aByte20));
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method1847(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method2572(arg1, arg2);
		this.anInt87 = arg0;
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(Lclient!ig;)V")
	@Override
	public void method1850(@OriginalArg(0) Class91 arg0) {
		this.aClass32_Sub2_19.anOpengl2.glColorPointer(arg0.aByte21, arg0.aShort30, this.anInt87, this.aByteBuffer5.position(arg0.aByte20));
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!ig;)V")
	@Override
	public void method1848(@OriginalArg(0) Class91 arg0) {
		this.aClass32_Sub2_19.anOpengl2.glNormalPointer(arg0.aShort30, this.anInt87, this.aByteBuffer5.position(arg0.aByte20));
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "()I")
	@Override
	public int method2573() {
		return 0;
	}
}
