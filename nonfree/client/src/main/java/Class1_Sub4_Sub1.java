import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mp")
public final class Class1_Sub4_Sub1 extends Class1_Sub4 {

	@OriginalMember(owner = "client!mp", name = "w", descriptor = "I")
	public int anInt4402;

	@OriginalMember(owner = "client!mp", name = "x", descriptor = "I")
	public int anInt4403;

	@OriginalMember(owner = "client!mp", name = "A", descriptor = "I")
	public int anInt4406;

	@OriginalMember(owner = "client!mp", name = "K", descriptor = "I")
	public int anInt4412;

	@OriginalMember(owner = "client!mp", name = "H", descriptor = "I")
	public int anInt4411 = -1;

	@OriginalMember(owner = "client!mp", name = "z", descriptor = "I")
	public int anInt4405 = -1;

	static {
		new Class62("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
	}

	@OriginalMember(owner = "client!mp", name = "d", descriptor = "(ILclient!oj;)V")
	@Override
	public void method6023(@OriginalArg(1) Class48 arg0) {
	}

	@OriginalMember(owner = "client!mp", name = "c", descriptor = "(ILclient!oj;)Lclient!mg;")
	@Override
	public Class7_Sub5 method6013(@OriginalArg(1) Class48 arg0) {
		@Pc(6) Class21 local6 = arg0.method2445();
		local6.method3711(super.anInt4395, super.anInt4399, super.anInt4396);
		@Pc(18) Class7_Sub5 local18 = Static234.method4211(3);
		@Pc(40) Class159 local40;
		if (this.anInt4411 != -1) {
			local40 = Static57.aClass196_1.method4827(this.anInt4411).method3842(-1, 1024, null, null, 0, this.anInt4412, 0, arg0);
			if (local40 != null) {
				local40.method4952(local6, local18.aClass7_Sub6Array1[2], 0);
			}
		}
		if (this.anInt4405 != -1) {
			local40 = Static57.aClass196_1.method4827(this.anInt4405).method3842(-1, 1024, null, null, 0, this.anInt4406, 0, arg0);
			if (local40 != null) {
				local40.method4952(local6, local18.aClass7_Sub6Array1[1], 0);
			}
		}
		local40 = Static57.aClass196_1.method4827(this.anInt4402).method3842(-1, 1024, null, null, 0, this.anInt4403, 0, arg0);
		if (local40 != null) {
			local40.method4952(local6, local18.aClass7_Sub6Array1[0], 0);
		}
		return local18;
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(ILclient!oj;II)Z")
	@Override
	public boolean method6016(@OriginalArg(0) int arg0, @OriginalArg(1) Class48 arg1, @OriginalArg(2) int arg2) {
		@Pc(11) Class21 local11 = arg1.method2445();
		local11.method3711(super.anInt4395, super.anInt4399, super.anInt4396);
		@Pc(36) Class159 local36 = Static57.aClass196_1.method4827(this.anInt4402).method3842(-1, 65536, null, null, 0, this.anInt4403, 0, arg1);
		if (local36 != null && local36.method4931(arg0, arg2, local11, true)) {
			return true;
		}
		if (this.anInt4405 != -1) {
			local36 = Static57.aClass196_1.method4827(this.anInt4405).method3842(-1, 65536, null, null, 0, this.anInt4406, 0, arg1);
			if (local36 != null && local36.method4931(arg0, arg2, local11, true)) {
				return true;
			}
		}
		if (this.anInt4411 != -1) {
			local36 = Static57.aClass196_1.method4827(this.anInt4411).method3842(-1, 65536, null, null, 0, this.anInt4412, 0, arg1);
			if (local36 != null && local36.method4931(arg0, arg2, local11, true)) {
				return true;
			}
		}
		return false;
	}
}
