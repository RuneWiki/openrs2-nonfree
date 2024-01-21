import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public final class Class14 {

	@OriginalMember(owner = "client!da", name = "e", descriptor = "Lclient!kh;")
	private Class1 aClass1_37;

	@OriginalMember(owner = "client!da", name = "f", descriptor = "J")
	private long aLong23;

	@OriginalMember(owner = "client!da", name = "q", descriptor = "Lclient!kh;")
	private Class1 aClass1_38;

	@OriginalMember(owner = "client!da", name = "p", descriptor = "I")
	private int anInt881 = 0;

	@OriginalMember(owner = "client!da", name = "n", descriptor = "I")
	private final int anInt879;

	@OriginalMember(owner = "client!da", name = "j", descriptor = "[Lclient!kh;")
	private final Class1[] aClass1Array1;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(I)V")
	public Class14(@OriginalArg(0) int arg0) {
		this.anInt879 = arg0;
		this.aClass1Array1 = new Class1[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class1 local23 = this.aClass1Array1[local13] = new Class1();
			local23.aClass1_207 = local23;
			local23.aClass1_208 = local23;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I)Lclient!kh;")
	public Class1 method563() {
		this.anInt881 = 0;
		return this.method571();
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I[Lclient!kh;)I")
	public int method565(@OriginalArg(1) Class1[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt879; local9++) {
			@Pc(16) Class1 local16 = this.aClass1Array1[local9];
			for (@Pc(19) Class1 local19 = local16.aClass1_207; local19 != local16; local19 = local19.aClass1_207) {
				arg0[local7++] = local19;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(I)I")
	public int method566() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt879; local9++) {
			@Pc(16) Class1 local16 = this.aClass1Array1[local9];
			@Pc(19) Class1 local19 = local16.aClass1_207;
			while (local16 != local19) {
				local19 = local19.aClass1_207;
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(I)Lclient!kh;")
	public Class1 method567() {
		if (this.aClass1_37 == null) {
			return null;
		}
		@Pc(27) Class1 local27 = this.aClass1Array1[(int) (this.aLong23 & (long) (this.anInt879 - 1))];
		while (this.aClass1_37 != local27) {
			if (this.aLong23 == this.aClass1_37.aLong139) {
				@Pc(38) Class1 local38 = this.aClass1_37;
				this.aClass1_37 = this.aClass1_37.aClass1_207;
				return local38;
			}
			this.aClass1_37 = this.aClass1_37.aClass1_207;
		}
		this.aClass1_37 = null;
		return null;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BJ)Lclient!kh;")
	public Class1 method569(@OriginalArg(1) long arg0) {
		this.aLong23 = arg0;
		@Pc(18) Class1 local18 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt879 - 1))];
		for (this.aClass1_37 = local18.aClass1_207; this.aClass1_37 != local18; this.aClass1_37 = this.aClass1_37.aClass1_207) {
			if (this.aClass1_37.aLong139 == arg0) {
				@Pc(37) Class1 local37 = this.aClass1_37;
				this.aClass1_37 = this.aClass1_37.aClass1_207;
				return local37;
			}
		}
		this.aClass1_37 = null;
		return null;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!kh;ZJ)V")
	public void method570(@OriginalArg(0) Class1 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass1_208 != null) {
			arg0.method3198();
		}
		@Pc(21) Class1 local21 = this.aClass1Array1[(int) (arg1 & (long) (this.anInt879 - 1))];
		arg0.aClass1_208 = local21.aClass1_208;
		arg0.aLong139 = arg1;
		arg0.aClass1_207 = local21;
		arg0.aClass1_208.aClass1_207 = arg0;
		arg0.aClass1_207.aClass1_208 = arg0;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(B)Lclient!kh;")
	public Class1 method571() {
		@Pc(27) Class1 local27;
		if (this.anInt881 > 0 && this.aClass1Array1[this.anInt881 - 1] != this.aClass1_38) {
			local27 = this.aClass1_38;
			this.aClass1_38 = local27.aClass1_207;
			return local27;
		}
		while (this.anInt881 < this.anInt879) {
			local27 = this.aClass1Array1[this.anInt881++].aClass1_207;
			if (this.aClass1Array1[this.anInt881 - 1] != local27) {
				this.aClass1_38 = local27.aClass1_207;
				return local27;
			}
		}
		return null;
	}
}
