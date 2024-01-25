import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fka")
public final class Class127_Sub1 extends Class127 implements Interface26 {

	@OriginalMember(owner = "client!fka", name = "f", descriptor = "I")
	private int anInt3071;

	@OriginalMember(owner = "client!fka", name = "<init>", descriptor = "(Lclient!hk;ILclient!jaclib/memory/Buffer;)V")
	public Class127_Sub1(@OriginalArg(0) Class16_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2) {
		super(arg0, arg2);
		this.anInt3071 = arg1;
	}

	@OriginalMember(owner = "client!fka", name = "<init>", descriptor = "(Lclient!hk;I[BI)V")
	public Class127_Sub1(@OriginalArg(0) Class16_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt3071 = arg1;
	}

	@OriginalMember(owner = "client!fka", name = "c", descriptor = "(B)I")
	@Override
	public int method5258() {
		return 0;
	}

	@OriginalMember(owner = "client!fka", name = "b", descriptor = "(B)J")
	@Override
	public long method5256() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!fka", name = "a", descriptor = "(B)I")
	@Override
	public int method5255() {
		return this.anInt3071;
	}

	@OriginalMember(owner = "client!fka", name = "a", descriptor = "([BIII)V")
	@Override
	public void method5257(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method7363(arg0, arg2);
		this.anInt3071 = arg1;
	}
}
