import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cea")
public final class Class46 {

	@OriginalMember(owner = "client!cea", name = "e", descriptor = "Lclient!wg;")
	private final Class313 aClass313_6 = new Class313(256);

	@OriginalMember(owner = "client!cea", name = "g", descriptor = "Lclient!uq;")
	private final Class122_Sub3 aClass122_Sub3_6;

	@OriginalMember(owner = "client!cea", name = "k", descriptor = "Lclient!n;")
	private final Interface8 anInterface8_5;

	@OriginalMember(owner = "client!cea", name = "<init>", descriptor = "(Lclient!uq;Lclient!n;)V")
	public Class46(@OriginalArg(0) Class122_Sub3 arg0, @OriginalArg(1) Interface8 arg1) {
		this.aClass122_Sub3_6 = arg0;
		this.anInterface8_5 = arg1;
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(B)V")
	public void method1116() {
		this.aClass313_6.method7403(5);
	}

	@OriginalMember(owner = "client!cea", name = "c", descriptor = "(II)Lclient!ku;")
	public Class73_Sub1 method1117(@OriginalArg(1) int arg0) {
		@Pc(12) Object local12 = this.aClass313_6.method7406((long) arg0);
		if (local12 != null) {
			return (Class73_Sub1) local12;
		} else if (this.anInterface8_5.method879(arg0)) {
			@Pc(40) Class220 local40 = this.anInterface8_5.method878(arg0);
			@Pc(49) int local49 = local40.aBoolean451 ? 64 : this.aClass122_Sub3_6.anInt8407;
			@Pc(86) Class73_Sub1 local86;
			if (local40.aBoolean454 && this.aClass122_Sub3_6.method7215()) {
				@Pc(68) float[] local68 = this.anInterface8_5.method877(local49, arg0, local49, 0.7F);
				local86 = new Class73_Sub1(this.aClass122_Sub3_6, 3553, 34842, local49, local49, local40.aByte83 != 0, local68, 6408);
			} else {
				@Pc(101) int[] local101;
				if (local40.aBoolean445) {
					local101 = this.anInterface8_5.method880(local49, arg0, local49, 0.7F);
				} else {
					local101 = this.anInterface8_5.method876(arg0, true, local49, 0.7F, local49);
				}
				local86 = new Class73_Sub1(this.aClass122_Sub3_6, 3553, 6408, local49, local49, local40.aByte83 != 0, local101, false);
			}
			local86.method1954(local40.aBoolean453, local40.aBoolean447);
			this.aClass313_6.method7399((long) arg0, local86);
			return local86;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!cea", name = "b", descriptor = "(B)V")
	public void method1118() {
		this.aClass313_6.method7398();
	}
}
