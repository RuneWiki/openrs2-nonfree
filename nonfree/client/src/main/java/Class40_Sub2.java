import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public final class Class40_Sub2 extends Class40 implements Interface9 {

	@OriginalMember(owner = "client!wh", name = "g", descriptor = "I")
	private int anInt6457;

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lclient!po;I[BIZ)V")
	public Class40_Sub2(@OriginalArg(0) Class59_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt6457 = arg1;
	}

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lclient!po;ILjava/nio/ByteBuffer;Z)V")
	public Class40_Sub2(@OriginalArg(0) Class59_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) ByteBuffer arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, 34962, arg2, arg3);
		this.anInt6457 = arg1;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method5701(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method5699(arg1, arg2);
		this.anInt6457 = arg0;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "()I")
	@Override
	public int method5698() {
		return super.method5698();
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "()V")
	@Override
	protected void method5700() {
		this.aClass59_Sub1_39.method4266(this);
	}

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "(Lclient!pe;)V")
	@Override
	public void method5705(@OriginalArg(0) Class156 arg0) {
		this.aClass59_Sub1_39.anOpengl2.glNormalPointer(arg0.aShort55, this.anInt6457, (long) arg0.aByte51);
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(Lclient!pe;)V")
	@Override
	public void method5704(@OriginalArg(0) Class156 arg0) {
		this.aClass59_Sub1_39.anOpengl2.glColorPointer(arg0.aByte52, arg0.aShort55, this.anInt6457, (long) arg0.aByte51);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lclient!pe;)V")
	@Override
	public void method5702(@OriginalArg(0) Class156 arg0) {
		this.aClass59_Sub1_39.anOpengl2.glVertexPointer(arg0.aByte52, arg0.aShort55, this.anInt6457, (long) arg0.aByte51);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILclient!pe;)V")
	@Override
	public void method5703(@OriginalArg(0) int arg0, @OriginalArg(1) Class156 arg1) {
		this.aClass59_Sub1_39.anOpengl2.glClientActiveTexture(arg0 + 33984);
		this.aClass59_Sub1_39.anOpengl2.glTexCoordPointer(arg1.aByte52, arg1.aShort55, this.anInt6457, (long) arg1.aByte51);
	}
}
