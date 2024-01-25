import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class Class213 implements Interface17 {

	@OriginalMember(owner = "client!ru", name = "j", descriptor = "I")
	public final int anInt5124;

	@OriginalMember(owner = "client!ru", name = "g", descriptor = "Lclient!vea;")
	public final Class347 aClass347_7;

	@OriginalMember(owner = "client!ru", name = "d", descriptor = "Lclient!tca;")
	public final Class322 aClass322_7;

	@OriginalMember(owner = "client!ru", name = "b", descriptor = "I")
	public final int anInt5119;

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "I")
	public final int anInt5118;

	@OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(ILclient!tca;Lclient!vea;II)V")
	public Class213(@OriginalArg(0) int arg0, @OriginalArg(1) Class322 arg1, @OriginalArg(2) Class347 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt5124 = arg0;
		this.aClass347_7 = arg2;
		this.aClass322_7 = arg1;
		this.anInt5119 = arg3;
		this.anInt5118 = arg4;
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(I)Lclient!mh;")
	@Override
	public Class225 method7443() {
		return Static213.aClass225_13;
	}
}
