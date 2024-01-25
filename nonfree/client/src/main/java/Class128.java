import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class128 {

	@OriginalMember(owner = "client!he", name = "e", descriptor = "Lclient!efa;")
	private Class6 aClass6_114;

	@OriginalMember(owner = "client!he", name = "g", descriptor = "J")
	private long aLong103;

	@OriginalMember(owner = "client!he", name = "q", descriptor = "Lclient!efa;")
	private Class6 aClass6_115;

	@OriginalMember(owner = "client!he", name = "m", descriptor = "I")
	private int anInt4070 = 0;

	@OriginalMember(owner = "client!he", name = "f", descriptor = "I")
	public final int anInt4064;

	@OriginalMember(owner = "client!he", name = "b", descriptor = "[Lclient!efa;")
	public final Class6[] aClass6Array1;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(I)V")
	public Class128(@OriginalArg(0) int arg0) {
		this.anInt4064 = arg0;
		this.aClass6Array1 = new Class6[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class6 local23 = this.aClass6Array1[local13] = new Class6();
			local23.aClass6_300 = local23;
			local23.aClass6_299 = local23;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(BJLclient!efa;)V")
	public void method3551(@OriginalArg(1) long arg0, @OriginalArg(2) Class6 arg1) {
		if (arg1.aClass6_300 != null) {
			arg1.method9043();
		}
		@Pc(27) Class6 local27 = this.aClass6Array1[(int) (arg0 & (long) (this.anInt4064 - 1))];
		arg1.aClass6_300 = local27.aClass6_300;
		arg1.aClass6_299 = local27;
		arg1.aClass6_300.aClass6_299 = arg1;
		arg1.aLong278 = arg0;
		arg1.aClass6_299.aClass6_300 = arg1;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Z)Lclient!efa;")
	public Class6 method3553() {
		if (this.aClass6_114 == null) {
			return null;
		}
		@Pc(28) Class6 local28 = this.aClass6Array1[(int) (this.aLong103 & (long) (this.anInt4064 - 1))];
		while (this.aClass6_114 != local28) {
			if (this.aLong103 == this.aClass6_114.aLong278) {
				@Pc(44) Class6 local44 = this.aClass6_114;
				this.aClass6_114 = this.aClass6_114.aClass6_299;
				return local44;
			}
			this.aClass6_114 = this.aClass6_114.aClass6_299;
		}
		this.aClass6_114 = null;
		return null;
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(Z)I")
	public int method3554() {
		@Pc(7) int local7 = 0;
		for (@Pc(15) int local15 = 0; local15 < this.anInt4064; local15++) {
			@Pc(22) Class6 local22 = this.aClass6Array1[local15];
			@Pc(25) Class6 local25 = local22.aClass6_299;
			while (local22 != local25) {
				local25 = local25.aClass6_299;
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(B)Lclient!efa;")
	public Class6 method3555() {
		@Pc(22) Class6 local22;
		if (this.anInt4070 > 0 && this.aClass6Array1[this.anInt4070 - 1] != this.aClass6_115) {
			local22 = this.aClass6_115;
			this.aClass6_115 = local22.aClass6_299;
			return local22;
		}
		while (this.anInt4064 > this.anInt4070) {
			local22 = this.aClass6Array1[this.anInt4070++].aClass6_299;
			if (local22 != this.aClass6Array1[this.anInt4070 - 1]) {
				this.aClass6_115 = local22.aClass6_299;
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(Z)Lclient!efa;")
	public Class6 method3556() {
		this.anInt4070 = 0;
		return this.method3555();
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(I)I")
	public int method3558() {
		return this.anInt4064;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(JB)Lclient!efa;")
	public Class6 method3560(@OriginalArg(0) long arg0) {
		this.aLong103 = arg0;
		@Pc(27) Class6 local27 = this.aClass6Array1[(int) ((long) (this.anInt4064 - 1) & arg0)];
		for (this.aClass6_114 = local27.aClass6_299; this.aClass6_114 != local27; this.aClass6_114 = this.aClass6_114.aClass6_299) {
			if (this.aClass6_114.aLong278 == arg0) {
				@Pc(42) Class6 local42 = this.aClass6_114;
				this.aClass6_114 = this.aClass6_114.aClass6_299;
				return local42;
			}
		}
		this.aClass6_114 = null;
		return null;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "([Lclient!efa;B)I")
	public int method3561(@OriginalArg(0) Class6[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(14) int local14 = 0; local14 < this.anInt4064; local14++) {
			@Pc(21) Class6 local21 = this.aClass6Array1[local14];
			for (@Pc(24) Class6 local24 = local21.aClass6_299; local24 != local21; local24 = local24.aClass6_299) {
				arg0[local7++] = local24;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V")
	public void method3562() {
		for (@Pc(13) int local13 = 0; local13 < this.anInt4064; local13++) {
			@Pc(20) Class6 local20 = this.aClass6Array1[local13];
			while (true) {
				@Pc(23) Class6 local23 = local20.aClass6_299;
				if (local23 == local20) {
					break;
				}
				local23.method9043();
			}
		}
		this.aClass6_115 = null;
		this.aClass6_114 = null;
	}
}
