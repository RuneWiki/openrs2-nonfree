import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public final class Class232_Sub2 extends Class232 implements Interface9 {

	@OriginalMember(owner = "client!on", name = "j", descriptor = "I")
	private int anInt7544;

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Lclient!oea;I[BI)V")
	public Class232_Sub2(@OriginalArg(0) Class87_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt7544 = arg1;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(B)J")
	@Override
	public long method6317() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(I)I")
	@Override
	public int method6316() {
		return this.anInt7544;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Z)I")
	@Override
	public int method6315() {
		return 0;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(III[B)V")
	@Override
	public void method6318(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		this.method6314(arg1, arg0);
		this.anInt7544 = 5123;
	}
}
