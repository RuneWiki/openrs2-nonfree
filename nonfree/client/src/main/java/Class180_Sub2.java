import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public final class Class180_Sub2 extends Class180 implements Interface4 {

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
	private int anInt6760;

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
	private int anInt6761;

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lclient!bf;I[BI)V", line = 3)
	public Class180_Sub2(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt6760 = arg1;
		this.anInt6761 = this.aClass19_Sub1_39.method798(this.anInt6760);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(III)V", line = 10)
	@Override
	public void method6066(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass19_Sub1_39.anOpengl1.glDrawElements(4, arg1, this.anInt6760, this.aByteBuffer7.position(arg0 * this.anInt6761));
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "()I", line = 13)
	@Override
	public int method6067() {
		return 0;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(I[BI)V", line = 16)
	@Override
	public void method6068(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method6065(arg0, arg1);
		this.anInt6760 = 5123;
		this.anInt6761 = this.aClass19_Sub1_39.method798(this.anInt6760);
	}
}
