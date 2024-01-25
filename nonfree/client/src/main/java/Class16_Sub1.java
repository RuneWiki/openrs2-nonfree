import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public final class Class16_Sub1 extends Class16 implements Interface7 {

	@OriginalMember(owner = "client!bb", name = "g", descriptor = "I")
	private int anInt353;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lclient!qi;ILjava/nio/ByteBuffer;Z)V")
	public Class16_Sub1(@OriginalArg(0) Class82_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) ByteBuffer arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, 34962, arg2, arg3);
		this.anInt353 = arg1;
	}

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lclient!qi;I[BIZ)V")
	public Class16_Sub1(@OriginalArg(0) Class82_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt353 = arg1;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!uk;)V")
	@Override
	public void method5129(@OriginalArg(0) Class229 arg0) {
		this.aClass82_Sub2_25.anOpengl2.glVertexPointer(arg0.aByte71, arg0.aShort93, this.anInt353, (long) arg0.aByte72);
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "()V")
	@Override
	protected void method3544() {
		this.aClass82_Sub2_25.method4586(this);
	}

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "(Lclient!uk;)V")
	@Override
	public void method5133(@OriginalArg(0) Class229 arg0) {
		this.aClass82_Sub2_25.anOpengl2.glColorPointer(arg0.aByte71, arg0.aShort93, this.anInt353, (long) arg0.aByte72);
	}

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "(Lclient!uk;)V")
	@Override
	public void method5134(@OriginalArg(0) Class229 arg0) {
		this.aClass82_Sub2_25.anOpengl2.glTexCoordPointer(arg0.aByte71, arg0.aShort93, this.anInt353, (long) arg0.aByte72);
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(Lclient!uk;)V")
	@Override
	public void method5131(@OriginalArg(0) Class229 arg0) {
		this.aClass82_Sub2_25.anOpengl2.glNormalPointer(arg0.aShort93, this.anInt353, (long) arg0.aByte72);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "()I")
	@Override
	public int method5130() {
		return super.method5130();
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method5132(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method3545(arg1, arg2);
		this.anInt353 = arg0;
	}
}
