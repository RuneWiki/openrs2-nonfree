import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vl")
public final class Class362 {

	@OriginalMember(owner = "client!vl", name = "h", descriptor = "Lclient!qr;")
	private final Class293 aClass293_69 = new Class293(256);

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "Lclient!rda;")
	private final Class126_Sub3 aClass126_Sub3_37;

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "Lclient!d;")
	private final Interface8 anInterface8_12;

	@OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(Lclient!rda;Lclient!d;)V")
	public Class362(@OriginalArg(0) Class126_Sub3 arg0, @OriginalArg(1) Interface8 arg1) {
		this.aClass126_Sub3_37 = arg0;
		this.anInterface8_12 = arg1;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)V")
	public void method8471() {
		this.aClass293_69.method6930();
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(II)Lclient!sia;")
	public Class24_Sub4 method8473(@OriginalArg(1) int arg0) {
		@Pc(12) Object local12 = this.aClass293_69.method6921((long) arg0);
		if (local12 != null) {
			return (Class24_Sub4) local12;
		} else if (this.anInterface8_12.method7811(arg0)) {
			@Pc(36) Class321 local36 = this.anInterface8_12.method7813(arg0);
			@Pc(45) int local45 = local36.aBoolean729 ? 64 : this.aClass126_Sub3_37.anInt8267;
			@Pc(105) Class24_Sub4 local105;
			if (local36.aBoolean725 && this.aClass126_Sub3_37.method7025()) {
				@Pc(117) float[] local117 = this.anInterface8_12.method7816(local45, local45, arg0, 0.7F);
				local105 = new Class24_Sub4(this.aClass126_Sub3_37, 3553, 34842, local45, local45, local36.aByte114 != 0, local117, 6408);
			} else {
				@Pc(73) int[] local73;
				if (local36.anInt8901 != 2 && Static553.method7807(local36.aByte115)) {
					local73 = this.anInterface8_12.method7812(local45, 0.7F, true, arg0, local45);
				} else {
					local73 = this.anInterface8_12.method7815(local45, local45, 0.7F, arg0);
				}
				local105 = new Class24_Sub4(this.aClass126_Sub3_37, 3553, 6408, local45, local45, local36.aByte114 != 0, local73, 0, 0, false);
			}
			local105.method6792(local36.aBoolean731, local36.aBoolean727);
			this.aClass293_69.method6925((long) arg0, local105);
			return local105;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(I)V")
	public void method8475() {
		this.aClass293_69.method6922(5);
	}
}
