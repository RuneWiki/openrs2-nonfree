import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public final class Class232_Sub1 extends Class232 implements Interface23 {

	@OriginalMember(owner = "client!ng", name = "d", descriptor = "I")
	private int anInt6713;

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lclient!oea;ILclient!jaclib/memory/Buffer;)V")
	public Class232_Sub1(@OriginalArg(0) Class87_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2) {
		super(arg0, arg2);
		this.anInt6713 = arg1;
	}

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lclient!oea;I[BI)V")
	public Class232_Sub1(@OriginalArg(0) Class87_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt6713 = arg1;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)I")
	@Override
	public int method5651() {
		return 0;
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(B)J")
	@Override
	public long method5653() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIB[B)V")
	@Override
	public void method5652(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		this.method6314(arg2, arg1);
		this.anInt6713 = arg0;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Z)I")
	@Override
	public int method5654() {
		return this.anInt6713;
	}
}
