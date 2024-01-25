import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vr")
public final class Class1_Sub4_Sub2_Sub5 extends Class1_Sub4_Sub2 {

	@OriginalMember(owner = "client!vr", name = "pb", descriptor = "Lclient!au;")
	private Class1_Sub2 aClass1_Sub2_7;

	@OriginalMember(owner = "client!vr", name = "U", descriptor = "Z")
	private boolean aBoolean699 = false;

	@OriginalMember(owner = "client!vr", name = "ib", descriptor = "Z")
	public boolean aBoolean700 = false;

	@OriginalMember(owner = "client!vr", name = "gb", descriptor = "I")
	private int anInt9962 = 0;

	@OriginalMember(owner = "client!vr", name = "Y", descriptor = "I")
	private final int anInt9955 = -1;

	@OriginalMember(owner = "client!vr", name = "rb", descriptor = "I")
	private int anInt9970 = 0;

	@OriginalMember(owner = "client!vr", name = "lb", descriptor = "I")
	private int lb = 0;

	@OriginalMember(owner = "client!vr", name = "tb", descriptor = "I")
	private int anInt9972 = 0;

	@OriginalMember(owner = "client!vr", name = "ob", descriptor = "I")
	private int anInt9968 = 0;

	@OriginalMember(owner = "client!vr", name = "X", descriptor = "I")
	public final int anInt9954;

	@OriginalMember(owner = "client!vr", name = "S", descriptor = "I")
	private final int anInt9951;

	@OriginalMember(owner = "client!vr", name = "db", descriptor = "Lclient!wt;")
	private Class365 aClass365_3;

	@OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
	public Class1_Sub4_Sub2_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt9954 = arg2 + arg1;
		this.anInt9951 = arg0;
		this.anInt9972 = arg12;
		@Pc(54) Class200 local54 = Static569.aClass213_2.method5291(this.anInt9951);
		@Pc(57) int local57 = local54.anInt5925;
		if (local57 == -1) {
			this.aBoolean700 = true;
		} else {
			this.aClass365_3 = Static61.aClass48_1.method1016(local57);
			this.aBoolean700 = false;
		}
		if (this.anInt9954 == arg2) {
			Static301.method5179(this.aClass365_3, this, this.lb);
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIILclient!r;)Lclient!da;")
	private Class57 method8133(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class44 arg2) {
		@Pc(14) Class200 local14 = Static569.aClass213_2.method5291(arg1);
		@Pc(19) Class83 local19 = Static444.aClass83Array7[super.aByte126];
		@Pc(34) Class83 local34 = super.aByte127 >= 3 ? null : Static444.aClass83Array7[super.aByte127 + 1];
		return this.aBoolean700 ? local14.method5071(-1, super.anInt9934, -1, super.anInt9935, local19, Static61.aClass48_1, arg0, arg2, 0, local34, super.anInt9932) : local14.method5071(this.lb, super.anInt9934, this.anInt9955, super.anInt9935, local19, Static61.aClass48_1, arg0, arg2, this.anInt9968, local34, super.anInt9932);
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method8124(@OriginalArg(0) Class44 arg0) {
		@Pc(16) Class57 local16 = this.method8133(0, this.anInt9951, arg0);
		if (local16 != null) {
			@Pc(21) Class8 local21 = arg0.method5007();
			local21.NA(super.anInt9934, super.anInt9932, super.anInt9935);
			this.method8136(local21, arg0, local16);
		}
	}

	@OriginalMember(owner = "client!vr", name = "e", descriptor = "(B)I")
	@Override
	public int method8123(@OriginalArg(0) byte arg0) {
		return arg0 == -117 ? this.anInt9970 : 100;
	}

	@OriginalMember(owner = "client!vr", name = "f", descriptor = "(I)I")
	@Override
	public int method8117() {
		return this.anInt9962;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lclient!r;B)Lclient!lt;")
	@Override
	public Class1_Sub8 method8130(@OriginalArg(0) Class44 arg0) {
		@Pc(30) Class57 local30 = this.method8133((this.anInt9972 == 0 ? 0 : 5) | 0x800, this.anInt9951, arg0);
		if (local30 == null) {
			return null;
		}
		if (this.anInt9972 != 0) {
			local30.M(this.anInt9972 * 2048);
		}
		@Pc(49) Class8 local49 = arg0.method5007();
		local49.NA(super.anInt9934, super.anInt9932, super.anInt9935);
		this.method8136(local49, arg0, local30);
		if (Static361.aBoolean500) {
			local30.method7919(local49, null, Static6.anInt161, 0);
		} else {
			local30.method7927(local49, null, 0);
		}
		if (this.aClass1_Sub2_7 != null) {
			@Pc(85) Class305 local85 = this.aClass1_Sub2_7.method329();
			if (Static361.aBoolean500) {
				arg0.method5026(local85, Static6.anInt161);
			} else {
				arg0.method5017(local85);
			}
		}
		this.aBoolean699 = local30.LA();
		this.anInt9962 = local30.J();
		this.anInt9970 = local30.RA();
		return null;
	}

	@OriginalMember(owner = "client!vr", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method8114() {
		return false;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lclient!r;III)Z")
	@Override
	public boolean method8116(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!vr", name = "h", descriptor = "(I)V")
	@Override
	public void method8120() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lclient!q;ILclient!r;Lclient!da;)V")
	private void method8136(@OriginalArg(0) Class8 arg0, @OriginalArg(2) Class44 arg1, @OriginalArg(3) Class57 arg2) {
		arg2.method7926(arg0);
		@Pc(9) Class227[] local9 = arg2.method7915();
		@Pc(12) Class103[] local12 = arg2.method7920();
		if ((this.aClass1_Sub2_7 == null || this.aClass1_Sub2_7.aBoolean21) && (local9 != null || local12 != null)) {
			this.aClass1_Sub2_7 = Static25.method339(Static106.anInt2418, true);
		}
		if (this.aClass1_Sub2_7 != null) {
			this.aClass1_Sub2_7.method333(arg1, (long) Static106.anInt2418, local9, local12);
			this.aClass1_Sub2_7.method338(super.aByte126, super.aShort121, super.aShort122, super.aShort120, super.aShort119);
		}
	}

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "(I)V")
	public void method8137() {
		if (this.aClass1_Sub2_7 != null) {
			this.aClass1_Sub2_7.method337();
		}
	}

	@OriginalMember(owner = "client!vr", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method8128() {
		return this.aBoolean699;
	}

	@OriginalMember(owner = "client!vr", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass1_Sub2_7 != null) {
			this.aClass1_Sub2_7.method337();
		}
	}

	@OriginalMember(owner = "client!vr", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8118() {
		return false;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIZLclient!r;ILclient!ub;I)V")
	@Override
	public void method8127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class44 arg3, @OriginalArg(5) Class1_Sub4 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(II)V")
	public void method8141(@OriginalArg(1) int arg0) {
		if (this.aBoolean700) {
			return;
		}
		this.anInt9968 += arg0;
		while (this.aClass365_3.anIntArray552[this.lb] < this.anInt9968) {
			this.anInt9968 -= this.aClass365_3.anIntArray552[this.lb];
			this.lb++;
			if (this.lb >= this.aClass365_3.anIntArray551.length) {
				this.aBoolean700 = true;
				break;
			}
		}
		if (!this.aBoolean700) {
			Static301.method5179(this.aClass365_3, this, this.lb);
		}
	}

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "(BLclient!r;)Lclient!sr;")
	@Override
	public Class308 method8121(@OriginalArg(1) Class44 arg0) {
		return null;
	}
}
