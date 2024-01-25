import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class215 {

	@OriginalMember(owner = "client!md", name = "a", descriptor = "I")
	private int anInt6251;

	@OriginalMember(owner = "client!md", name = "b", descriptor = "Lclient!f;")
	private Class78 aClass78_12;

	@OriginalMember(owner = "client!md", name = "m", descriptor = "I")
	private int anInt6257;

	@OriginalMember(owner = "client!md", name = "h", descriptor = "Z")
	private boolean aBoolean454 = true;

	@OriginalMember(owner = "client!md", name = "s", descriptor = "I")
	private int anInt6258 = -1;

	@OriginalMember(owner = "client!md", name = "u", descriptor = "I")
	private final int anInt6260;

	@OriginalMember(owner = "client!md", name = "d", descriptor = "I")
	private final int anInt6252;

	@OriginalMember(owner = "client!md", name = "f", descriptor = "I")
	private final int anInt6253;

	@OriginalMember(owner = "client!md", name = "g", descriptor = "I")
	private final int anInt6254;

	@OriginalMember(owner = "client!md", name = "r", descriptor = "[Lclient!uu;")
	private final Class333[] aClass333Array2;

	@OriginalMember(owner = "client!md", name = "e", descriptor = "[Lclient!uu;")
	private final Class333[] aClass333Array1;

	@OriginalMember(owner = "client!md", name = "j", descriptor = "Lclient!uu;")
	private final Class333 aClass333_1;

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "(I[Lclient!uu;IIII)V")
	public Class215(@OriginalArg(0) int arg0, @OriginalArg(1) Class333[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt6260 = arg3;
		this.anInt6252 = arg5;
		this.anInt6253 = arg0;
		this.anInt6254 = arg4;
		this.aClass333Array2 = arg1;
		if (arg1 == null) {
			this.aClass333Array1 = null;
			this.aClass333_1 = null;
		} else {
			this.aClass333Array1 = new Class333[arg1.length];
			this.aClass333_1 = arg2 < 0 ? null : arg1[arg2];
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IBLclient!r;)Z")
	public boolean method5316(@OriginalArg(0) int arg0, @OriginalArg(2) Class44 arg1) {
		if (arg0 != this.anInt6258) {
			this.anInt6258 = arg0;
			@Pc(12) int local12 = Static563.method8072(arg0);
			if (local12 > 512) {
				local12 = 512;
			}
			if (local12 <= 0) {
				local12 = 1;
			}
			if (this.anInt6251 != local12) {
				this.anInt6251 = local12;
				this.aClass78_12 = null;
			}
			if (this.aClass333Array2 != null) {
				this.anInt6257 = 0;
				@Pc(42) int[] local42 = new int[this.aClass333Array2.length];
				for (@Pc(44) int local44 = 0; local44 < this.aClass333Array2.length; local44++) {
					@Pc(51) Class333 local51 = this.aClass333Array2[local44];
					if (local51.method7902(this.anInt6260, this.anInt6254, this.anInt6252, this.anInt6258)) {
						local42[this.anInt6257] = local51.anInt9668;
						this.aClass333Array1[this.anInt6257++] = local51;
					}
				}
				Static146.method2803(0, this.aClass333Array1, this.anInt6257 - 1, local42);
			}
			this.aBoolean454 = true;
		}
		@Pc(110) boolean local110 = false;
		if (this.aBoolean454) {
			this.aBoolean454 = false;
			for (@Pc(121) int local121 = this.anInt6257 - 1; local121 >= 0; local121--) {
				@Pc(132) boolean local132 = this.aClass333Array1[local121].method7899(arg1, this.aClass333_1);
				local110 |= local132;
				this.aBoolean454 |= !local132;
			}
		}
		return local110;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIILclient!r;IIIIII)V")
	public void method5317(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class44 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(11) int local11 = arg5 + arg1 & 0x3FFF;
		if (this.anInt6253 == -1) {
			arg2.J(arg3, arg6, arg7, arg0, arg4, 0);
		} else {
			@Pc(37) Class14 local37 = Static208.anInterface11_6.method7405(this.anInt6253);
			if (this.aClass78_12 == null && Static208.anInterface11_6.method7407(this.anInt6253)) {
				@Pc(75) int[] local75 = local37.aBoolean15 ? Static208.anInterface11_6.method7406(this.anInt6251, this.anInt6253, this.anInt6251, 0.7F) : Static208.anInterface11_6.method7408(this.anInt6251, false, this.anInt6251, this.anInt6253, 0.7F);
				this.aClass78_12 = arg2.method4969(local75, this.anInt6251, this.anInt6251, this.anInt6251);
			}
			if (local37.aBoolean15) {
				arg2.J(arg3, arg6, arg7, arg0, arg4, 0);
			}
			if (this.aClass78_12 != null) {
				@Pc(108) int local108 = local37.aBoolean15 ? 1 : 0;
				@Pc(114) int local114 = arg0 * arg8 / -4096;
				@Pc(127) int local127;
				for (local127 = local11 * arg0 / 4096 + (arg7 - arg0) / 2; local127 > arg0; local127 -= arg0) {
				}
				while (local127 < 0) {
					local127 += arg0;
				}
				while (local114 > arg0) {
					local114 -= arg0;
				}
				while (local114 < 0) {
					local114 += arg0;
				}
				for (@Pc(169) int local169 = local127 - arg0; local169 < arg7; local169 += arg0) {
					for (@Pc(176) int local176 = local114 - arg0; local176 < arg0; local176 += arg0) {
						this.aClass78_12.method8194(arg3 + local169, arg6 + local176, arg0, arg0, 1, 0, local108);
					}
				}
			}
		}
		for (@Pc(215) int local215 = this.anInt6257 - 1; local215 >= 0; local215--) {
			this.aClass333Array1[local215].method7893(arg2, arg3, arg6, arg7, arg0, arg8, local11);
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V")
	public void method5319() {
		if (this.aClass333Array2 != null) {
			for (@Pc(19) int local19 = 0; local19 < this.aClass333Array2.length; local19++) {
				this.aClass333Array2[local19].method7896();
			}
		}
		this.aClass78_12 = null;
	}
}
