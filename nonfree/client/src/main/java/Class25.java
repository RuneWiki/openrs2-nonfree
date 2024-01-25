import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!baa")
public final class Class25 {

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "J")
	private long aLong26;

	@OriginalMember(owner = "client!baa", name = "d", descriptor = "Lclient!no;")
	private Class3 aClass3_29;

	@OriginalMember(owner = "client!baa", name = "q", descriptor = "Lclient!no;")
	private Class3 aClass3_30;

	@OriginalMember(owner = "client!baa", name = "p", descriptor = "I")
	private int anInt451 = 0;

	@OriginalMember(owner = "client!baa", name = "o", descriptor = "[Lclient!no;")
	public final Class3[] aClass3Array1;

	@OriginalMember(owner = "client!baa", name = "j", descriptor = "I")
	public final int anInt446;

	@OriginalMember(owner = "client!baa", name = "<init>", descriptor = "(I)V")
	public Class25(@OriginalArg(0) int arg0) {
		this.aClass3Array1 = new Class3[arg0];
		this.anInt446 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class3 local23 = this.aClass3Array1[local13] = new Class3();
			local23.aClass3_300 = local23;
			local23.aClass3_299 = local23;
		}
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(IJ)Lclient!no;")
	public Class3 method426(@OriginalArg(1) long arg0) {
		this.aLong26 = arg0;
		@Pc(25) Class3 local25 = this.aClass3Array1[(int) (arg0 & (long) (this.anInt446 - 1))];
		for (this.aClass3_29 = local25.aClass3_300; this.aClass3_29 != local25; this.aClass3_29 = this.aClass3_29.aClass3_300) {
			if (arg0 == this.aClass3_29.aLong277) {
				@Pc(39) Class3 local39 = this.aClass3_29;
				this.aClass3_29 = this.aClass3_29.aClass3_300;
				return local39;
			}
		}
		this.aClass3_29 = null;
		return null;
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(B)I")
	public int method428() {
		return this.anInt446;
	}

	@OriginalMember(owner = "client!baa", name = "b", descriptor = "(B)Lclient!no;")
	public Class3 method429() {
		if (this.aClass3_29 == null) {
			return null;
		}
		@Pc(31) Class3 local31 = this.aClass3Array1[(int) (this.aLong26 & (long) (this.anInt446 - 1))];
		while (this.aClass3_29 != local31) {
			if (this.aClass3_29.aLong277 == this.aLong26) {
				@Pc(43) Class3 local43 = this.aClass3_29;
				this.aClass3_29 = this.aClass3_29.aClass3_300;
				return local43;
			}
			this.aClass3_29 = this.aClass3_29.aClass3_300;
		}
		this.aClass3_29 = null;
		return null;
	}

	@OriginalMember(owner = "client!baa", name = "c", descriptor = "(B)I")
	public int method430() {
		@Pc(7) int local7 = 0;
		for (@Pc(15) int local15 = 0; local15 < this.anInt446; local15++) {
			@Pc(22) Class3 local22 = this.aClass3Array1[local15];
			@Pc(25) Class3 local25 = local22.aClass3_300;
			while (local25 != local22) {
				local25 = local25.aClass3_300;
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(B[Lclient!no;)I")
	public int method431(@OriginalArg(1) Class3[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(16) int local16 = 0; local16 < this.anInt446; local16++) {
			@Pc(23) Class3 local23 = this.aClass3Array1[local16];
			for (@Pc(26) Class3 local26 = local23.aClass3_300; local26 != local23; local26 = local26.aClass3_300) {
				arg0[local7++] = local26;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(I)Lclient!no;")
	public Class3 method432() {
		@Pc(27) Class3 local27;
		if (this.anInt451 > 0 && this.aClass3_30 != this.aClass3Array1[this.anInt451 - 1]) {
			local27 = this.aClass3_30;
			this.aClass3_30 = local27.aClass3_300;
			return local27;
		}
		while (this.anInt446 > this.anInt451) {
			local27 = this.aClass3Array1[this.anInt451++].aClass3_300;
			if (this.aClass3Array1[this.anInt451 - 1] != local27) {
				this.aClass3_30 = local27.aClass3_300;
				return local27;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!baa", name = "b", descriptor = "(I)V")
	public void method433() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt446; local7++) {
			@Pc(22) Class3 local22 = this.aClass3Array1[local7];
			while (true) {
				@Pc(25) Class3 local25 = local22.aClass3_300;
				if (local25 == local22) {
					break;
				}
				local25.method8682();
			}
		}
		this.aClass3_30 = null;
		this.aClass3_29 = null;
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(JBLclient!no;)V")
	public void method434(@OriginalArg(0) long arg0, @OriginalArg(2) Class3 arg1) {
		if (arg1.aClass3_299 != null) {
			arg1.method8682();
		}
		@Pc(28) Class3 local28 = this.aClass3Array1[(int) (arg0 & (long) (this.anInt446 - 1))];
		arg1.aClass3_300 = local28;
		arg1.aClass3_299 = local28.aClass3_299;
		arg1.aClass3_299.aClass3_300 = arg1;
		arg1.aClass3_300.aClass3_299 = arg1;
		arg1.aLong277 = arg0;
	}

	@OriginalMember(owner = "client!baa", name = "d", descriptor = "(B)Lclient!no;")
	public Class3 method435() {
		this.anInt451 = 0;
		return this.method432();
	}
}
