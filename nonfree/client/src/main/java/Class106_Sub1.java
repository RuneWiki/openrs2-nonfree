import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public final class Class106_Sub1 extends Class106 implements Interface7 {

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
	private int anInt5190;

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Lclient!cg;I[BI)V")
	public Class106_Sub1(@OriginalArg(0) Class37_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt5190 = arg1;
	}

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Lclient!cg;ILjava/nio/ByteBuffer;)V")
	public Class106_Sub1(@OriginalArg(0) Class37_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) ByteBuffer arg2) {
		super(arg0, arg2);
		this.anInt5190 = arg1;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "()I")
	@Override
	public int method5582() {
		return 0;
	}

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "(Lclient!tf;)V")
	@Override
	public void method5588(@OriginalArg(0) Class190 arg0) {
		this.aClass37_Sub1_37.anOpengl1.glColorPointer(arg0.aByte66, arg0.aShort85, this.anInt5190, this.aByteBuffer7.position(arg0.aByte65));
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!tf;)V")
	@Override
	public void method5585(@OriginalArg(0) Class190 arg0) {
		this.aClass37_Sub1_37.anOpengl1.glNormalPointer(arg0.aShort85, this.anInt5190, this.aByteBuffer7.position(arg0.aByte65));
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(Lclient!tf;)V")
	@Override
	public void method5586(@OriginalArg(0) Class190 arg0) {
		this.aClass37_Sub1_37.anOpengl1.glTexCoordPointer(arg0.aByte66, arg0.aShort85, this.anInt5190, this.aByteBuffer7.position(arg0.aByte65));
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method5587(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method4902(arg1, arg2);
		this.anInt5190 = arg0;
	}

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "(Lclient!tf;)V")
	@Override
	public void method5589(@OriginalArg(0) Class190 arg0) {
		this.aClass37_Sub1_37.anOpengl1.glVertexPointer(arg0.aByte66, arg0.aShort85, this.anInt5190, this.aByteBuffer7.position(arg0.aByte65));
	}
}
