import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aa")
public final class Class2 {

	@OriginalMember(owner = "client!aa", name = "y", descriptor = "J")
	private long aLong2;

	@OriginalMember(owner = "client!aa", name = "G", descriptor = "Lclient!kd;")
	private Class6 aClass6_3;

	@OriginalMember(owner = "client!aa", name = "J", descriptor = "Lclient!kd;")
	private Class6 aClass6_4;

	@OriginalMember(owner = "client!aa", name = "K", descriptor = "I")
	private int anInt34 = 0;

	@OriginalMember(owner = "client!aa", name = "w", descriptor = "[Lclient!kd;")
	private final Class6[] aClass6Array1;

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
	private final int anInt19;

	@OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(I)V")
	public Class2(@OriginalArg(0) int arg0) {
		this.aClass6Array1 = new Class6[arg0];
		this.anInt19 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class6 local23 = this.aClass6Array1[local13] = new Class6();
			local23.aClass6_115 = local23;
			local23.aClass6_116 = local23;
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!kd;JI)V")
	public void method18(@OriginalArg(0) Class6 arg0, @OriginalArg(1) long arg1) {
		if (arg0.aClass6_115 != null) {
			arg0.method2123();
		}
		@Pc(21) Class6 local21 = this.aClass6Array1[(int) (arg1 & (long) (this.anInt19 - 1))];
		arg0.aClass6_116 = local21;
		arg0.aClass6_115 = local21.aClass6_115;
		arg0.aLong91 = arg1;
		arg0.aClass6_115.aClass6_116 = arg0;
		arg0.aClass6_116.aClass6_115 = arg0;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(JZ)Lclient!kd;")
	public Class6 method20(@OriginalArg(0) long arg0) {
		this.aLong2 = arg0;
		@Pc(23) Class6 local23 = this.aClass6Array1[(int) (arg0 & (long) (this.anInt19 - 1))];
		for (this.aClass6_3 = local23.aClass6_116; this.aClass6_3 != local23; this.aClass6_3 = this.aClass6_3.aClass6_116) {
			if (this.aClass6_3.aLong91 == arg0) {
				@Pc(37) Class6 local37 = this.aClass6_3;
				this.aClass6_3 = this.aClass6_3.aClass6_116;
				return local37;
			}
		}
		this.aClass6_3 = null;
		return null;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)Lclient!kd;")
	public Class6 method21() {
		@Pc(20) Class6 local20;
		if (this.anInt34 > 0 && this.aClass6Array1[this.anInt34 - 1] != this.aClass6_4) {
			local20 = this.aClass6_4;
			this.aClass6_4 = local20.aClass6_116;
			return local20;
		}
		while (this.anInt34 < this.anInt19) {
			local20 = this.aClass6Array1[this.anInt34++].aClass6_116;
			if (this.aClass6Array1[this.anInt34 - 1] != local20) {
				this.aClass6_4 = local20.aClass6_116;
				return local20;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)Lclient!kd;")
	public Class6 method22() {
		if (this.aClass6_3 == null) {
			return null;
		}
		@Pc(29) Class6 local29 = this.aClass6Array1[(int) ((long) (this.anInt19 - 1) & this.aLong2)];
		while (local29 != this.aClass6_3) {
			if (this.aClass6_3.aLong91 == this.aLong2) {
				@Pc(44) Class6 local44 = this.aClass6_3;
				this.aClass6_3 = this.aClass6_3.aClass6_116;
				return local44;
			}
			this.aClass6_3 = this.aClass6_3.aClass6_116;
		}
		this.aClass6_3 = null;
		return null;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Z)Lclient!kd;")
	public Class6 method25() {
		this.anInt34 = 0;
		return this.method21();
	}
}
