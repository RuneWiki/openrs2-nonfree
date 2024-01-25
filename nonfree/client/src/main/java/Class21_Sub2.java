import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public final class Class21_Sub2 extends Class21 implements Interface3 {

	@OriginalMember(owner = "client!cn", name = "c", descriptor = "I")
	private int anInt1074;

	@OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Lclient!nm;ILjava/nio/ByteBuffer;)V")
	public Class21_Sub2(@OriginalArg(0) Class164_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) ByteBuffer arg2) {
		super(arg0, arg2);
		this.anInt1074 = arg1;
	}

	@OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Lclient!nm;I[BI)V")
	public Class21_Sub2(@OriginalArg(0) Class164_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt1074 = arg1;
	}

	@OriginalMember(owner = "client!cn", name = "d", descriptor = "(Lclient!jt;)V")
	@Override
	public void method2571(@OriginalArg(0) Class126 arg0) {
		this.aClass164_Sub1_8.anOpengl1.glNormalPointer(arg0.aShort57, this.anInt1074, this.aByteBuffer3.position(arg0.aByte43));
	}

	@OriginalMember(owner = "client!cn", name = "c", descriptor = "(Lclient!jt;)V")
	@Override
	public void method2570(@OriginalArg(0) Class126 arg0) {
		this.aClass164_Sub1_8.anOpengl1.glVertexPointer(arg0.aByte44, arg0.aShort57, this.anInt1074, this.aByteBuffer3.position(arg0.aByte43));
	}

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "(Lclient!jt;)V")
	@Override
	public void method2569(@OriginalArg(0) Class126 arg0) {
		this.aClass164_Sub1_8.anOpengl1.glColorPointer(arg0.aByte44, arg0.aShort57, this.anInt1074, this.aByteBuffer3.position(arg0.aByte43));
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "()I")
	@Override
	public int method3103() {
		return 0;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method2572(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method840(arg1, arg2);
		this.anInt1074 = arg0;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lclient!jt;)V")
	@Override
	public void method2568(@OriginalArg(0) Class126 arg0) {
		this.aClass164_Sub1_8.anOpengl1.glTexCoordPointer(arg0.aByte44, arg0.aShort57, this.anInt1074, this.aByteBuffer3.position(arg0.aByte43));
	}
}
