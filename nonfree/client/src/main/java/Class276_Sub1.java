import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ow")
public final class Class276_Sub1 extends Class276 implements Interface17 {

	@OriginalMember(owner = "client!ow", name = "d", descriptor = "I")
	private int anInt7284;

	@OriginalMember(owner = "client!ow", name = "<init>", descriptor = "(Lclient!vf;I[BI)V")
	public Class276_Sub1(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt7284 = arg1;
	}

	@OriginalMember(owner = "client!ow", name = "<init>", descriptor = "(Lclient!vf;ILclient!jaclib/memory/Buffer;)V")
	public Class276_Sub1(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2) {
		super(arg0, arg2);
		this.anInt7284 = arg1;
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(B)I")
	@Override
	public int method8311() {
		return this.anInt7284;
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(I)J")
	@Override
	public long method8312() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!ow", name = "b", descriptor = "(B)I")
	@Override
	public int method8310() {
		return 0;
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(I[BII)V")
	@Override
	public void method8313(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method7651(arg1, arg0);
		this.anInt7284 = arg2;
	}
}
