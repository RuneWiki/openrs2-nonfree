import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class25_Sub2_Sub2_Sub2 extends Class25_Sub2_Sub2 {

	@OriginalMember(owner = "client!ga", name = "lb", descriptor = "Lclient!iu;")
	private Class25_Sub7 lb;

	@OriginalMember(owner = "client!ga", name = "R", descriptor = "I")
	private int anInt3650 = 0;

	@OriginalMember(owner = "client!ga", name = "O", descriptor = "I")
	private int anInt3647 = 0;

	@OriginalMember(owner = "client!ga", name = "L", descriptor = "I")
	private int anInt3645 = 0;

	@OriginalMember(owner = "client!ga", name = "Z", descriptor = "I")
	private int anInt3658 = 0;

	@OriginalMember(owner = "client!ga", name = "bb", descriptor = "Z")
	private boolean aBoolean259 = false;

	@OriginalMember(owner = "client!ga", name = "db", descriptor = "I")
	private final int anInt3660 = -1;

	@OriginalMember(owner = "client!ga", name = "ab", descriptor = "Z")
	public boolean aBoolean258 = false;

	@OriginalMember(owner = "client!ga", name = "mb", descriptor = "I")
	private int anInt3667 = 0;

	@OriginalMember(owner = "client!ga", name = "J", descriptor = "I")
	private int anInt3643;

	@OriginalMember(owner = "client!ga", name = "eb", descriptor = "I")
	public final int anInt3661;

	@OriginalMember(owner = "client!ga", name = "gb", descriptor = "Lclient!qg;")
	private Class270 aClass270_3;

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
	public Class25_Sub2_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt3658 = arg12;
		this.anInt3643 = arg0;
		this.anInt3661 = arg2 + arg1;
		@Pc(54) Class250 local54 = Static386.aClass23_1.method228(this.anInt3643);
		@Pc(57) int local57 = local54.anInt7025;
		if (local57 == -1) {
			this.aBoolean258 = true;
		} else {
			this.aClass270_3 = Static245.aClass155_1.method3820(local57);
			this.aBoolean258 = false;
		}
		if (arg2 == this.anInt3661) {
			Static217.method3600(this.anInt3650, this, this.aClass270_3);
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V")
	public void method2967() {
		if (this.lb != null) {
			this.lb.method3778();
		}
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(ILclient!r;)Lclient!od;")
	@Override
	public Class25_Sub10 method6647(@OriginalArg(1) Class31 arg0) {
		@Pc(20) Class52 local20 = this.method2972(this.anInt3643, (this.anInt3658 == 0 ? 0 : 5) | 0x800, arg0);
		if (local20 == null) {
			return null;
		}
		if (this.anInt3658 != 0) {
			local20.M(this.anInt3658 * 2048);
		}
		@Pc(42) Class42 local42 = arg0.method8052();
		local42.NA(super.anInt8476, super.anInt8480, super.anInt8482);
		this.method2969(arg0, local20, local42);
		if (Static547.aBoolean631) {
			local20.method7619(local42, null, Static150.anInt3469, 0);
		} else {
			local20.method7617(local42, null, 0);
		}
		if (this.lb != null) {
			@Pc(78) Class323 local78 = this.lb.method3777();
			if (Static547.aBoolean631) {
				arg0.method8070(local78, Static150.anInt3469);
			} else {
				arg0.method8090(local78);
			}
		}
		this.aBoolean259 = local20.LA();
		this.anInt3645 = local20.J();
		this.anInt3647 = local20.RA();
		return null;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!r;Lclient!da;Lclient!q;B)V")
	private void method2969(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class52 arg1, @OriginalArg(2) Class42 arg2) {
		arg1.method7614(arg2);
		@Pc(19) Class317[] local19 = arg1.method7613();
		@Pc(22) Class280[] local22 = arg1.method7636();
		if ((this.lb == null || this.lb.aBoolean304) && (local19 != null || local22 != null)) {
			this.lb = Static236.method3776(Static397.anInt6998, true);
		}
		if (this.lb != null) {
			this.lb.method3784(arg0, (long) Static397.anInt6998, local19, local22);
			this.lb.method3786(super.aByte117, super.aShort106, super.aShort108, super.aShort107, super.aShort109);
		}
	}

	@OriginalMember(owner = "client!ga", name = "f", descriptor = "(B)V")
	@Override
	public void method6644() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)V")
	public void method2970(@OriginalArg(1) int arg0) {
		if (this.aBoolean258) {
			return;
		}
		this.anInt3667 += arg0;
		while (this.aClass270_3.anIntArray445[this.anInt3650] < this.anInt3667) {
			this.anInt3667 -= this.aClass270_3.anIntArray445[this.anInt3650];
			this.anInt3650++;
			if (this.aClass270_3.anIntArray443.length <= this.anInt3650) {
				this.aBoolean258 = true;
				break;
			}
		}
		if (!this.aBoolean258) {
			Static217.method3600(this.anInt3650, this, this.aClass270_3);
		}
	}

	@OriginalMember(owner = "client!ga", name = "g", descriptor = "(B)I")
	@Override
	public int method6650(@OriginalArg(0) byte arg0) {
		if (arg0 < 108) {
			this.anInt3643 = -104;
		}
		return this.anInt3647;
	}

	@OriginalMember(owner = "client!ga", name = "g", descriptor = "(I)I")
	@Override
	public int method6652() {
		return this.anInt3645;
	}

	@OriginalMember(owner = "client!ga", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.lb != null) {
			this.lb.method3778();
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZILclient!r;I)Z")
	@Override
	public boolean method6657(@OriginalArg(1) int arg0, @OriginalArg(2) Class31 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIILclient!r;)Lclient!da;")
	private Class52 method2972(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class31 arg2) {
		@Pc(8) Class250 local8 = Static386.aClass23_1.method228(arg0);
		@Pc(21) Class127 local21 = Static420.aClass127Array6[super.aByte117];
		@Pc(34) Class127 local34 = super.aByte118 < 3 ? Static420.aClass127Array6[super.aByte118 + 1] : null;
		return this.aBoolean258 ? local8.method5607(0, Static245.aClass155_1, super.anInt8480, -1, local34, local21, super.anInt8476, arg2, arg1, super.anInt8482, -1) : local8.method5607(this.anInt3667, Static245.aClass155_1, super.anInt8480, this.anInt3650, local34, local21, super.anInt8476, arg2, arg1, super.anInt8482, this.anInt3660);
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method6656(@OriginalArg(0) Class31 arg0) {
		@Pc(11) Class52 local11 = this.method2972(this.anInt3643, 0, arg0);
		if (local11 != null) {
			@Pc(20) Class42 local20 = arg0.method8052();
			local20.NA(super.anInt8476, super.anInt8480, super.anInt8482);
			this.method2969(arg0, local11, local20);
		}
	}

	@OriginalMember(owner = "client!ga", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method6655() {
		return this.aBoolean259;
	}

	@OriginalMember(owner = "client!ga", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method6643() {
		return false;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIILclient!r;ZILclient!pn;)V")
	@Override
	public void method6654(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class31 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class25_Sub2 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ga", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method6653() {
		return false;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(BLclient!r;)Lclient!ll;")
	@Override
	public Class190 method6648(@OriginalArg(1) Class31 arg0) {
		return null;
	}
}
