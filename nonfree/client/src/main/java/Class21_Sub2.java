import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public final class Class21_Sub2 extends Class21 implements Interface22 {

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "I")
	private int anInt9056;

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(Lclient!kga;I[BI)V")
	public Class21_Sub2(@OriginalArg(0) Class44_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt9056 = arg1;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)J")
	@Override
	public long method7398() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "([BIII)V")
	@Override
	public void method7399(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		this.method7397(arg0, arg1);
		this.anInt9056 = 5123;
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(B)I")
	@Override
	public int method7401() {
		return 0;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)I")
	@Override
	public int method7400() {
		return this.anInt9056;
	}
}
