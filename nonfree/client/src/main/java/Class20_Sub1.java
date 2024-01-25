import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public final class Class20_Sub1 extends Class20 implements Interface10 {

	@OriginalMember(owner = "client!at", name = "c", descriptor = "I")
	private int anInt432;

	@OriginalMember(owner = "client!at", name = "<init>", descriptor = "(Lclient!no;I[BI)V")
	public Class20_Sub1(@OriginalArg(0) Class66_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt432 = arg1;
	}

	@OriginalMember(owner = "client!at", name = "<init>", descriptor = "(Lclient!no;ILclient!jaclib/memory/Buffer;)V")
	public Class20_Sub1(@OriginalArg(0) Class66_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2) {
		super(arg0, arg2);
		this.anInt432 = arg1;
	}

	@OriginalMember(owner = "client!at", name = "b", descriptor = "(I)J")
	@Override
	public long method5607() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(I)I")
	@Override
	public int method5606() {
		return 0;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "([BIII)V")
	@Override
	public void method5605(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method3000(arg0, arg2);
		this.anInt432 = arg1;
	}

	@OriginalMember(owner = "client!at", name = "c", descriptor = "(I)I")
	@Override
	public int method5608() {
		return this.anInt432;
	}
}
