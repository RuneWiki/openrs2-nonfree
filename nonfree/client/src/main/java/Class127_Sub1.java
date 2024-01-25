import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public final class Class127_Sub1 extends Class127 implements Interface11 {

	@OriginalMember(owner = "client!gd", name = "v", descriptor = "Lclient!wha;")
	private final Class381 aClass381_3;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Lclient!tk;Lclient!wha;Z)V")
	public Class127_Sub1(@OriginalArg(0) Class13_Sub3_Sub1 arg0, @OriginalArg(1) Class381 arg1, @OriginalArg(2) boolean arg2) {
		super(arg0, 34963, arg2);
		this.aClass381_3 = arg1;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method7409() {
		return super.method6784(super.aClass13_Sub3_Sub1_9.aMapBuffer1);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method7405() {
		return super.method6791(super.aClass13_Sub3_Sub1_9.aMapBuffer1);
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)Lclient!wha;")
	@Override
	public Class381 method7408() {
		return this.aClass381_3;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V")
	@Override
	public void method8446() {
		super.method8446();
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)V")
	@Override
	public void method7407(@OriginalArg(0) int arg0) {
		super.method7407(arg0 * this.aClass381_3.anInt10306);
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)I")
	@Override
	public int method8445() {
		return super.method8445();
	}
}
