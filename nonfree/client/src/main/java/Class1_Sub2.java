import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public final class Class1_Sub2 extends Class1 implements Interface5 {

	@OriginalMember(owner = "client!hm", name = "g", descriptor = "I")
	private int anInt2629;

	@OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(Lclient!mi;ILjava/nio/ByteBuffer;Z)V")
	public Class1_Sub2(@OriginalArg(0) Class155_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) ByteBuffer arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, 34962, arg2, arg3);
		this.anInt2629 = arg1;
	}

	@OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(Lclient!mi;I[BIZ)V")
	public Class1_Sub2(@OriginalArg(0) Class155_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt2629 = arg1;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method3936(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method2201(arg1, arg2);
		this.anInt2629 = arg0;
	}

	@OriginalMember(owner = "client!hm", name = "c", descriptor = "(Lclient!ga;)V")
	@Override
	public void method3934(@OriginalArg(0) Class88 arg0) {
		this.aClass155_Sub1_15.anOpengl1.glColorPointer(arg0.aByte34, arg0.aShort30, this.anInt2629, (long) arg0.aByte33);
	}

	@OriginalMember(owner = "client!hm", name = "d", descriptor = "(Lclient!ga;)V")
	@Override
	public void method3935(@OriginalArg(0) Class88 arg0) {
		this.aClass155_Sub1_15.anOpengl1.glVertexPointer(arg0.aByte34, arg0.aShort30, this.anInt2629, (long) arg0.aByte33);
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "()I")
	@Override
	public int method3932() {
		return super.method3932();
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lclient!ga;)V")
	@Override
	public void method3931(@OriginalArg(0) Class88 arg0) {
		this.aClass155_Sub1_15.anOpengl1.glNormalPointer(arg0.aShort30, this.anInt2629, (long) arg0.aByte33);
	}

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "()V")
	@Override
	protected void method2199() {
		this.aClass155_Sub1_15.method3601(this);
	}

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "(Lclient!ga;)V")
	@Override
	public void method3933(@OriginalArg(0) Class88 arg0) {
		this.aClass155_Sub1_15.anOpengl1.glTexCoordPointer(arg0.aByte34, arg0.aShort30, this.anInt2629, (long) arg0.aByte33);
	}
}
