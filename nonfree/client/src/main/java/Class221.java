import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rv")
public final class Class221 {

	@OriginalMember(owner = "client!rv", name = "e", descriptor = "Lclient!jv;")
	private final Class126 aClass126_49 = new Class126(256);

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "Lclient!vj;")
	private final Class172_Sub2 aClass172_Sub2_32;

	@OriginalMember(owner = "client!rv", name = "k", descriptor = "Lclient!m;")
	private final Interface5 anInterface5_7;

	@OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(Lclient!vj;Lclient!m;)V")
	public Class221(@OriginalArg(0) Class172_Sub2 arg0, @OriginalArg(1) Interface5 arg1) {
		this.aClass172_Sub2_32 = arg0;
		this.anInterface5_7 = arg1;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(I)V")
	public void method4754() {
		this.aClass126_49.method3135();
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IB)Lclient!mf;")
	public Class112_Sub2 method4759(@OriginalArg(0) int arg0) {
		@Pc(18) Object local18 = this.aClass126_49.method3141((long) arg0);
		if (local18 != null) {
			return (Class112_Sub2) local18;
		} else if (this.anInterface5_7.method3921(arg0)) {
			@Pc(37) Class76 local37 = this.anInterface5_7.method3918(arg0);
			@Pc(46) int local46 = local37.aBoolean208 ? 64 : this.aClass172_Sub2_32.anInt7153;
			@Pc(104) Class112_Sub2 local104;
			if (local37.aBoolean213 && this.aClass172_Sub2_32.method5539()) {
				@Pc(115) float[] local115 = this.anInterface5_7.method3922(local46, 0.7F, arg0, local46);
				local104 = new Class112_Sub2(this.aClass172_Sub2_32, 3553, 34842, local46, local46, local37.aByte43 != 0, local115, 6408);
			} else {
				@Pc(63) short local63;
				@Pc(73) int[] local73;
				if (local37.aBoolean212 && Static308.method4292(local37.aByte46)) {
					local63 = 6407;
					local73 = this.anInterface5_7.method3920(arg0, local46, local46, false, 0.7F);
				} else {
					local63 = 6408;
					local73 = this.anInterface5_7.method3919(arg0, local46, 0.7F, local46);
				}
				local104 = new Class112_Sub2(this.aClass172_Sub2_32, 3553, local63, local46, local46, local37.aByte43 != 0, local73, false);
			}
			local104.method3727(local37.aBoolean211, local37.aBoolean210);
			this.aClass126_49.method3132((long) arg0, local104);
			return local104;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(I)V")
	public void method4761() {
		this.aClass126_49.method3140(5);
	}
}
