import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public final class Class130_Sub1 extends Class130 implements Interface14 {

	@OriginalMember(owner = "client!gh", name = "f", descriptor = "I")
	private int anInt3669;

	@OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(Lclient!bi;I[BI)V")
	public Class130_Sub1(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt3669 = arg1;
	}

	@OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(Lclient!bi;ILclient!jaclib/memory/Buffer;)V")
	public Class130_Sub1(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2) {
		super(arg0, arg2);
		this.anInt3669 = arg1;
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)I")
	@Override
	public int method4795() {
		return 0;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Z)J")
	@Override
	public long method4796() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(II[BB)V")
	@Override
	public void method4793(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.method4611(arg2, arg1);
		this.anInt3669 = arg0;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)I")
	@Override
	public int method4794() {
		return this.anInt3669;
	}
}
