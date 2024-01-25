import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public final class Class93_Sub2 extends Class93 implements Interface9 {

	@OriginalMember(owner = "client!gt", name = "D", descriptor = "Lclient!pj;")
	private final Class278 aClass278_8;

	@OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(Lclient!rda;Lclient!pj;Z)V")
	public Class93_Sub2(@OriginalArg(0) Class57_Sub3_Sub1 arg0, @OriginalArg(1) Class278 arg1, @OriginalArg(2) boolean arg2) {
		super(arg0, 34963, arg2);
		this.aClass278_8 = arg1;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)I")
	@Override
	public int method2915() {
		return super.method2915();
	}

	@OriginalMember(owner = "client!gt", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method2927() {
		return super.method2919(super.aClass57_Sub3_Sub1_7.aMapBuffer1);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Z)V")
	@Override
	public void method2921() {
		super.method2921();
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(ZB)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method2926() {
		return super.method2918(super.aClass57_Sub3_Sub1_7.aMapBuffer1);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(II)V")
	@Override
	public void method2925(@OriginalArg(0) int arg0) {
		super.method2925(this.aClass278_8.anInt7757 * arg0);
	}

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "(I)Lclient!pj;")
	@Override
	public Class278 method2928() {
		return this.aClass278_8;
	}
}
