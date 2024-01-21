import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class51 {

	@OriginalMember(owner = "client!md", name = "i", descriptor = "Lclient!vd;")
	private Class2 aClass2_139;

	@OriginalMember(owner = "client!md", name = "l", descriptor = "J")
	private long aLong104;

	@OriginalMember(owner = "client!md", name = "r", descriptor = "Lclient!vd;")
	private Class2 aClass2_140;

	@OriginalMember(owner = "client!md", name = "u", descriptor = "I")
	private int anInt3130 = 0;

	@OriginalMember(owner = "client!md", name = "j", descriptor = "I")
	private final int anInt3124;

	@OriginalMember(owner = "client!md", name = "k", descriptor = "[Lclient!vd;")
	private final Class2[] aClass2Array1;

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "(I)V")
	public Class51(@OriginalArg(0) int arg0) {
		this.anInt3124 = arg0;
		this.aClass2Array1 = new Class2[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class2 local23 = this.aClass2Array1[local13] = new Class2();
			local23.aClass2_217 = local23;
			local23.aClass2_218 = local23;
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(JI)Lclient!vd;")
	public Class2 method2458(@OriginalArg(0) long arg0) {
		this.aLong104 = arg0;
		@Pc(14) Class2 local14 = this.aClass2Array1[(int) (arg0 & (long) (this.anInt3124 - 1))];
		for (this.aClass2_139 = local14.aClass2_218; this.aClass2_139 != local14; this.aClass2_139 = this.aClass2_139.aClass2_218) {
			if (this.aClass2_139.aLong151 == arg0) {
				@Pc(36) Class2 local36 = this.aClass2_139;
				this.aClass2_139 = this.aClass2_139.aClass2_218;
				return local36;
			}
		}
		this.aClass2_139 = null;
		return null;
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(I)Lclient!vd;")
	public Class2 method2459() {
		if (this.aClass2_139 == null) {
			return null;
		}
		@Pc(21) Class2 local21 = this.aClass2Array1[(int) ((long) (this.anInt3124 - 1) & this.aLong104)];
		while (local21 != this.aClass2_139) {
			if (this.aClass2_139.aLong151 == this.aLong104) {
				@Pc(36) Class2 local36 = this.aClass2_139;
				this.aClass2_139 = this.aClass2_139.aClass2_218;
				return local36;
			}
			this.aClass2_139 = this.aClass2_139.aClass2_218;
		}
		this.aClass2_139 = null;
		return null;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(B)Lclient!vd;")
	public Class2 method2462() {
		@Pc(19) Class2 local19;
		if (this.anInt3130 > 0 && this.aClass2_140 != this.aClass2Array1[this.anInt3130 - 1]) {
			local19 = this.aClass2_140;
			this.aClass2_140 = local19.aClass2_218;
			return local19;
		}
		while (this.anInt3130 < this.anInt3124) {
			local19 = this.aClass2Array1[this.anInt3130++].aClass2_218;
			if (local19 != this.aClass2Array1[this.anInt3130 - 1]) {
				this.aClass2_140 = local19.aClass2_218;
				return local19;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!vd;JZ)V")
	public void method2463(@OriginalArg(0) Class2 arg0, @OriginalArg(1) long arg1) {
		if (arg0.aClass2_217 != null) {
			arg0.method3556();
		}
		@Pc(22) Class2 local22 = this.aClass2Array1[(int) (arg1 & (long) (this.anInt3124 - 1))];
		arg0.aLong151 = arg1;
		arg0.aClass2_217 = local22.aClass2_217;
		arg0.aClass2_218 = local22;
		arg0.aClass2_217.aClass2_218 = arg0;
		arg0.aClass2_218.aClass2_217 = arg0;
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(B)Lclient!vd;")
	public Class2 method2465() {
		this.anInt3130 = 0;
		return this.method2462();
	}
}
