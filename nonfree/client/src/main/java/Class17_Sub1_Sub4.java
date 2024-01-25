import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ps")
public final class Class17_Sub1_Sub4 extends Class17_Sub1 {

	@OriginalMember(owner = "client!ps", name = "X", descriptor = "Lclient!kq;")
	private Class8_Sub6 aClass8_Sub6_7;

	@OriginalMember(owner = "client!ps", name = "L", descriptor = "Z")
	public boolean aBoolean490 = false;

	@OriginalMember(owner = "client!ps", name = "E", descriptor = "I")
	private int anInt5049 = 0;

	@OriginalMember(owner = "client!ps", name = "W", descriptor = "I")
	private int anInt5062 = 0;

	@OriginalMember(owner = "client!ps", name = "Y", descriptor = "I")
	private final int anInt5063 = -1;

	@OriginalMember(owner = "client!ps", name = "V", descriptor = "I")
	private int anInt5061 = -32768;

	@OriginalMember(owner = "client!ps", name = "bb", descriptor = "I")
	private final int anInt5065;

	@OriginalMember(owner = "client!ps", name = "N", descriptor = "I")
	public final int anInt5055;

	@OriginalMember(owner = "client!ps", name = "J", descriptor = "Lclient!bo;")
	private Class24 aClass24_3;

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class17_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false, (byte) 0);
		this.anInt5065 = arg0;
		this.anInt5055 = arg1 + arg2;
		@Pc(40) int local40 = Static265.method5633(this.anInt5065).anInt2088;
		if (local40 == -1) {
			this.aBoolean490 = true;
		} else {
			this.aBoolean490 = false;
			this.aClass24_3 = Static110.method5411(local40);
		}
		if (this.anInt5055 == arg2) {
			Static318.method5216(super.anInt5109, super.anInt5108, false, this.aClass24_3, this.anInt5049);
		}
	}

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "(II)V")
	public void method4443(@OriginalArg(1) int arg0) {
		if (this.aBoolean490) {
			return;
		}
		this.anInt5062 += arg0;
		while (this.anInt5062 > this.aClass24_3.anIntArray89[this.anInt5049]) {
			this.anInt5062 -= this.aClass24_3.anIntArray89[this.anInt5049];
			this.anInt5049++;
			if (this.aClass24_3.anIntArray90.length <= this.anInt5049) {
				this.aBoolean490 = true;
				break;
			}
		}
		if (!this.aBoolean490) {
			Static318.method5216(super.anInt5109, super.anInt5108, false, this.aClass24_3, this.anInt5049);
		}
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lclient!uo;IIZ)Z")
	@Override
	public boolean method4783(@OriginalArg(0) Class32 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!ps", name = "d", descriptor = "(B)I")
	@Override
	public int method4490() {
		return this.anInt5061;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(I)V")
	public void method4444() {
		if (this.aClass8_Sub6_7 != null) {
			this.aClass8_Sub6_7.method3280();
		}
	}

	@OriginalMember(owner = "client!ps", name = "c", descriptor = "(Lclient!uo;B)Lclient!kj;")
	@Override
	public Class8_Sub5 method4779(@OriginalArg(0) Class32 arg0) {
		@Pc(17) Class73 local17 = this.method4445(arg0, 1024);
		if (local17 == null) {
			return null;
		}
		@Pc(24) Class109 local24 = arg0.method2194();
		local24.method3873(super.anInt5109, super.anInt5112, super.anInt5108);
		if (this.aClass8_Sub6_7 == null) {
			local17.method3322(local24, null, 0);
		} else {
			@Pc(39) Class191 local39 = this.aClass8_Sub6_7.method3279();
			arg0.method2181(local17, local39, local24, null);
		}
		this.anInt5061 = local17.method3327();
		this.method4447(arg0, local17);
		return null;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(ILclient!uo;I)Lclient!ge;")
	private Class73 method4445(@OriginalArg(1) Class32 arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class67 local14 = Static265.method5633(this.anInt5065);
		return this.aBoolean490 ? local14.method1823(0, arg1, -1, -1, arg0) : local14.method1823(this.anInt5062, arg1, this.anInt5063, this.anInt5049, arg0);
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lclient!uo;Lclient!ge;I)V")
	private void method4447(@OriginalArg(0) Class32 arg0, @OriginalArg(1) Class73 arg1) {
		@Pc(6) Class206[] local6 = arg1.method3330();
		@Pc(9) Class115[] local9 = arg1.method3325();
		if ((this.aClass8_Sub6_7 == null || this.aClass8_Sub6_7.aBoolean331) && (local6 != null || local9 != null)) {
			this.aClass8_Sub6_7 = new Class8_Sub6(Static5.anInt208);
		}
		if (this.aClass8_Sub6_7 != null) {
			this.aClass8_Sub6_7.method3271(arg0, (long) Static5.anInt208, local6, local9);
			this.aClass8_Sub6_7.method3281(super.aByte51, super.aShort75, super.aShort74, super.aShort77, super.aShort76);
		}
	}

	@OriginalMember(owner = "client!ps", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method4778() {
		return false;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(BLclient!uo;)V")
	@Override
	public void method4787(@OriginalArg(1) Class32 arg0) {
		@Pc(13) Class73 local13 = this.method4445(arg0, 0);
		if (local13 != null) {
			this.method4447(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lclient!uo;IIIZBLclient!pc;)V")
	@Override
	public void method4786(@OriginalArg(0) Class32 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) Class17 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ps", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass8_Sub6_7 != null) {
			this.aClass8_Sub6_7.method3280();
		}
	}

	@OriginalMember(owner = "client!ps", name = "f", descriptor = "(I)V")
	@Override
	public void method4789() {
		throw new IllegalStateException();
	}
}
