import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public final class Class42_Sub5 extends Class42 {

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(Lclient!uca;)V")
	public Class42_Sub5(@OriginalArg(0) Class162_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7738(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7735() {
		return true;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7739(@OriginalArg(0) boolean arg0) {
		super.aClass162_Sub3_44.method6918(true);
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)V")
	@Override
	public void method7741() {
		super.aClass162_Sub3_44.method6918(false);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILclient!vaa;B)V")
	@Override
	public void method7742(@OriginalArg(0) int arg0, @OriginalArg(1) Class3 arg1) {
		super.aClass162_Sub3_44.method6911(arg1);
		super.aClass162_Sub3_44.method6953(arg0);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7737(@OriginalArg(1) boolean arg0) {
	}
}
