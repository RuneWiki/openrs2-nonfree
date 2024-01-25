import jaclib.memory.Buffer;
import java.util.BitSet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sha")
public final class Class49_Sub2 extends Class49 implements Interface24 {

	@OriginalMember(owner = "client!sha", name = "i", descriptor = "I")
	private int anInt9537;

	static {
		new BitSet(65536);
	}

	@OriginalMember(owner = "client!sha", name = "<init>", descriptor = "(Lclient!gia;ILclient!jaclib/memory/Buffer;)V")
	public Class49_Sub2(@OriginalArg(0) Class67_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2) {
		super(arg0, arg2);
		this.anInt9537 = arg1;
	}

	@OriginalMember(owner = "client!sha", name = "<init>", descriptor = "(Lclient!gia;I[BI)V")
	public Class49_Sub2(@OriginalArg(0) Class67_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt9537 = arg1;
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(Z)I")
	@Override
	public int method9136() {
		return 0;
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(I[BII)V")
	@Override
	public void method9135(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		this.method8036(arg1, arg0);
		this.anInt9537 = arg2;
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(I)I")
	@Override
	public int method9138() {
		return this.anInt9537;
	}

	@OriginalMember(owner = "client!sha", name = "b", descriptor = "(I)J")
	@Override
	public long method9137() {
		return super.aBuffer3.getAddress();
	}
}
