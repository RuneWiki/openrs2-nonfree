import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public final class Class86_Sub1 extends Class86 implements Interface12 {

	@OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
	private int anInt2940;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lclient!pi;ILclient!jaclib/memory/Buffer;)V")
	public Class86_Sub1(@OriginalArg(0) Class144_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2) {
		super(arg0, arg2);
		this.anInt2940 = arg1;
	}

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lclient!pi;I[BI)V")
	public Class86_Sub1(@OriginalArg(0) Class144_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt2940 = arg1;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "([BIII)V")
	@Override
	public void method5812(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.method8715(arg0, arg2);
		this.anInt2940 = arg1;
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(B)I")
	@Override
	public int method5811() {
		return this.anInt2940;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)I")
	@Override
	public int method5813() {
		return 0;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)J")
	@Override
	public long method5810() {
		return super.aBuffer3.getAddress();
	}
}
