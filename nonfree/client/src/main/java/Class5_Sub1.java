import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public final class Class5_Sub1 extends Class5 {

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Lclient!bl;)V")
	public Class5_Sub1(@OriginalArg(0) Class28_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5928() {
		return true;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5925(@OriginalArg(0) boolean arg0) {
		super.aClass28_Sub1_42.method723(true);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IZ)V")
	@Override
	public void method5926(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(III)V")
	@Override
	public void method5923(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V")
	@Override
	public void method5922() {
		super.aClass28_Sub1_42.method723(false);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!ce;IZ)V")
	@Override
	public void method5927(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1) {
		super.aClass28_Sub1_42.method654(arg0);
		super.aClass28_Sub1_42.method678(arg1);
	}
}
