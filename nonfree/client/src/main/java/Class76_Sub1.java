import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eba")
public final class Class76_Sub1 extends Class76 implements Interface13 {

	@OriginalMember(owner = "client!eba", name = "<init>", descriptor = "(Lclient!el;Z)V")
	public Class76_Sub1(@OriginalArg(0) Class14_Sub2_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		super(arg0, 34962, arg1);
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(I)V")
	@Override
	public void method4091() {
		super.method4091();
	}

	@OriginalMember(owner = "client!eba", name = "b", descriptor = "(I)I")
	@Override
	public int method4087() {
		return super.method4087();
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(ZZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method4095() {
		return super.method4095();
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method4094() {
		return super.method4094();
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(ILclient!jaclib/memory/Source;II)Z")
	@Override
	public boolean method1883(@OriginalArg(1) Source arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		super.method4089(arg2, arg0);
		return true;
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(IBI)Z")
	@Override
	public boolean method1884(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.method4092(arg1);
		return true;
	}
}
