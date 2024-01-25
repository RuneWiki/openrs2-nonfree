import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public final class Class63_Sub1 extends Class63 implements Interface6 {

	@OriginalMember(owner = "client!fk", name = "g", descriptor = "I")
	private int anInt1858;

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Lclient!hj;ILjava/nio/ByteBuffer;Z)V")
	public Class63_Sub1(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) ByteBuffer arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, 34962, arg2, arg3);
		this.anInt1858 = arg1;
	}

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Lclient!hj;I[BIZ)V")
	public Class63_Sub1(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt1858 = arg1;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method1758(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method4264(arg1, arg2);
		this.anInt1858 = arg0;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lclient!ln;)V")
	@Override
	public void method1755(@OriginalArg(0) Class120 arg0) {
		this.aClass2_Sub1_27.anOpengl1.glVertexPointer(arg0.aByte33, arg0.aShort36, this.anInt1858, (long) arg0.aByte32);
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "()I")
	@Override
	public int method4262() {
		return super.method4262();
	}

	@OriginalMember(owner = "client!fk", name = "d", descriptor = "(Lclient!ln;)V")
	@Override
	public void method1759(@OriginalArg(0) Class120 arg0) {
		this.aClass2_Sub1_27.anOpengl1.glTexCoordPointer(arg0.aByte33, arg0.aShort36, this.anInt1858, (long) arg0.aByte32);
	}

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "(Lclient!ln;)V")
	@Override
	public void method1757(@OriginalArg(0) Class120 arg0) {
		this.aClass2_Sub1_27.anOpengl1.glNormalPointer(arg0.aShort36, this.anInt1858, (long) arg0.aByte32);
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(Lclient!ln;)V")
	@Override
	public void method1756(@OriginalArg(0) Class120 arg0) {
		this.aClass2_Sub1_27.anOpengl1.glColorPointer(arg0.aByte33, arg0.aShort36, this.anInt1858, (long) arg0.aByte32);
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "()V")
	@Override
	protected void method4263() {
		this.aClass2_Sub1_27.method2359(this);
	}
}
