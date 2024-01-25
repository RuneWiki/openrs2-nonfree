import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wr")
public final class Class380 {

	@OriginalMember(owner = "client!wr", name = "e", descriptor = "J")
	private long aLong276;

	@OriginalMember(owner = "client!wr", name = "m", descriptor = "Lclient!gda;")
	private Class6 aClass6_295;

	@OriginalMember(owner = "client!wr", name = "q", descriptor = "Lclient!gda;")
	private Class6 aClass6_296;

	@OriginalMember(owner = "client!wr", name = "r", descriptor = "I")
	private int anInt10736 = 0;

	@OriginalMember(owner = "client!wr", name = "c", descriptor = "I")
	public final int anInt10726;

	@OriginalMember(owner = "client!wr", name = "d", descriptor = "[Lclient!gda;")
	public final Class6[] aClass6Array1;

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(I)V")
	public Class380(@OriginalArg(0) int arg0) {
		this.anInt10726 = arg0;
		this.aClass6Array1 = new Class6[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class6 local23 = this.aClass6Array1[local13] = new Class6();
			local23.aClass6_299 = local23;
			local23.aClass6_300 = local23;
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(JI)Lclient!gda;")
	public Class6 method8747(@OriginalArg(0) long arg0) {
		this.aLong276 = arg0;
		@Pc(20) Class6 local20 = this.aClass6Array1[(int) (arg0 & (long) (this.anInt10726 - 1))];
		for (this.aClass6_295 = local20.aClass6_300; this.aClass6_295 != local20; this.aClass6_295 = this.aClass6_295.aClass6_300) {
			if (arg0 == this.aClass6_295.aLong278) {
				@Pc(39) Class6 local39 = this.aClass6_295;
				this.aClass6_295 = this.aClass6_295.aClass6_300;
				return local39;
			}
		}
		this.aClass6_295 = null;
		return null;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "([Lclient!gda;B)I")
	public int method8749(@OriginalArg(0) Class6[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt10726; local9++) {
			@Pc(16) Class6 local16 = this.aClass6Array1[local9];
			for (@Pc(19) Class6 local19 = local16.aClass6_300; local19 != local16; local19 = local19.aClass6_300) {
				arg0[local7++] = local19;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(I)Lclient!gda;")
	public Class6 method8750() {
		if (this.aClass6_295 == null) {
			return null;
		}
		@Pc(23) Class6 local23 = this.aClass6Array1[(int) ((long) (this.anInt10726 - 1) & this.aLong276)];
		while (this.aClass6_295 != local23) {
			if (this.aLong276 == this.aClass6_295.aLong278) {
				@Pc(39) Class6 local39 = this.aClass6_295;
				this.aClass6_295 = this.aClass6_295.aClass6_300;
				return local39;
			}
			this.aClass6_295 = this.aClass6_295.aClass6_300;
		}
		this.aClass6_295 = null;
		return null;
	}

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "(I)V")
	public void method8751() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt10726; local3++) {
			@Pc(10) Class6 local10 = this.aClass6Array1[local3];
			while (true) {
				@Pc(13) Class6 local13 = local10.aClass6_300;
				if (local13 == local10) {
					break;
				}
				local13.method8792();
			}
		}
		this.aClass6_295 = null;
		this.aClass6_296 = null;
	}

	@OriginalMember(owner = "client!wr", name = "c", descriptor = "(I)Lclient!gda;")
	public Class6 method8752() {
		@Pc(22) Class6 local22;
		if (this.anInt10736 > 0 && this.aClass6Array1[this.anInt10736 - 1] != this.aClass6_296) {
			local22 = this.aClass6_296;
			this.aClass6_296 = local22.aClass6_300;
			return local22;
		}
		while (this.anInt10736 < this.anInt10726) {
			local22 = this.aClass6Array1[this.anInt10736++].aClass6_300;
			if (local22 != this.aClass6Array1[this.anInt10736 - 1]) {
				this.aClass6_296 = local22.aClass6_300;
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lclient!gda;JI)V")
	public void method8753(@OriginalArg(0) Class6 arg0, @OriginalArg(1) long arg1) {
		if (arg0.aClass6_299 != null) {
			arg0.method8792();
		}
		@Pc(21) Class6 local21 = this.aClass6Array1[(int) (arg1 & (long) (this.anInt10726 - 1))];
		arg0.aClass6_300 = local21;
		arg0.aClass6_299 = local21.aClass6_299;
		arg0.aClass6_299.aClass6_300 = arg0;
		arg0.aLong278 = arg1;
		arg0.aClass6_300.aClass6_299 = arg0;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(B)I")
	public int method8754() {
		return this.anInt10726;
	}

	@OriginalMember(owner = "client!wr", name = "d", descriptor = "(I)Lclient!gda;")
	public Class6 method8755() {
		this.anInt10736 = 0;
		return this.method8752();
	}

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "(B)I")
	public int method8756() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt10726; local9++) {
			@Pc(16) Class6 local16 = this.aClass6Array1[local9];
			for (@Pc(19) Class6 local19 = local16.aClass6_300; local19 != local16; local19 = local19.aClass6_300) {
				local7++;
			}
		}
		return local7;
	}
}
