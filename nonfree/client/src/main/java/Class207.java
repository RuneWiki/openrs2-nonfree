import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vk")
public final class Class207 {

	@OriginalMember(owner = "client!vk", name = "e", descriptor = "Lclient!fb;")
	private Class1 aClass1_237;

	@OriginalMember(owner = "client!vk", name = "v", descriptor = "J")
	private long aLong206;

	@OriginalMember(owner = "client!vk", name = "z", descriptor = "Lclient!fb;")
	private Class1 aClass1_238;

	@OriginalMember(owner = "client!vk", name = "y", descriptor = "I")
	private int anInt6463 = 0;

	@OriginalMember(owner = "client!vk", name = "x", descriptor = "[Lclient!fb;")
	public final Class1[] aClass1Array1;

	@OriginalMember(owner = "client!vk", name = "u", descriptor = "I")
	public final int anInt6462;

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(I)V")
	public Class207(@OriginalArg(0) int arg0) {
		this.aClass1Array1 = new Class1[arg0];
		this.anInt6462 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class1 local23 = this.aClass1Array1[local13] = new Class1();
			local23.aClass1_248 = local23;
			local23.aClass1_247 = local23;
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(ZLclient!fb;J)V")
	public void method5552(@OriginalArg(1) Class1 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass1_248 != null) {
			arg0.method5796();
		}
		@Pc(21) Class1 local21 = this.aClass1Array1[(int) (arg1 & (long) (this.anInt6462 - 1))];
		arg0.aClass1_248 = local21.aClass1_248;
		arg0.aClass1_247 = local21;
		arg0.aClass1_248.aClass1_247 = arg0;
		arg0.aLong214 = arg1;
		arg0.aClass1_247.aClass1_248 = arg0;
	}

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "(I)I")
	public int method5554() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt6462; local9++) {
			@Pc(16) Class1 local16 = this.aClass1Array1[local9];
			for (@Pc(19) Class1 local19 = local16.aClass1_247; local19 != local16; local19 = local19.aClass1_247) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(JZ)Lclient!fb;")
	public Class1 method5555(@OriginalArg(0) long arg0) {
		this.aLong206 = arg0;
		@Pc(20) Class1 local20 = this.aClass1Array1[(int) ((long) (this.anInt6462 - 1) & arg0)];
		for (this.aClass1_237 = local20.aClass1_247; this.aClass1_237 != local20; this.aClass1_237 = this.aClass1_237.aClass1_247) {
			if (arg0 == this.aClass1_237.aLong214) {
				@Pc(35) Class1 local35 = this.aClass1_237;
				this.aClass1_237 = this.aClass1_237.aClass1_247;
				return local35;
			}
		}
		this.aClass1_237 = null;
		return null;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(B[Lclient!fb;)I")
	public int method5556(@OriginalArg(1) Class1[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt6462; local17++) {
			@Pc(24) Class1 local24 = this.aClass1Array1[local17];
			for (@Pc(27) Class1 local27 = local24.aClass1_247; local27 != local24; local27 = local27.aClass1_247) {
				arg0[local7++] = local27;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!vk", name = "c", descriptor = "(I)Lclient!fb;")
	public Class1 method5559() {
		@Pc(20) Class1 local20;
		if (this.anInt6463 > 0 && this.aClass1Array1[this.anInt6463 - 1] != this.aClass1_238) {
			local20 = this.aClass1_238;
			this.aClass1_238 = local20.aClass1_247;
			return local20;
		}
		while (this.anInt6462 > this.anInt6463) {
			local20 = this.aClass1Array1[this.anInt6463++].aClass1_247;
			if (this.aClass1Array1[this.anInt6463 - 1] != local20) {
				this.aClass1_238 = local20.aClass1_247;
				return local20;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!vk", name = "d", descriptor = "(I)Lclient!fb;")
	public Class1 method5560() {
		this.anInt6463 = 0;
		return this.method5559();
	}

	@OriginalMember(owner = "client!vk", name = "e", descriptor = "(I)I")
	public int method5561() {
		return this.anInt6462;
	}

	@OriginalMember(owner = "client!vk", name = "f", descriptor = "(I)V")
	public void method5562() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6462; local3++) {
			@Pc(10) Class1 local10 = this.aClass1Array1[local3];
			while (true) {
				@Pc(13) Class1 local13 = local10.aClass1_247;
				if (local10 == local13) {
					break;
				}
				local13.method5796();
			}
		}
		this.aClass1_237 = null;
		this.aClass1_238 = null;
	}

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "(Z)Lclient!fb;")
	public Class1 method5563() {
		if (this.aClass1_237 == null) {
			return null;
		}
		@Pc(28) Class1 local28 = this.aClass1Array1[(int) (this.aLong206 & (long) (this.anInt6462 - 1))];
		while (local28 != this.aClass1_237) {
			if (this.aClass1_237.aLong214 == this.aLong206) {
				@Pc(44) Class1 local44 = this.aClass1_237;
				this.aClass1_237 = this.aClass1_237.aClass1_247;
				return local44;
			}
			this.aClass1_237 = this.aClass1_237.aClass1_247;
		}
		this.aClass1_237 = null;
		return null;
	}
}
