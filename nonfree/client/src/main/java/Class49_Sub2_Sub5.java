import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class49_Sub2_Sub5 extends Class49_Sub2 {

	@OriginalMember(owner = "client!pc", name = "T", descriptor = "Lclient!lm;")
	private Class72_Sub4 aClass72_Sub4_7;

	@OriginalMember(owner = "client!pc", name = "A", descriptor = "I")
	private int anInt6357 = 0;

	@OriginalMember(owner = "client!pc", name = "E", descriptor = "I")
	private int anInt6360 = 0;

	@OriginalMember(owner = "client!pc", name = "F", descriptor = "I")
	private final int anInt6361 = -1;

	@OriginalMember(owner = "client!pc", name = "R", descriptor = "I")
	private int anInt6369 = -32768;

	@OriginalMember(owner = "client!pc", name = "Y", descriptor = "Z")
	public boolean aBoolean466 = false;

	@OriginalMember(owner = "client!pc", name = "Z", descriptor = "I")
	private int anInt6374 = 0;

	@OriginalMember(owner = "client!pc", name = "y", descriptor = "I")
	public final int anInt6355;

	@OriginalMember(owner = "client!pc", name = "J", descriptor = "I")
	private final int anInt6363;

	@OriginalMember(owner = "client!pc", name = "z", descriptor = "I")
	private final int anInt6356;

	@OriginalMember(owner = "client!pc", name = "L", descriptor = "Lclient!na;")
	private Class199 aClass199_3;

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
	public Class49_Sub2_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg3, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt6374 = arg12;
		this.anInt6355 = arg1 + arg2;
		this.anInt6363 = arg4;
		this.anInt6356 = arg0;
		@Pc(49) Class52 local49 = Static489.aClass194_2.method4810(this.anInt6356);
		@Pc(52) int local52 = local49.anInt1342;
		if (local52 == -1) {
			this.aBoolean466 = true;
		} else {
			this.aClass199_3 = Static182.aClass218_1.method5221(local52);
			this.aBoolean466 = false;
		}
		if (this.anInt6355 == arg2) {
			Static381.method5839(super.anInt7141, false, this.aClass199_3, this.anInt6357, super.aByte98, super.anInt7137);
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BLclient!qa;)Lclient!qba;")
	@Override
	public Class72_Sub7 method7453(@OriginalArg(1) Class122 arg0) {
		@Pc(18) Class145 local18 = this.method5388(arg0, this.anInt6356, (this.anInt6374 == 0 ? 0 : 5) | 0x800);
		if (local18 == null) {
			return null;
		}
		if (this.anInt6374 != 0) {
			local18.OA(this.anInt6374 * 2048);
		}
		@Pc(42) Class118 local42 = arg0.method7256();
		local42.oa(super.anInt7137, super.anInt7140, super.anInt7141);
		if (this.aClass72_Sub4_7 == null) {
			local18.method6686(local42, null, 0);
		} else {
			@Pc(57) Class175 local57 = this.aClass72_Sub4_7.method4537();
			arg0.method7246(local18, local57, local42, null);
		}
		this.anInt6369 = local18.TA();
		this.method5392(local18, arg0);
		return null;
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(ILclient!qa;)Lclient!ud;")
	@Override
	public Class291 method7460(@OriginalArg(1) Class122 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!qa;III)Lclient!r;")
	private Class145 method5388(@OriginalArg(0) Class122 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class52 local13 = Static489.aClass194_2.method4810(arg1);
		@Pc(18) Class205 local18 = Static16.aClass205Array1[super.aByte98];
		@Pc(33) Class205 local33 = this.anInt6363 < 3 ? Static16.aClass205Array1[this.anInt6363 + 1] : null;
		return this.aBoolean466 ? local13.method1274(arg2, 0, -1, arg0, super.anInt7137, local18, -1, super.anInt7140, super.anInt7141, local33, Static182.aClass218_1) : local13.method1274(arg2, this.anInt6360, this.anInt6357, arg0, super.anInt7137, local18, this.anInt6361, super.anInt7140, super.anInt7141, local33, Static182.aClass218_1);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
	public void method5390() {
		if (this.aClass72_Sub4_7 != null) {
			this.aClass72_Sub4_7.method4534();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIILclient!qa;IZLclient!lb;)V")
	@Override
	public void method7456(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class122 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class49 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(B)I")
	@Override
	public int method5994() {
		return this.anInt6369;
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method7455(@OriginalArg(0) Class122 arg0) {
		@Pc(11) Class145 local11 = this.method5388(arg0, this.anInt6356, 0);
		if (local11 != null) {
			this.method5392(local11, arg0);
		}
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(B)V")
	@Override
	public void method7457() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BLclient!r;Lclient!qa;)V")
	private void method5392(@OriginalArg(1) Class145 arg0, @OriginalArg(2) Class122 arg1) {
		@Pc(6) Class161[] local6 = arg0.method6677();
		@Pc(9) Class93[] local9 = arg0.method6684();
		if ((this.aClass72_Sub4_7 == null || this.aClass72_Sub4_7.aBoolean369) && (local6 != null || local9 != null)) {
			this.aClass72_Sub4_7 = Static279.method4523(Static436.anInt6850);
		}
		if (this.aClass72_Sub4_7 != null) {
			this.aClass72_Sub4_7.method4529(arg1, (long) Static436.anInt6850, local6, local9);
			this.aClass72_Sub4_7.method4532(super.aByte98, super.aShort117, super.aShort115, super.aShort116, super.aShort118);
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BI)V")
	public void method5393(@OriginalArg(1) int arg0) {
		if (this.aBoolean466) {
			return;
		}
		this.anInt6360 += arg0;
		while (this.anInt6360 > this.aClass199_3.anIntArray575[this.anInt6357]) {
			this.anInt6360 -= this.aClass199_3.anIntArray575[this.anInt6357];
			this.anInt6357++;
			if (this.anInt6357 >= this.aClass199_3.anIntArray574.length) {
				this.aBoolean466 = true;
				break;
			}
		}
		if (!this.aBoolean466) {
			Static381.method5839(super.anInt7141, false, this.aClass199_3, this.anInt6357, super.aByte98, super.anInt7137);
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IILclient!qa;I)Z")
	@Override
	public boolean method7452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class122 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!pc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass72_Sub4_7 != null) {
			this.aClass72_Sub4_7.method4534();
		}
	}

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method7451() {
		return false;
	}
}
