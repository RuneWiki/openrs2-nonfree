import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public final class Class168_Sub1 extends Class168 implements Interface14 {

	@OriginalMember(owner = "client!qq", name = "e", descriptor = "I")
	private int anInt7677;

	@OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Lclient!gi;ILclient!jaclib/memory/Buffer;)V")
	public Class168_Sub1(@OriginalArg(0) Class42_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2) {
		super(arg0, arg2);
		this.anInt7677 = arg1;
	}

	@OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Lclient!gi;I[BI)V")
	public Class168_Sub1(@OriginalArg(0) Class42_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt7677 = arg1;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(I[BII)V")
	@Override
	public void method6394(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method7243(arg1, arg0);
		this.anInt7677 = arg2;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Z)J")
	@Override
	public long method6392() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(I)I")
	@Override
	public int method6393() {
		return 0;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(I)I")
	@Override
	public int method6391() {
		return this.anInt7677;
	}
}
