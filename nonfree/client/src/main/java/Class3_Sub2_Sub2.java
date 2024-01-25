import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kt")
public final class Class3_Sub2_Sub2 extends Class3_Sub2 {

	@OriginalMember(owner = "client!kt", name = "H", descriptor = "Lclient!bq;")
	private Class8_Sub3 aClass8_Sub3_4;

	@OriginalMember(owner = "client!kt", name = "B", descriptor = "I")
	private int anInt4132 = 0;

	@OriginalMember(owner = "client!kt", name = "D", descriptor = "Z")
	public boolean aBoolean303 = false;

	@OriginalMember(owner = "client!kt", name = "L", descriptor = "I")
	private final int anInt4139 = -1;

	@OriginalMember(owner = "client!kt", name = "O", descriptor = "I")
	private int anInt4142 = 0;

	@OriginalMember(owner = "client!kt", name = "J", descriptor = "I")
	private int anInt4137 = 0;

	@OriginalMember(owner = "client!kt", name = "K", descriptor = "I")
	private int anInt4138 = -32768;

	@OriginalMember(owner = "client!kt", name = "F", descriptor = "I")
	private final int anInt4135;

	@OriginalMember(owner = "client!kt", name = "M", descriptor = "I")
	public final int anInt4140;

	@OriginalMember(owner = "client!kt", name = "Q", descriptor = "I")
	private final int anInt4144;

	@OriginalMember(owner = "client!kt", name = "I", descriptor = "Lclient!vf;")
	private Class250 aClass250_2;

	@OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
	public Class3_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg3, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt4142 = arg12;
		this.anInt4135 = arg0;
		this.anInt4140 = arg1 + arg2;
		this.anInt4144 = arg4;
		@Pc(49) Class203 local49 = Static395.aClass247_2.method5407(this.anInt4135);
		@Pc(52) int local52 = local49.anInt5615;
		if (local52 == -1) {
			this.aBoolean303 = true;
		} else {
			this.aClass250_2 = Static338.aClass12_2.method255(local52);
			this.aBoolean303 = false;
		}
		if (this.anInt4140 == arg2) {
			Static131.method2230(super.anInt6119, super.anInt6121, super.aByte89, false, this.aClass250_2, this.anInt4137);
		}
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIILclient!ya;)Lclient!t;")
	private Class91 method3360(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class49 arg2) {
		@Pc(13) Class203 local13 = Static395.aClass247_2.method5407(arg1);
		@Pc(18) Class64 local18 = Static263.aClass64Array2[super.aByte89];
		@Pc(33) Class64 local33 = this.anInt4144 < 3 ? Static263.aClass64Array2[this.anInt4144 + 1] : null;
		return this.aBoolean303 ? local13.method4522(arg2, super.anInt6119, Static338.aClass12_2, local18, super.anInt6121, -1, 0, super.anInt6120, -1, local33, arg0) : local13.method4522(arg2, super.anInt6119, Static338.aClass12_2, local18, super.anInt6121, this.anInt4137, this.anInt4132, super.anInt6120, this.anInt4139, local33, arg0);
	}

	@OriginalMember(owner = "client!kt", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass8_Sub3_4 != null) {
			this.aClass8_Sub3_4.method565();
		}
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(Lclient!t;BLclient!ya;)V")
	private void method3362(@OriginalArg(0) Class91 arg0, @OriginalArg(2) Class49 arg1) {
		@Pc(6) Class200[] local6 = arg0.method3290();
		@Pc(9) Class189[] local9 = arg0.method3278();
		if ((this.aClass8_Sub3_4 == null || this.aClass8_Sub3_4.aBoolean35) && (local6 != null || local9 != null)) {
			this.aClass8_Sub3_4 = new Class8_Sub3(Static131.anInt2821);
		}
		if (this.aClass8_Sub3_4 != null) {
			this.aClass8_Sub3_4.method556(arg1, (long) Static131.anInt2821, local6, local9);
			this.aClass8_Sub3_4.method558(super.aByte89, super.aShort85, super.aShort87, super.aShort86, super.aShort88);
		}
	}

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "(Z)I")
	@Override
	public int method4916() {
		return this.anInt4138;
	}

	@OriginalMember(owner = "client!kt", name = "h", descriptor = "(I)V")
	@Override
	public void method5144() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(Lclient!ya;B)Lclient!mf;")
	@Override
	public Class8_Sub5 method5141(@OriginalArg(0) Class49 arg0) {
		@Pc(18) Class91 local18 = this.method3360((this.anInt4142 == 0 ? 0 : 5) | 0x800, this.anInt4135, arg0);
		if (local18 == null) {
			return null;
		}
		if (this.anInt4142 != 0) {
			local18.Q(this.anInt4142 * 2048);
		}
		@Pc(34) Class35 local34 = arg0.method4445();
		local34.j(super.anInt6119, super.anInt6120, super.anInt6121);
		if (this.aClass8_Sub3_4 == null) {
			local18.method3276(local34, null, 0);
		} else {
			@Pc(61) Class194 local61 = this.aClass8_Sub3_4.method561();
			arg0.method4468(local18, local61, local34, null);
		}
		this.anInt4138 = local18.MA();
		this.method3362(local18, arg0);
		return null;
	}

	@OriginalMember(owner = "client!kt", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method5135() {
		return false;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(Lclient!ya;IZLclient!ij;III)V")
	@Override
	public void method5136(@OriginalArg(0) Class49 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class3 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(ZILclient!ya;I)Z")
	@Override
	public boolean method5140(@OriginalArg(1) int arg0, @OriginalArg(2) Class49 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(II)V")
	public void method3364(@OriginalArg(0) int arg0) {
		if (this.aBoolean303) {
			return;
		}
		this.anInt4132 += arg0;
		while (this.anInt4132 > this.aClass250_2.anIntArray594[this.anInt4137]) {
			this.anInt4132 -= this.aClass250_2.anIntArray594[this.anInt4137];
			this.anInt4137++;
			if (this.aClass250_2.anIntArray592.length <= this.anInt4137) {
				this.aBoolean303 = true;
				break;
			}
		}
		if (!this.aBoolean303) {
			Static131.method2230(super.anInt6119, super.anInt6121, super.aByte89, false, this.aClass250_2, this.anInt4137);
		}
	}

	@OriginalMember(owner = "client!kt", name = "c", descriptor = "(ILclient!ya;)V")
	@Override
	public void method5143(@OriginalArg(1) Class49 arg0) {
		@Pc(22) Class91 local22 = this.method3360(0, this.anInt4135, arg0);
		if (local22 != null) {
			this.method3362(local22, arg0);
		}
	}

	@OriginalMember(owner = "client!kt", name = "d", descriptor = "(Z)V")
	public void method3366() {
		if (this.aClass8_Sub3_4 != null) {
			this.aClass8_Sub3_4.method565();
		}
	}
}
