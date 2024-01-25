import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public final class Class100_Sub1 extends Class100 implements Interface6 {

	@OriginalMember(owner = "client!id", name = "c", descriptor = "I")
	private int anInt2306;

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Lclient!tb;ILjava/nio/ByteBuffer;)V")
	public Class100_Sub1(@OriginalArg(0) Class129_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) ByteBuffer arg2) {
		super(arg0, arg2);
		this.anInt2306 = arg1;
	}

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Lclient!tb;I[BI)V")
	public Class100_Sub1(@OriginalArg(0) Class129_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt2306 = arg1;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "()I")
	@Override
	public int method4888() {
		return 0;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method1919(@OriginalArg(0) Class160 arg0) {
		this.aClass129_Sub2_37.anOpengl2.glColorPointer(arg0.aByte57, arg0.aShort70, this.anInt2306, this.aByteBuffer7.position(arg0.aByte58));
	}

	@OriginalMember(owner = "client!id", name = "d", descriptor = "(Lclient!q;)V")
	@Override
	public void method1923(@OriginalArg(0) Class160 arg0) {
		this.aClass129_Sub2_37.anOpengl2.glNormalPointer(arg0.aShort70, this.anInt2306, this.aByteBuffer7.position(arg0.aByte58));
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method1924(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method4885(arg1, arg2);
		this.anInt2306 = arg0;
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(Lclient!q;)V")
	@Override
	public void method1920(@OriginalArg(0) Class160 arg0) {
		this.aClass129_Sub2_37.anOpengl2.glVertexPointer(arg0.aByte57, arg0.aShort70, this.anInt2306, this.aByteBuffer7.position(arg0.aByte58));
	}

	@OriginalMember(owner = "client!id", name = "c", descriptor = "(Lclient!q;)V")
	@Override
	public void method1921(@OriginalArg(0) Class160 arg0) {
		this.aClass129_Sub2_37.anOpengl2.glTexCoordPointer(arg0.aByte57, arg0.aShort70, this.anInt2306, this.aByteBuffer7.position(arg0.aByte58));
	}
}
