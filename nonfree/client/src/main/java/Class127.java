import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jr")
public final class Class127 {

	@OriginalMember(owner = "client!jr", name = "h", descriptor = "Lclient!lf;")
	private Class3 aClass3_128;

	@OriginalMember(owner = "client!jr", name = "n", descriptor = "J")
	private long aLong119;

	@OriginalMember(owner = "client!jr", name = "v", descriptor = "Lclient!lf;")
	private Class3 aClass3_129;

	@OriginalMember(owner = "client!jr", name = "u", descriptor = "I")
	private int anInt3953 = 0;

	@OriginalMember(owner = "client!jr", name = "k", descriptor = "I")
	public final int anInt3945;

	@OriginalMember(owner = "client!jr", name = "c", descriptor = "[Lclient!lf;")
	public final Class3[] aClass3Array1;

	static {
		new Class175("I can't reach that!", "Da kommst du nicht hin.", "Je ne peux pas l'atteindre !", "Não consigo alcançar!");
	}

	@OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(I)V")
	public Class127(@OriginalArg(0) int arg0) {
		this.anInt3945 = arg0;
		this.aClass3Array1 = new Class3[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class3 local23 = this.aClass3Array1[local13] = new Class3();
			local23.aClass3_261 = local23;
			local23.aClass3_262 = local23;
		}
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(JI)Lclient!lf;")
	public Class3 method3246(@OriginalArg(0) long arg0) {
		this.aLong119 = arg0;
		@Pc(23) Class3 local23 = this.aClass3Array1[(int) ((long) (this.anInt3945 - 1) & arg0)];
		for (this.aClass3_128 = local23.aClass3_261; this.aClass3_128 != local23; this.aClass3_128 = this.aClass3_128.aClass3_261) {
			if (arg0 == this.aClass3_128.aLong227) {
				@Pc(41) Class3 local41 = this.aClass3_128;
				this.aClass3_128 = this.aClass3_128.aClass3_261;
				return local41;
			}
		}
		this.aClass3_128 = null;
		return null;
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(I)Lclient!lf;")
	public Class3 method3248() {
		this.anInt3953 = 0;
		return this.method3252();
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(B)V")
	public void method3249() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3945; local1++) {
			@Pc(7) Class3 local7 = this.aClass3Array1[local1];
			while (true) {
				@Pc(10) Class3 local10 = local7.aClass3_261;
				if (local10 == local7) {
					break;
				}
				local10.method5987();
			}
		}
		this.aClass3_128 = null;
		this.aClass3_129 = null;
	}

	@OriginalMember(owner = "client!jr", name = "c", descriptor = "(I)Lclient!lf;")
	public Class3 method3252() {
		@Pc(19) Class3 local19;
		if (this.anInt3953 > 0 && this.aClass3Array1[this.anInt3953 - 1] != this.aClass3_129) {
			local19 = this.aClass3_129;
			this.aClass3_129 = local19.aClass3_261;
			return local19;
		}
		while (this.anInt3953 < this.anInt3945) {
			local19 = this.aClass3Array1[this.anInt3953++].aClass3_261;
			if (this.aClass3Array1[this.anInt3953 - 1] != local19) {
				this.aClass3_129 = local19.aClass3_261;
				return local19;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!jr", name = "d", descriptor = "(I)Lclient!lf;")
	public Class3 method3254() {
		if (this.aClass3_128 == null) {
			return null;
		}
		@Pc(27) Class3 local27 = this.aClass3Array1[(int) ((long) (this.anInt3945 - 1) & this.aLong119)];
		while (local27 != this.aClass3_128) {
			if (this.aClass3_128.aLong227 == this.aLong119) {
				@Pc(38) Class3 local38 = this.aClass3_128;
				this.aClass3_128 = this.aClass3_128.aClass3_261;
				return local38;
			}
			this.aClass3_128 = this.aClass3_128.aClass3_261;
		}
		this.aClass3_128 = null;
		return null;
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(B)I")
	public int method3255() {
		return this.anInt3945;
	}

	@OriginalMember(owner = "client!jr", name = "e", descriptor = "(I)I")
	public int method3256() {
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt3945; local7++) {
			@Pc(13) Class3 local13 = this.aClass3Array1[local7];
			@Pc(16) Class3 local16 = local13.aClass3_261;
			while (local16 != local13) {
				local16 = local16.aClass3_261;
				local5++;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(JLclient!lf;B)V")
	public void method3257(@OriginalArg(0) long arg0, @OriginalArg(1) Class3 arg1) {
		if (arg1.aClass3_262 != null) {
			arg1.method5987();
		}
		@Pc(25) Class3 local25 = this.aClass3Array1[(int) (arg0 & (long) (this.anInt3945 - 1))];
		arg1.aClass3_262 = local25.aClass3_262;
		arg1.aClass3_261 = local25;
		arg1.aClass3_262.aClass3_261 = arg1;
		arg1.aLong227 = arg0;
		arg1.aClass3_261.aClass3_262 = arg1;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(B[Lclient!lf;)I")
	public int method3258(@OriginalArg(1) Class3[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(14) int local14 = 0; local14 < this.anInt3945; local14++) {
			@Pc(21) Class3 local21 = this.aClass3Array1[local14];
			for (@Pc(24) Class3 local24 = local21.aClass3_261; local24 != local21; local24 = local24.aClass3_261) {
				arg0[local7++] = local24;
			}
		}
		return local7;
	}
}
