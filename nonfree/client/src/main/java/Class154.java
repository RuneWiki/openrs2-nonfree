import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class154 {

	@OriginalMember(owner = "client!md", name = "h", descriptor = "I")
	private int anInt4352;

	@OriginalMember(owner = "client!md", name = "p", descriptor = "I")
	private int anInt4356;

	@OriginalMember(owner = "client!md", name = "r", descriptor = "Lclient!f;")
	private Class80 aClass80_11;

	@OriginalMember(owner = "client!md", name = "g", descriptor = "I")
	private int anInt4351 = -1;

	@OriginalMember(owner = "client!md", name = "n", descriptor = "Z")
	private boolean aBoolean298 = true;

	@OriginalMember(owner = "client!md", name = "f", descriptor = "I")
	private final int anInt4350;

	@OriginalMember(owner = "client!md", name = "d", descriptor = "I")
	private final int anInt4348;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "I")
	private final int anInt4347;

	@OriginalMember(owner = "client!md", name = "o", descriptor = "[Lclient!vs;")
	private final Class257[] aClass257Array2;

	@OriginalMember(owner = "client!md", name = "j", descriptor = "I")
	private final int anInt4354;

	@OriginalMember(owner = "client!md", name = "k", descriptor = "[Lclient!vs;")
	private final Class257[] aClass257Array1;

	@OriginalMember(owner = "client!md", name = "b", descriptor = "Lclient!vs;")
	private final Class257 aClass257_1;

	static {
		new Class84("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
	}

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "(I[Lclient!vs;IIII)V")
	public Class154(@OriginalArg(0) int arg0, @OriginalArg(1) Class257[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt4350 = arg3;
		this.anInt4348 = arg4;
		this.anInt4347 = arg0;
		this.aClass257Array2 = arg1;
		this.anInt4354 = arg5;
		if (arg1 == null) {
			this.aClass257Array1 = null;
			this.aClass257_1 = null;
		} else {
			this.aClass257Array1 = new Class257[arg1.length];
			this.aClass257_1 = arg2 >= 0 ? arg1[arg2] : null;
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIIILclient!qa;III)V")
	public void method3594(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class109 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(11) int local11 = arg0 + arg8 & 0x3FFF;
		if (this.anInt4347 == -1) {
			arg5.NA(arg7, arg1, arg6, arg3, arg2, 0);
		} else {
			@Pc(23) Class151 local23 = Static212.anInterface7_2.method4836(this.anInt4347);
			if (this.aClass80_11 == null && Static212.anInterface7_2.method4837(this.anInt4347)) {
				@Pc(59) int[] local59 = local23.aBoolean296 ? Static212.anInterface7_2.method4839(false, this.anInt4352, 0.7F, this.anInt4352, this.anInt4347) : Static212.anInterface7_2.method4840(0.7F, this.anInt4347, this.anInt4352, this.anInt4352);
				this.aClass80_11 = arg5.method4739(local59, this.anInt4352, this.anInt4352, this.anInt4352);
			}
			if (!local23.aBoolean296) {
				arg5.NA(arg7, arg1, arg6, arg3, arg2, 0);
			}
			if (this.aClass80_11 != null) {
				@Pc(92) int local92 = local23.aBoolean296 ? 0 : 1;
				@Pc(98) int local98 = arg4 * arg3 / -4096;
				@Pc(110) int local110;
				for (local110 = arg3 * local11 / 4096 + (arg6 - arg3) / 2; local110 > arg3; local110 -= arg3) {
				}
				while (arg3 < local98) {
					local98 -= arg3;
				}
				while (local110 < 0) {
					local110 += arg3;
				}
				while (local98 < 0) {
					local98 += arg3;
				}
				for (@Pc(156) int local156 = local110 - arg3; local156 < arg6; local156 += arg3) {
					for (@Pc(163) int local163 = local98 - arg3; local163 < arg3; local163 += arg3) {
						this.aClass80_11.M(arg7 + local156, local163 + arg1, arg3, arg3, 1, 0, local92);
					}
				}
			}
		}
		for (@Pc(216) int local216 = this.anInt4356 - 1; local216 >= 0; local216--) {
			this.aClass257Array1[local216].method5772(arg5, arg7, arg1, arg6, arg3, arg4, local11);
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V")
	public void method3595() {
		if (this.aClass257Array2 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.aClass257Array2.length; local6++) {
				this.aClass257Array2[local6].method5769();
			}
		}
		this.aClass80_11 = null;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!qa;IB)Z")
	public boolean method3597(@OriginalArg(0) Class109 arg0, @OriginalArg(1) int arg1) {
		if (this.anInt4351 != arg1) {
			this.anInt4351 = arg1;
			@Pc(16) int local16 = Static100.method1552(arg1);
			if (arg1 < local16) {
				local16 = Static296.method2396(arg1);
			}
			if (local16 > 512) {
				local16 = 512;
			}
			if (local16 != this.anInt4352) {
				this.anInt4352 = local16;
				this.aClass80_11 = null;
			}
			if (this.aClass257Array2 != null) {
				this.anInt4356 = 0;
				@Pc(55) int[] local55 = new int[this.aClass257Array2.length];
				for (@Pc(57) int local57 = 0; local57 < this.aClass257Array2.length; local57++) {
					@Pc(64) Class257 local64 = this.aClass257Array2[local57];
					if (local64.method5766(this.anInt4350, this.anInt4348, this.anInt4354, this.anInt4351)) {
						local55[this.anInt4356] = local64.anInt7445;
						this.aClass257Array1[this.anInt4356++] = local64;
					}
				}
				Static220.method3315(local55, this.aClass257Array1, 0, this.anInt4356 - 1);
			}
			this.aBoolean298 = true;
		}
		@Pc(126) boolean local126 = false;
		if (this.aBoolean298) {
			this.aBoolean298 = false;
			for (@Pc(137) int local137 = this.anInt4356 - 1; local137 >= 0; local137--) {
				@Pc(148) boolean local148 = this.aClass257Array1[local137].method5771(arg0, this.aClass257_1);
				this.aBoolean298 |= !local148;
				local126 |= local148;
			}
		}
		return local126;
	}
}
