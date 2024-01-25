import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qca")
public final class Class11_Sub2 extends Class11 implements Interface9 {

	@OriginalMember(owner = "client!qca", name = "D", descriptor = "Lclient!ps;")
	private final Class254 aClass254_19;

	@OriginalMember(owner = "client!qca", name = "<init>", descriptor = "(Lclient!mc;Lclient!ps;Z)V")
	public Class11_Sub2(@OriginalArg(0) Class90_Sub3_Sub1 arg0, @OriginalArg(1) Class254 arg1, @OriginalArg(2) boolean arg2) {
		super(arg0, 34963, arg2);
		this.aClass254_19 = arg1;
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method6460() {
		return super.method6460();
	}

	@OriginalMember(owner = "client!qca", name = "b", descriptor = "(I)Lclient!ps;")
	@Override
	public Class254 method5937() {
		return this.aClass254_19;
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(Z)I")
	@Override
	public int method6458() {
		return super.method6458();
	}

	@OriginalMember(owner = "client!qca", name = "b", descriptor = "(Z)V")
	@Override
	public void method6461() {
		super.method6461();
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(IB)V")
	@Override
	public void method5935(@OriginalArg(0) int arg0) {
		super.method5935(this.aClass254_19.anInt7322 * arg0);
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(BZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method6462() {
		return super.method6462();
	}
}
