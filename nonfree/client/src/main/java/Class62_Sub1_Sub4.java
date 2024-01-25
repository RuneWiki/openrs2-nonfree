import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public final class Class62_Sub1_Sub4 extends Class62_Sub1 {

	@OriginalMember(owner = "client!ma", name = "db", descriptor = "Lclient!om;")
	private Class55_Sub7 aClass55_Sub7_4;

	@OriginalMember(owner = "client!ma", name = "E", descriptor = "I")
	private final int anInt3797 = -1;

	@OriginalMember(owner = "client!ma", name = "ab", descriptor = "I")
	private int anInt3817 = 0;

	@OriginalMember(owner = "client!ma", name = "Q", descriptor = "I")
	private int anInt3807 = -32768;

	@OriginalMember(owner = "client!ma", name = "L", descriptor = "I")
	private int anInt3803 = 0;

	@OriginalMember(owner = "client!ma", name = "gb", descriptor = "Z")
	public boolean aBoolean334 = false;

	@OriginalMember(owner = "client!ma", name = "T", descriptor = "I")
	public final int anInt3810;

	@OriginalMember(owner = "client!ma", name = "J", descriptor = "I")
	private final int anInt3801;

	@OriginalMember(owner = "client!ma", name = "G", descriptor = "Lclient!kb;")
	private Class107 aClass107_3;

	static {
		new Class93("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.");
	}

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class62_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false, (byte) 0);
		this.anInt3810 = arg1 + arg2;
		this.anInt3801 = arg0;
		@Pc(40) int local40 = Static44.method1076(this.anInt3801).anInt6968;
		if (local40 == -1) {
			this.aBoolean334 = true;
		} else {
			this.aBoolean334 = false;
			this.aClass107_3 = Static212.method3773(local40);
		}
		if (this.anInt3810 == arg2) {
			Static343.method5928(false, this.aClass107_3, super.anInt5289, this.anInt3803, super.anInt5280);
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(BILclient!ae;)Lclient!bk;")
	private Class7 method3499(@OriginalArg(1) int arg0, @OriginalArg(2) Class4 arg1) {
		@Pc(13) Class215 local13 = Static44.method1076(this.anInt3801);
		return this.aBoolean334 ? local13.method5985(arg0, arg1, -1, -1, 0) : local13.method5985(arg0, arg1, this.anInt3803, this.anInt3797, this.anInt3817);
	}

	@OriginalMember(owner = "client!ma", name = "e", descriptor = "(I)V")
	@Override
	public void method5569() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(BLclient!ae;)Lclient!jg;")
	@Override
	public Class55_Sub3 method5568(@OriginalArg(1) Class4 arg0) {
		@Pc(9) Class7 local9 = this.method3499(1024, arg0);
		if (local9 == null) {
			return null;
		}
		@Pc(21) Class133 local21 = arg0.method4244();
		local21.method4324(super.anInt5289, super.anInt5291, super.anInt5280);
		if (this.aClass55_Sub7_4 == null) {
			local9.method1441(local21, null, 0);
		} else {
			@Pc(43) Class75 local43 = this.aClass55_Sub7_4.method4034();
			arg0.method4245(local9, local43, local21, null);
		}
		this.anInt3807 = local9.method1430();
		this.method3501(arg0, local9);
		return null;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!ae;ILclient!bk;)V")
	private void method3501(@OriginalArg(0) Class4 arg0, @OriginalArg(2) Class7 arg1) {
		@Pc(12) Class161[] local12 = arg1.method1424();
		@Pc(15) Class44[] local15 = arg1.method1399();
		if ((this.aClass55_Sub7_4 == null || this.aClass55_Sub7_4.aBoolean393) && (local12 != null || local15 != null)) {
			this.aClass55_Sub7_4 = new Class55_Sub7(Static212.anInt4090);
		}
		if (this.aClass55_Sub7_4 != null) {
			this.aClass55_Sub7_4.method4025(arg0, (long) Static212.anInt4090, local12, local15);
			this.aClass55_Sub7_4.method4035(super.aByte56, super.aShort84, super.aShort86, super.aShort83, super.aShort85);
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5564() {
		return false;
	}

	@OriginalMember(owner = "client!ma", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass55_Sub7_4 != null) {
			this.aClass55_Sub7_4.method4032();
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILclient!ae;II)Z")
	@Override
	public boolean method5565(@OriginalArg(0) int arg0, @OriginalArg(1) Class4 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "(II)V")
	public void method3504(@OriginalArg(1) int arg0) {
		if (this.aBoolean334) {
			return;
		}
		this.anInt3817 += arg0;
		while (this.anInt3817 > this.aClass107_3.anIntArray279[this.anInt3803]) {
			this.anInt3817 -= this.aClass107_3.anIntArray279[this.anInt3803];
			this.anInt3803++;
			if (this.aClass107_3.anIntArray280.length <= this.anInt3803) {
				this.aBoolean334 = true;
				break;
			}
		}
		if (!this.aBoolean334) {
			Static343.method5928(false, this.aClass107_3, super.anInt5289, this.anInt3803, super.anInt5280);
		}
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)V")
	public void method3505() {
		if (this.aClass55_Sub7_4 != null) {
			this.aClass55_Sub7_4.method4032();
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZBIILclient!na;ILclient!ae;)V")
	@Override
	public void method5570(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class62 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class4 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ma", name = "h", descriptor = "(I)I")
	@Override
	public int method4764() {
		return this.anInt3807;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!ae;B)V")
	@Override
	public void method5567(@OriginalArg(0) Class4 arg0) {
		@Pc(16) Class7 local16 = this.method3499(0, arg0);
		if (local16 != null) {
			this.method3501(arg0, local16);
		}
	}
}
