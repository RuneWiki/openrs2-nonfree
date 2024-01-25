import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kj")
public final class Class134 {

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "[S")
	private short[] aShortArray76;

	@OriginalMember(owner = "client!kj", name = "c", descriptor = "I")
	private int anInt3339;

	@OriginalMember(owner = "client!kj", name = "m", descriptor = "[S")
	private short[] aShortArray77;

	@OriginalMember(owner = "client!kj", name = "n", descriptor = "Lclient!we;")
	public Class246 aClass246_2;

	@OriginalMember(owner = "client!kj", name = "s", descriptor = "[S")
	private short[] aShortArray78;

	@OriginalMember(owner = "client!kj", name = "u", descriptor = "[S")
	private short[] aShortArray79;

	@OriginalMember(owner = "client!kj", name = "y", descriptor = "I")
	public int anInt3353;

	@OriginalMember(owner = "client!kj", name = "g", descriptor = "I")
	private int anInt3343 = 128;

	@OriginalMember(owner = "client!kj", name = "h", descriptor = "I")
	private int anInt3344 = 0;

	@OriginalMember(owner = "client!kj", name = "k", descriptor = "Z")
	public boolean aBoolean297 = false;

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "I")
	private int anInt3338 = 128;

	@OriginalMember(owner = "client!kj", name = "l", descriptor = "I")
	public int anInt3346 = -1;

	@OriginalMember(owner = "client!kj", name = "q", descriptor = "I")
	private int anInt3349 = 0;

	@OriginalMember(owner = "client!kj", name = "t", descriptor = "I")
	private int anInt3351 = 0;

	@OriginalMember(owner = "client!kj", name = "x", descriptor = "Z")
	public boolean aBoolean298 = false;

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILclient!re;)V")
	public void method2731(@OriginalArg(1) Class1_Sub33 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method5174();
			if (local17 == 0) {
				return;
			}
			this.method2739(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILclient!tq;IIIILclient!ei;)Lclient!ns;")
	public Class22 method2734(@OriginalArg(0) int arg0, @OriginalArg(1) Class164 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class67 arg5) {
		@Pc(7) int local7 = arg0;
		@Pc(22) Class185 local22 = this.anInt3346 == -1 || arg2 == -1 ? null : arg5.method1227(this.anInt3346);
		if (local22 != null) {
			local7 = arg0 | local22.method4231(arg2, arg3, false);
		}
		if (this.anInt3338 != 128) {
			local7 |= 0x2;
		}
		if (this.anInt3343 != 128 || this.anInt3351 != 0) {
			local7 |= 0x5;
		}
		@Pc(60) Class227 local60 = this.aClass246_2.aClass227_52;
		@Pc(80) Class22 local80;
		synchronized (this.aClass246_2.aClass227_52) {
			local80 = (Class22) this.aClass246_2.aClass227_52.method4863((long) (this.anInt3353 |= arg1.anInt6163 << 29));
		}
		if (local80 == null || arg1.method5396(local80.method1563(), local7) != 0) {
			if (local80 != null) {
				local7 = arg1.method5391(local7, local80.method1563());
			}
			@Pc(107) int local107 = local7;
			if (this.aShortArray78 != null) {
				local107 = local7 | 0x2000;
			}
			if (this.aShortArray76 != null) {
				local107 |= 0x4000;
			}
			@Pc(130) Class238 local130 = Static180.method2595(this.anInt3339, this.aClass246_2.aClass230_88);
			if (local130 == null) {
				return null;
			}
			local80 = arg1.method5368(local130, local107, this.aClass246_2.anInt6221, this.anInt3344 + 64, this.anInt3349 + 850);
			@Pc(155) int local155;
			if (this.aShortArray78 != null) {
				for (local155 = 0; local155 < this.aShortArray78.length; local155++) {
					local80.method1581(this.aShortArray78[local155], this.aShortArray77[local155]);
				}
			}
			if (this.aShortArray76 != null) {
				for (local155 = 0; local155 < this.aShortArray76.length; local155++) {
					local80.method1576(this.aShortArray76[local155], this.aShortArray79[local155]);
				}
			}
			local80.method1602(local7);
			@Pc(211) Class227 local211 = this.aClass246_2.aClass227_52;
			synchronized (this.aClass246_2.aClass227_52) {
				this.aClass246_2.aClass227_52.method4865(local80, (long) (this.anInt3353 |= arg1.anInt6163 << 29));
			}
		}
		@Pc(255) Class22 local255 = local22 == null ? local80.method1598((byte) 2, local7, true) : local22.method4230(local7, arg2, arg3, arg4, 0, (byte) 2, local80);
		if (this.anInt3343 != 128 || this.anInt3338 != 128) {
			local255.method1607(this.anInt3343, this.anInt3338, this.anInt3343);
		}
		if (this.anInt3351 != 0) {
			if (this.anInt3351 == 90) {
				local255.method1605(4096);
			}
			if (this.anInt3351 == 180) {
				local255.method1605(8192);
			}
			if (this.anInt3351 == 270) {
				local255.method1605(12288);
			}
		}
		local255.method1602(arg0);
		return local255;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lclient!re;BI)V")
	private void method2739(@OriginalArg(0) Class1_Sub33 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt3339 = arg0.method5177();
		} else if (arg1 == 2) {
			this.anInt3346 = arg0.method5177();
		} else if (arg1 == 4) {
			this.anInt3343 = arg0.method5177();
		} else if (arg1 == 5) {
			this.anInt3338 = arg0.method5177();
		} else if (arg1 == 6) {
			this.anInt3351 = arg0.method5177();
		} else if (arg1 == 7) {
			this.anInt3344 = arg0.method5174();
		} else if (arg1 == 8) {
			this.anInt3349 = arg0.method5174();
		} else if (arg1 == 9) {
			this.aBoolean298 = true;
		} else if (arg1 == 10) {
			this.aBoolean297 = true;
		} else {
			@Pc(78) int local78;
			@Pc(88) int local88;
			if (arg1 == 40) {
				local78 = arg0.method5174();
				this.aShortArray78 = new short[local78];
				this.aShortArray77 = new short[local78];
				for (local88 = 0; local88 < local78; local88++) {
					this.aShortArray78[local88] = (short) arg0.method5177();
					this.aShortArray77[local88] = (short) arg0.method5177();
				}
			} else if (arg1 == 41) {
				local78 = arg0.method5174();
				this.aShortArray76 = new short[local78];
				this.aShortArray79 = new short[local78];
				for (local88 = 0; local88 < local78; local88++) {
					this.aShortArray76[local88] = (short) arg0.method5177();
					this.aShortArray79[local88] = (short) arg0.method5177();
				}
			}
		}
	}
}
