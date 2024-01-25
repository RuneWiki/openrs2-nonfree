import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public final class Class76_Sub4 extends Class76 {

	@OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Lclient!ok;)V")
	public Class76_Sub4(@OriginalArg(0) Class134_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IZI)V")
	@Override
	public void method7608(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method7606() {
		return true;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(I)V")
	@Override
	public void method7610() {
		super.aClass134_Sub2_43.method5218(false);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7607(@OriginalArg(0) boolean arg0) {
		super.aClass134_Sub2_43.method5218(true);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7613(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(ILclient!ip;I)V")
	@Override
	public void method7611(@OriginalArg(0) int arg0, @OriginalArg(1) Class40 arg1) {
		super.aClass134_Sub2_43.method5202(arg1);
		super.aClass134_Sub2_43.method5194(arg0);
	}
}
