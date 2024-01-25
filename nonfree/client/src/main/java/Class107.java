import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hm")
public final class Class107 {

	@OriginalMember(owner = "client!hm", name = "f", descriptor = "Lclient!fr;")
	private final Class91 aClass91_49 = new Class91(256);

	@OriginalMember(owner = "client!hm", name = "g", descriptor = "Lclient!l;")
	private final Interface7 anInterface7_7;

	@OriginalMember(owner = "client!hm", name = "c", descriptor = "Lclient!ih;")
	private final Class106_Sub2 aClass106_Sub2_21;

	static {
		new Class158("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
	}

	@OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(Lclient!ih;Lclient!l;)V")
	public Class107(@OriginalArg(0) Class106_Sub2 arg0, @OriginalArg(1) Interface7 arg1) {
		this.anInterface7_7 = arg1;
		this.aClass106_Sub2_21 = arg0;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(B)V")
	public void method2626() {
		this.aClass91_49.method1998(5);
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(II)Lclient!ah;")
	public Class8_Sub1 method2628(@OriginalArg(0) int arg0) {
		@Pc(10) Object local10 = this.aClass91_49.method1988((long) arg0);
		if (local10 != null) {
			return (Class8_Sub1) local10;
		} else if (this.anInterface7_7.method77(arg0)) {
			@Pc(29) Class150 local29 = this.anInterface7_7.method78(arg0);
			@Pc(38) int local38 = local29.aBoolean272 ? 64 : this.aClass106_Sub2_21.anInt3732;
			@Pc(73) Class8_Sub1 local73;
			if (local29.aBoolean277 && this.aClass106_Sub2_21.method5945()) {
				@Pc(55) float[] local55 = this.anInterface7_7.method80(0.7F, local38, local38, arg0);
				local73 = new Class8_Sub1(this.aClass106_Sub2_21, 3553, 34842, local38, local38, local29.aByte51 != 0, local55, 6408);
			} else {
				@Pc(94) short local94;
				@Pc(92) int[] local92;
				if (local29.aBoolean276 && Static310.method4461(local29.aByte53)) {
					local94 = 6407;
					local92 = this.anInterface7_7.method76(arg0, 0.7F, local38, local38, false);
				} else {
					local92 = this.anInterface7_7.method79(local38, arg0, local38, 0.7F);
					local94 = 6408;
				}
				local73 = new Class8_Sub1(this.aClass106_Sub2_21, 3553, local94, local38, local38, local29.aByte51 != 0, local92, false);
			}
			local73.method2252(local29.aBoolean271, local29.aBoolean270);
			this.aClass91_49.method1990(local73, (long) arg0);
			return local73;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "(I)V")
	public void method2629() {
		this.aClass91_49.method1999();
	}
}
