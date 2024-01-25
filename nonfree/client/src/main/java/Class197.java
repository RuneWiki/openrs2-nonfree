import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Class197 {

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
	public int anInt6074;

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "[S")
	private short[] aShortArray115;

	@OriginalMember(owner = "client!uf", name = "d", descriptor = "[S")
	private short[] aShortArray116;

	@OriginalMember(owner = "client!uf", name = "k", descriptor = "I")
	private int anInt6080;

	@OriginalMember(owner = "client!uf", name = "m", descriptor = "[S")
	private short[] aShortArray117;

	@OriginalMember(owner = "client!uf", name = "r", descriptor = "[S")
	private short[] aShortArray118;

	@OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
	public int anInt6076 = -1;

	@OriginalMember(owner = "client!uf", name = "h", descriptor = "Z")
	public boolean aBoolean442 = false;

	@OriginalMember(owner = "client!uf", name = "p", descriptor = "I")
	private int anInt6083 = 0;

	@OriginalMember(owner = "client!uf", name = "q", descriptor = "I")
	private int anInt6084 = 0;

	@OriginalMember(owner = "client!uf", name = "j", descriptor = "Z")
	public boolean aBoolean443 = false;

	@OriginalMember(owner = "client!uf", name = "g", descriptor = "I")
	private int anInt6078 = 128;

	@OriginalMember(owner = "client!uf", name = "o", descriptor = "I")
	private int anInt6082 = 0;

	@OriginalMember(owner = "client!uf", name = "n", descriptor = "I")
	private int anInt6081 = 128;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZIILclient!pe;II)Lclient!sj;")
	public Class31 method5136(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class89 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(5) int local5 = arg4;
		@Pc(21) Class170 local21 = this.anInt6076 == -1 || arg0 == -1 ? null : Static261.method4379(this.anInt6076);
		if (local21 != null) {
			local5 = arg4 | local21.method4319(arg0, false, arg1);
		}
		if (this.anInt6081 != 128) {
			local5 |= 0x2;
		}
		if (this.anInt6078 != 128 || this.anInt6083 != 0) {
			local5 |= 0x5;
		}
		@Pc(55) Class103 local55 = Static179.aClass103_30;
		@Pc(73) Class31 local73;
		synchronized (Static179.aClass103_30) {
			local73 = (Class31) Static179.aClass103_30.method2682((long) (this.anInt6074 |= arg2.anInt6390 << 29));
		}
		if (local73 == null || arg2.method5399(local73.method1912(), local5) != 0) {
			if (local73 != null) {
				local5 = arg2.method5435(local5, local73.method1912());
			}
			@Pc(100) int local100 = local5;
			if (this.aShortArray118 != null) {
				local100 = local5 | 0x2000;
			}
			if (this.aShortArray117 != null) {
				local100 |= 0x4000;
			}
			@Pc(121) Class140 local121 = Static233.method4073(this.anInt6080, Static141.aClass180_37);
			if (local121 == null) {
				return null;
			}
			local73 = arg2.method5475(local121, local100, Static53.anInt1401, this.anInt6082 + 64, this.anInt6084 + 850);
			@Pc(144) int local144;
			if (this.aShortArray118 != null) {
				for (local144 = 0; local144 < this.aShortArray118.length; local144++) {
					local73.method1929(this.aShortArray118[local144], this.aShortArray116[local144]);
				}
			}
			if (this.aShortArray117 != null) {
				for (local144 = 0; local144 < this.aShortArray117.length; local144++) {
					local73.method1941(this.aShortArray117[local144], this.aShortArray115[local144]);
				}
			}
			local73.method1908(local5);
			@Pc(192) Class103 local192 = Static179.aClass103_30;
			synchronized (Static179.aClass103_30) {
				Static179.aClass103_30.method2687(local73, (long) (this.anInt6074 |= arg2.anInt6390 << 29));
			}
		}
		@Pc(221) Class31 local221 = local73.method1917((byte) 2, local5, true);
		if (local21 != null) {
			local221 = local21.method4321((byte) 2, arg0, arg1, 0, arg3, local5, local221);
		}
		if (this.anInt6078 != 128 || this.anInt6081 != 128) {
			local221.method1926(this.anInt6078, this.anInt6081, this.anInt6078);
		}
		if (this.anInt6083 != 0) {
			if (this.anInt6083 == 90) {
				local221.method1956(4096);
			}
			if (this.anInt6083 == 180) {
				local221.method1956(8192);
			}
			if (this.anInt6083 == 270) {
				local221.method1956(12288);
			}
		}
		local221.method1908(arg4);
		return local221;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILclient!ap;)V")
	public void method5137(@OriginalArg(1) Class7_Sub3 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method2772();
			if (local10 == 0) {
				return;
			}
			this.method5138(local10, arg0);
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IILclient!ap;)V")
	private void method5138(@OriginalArg(0) int arg0, @OriginalArg(2) Class7_Sub3 arg1) {
		if (arg0 == 1) {
			this.anInt6080 = arg1.method2764();
		} else if (arg0 == 2) {
			this.anInt6076 = arg1.method2764();
		} else if (arg0 == 4) {
			this.anInt6078 = arg1.method2764();
		} else if (arg0 == 5) {
			this.anInt6081 = arg1.method2764();
		} else if (arg0 == 6) {
			this.anInt6083 = arg1.method2764();
		} else if (arg0 == 7) {
			this.anInt6082 = arg1.method2772();
		} else if (arg0 == 8) {
			this.anInt6084 = arg1.method2772();
		} else if (arg0 == 9) {
			this.aBoolean443 = true;
		} else if (arg0 == 10) {
			this.aBoolean442 = true;
		} else {
			@Pc(78) int local78;
			@Pc(88) int local88;
			if (arg0 == 40) {
				local78 = arg1.method2772();
				this.aShortArray118 = new short[local78];
				this.aShortArray116 = new short[local78];
				for (local88 = 0; local88 < local78; local88++) {
					this.aShortArray118[local88] = (short) arg1.method2764();
					this.aShortArray116[local88] = (short) arg1.method2764();
				}
			} else if (arg0 == 41) {
				local78 = arg1.method2772();
				this.aShortArray117 = new short[local78];
				this.aShortArray115 = new short[local78];
				for (local88 = 0; local88 < local78; local88++) {
					this.aShortArray117[local88] = (short) arg1.method2764();
					this.aShortArray115[local88] = (short) arg1.method2764();
				}
				return;
			}
		}
	}
}
