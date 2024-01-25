import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qp")
public final class Class207 {

	@OriginalMember(owner = "client!qp", name = "c", descriptor = "[S")
	private short[] aShortArray110;

	@OriginalMember(owner = "client!qp", name = "d", descriptor = "Lclient!er;")
	public Class69 aClass69_2;

	@OriginalMember(owner = "client!qp", name = "g", descriptor = "[S")
	private short[] aShortArray111;

	@OriginalMember(owner = "client!qp", name = "i", descriptor = "[S")
	private short[] aShortArray112;

	@OriginalMember(owner = "client!qp", name = "k", descriptor = "[I")
	private int[] anIntArray381;

	@OriginalMember(owner = "client!qp", name = "o", descriptor = "[S")
	private short[] aShortArray113;

	@OriginalMember(owner = "client!qp", name = "f", descriptor = "[I")
	private final int[] anIntArray379 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lclient!cu;II)V")
	private void method4464(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			arg0.method2582();
			return;
		}
		@Pc(19) int local19;
		@Pc(25) int local25;
		if (arg1 == 2) {
			local19 = arg0.method2582();
			this.anIntArray381 = new int[local19];
			for (local25 = 0; local25 < local19; local25++) {
				this.anIntArray381[local25] = arg0.method2588();
			}
			return;
		}
		if (arg1 == 3) {
			return;
		}
		if (arg1 != 40) {
			if (arg1 == 41) {
				local19 = arg0.method2582();
				this.aShortArray111 = new short[local19];
				this.aShortArray112 = new short[local19];
				for (local25 = 0; local25 < local19; local25++) {
					this.aShortArray112[local25] = (short) arg0.method2588();
					this.aShortArray111[local25] = (short) arg0.method2588();
				}
			} else if (arg1 >= 60 && arg1 < 70) {
				this.anIntArray379[arg1 - 60] = arg0.method2588();
				return;
			}
			return;
		}
		local19 = arg0.method2582();
		this.aShortArray113 = new short[local19];
		this.aShortArray110 = new short[local19];
		for (local25 = 0; local25 < local19; local25++) {
			this.aShortArray113[local25] = (short) arg0.method2588();
			this.aShortArray110[local25] = (short) arg0.method2588();
		}
		return;
	}

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "(B)Lclient!nd;")
	public Class161 method4465() {
		@Pc(6) Class161[] local6 = new Class161[5];
		@Pc(8) int local8 = 0;
		@Pc(17) Class32 local17 = this.aClass69_2.aClass32_32;
		@Pc(21) int local21;
		synchronized (this.aClass69_2.aClass32_32) {
			local21 = 0;
			while (true) {
				if (local21 >= 5) {
					break;
				}
				if (this.anIntArray379[local21] != -1) {
					local6[local8++] = Static302.method4236(this.aClass69_2.aClass32_32, this.anIntArray379[local21]);
				}
				local21++;
			}
		}
		for (@Pc(55) int local55 = 0; local55 < 5; local55++) {
			if (local6[local55] != null && local6[local55].anInt4979 < 13) {
				local6[local55].method3832();
			}
		}
		@Pc(86) Class161 local86 = new Class161(local6, local8);
		if (this.aShortArray113 != null) {
			for (local21 = 0; local21 < this.aShortArray113.length; local21++) {
				local86.method3826(this.aShortArray113[local21], this.aShortArray110[local21]);
			}
		}
		if (this.aShortArray112 != null) {
			for (local21 = 0; local21 < this.aShortArray112.length; local21++) {
				local86.method3819(this.aShortArray111[local21], this.aShortArray112[local21]);
			}
		}
		return local86;
	}

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "(Z)Lclient!nd;")
	public Class161 method4469() {
		if (this.anIntArray381 == null) {
			return null;
		}
		@Pc(13) Class161[] local13 = new Class161[this.anIntArray381.length];
		@Pc(17) Class32 local17 = this.aClass69_2.aClass32_32;
		@Pc(21) int local21;
		synchronized (this.aClass69_2.aClass32_32) {
			local21 = 0;
			while (true) {
				if (local21 >= this.anIntArray381.length) {
					break;
				}
				local13[local21] = Static302.method4236(this.aClass69_2.aClass32_32, this.anIntArray381[local21]);
				local21++;
			}
		}
		for (@Pc(53) int local53 = 0; local53 < this.anIntArray381.length; local53++) {
			if (local13[local53].anInt4979 < 13) {
				local13[local53].method3832();
			}
		}
		@Pc(87) Class161 local87;
		if (local13.length == 1) {
			local87 = local13[0];
		} else {
			local87 = new Class161(local13, local13.length);
		}
		if (local87 == null) {
			return null;
		}
		if (this.aShortArray113 != null) {
			for (local21 = 0; local21 < this.aShortArray113.length; local21++) {
				local87.method3826(this.aShortArray113[local21], this.aShortArray110[local21]);
			}
		}
		if (this.aShortArray112 != null) {
			for (local21 = 0; local21 < this.aShortArray112.length; local21++) {
				local87.method3819(this.aShortArray111[local21], this.aShortArray112[local21]);
			}
		}
		return local87;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lclient!cu;I)V")
	public void method4470(@OriginalArg(0) Class3_Sub7 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method2582();
			if (local7 == 0) {
				return;
			}
			this.method4464(arg0, local7);
		}
	}

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "(I)Z")
	public boolean method4471() {
		@Pc(5) boolean local5 = true;
		@Pc(9) Class32 local9 = this.aClass69_2.aClass32_32;
		synchronized (this.aClass69_2.aClass32_32) {
			for (@Pc(13) int local13 = 0; local13 < 5; local13++) {
				if (this.anIntArray379[local13] != -1 && !this.aClass69_2.aClass32_32.method808(this.anIntArray379[local13], 0)) {
					local5 = false;
				}
			}
			return local5;
		}
	}

	@OriginalMember(owner = "client!qp", name = "c", descriptor = "(I)Z")
	public boolean method4472() {
		if (this.anIntArray381 == null) {
			return true;
		}
		@Pc(10) boolean local10 = true;
		@Pc(14) Class32 local14 = this.aClass69_2.aClass32_32;
		synchronized (this.aClass69_2.aClass32_32) {
			for (@Pc(18) int local18 = 0; local18 < this.anIntArray381.length; local18++) {
				if (!this.aClass69_2.aClass32_32.method808(this.anIntArray381[local18], 0)) {
					local10 = false;
				}
			}
			return local10;
		}
	}
}
