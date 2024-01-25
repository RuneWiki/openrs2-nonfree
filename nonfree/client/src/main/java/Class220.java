import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tl")
public final class Class220 {

	@OriginalMember(owner = "client!tl", name = "c", descriptor = "[S")
	private short[] aShortArray106;

	@OriginalMember(owner = "client!tl", name = "j", descriptor = "[S")
	private short[] aShortArray107;

	@OriginalMember(owner = "client!tl", name = "k", descriptor = "Lclient!fk;")
	public Class74 aClass74_2;

	@OriginalMember(owner = "client!tl", name = "n", descriptor = "I")
	private int anInt6021;

	@OriginalMember(owner = "client!tl", name = "p", descriptor = "[S")
	private short[] aShortArray108;

	@OriginalMember(owner = "client!tl", name = "u", descriptor = "[S")
	private short[] aShortArray109;

	@OriginalMember(owner = "client!tl", name = "w", descriptor = "I")
	public int anInt6027;

	@OriginalMember(owner = "client!tl", name = "d", descriptor = "Z")
	public boolean aBoolean453 = false;

	@OriginalMember(owner = "client!tl", name = "l", descriptor = "I")
	public int anInt6020 = -1;

	@OriginalMember(owner = "client!tl", name = "g", descriptor = "I")
	private int anInt6017 = 0;

	@OriginalMember(owner = "client!tl", name = "i", descriptor = "I")
	private int anInt6019 = 0;

	@OriginalMember(owner = "client!tl", name = "r", descriptor = "I")
	private int anInt6023 = 128;

	@OriginalMember(owner = "client!tl", name = "m", descriptor = "Z")
	public boolean aBoolean455 = false;

	@OriginalMember(owner = "client!tl", name = "z", descriptor = "I")
	private int anInt6028 = 128;

	@OriginalMember(owner = "client!tl", name = "A", descriptor = "I")
	private int anInt6029 = 0;

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(ZLclient!p;Lclient!km;IIII)Lclient!ab;")
	public Class3 method5219(@OriginalArg(1) Class175 arg0, @OriginalArg(2) Class82 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = arg2;
		@Pc(22) Class189 local22 = this.anInt6020 == -1 || arg3 == -1 ? null : arg0.method4107(this.anInt6020);
		if (local22 != null) {
			local7 = arg2 | local22.method4433(arg3, arg4, false);
		}
		if (this.anInt6023 != 128) {
			local7 |= 0x2;
		}
		if (this.anInt6028 != 128 || this.anInt6017 != 0) {
			local7 |= 0x5;
		}
		@Pc(56) Class154 local56 = this.aClass74_2.aClass154_8;
		@Pc(76) Class3 local76;
		synchronized (this.aClass74_2.aClass154_8) {
			local76 = (Class3) this.aClass74_2.aClass154_8.method3751((long) (this.anInt6027 |= arg1.anInt5188 << 29));
		}
		if (local76 == null || arg1.method4499(local76.method3474(), local7) != 0) {
			if (local76 != null) {
				local7 = arg1.method4483(local7, local76.method3474());
			}
			@Pc(103) int local103 = local7;
			if (this.aShortArray108 != null) {
				local103 = local7 | 0x2000;
			}
			if (this.aShortArray107 != null) {
				local103 |= 0x4000;
			}
			@Pc(126) Class91 local126 = Static67.method1243(this.anInt6021, this.aClass74_2.aClass71_21);
			if (local126 == null) {
				return null;
			}
			local76 = arg1.method4466(local126, local103, this.aClass74_2.anInt1941, this.anInt6019 + 64, this.anInt6029 + 850);
			@Pc(151) int local151;
			if (this.aShortArray108 != null) {
				for (local151 = 0; local151 < this.aShortArray108.length; local151++) {
					local76.method3440(this.aShortArray108[local151], this.aShortArray109[local151]);
				}
			}
			if (this.aShortArray107 != null) {
				for (local151 = 0; local151 < this.aShortArray107.length; local151++) {
					local76.method3467(this.aShortArray107[local151], this.aShortArray106[local151]);
				}
			}
			local76.method3473(local7);
			@Pc(203) Class154 local203 = this.aClass74_2.aClass154_8;
			synchronized (this.aClass74_2.aClass154_8) {
				this.aClass74_2.aClass154_8.method3745((long) (this.anInt6027 |= arg1.anInt5188 << 29), local76);
			}
		}
		@Pc(247) Class3 local247 = local22 == null ? local76.method3481((byte) 2, local7, true) : local22.method4440((byte) 2, local7, local76, arg3, arg4, 0, arg5);
		if (this.anInt6028 != 128 || this.anInt6023 != 128) {
			local247.method3462(this.anInt6028, this.anInt6023, this.anInt6028);
		}
		if (this.anInt6017 != 0) {
			if (this.anInt6017 == 90) {
				local247.method3451(4096);
			}
			if (this.anInt6017 == 180) {
				local247.method3451(8192);
			}
			if (this.anInt6017 == 270) {
				local247.method3451(12288);
			}
		}
		local247.method3473(arg2);
		return local247;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IBLclient!lk;)V")
	private void method5222(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub13 arg1) {
		if (arg0 == 1) {
			this.anInt6021 = arg1.method4245();
		} else if (arg0 == 2) {
			this.anInt6020 = arg1.method4245();
		} else if (arg0 == 4) {
			this.anInt6028 = arg1.method4245();
		} else if (arg0 == 5) {
			this.anInt6023 = arg1.method4245();
		} else if (arg0 == 6) {
			this.anInt6017 = arg1.method4245();
		} else if (arg0 == 7) {
			this.anInt6019 = arg1.method4240();
		} else if (arg0 == 8) {
			this.anInt6029 = arg1.method4240();
		} else if (arg0 == 9) {
			this.aBoolean453 = true;
		} else if (arg0 == 10) {
			this.aBoolean455 = true;
		} else {
			@Pc(90) int local90;
			@Pc(100) int local100;
			if (arg0 == 40) {
				local90 = arg1.method4240();
				this.aShortArray109 = new short[local90];
				this.aShortArray108 = new short[local90];
				for (local100 = 0; local100 < local90; local100++) {
					this.aShortArray108[local100] = (short) arg1.method4245();
					this.aShortArray109[local100] = (short) arg1.method4245();
				}
			} else if (arg0 == 41) {
				local90 = arg1.method4240();
				this.aShortArray106 = new short[local90];
				this.aShortArray107 = new short[local90];
				for (local100 = 0; local100 < local90; local100++) {
					this.aShortArray107[local100] = (short) arg1.method4245();
					this.aShortArray106[local100] = (short) arg1.method4245();
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lclient!lk;I)V")
	public void method5228(@OriginalArg(0) Class2_Sub13 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method4240();
			if (local9 == 0) {
				return;
			}
			this.method5222(local9, arg0);
		}
	}
}
