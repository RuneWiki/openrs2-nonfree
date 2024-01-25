import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!su")
public final class Class4_Sub1_Sub1_Sub5 extends Class4_Sub1_Sub1 {

	@OriginalMember(owner = "client!su", name = "gb", descriptor = "Lclient!tn;")
	private Class4_Sub9 aClass4_Sub9_8;

	@OriginalMember(owner = "client!su", name = "ob", descriptor = "I")
	private int anInt8833 = 0;

	@OriginalMember(owner = "client!su", name = "Q", descriptor = "Z")
	private boolean aBoolean584 = true;

	@OriginalMember(owner = "client!su", name = "kb", descriptor = "Z")
	public boolean aBoolean585 = false;

	@OriginalMember(owner = "client!su", name = "ib", descriptor = "I")
	private int anInt8847 = 0;

	@OriginalMember(owner = "client!su", name = "V", descriptor = "I")
	private int anInt8852 = 0;

	@OriginalMember(owner = "client!su", name = "tb", descriptor = "I")
	private final int anInt8851 = -1;

	@OriginalMember(owner = "client!su", name = "eb", descriptor = "I")
	private int anInt8839 = 0;

	@OriginalMember(owner = "client!su", name = "lb", descriptor = "I")
	private int lb = 0;

	@OriginalMember(owner = "client!su", name = "Z", descriptor = "I")
	public final int anInt8853;

	@OriginalMember(owner = "client!su", name = "hb", descriptor = "I")
	private final int anInt8838;

	@OriginalMember(owner = "client!su", name = "rb", descriptor = "Lclient!oe;")
	private Class264 aClass264_3;

	@OriginalMember(owner = "client!su", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
	public Class4_Sub1_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt8852 = arg12;
		this.anInt8853 = arg1 + arg2;
		this.anInt8838 = arg0;
		@Pc(53) Class295 local53 = Static463.aClass352_1.method8006(this.anInt8838);
		@Pc(56) int local56 = local53.anInt7610;
		if (local56 == -1) {
			this.aBoolean585 = true;
		} else {
			this.aClass264_3 = Static315.aClass14_1.method227(local56);
			this.aBoolean585 = false;
		}
		if (arg2 == this.anInt8853) {
			Static628.method8566(this.aClass264_3, this.anInt8839, this);
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(ZI)V")
	public void method7577(@OriginalArg(1) int arg0) {
		if (this.aBoolean585) {
			return;
		}
		this.lb += arg0;
		while (this.aClass264_3.anIntArray425[this.anInt8839] < this.lb) {
			this.lb -= this.aClass264_3.anIntArray425[this.anInt8839];
			this.anInt8839++;
			if (this.aClass264_3.anIntArray423.length <= this.anInt8839) {
				this.aBoolean585 = true;
				break;
			}
		}
		if (!this.aBoolean585) {
			Static628.method8566(this.aClass264_3, this.anInt8839, this);
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IIILclient!ha;)Z")
	@Override
	public boolean method8353(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class100 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(I)V")
	public void method7578() {
		if (this.aClass4_Sub9_8 != null) {
			this.aClass4_Sub9_8.method8044();
		}
	}

	@OriginalMember(owner = "client!su", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass4_Sub9_8 != null) {
			this.aClass4_Sub9_8.method8044();
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(Lclient!ha;B)Lclient!kv;")
	@Override
	public Class4_Sub6 method8355(@OriginalArg(0) Class100 arg0) {
		@Pc(21) Class43 local21 = this.method7581((this.anInt8852 == 0 ? 0 : 5) | 0x800, this.anInt8838, arg0);
		if (local21 == null) {
			return null;
		}
		if (this.anInt8852 != 0) {
			local21.a(this.anInt8852 * 2048);
		}
		@Pc(40) Class10 local40 = arg0.method8610();
		local40.method4214(super.anInt9805, super.anInt9797, super.anInt9803);
		this.method7580(local40, arg0, local21);
		@Pc(67) Class4_Sub6 local67 = Static281.method4512(false, 1);
		if (Static305.aBoolean339) {
			local21.method8846(local40, local67.aClass4_Sub8Array1[0], Static216.anInt1170, 0);
		} else {
			local21.method8849(local40, local67.aClass4_Sub8Array1[0], 0);
		}
		if (this.aClass4_Sub9_8 != null) {
			@Pc(99) Class336 local99 = this.aClass4_Sub9_8.method8046();
			if (Static305.aBoolean339) {
				arg0.method8618(local99, Static216.anInt1170);
			} else {
				arg0.method8586(local99);
			}
		}
		this.aBoolean584 = local21.F();
		this.anInt8847 = local21.fa();
		this.anInt8833 = local21.ma();
		return local67;
	}

	@OriginalMember(owner = "client!su", name = "b", descriptor = "(Lclient!ha;B)Lclient!rga;")
	@Override
	public Class315 method8350(@OriginalArg(0) Class100 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(ILclient!sj;Lclient!ha;Lclient!ka;)V")
	private void method7580(@OriginalArg(1) Class10 arg0, @OriginalArg(2) Class100 arg1, @OriginalArg(3) Class43 arg2) {
		arg2.method8847(arg0);
		@Pc(13) Class363[] local13 = arg2.method8853();
		@Pc(16) Class270[] local16 = arg2.method8863();
		if ((this.aClass4_Sub9_8 == null || this.aClass4_Sub9_8.aBoolean654) && (local13 != null || local16 != null)) {
			this.aClass4_Sub9_8 = Static585.method8058(Static565.anInt8921, true);
		}
		if (this.aClass4_Sub9_8 != null) {
			this.aClass4_Sub9_8.method8049(arg1, (long) Static565.anInt8921, local13, local16);
			this.aClass4_Sub9_8.method8057(super.aByte139, super.aShort104, super.aShort103, super.aShort105, super.aShort102);
		}
	}

	@OriginalMember(owner = "client!su", name = "g", descriptor = "(I)I")
	@Override
	public int method8347() {
		return this.anInt8847;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IILclient!ha;Z)Lclient!ka;")
	private Class43 method7581(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100 arg2) {
		@Pc(15) Class295 local15 = Static463.aClass352_1.method8006(arg1);
		@Pc(20) Class84 local20 = Static668.aClass84Array4[super.aByte139];
		@Pc(36) Class84 local36 = super.aByte138 < 3 ? Static668.aClass84Array4[super.aByte138 + 1] : null;
		return this.aBoolean585 ? local15.method6628(arg0, local20, -1, super.anInt9797, local36, arg2, Static315.aClass14_1, super.anInt9803, 0, super.anInt9805, -1) : local15.method6628(arg0, local20, this.anInt8851, super.anInt9797, local36, arg2, Static315.aClass14_1, super.anInt9803, this.lb, super.anInt9805, this.anInt8839);
	}

	@OriginalMember(owner = "client!su", name = "e", descriptor = "(B)I")
	@Override
	public int method8341(@OriginalArg(0) byte arg0) {
		if (arg0 >= -112) {
			this.anInt8847 = -65;
		}
		return this.anInt8833;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(ZILclient!ha;ILclient!rda;II)V")
	@Override
	public void method8354(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class4_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg5 > -10) {
			this.aClass264_3 = null;
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!su", name = "d", descriptor = "(B)V")
	@Override
	public void method8351(@OriginalArg(0) byte arg0) {
		if (arg0 < -41) {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!su", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method8344() {
		return this.aBoolean584;
	}

	@OriginalMember(owner = "client!su", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method8339() {
		return false;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method8342(@OriginalArg(1) Class100 arg0) {
		@Pc(20) Class43 local20 = this.method7581(0, this.anInt8838, arg0);
		if (local20 != null) {
			@Pc(25) Class10 local25 = arg0.method8610();
			local25.method4214(super.anInt9805, super.anInt9797, super.anInt9803);
			this.method7580(local25, arg0, local20);
		}
	}

	@OriginalMember(owner = "client!su", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method8356() {
		return false;
	}
}
