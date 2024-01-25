import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public final class Class80_Sub2 extends Class80 implements Interface9 {

	@OriginalMember(owner = "client!li", name = "g", descriptor = "I")
	private int anInt3539;

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lclient!nf;ILjava/nio/ByteBuffer;Z)V")
	public Class80_Sub2(@OriginalArg(0) Class105_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) ByteBuffer arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, 34962, arg2, arg3);
		this.anInt3539 = arg1;
	}

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lclient!nf;I[BIZ)V")
	public Class80_Sub2(@OriginalArg(0) Class105_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt3539 = arg1;
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "()V")
	@Override
	protected void method2979() {
		this.aClass105_Sub1_22.method3607(this);
	}

	@OriginalMember(owner = "client!li", name = "d", descriptor = "(Lclient!gm;)V")
	@Override
	public void method4197(@OriginalArg(0) Class84 arg0) {
		this.aClass105_Sub1_22.anOpengl1.glColorPointer(arg0.aByte36, arg0.aShort41, this.anInt3539, (long) arg0.aByte37);
	}

	@OriginalMember(owner = "client!li", name = "c", descriptor = "(Lclient!gm;)V")
	@Override
	public void method4196(@OriginalArg(0) Class84 arg0) {
		this.aClass105_Sub1_22.anOpengl1.glTexCoordPointer(arg0.aByte36, arg0.aShort41, this.anInt3539, (long) arg0.aByte37);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Lclient!gm;)V")
	@Override
	public void method4194(@OriginalArg(0) Class84 arg0) {
		this.aClass105_Sub1_22.anOpengl1.glVertexPointer(arg0.aByte36, arg0.aShort41, this.anInt3539, (long) arg0.aByte37);
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(Lclient!gm;)V")
	@Override
	public void method4195(@OriginalArg(0) Class84 arg0) {
		this.aClass105_Sub1_22.anOpengl1.glNormalPointer(arg0.aShort41, this.anInt3539, (long) arg0.aByte37);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "()I")
	@Override
	public int method4193() {
		return super.method4193();
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method4198(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method2977(arg1, arg2);
		this.anInt3539 = arg0;
	}
}
