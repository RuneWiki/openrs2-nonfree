import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dm")
public final class Class58 {

	@OriginalMember(owner = "client!dm", name = "e", descriptor = "J")
	private long aLong40;

	@OriginalMember(owner = "client!dm", name = "m", descriptor = "Lclient!ss;")
	private Class3_Sub7 aClass3_Sub7_10;

	@OriginalMember(owner = "client!dm", name = "h", descriptor = "I")
	private final int anInt1344;

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "[Lclient!ss;")
	private final Class3_Sub7[] aClass3_Sub7Array1;

	static {
		new Class57("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
	}

	@OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(I)V")
	public Class58(@OriginalArg(0) int arg0) {
		this.anInt1344 = arg0;
		this.aClass3_Sub7Array1 = new Class3_Sub7[arg0];
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class3_Sub7 local20 = this.aClass3_Sub7Array1[local10] = new Class3_Sub7();
			local20.aClass3_Sub7_53 = local20;
			local20.aClass3_Sub7_54 = local20;
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(JLclient!ss;Z)V")
	public void method1157(@OriginalArg(0) long arg0, @OriginalArg(1) Class3_Sub7 arg1) {
		if (arg1.aClass3_Sub7_53 != null) {
			arg1.method5673();
		}
		@Pc(21) Class3_Sub7 local21 = this.aClass3_Sub7Array1[(int) ((long) (this.anInt1344 - 1) & arg0)];
		arg1.aClass3_Sub7_54 = local21;
		arg1.aClass3_Sub7_53 = local21.aClass3_Sub7_53;
		arg1.aClass3_Sub7_53.aClass3_Sub7_54 = arg1;
		arg1.aLong231 = arg0;
		arg1.aClass3_Sub7_54.aClass3_Sub7_53 = arg1;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(JI)Lclient!ss;")
	public Class3_Sub7 method1158(@OriginalArg(0) long arg0) {
		this.aLong40 = arg0;
		@Pc(25) Class3_Sub7 local25 = this.aClass3_Sub7Array1[(int) ((long) (this.anInt1344 - 1) & arg0)];
		for (this.aClass3_Sub7_10 = local25.aClass3_Sub7_54; this.aClass3_Sub7_10 != local25; this.aClass3_Sub7_10 = this.aClass3_Sub7_10.aClass3_Sub7_54) {
			if (arg0 == this.aClass3_Sub7_10.aLong231) {
				@Pc(44) Class3_Sub7 local44 = this.aClass3_Sub7_10;
				this.aClass3_Sub7_10 = this.aClass3_Sub7_10.aClass3_Sub7_54;
				return local44;
			}
		}
		this.aClass3_Sub7_10 = null;
		return null;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)Lclient!ss;")
	public Class3_Sub7 method1159() {
		if (this.aClass3_Sub7_10 == null) {
			return null;
		}
		@Pc(23) Class3_Sub7 local23 = this.aClass3_Sub7Array1[(int) (this.aLong40 & (long) (this.anInt1344 - 1))];
		while (this.aClass3_Sub7_10 != local23) {
			if (this.aClass3_Sub7_10.aLong231 == this.aLong40) {
				@Pc(35) Class3_Sub7 local35 = this.aClass3_Sub7_10;
				this.aClass3_Sub7_10 = this.aClass3_Sub7_10.aClass3_Sub7_54;
				return local35;
			}
			this.aClass3_Sub7_10 = this.aClass3_Sub7_10.aClass3_Sub7_54;
		}
		this.aClass3_Sub7_10 = null;
		return null;
	}
}
