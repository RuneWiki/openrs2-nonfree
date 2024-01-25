import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public final class Class262_Sub1 extends Class262 implements Interface11 {

	@OriginalMember(owner = "client!rb", name = "y", descriptor = "Lclient!eea;")
	private final Class82 aClass82_19;

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Lclient!mc;Lclient!eea;Z)V")
	public Class262_Sub1(@OriginalArg(0) Class121_Sub2_Sub1 arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(2) boolean arg2) {
		super(arg0, 34963, arg2);
		this.aClass82_19 = arg1;
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(B)Lclient!eea;")
	@Override
	public Class82 method6271() {
		return this.aClass82_19;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZB)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method7569() {
		return super.method7569();
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)V")
	@Override
	public void method7560(@OriginalArg(0) int arg0) {
		super.method7560(arg0 * this.aClass82_19.anInt2007);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method7563() {
		return super.method7563();
	}

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "(B)I")
	@Override
	public int method7559() {
		return super.method7559();
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)V")
	@Override
	public void method7567() {
		super.method7567();
	}
}
