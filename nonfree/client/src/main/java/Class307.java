import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sga")
public final class Class307 {

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "J")
	private long aLong225;

	@OriginalMember(owner = "client!sga", name = "o", descriptor = "Lclient!ns;")
	private Class3 aClass3_249;

	@OriginalMember(owner = "client!sga", name = "p", descriptor = "Lclient!ns;")
	private Class3 aClass3_250;

	@OriginalMember(owner = "client!sga", name = "q", descriptor = "I")
	private int anInt9015 = 0;

	@OriginalMember(owner = "client!sga", name = "e", descriptor = "I")
	public final int anInt9007;

	@OriginalMember(owner = "client!sga", name = "f", descriptor = "[Lclient!ns;")
	public final Class3[] aClass3Array1;

	@OriginalMember(owner = "client!sga", name = "<init>", descriptor = "(I)V")
	public Class307(@OriginalArg(0) int arg0) {
		this.anInt9007 = arg0;
		this.aClass3Array1 = new Class3[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class3 local23 = this.aClass3Array1[local13] = new Class3();
			local23.aClass3_300 = local23;
			local23.aClass3_299 = local23;
		}
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(B)I")
	public int method7420() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt9007; local9++) {
			@Pc(16) Class3 local16 = this.aClass3Array1[local9];
			@Pc(19) Class3 local19 = local16.aClass3_300;
			while (local19 != local16) {
				local19 = local19.aClass3_300;
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(Z)Lclient!ns;")
	public Class3 method7421() {
		this.anInt9015 = 0;
		return this.method7428();
	}

	@OriginalMember(owner = "client!sga", name = "b", descriptor = "(B)Lclient!ns;")
	public Class3 method7422() {
		if (this.aClass3_249 == null) {
			return null;
		}
		@Pc(30) Class3 local30 = this.aClass3Array1[(int) ((long) (this.anInt9007 - 1) & this.aLong225)];
		while (local30 != this.aClass3_249) {
			if (this.aClass3_249.aLong277 == this.aLong225) {
				@Pc(42) Class3 local42 = this.aClass3_249;
				this.aClass3_249 = this.aClass3_249.aClass3_300;
				return local42;
			}
			this.aClass3_249 = this.aClass3_249.aClass3_300;
		}
		this.aClass3_249 = null;
		return null;
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(JI)Lclient!ns;")
	public Class3 method7424(@OriginalArg(0) long arg0) {
		this.aLong225 = arg0;
		@Pc(27) Class3 local27 = this.aClass3Array1[(int) ((long) (this.anInt9007 - 1) & arg0)];
		for (this.aClass3_249 = local27.aClass3_300; this.aClass3_249 != local27; this.aClass3_249 = this.aClass3_249.aClass3_300) {
			if (this.aClass3_249.aLong277 == arg0) {
				@Pc(42) Class3 local42 = this.aClass3_249;
				this.aClass3_249 = this.aClass3_249.aClass3_300;
				return local42;
			}
		}
		this.aClass3_249 = null;
		return null;
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(JLclient!ns;B)V")
	public void method7425(@OriginalArg(0) long arg0, @OriginalArg(1) Class3 arg1) {
		if (arg1.aClass3_299 != null) {
			arg1.method8671();
		}
		@Pc(29) Class3 local29 = this.aClass3Array1[(int) ((long) (this.anInt9007 - 1) & arg0)];
		arg1.aClass3_300 = local29;
		arg1.aClass3_299 = local29.aClass3_299;
		arg1.aClass3_299.aClass3_300 = arg1;
		arg1.aLong277 = arg0;
		arg1.aClass3_300.aClass3_299 = arg1;
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "([Lclient!ns;I)I")
	public int method7426(@OriginalArg(0) Class3[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt9007; local9++) {
			@Pc(16) Class3 local16 = this.aClass3Array1[local9];
			for (@Pc(19) Class3 local19 = local16.aClass3_300; local19 != local16; local19 = local19.aClass3_300) {
				arg0[local7++] = local19;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!sga", name = "c", descriptor = "(Z)V")
	public void method7427() {
		for (@Pc(11) int local11 = 0; local11 < this.anInt9007; local11++) {
			@Pc(18) Class3 local18 = this.aClass3Array1[local11];
			while (true) {
				@Pc(21) Class3 local21 = local18.aClass3_300;
				if (local21 == local18) {
					break;
				}
				local21.method8671();
			}
		}
		this.aClass3_249 = null;
		this.aClass3_250 = null;
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(I)Lclient!ns;")
	public Class3 method7428() {
		@Pc(21) Class3 local21;
		if (this.anInt9015 > 0 && this.aClass3Array1[this.anInt9015 - 1] != this.aClass3_250) {
			local21 = this.aClass3_250;
			this.aClass3_250 = local21.aClass3_300;
			return local21;
		}
		while (this.anInt9015 < this.anInt9007) {
			local21 = this.aClass3Array1[this.anInt9015++].aClass3_300;
			if (this.aClass3Array1[this.anInt9015 - 1] != local21) {
				this.aClass3_250 = local21.aClass3_300;
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!sga", name = "b", descriptor = "(I)I")
	public int method7429() {
		return this.anInt9007;
	}
}
