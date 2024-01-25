import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public final class Class18_Sub2 extends Class18 implements Interface9 {

	@OriginalMember(owner = "client!pk", name = "c", descriptor = "I")
	private int anInt4838;

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Lclient!nf;I[BI)V")
	public Class18_Sub2(@OriginalArg(0) Class105_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt4838 = arg1;
	}

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Lclient!nf;ILjava/nio/ByteBuffer;)V")
	public Class18_Sub2(@OriginalArg(0) Class105_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) ByteBuffer arg2) {
		super(arg0, arg2);
		this.anInt4838 = arg1;
	}

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "(Lclient!gm;)V")
	@Override
	public void method4195(@OriginalArg(0) Class84 arg0) {
		this.aClass105_Sub1_31.anOpengl1.glNormalPointer(arg0.aShort41, this.anInt4838, this.aByteBuffer5.position(arg0.aByte37));
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "()I")
	@Override
	public int method4193() {
		return 0;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method4198(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method4192(arg1, arg2);
		this.anInt4838 = arg0;
	}

	@OriginalMember(owner = "client!pk", name = "c", descriptor = "(Lclient!gm;)V")
	@Override
	public void method4196(@OriginalArg(0) Class84 arg0) {
		this.aClass105_Sub1_31.anOpengl1.glTexCoordPointer(arg0.aByte36, arg0.aShort41, this.anInt4838, this.aByteBuffer5.position(arg0.aByte37));
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lclient!gm;)V")
	@Override
	public void method4194(@OriginalArg(0) Class84 arg0) {
		this.aClass105_Sub1_31.anOpengl1.glVertexPointer(arg0.aByte36, arg0.aShort41, this.anInt4838, this.aByteBuffer5.position(arg0.aByte37));
	}

	@OriginalMember(owner = "client!pk", name = "d", descriptor = "(Lclient!gm;)V")
	@Override
	public void method4197(@OriginalArg(0) Class84 arg0) {
		this.aClass105_Sub1_31.anOpengl1.glColorPointer(arg0.aByte36, arg0.aShort41, this.anInt4838, this.aByteBuffer5.position(arg0.aByte37));
	}
}
