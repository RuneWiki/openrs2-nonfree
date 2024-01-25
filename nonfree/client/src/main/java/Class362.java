import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class Class362 implements Interface2 {

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "I")
	public final int anInt10880;

	@OriginalMember(owner = "client!vr", name = "i", descriptor = "I")
	public final int anInt10885;

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "I")
	public final int anInt10881;

	@OriginalMember(owner = "client!vr", name = "f", descriptor = "Lclient!sd;")
	public final Class309 aClass309_13;

	@OriginalMember(owner = "client!vr", name = "c", descriptor = "Lclient!ec;")
	public final Class86 aClass86_13;

	@OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(ILclient!sd;Lclient!ec;II)V")
	public Class362(@OriginalArg(0) int arg0, @OriginalArg(1) Class309 arg1, @OriginalArg(2) Class86 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt10880 = arg3;
		this.anInt10885 = arg0;
		this.anInt10881 = arg4;
		this.aClass309_13 = arg1;
		this.aClass86_13 = arg2;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(B)Lclient!ad;")
	@Override
	public Class6 method9087() {
		return Static496.aClass6_10;
	}
}
