import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public final class Class201_Sub2 extends Class201 implements Interface10 {

	@OriginalMember(owner = "client!ps", name = "v", descriptor = "I")
	private int anInt7762;

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(Lclient!kga;I[BIZ)V")
	public Class201_Sub2(@OriginalArg(0) Class44_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt7762 = arg1;
	}

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(Lclient!kga;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class201_Sub2(@OriginalArg(0) Class44_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt7762 = arg1;
	}

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "(I)I")
	@Override
	public int method6469() {
		return super.anInt7748;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(B)J")
	@Override
	public long method6467() {
		return 0L;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(Z)V")
	@Override
	protected void method6465() {
		super.aClass44_Sub3_32.method4620(this);
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(I)I")
	@Override
	public int method6466() {
		return this.anInt7762;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(I[BII)V")
	@Override
	public void method6468(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method6460(arg0, arg1);
		this.anInt7762 = arg2;
	}
}
