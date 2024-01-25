import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public final class Class12_Sub1 extends Class12 implements Interface1 {

	@OriginalMember(owner = "client!aq", name = "d", descriptor = "I")
	private int anInt321;

	@OriginalMember(owner = "client!aq", name = "c", descriptor = "I")
	private int anInt320;

	@OriginalMember(owner = "client!aq", name = "<init>", descriptor = "(Lclient!mm;I[BI)V")
	public Class12_Sub1(@OriginalArg(0) Class55_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt321 = arg1;
		this.anInt320 = this.aClass55_Sub1_9.method3687(this.anInt321);
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method5665(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method657(arg0, arg1);
		this.anInt321 = 5123;
		this.anInt320 = this.aClass55_Sub1_9.method3687(this.anInt321);
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "()I")
	@Override
	public int method5663() {
		return 0;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(III)V")
	@Override
	public void method5666(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass55_Sub1_9.anOpengl1.glDrawElements(4, arg1, this.anInt321, this.aByteBuffer3.position(arg0 * this.anInt320));
	}
}
