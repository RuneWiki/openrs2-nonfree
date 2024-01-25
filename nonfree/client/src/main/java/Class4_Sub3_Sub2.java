import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sn")
public final class Class4_Sub3_Sub2 extends Class4_Sub3 implements Interface5 {

	@OriginalMember(owner = "client!sn", name = "P", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray2 = new Rectangle[100];

	@OriginalMember(owner = "client!sn", name = "bb", descriptor = "Lclient!jm;")
	public static final Class103 aClass103_139;

	@OriginalMember(owner = "client!sn", name = "eb", descriptor = "[J")
	public static final long[] aLongArray7;

	@OriginalMember(owner = "client!sn", name = "R", descriptor = "S")
	private final short aShort78;

	@OriginalMember(owner = "client!sn", name = "z", descriptor = "Z")
	private final boolean aBoolean479;

	@OriginalMember(owner = "client!sn", name = "O", descriptor = "B")
	private final byte aByte55;

	@OriginalMember(owner = "client!sn", name = "H", descriptor = "B")
	private final byte aByte54;

	@OriginalMember(owner = "client!sn", name = "x", descriptor = "Z")
	private final boolean aBoolean477;

	@OriginalMember(owner = "client!sn", name = "B", descriptor = "Z")
	private boolean aBoolean480;

	@OriginalMember(owner = "client!sn", name = "ab", descriptor = "B")
	private final byte aByte56;

	@OriginalMember(owner = "client!sn", name = "y", descriptor = "Z")
	private final boolean aBoolean478;

	@OriginalMember(owner = "client!sn", name = "J", descriptor = "Lclient!ts;")
	public Class112 aClass112_4;

	@OriginalMember(owner = "client!sn", name = "E", descriptor = "Lclient!lb;")
	private Class5_Sub1_Sub10 aClass5_Sub1_Sub10_4;

	static {
		for (@Pc(4) int local4 = 0; local4 < 100; local4++) {
			aRectangleArray2[local4] = new Rectangle();
		}
		aClass103_139 = new Class103();
		aLongArray7 = new long[256];
		for (@Pc(26) int local26 = 0; local26 < 256; local26++) {
			@Pc(30) long local30 = (long) local26;
			for (@Pc(32) int local32 = 0; local32 < 8; local32++) {
				if ((local30 & 0x1L) == 1L) {
					local30 = local30 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local30 >>>= 0x1;
				}
			}
			aLongArray7[local26] = local30;
		}
	}

	@OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(Lclient!ea;Lclient!p;IIIIZIIZ)V")
	public Class4_Sub3_Sub2(@OriginalArg(0) Class55 arg0, @OriginalArg(1) Class156 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg3, arg4, arg5, Static311.method3260(arg7, arg8));
		this.aShort78 = (short) arg1.lb;
		this.aBoolean479 = arg6;
		super.anInt5783 = (short) arg5;
		this.aByte55 = (byte) arg2;
		this.aByte54 = (byte) arg8;
		super.anInt5781 = (short) arg3;
		this.aBoolean477 = arg1.anInt4756 != 0 && !arg6;
		this.aBoolean480 = arg9;
		this.aByte56 = (byte) arg7;
		this.aBoolean478 = arg0.method5160() && arg1.aBoolean396 && !this.aBoolean479 && Static95.anInt1828 != 0;
		@Pc(70) int local70 = 1024;
		if (this.aBoolean480) {
			local70 |= 0x8000;
		}
		@Pc(85) Class191 local85 = this.method5149(arg0, this.aBoolean478, local70);
		if (local85 != null) {
			this.aClass112_4 = local85.aClass112_6;
			this.aClass5_Sub1_Sub10_4 = local85.aClass5_Sub1_Sub10_6;
			if (this.aBoolean480) {
				this.aClass112_4 = this.aClass112_4.method4349((byte) 0, local70, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!sn", name = "c", descriptor = "(I)I")
	@Override
	public int method5913() {
		return this.aByte56;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lclient!ea;BI)Lclient!ts;")
	@Override
	public Class112 method5906(@OriginalArg(0) Class55 arg0, @OriginalArg(2) int arg1) {
		return this.method5154(arg1, arg0);
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(BLclient!ea;)V")
	@Override
	public void method5911(@OriginalArg(1) Class55 arg0) {
		@Pc(25) Class5_Sub1_Sub10 local25;
		if (this.aClass5_Sub1_Sub10_4 == null && this.aBoolean478) {
			@Pc(18) Class191 local18 = this.method5149(arg0, true, 131072);
			local25 = local18 == null ? null : local18.aClass5_Sub1_Sub10_6;
		} else {
			local25 = this.aClass5_Sub1_Sub10_4;
			this.aClass5_Sub1_Sub10_4 = null;
		}
		if (local25 != null) {
			Static231.method4152(local25, this.aByte55, super.anInt5781, super.anInt5783, null);
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5909() {
		return this.aBoolean478;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lclient!ea;ZBI)Lclient!to;")
	private Class191 method5149(@OriginalArg(0) Class55 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(18) Class156 local18 = Static111.method1967(this.aShort78 & 0xFFFF);
		@Pc(43) Class51 local43;
		@Pc(29) Class51 local29;
		if (this.aBoolean479) {
			local29 = Static56.aClass51Array2[0];
			local43 = Static219.aClass51Array3[this.aByte55];
		} else {
			if (this.aByte55 >= 3) {
				local29 = null;
			} else {
				local29 = Static56.aClass51Array2[this.aByte55 + 1];
			}
			local43 = Static56.aClass51Array2[this.aByte55];
		}
		return local18.method4221(local43, arg0, this.aByte54, arg1, this.aByte56, super.anInt5785, arg2, super.anInt5783, super.anInt5781, local29);
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lclient!ea;I)V")
	@Override
	public void method5899(@OriginalArg(0) Class55 arg0) {
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(ZILclient!ea;I)Z")
	@Override
	public boolean method5900(@OriginalArg(1) int arg0, @OriginalArg(2) Class55 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class112 local9 = this.method5154(65536, arg1);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class66 local14 = arg1.method5195();
			local14.method5822(super.anInt5781, super.anInt5785, super.anInt5783);
			return local9.method4340(arg2, arg0, local14, false);
		}
	}

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "(ILclient!ea;)Lclient!ms;")
	@Override
	public Class32_Sub4 method5898(@OriginalArg(1) Class55 arg0) {
		if (this.aClass112_4 == null) {
			return null;
		}
		@Pc(11) Class66 local11 = arg0.method5195();
		local11.method5822(super.anInt5781, super.anInt5785, super.anInt5783);
		@Pc(21) Class32_Sub4 local21 = null;
		if (this.aBoolean477) {
			local21 = Static232.method4183(1);
		}
		this.aClass112_4.method4338(local11, local21 == null ? null : local21.aClass32_Sub8Array1[0], 0);
		return local21;
	}

	@OriginalMember(owner = "client!sn", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5895() {
		return this.aBoolean480;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)V")
	@Override
	public void method5907() {
		if (this.aClass112_4 != null) {
			this.aClass112_4.method4343();
		}
	}

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "(I)I")
	@Override
	public int method5908() {
		return this.aByte54;
	}

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "(Z)I")
	@Override
	public int method5910() {
		return this.aShort78 & 0xFFFF;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(B)V")
	@Override
	public void method5896() {
		this.aBoolean480 = false;
		if (this.aClass112_4 != null) {
			this.aClass112_4.method4339(this.aClass112_4.method4308() & 0xFFFF7FFF);
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(ILclient!ea;)V")
	@Override
	public void method5912(@OriginalArg(1) Class55 arg0) {
		@Pc(14) Class5_Sub1_Sub10 local14;
		if (this.aClass5_Sub1_Sub10_4 == null && this.aBoolean478) {
			@Pc(25) Class191 local25 = this.method5149(arg0, true, 131072);
			local14 = local25 == null ? null : local25.aClass5_Sub1_Sub10_6;
		} else {
			local14 = this.aClass5_Sub1_Sub10_4;
			this.aClass5_Sub1_Sub10_4 = null;
		}
		if (local14 != null) {
			Static146.method2670(local14, this.aByte55, super.anInt5781, super.anInt5783, null);
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IILclient!ea;Lclient!ac;ZII)V")
	@Override
	public void method5897(@OriginalArg(1) int arg0, @OriginalArg(2) Class55 arg1, @OriginalArg(3) Class4 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 instanceof Class4_Sub3_Sub2) {
			@Pc(32) Class4_Sub3_Sub2 local32 = (Class4_Sub3_Sub2) arg2;
			if (this.aClass112_4 != null && local32.aClass112_4 != null) {
				this.aClass112_4.method4311(local32.aClass112_4, arg0, arg5, arg4, arg3);
			}
		} else if (arg2 instanceof Class4_Sub5_Sub4) {
			@Pc(12) Class4_Sub5_Sub4 local12 = (Class4_Sub5_Sub4) arg2;
			if (this.aClass112_4 != null && local12.aClass112_5 != null) {
				this.aClass112_4.method4311(local12.aClass112_5, arg0, arg5, arg4, arg3);
			}
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IZLclient!ea;)Lclient!ts;")
	private Class112 method5154(@OriginalArg(0) int arg0, @OriginalArg(2) Class55 arg1) {
		if (this.aClass112_4 != null && arg1.method5181(this.aClass112_4.method4308(), arg0) == 0) {
			return this.aClass112_4;
		} else {
			@Pc(26) Class191 local26 = this.method5149(arg1, false, arg0);
			return local26 == null ? null : local26.aClass112_6;
		}
	}
}
