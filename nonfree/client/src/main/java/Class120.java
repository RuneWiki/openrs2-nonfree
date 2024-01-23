import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class120 {

	@OriginalMember(owner = "client!oc", name = "g", descriptor = "[S")
	private short[] aShortArray70;

	@OriginalMember(owner = "client!oc", name = "i", descriptor = "I")
	public int anInt3876;

	@OriginalMember(owner = "client!oc", name = "o", descriptor = "[S")
	private short[] aShortArray71;

	@OriginalMember(owner = "client!oc", name = "p", descriptor = "I")
	private int anInt3881;

	@OriginalMember(owner = "client!oc", name = "u", descriptor = "[S")
	private short[] aShortArray72;

	@OriginalMember(owner = "client!oc", name = "w", descriptor = "[S")
	private short[] aShortArray73;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
	private int anInt3870 = 128;

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
	private int anInt3871 = 0;

	@OriginalMember(owner = "client!oc", name = "k", descriptor = "I")
	private int anInt3878 = 0;

	@OriginalMember(owner = "client!oc", name = "j", descriptor = "I")
	public int anInt3877 = -1;

	@OriginalMember(owner = "client!oc", name = "m", descriptor = "I")
	private int anInt3879 = 0;

	@OriginalMember(owner = "client!oc", name = "n", descriptor = "I")
	private int anInt3880 = 128;

	@OriginalMember(owner = "client!oc", name = "s", descriptor = "Z")
	public boolean aBoolean240 = false;

	@OriginalMember(owner = "client!oc", name = "t", descriptor = "Z")
	public boolean aBoolean241 = false;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!pi;I)V")
	public void method3155(@OriginalArg(0) Class4_Sub24 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method3110();
			if (local15 == 0) {
				return;
			}
			this.method3156(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(BLclient!pi;I)V")
	private void method3156(@OriginalArg(1) Class4_Sub24 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt3881 = arg0.method3085();
		} else if (arg1 == 2) {
			this.anInt3877 = arg0.method3085();
		} else if (arg1 == 4) {
			this.anInt3870 = arg0.method3085();
		} else if (arg1 == 5) {
			this.anInt3880 = arg0.method3085();
		} else if (arg1 == 6) {
			this.anInt3871 = arg0.method3085();
		} else if (arg1 == 7) {
			this.anInt3878 = arg0.method3110();
		} else if (arg1 == 8) {
			this.anInt3879 = arg0.method3110();
		} else if (arg1 == 9) {
			this.aBoolean240 = true;
		} else if (arg1 == 10) {
			this.aBoolean241 = true;
		} else {
			@Pc(76) int local76;
			@Pc(86) int local86;
			if (arg1 == 40) {
				local76 = arg0.method3110();
				this.aShortArray70 = new short[local76];
				this.aShortArray73 = new short[local76];
				for (local86 = 0; local86 < local76; local86++) {
					this.aShortArray70[local86] = (short) arg0.method3085();
					this.aShortArray73[local86] = (short) arg0.method3085();
				}
			} else if (arg1 == 41) {
				local76 = arg0.method3110();
				this.aShortArray71 = new short[local76];
				this.aShortArray72 = new short[local76];
				for (local86 = 0; local86 < local76; local86++) {
					this.aShortArray72[local86] = (short) arg0.method3085();
					this.aShortArray71[local86] = (short) arg0.method3085();
				}
			}
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIII)Lclient!gk;")
	public Class13_Sub1 method3158(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class13_Sub1 local9 = (Class13_Sub1) Static242.aClass172_39.method4347((long) this.anInt3876);
		if (local9 == null) {
			@Pc(23) Class13_Sub7 local23 = Static271.method4293(Static292.aClass22_103, this.anInt3881);
			if (local23 == null) {
				return null;
			}
			@Pc(33) int local33;
			if (this.aShortArray70 != null) {
				for (local33 = 0; local33 < this.aShortArray70.length; local33++) {
					local23.method4274(this.aShortArray70[local33], this.aShortArray73[local33]);
				}
			}
			if (this.aShortArray72 != null) {
				for (local33 = 0; local33 < this.aShortArray72.length; local33++) {
					local23.method4291(this.aShortArray72[local33], this.aShortArray71[local33]);
				}
			}
			local9 = local23.method4270(this.anInt3878 + 64, this.anInt3879 + 850, -30, -50, -30);
			Static242.aClass172_39.method4345(local9, (long) this.anInt3876);
		}
		@Pc(116) Class13_Sub1 local116;
		if (this.anInt3877 == -1 || arg2 == -1) {
			local116 = local9.method2729(true, true, true);
		} else {
			local116 = Static51.method992(this.anInt3877).method4667(arg2, arg1, arg0, local9);
		}
		if (this.anInt3870 != 128 || this.anInt3880 != 128) {
			local116.method2744(this.anInt3870, this.anInt3880, this.anInt3870);
		}
		if (this.anInt3871 != 0) {
			if (this.anInt3871 == 90) {
				local116.method2745();
			}
			if (this.anInt3871 == 180) {
				local116.method2730();
			}
			if (this.anInt3871 == 270) {
				local116.method2747();
			}
		}
		return local116;
	}
}
