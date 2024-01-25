import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public final class Class292_Sub2 extends Class292 implements Interface8 {

	@OriginalMember(owner = "client!wm", name = "e", descriptor = "I")
	private int anInt10408;

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(Lclient!kv;I[BI)V")
	public Class292_Sub2(@OriginalArg(0) Class143_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt10408 = arg1;
	}

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(Lclient!kv;ILclient!jaclib/memory/Buffer;)V")
	public Class292_Sub2(@OriginalArg(0) Class143_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2) {
		super(arg0, arg2);
		this.anInt10408 = arg1;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(B)J")
	@Override
	public long method8686() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "(Z)I")
	@Override
	public int method8687() {
		return this.anInt10408;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Z)I")
	@Override
	public int method8685() {
		return 0;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "([BIII)V")
	@Override
	public void method8688(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method8684(arg0, arg1);
		this.anInt10408 = arg2;
	}
}
