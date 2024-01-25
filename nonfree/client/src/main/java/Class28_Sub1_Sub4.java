import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rs")
public final class Class28_Sub1_Sub4 extends Class28_Sub1 {

	@OriginalMember(owner = "client!rs", name = "E", descriptor = "Lclient!g;")
	private Class12_Sub4 aClass12_Sub4_6;

	@OriginalMember(owner = "client!rs", name = "H", descriptor = "I")
	private int anInt5301 = 0;

	@OriginalMember(owner = "client!rs", name = "D", descriptor = "I")
	private final int anInt5298 = -1;

	@OriginalMember(owner = "client!rs", name = "N", descriptor = "I")
	private int anInt5305 = -32768;

	@OriginalMember(owner = "client!rs", name = "F", descriptor = "I")
	private int anInt5299 = 0;

	@OriginalMember(owner = "client!rs", name = "L", descriptor = "Z")
	public boolean aBoolean413 = false;

	@OriginalMember(owner = "client!rs", name = "R", descriptor = "I")
	private final int anInt5309;

	@OriginalMember(owner = "client!rs", name = "Q", descriptor = "I")
	public final int anInt5308;

	@OriginalMember(owner = "client!rs", name = "T", descriptor = "Lclient!ok;")
	private Class177 aClass177_2;

	static {
		new Class57("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
	}

	@OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class28_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false, (byte) 0);
		this.anInt5309 = arg0;
		this.anInt5308 = arg2 + arg1;
		@Pc(41) int local41 = Static224.aClass203_2.method4559(this.anInt5309).anInt3050;
		if (local41 == -1) {
			this.aBoolean413 = true;
		} else {
			this.aBoolean413 = false;
			this.aClass177_2 = Static176.aClass43_2.method930(local41);
		}
		if (arg2 == this.anInt5308) {
			Static351.method2911(super.aByte73, super.anInt5774, this.anInt5299, this.aClass177_2, super.anInt5766, false);
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lclient!np;BI)Lclient!f;")
	private Class75 method4729(@OriginalArg(0) Class155 arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class125 local14 = Static224.aClass203_2.method4559(this.anInt5309);
		return this.aBoolean413 ? local14.method2695(Static176.aClass43_2, 0, arg0, -1, -1, arg1) : local14.method2695(Static176.aClass43_2, this.anInt5301, arg0, this.anInt5298, this.anInt5299, arg1);
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(ILclient!in;ILclient!np;BZI)V")
	@Override
	public void method5410(@OriginalArg(0) int arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class155 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!rs", name = "d", descriptor = "(I)V")
	@Override
	public void method5411() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!rs", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass12_Sub4_6 != null) {
			this.aClass12_Sub4_6.method1799();
		}
	}

	@OriginalMember(owner = "client!rs", name = "j", descriptor = "(I)I")
	@Override
	public int method5191() {
		return this.anInt5305;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(ILclient!np;Lclient!f;)V")
	private void method4732(@OriginalArg(1) Class155 arg0, @OriginalArg(2) Class75 arg1) {
		@Pc(6) Class241[] local6 = arg1.method5480();
		@Pc(15) Class158[] local15 = arg1.method5488();
		if ((this.aClass12_Sub4_6 == null || this.aClass12_Sub4_6.aBoolean160) && (local6 != null || local15 != null)) {
			this.aClass12_Sub4_6 = new Class12_Sub4(Static76.anInt1617);
		}
		if (this.aClass12_Sub4_6 != null) {
			this.aClass12_Sub4_6.method1803(arg0, (long) Static76.anInt1617, local6, local15);
			this.aClass12_Sub4_6.method1793(super.aByte73, super.aShort89, super.aShort88, super.aShort87, super.aShort90);
		}
	}

	@OriginalMember(owner = "client!rs", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5413() {
		return false;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIILclient!np;)Z")
	@Override
	public boolean method5408(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class155 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lclient!np;B)V")
	@Override
	public void method5406(@OriginalArg(0) Class155 arg0) {
		@Pc(15) Class75 local15 = this.method4729(arg0, 0);
		if (local15 != null) {
			this.method4732(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "(I)V")
	public void method4734() {
		if (this.aClass12_Sub4_6 != null) {
			this.aClass12_Sub4_6.method1799();
		}
	}

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "(ILclient!np;)Lclient!ql;")
	@Override
	public Class12_Sub7 method5407(@OriginalArg(1) Class155 arg0) {
		@Pc(9) Class75 local9 = this.method4729(arg0, 1024);
		if (local9 == null) {
			return null;
		}
		@Pc(22) Class118 local22 = arg0.method4908();
		local22.method2659(super.anInt5774, super.anInt5769, super.anInt5766);
		if (this.aClass12_Sub4_6 == null) {
			local9.method5469(local22, null, 0);
		} else {
			@Pc(44) Class47 local44 = this.aClass12_Sub4_6.method1797();
			arg0.method4905(local9, local44, local22, null);
		}
		this.anInt5305 = local9.method5476();
		this.method4732(arg0, local9);
		return null;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(II)V")
	public void method4735(@OriginalArg(0) int arg0) {
		if (this.aBoolean413) {
			return;
		}
		this.anInt5301 += arg0;
		while (this.anInt5301 > this.aClass177_2.anIntArray501[this.anInt5299]) {
			this.anInt5301 -= this.aClass177_2.anIntArray501[this.anInt5299];
			this.anInt5299++;
			if (this.aClass177_2.anIntArray499.length <= this.anInt5299) {
				this.aBoolean413 = true;
				break;
			}
		}
		if (!this.aBoolean413) {
			Static351.method2911(super.aByte73, super.anInt5774, this.anInt5299, this.aClass177_2, super.anInt5766, false);
		}
	}
}
