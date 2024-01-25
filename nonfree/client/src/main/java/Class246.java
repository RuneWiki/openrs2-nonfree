import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wk")
public final class Class246 {

	@OriginalMember(owner = "client!wk", name = "i", descriptor = "Lclient!rs;")
	private Class2 aClass2_241;

	@OriginalMember(owner = "client!wk", name = "l", descriptor = "J")
	private long aLong208;

	@OriginalMember(owner = "client!wk", name = "q", descriptor = "Lclient!rs;")
	private Class2 aClass2_242;

	@OriginalMember(owner = "client!wk", name = "p", descriptor = "I")
	private int anInt6539 = 0;

	@OriginalMember(owner = "client!wk", name = "m", descriptor = "I")
	public final int anInt6537;

	@OriginalMember(owner = "client!wk", name = "g", descriptor = "[Lclient!rs;")
	public final Class2[] aClass2Array1;

	@OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(I)V")
	public Class246(@OriginalArg(0) int arg0) {
		this.anInt6537 = arg0;
		this.aClass2Array1 = new Class2[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class2 local23 = this.aClass2Array1[local13] = new Class2();
			local23.aClass2_244 = local23;
			local23.aClass2_243 = local23;
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "([Lclient!rs;B)I")
	public int method5605(@OriginalArg(0) Class2[] arg0) {
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < this.anInt6537; local15++) {
			@Pc(22) Class2 local22 = this.aClass2Array1[local15];
			for (@Pc(25) Class2 local25 = local22.aClass2_243; local25 != local22; local25 = local25.aClass2_243) {
				arg0[local13++] = local25;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)Lclient!rs;")
	public Class2 method5606() {
		this.anInt6539 = 0;
		return this.method5614();
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Z)I")
	public int method5607() {
		return this.anInt6537;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)Lclient!rs;")
	public Class2 method5608() {
		if (this.aClass2_241 == null) {
			return null;
		}
		@Pc(30) Class2 local30 = this.aClass2Array1[(int) (this.aLong208 & (long) (this.anInt6537 - 1))];
		while (local30 != this.aClass2_241) {
			if (this.aLong208 == this.aClass2_241.aLong209) {
				@Pc(46) Class2 local46 = this.aClass2_241;
				this.aClass2_241 = this.aClass2_241.aClass2_243;
				return local46;
			}
			this.aClass2_241 = this.aClass2_241.aClass2_243;
		}
		this.aClass2_241 = null;
		return null;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lclient!rs;IJ)V")
	public void method5609(@OriginalArg(0) Class2 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass2_244 != null) {
			arg0.method5617();
		}
		@Pc(21) Class2 local21 = this.aClass2Array1[(int) ((long) (this.anInt6537 - 1) & arg1)];
		arg0.aClass2_243 = local21;
		arg0.aClass2_244 = local21.aClass2_244;
		arg0.aClass2_244.aClass2_243 = arg0;
		arg0.aLong209 = arg1;
		arg0.aClass2_243.aClass2_244 = arg0;
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(B)V")
	public void method5610() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt6537; local1++) {
			@Pc(7) Class2 local7 = this.aClass2Array1[local1];
			while (true) {
				@Pc(10) Class2 local10 = local7.aClass2_243;
				if (local7 == local10) {
					break;
				}
				local10.method5617();
			}
		}
		this.aClass2_241 = null;
		this.aClass2_242 = null;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IJ)Lclient!rs;")
	public Class2 method5613(@OriginalArg(1) long arg0) {
		this.aLong208 = arg0;
		@Pc(18) Class2 local18 = this.aClass2Array1[(int) (arg0 & (long) (this.anInt6537 - 1))];
		for (this.aClass2_241 = local18.aClass2_243; this.aClass2_241 != local18; this.aClass2_241 = this.aClass2_241.aClass2_243) {
			if (this.aClass2_241.aLong209 == arg0) {
				@Pc(46) Class2 local46 = this.aClass2_241;
				this.aClass2_241 = this.aClass2_241.aClass2_243;
				return local46;
			}
		}
		this.aClass2_241 = null;
		return null;
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(Z)Lclient!rs;")
	public Class2 method5614() {
		@Pc(28) Class2 local28;
		if (this.anInt6539 > 0 && this.aClass2_242 != this.aClass2Array1[this.anInt6539 - 1]) {
			local28 = this.aClass2_242;
			this.aClass2_242 = local28.aClass2_243;
			return local28;
		}
		while (this.anInt6539 < this.anInt6537) {
			local28 = this.aClass2Array1[this.anInt6539++].aClass2_243;
			if (local28 != this.aClass2Array1[this.anInt6539 - 1]) {
				this.aClass2_242 = local28.aClass2_243;
				return local28;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "(Z)I")
	public int method5615() {
		@Pc(7) int local7 = 0;
		for (@Pc(14) int local14 = 0; local14 < this.anInt6537; local14++) {
			@Pc(21) Class2 local21 = this.aClass2Array1[local14];
			for (@Pc(24) Class2 local24 = local21.aClass2_243; local24 != local21; local24 = local24.aClass2_243) {
				local7++;
			}
		}
		return local7;
	}
}
