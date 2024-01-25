import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public final class Class112_Sub2 extends Class112 implements Interface8 {

	@OriginalMember(owner = "client!rm", name = "g", descriptor = "I")
	private int anInt5586;

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(Lclient!ao;ILjava/nio/ByteBuffer;Z)V")
	public Class112_Sub2(@OriginalArg(0) Class4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) ByteBuffer arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, 34962, arg2, arg3);
		this.anInt5586 = arg1;
	}

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(Lclient!ao;I[BIZ)V")
	public Class112_Sub2(@OriginalArg(0) Class4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt5586 = arg1;
	}

	@OriginalMember(owner = "client!rm", name = "d", descriptor = "(Lclient!hf;)V")
	@Override
	public void method4976(@OriginalArg(0) Class81 arg0) {
		this.aClass4_Sub1_33.anOpengl1.glVertexPointer(arg0.aByte24, arg0.aShort42, this.anInt5586, (long) arg0.aByte25);
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lclient!hf;)V")
	@Override
	public void method4973(@OriginalArg(0) Class81 arg0) {
		this.aClass4_Sub1_33.anOpengl1.glNormalPointer(arg0.aShort42, this.anInt5586, (long) arg0.aByte25);
	}

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "(Lclient!hf;)V")
	@Override
	public void method4974(@OriginalArg(0) Class81 arg0) {
		this.aClass4_Sub1_33.anOpengl1.glColorPointer(arg0.aByte24, arg0.aShort42, this.anInt5586, (long) arg0.aByte25);
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method4972(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method4969(arg1, arg2);
		this.anInt5586 = arg0;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "()I")
	@Override
	public int method4970() {
		return super.method4970();
	}

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "()V")
	@Override
	protected void method4971() {
		this.aClass4_Sub1_33.method579(this);
	}

	@OriginalMember(owner = "client!rm", name = "c", descriptor = "(Lclient!hf;)V")
	@Override
	public void method4975(@OriginalArg(0) Class81 arg0) {
		this.aClass4_Sub1_33.anOpengl1.glTexCoordPointer(arg0.aByte24, arg0.aShort42, this.anInt5586, (long) arg0.aByte25);
	}
}
