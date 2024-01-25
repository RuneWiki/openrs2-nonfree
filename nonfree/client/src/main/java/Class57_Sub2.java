import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vca")
public final class Class57_Sub2 extends Class57 implements Interface18 {

	@OriginalMember(owner = "client!vca", name = "M", descriptor = "Lclient!ge;")
	private final Class114 aClass114_20;

	@OriginalMember(owner = "client!vca", name = "<init>", descriptor = "(Lclient!pi;Lclient!ge;Z)V")
	public Class57_Sub2(@OriginalArg(0) Class42_Sub1_Sub2 arg0, @OriginalArg(1) Class114 arg1, @OriginalArg(2) boolean arg2) {
		super(arg0, 34963, arg2);
		this.aClass114_20 = arg1;
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(B)V")
	@Override
	public void method7898() {
		super.method7898();
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(I)I")
	@Override
	public int method7894() {
		return super.method7894();
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method7895() {
		return super.method7895();
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(II)V")
	@Override
	public void method7529(@OriginalArg(1) int arg0) {
		super.method7529(arg0 * this.aClass114_20.anInt3379);
	}

	@OriginalMember(owner = "client!vca", name = "b", descriptor = "(I)Lclient!ge;")
	@Override
	public Class114 method7540() {
		return this.aClass114_20;
	}

	@OriginalMember(owner = "client!vca", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7899() {
		return super.method7899();
	}
}
