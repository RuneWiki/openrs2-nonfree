import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class25 {

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "J")
	private long aLong30;

	@OriginalMember(owner = "client!bc", name = "n", descriptor = "Lclient!faa;")
	private Class3 aClass3_23;

	@OriginalMember(owner = "client!bc", name = "s", descriptor = "Lclient!faa;")
	private Class3 aClass3_24;

	@OriginalMember(owner = "client!bc", name = "r", descriptor = "I")
	private int anInt851 = 0;

	@OriginalMember(owner = "client!bc", name = "j", descriptor = "I")
	public final int anInt845;

	@OriginalMember(owner = "client!bc", name = "m", descriptor = "[Lclient!faa;")
	public final Class3[] aClass3Array1;

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(I)V")
	public Class25(@OriginalArg(0) int arg0) {
		this.anInt845 = arg0;
		this.aClass3Array1 = new Class3[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class3 local23 = this.aClass3Array1[local13] = new Class3();
			local23.aClass3_288 = local23;
			local23.aClass3_287 = local23;
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!faa;IJ)V")
	public void method945(@OriginalArg(0) Class3 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass3_287 != null) {
			arg0.method8412();
		}
		@Pc(21) Class3 local21 = this.aClass3Array1[(int) ((long) (this.anInt845 - 1) & arg1)];
		arg0.aClass3_288 = local21;
		arg0.aClass3_287 = local21.aClass3_287;
		arg0.aClass3_287.aClass3_288 = arg0;
		arg0.aLong262 = arg1;
		arg0.aClass3_288.aClass3_287 = arg0;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(JI)Lclient!faa;")
	public Class3 method946(@OriginalArg(0) long arg0) {
		this.aLong30 = arg0;
		@Pc(24) Class3 local24 = this.aClass3Array1[(int) (arg0 & (long) (this.anInt845 - 1))];
		for (this.aClass3_23 = local24.aClass3_288; this.aClass3_23 != local24; this.aClass3_23 = this.aClass3_23.aClass3_288) {
			if (this.aClass3_23.aLong262 == arg0) {
				@Pc(38) Class3 local38 = this.aClass3_23;
				this.aClass3_23 = this.aClass3_23.aClass3_288;
				return local38;
			}
		}
		this.aClass3_23 = null;
		return null;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Z)Lclient!faa;")
	public Class3 method947() {
		@Pc(22) Class3 local22;
		if (this.anInt851 > 0 && this.aClass3_24 != this.aClass3Array1[this.anInt851 - 1]) {
			local22 = this.aClass3_24;
			this.aClass3_24 = local22.aClass3_288;
			return local22;
		}
		while (this.anInt851 < this.anInt845) {
			local22 = this.aClass3Array1[this.anInt851++].aClass3_288;
			if (this.aClass3Array1[this.anInt851 - 1] != local22) {
				this.aClass3_24 = local22.aClass3_288;
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
	public void method948() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt845; local1++) {
			@Pc(7) Class3 local7 = this.aClass3Array1[local1];
			while (true) {
				@Pc(10) Class3 local10 = local7.aClass3_288;
				if (local7 == local10) {
					break;
				}
				local10.method8412();
			}
		}
		this.aClass3_23 = null;
		this.aClass3_24 = null;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)Lclient!faa;")
	public Class3 method949() {
		this.anInt851 = 0;
		return this.method947();
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(B)I")
	public int method950() {
		@Pc(5) int local5 = 0;
		for (@Pc(15) int local15 = 0; local15 < this.anInt845; local15++) {
			@Pc(21) Class3 local21 = this.aClass3Array1[local15];
			@Pc(24) Class3 local24 = local21.aClass3_288;
			while (local24 != local21) {
				local24 = local24.aClass3_288;
				local5++;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)Lclient!faa;")
	public Class3 method953() {
		if (this.aClass3_23 == null) {
			return null;
		}
		@Pc(27) Class3 local27 = this.aClass3Array1[(int) (this.aLong30 & (long) (this.anInt845 - 1))];
		while (local27 != this.aClass3_23) {
			if (this.aLong30 == this.aClass3_23.aLong262) {
				@Pc(42) Class3 local42 = this.aClass3_23;
				this.aClass3_23 = this.aClass3_23.aClass3_288;
				return local42;
			}
			this.aClass3_23 = this.aClass3_23.aClass3_288;
		}
		this.aClass3_23 = null;
		return null;
	}

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)I")
	public int method954() {
		return this.anInt845;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(I[Lclient!faa;)I")
	public int method955(@OriginalArg(1) Class3[] arg0) {
		@Pc(5) int local5 = 0;
		for (@Pc(13) int local13 = 0; local13 < this.anInt845; local13++) {
			@Pc(19) Class3 local19 = this.aClass3Array1[local13];
			for (@Pc(22) Class3 local22 = local19.aClass3_288; local22 != local19; local22 = local22.aClass3_288) {
				arg0[local5++] = local22;
			}
		}
		return local5;
	}
}
