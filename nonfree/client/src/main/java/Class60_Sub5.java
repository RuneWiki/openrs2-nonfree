import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public final class Class60_Sub5 extends Class60 {

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Lclient!sf;)V")
	public Class60_Sub5(@OriginalArg(0) Class16_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lclient!br;II)V")
	@Override
	public void method8295(@OriginalArg(0) Interface3 arg0, @OriginalArg(2) int arg1) {
		super.aClass16_Sub1_23.method6197(arg0);
		super.aClass16_Sub1_23.method6233(arg1);
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8302(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIB)V")
	@Override
	public void method8291(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8296() {
		return false;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8293(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!mm", name = "e", descriptor = "(I)V")
	@Override
	public void method8300() {
	}
}
