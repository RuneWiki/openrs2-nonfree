import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class15 implements Interface4 {

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "Lclient!fc;")
	private Class24 aClass24_21 = new Class24();

	@OriginalMember(owner = "client!dd", name = "w", descriptor = "I")
	private int anInt693 = 128;

	@OriginalMember(owner = "client!dd", name = "z", descriptor = "D")
	private double aDouble1 = 1.0D;

	@OriginalMember(owner = "client!dd", name = "E", descriptor = "I")
	private int anInt697 = 0;

	@OriginalMember(owner = "client!dd", name = "A", descriptor = "I")
	private final int anInt695;

	@OriginalMember(owner = "client!dd", name = "D", descriptor = "Lclient!mb;")
	private final Class42 aClass42_18;

	@OriginalMember(owner = "client!dd", name = "r", descriptor = "[Lclient!wa;")
	private final Class3_Sub13[] aClass3_Sub13Array1;

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lclient!mb;Lclient!mb;IDI)V")
	public Class15(@OriginalArg(0) Class42 arg0, @OriginalArg(1) Class42 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) double arg3, @OriginalArg(4) int arg4) {
		this.anInt695 = arg2;
		this.aDouble1 = arg3;
		this.anInt693 = arg4;
		this.aClass42_18 = arg1;
		this.anInt697 = this.anInt695;
		@Pc(38) int[] local38 = arg0.method1497(0);
		@Pc(41) int local41 = local38.length;
		this.aClass3_Sub13Array1 = new Class3_Sub13[arg0.method1494(0)];
		for (@Pc(50) int local50 = 0; local50 < local41; local50++) {
			@Pc(63) Class3_Sub8 local63 = new Class3_Sub8(arg0.method1504(0, local38[local50]));
			this.aClass3_Sub13Array1[local38[local50]] = new Class3_Sub13(local63);
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method458(@OriginalArg(0) int arg0) {
		return this.aClass3_Sub13Array1[arg0].aBoolean170;
	}

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "(II)V")
	public void method462(@OriginalArg(0) int arg0) {
		for (@Pc(10) int local10 = 0; local10 < this.aClass3_Sub13Array1.length; local10++) {
			@Pc(17) Class3_Sub13 local17 = this.aClass3_Sub13Array1[local10];
			if (local17 != null && local17.anInt2839 != 0 && local17.aBoolean171) {
				local17.method1862(arg0);
				local17.aBoolean171 = false;
			}
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method459(@OriginalArg(0) int arg0) {
		@Pc(4) Class3_Sub13 local4 = this.aClass3_Sub13Array1[arg0];
		if (local4 != null) {
			if (local4.anIntArray318 != null) {
				this.aClass24_21.method524(local4);
				local4.aBoolean171 = true;
				return local4.anIntArray318;
			}
			@Pc(38) boolean local38 = local4.method1861(this.aDouble1, this.anInt693, this.aClass42_18);
			if (local38) {
				if (this.anInt697 == 0) {
					@Pc(49) Class3_Sub13 local49 = (Class3_Sub13) this.aClass24_21.method529();
					local49.method1863();
				} else {
					this.anInt697--;
				}
				this.aClass24_21.method524(local4);
				local4.aBoolean171 = true;
				return local4.anIntArray318;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(II)Z")
	@Override
	public boolean method460(@OriginalArg(0) int arg0) {
		return this.anInt693 == 64;
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)V")
	public void method465() {
		for (@Pc(3) int local3 = 0; local3 < this.aClass3_Sub13Array1.length; local3++) {
			if (this.aClass3_Sub13Array1[local3] != null) {
				this.aClass3_Sub13Array1[local3].method1863();
			}
		}
		this.aClass24_21 = new Class24();
		this.anInt697 = this.anInt695;
	}

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "(II)I")
	@Override
	public int method461(@OriginalArg(0) int arg0) {
		return this.aClass3_Sub13Array1[arg0] == null ? 0 : this.aClass3_Sub13Array1[arg0].anInt2840;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(BD)V")
	public void method468(@OriginalArg(1) double arg0) {
		this.aDouble1 = arg0;
		this.method465();
	}
}
