import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public final class Class79_Sub2 extends Class79 implements Interface3 {

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lclient!gf;Z)V")
	public Class79_Sub2(@OriginalArg(0) Class5_Sub3_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		super(arg0, 34962, arg1);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method3136() {
		return super.method3136();
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z)V")
	@Override
	public void method3138() {
		super.method3138();
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!jaclib/memory/Source;III)Z")
	@Override
	public boolean method2578(@OriginalArg(0) Source arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		super.method2334(arg0, arg2);
		return true;
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)I")
	@Override
	public int method3133() {
		return super.method3133();
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(III)Z")
	@Override
	public boolean method2580(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.method3137(arg1);
		return true;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method3135() {
		return this.method3135();
	}
}
