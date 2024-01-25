import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class42 {

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "J")
	private long aLong39;

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "Lclient!um;")
	private Class5 aClass5_43;

	@OriginalMember(owner = "client!cb", name = "s", descriptor = "Lclient!um;")
	private Class5 aClass5_44;

	@OriginalMember(owner = "client!cb", name = "r", descriptor = "I")
	private int anInt1148 = 0;

	@OriginalMember(owner = "client!cb", name = "q", descriptor = "[Lclient!um;")
	public final Class5[] aClass5Array1;

	@OriginalMember(owner = "client!cb", name = "l", descriptor = "I")
	public final int anInt1143;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(I)V")
	public Class42(@OriginalArg(0) int arg0) {
		this.aClass5Array1 = new Class5[arg0];
		this.anInt1143 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class5 local23 = this.aClass5Array1[local13] = new Class5();
			local23.aClass5_284 = local23;
			local23.aClass5_283 = local23;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)Lclient!um;")
	public Class5 method1103() {
		this.anInt1148 = 0;
		return this.method1105();
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)Lclient!um;")
	public Class5 method1105() {
		@Pc(19) Class5 local19;
		if (this.anInt1148 > 0 && this.aClass5Array1[this.anInt1148 - 1] != this.aClass5_44) {
			local19 = this.aClass5_44;
			this.aClass5_44 = local19.aClass5_284;
			return local19;
		}
		while (this.anInt1148 < this.anInt1143) {
			local19 = this.aClass5Array1[this.anInt1148++].aClass5_284;
			if (local19 != this.aClass5Array1[this.anInt1148 - 1]) {
				this.aClass5_44 = local19.aClass5_284;
				return local19;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(JBLclient!um;)V")
	public void method1106(@OriginalArg(0) long arg0, @OriginalArg(2) Class5 arg1) {
		if (arg1.aClass5_283 != null) {
			arg1.method7425();
		}
		@Pc(31) Class5 local31 = this.aClass5Array1[(int) ((long) (this.anInt1143 - 1) & arg0)];
		arg1.aClass5_284 = local31;
		arg1.aClass5_283 = local31.aClass5_283;
		arg1.aClass5_283.aClass5_284 = arg1;
		arg1.aClass5_284.aClass5_283 = arg1;
		arg1.aLong253 = arg0;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)I")
	public int method1107() {
		return this.anInt1143;
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "(I)V")
	public void method1108() {
		for (@Pc(15) int local15 = 0; local15 < this.anInt1143; local15++) {
			@Pc(22) Class5 local22 = this.aClass5Array1[local15];
			while (true) {
				@Pc(25) Class5 local25 = local22.aClass5_284;
				if (local22 == local25) {
					break;
				}
				local25.method7425();
			}
		}
		this.aClass5_44 = null;
		this.aClass5_43 = null;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IJ)Lclient!um;")
	public Class5 method1109(@OriginalArg(1) long arg0) {
		this.aLong39 = arg0;
		@Pc(25) Class5 local25 = this.aClass5Array1[(int) ((long) (this.anInt1143 - 1) & arg0)];
		for (this.aClass5_43 = local25.aClass5_284; this.aClass5_43 != local25; this.aClass5_43 = this.aClass5_43.aClass5_284) {
			if (this.aClass5_43.aLong253 == arg0) {
				@Pc(44) Class5 local44 = this.aClass5_43;
				this.aClass5_43 = this.aClass5_43.aClass5_284;
				return local44;
			}
		}
		this.aClass5_43 = null;
		return null;
	}

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "(I)Lclient!um;")
	public Class5 method1110() {
		if (this.aClass5_43 == null) {
			return null;
		}
		@Pc(23) Class5 local23 = this.aClass5Array1[(int) ((long) (this.anInt1143 - 1) & this.aLong39)];
		while (this.aClass5_43 != local23) {
			if (this.aClass5_43.aLong253 == this.aLong39) {
				@Pc(39) Class5 local39 = this.aClass5_43;
				this.aClass5_43 = this.aClass5_43.aClass5_284;
				return local39;
			}
			this.aClass5_43 = this.aClass5_43.aClass5_284;
		}
		this.aClass5_43 = null;
		return null;
	}

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "(I)I")
	public int method1111() {
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < this.anInt1143; local15++) {
			@Pc(22) Class5 local22 = this.aClass5Array1[local15];
			@Pc(25) Class5 local25 = local22.aClass5_284;
			while (local25 != local22) {
				local25 = local25.aClass5_284;
				local13++;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "([Lclient!um;B)I")
	public int method1113(@OriginalArg(0) Class5[] arg0) {
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < this.anInt1143; local15++) {
			@Pc(22) Class5 local22 = this.aClass5Array1[local15];
			for (@Pc(25) Class5 local25 = local22.aClass5_284; local25 != local22; local25 = local25.aClass5_284) {
				arg0[local13++] = local25;
			}
		}
		return local13;
	}
}
