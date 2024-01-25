import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vg")
public final class Class252 {

	@OriginalMember(owner = "client!vg", name = "g", descriptor = "J")
	private long aLong222;

	@OriginalMember(owner = "client!vg", name = "m", descriptor = "Lclient!dd;")
	private Class5 aClass5_253;

	@OriginalMember(owner = "client!vg", name = "s", descriptor = "Lclient!dd;")
	private Class5 aClass5_254;

	@OriginalMember(owner = "client!vg", name = "r", descriptor = "I")
	private int anInt7150 = 0;

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "[Lclient!dd;")
	public final Class5[] aClass5Array1;

	@OriginalMember(owner = "client!vg", name = "q", descriptor = "I")
	public final int anInt7149;

	static {
		new Class198("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
	}

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(I)V")
	public Class252(@OriginalArg(0) int arg0) {
		this.aClass5Array1 = new Class5[arg0];
		this.anInt7149 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class5 local23 = this.aClass5Array1[local13] = new Class5();
			local23.aClass5_267 = local23;
			local23.aClass5_268 = local23;
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lclient!dd;IJ)V")
	public void method5658(@OriginalArg(0) Class5 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass5_268 != null) {
			arg0.method6003();
		}
		@Pc(21) Class5 local21 = this.aClass5Array1[(int) ((long) (this.anInt7149 - 1) & arg1)];
		arg0.aClass5_268 = local21.aClass5_268;
		arg0.aClass5_267 = local21;
		arg0.aClass5_268.aClass5_267 = arg0;
		arg0.aLong234 = arg1;
		arg0.aClass5_267.aClass5_268 = arg0;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(BJ)Lclient!dd;")
	public Class5 method5659(@OriginalArg(1) long arg0) {
		this.aLong222 = arg0;
		@Pc(20) Class5 local20 = this.aClass5Array1[(int) ((long) (this.anInt7149 - 1) & arg0)];
		for (this.aClass5_253 = local20.aClass5_267; this.aClass5_253 != local20; this.aClass5_253 = this.aClass5_253.aClass5_267) {
			if (this.aClass5_253.aLong234 == arg0) {
				@Pc(47) Class5 local47 = this.aClass5_253;
				this.aClass5_253 = this.aClass5_253.aClass5_267;
				return local47;
			}
		}
		this.aClass5_253 = null;
		return null;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Z)Lclient!dd;")
	public Class5 method5660() {
		this.anInt7150 = 0;
		return this.method5666();
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V")
	public void method5661() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt7149; local3++) {
			@Pc(10) Class5 local10 = this.aClass5Array1[local3];
			while (true) {
				@Pc(13) Class5 local13 = local10.aClass5_267;
				if (local10 == local13) {
					break;
				}
				local13.method6003();
			}
		}
		this.aClass5_254 = null;
		this.aClass5_253 = null;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(B[Lclient!dd;)I")
	public int method5662(@OriginalArg(1) Class5[] arg0) {
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt7149; local17++) {
			@Pc(24) Class5 local24 = this.aClass5Array1[local17];
			for (@Pc(27) Class5 local27 = local24.aClass5_267; local27 != local24; local27 = local27.aClass5_267) {
				arg0[local15++] = local27;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "(I)I")
	public int method5664() {
		return this.anInt7149;
	}

	@OriginalMember(owner = "client!vg", name = "c", descriptor = "(I)I")
	public int method5665() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt7149; local9++) {
			@Pc(16) Class5 local16 = this.aClass5Array1[local9];
			@Pc(19) Class5 local19 = local16.aClass5_267;
			while (local16 != local19) {
				local19 = local19.aClass5_267;
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!vg", name = "d", descriptor = "(I)Lclient!dd;")
	public Class5 method5666() {
		@Pc(27) Class5 local27;
		if (this.anInt7150 > 0 && this.aClass5_254 != this.aClass5Array1[this.anInt7150 - 1]) {
			local27 = this.aClass5_254;
			this.aClass5_254 = local27.aClass5_267;
			return local27;
		}
		while (this.anInt7149 > this.anInt7150) {
			local27 = this.aClass5Array1[this.anInt7150++].aClass5_267;
			if (this.aClass5Array1[this.anInt7150 - 1] != local27) {
				this.aClass5_254 = local27.aClass5_267;
				return local27;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!vg", name = "e", descriptor = "(I)Lclient!dd;")
	public Class5 method5667() {
		if (this.aClass5_253 == null) {
			return null;
		}
		@Pc(23) Class5 local23 = this.aClass5Array1[(int) ((long) (this.anInt7149 - 1) & this.aLong222)];
		while (local23 != this.aClass5_253) {
			if (this.aClass5_253.aLong234 == this.aLong222) {
				@Pc(35) Class5 local35 = this.aClass5_253;
				this.aClass5_253 = this.aClass5_253.aClass5_267;
				return local35;
			}
			this.aClass5_253 = this.aClass5_253.aClass5_267;
		}
		this.aClass5_253 = null;
		return null;
	}
}
