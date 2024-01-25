import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public final class Class135_Sub1 extends Class135 implements Interface15 {

	@OriginalMember(owner = "client!ho", name = "e", descriptor = "I")
	private int anInt3874;

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Lclient!en;I[BI)V")
	public Class135_Sub1(@OriginalArg(0) Class90_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt3874 = arg1;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)I")
	@Override
	public int method3356() {
		return this.anInt3874;
	}

	@OriginalMember(owner = "client!ho", name = "c", descriptor = "(I)I")
	@Override
	public int method3359() {
		return 0;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(I[BII)V")
	@Override
	public void method3357(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.method3463(arg1, arg0);
		this.anInt3874 = 5123;
	}

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "(I)J")
	@Override
	public long method3358() {
		return super.aBuffer3.getAddress();
	}
}
