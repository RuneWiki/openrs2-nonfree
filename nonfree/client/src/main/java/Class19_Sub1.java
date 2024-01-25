import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public final class Class19_Sub1 extends Class19 implements Interface3 {

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
	private int anInt409;

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(Lclient!hd;ILjava/nio/ByteBuffer;)V")
	public Class19_Sub1(@OriginalArg(0) Class89_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) ByteBuffer arg2) {
		super(arg0, arg2);
		this.anInt409 = arg1;
	}

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(Lclient!hd;I[BI)V")
	public Class19_Sub1(@OriginalArg(0) Class89_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt409 = arg1;
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(Lclient!rs;)V")
	@Override
	public void method4546(@OriginalArg(0) Class181 arg0) {
		this.aClass89_Sub1_42.anOpengl2.glVertexPointer(arg0.aByte64, arg0.aShort76, this.anInt409, this.aByteBuffer7.position(arg0.aByte65));
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method4547(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method5709(arg1, arg2);
		this.anInt409 = arg0;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!rs;)V")
	@Override
	public void method4545(@OriginalArg(0) Class181 arg0) {
		this.aClass89_Sub1_42.anOpengl2.glColorPointer(arg0.aByte64, arg0.aShort76, this.anInt409, this.aByteBuffer7.position(arg0.aByte65));
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILclient!rs;)V")
	@Override
	public void method4549(@OriginalArg(0) int arg0, @OriginalArg(1) Class181 arg1) {
		this.aClass89_Sub1_42.anOpengl2.glClientActiveTexture(arg0 + 33984);
		this.aClass89_Sub1_42.anOpengl2.glTexCoordPointer(arg1.aByte64, arg1.aShort76, this.anInt409, this.aByteBuffer7.position(arg1.aByte65));
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "()I")
	@Override
	public int method5710() {
		return 0;
	}

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "(Lclient!rs;)V")
	@Override
	public void method4548(@OriginalArg(0) Class181 arg0) {
		this.aClass89_Sub1_42.anOpengl2.glNormalPointer(arg0.aShort76, this.anInt409, this.aByteBuffer7.position(arg0.aByte65));
	}
}
