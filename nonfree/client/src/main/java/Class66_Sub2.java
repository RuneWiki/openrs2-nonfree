import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public final class Class66_Sub2 extends Class66 implements Interface27 {

	@OriginalMember(owner = "client!dw", name = "e", descriptor = "I")
	private int anInt2906;

	@OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(Lclient!eq;I[BI)V")
	public Class66_Sub2(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt2906 = arg1;
	}

	@OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(Lclient!eq;ILclient!jaclib/memory/Buffer;)V")
	public Class66_Sub2(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2) {
		super(arg0, arg2);
		this.anInt2906 = arg1;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(I)I")
	@Override
	public int method8095() {
		return 0;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "([BBII)V")
	@Override
	public void method8092(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method2687(arg0, arg1);
		this.anInt2906 = arg2;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Z)J")
	@Override
	public long method8093() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(B)I")
	@Override
	public int method8094() {
		return this.anInt2906;
	}
}
