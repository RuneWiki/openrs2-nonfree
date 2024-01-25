import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public final class Class23_Sub2 extends Class23 implements Interface1 {

	@OriginalMember(owner = "client!et", name = "c", descriptor = "I")
	private int anInt1822;

	@OriginalMember(owner = "client!et", name = "d", descriptor = "I")
	private int anInt1823;

	@OriginalMember(owner = "client!et", name = "<init>", descriptor = "(Lclient!ks;I[BI)V")
	public Class23_Sub2(@OriginalArg(0) Class63_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt1822 = arg1;
		this.anInt1823 = this.aClass63_Sub1_17.method3368(this.anInt1822);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "()I")
	@Override
	public int method5379() {
		return 0;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method2055(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method1743(arg0, arg1);
		this.anInt1822 = 5123;
		this.anInt1823 = this.aClass63_Sub1_17.method3368(this.anInt1822);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(III)V")
	@Override
	public void method2056(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass63_Sub1_17.anOpengl1.glDrawElements(4, arg1, this.anInt1822, this.aByteBuffer5.position(arg0 * this.anInt1823));
	}
}
