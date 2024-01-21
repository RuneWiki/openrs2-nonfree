import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class54 {

	@OriginalMember(owner = "client!lc", name = "r", descriptor = "J")
	private long aLong72;

	@OriginalMember(owner = "client!lc", name = "t", descriptor = "Lclient!n;")
	private Class3 aClass3_103;

	@OriginalMember(owner = "client!lc", name = "x", descriptor = "Lclient!n;")
	private Class3 aClass3_104;

	@OriginalMember(owner = "client!lc", name = "w", descriptor = "I")
	private int anInt2121 = 0;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "[Lclient!n;")
	private final Class3[] aClass3Array1;

	@OriginalMember(owner = "client!lc", name = "m", descriptor = "I")
	private final int anInt2115;

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(I)V")
	public Class54(@OriginalArg(0) int arg0) {
		this.aClass3Array1 = new Class3[arg0];
		this.anInt2115 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class3 local23 = this.aClass3Array1[local13] = new Class3();
			local23.aClass3_216 = local23;
			local23.aClass3_215 = local23;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(JLclient!n;Z)V")
	public void method1494(@OriginalArg(0) long arg0, @OriginalArg(1) Class3 arg1) {
		if (arg1.aClass3_216 != null) {
			arg1.method3159();
		}
		@Pc(26) Class3 local26 = this.aClass3Array1[(int) ((long) (this.anInt2115 - 1) & arg0)];
		arg1.aLong154 = arg0;
		arg1.aClass3_216 = local26.aClass3_216;
		arg1.aClass3_215 = local26;
		arg1.aClass3_216.aClass3_215 = arg1;
		arg1.aClass3_215.aClass3_216 = arg1;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)Lclient!n;")
	public Class3 method1495() {
		if (this.aClass3_103 == null) {
			return null;
		}
		@Pc(21) Class3 local21 = this.aClass3Array1[(int) ((long) (this.anInt2115 - 1) & this.aLong72)];
		while (this.aClass3_103 != local21) {
			if (this.aClass3_103.aLong154 == this.aLong72) {
				@Pc(36) Class3 local36 = this.aClass3_103;
				this.aClass3_103 = this.aClass3_103.aClass3_215;
				return local36;
			}
			this.aClass3_103 = this.aClass3_103.aClass3_215;
		}
		this.aClass3_103 = null;
		return null;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IJ)Lclient!n;")
	public Class3 method1496(@OriginalArg(1) long arg0) {
		this.aLong72 = arg0;
		@Pc(18) Class3 local18 = this.aClass3Array1[(int) ((long) (this.anInt2115 - 1) & arg0)];
		for (this.aClass3_103 = local18.aClass3_215; this.aClass3_103 != local18; this.aClass3_103 = this.aClass3_103.aClass3_215) {
			if (arg0 == this.aClass3_103.aLong154) {
				@Pc(40) Class3 local40 = this.aClass3_103;
				this.aClass3_103 = this.aClass3_103.aClass3_215;
				return local40;
			}
		}
		this.aClass3_103 = null;
		return null;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)Lclient!n;")
	public Class3 method1497() {
		@Pc(22) Class3 local22;
		if (this.anInt2121 > 0 && this.aClass3Array1[this.anInt2121 - 1] != this.aClass3_104) {
			local22 = this.aClass3_104;
			this.aClass3_104 = local22.aClass3_215;
			return local22;
		}
		while (this.anInt2121 < this.anInt2115) {
			local22 = this.aClass3Array1[this.anInt2121++].aClass3_215;
			if (this.aClass3Array1[this.anInt2121 - 1] != local22) {
				this.aClass3_104 = local22.aClass3_215;
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I[Lclient!n;)I")
	public int method1499(@OriginalArg(1) Class3[] arg0) {
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < this.anInt2115; local14++) {
			@Pc(21) Class3 local21 = this.aClass3Array1[local14];
			for (@Pc(24) Class3 local24 = local21.aClass3_215; local24 != local21; local24 = local24.aClass3_215) {
				arg0[local12++] = local24;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)I")
	public int method1500() {
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < this.anInt2115; local15++) {
			@Pc(22) Class3 local22 = this.aClass3Array1[local15];
			@Pc(25) Class3 local25 = local22.aClass3_215;
			while (local22 != local25) {
				local25 = local25.aClass3_215;
				local13++;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "(B)Lclient!n;")
	public Class3 method1503() {
		this.anInt2121 = 0;
		return this.method1497();
	}
}
