import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nk")
public final class Class144 {

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "Lclient!ik;")
	private final Class103 aClass103_42 = new Class103(256);

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "Lclient!pg;")
	private final Interface6 anInterface6_5;

	@OriginalMember(owner = "client!nk", name = "c", descriptor = "Lclient!hd;")
	private final Class89_Sub1 aClass89_Sub1_31;

	@OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Lclient!hd;Lclient!pg;)V")
	public Class144(@OriginalArg(0) Class89_Sub1 arg0, @OriginalArg(1) Interface6 arg1) {
		this.anInterface6_5 = arg1;
		this.aClass89_Sub1_31 = arg0;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)Lclient!oe;")
	public Class92_Sub4 method3848(@OriginalArg(0) int arg0) {
		@Pc(8) Object local8 = this.aClass103_42.method2682((long) arg0);
		if (local8 != null) {
			return (Class92_Sub4) local8;
		} else if (this.anInterface6_5.method5615(arg0)) {
			@Pc(28) Class18 local28 = this.anInterface6_5.method5614(arg0);
			@Pc(35) int local35 = local28.aBoolean15 ? 64 : 128;
			@Pc(73) Class92_Sub4 local73;
			if (local28.aBoolean19 && this.aClass89_Sub1_31.method5441()) {
				@Pc(52) float[] local52 = this.anInterface6_5.method5612(local35, local35, arg0, 0.7F);
				local73 = new Class92_Sub4(this.aClass89_Sub1_31, 3553, 34842, local35, local35, local28.aByte1 != 0, local52, 6408);
			} else {
				@Pc(84) int[] local84 = this.anInterface6_5.method5613(0.7F, arg0, local35, local35);
				local73 = new Class92_Sub4(this.aClass89_Sub1_31, 3553, 6408, local35, local35, local28.aByte1 != 0, local84, false);
			}
			local73.method3530(local28.aBoolean20, local28.aBoolean21);
			this.aClass103_42.method2687(local73, (long) arg0);
			return local73;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V")
	public void method3849() {
		this.aClass103_42.method2678();
	}
}
