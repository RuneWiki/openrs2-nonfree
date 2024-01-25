import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public final class Class58_Sub2 extends Class58 implements Interface13 {

	@OriginalMember(owner = "client!sh", name = "B", descriptor = "Lclient!vea;")
	private final Class340 aClass340_9;

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Lclient!qi;Lclient!vea;Z)V")
	public Class58_Sub2(@OriginalArg(0) Class12_Sub2_Sub2 arg0, @OriginalArg(1) Class340 arg1, @OriginalArg(2) boolean arg2) {
		super(arg0, 34963, arg2);
		this.aClass340_9 = arg1;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method7652() {
		return super.method6745(super.aClass12_Sub2_Sub2_10.aMapBuffer1);
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)I")
	@Override
	public int method7647() {
		return super.method7647();
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)Lclient!vea;")
	@Override
	public Class340 method7649() {
		return this.aClass340_9;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(ZB)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method7648() {
		return super.method6752(super.aClass12_Sub2_Sub2_10.aMapBuffer1);
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)V")
	@Override
	public void method7650(@OriginalArg(0) int arg0) {
		super.method7650(arg0 * this.aClass340_9.anInt9068);
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(B)V")
	@Override
	public void method7651() {
		super.method7651();
	}
}
