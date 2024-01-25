import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public final class Class182_Sub2 extends Class182 implements Interface3 {

	@OriginalMember(owner = "client!to", name = "c", descriptor = "I")
	private int anInt6024;

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lclient!sq;I[BI)V")
	public Class182_Sub2(@OriginalArg(0) Class46_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt6024 = arg1;
	}

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lclient!sq;ILjava/nio/ByteBuffer;)V")
	public Class182_Sub2(@OriginalArg(0) Class46_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) ByteBuffer arg2) {
		super(arg0, arg2);
		this.anInt6024 = arg1;
	}

	@OriginalMember(owner = "client!to", name = "c", descriptor = "(Lclient!qd;)V")
	@Override
	public void method5383(@OriginalArg(0) Class168 arg0) {
		this.aClass46_Sub2_38.anOpengl1.glColorPointer(arg0.aByte54, arg0.aShort71, this.anInt6024, this.aByteBuffer6.position(arg0.aByte53));
	}

	@OriginalMember(owner = "client!to", name = "b", descriptor = "(Lclient!qd;)V")
	@Override
	public void method5382(@OriginalArg(0) Class168 arg0) {
		this.aClass46_Sub2_38.anOpengl1.glTexCoordPointer(arg0.aByte54, arg0.aShort71, this.anInt6024, this.aByteBuffer6.position(arg0.aByte53));
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method5386(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method5380(arg1, arg2);
		this.anInt6024 = arg0;
	}

	@OriginalMember(owner = "client!to", name = "d", descriptor = "(Lclient!qd;)V")
	@Override
	public void method5384(@OriginalArg(0) Class168 arg0) {
		this.aClass46_Sub2_38.anOpengl1.glNormalPointer(arg0.aShort71, this.anInt6024, this.aByteBuffer6.position(arg0.aByte53));
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "()I")
	@Override
	public int method5385() {
		return 0;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!qd;)V")
	@Override
	public void method5381(@OriginalArg(0) Class168 arg0) {
		this.aClass46_Sub2_38.anOpengl1.glVertexPointer(arg0.aByte54, arg0.aShort71, this.anInt6024, this.aByteBuffer6.position(arg0.aByte53));
	}
}
