import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class34 {

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "Lclient!be;")
	private Class3 aClass3_33;

	@OriginalMember(owner = "client!hd", name = "j", descriptor = "J")
	private long aLong40;

	@OriginalMember(owner = "client!hd", name = "x", descriptor = "Lclient!be;")
	private Class3 aClass3_34;

	@OriginalMember(owner = "client!hd", name = "w", descriptor = "I")
	private int anInt1134 = 0;

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
	private final int anInt1126;

	@OriginalMember(owner = "client!hd", name = "r", descriptor = "[Lclient!be;")
	private final Class3[] aClass3Array1;

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(I)V")
	public Class34(@OriginalArg(0) int arg0) {
		this.anInt1126 = arg0;
		this.aClass3Array1 = new Class3[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class3 local23 = this.aClass3Array1[local13] = new Class3();
			local23.aClass3_98 = local23;
			local23.aClass3_97 = local23;
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(JLclient!be;Z)V")
	public void method792(@OriginalArg(0) long arg0, @OriginalArg(1) Class3 arg1) {
		if (arg1.aClass3_97 != null) {
			arg1.method1930();
		}
		@Pc(25) Class3 local25 = this.aClass3Array1[(int) (arg0 & (long) (this.anInt1126 - 1))];
		arg1.aClass3_98 = local25;
		arg1.aLong88 = arg0;
		arg1.aClass3_97 = local25.aClass3_97;
		arg1.aClass3_97.aClass3_98 = arg1;
		arg1.aClass3_98.aClass3_97 = arg1;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)Lclient!be;")
	private Class3 method793() {
		@Pc(22) Class3 local22;
		if (this.anInt1134 > 0 && this.aClass3Array1[this.anInt1134 - 1] != this.aClass3_34) {
			local22 = this.aClass3_34;
			this.aClass3_34 = local22.aClass3_98;
			return local22;
		}
		while (this.anInt1134 < this.anInt1126) {
			local22 = this.aClass3Array1[this.anInt1134++].aClass3_98;
			if (local22 != this.aClass3Array1[this.anInt1134 - 1]) {
				this.aClass3_34 = local22.aClass3_98;
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)Lclient!be;")
	public Class3 method794() {
		this.anInt1134 = 0;
		return this.method793();
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(JI)Lclient!be;")
	public Class3 method797(@OriginalArg(0) long arg0) {
		this.aLong40 = arg0;
		@Pc(23) Class3 local23 = this.aClass3Array1[(int) (arg0 & (long) (this.anInt1126 - 1))];
		for (this.aClass3_33 = local23.aClass3_98; this.aClass3_33 != local23; this.aClass3_33 = this.aClass3_33.aClass3_98) {
			if (this.aClass3_33.aLong88 == arg0) {
				@Pc(37) Class3 local37 = this.aClass3_33;
				this.aClass3_33 = this.aClass3_33.aClass3_98;
				return local37;
			}
		}
		this.aClass3_33 = null;
		return null;
	}

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "(I)Lclient!be;")
	public Class3 method799() {
		if (this.aClass3_33 == null) {
			return null;
		}
		@Pc(27) Class3 local27 = this.aClass3Array1[(int) ((long) (this.anInt1126 - 1) & this.aLong40)];
		while (this.aClass3_33 != local27) {
			if (this.aClass3_33.aLong88 == this.aLong40) {
				@Pc(42) Class3 local42 = this.aClass3_33;
				this.aClass3_33 = this.aClass3_33.aClass3_98;
				return local42;
			}
			this.aClass3_33 = this.aClass3_33.aClass3_98;
		}
		this.aClass3_33 = null;
		return null;
	}
}
