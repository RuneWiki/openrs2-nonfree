import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public final class Class73_Sub1 extends Class73 implements Interface6 {

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
	private int anInt1891;

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(Lclient!ql;ILjava/nio/ByteBuffer;)V")
	public Class73_Sub1(@OriginalArg(0) Class92_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) ByteBuffer arg2) {
		super(arg0, arg2);
		this.anInt1891 = arg1;
	}

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(Lclient!ql;I[BI)V")
	public Class73_Sub1(@OriginalArg(0) Class92_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt1891 = arg1;
	}

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "(Lclient!bb;)V")
	@Override
	public void method4306(@OriginalArg(0) Class19 arg0) {
		this.aClass92_Sub2_31.anOpengl2.glNormalPointer(arg0.aShort9, this.anInt1891, this.aByteBuffer7.position(arg0.aByte6));
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILclient!bb;)V")
	@Override
	public void method4303(@OriginalArg(0) int arg0, @OriginalArg(1) Class19 arg1) {
		this.aClass92_Sub2_31.anOpengl2.glClientActiveTexture(arg0 + 33984);
		this.aClass92_Sub2_31.anOpengl2.glTexCoordPointer(arg1.aByte7, arg1.aShort9, this.anInt1891, this.aByteBuffer7.position(arg1.aByte6));
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "()I")
	@Override
	public int method4362() {
		return 0;
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(Lclient!bb;)V")
	@Override
	public void method4305(@OriginalArg(0) Class19 arg0) {
		this.aClass92_Sub2_31.anOpengl2.glVertexPointer(arg0.aByte7, arg0.aShort9, this.anInt1891, this.aByteBuffer7.position(arg0.aByte6));
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method4304(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method4361(arg1, arg2);
		this.anInt1891 = arg0;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!bb;)V")
	@Override
	public void method4302(@OriginalArg(0) Class19 arg0) {
		this.aClass92_Sub2_31.anOpengl2.glColorPointer(arg0.aByte7, arg0.aShort9, this.anInt1891, this.aByteBuffer7.position(arg0.aByte6));
	}
}
