import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oga")
public final class Class53_Sub2 extends Class53 implements Interface9 {

	@OriginalMember(owner = "client!oga", name = "m", descriptor = "I")
	private int anInt7612;

	@OriginalMember(owner = "client!oga", name = "<init>", descriptor = "(Lclient!nv;I[BI)V")
	public Class53_Sub2(@OriginalArg(0) Class16_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt7612 = arg1;
	}

	@OriginalMember(owner = "client!oga", name = "<init>", descriptor = "(Lclient!nv;ILclient!jaclib/memory/Buffer;)V")
	public Class53_Sub2(@OriginalArg(0) Class16_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2) {
		super(arg0, arg2);
		this.anInt7612 = arg1;
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(I[BII)V")
	@Override
	public void method6286(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		this.method6285(arg1, arg2);
		this.anInt7612 = arg0;
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(B)I")
	@Override
	public int method6287() {
		return 0;
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(I)J")
	@Override
	public long method6288() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(Z)I")
	@Override
	public int method6289() {
		return this.anInt7612;
	}
}
