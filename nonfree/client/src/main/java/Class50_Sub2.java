import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public final class Class50_Sub2 extends Class50 implements Interface8 {

	@OriginalMember(owner = "client!h", name = "c", descriptor = "I")
	private int anInt2504;

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "(Lclient!ao;I[BI)V")
	public Class50_Sub2(@OriginalArg(0) Class4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt2504 = arg1;
	}

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "(Lclient!ao;ILjava/nio/ByteBuffer;)V")
	public Class50_Sub2(@OriginalArg(0) Class4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) ByteBuffer arg2) {
		super(arg0, arg2);
		this.anInt2504 = arg1;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "()I")
	@Override
	public int method4970() {
		return 0;
	}

	@OriginalMember(owner = "client!h", name = "d", descriptor = "(Lclient!hf;)V")
	@Override
	public void method4976(@OriginalArg(0) Class81 arg0) {
		this.aClass4_Sub1_12.anOpengl1.glVertexPointer(arg0.aByte24, arg0.aShort42, this.anInt2504, this.aByteBuffer3.position(arg0.aByte25));
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!hf;)V")
	@Override
	public void method4973(@OriginalArg(0) Class81 arg0) {
		this.aClass4_Sub1_12.anOpengl1.glNormalPointer(arg0.aShort42, this.anInt2504, this.aByteBuffer3.position(arg0.aByte25));
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(Lclient!hf;)V")
	@Override
	public void method4975(@OriginalArg(0) Class81 arg0) {
		this.aClass4_Sub1_12.anOpengl1.glTexCoordPointer(arg0.aByte24, arg0.aShort42, this.anInt2504, this.aByteBuffer3.position(arg0.aByte25));
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method4972(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method2427(arg1, arg2);
		this.anInt2504 = arg0;
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(Lclient!hf;)V")
	@Override
	public void method4974(@OriginalArg(0) Class81 arg0) {
		this.aClass4_Sub1_12.anOpengl1.glColorPointer(arg0.aByte24, arg0.aShort42, this.anInt2504, this.aByteBuffer3.position(arg0.aByte25));
	}
}
