import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public final class Class28_Sub1 extends Class28 implements Interface5 {

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "I")
	private int anInt980;

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Lclient!us;I[BI)V")
	public Class28_Sub1(@OriginalArg(0) Class43_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt980 = arg1;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Z)I")
	@Override
	public int method6872() {
		return this.anInt980;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)J")
	@Override
	public long method6871() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(I[BII)V")
	@Override
	public void method6870(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method6579(arg0, arg1);
		this.anInt980 = 5123;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)I")
	@Override
	public int method6873() {
		return 0;
	}
}
