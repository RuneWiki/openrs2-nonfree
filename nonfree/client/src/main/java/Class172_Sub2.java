import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sga")
public final class Class172_Sub2 extends Class172 implements Interface13 {

	@OriginalMember(owner = "client!sga", name = "f", descriptor = "I")
	private int anInt9145;

	@OriginalMember(owner = "client!sga", name = "<init>", descriptor = "(Lclient!uja;I[BI)V")
	public Class172_Sub2(@OriginalArg(0) Class145_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt9145 = arg1;
	}

	@OriginalMember(owner = "client!sga", name = "<init>", descriptor = "(Lclient!uja;ILclient!jaclib/memory/Buffer;)V")
	public Class172_Sub2(@OriginalArg(0) Class145_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2) {
		super(arg0, arg2);
		this.anInt9145 = arg1;
	}

	@OriginalMember(owner = "client!sga", name = "b", descriptor = "(B)I")
	@Override
	public int method8069() {
		return 0;
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(II[BI)V")
	@Override
	public void method8068(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		this.method8066(arg1, arg2);
		this.anInt9145 = arg0;
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(B)I")
	@Override
	public int method8067() {
		return this.anInt9145;
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(I)J")
	@Override
	public long method8070() {
		return super.aBuffer3.getAddress();
	}
}
