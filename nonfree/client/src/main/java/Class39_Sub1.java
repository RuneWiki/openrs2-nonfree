import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public final class Class39_Sub1 extends Class39 implements Interface8 {

	@OriginalMember(owner = "client!rm", name = "c", descriptor = "I")
	private int anInt5299;

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(Lclient!ge;I[BI)V")
	public Class39_Sub1(@OriginalArg(0) Class81_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt5299 = arg1;
	}

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(Lclient!ge;ILjava/nio/ByteBuffer;)V")
	public Class39_Sub1(@OriginalArg(0) Class81_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) ByteBuffer arg2) {
		super(arg0, arg2);
		this.anInt5299 = arg1;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "()I")
	@Override
	public int method5116() {
		return 0;
	}

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "(Lclient!jm;)V")
	@Override
	public void method5001(@OriginalArg(0) Class110 arg0) {
		this.aClass81_Sub1_36.anOpengl1.glColorPointer(arg0.aByte40, arg0.aShort41, this.anInt5299, this.aByteBuffer7.position(arg0.aByte41));
	}

	@OriginalMember(owner = "client!rm", name = "c", descriptor = "(Lclient!jm;)V")
	@Override
	public void method5003(@OriginalArg(0) Class110 arg0) {
		this.aClass81_Sub1_36.anOpengl1.glVertexPointer(arg0.aByte40, arg0.aShort41, this.anInt5299, this.aByteBuffer7.position(arg0.aByte41));
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method5004(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method5114(arg1, arg2);
		this.anInt5299 = arg0;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(ILclient!jm;)V")
	@Override
	public void method5002(@OriginalArg(0) int arg0, @OriginalArg(1) Class110 arg1) {
		this.aClass81_Sub1_36.anOpengl1.glClientActiveTexture(arg0 + 33984);
		this.aClass81_Sub1_36.anOpengl1.glTexCoordPointer(arg1.aByte40, arg1.aShort41, this.anInt5299, this.aByteBuffer7.position(arg1.aByte41));
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lclient!jm;)V")
	@Override
	public void method5000(@OriginalArg(0) Class110 arg0) {
		this.aClass81_Sub1_36.anOpengl1.glNormalPointer(arg0.aShort41, this.anInt5299, this.aByteBuffer7.position(arg0.aByte41));
	}
}
