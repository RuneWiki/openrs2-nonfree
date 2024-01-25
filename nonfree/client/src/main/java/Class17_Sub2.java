import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uda")
public final class Class17_Sub2 extends Class17 implements Interface9 {

	@OriginalMember(owner = "client!uda", name = "j", descriptor = "I")
	private int anInt9610;

	@OriginalMember(owner = "client!uda", name = "<init>", descriptor = "(Lclient!dia;I[BI)V")
	public Class17_Sub2(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt9610 = arg1;
	}

	@OriginalMember(owner = "client!uda", name = "<init>", descriptor = "(Lclient!dia;ILclient!jaclib/memory/Buffer;)V")
	public Class17_Sub2(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2) {
		super(arg0, arg2);
		this.anInt9610 = arg1;
	}

	@OriginalMember(owner = "client!uda", name = "b", descriptor = "(I)I")
	@Override
	public int method8394() {
		return 0;
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(B)I")
	@Override
	public int method8392() {
		return this.anInt9610;
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(I)J")
	@Override
	public long method8393() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "([BIII)V")
	@Override
	public void method8391(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.method8390(arg0, arg2);
		this.anInt9610 = arg1;
	}
}
