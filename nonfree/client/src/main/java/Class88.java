import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jl")
public final class Class88 {

	@OriginalMember(owner = "client!jl", name = "i", descriptor = "[I")
	private int[] anIntArray304;

	@OriginalMember(owner = "client!jl", name = "j", descriptor = "[S")
	private short[] aShortArray64;

	@OriginalMember(owner = "client!jl", name = "p", descriptor = "[S")
	private short[] aShortArray65;

	@OriginalMember(owner = "client!jl", name = "r", descriptor = "[S")
	private short[] aShortArray66;

	@OriginalMember(owner = "client!jl", name = "w", descriptor = "[S")
	private short[] aShortArray67;

	@OriginalMember(owner = "client!jl", name = "q", descriptor = "[I")
	private int[] anIntArray305 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!jl", name = "s", descriptor = "I")
	public int anInt2614 = -1;

	@OriginalMember(owner = "client!jl", name = "v", descriptor = "Z")
	public boolean aBoolean194 = false;

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IILclient!ug;)V")
	private void method2320(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub26 arg1) {
		if (arg0 == 1) {
			this.anInt2614 = arg1.method3915();
			return;
		}
		@Pc(19) int local19;
		@Pc(25) int local25;
		if (arg0 == 2) {
			local19 = arg1.method3915();
			this.anIntArray304 = new int[local19];
			for (local25 = 0; local25 < local19; local25++) {
				this.anIntArray304[local25] = arg1.method3948();
			}
		} else if (arg0 == 3) {
			this.aBoolean194 = true;
		} else if (arg0 == 40) {
			local19 = arg1.method3915();
			this.aShortArray64 = new short[local19];
			this.aShortArray65 = new short[local19];
			for (local25 = 0; local25 < local19; local25++) {
				this.aShortArray64[local25] = (short) arg1.method3948();
				this.aShortArray65[local25] = (short) arg1.method3948();
			}
		} else if (arg0 == 41) {
			local19 = arg1.method3915();
			this.aShortArray67 = new short[local19];
			this.aShortArray66 = new short[local19];
			for (local25 = 0; local25 < local19; local25++) {
				this.aShortArray66[local25] = (short) arg1.method3948();
				this.aShortArray67[local25] = (short) arg1.method3948();
			}
		} else if (arg0 >= 60 && arg0 < 70) {
			this.anIntArray305[arg0 - 60] = arg1.method3948();
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)Lclient!d;")
	public Class10_Sub3 method2321() {
		@Pc(8) Class10_Sub3[] local8 = new Class10_Sub3[5];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < 5; local12++) {
			if (this.anIntArray305[local12] != -1) {
				local8[local10++] = Static46.method722(Static285.aClass155_116, this.anIntArray305[local12]);
			}
		}
		@Pc(45) Class10_Sub3 local45 = new Class10_Sub3(local8, local10);
		@Pc(51) int local51;
		if (this.aShortArray64 != null) {
			for (local51 = 0; local51 < this.aShortArray64.length; local51++) {
				local45.method728(this.aShortArray64[local51], this.aShortArray65[local51]);
			}
		}
		if (this.aShortArray66 != null) {
			for (local51 = 0; local51 < this.aShortArray66.length; local51++) {
				local45.method719(this.aShortArray66[local51], this.aShortArray67[local51]);
			}
		}
		return local45;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILclient!ug;)V")
	public void method2323(@OriginalArg(1) Class3_Sub26 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method3915();
			if (local9 == 0) {
				return;
			}
			this.method2320(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)Z")
	public boolean method2324() {
		@Pc(13) boolean local13 = true;
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			if (this.anIntArray305[local15] != -1 && !Static285.aClass155_116.method4144(0, this.anIntArray305[local15])) {
				local13 = false;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Z)Lclient!d;")
	public Class10_Sub3 method2325() {
		if (this.anIntArray304 == null) {
			return null;
		}
		@Pc(16) Class10_Sub3[] local16 = new Class10_Sub3[this.anIntArray304.length];
		for (@Pc(18) int local18 = 0; local18 < this.anIntArray304.length; local18++) {
			local16[local18] = Static46.method722(Static285.aClass155_116, this.anIntArray304[local18]);
		}
		@Pc(53) Class10_Sub3 local53;
		if (local16.length == 1) {
			local53 = local16[0];
		} else {
			local53 = new Class10_Sub3(local16, local16.length);
		}
		@Pc(67) int local67;
		if (this.aShortArray64 != null) {
			for (local67 = 0; local67 < this.aShortArray64.length; local67++) {
				local53.method728(this.aShortArray64[local67], this.aShortArray65[local67]);
			}
		}
		if (this.aShortArray66 != null) {
			for (local67 = 0; local67 < this.aShortArray66.length; local67++) {
				local53.method719(this.aShortArray66[local67], this.aShortArray67[local67]);
			}
		}
		return local53;
	}

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "(Z)Z")
	public boolean method2326() {
		if (this.anIntArray304 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray304.length; local14++) {
			if (!Static285.aClass155_116.method4144(0, this.anIntArray304[local14])) {
				local12 = false;
			}
		}
		return local12;
	}
}
