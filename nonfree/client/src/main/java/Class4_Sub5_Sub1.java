import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class4_Sub5_Sub1 extends Class4_Sub5 {

	@OriginalMember(owner = "client!jb", name = "O", descriptor = "Lclient!rs;")
	private Class32_Sub7 aClass32_Sub7_2;

	@OriginalMember(owner = "client!jb", name = "N", descriptor = "I")
	private int anInt2881 = 0;

	@OriginalMember(owner = "client!jb", name = "U", descriptor = "I")
	private int anInt2886 = 0;

	@OriginalMember(owner = "client!jb", name = "R", descriptor = "I")
	private final int anInt2884 = -1;

	@OriginalMember(owner = "client!jb", name = "W", descriptor = "I")
	private int anInt2888 = -32768;

	@OriginalMember(owner = "client!jb", name = "T", descriptor = "Z")
	public boolean aBoolean221 = false;

	@OriginalMember(owner = "client!jb", name = "I", descriptor = "I")
	public final int anInt2876;

	@OriginalMember(owner = "client!jb", name = "M", descriptor = "I")
	private final int anInt2880;

	@OriginalMember(owner = "client!jb", name = "Z", descriptor = "Lclient!i;")
	private Class89 aClass89_1;

	static {
		new Class85("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
	}

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class4_Sub5_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false, (byte) 0);
		this.anInt2876 = arg2 + arg1;
		this.anInt2880 = arg0;
		@Pc(40) int local40 = Static325.method5628(this.anInt2880).anInt5031;
		if (local40 == -1) {
			this.aBoolean221 = true;
		} else {
			this.aBoolean221 = false;
			this.aClass89_1 = Static162.method2849(local40);
		}
		if (arg2 == this.anInt2876) {
			Static311.method3258(this.aClass89_1, super.anInt6631, false, this.anInt2881, super.anInt6632);
		}
	}

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5895() {
		return false;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!ea;I)V")
	@Override
	public void method5899(@OriginalArg(0) Class55 arg0) {
		@Pc(9) Class112 local9 = this.method2663(arg0, 0);
		if (local9 != null) {
			this.method2661(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILclient!ts;Lclient!ea;)V")
	private void method2661(@OriginalArg(1) Class112 arg0, @OriginalArg(2) Class55 arg1) {
		@Pc(12) Class113[] local12 = arg0.method4321();
		@Pc(15) Class148[] local15 = arg0.method4334();
		if ((this.aClass32_Sub7_2 == null || this.aClass32_Sub7_2.aBoolean461) && (local12 != null || local15 != null)) {
			this.aClass32_Sub7_2 = new Class32_Sub7(Static283.anInt5563);
		}
		if (this.aClass32_Sub7_2 != null) {
			this.aClass32_Sub7_2.method4963(arg1, (long) Static283.anInt5563, local12, local15);
			this.aClass32_Sub7_2.method4959(super.aByte75, super.aShort92, super.aShort91, super.aShort93, super.aShort90);
		}
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(ILclient!ea;)Lclient!ms;")
	@Override
	public Class32_Sub4 method5898(@OriginalArg(1) Class55 arg0) {
		@Pc(9) Class112 local9 = this.method2663(arg0, 1024);
		if (local9 == null) {
			return null;
		}
		@Pc(16) Class66 local16 = arg0.method5195();
		local16.method5822(super.anInt6631, super.anInt6633, super.anInt6632);
		if (this.aClass32_Sub7_2 == null) {
			local9.method4338(local16, null, 0);
		} else {
			@Pc(42) Class146 local42 = this.aClass32_Sub7_2.method4955();
			arg0.method5241(local9, local42, local16, null);
		}
		this.anInt2888 = local9.method4331();
		this.method2661(local9, arg0);
		return null;
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "(B)V")
	public void method2662() {
		if (this.aClass32_Sub7_2 != null) {
			this.aClass32_Sub7_2.method4957();
		}
	}

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "(I)I")
	@Override
	public int method5902() {
		return this.anInt2888;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!ea;BI)Lclient!ts;")
	private Class112 method2663(@OriginalArg(0) Class55 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class163 local8 = Static325.method5628(this.anInt2880);
		return this.aBoolean221 ? local8.method4486(-1, -1, arg0, arg1, 0) : local8.method4486(this.anInt2881, this.anInt2884, arg0, arg1, this.anInt2886);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZILclient!ea;I)Z")
	@Override
	public boolean method5900(@OriginalArg(1) int arg0, @OriginalArg(2) Class55 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
	@Override
	public void method5896() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jb", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass32_Sub7_2 != null) {
			this.aClass32_Sub7_2.method4957();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)V")
	public void method2665(@OriginalArg(1) int arg0) {
		if (this.aBoolean221) {
			return;
		}
		this.anInt2886 += arg0;
		while (this.anInt2886 > this.aClass89_1.anIntArray244[this.anInt2881]) {
			this.anInt2886 -= this.aClass89_1.anIntArray244[this.anInt2881];
			this.anInt2881++;
			if (this.anInt2881 >= this.aClass89_1.anIntArray245.length) {
				this.aBoolean221 = true;
				break;
			}
		}
		if (!this.aBoolean221) {
			Static311.method3258(this.aClass89_1, super.anInt6631, false, this.anInt2881, super.anInt6632);
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IILclient!ea;Lclient!ac;ZII)V")
	@Override
	public void method5897(@OriginalArg(1) int arg0, @OriginalArg(2) Class55 arg1, @OriginalArg(3) Class4 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}
}
