import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wga")
public final class Class239_Sub2 extends Class239 implements Interface3 {

	@OriginalMember(owner = "client!wga", name = "p", descriptor = "I")
	private int anInt10060;

	@OriginalMember(owner = "client!wga", name = "<init>", descriptor = "(Lclient!dw;I[BIZ)V")
	public Class239_Sub2(@OriginalArg(0) Class82_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt10060 = arg1;
	}

	@OriginalMember(owner = "client!wga", name = "<init>", descriptor = "(Lclient!dw;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class239_Sub2(@OriginalArg(0) Class82_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt10060 = arg1;
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(Z)V")
	@Override
	protected void method8525() {
		super.aClass82_Sub1_43.method2096(this);
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(I)I")
	@Override
	public int method8528() {
		return this.anInt10060;
	}

	@OriginalMember(owner = "client!wga", name = "b", descriptor = "(B)J")
	@Override
	public long method8531() {
		return 0L;
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(III[B)V")
	@Override
	public void method8530(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		this.method8526(arg2, arg0);
		this.anInt10060 = arg1;
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(B)I")
	@Override
	public int method8529() {
		return super.anInt10053;
	}
}
