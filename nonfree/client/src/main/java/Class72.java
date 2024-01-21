import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class72 implements Interface1 {

	@OriginalMember(owner = "client!v", name = "l", descriptor = "Lclient!a;")
	private Class1 aClass1_12 = new Class1();

	@OriginalMember(owner = "client!v", name = "r", descriptor = "I")
	private int anInt3102 = 0;

	@OriginalMember(owner = "client!v", name = "t", descriptor = "D")
	private double aDouble9 = 1.0D;

	@OriginalMember(owner = "client!v", name = "v", descriptor = "I")
	private int anInt3104 = 128;

	@OriginalMember(owner = "client!v", name = "s", descriptor = "Lclient!ge;")
	private final Class7 aClass7_55;

	@OriginalMember(owner = "client!v", name = "u", descriptor = "I")
	private final int anInt3103;

	@OriginalMember(owner = "client!v", name = "m", descriptor = "[Lclient!hb;")
	private final Class6_Sub8[] aClass6_Sub8Array1;

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lclient!ge;Lclient!ge;IDI)V")
	public Class72(@OriginalArg(0) Class7 arg0, @OriginalArg(1) Class7 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) double arg3, @OriginalArg(4) int arg4) {
		this.anInt3104 = arg4;
		this.aClass7_55 = arg1;
		this.aDouble9 = arg3;
		this.anInt3103 = arg2;
		this.anInt3102 = this.anInt3103;
		@Pc(38) int[] local38 = arg0.method113(0);
		@Pc(41) int local41 = local38.length;
		this.aClass6_Sub8Array1 = new Class6_Sub8[arg0.method103(0)];
		for (@Pc(50) int local50 = 0; local50 < local41; local50++) {
			@Pc(63) Class6_Sub4 local63 = new Class6_Sub4(arg0.method110(0, local38[local50]));
			this.aClass6_Sub8Array1[local38[local50]] = new Class6_Sub8(local63);
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ZD)V")
	public void method2073(@OriginalArg(1) double arg0) {
		this.aDouble9 = arg0;
		this.method2078();
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IB)Z")
	@Override
	public boolean method2070(@OriginalArg(0) int arg0) {
		return this.anInt3104 == 64;
	}

	@OriginalMember(owner = "client!v", name = "d", descriptor = "(II)V")
	public void method2075(@OriginalArg(1) int arg0) {
		for (@Pc(7) int local7 = 0; local7 < this.aClass6_Sub8Array1.length; local7++) {
			@Pc(14) Class6_Sub8 local14 = this.aClass6_Sub8Array1[local7];
			if (local14 != null && local14.anInt1419 != 0 && local14.aBoolean69) {
				local14.method981(arg0);
				local14.aBoolean69 = false;
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(II)I")
	@Override
	public int method2072(@OriginalArg(1) int arg0) {
		return this.aClass6_Sub8Array1[arg0] == null ? 0 : this.aClass6_Sub8Array1[arg0].anInt1418;
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(II)Z")
	@Override
	public boolean method2071(@OriginalArg(0) int arg0) {
		return this.aClass6_Sub8Array1[arg0].aBoolean68;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method2069(@OriginalArg(0) int arg0) {
		@Pc(9) Class6_Sub8 local9 = this.aClass6_Sub8Array1[arg0];
		if (local9 != null) {
			if (local9.anIntArray163 != null) {
				this.aClass1_12.method4(local9);
				local9.aBoolean69 = true;
				return local9.anIntArray163;
			}
			@Pc(38) boolean local38 = local9.method982(this.aDouble9, this.anInt3104, this.aClass7_55);
			if (local38) {
				if (this.anInt3102 == 0) {
					@Pc(52) Class6_Sub8 local52 = (Class6_Sub8) this.aClass1_12.method12();
					local52.method984();
				} else {
					this.anInt3102--;
				}
				this.aClass1_12.method4(local9);
				local9.aBoolean69 = true;
				return local9.anIntArray163;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(I)V")
	public void method2078() {
		for (@Pc(7) int local7 = 0; local7 < this.aClass6_Sub8Array1.length; local7++) {
			if (this.aClass6_Sub8Array1[local7] != null) {
				this.aClass6_Sub8Array1[local7].method984();
			}
		}
		this.aClass1_12 = new Class1();
		this.anInt3102 = this.anInt3103;
	}
}
