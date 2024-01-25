import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public final class Class54_Sub2 extends Class54 implements Interface6 {

	@OriginalMember(owner = "client!pp", name = "g", descriptor = "I")
	private int anInt5191;

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lclient!ql;ILjava/nio/ByteBuffer;Z)V")
	public Class54_Sub2(@OriginalArg(0) Class92_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) ByteBuffer arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, 34962, arg2, arg3);
		this.anInt5191 = arg1;
	}

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lclient!ql;I[BIZ)V")
	public Class54_Sub2(@OriginalArg(0) Class92_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt5191 = arg1;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "()I")
	@Override
	public int method4362() {
		return super.method4362();
	}

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "(Lclient!bb;)V")
	@Override
	public void method4306(@OriginalArg(0) Class19 arg0) {
		this.aClass92_Sub2_30.anOpengl2.glNormalPointer(arg0.aShort9, this.anInt5191, (long) arg0.aByte6);
	}

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "(Lclient!bb;)V")
	@Override
	public void method4305(@OriginalArg(0) Class19 arg0) {
		this.aClass92_Sub2_30.anOpengl2.glVertexPointer(arg0.aByte7, arg0.aShort9, this.anInt5191, (long) arg0.aByte6);
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(ILclient!bb;)V")
	@Override
	public void method4303(@OriginalArg(0) int arg0, @OriginalArg(1) Class19 arg1) {
		this.aClass92_Sub2_30.anOpengl2.glClientActiveTexture(arg0 + 33984);
		this.aClass92_Sub2_30.anOpengl2.glTexCoordPointer(arg1.aByte7, arg1.aShort9, this.anInt5191, (long) arg1.aByte6);
	}

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "()V")
	@Override
	protected void method4300() {
		this.aClass92_Sub2_30.method4562(this);
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method4304(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method4301(arg1, arg2);
		this.anInt5191 = arg0;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(Lclient!bb;)V")
	@Override
	public void method4302(@OriginalArg(0) Class19 arg0) {
		this.aClass92_Sub2_30.anOpengl2.glColorPointer(arg0.aByte7, arg0.aShort9, this.anInt5191, (long) arg0.aByte6);
	}
}
