import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rj")
public final class Class20_Sub1_Sub6 extends Class20_Sub1 {

	@OriginalMember(owner = "client!rj", name = "R", descriptor = "Lclient!ts;")
	private Class46_Sub7 aClass46_Sub7_5;

	@OriginalMember(owner = "client!rj", name = "C", descriptor = "Z")
	public boolean aBoolean558 = false;

	@OriginalMember(owner = "client!rj", name = "F", descriptor = "I")
	private int anInt7361 = -32768;

	@OriginalMember(owner = "client!rj", name = "J", descriptor = "I")
	private int anInt7364 = 0;

	@OriginalMember(owner = "client!rj", name = "T", descriptor = "I")
	private int anInt7371 = 0;

	@OriginalMember(owner = "client!rj", name = "L", descriptor = "I")
	private final int anInt7365 = -1;

	@OriginalMember(owner = "client!rj", name = "db", descriptor = "I")
	private int anInt7380 = 0;

	@OriginalMember(owner = "client!rj", name = "Y", descriptor = "I")
	private final int anInt7375;

	@OriginalMember(owner = "client!rj", name = "bb", descriptor = "I")
	public final int anInt7378;

	@OriginalMember(owner = "client!rj", name = "D", descriptor = "I")
	private final int anInt7359;

	@OriginalMember(owner = "client!rj", name = "K", descriptor = "Lclient!lk;")
	private Class176 aClass176_3;

	static {
		new Class45("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
	public Class20_Sub1_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg3, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt7375 = arg4;
		this.anInt7371 = arg12;
		this.anInt7378 = arg2 + arg1;
		this.anInt7359 = arg0;
		@Pc(50) Class87 local50 = Static530.aClass195_2.method5439(this.anInt7359);
		@Pc(53) int local53 = local50.anInt2314;
		if (local53 == -1) {
			this.aBoolean558 = true;
		} else {
			this.aClass176_3 = Static35.aClass152_1.method4045(local53);
			this.aBoolean558 = false;
		}
		if (this.anInt7378 == arg2) {
			Static425.method6639(super.aByte108, this.aClass176_3, super.anInt8949, this.anInt7380, false, super.anInt8954);
		}
	}

	@OriginalMember(owner = "client!rj", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass46_Sub7_5 != null) {
			this.aClass46_Sub7_5.method7412();
		}
	}

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(B)V")
	public void method6609() {
		if (this.aClass46_Sub7_5 != null) {
			this.aClass46_Sub7_5.method7412();
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILclient!qa;II)Z")
	@Override
	public boolean method8037(@OriginalArg(1) Class4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lclient!qa;ILclient!r;)V")
	private void method6610(@OriginalArg(0) Class4 arg0, @OriginalArg(2) Class97 arg1) {
		@Pc(6) Class68[] local6 = arg1.method6782();
		@Pc(9) Class106[] local9 = arg1.method6767();
		if ((this.aClass46_Sub7_5 == null || this.aClass46_Sub7_5.aBoolean627) && (local6 != null || local9 != null)) {
			this.aClass46_Sub7_5 = Static477.method7410(Static445.anInt7791);
		}
		if (this.aClass46_Sub7_5 != null) {
			this.aClass46_Sub7_5.method7414(arg0, (long) Static445.anInt7791, local6, local9);
			this.aClass46_Sub7_5.method7420(super.aByte108, super.aShort124, super.aShort126, super.aShort123, super.aShort125);
		}
	}

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "(ILclient!qa;)Lclient!oj;")
	@Override
	public Class46_Sub6 method8039(@OriginalArg(1) Class4 arg0) {
		@Pc(21) Class97 local21 = this.method6612(this.anInt7359, arg0, (this.anInt7371 == 0 ? 0 : 5) | 0x800);
		if (local21 == null) {
			return null;
		}
		if (this.anInt7371 != 0) {
			local21.OA(this.anInt7371 * 2048);
		}
		@Pc(37) Class128 local37 = arg0.method7165();
		local37.oa(super.anInt8954, super.anInt8947, super.anInt8949);
		if (this.aClass46_Sub7_5 == null) {
			local21.method6773(local37, null, 0);
		} else {
			@Pc(52) Class158 local52 = this.aClass46_Sub7_5.method7408();
			arg0.method7211(local21, local52, local37, null);
		}
		this.anInt7361 = local21.TA();
		this.method6610(arg0, local21);
		return null;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(ZLclient!oe;ILclient!qa;III)V")
	@Override
	public void method8034(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class4 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(II)V")
	public void method6611(@OriginalArg(1) int arg0) {
		if (this.aBoolean558) {
			return;
		}
		this.anInt7364 += arg0;
		while (this.aClass176_3.anIntArray433[this.anInt7380] < this.anInt7364) {
			this.anInt7364 -= this.aClass176_3.anIntArray433[this.anInt7380];
			this.anInt7380++;
			if (this.aClass176_3.anIntArray432.length <= this.anInt7380) {
				this.aBoolean558 = true;
				break;
			}
		}
		if (!this.aBoolean558) {
			Static425.method6639(super.aByte108, this.aClass176_3, super.anInt8949, this.anInt7380, false, super.anInt8954);
		}
	}

	@OriginalMember(owner = "client!rj", name = "e", descriptor = "(I)I")
	@Override
	public int method7798() {
		return this.anInt7361;
	}

	@OriginalMember(owner = "client!rj", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method8038() {
		return false;
	}

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(ILclient!qa;II)Lclient!r;")
	private Class97 method6612(@OriginalArg(0) int arg0, @OriginalArg(1) Class4 arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class87 local8 = Static530.aClass195_2.method5439(arg0);
		@Pc(13) Class7 local13 = Static411.aClass7Array12[super.aByte108];
		@Pc(36) Class7 local36 = this.anInt7375 >= 3 ? null : Static411.aClass7Array12[this.anInt7375 + 1];
		return this.aBoolean558 ? local8.method2237(0, arg1, super.anInt8947, Static35.aClass152_1, arg2, super.anInt8954, -1, local13, super.anInt8949, local36, -1) : local8.method2237(this.anInt7364, arg1, super.anInt8947, Static35.aClass152_1, arg2, super.anInt8954, this.anInt7365, local13, super.anInt8949, local36, this.anInt7380);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method8030(@OriginalArg(1) Class4 arg0) {
		@Pc(18) Class97 local18 = this.method6612(this.anInt7359, arg0, 0);
		if (local18 != null) {
			this.method6610(arg0, local18);
		}
	}

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "(B)V")
	@Override
	public void method8036() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(ILclient!qa;)Lclient!so;")
	@Override
	public Class271 method8031(@OriginalArg(1) Class4 arg0) {
		return null;
	}
}
