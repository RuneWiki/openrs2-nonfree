import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!saa")
public final class Class322_Sub1 extends Class322 implements Interface11 {

	@OriginalMember(owner = "client!saa", name = "e", descriptor = "I")
	private int anInt8302;

	@OriginalMember(owner = "client!saa", name = "<init>", descriptor = "(Lclient!pc;I[BI)V")
	public Class322_Sub1(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt8302 = arg1;
	}

	@OriginalMember(owner = "client!saa", name = "<init>", descriptor = "(Lclient!pc;ILclient!jaclib/memory/Buffer;)V")
	public Class322_Sub1(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2) {
		super(arg0, arg2);
		this.anInt8302 = arg1;
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(B)J")
	@Override
	public long method7228() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!saa", name = "b", descriptor = "(I)I")
	@Override
	public int method7227() {
		return this.anInt8302;
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(III[B)V")
	@Override
	public void method7229(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		this.method8373(arg2, arg0);
		this.anInt8302 = arg1;
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(I)I")
	@Override
	public int method7226() {
		return 0;
	}
}
