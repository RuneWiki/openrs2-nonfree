import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class44 implements Interface2 {

	@OriginalMember(owner = "client!ke", name = "f", descriptor = "Lclient!dd;")
	private Class20 aClass20_6 = new Class20();

	@OriginalMember(owner = "client!ke", name = "v", descriptor = "I")
	private int anInt1436 = 0;

	@OriginalMember(owner = "client!ke", name = "y", descriptor = "D")
	private double aDouble1 = 1.0D;

	@OriginalMember(owner = "client!ke", name = "z", descriptor = "I")
	private int anInt1438 = 128;

	@OriginalMember(owner = "client!ke", name = "w", descriptor = "I")
	private final int anInt1437;

	@OriginalMember(owner = "client!ke", name = "x", descriptor = "Lclient!rd;")
	private final Class64 aClass64_42;

	@OriginalMember(owner = "client!ke", name = "l", descriptor = "[Lclient!kd;")
	private final Class3_Sub7[] aClass3_Sub7Array1;

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(Lclient!rd;Lclient!rd;IDI)V")
	public Class44(@OriginalArg(0) Class64 arg0, @OriginalArg(1) Class64 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) double arg3, @OriginalArg(4) int arg4) {
		this.anInt1437 = arg2;
		this.aClass64_42 = arg1;
		this.anInt1438 = arg4;
		this.aDouble1 = arg3;
		this.anInt1436 = this.anInt1437;
		@Pc(38) int[] local38 = arg0.method1615(0);
		@Pc(41) int local41 = local38.length;
		this.aClass3_Sub7Array1 = new Class3_Sub7[arg0.method1637(0)];
		for (@Pc(50) int local50 = 0; local50 < local41; local50++) {
			@Pc(63) Class3_Sub4 local63 = new Class3_Sub4(arg0.method1625(0, local38[local50]));
			this.aClass3_Sub7Array1[local38[local50]] = new Class3_Sub7(local63);
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IZ)I")
	@Override
	public int method960(@OriginalArg(0) int arg0) {
		return this.aClass3_Sub7Array1[arg0] == null ? 0 : this.aClass3_Sub7Array1[arg0].anInt1422;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(DI)V")
	public void method964(@OriginalArg(0) double arg0) {
		this.aDouble1 = arg0;
		this.method966();
	}

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "(II)V")
	public void method965(@OriginalArg(1) int arg0) {
		for (@Pc(3) int local3 = 0; local3 < this.aClass3_Sub7Array1.length; local3++) {
			@Pc(16) Class3_Sub7 local16 = this.aClass3_Sub7Array1[local3];
			if (local16 != null && local16.anInt1423 != 0 && local16.aBoolean101) {
				local16.method952(arg0);
				local16.aBoolean101 = false;
			}
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method961(@OriginalArg(0) int arg0) {
		@Pc(16) Class3_Sub7 local16 = this.aClass3_Sub7Array1[arg0];
		if (local16 != null) {
			if (local16.anIntArray192 != null) {
				this.aClass20_6.method307(local16);
				local16.aBoolean101 = true;
				return local16.anIntArray192;
			}
			@Pc(41) boolean local41 = local16.method954(this.aDouble1, this.anInt1438, this.aClass64_42);
			if (local41) {
				if (this.anInt1436 == 0) {
					@Pc(63) Class3_Sub7 local63 = (Class3_Sub7) this.aClass20_6.method314();
					local63.method953();
				} else {
					this.anInt1436--;
				}
				this.aClass20_6.method307(local16);
				local16.aBoolean101 = true;
				return local16.anIntArray192;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method959(@OriginalArg(0) int arg0) {
		return this.anInt1438 == 64;
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(II)Z")
	@Override
	public boolean method962(@OriginalArg(0) int arg0) {
		return this.aClass3_Sub7Array1[arg0].aBoolean102;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V")
	public void method966() {
		for (@Pc(11) int local11 = 0; local11 < this.aClass3_Sub7Array1.length; local11++) {
			if (this.aClass3_Sub7Array1[local11] != null) {
				this.aClass3_Sub7Array1[local11].method953();
			}
		}
		this.aClass20_6 = new Class20();
		this.anInt1436 = this.anInt1437;
	}
}
