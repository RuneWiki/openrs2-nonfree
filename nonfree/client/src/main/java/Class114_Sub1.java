import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public final class Class114_Sub1 extends Class114 implements Interface16 {

	@OriginalMember(owner = "client!fv", name = "n", descriptor = "I")
	private int anInt3275;

	@OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(Lclient!kfa;I[BI)V")
	public Class114_Sub1(@OriginalArg(0) Class7_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt3275 = arg1;
	}

	@OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(Lclient!kfa;ILclient!jaclib/memory/Buffer;)V")
	public Class114_Sub1(@OriginalArg(0) Class7_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2) {
		super(arg0, arg2);
		this.anInt3275 = arg1;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "([BIII)V")
	@Override
	public void method6365(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.method4145(arg0, arg2);
		this.anInt3275 = arg1;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(B)J")
	@Override
	public long method6368() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "(I)I")
	@Override
	public int method6367() {
		return this.anInt3275;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(I)I")
	@Override
	public int method6366() {
		return 0;
	}
}
