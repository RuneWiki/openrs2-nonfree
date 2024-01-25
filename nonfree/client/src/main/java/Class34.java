import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cl")
public final class Class34 {

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "[S")
	private short[] aShortArray2;

	@OriginalMember(owner = "client!cl", name = "d", descriptor = "I")
	public int anInt861;

	@OriginalMember(owner = "client!cl", name = "h", descriptor = "I")
	private int anInt864;

	@OriginalMember(owner = "client!cl", name = "k", descriptor = "Lclient!no;")
	public Class173 aClass173_3;

	@OriginalMember(owner = "client!cl", name = "r", descriptor = "[S")
	private short[] aShortArray3;

	@OriginalMember(owner = "client!cl", name = "u", descriptor = "[S")
	private short[] aShortArray4;

	@OriginalMember(owner = "client!cl", name = "v", descriptor = "[S")
	private short[] aShortArray5;

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "Z")
	public boolean aBoolean64 = false;

	@OriginalMember(owner = "client!cl", name = "n", descriptor = "I")
	private int anInt867 = 0;

	@OriginalMember(owner = "client!cl", name = "j", descriptor = "I")
	private int anInt865 = 128;

	@OriginalMember(owner = "client!cl", name = "s", descriptor = "I")
	private int anInt870 = 0;

	@OriginalMember(owner = "client!cl", name = "p", descriptor = "I")
	private int anInt869 = 128;

	@OriginalMember(owner = "client!cl", name = "g", descriptor = "I")
	public int anInt863 = -1;

	@OriginalMember(owner = "client!cl", name = "f", descriptor = "Z")
	public boolean aBoolean65 = false;

	@OriginalMember(owner = "client!cl", name = "e", descriptor = "I")
	private int anInt862 = 0;

	static {
		new Class32("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(BIIILclient!vk;Lclient!vc;I)Lclient!n;")
	public Class66 method735(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class236 arg3, @OriginalArg(5) Class63 arg4, @OriginalArg(6) int arg5) {
		@Pc(15) int local15 = arg1;
		@Pc(31) Class202 local31 = this.anInt863 == -1 || arg0 == -1 ? null : arg3.method5396(this.anInt863);
		if (local31 != null) {
			local15 = arg1 | local31.method4330(false, arg2, arg0);
		}
		if (this.anInt869 != 128) {
			local15 |= 0x2;
		}
		if (this.anInt865 != 128 || this.anInt867 != 0) {
			local15 |= 0x5;
		}
		@Pc(68) Class160 local68 = this.aClass173_3.aClass160_35;
		@Pc(88) Class66 local88;
		synchronized (this.aClass173_3.aClass160_35) {
			local88 = (Class66) this.aClass173_3.aClass160_35.method3599((long) (this.anInt861 |= arg4.anInt2081 << 29));
		}
		if (local88 == null || arg4.method2051(local88.method5127(), local15) != 0) {
			if (local88 != null) {
				local15 = arg4.method2031(local15, local88.method5127());
			}
			@Pc(112) int local112 = local15;
			if (this.aShortArray4 != null) {
				local112 = local15 | 0x2000;
			}
			if (this.aShortArray5 != null) {
				local112 |= 0x4000;
			}
			@Pc(135) Class200 local135 = Static331.method4882(this.aClass173_3.aClass171_57, this.anInt864);
			if (local135 == null) {
				return null;
			}
			local88 = arg4.method1998(local135, local112, this.aClass173_3.anInt4167, this.anInt870 + 64, this.anInt862 + 850);
			@Pc(160) int local160;
			if (this.aShortArray4 != null) {
				for (local160 = 0; local160 < this.aShortArray4.length; local160++) {
					local88.method5147(this.aShortArray4[local160], this.aShortArray3[local160]);
				}
			}
			if (this.aShortArray5 != null) {
				for (local160 = 0; local160 < this.aShortArray5.length; local160++) {
					local88.method5124(this.aShortArray5[local160], this.aShortArray2[local160]);
				}
			}
			local88.method5118(local15);
			@Pc(212) Class160 local212 = this.aClass173_3.aClass160_35;
			synchronized (this.aClass173_3.aClass160_35) {
				this.aClass173_3.aClass160_35.method3602((long) (this.anInt861 |= arg4.anInt2081 << 29), local88);
			}
		}
		@Pc(256) Class66 local256 = local31 == null ? local88.method5119((byte) 2, local15, true) : local31.method4325(local15, local88, (byte) 2, 0, arg5, arg0, arg2);
		if (this.anInt865 != 128 || this.anInt869 != 128) {
			local256.method5135(this.anInt865, this.anInt869, this.anInt865);
		}
		if (this.anInt867 != 0) {
			if (this.anInt867 == 90) {
				local256.method5157(4096);
			}
			if (this.anInt867 == 180) {
				local256.method5157(8192);
			}
			if (this.anInt867 == 270) {
				local256.method5157(12288);
			}
		}
		local256.method5118(arg1);
		return local256;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILclient!kk;)V")
	public void method737(@OriginalArg(1) Class2_Sub16 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method5350();
			if (local7 == 0) {
				return;
			}
			this.method738(arg0, local7);
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILclient!kk;I)V")
	private void method738(@OriginalArg(1) Class2_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt864 = arg0.method5312();
		} else if (arg1 == 2) {
			this.anInt863 = arg0.method5312();
		} else if (arg1 == 4) {
			this.anInt865 = arg0.method5312();
		} else if (arg1 == 5) {
			this.anInt869 = arg0.method5312();
		} else if (arg1 == 6) {
			this.anInt867 = arg0.method5312();
		} else if (arg1 == 7) {
			this.anInt870 = arg0.method5350();
		} else if (arg1 == 8) {
			this.anInt862 = arg0.method5350();
		} else if (arg1 == 9) {
			this.aBoolean64 = true;
		} else if (arg1 == 10) {
			this.aBoolean65 = true;
		} else {
			@Pc(70) int local70;
			@Pc(80) int local80;
			if (arg1 == 40) {
				local70 = arg0.method5350();
				this.aShortArray3 = new short[local70];
				this.aShortArray4 = new short[local70];
				for (local80 = 0; local80 < local70; local80++) {
					this.aShortArray4[local80] = (short) arg0.method5312();
					this.aShortArray3[local80] = (short) arg0.method5312();
				}
			} else if (arg1 == 41) {
				local70 = arg0.method5350();
				this.aShortArray5 = new short[local70];
				this.aShortArray2 = new short[local70];
				for (local80 = 0; local80 < local70; local80++) {
					this.aShortArray5[local80] = (short) arg0.method5312();
					this.aShortArray2[local80] = (short) arg0.method5312();
				}
			}
		}
	}
}
