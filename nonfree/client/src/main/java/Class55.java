import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cw")
public final class Class55 {

	@OriginalMember(owner = "client!cw", name = "h", descriptor = "Lclient!hp;")
	private final Class125 aClass125_8 = new Class125(64);

	@OriginalMember(owner = "client!cw", name = "e", descriptor = "Lclient!kea;")
	private final Class161 aClass161_14;

	@OriginalMember(owner = "client!cw", name = "c", descriptor = "I")
	public final int anInt1605;

	static {
		new Class67("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
	}

	@OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Lclient!cda;ILclient!kea;)V")
	public Class55(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class161 arg2) {
		this.aClass161_14 = arg2;
		this.anInt1605 = this.aClass161_14.method4266(19);
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(BI)Lclient!nm;")
	public Class208 method1463(@OriginalArg(1) int arg0) {
		@Pc(6) Class125 local6 = this.aClass125_8;
		@Pc(16) Class208 local16;
		synchronized (this.aClass125_8) {
			local16 = (Class208) this.aClass125_8.method3512((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class161 local34 = this.aClass161_14;
		@Pc(43) byte[] local43;
		synchronized (this.aClass161_14) {
			local43 = this.aClass161_14.method4243(arg0, 19);
		}
		local16 = new Class208();
		if (local43 != null) {
			local16.method5281(new Class3_Sub27(local43));
		}
		@Pc(65) Class125 local65 = this.aClass125_8;
		synchronized (this.aClass125_8) {
			this.aClass125_8.method3519((long) arg0, local16);
			return local16;
		}
	}
}
