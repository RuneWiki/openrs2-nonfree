import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public final class Class91_Sub2 extends Class91 implements Interface21 {

	@OriginalMember(owner = "client!ks", name = "B", descriptor = "Lclient!nb;")
	private final Class220 aClass220_5;

	@OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(Lclient!nfa;Lclient!nb;Z)V")
	public Class91_Sub2(@OriginalArg(0) Class9_Sub3_Sub2 arg0, @OriginalArg(1) Class220 arg1, @OriginalArg(2) boolean arg2) {
		super(arg0, 34963, arg2);
		this.aClass220_5 = arg1;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method6524() {
		return super.method6524();
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(B)V")
	@Override
	public void method6520() {
		super.method6520();
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(B)I")
	@Override
	public int method6519() {
		return super.method6519();
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(II)V")
	@Override
	public void method5022(@OriginalArg(1) int arg0) {
		super.method5022(arg0 * this.aClass220_5.anInt6224);
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method6521() {
		return super.method6521();
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(I)Lclient!nb;")
	@Override
	public Class220 method5021() {
		return this.aClass220_5;
	}
}
