import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public final class Class23_Sub1 extends Class23 implements Interface6 {

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
	private int anInt934;

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lclient!ks;I[BI)V")
	public Class23_Sub1(@OriginalArg(0) Class63_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt934 = arg1;
	}

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lclient!ks;ILjava/nio/ByteBuffer;)V")
	public Class23_Sub1(@OriginalArg(0) Class63_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) ByteBuffer arg2) {
		super(arg0, arg2);
		this.anInt934 = arg1;
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(Lclient!pa;)V")
	@Override
	public void method5382(@OriginalArg(0) Class161 arg0) {
		this.aClass63_Sub1_17.anOpengl1.glColorPointer(arg0.aByte47, arg0.aShort68, this.anInt934, this.aByteBuffer5.position(arg0.aByte46));
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!pa;)V")
	@Override
	public void method5381(@OriginalArg(0) Class161 arg0) {
		this.aClass63_Sub1_17.anOpengl1.glNormalPointer(arg0.aShort68, this.anInt934, this.aByteBuffer5.position(arg0.aByte46));
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method5384(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method1743(arg1, arg2);
		this.anInt934 = arg0;
	}

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "(Lclient!pa;)V")
	@Override
	public void method5383(@OriginalArg(0) Class161 arg0) {
		this.aClass63_Sub1_17.anOpengl1.glTexCoordPointer(arg0.aByte47, arg0.aShort68, this.anInt934, this.aByteBuffer5.position(arg0.aByte46));
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "()I")
	@Override
	public int method5379() {
		return 0;
	}

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "(Lclient!pa;)V")
	@Override
	public void method5385(@OriginalArg(0) Class161 arg0) {
		this.aClass63_Sub1_17.anOpengl1.glVertexPointer(arg0.aByte47, arg0.aShort68, this.anInt934, this.aByteBuffer5.position(arg0.aByte46));
	}
}
