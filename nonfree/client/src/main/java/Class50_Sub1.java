import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public final class Class50_Sub1 extends Class50 implements Interface1 {

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "I")
	private int anInt1542;

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "I")
	private int anInt1543;

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lclient!ao;I[BI)V")
	public Class50_Sub1(@OriginalArg(0) Class4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt1542 = arg1;
		this.anInt1543 = this.aClass4_Sub1_12.method552(this.anInt1542);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(III)V")
	@Override
	public void method4323(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass4_Sub1_12.anOpengl1.glDrawElements(4, arg1, this.anInt1542, this.aByteBuffer3.position(arg0 * this.anInt1543));
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "()I")
	@Override
	public int method4970() {
		return 0;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method4322(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method2427(arg0, arg1);
		this.anInt1542 = 5123;
		this.anInt1543 = this.aClass4_Sub1_12.method552(this.anInt1542);
	}
}
