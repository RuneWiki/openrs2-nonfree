import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public final class Class109_Sub2 extends Class109 implements Interface5 {

	@OriginalMember(owner = "client!no", name = "c", descriptor = "I")
	private int anInt4231;

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "(Lclient!mi;I[BI)V")
	public Class109_Sub2(@OriginalArg(0) Class155_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt4231 = arg1;
	}

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "(Lclient!mi;ILjava/nio/ByteBuffer;)V")
	public Class109_Sub2(@OriginalArg(0) Class155_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) ByteBuffer arg2) {
		super(arg0, arg2);
		this.anInt4231 = arg1;
	}

	@OriginalMember(owner = "client!no", name = "b", descriptor = "(Lclient!ga;)V")
	@Override
	public void method3933(@OriginalArg(0) Class88 arg0) {
		this.aClass155_Sub1_29.anOpengl1.glTexCoordPointer(arg0.aByte34, arg0.aShort30, this.anInt4231, this.aByteBuffer6.position(arg0.aByte33));
	}

	@OriginalMember(owner = "client!no", name = "d", descriptor = "(Lclient!ga;)V")
	@Override
	public void method3935(@OriginalArg(0) Class88 arg0) {
		this.aClass155_Sub1_29.anOpengl1.glVertexPointer(arg0.aByte34, arg0.aShort30, this.anInt4231, this.aByteBuffer6.position(arg0.aByte33));
	}

	@OriginalMember(owner = "client!no", name = "c", descriptor = "(Lclient!ga;)V")
	@Override
	public void method3934(@OriginalArg(0) Class88 arg0) {
		this.aClass155_Sub1_29.anOpengl1.glColorPointer(arg0.aByte34, arg0.aShort30, this.anInt4231, this.aByteBuffer6.position(arg0.aByte33));
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Lclient!ga;)V")
	@Override
	public void method3931(@OriginalArg(0) Class88 arg0) {
		this.aClass155_Sub1_29.anOpengl1.glNormalPointer(arg0.aShort30, this.anInt4231, this.aByteBuffer6.position(arg0.aByte33));
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "()I")
	@Override
	public int method3932() {
		return 0;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method3936(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method3930(arg1, arg2);
		this.anInt4231 = arg0;
	}
}
