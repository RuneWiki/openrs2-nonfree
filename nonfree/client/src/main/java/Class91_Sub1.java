import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public final class Class91_Sub1 extends Class91 implements Interface20 {

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Lclient!nfa;Z)V")
	public Class91_Sub1(@OriginalArg(0) Class9_Sub3_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		super(arg0, 34962, arg1);
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(III)Z")
	@Override
	public boolean method6523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.method5022(arg0);
		return true;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Lclient!jaclib/memory/Source;IBI)Z")
	@Override
	public boolean method6522(@OriginalArg(0) Source arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		super.method4636(arg0, arg2);
		return true;
	}

	@OriginalMember(owner = "client!em", name = "b", descriptor = "(B)V")
	@Override
	public void method6520() {
		super.method6520();
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(B)I")
	@Override
	public int method6519() {
		return super.method6519();
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method6521() {
		return super.method6521();
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method6524() {
		return super.method6524();
	}
}
