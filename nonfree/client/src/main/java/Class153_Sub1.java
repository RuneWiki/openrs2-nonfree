import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iia")
public final class Class153_Sub1 extends Class153 implements Interface26 {

	@OriginalMember(owner = "client!iia", name = "e", descriptor = "I")
	private int anInt3884;

	@OriginalMember(owner = "client!iia", name = "<init>", descriptor = "(Lclient!ep;I[BI)V")
	public Class153_Sub1(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt3884 = arg1;
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(I)J")
	@Override
	public long method5672() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!iia", name = "b", descriptor = "(I)I")
	@Override
	public int method5673() {
		return this.anInt3884;
	}

	@OriginalMember(owner = "client!iia", name = "c", descriptor = "(I)I")
	@Override
	public int method5674() {
		return 0;
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "([BIII)V")
	@Override
	public void method5675(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method4703(arg0, arg1);
		this.anInt3884 = 5123;
	}
}
