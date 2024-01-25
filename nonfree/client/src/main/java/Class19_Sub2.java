import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cha")
public final class Class19_Sub2 extends Class19 {

	@OriginalMember(owner = "client!cha", name = "<init>", descriptor = "(Lclient!kv;)V")
	public Class19_Sub2(@OriginalArg(0) Class143_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!cha", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7872(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!cha", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7874() {
		return true;
	}

	@OriginalMember(owner = "client!cha", name = "a", descriptor = "(B)V")
	@Override
	public void method7871() {
		super.aClass143_Sub2_39.method4981(false);
	}

	@OriginalMember(owner = "client!cha", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7875(@OriginalArg(0) boolean arg0) {
		super.aClass143_Sub2_39.method4981(true);
	}

	@OriginalMember(owner = "client!cha", name = "a", descriptor = "(III)V")
	@Override
	public void method7876(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!cha", name = "a", descriptor = "(Lclient!fia;IZ)V")
	@Override
	public void method7873(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1) {
		super.aClass143_Sub2_39.method4945(arg0);
		super.aClass143_Sub2_39.method4994(arg1);
	}
}
