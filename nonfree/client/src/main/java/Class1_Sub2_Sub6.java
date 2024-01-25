import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sq")
public final class Class1_Sub2_Sub6 extends Class1_Sub2 {

	@OriginalMember(owner = "client!sq", name = "F", descriptor = "Lclient!mk;")
	private Class57_Sub6 aClass57_Sub6_6;

	@OriginalMember(owner = "client!sq", name = "E", descriptor = "Z")
	public boolean aBoolean532 = false;

	@OriginalMember(owner = "client!sq", name = "I", descriptor = "I")
	private int anInt6016 = 0;

	@OriginalMember(owner = "client!sq", name = "M", descriptor = "I")
	private final int anInt6018 = -1;

	@OriginalMember(owner = "client!sq", name = "H", descriptor = "I")
	private int anInt6015 = 0;

	@OriginalMember(owner = "client!sq", name = "X", descriptor = "I")
	private int anInt6028 = -32768;

	@OriginalMember(owner = "client!sq", name = "z", descriptor = "I")
	public final int anInt6011;

	@OriginalMember(owner = "client!sq", name = "U", descriptor = "I")
	private final int anInt6025;

	@OriginalMember(owner = "client!sq", name = "J", descriptor = "Lclient!gr;")
	private Class84 aClass84_3;

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class1_Sub2_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false, (byte) 0);
		this.anInt6011 = arg1 + arg2;
		this.anInt6025 = arg0;
		@Pc(40) int local40 = Static41.method4707(this.anInt6025).anInt5808;
		if (local40 == -1) {
			this.aBoolean532 = true;
		} else {
			this.aBoolean532 = false;
			this.aClass84_3 = Static91.method1822(local40);
		}
		if (arg2 == this.anInt6011) {
			Static41.method4705(false, this.anInt6016, super.anInt6888, super.anInt6893, this.aClass84_3, super.aByte77);
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IILclient!dr;I)Z")
	@Override
	public boolean method5757(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class37 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!sq", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass57_Sub6_6 != null) {
			this.aClass57_Sub6_6.method3845();
		}
	}

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "(B)V")
	@Override
	public void method5761() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!sq", name = "c", descriptor = "(Z)I")
	@Override
	public int method5766() {
		return this.anInt6028;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(ILclient!dr;I)Lclient!wp;")
	private Class49 method5084(@OriginalArg(1) Class37 arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class177 local12 = Static41.method4707(this.anInt6025);
		return this.aBoolean532 ? local12.method4854(-1, arg1, 0, arg0, -1) : local12.method4854(this.anInt6016, arg1, this.anInt6015, arg0, this.anInt6018);
	}

	@OriginalMember(owner = "client!sq", name = "c", descriptor = "(Lclient!dr;I)V")
	@Override
	public void method5754(@OriginalArg(0) Class37 arg0) {
		@Pc(14) Class49 local14 = this.method5084(arg0, 0);
		if (local14 != null) {
			this.method5090(local14, arg0);
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IB)V")
	public void method5087(@OriginalArg(0) int arg0) {
		if (this.aBoolean532) {
			return;
		}
		this.anInt6015 += arg0;
		while (this.aClass84_3.anIntArray198[this.anInt6016] < this.anInt6015) {
			this.anInt6015 -= this.aClass84_3.anIntArray198[this.anInt6016];
			this.anInt6016++;
			if (this.aClass84_3.anIntArray197.length <= this.anInt6016) {
				this.aBoolean532 = true;
				break;
			}
		}
		if (!this.aBoolean532) {
			Static41.method4705(false, this.anInt6016, super.anInt6888, super.anInt6893, this.aClass84_3, super.aByte77);
		}
	}

	@OriginalMember(owner = "client!sq", name = "d", descriptor = "(Lclient!dr;I)Lclient!kq;")
	@Override
	public Class57_Sub5 method5758(@OriginalArg(0) Class37 arg0) {
		@Pc(11) Class49 local11 = this.method5084(arg0, 1024);
		if (local11 == null) {
			return null;
		}
		@Pc(30) Class38 local30 = arg0.method3672();
		local30.method4474(super.anInt6893, super.anInt6886, super.anInt6888);
		if (this.aClass57_Sub6_6 == null) {
			local11.method5825(local30, null, 0);
		} else {
			@Pc(52) Class214 local52 = this.aClass57_Sub6_6.method3844();
			arg0.method3692(local11, local52, local30, null);
		}
		this.anInt6028 = local11.method5842();
		this.method5090(local11, arg0);
		return null;
	}

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method5759() {
		return false;
	}

	@OriginalMember(owner = "client!sq", name = "c", descriptor = "(I)V")
	public void method5089() {
		if (this.aClass57_Sub6_6 != null) {
			this.aClass57_Sub6_6.method3845();
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(ZILclient!la;IIILclient!dr;)V")
	@Override
	public void method5762(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class37 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(ILclient!wp;Lclient!dr;)V")
	private void method5090(@OriginalArg(1) Class49 arg0, @OriginalArg(2) Class37 arg1) {
		@Pc(6) Class197[] local6 = arg0.method5828();
		@Pc(9) Class136[] local9 = arg0.method5832();
		if ((this.aClass57_Sub6_6 == null || this.aClass57_Sub6_6.aBoolean379) && (local6 != null || local9 != null)) {
			this.aClass57_Sub6_6 = new Class57_Sub6(Static6.anInt91);
		}
		if (this.aClass57_Sub6_6 != null) {
			this.aClass57_Sub6_6.method3854(arg1, (long) Static6.anInt91, local6, local9);
			this.aClass57_Sub6_6.method3843(super.aByte77, super.aShort89, super.aShort88, super.aShort90, super.aShort87);
		}
	}
}
