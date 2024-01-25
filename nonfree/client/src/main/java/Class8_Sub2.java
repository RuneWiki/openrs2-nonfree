import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public final class Class8_Sub2 extends Class8 implements Interface9 {

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "I")
	private int anInt3368;

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(Lclient!po;I[BI)V")
	public Class8_Sub2(@OriginalArg(0) Class59_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt3368 = arg1;
	}

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(Lclient!po;ILjava/nio/ByteBuffer;)V")
	public Class8_Sub2(@OriginalArg(0) Class59_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) ByteBuffer arg2) {
		super(arg0, arg2);
		this.anInt3368 = arg1;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method5701(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method3086(arg1, arg2);
		this.anInt3368 = arg0;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "()I")
	@Override
	public int method5698() {
		return 0;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lclient!pe;)V")
	@Override
	public void method5702(@OriginalArg(0) Class156 arg0) {
		this.aClass59_Sub1_25.anOpengl2.glVertexPointer(arg0.aByte52, arg0.aShort55, this.anInt3368, this.aByteBuffer7.position(arg0.aByte51));
	}

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "(Lclient!pe;)V")
	@Override
	public void method5705(@OriginalArg(0) Class156 arg0) {
		this.aClass59_Sub1_25.anOpengl2.glNormalPointer(arg0.aShort55, this.anInt3368, this.aByteBuffer7.position(arg0.aByte51));
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(ILclient!pe;)V")
	@Override
	public void method5703(@OriginalArg(0) int arg0, @OriginalArg(1) Class156 arg1) {
		this.aClass59_Sub1_25.anOpengl2.glClientActiveTexture(arg0 + 33984);
		this.aClass59_Sub1_25.anOpengl2.glTexCoordPointer(arg1.aByte52, arg1.aShort55, this.anInt3368, this.aByteBuffer7.position(arg1.aByte51));
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(Lclient!pe;)V")
	@Override
	public void method5704(@OriginalArg(0) Class156 arg0) {
		this.aClass59_Sub1_25.anOpengl2.glColorPointer(arg0.aByte52, arg0.aShort55, this.anInt3368, this.aByteBuffer7.position(arg0.aByte51));
	}
}
