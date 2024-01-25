import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lh")
public final class Class124 {

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "[S")
	private short[] aShortArray84;

	@OriginalMember(owner = "client!lh", name = "j", descriptor = "[S")
	private short[] aShortArray85;

	@OriginalMember(owner = "client!lh", name = "l", descriptor = "[I")
	private int[] anIntArray344;

	@OriginalMember(owner = "client!lh", name = "m", descriptor = "[S")
	private short[] aShortArray86;

	@OriginalMember(owner = "client!lh", name = "s", descriptor = "[S")
	private short[] aShortArray87;

	@OriginalMember(owner = "client!lh", name = "k", descriptor = "[I")
	private final int[] anIntArray343 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!lh", name = "q", descriptor = "I")
	public int anInt3731 = -1;

	@OriginalMember(owner = "client!lh", name = "o", descriptor = "Z")
	public boolean aBoolean344 = false;

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)Z")
	public boolean method3426() {
		if (this.anIntArray344 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		@Pc(14) Class216 local14 = Static256.aClass216_83;
		synchronized (Static256.aClass216_83) {
			for (@Pc(18) int local18 = 0; local18 < this.anIntArray344.length; local18++) {
				if (!Static256.aClass216_83.method5657(0, this.anIntArray344[local18])) {
					local12 = false;
				}
			}
			return local12;
		}
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)Lclient!hf;")
	public Class82 method3427() {
		@Pc(15) Class82[] local15 = new Class82[5];
		@Pc(17) int local17 = 0;
		@Pc(19) Class216 local19 = Static256.aClass216_83;
		synchronized (Static256.aClass216_83) {
			for (@Pc(23) int local23 = 0; local23 < 5; local23++) {
				if (this.anIntArray343[local23] != -1) {
					local15[local17++] = Static221.method4154(this.anIntArray343[local23], Static256.aClass216_83);
				}
			}
		}
		@Pc(59) Class82 local59 = new Class82(local15, local17);
		@Pc(64) int local64;
		if (this.aShortArray85 != null) {
			for (local64 = 0; local64 < this.aShortArray85.length; local64++) {
				local59.method2345(this.aShortArray85[local64], this.aShortArray86[local64]);
			}
		}
		if (this.aShortArray87 != null) {
			for (local64 = 0; local64 < this.aShortArray87.length; local64++) {
				local59.method2353(this.aShortArray87[local64], this.aShortArray84[local64]);
			}
		}
		return local59;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(ZILclient!bg;)V")
	private void method3429(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 1) {
			this.anInt3731 = arg1.method4532();
			return;
		}
		@Pc(20) int local20;
		@Pc(26) int local26;
		if (arg0 == 2) {
			local20 = arg1.method4532();
			this.anIntArray344 = new int[local20];
			for (local26 = 0; local26 < local20; local26++) {
				this.anIntArray344[local26] = arg1.method4556();
			}
		} else if (arg0 == 3) {
			this.aBoolean344 = true;
		} else if (arg0 == 40) {
			local20 = arg1.method4532();
			this.aShortArray86 = new short[local20];
			this.aShortArray85 = new short[local20];
			for (local26 = 0; local26 < local20; local26++) {
				this.aShortArray85[local26] = (short) arg1.method4556();
				this.aShortArray86[local26] = (short) arg1.method4556();
			}
		} else if (arg0 == 41) {
			local20 = arg1.method4532();
			this.aShortArray84 = new short[local20];
			this.aShortArray87 = new short[local20];
			for (local26 = 0; local26 < local20; local26++) {
				this.aShortArray87[local26] = (short) arg1.method4556();
				this.aShortArray84[local26] = (short) arg1.method4556();
			}
		} else if (arg0 >= 60 && arg0 < 70) {
			this.anIntArray343[arg0 - 60] = arg1.method4556();
		}
	}

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "(I)Lclient!hf;")
	public Class82 method3430() {
		if (this.anIntArray344 == null) {
			return null;
		}
		@Pc(15) Class82[] local15 = new Class82[this.anIntArray344.length];
		@Pc(24) Class216 local24 = Static256.aClass216_83;
		synchronized (Static256.aClass216_83) {
			@Pc(28) int local28 = 0;
			while (true) {
				if (this.anIntArray344.length <= local28) {
					break;
				}
				local15[local28] = Static221.method4154(this.anIntArray344[local28], Static256.aClass216_83);
				local28++;
			}
		}
		@Pc(61) Class82 local61;
		if (local15.length == 1) {
			local61 = local15[0];
		} else {
			local61 = new Class82(local15, local15.length);
		}
		if (local61 == null) {
			return null;
		}
		@Pc(78) int local78;
		if (this.aShortArray85 != null) {
			for (local78 = 0; local78 < this.aShortArray85.length; local78++) {
				local61.method2345(this.aShortArray85[local78], this.aShortArray86[local78]);
			}
		}
		if (this.aShortArray87 != null) {
			for (local78 = 0; local78 < this.aShortArray87.length; local78++) {
				local61.method2353(this.aShortArray87[local78], this.aShortArray84[local78]);
			}
		}
		return local61;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)Z")
	public boolean method3431() {
		@Pc(15) boolean local15 = true;
		@Pc(17) Class216 local17 = Static256.aClass216_83;
		synchronized (Static256.aClass216_83) {
			for (@Pc(21) int local21 = 0; local21 < 5; local21++) {
				if (this.anIntArray343[local21] != -1 && !Static256.aClass216_83.method5657(0, this.anIntArray343[local21])) {
					local15 = false;
				}
			}
			return local15;
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lclient!bg;I)V")
	public void method3432(@OriginalArg(0) Class1_Sub8 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method4532();
			if (local17 == 0) {
				return;
			}
			this.method3429(local17, arg0);
		}
	}
}
