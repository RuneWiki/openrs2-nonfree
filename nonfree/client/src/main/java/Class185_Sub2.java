import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public final class Class185_Sub2 extends Class185 implements Interface19 {

	@OriginalMember(owner = "client!se", name = "v", descriptor = "Lclient!wq;")
	private final Class376 aClass376_11;

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "(Lclient!mba;Lclient!wq;Z)V")
	public Class185_Sub2(@OriginalArg(0) Class5_Sub1_Sub2 arg0, @OriginalArg(1) Class376 arg1, @OriginalArg(2) boolean arg2) {
		super(arg0, 34963, arg2);
		this.aClass376_11 = arg1;
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(I)Lclient!wq;")
	@Override
	public Class376 method7983() {
		return this.aClass376_11;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V")
	@Override
	public void method7982() {
		super.method7982();
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IB)V")
	@Override
	public void method7981(@OriginalArg(0) int arg0) {
		super.method7981(arg0 * this.aClass376_11.anInt10167);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ZB)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method7984() {
		return super.method7644(super.aClass5_Sub1_Sub2_12.aMapBuffer1);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Z)I")
	@Override
	public int method7980() {
		return super.method7980();
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7985() {
		return super.method7651(super.aClass5_Sub1_Sub2_12.aMapBuffer1);
	}
}
