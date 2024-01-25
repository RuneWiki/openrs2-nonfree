import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public final class Class47_Sub1 extends Class47 implements Interface6 {

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
	private int anInt1533;

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Lclient!hj;ILjava/nio/ByteBuffer;)V")
	public Class47_Sub1(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) ByteBuffer arg2) {
		super(arg0, arg2);
		this.anInt1533 = arg1;
	}

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Lclient!hj;I[BI)V")
	public Class47_Sub1(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt1533 = arg1;
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(Lclient!ln;)V")
	@Override
	public void method1756(@OriginalArg(0) Class120 arg0) {
		this.aClass2_Sub1_20.anOpengl1.glColorPointer(arg0.aByte33, arg0.aShort36, this.anInt1533, this.aByteBuffer4.position(arg0.aByte32));
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "()I")
	@Override
	public int method4262() {
		return 0;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method1758(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method2667(arg1, arg2);
		this.anInt1533 = arg0;
	}

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "(Lclient!ln;)V")
	@Override
	public void method1757(@OriginalArg(0) Class120 arg0) {
		this.aClass2_Sub1_20.anOpengl1.glNormalPointer(arg0.aShort36, this.anInt1533, this.aByteBuffer4.position(arg0.aByte32));
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!ln;)V")
	@Override
	public void method1755(@OriginalArg(0) Class120 arg0) {
		this.aClass2_Sub1_20.anOpengl1.glVertexPointer(arg0.aByte33, arg0.aShort36, this.anInt1533, this.aByteBuffer4.position(arg0.aByte32));
	}

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "(Lclient!ln;)V")
	@Override
	public void method1759(@OriginalArg(0) Class120 arg0) {
		this.aClass2_Sub1_20.anOpengl1.glTexCoordPointer(arg0.aByte33, arg0.aShort36, this.anInt1533, this.aByteBuffer4.position(arg0.aByte32));
	}
}
