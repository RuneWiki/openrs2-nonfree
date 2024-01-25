import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mn")
public final class Class163 {

	@OriginalMember(owner = "client!mn", name = "m", descriptor = "Lclient!uj;")
	private Class2 aClass2_146;

	@OriginalMember(owner = "client!mn", name = "p", descriptor = "J")
	private long aLong124;

	@OriginalMember(owner = "client!mn", name = "s", descriptor = "Lclient!uj;")
	private Class2 aClass2_147;

	@OriginalMember(owner = "client!mn", name = "r", descriptor = "I")
	private int anInt4682 = 0;

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "[Lclient!uj;")
	public final Class2[] aClass2Array1;

	@OriginalMember(owner = "client!mn", name = "l", descriptor = "I")
	public final int anInt4679;

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(I)V")
	public Class163(@OriginalArg(0) int arg0) {
		this.aClass2Array1 = new Class2[arg0];
		this.anInt4679 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class2 local23 = this.aClass2Array1[local13] = new Class2();
			local23.aClass2_262 = local23;
			local23.aClass2_261 = local23;
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(B[Lclient!uj;)I")
	public int method3762(@OriginalArg(1) Class2[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(14) int local14 = 0; local14 < this.anInt4679; local14++) {
			@Pc(21) Class2 local21 = this.aClass2Array1[local14];
			for (@Pc(24) Class2 local24 = local21.aClass2_261; local24 != local21; local24 = local24.aClass2_261) {
				arg0[local7++] = local24;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(B)I")
	public int method3763() {
		@Pc(7) int local7 = 0;
		for (@Pc(14) int local14 = 0; local14 < this.anInt4679; local14++) {
			@Pc(21) Class2 local21 = this.aClass2Array1[local14];
			@Pc(24) Class2 local24 = local21.aClass2_261;
			while (local21 != local24) {
				local24 = local24.aClass2_261;
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IJLclient!uj;)V")
	public void method3764(@OriginalArg(1) long arg0, @OriginalArg(2) Class2 arg1) {
		if (arg1.aClass2_262 != null) {
			arg1.method5866();
		}
		@Pc(25) Class2 local25 = this.aClass2Array1[(int) ((long) (this.anInt4679 - 1) & arg0)];
		arg1.aClass2_262 = local25.aClass2_262;
		arg1.aClass2_261 = local25;
		arg1.aClass2_262.aClass2_261 = arg1;
		arg1.aClass2_261.aClass2_262 = arg1;
		arg1.aLong227 = arg0;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)Lclient!uj;")
	public Class2 method3765() {
		if (this.aClass2_146 == null) {
			return null;
		}
		@Pc(23) Class2 local23 = this.aClass2Array1[(int) ((long) (this.anInt4679 - 1) & this.aLong124)];
		while (local23 != this.aClass2_146) {
			if (this.aLong124 == this.aClass2_146.aLong227) {
				@Pc(35) Class2 local35 = this.aClass2_146;
				this.aClass2_146 = this.aClass2_146.aClass2_261;
				return local35;
			}
			this.aClass2_146 = this.aClass2_146.aClass2_261;
		}
		this.aClass2_146 = null;
		return null;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Z)V")
	public void method3767() {
		for (@Pc(14) int local14 = 0; local14 < this.anInt4679; local14++) {
			@Pc(21) Class2 local21 = this.aClass2Array1[local14];
			while (true) {
				@Pc(24) Class2 local24 = local21.aClass2_261;
				if (local24 == local21) {
					break;
				}
				local24.method5866();
			}
		}
		this.aClass2_147 = null;
		this.aClass2_146 = null;
	}

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "(B)I")
	public int method3768() {
		return this.anInt4679;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(JI)Lclient!uj;")
	public Class2 method3769(@OriginalArg(0) long arg0) {
		this.aLong124 = arg0;
		@Pc(25) Class2 local25 = this.aClass2Array1[(int) ((long) (this.anInt4679 - 1) & arg0)];
		for (this.aClass2_146 = local25.aClass2_261; this.aClass2_146 != local25; this.aClass2_146 = this.aClass2_146.aClass2_261) {
			if (this.aClass2_146.aLong227 == arg0) {
				@Pc(44) Class2 local44 = this.aClass2_146;
				this.aClass2_146 = this.aClass2_146.aClass2_261;
				return local44;
			}
		}
		this.aClass2_146 = null;
		return null;
	}

	@OriginalMember(owner = "client!mn", name = "d", descriptor = "(B)Lclient!uj;")
	public Class2 method3770() {
		@Pc(21) Class2 local21;
		if (this.anInt4682 > 0 && this.aClass2Array1[this.anInt4682 - 1] != this.aClass2_147) {
			local21 = this.aClass2_147;
			this.aClass2_147 = local21.aClass2_261;
			return local21;
		}
		while (this.anInt4682 < this.anInt4679) {
			local21 = this.aClass2Array1[this.anInt4682++].aClass2_261;
			if (this.aClass2Array1[this.anInt4682 - 1] != local21) {
				this.aClass2_147 = local21.aClass2_261;
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(I)Lclient!uj;")
	public Class2 method3771() {
		this.anInt4682 = 0;
		return this.method3770();
	}
}
