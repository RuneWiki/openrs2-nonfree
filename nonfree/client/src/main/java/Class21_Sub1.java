import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public final class Class21_Sub1 extends Class21 implements Interface5 {

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "I")
	private int anInt346;

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "I")
	private int anInt345;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lclient!nm;I[BI)V")
	public Class21_Sub1(@OriginalArg(0) Class164_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt346 = arg1;
		this.anInt345 = this.aClass164_Sub1_8.method3592(this.anInt346);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "()I")
	@Override
	public int method3103() {
		return 0;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(III)V")
	@Override
	public void method3104(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass164_Sub1_8.anOpengl1.glDrawElements(4, arg1, this.anInt346, this.aByteBuffer3.position(arg0 * this.anInt345));
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method3105(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method840(arg0, arg1);
		this.anInt346 = 5123;
		this.anInt345 = this.aClass164_Sub1_8.method3592(this.anInt346);
	}
}
