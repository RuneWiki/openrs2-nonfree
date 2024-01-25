import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public final class Class17_Sub2 extends Class17 implements Interface8 {

	@OriginalMember(owner = "client!cs", name = "B", descriptor = "Lclient!ne;")
	private final Class239 aClass239_2;

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lclient!dc;Lclient!ne;Z)V")
	public Class17_Sub2(@OriginalArg(0) Class66_Sub1_Sub1 arg0, @OriginalArg(1) Class239 arg1, @OriginalArg(2) boolean arg2) {
		super(arg0, 34963, arg2);
		this.aClass239_2 = arg1;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(BZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method7149() {
		return super.method7149();
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(B)V")
	@Override
	public void method7146() {
		super.method7146();
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7150() {
		return super.method7150();
	}

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "(B)Lclient!ne;")
	@Override
	public Class239 method7147() {
		return this.aClass239_2;
	}

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "(I)I")
	@Override
	public int method7145() {
		return super.method7145();
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(II)V")
	@Override
	public void method7148(@OriginalArg(1) int arg0) {
		super.method7148(this.aClass239_2.anInt6113 * arg0);
	}
}
