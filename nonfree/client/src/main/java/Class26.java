import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class26 implements Interface3 {

	@OriginalMember(owner = "client!g", name = "x", descriptor = "Lclient!m;")
	private Class49 aClass49_3 = new Class49();

	@OriginalMember(owner = "client!g", name = "A", descriptor = "I")
	private int anInt1000 = 0;

	@OriginalMember(owner = "client!g", name = "B", descriptor = "I")
	private int anInt1001 = 128;

	@OriginalMember(owner = "client!g", name = "D", descriptor = "D")
	private double aDouble1 = 1.0D;

	@OriginalMember(owner = "client!g", name = "y", descriptor = "Lclient!dd;")
	private final Class14 aClass14_15;

	@OriginalMember(owner = "client!g", name = "z", descriptor = "I")
	private final int anInt999;

	@OriginalMember(owner = "client!g", name = "l", descriptor = "[Lclient!v;")
	private final Class8_Sub21[] aClass8_Sub21Array1;

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lclient!dd;Lclient!dd;IDI)V")
	public Class26(@OriginalArg(0) Class14 arg0, @OriginalArg(1) Class14 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) double arg3, @OriginalArg(4) int arg4) {
		this.aDouble1 = arg3;
		this.anInt1001 = arg4;
		this.aClass14_15 = arg1;
		this.anInt999 = arg2;
		this.anInt1000 = this.anInt999;
		@Pc(38) int[] local38 = arg0.method1153(0);
		@Pc(41) int local41 = local38.length;
		this.aClass8_Sub21Array1 = new Class8_Sub21[arg0.method1144(0)];
		for (@Pc(50) int local50 = 0; local50 < local41; local50++) {
			@Pc(63) Class8_Sub20 local63 = new Class8_Sub20(arg0.method1156(local38[local50], 0));
			this.aClass8_Sub21Array1[local38[local50]] = new Class8_Sub21(local63);
		}
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(II)Z")
	@Override
	public boolean method619(@OriginalArg(1) int arg0) {
		return true;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V")
	public void method621() {
		for (@Pc(5) int local5 = 0; local5 < this.aClass8_Sub21Array1.length; local5++) {
			if (this.aClass8_Sub21Array1[local5] != null) {
				this.aClass8_Sub21Array1[local5].method1937();
			}
		}
		this.aClass49_3 = new Class49();
		this.anInt1000 = this.anInt999;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(II)I")
	@Override
	public int method616(@OriginalArg(1) int arg0) {
		return this.aClass8_Sub21Array1[arg0] == null ? 0 : this.aClass8_Sub21Array1[arg0].anInt2923;
	}

	@OriginalMember(owner = "client!g", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method620(@OriginalArg(0) int arg0) {
		@Pc(16) Class8_Sub21 local16 = this.aClass8_Sub21Array1[arg0];
		if (local16 != null) {
			if (local16.anIntArray390 != null) {
				this.aClass49_3.method1104(local16);
				local16.aBoolean106 = true;
				return local16.anIntArray390;
			}
			@Pc(41) boolean local41 = local16.method1938(this.aDouble1, this.anInt1001, this.aClass14_15);
			if (local41) {
				if (this.anInt1000 == 0) {
					@Pc(52) Class8_Sub21 local52 = (Class8_Sub21) this.aClass49_3.method1108();
					local52.method1937();
				} else {
					this.anInt1000--;
				}
				this.aClass49_3.method1104(local16);
				local16.aBoolean106 = true;
				return local16.anIntArray390;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ZI)Z")
	@Override
	public boolean method618(@OriginalArg(1) int arg0) {
		return this.anInt1001 == 64;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ID)V")
	public void method623(@OriginalArg(1) double arg0) {
		this.aDouble1 = arg0;
		this.method621();
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(IZ)V")
	public void method624(@OriginalArg(0) int arg0) {
		for (@Pc(3) int local3 = 0; local3 < this.aClass8_Sub21Array1.length; local3++) {
			@Pc(10) Class8_Sub21 local10 = this.aClass8_Sub21Array1[local3];
			if (local10 != null && local10.anInt2922 != 0 && local10.aBoolean106) {
				local10.method1936(arg0);
				local10.aBoolean106 = false;
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IZ)Z")
	@Override
	public boolean method617(@OriginalArg(0) int arg0) {
		return this.aClass8_Sub21Array1[arg0].aBoolean107;
	}
}
