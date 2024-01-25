import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public final class Class131_Sub2 extends Class131 implements Interface7 {

	@OriginalMember(owner = "client!td", name = "c", descriptor = "I")
	private int anInt5885;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Lclient!qi;I[BI)V")
	public Class131_Sub2(@OriginalArg(0) Class82_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt5885 = arg1;
	}

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Lclient!qi;ILjava/nio/ByteBuffer;)V")
	public Class131_Sub2(@OriginalArg(0) Class82_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) ByteBuffer arg2) {
		super(arg0, arg2);
		this.anInt5885 = arg1;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!uk;)V")
	@Override
	public void method5129(@OriginalArg(0) Class229 arg0) {
		this.aClass82_Sub2_36.anOpengl2.glVertexPointer(arg0.aByte71, arg0.aShort93, this.anInt5885, this.aByteBuffer6.position(arg0.aByte72));
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(Lclient!uk;)V")
	@Override
	public void method5133(@OriginalArg(0) Class229 arg0) {
		this.aClass82_Sub2_36.anOpengl2.glColorPointer(arg0.aByte71, arg0.aShort93, this.anInt5885, this.aByteBuffer6.position(arg0.aByte72));
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(Lclient!uk;)V")
	@Override
	public void method5131(@OriginalArg(0) Class229 arg0) {
		this.aClass82_Sub2_36.anOpengl2.glNormalPointer(arg0.aShort93, this.anInt5885, this.aByteBuffer6.position(arg0.aByte72));
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "()I")
	@Override
	public int method5130() {
		return 0;
	}

	@OriginalMember(owner = "client!td", name = "d", descriptor = "(Lclient!uk;)V")
	@Override
	public void method5134(@OriginalArg(0) Class229 arg0) {
		this.aClass82_Sub2_36.anOpengl2.glTexCoordPointer(arg0.aByte71, arg0.aShort93, this.anInt5885, this.aByteBuffer6.position(arg0.aByte72));
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method5132(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method5128(arg1, arg2);
		this.anInt5885 = arg0;
	}
}
