import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kj")
public final class Class96 {

	@OriginalMember(owner = "client!kj", name = "d", descriptor = "[S")
	private short[] aShortArray40;

	@OriginalMember(owner = "client!kj", name = "e", descriptor = "[S")
	private short[] aShortArray41;

	@OriginalMember(owner = "client!kj", name = "h", descriptor = "[S")
	private short[] aShortArray42;

	@OriginalMember(owner = "client!kj", name = "o", descriptor = "I")
	public int anInt3388;

	@OriginalMember(owner = "client!kj", name = "s", descriptor = "I")
	private int anInt3392;

	@OriginalMember(owner = "client!kj", name = "x", descriptor = "[S")
	private short[] aShortArray43;

	@OriginalMember(owner = "client!kj", name = "r", descriptor = "I")
	private int anInt3391 = 0;

	@OriginalMember(owner = "client!kj", name = "p", descriptor = "I")
	public int anInt3389 = -1;

	@OriginalMember(owner = "client!kj", name = "j", descriptor = "Z")
	public boolean aBoolean232 = false;

	@OriginalMember(owner = "client!kj", name = "u", descriptor = "I")
	private int anInt3394 = 0;

	@OriginalMember(owner = "client!kj", name = "f", descriptor = "I")
	private int anInt3382 = 0;

	@OriginalMember(owner = "client!kj", name = "q", descriptor = "I")
	private int anInt3390 = 128;

	@OriginalMember(owner = "client!kj", name = "t", descriptor = "I")
	private int anInt3393 = 128;

	@OriginalMember(owner = "client!kj", name = "v", descriptor = "Z")
	public boolean aBoolean233 = false;

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lclient!oe;I)V")
	public void method2796(@OriginalArg(0) Class2_Sub16 arg0) {
		while (true) {
			@Pc(24) int local24 = arg0.method2146();
			if (local24 == 0) {
				return;
			}
			this.method2799(arg0, local24);
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILclient!oe;I)V")
	private void method2799(@OriginalArg(1) Class2_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt3392 = arg0.method2130();
		} else if (arg1 == 2) {
			this.anInt3389 = arg0.method2130();
		} else if (arg1 == 4) {
			this.anInt3390 = arg0.method2130();
		} else if (arg1 == 5) {
			this.anInt3393 = arg0.method2130();
		} else if (arg1 == 6) {
			this.anInt3382 = arg0.method2130();
		} else if (arg1 == 7) {
			this.anInt3394 = arg0.method2146();
		} else if (arg1 == 8) {
			this.anInt3391 = arg0.method2146();
		} else if (arg1 == 9) {
			this.aBoolean233 = true;
		} else if (arg1 == 10) {
			this.aBoolean232 = true;
		} else {
			@Pc(91) int local91;
			@Pc(101) int local101;
			if (arg1 == 40) {
				local91 = arg0.method2146();
				this.aShortArray40 = new short[local91];
				this.aShortArray42 = new short[local91];
				for (local101 = 0; local101 < local91; local101++) {
					this.aShortArray42[local101] = (short) arg0.method2130();
					this.aShortArray40[local101] = (short) arg0.method2130();
				}
			} else if (arg1 == 41) {
				local91 = arg0.method2146();
				this.aShortArray43 = new short[local91];
				this.aShortArray41 = new short[local91];
				for (local101 = 0; local101 < local91; local101++) {
					this.aShortArray43[local101] = (short) arg0.method2130();
					this.aShortArray41[local101] = (short) arg0.method2130();
				}
			}
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIII)Lclient!hb;")
	public Class15_Sub5 method2801(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(15) Class15_Sub5 local15 = (Class15_Sub5) Static105.aClass157_9.method4031((long) this.anInt3388);
		if (local15 == null) {
			@Pc(30) Class15_Sub7 local30 = Static267.method4203(Static72.aClass42_21, this.anInt3392);
			if (local30 == null) {
				return null;
			}
			@Pc(41) int local41;
			if (this.aShortArray42 != null) {
				for (local41 = 0; local41 < this.aShortArray42.length; local41++) {
					local30.method4212(this.aShortArray42[local41], this.aShortArray40[local41]);
				}
			}
			if (this.aShortArray43 != null) {
				for (local41 = 0; local41 < this.aShortArray43.length; local41++) {
					local30.method4202(this.aShortArray43[local41], this.aShortArray41[local41]);
				}
			}
			local15 = local30.method4225(this.anInt3394 + 64, 850 - -this.anInt3391, -30, -50, -30);
			Static105.aClass157_9.method4026((long) this.anInt3388, local15);
		}
		@Pc(121) Class15_Sub5 local121;
		if (this.anInt3389 == -1 || arg0 == -1) {
			local121 = local15.method2358(true, true, true);
		} else {
			local121 = Static208.method3496(this.anInt3389).method3162(arg2, arg0, local15, arg1);
		}
		if (this.anInt3390 != 128 || this.anInt3393 != 128) {
			local121.method2354(this.anInt3390, this.anInt3393, this.anInt3390);
		}
		if (this.anInt3382 != 0) {
			if (this.anInt3382 == 90) {
				local121.method2346();
			}
			if (this.anInt3382 == 180) {
				local121.method2344();
			}
			if (this.anInt3382 == 270) {
				local121.method2357();
			}
		}
		return local121;
	}
}
