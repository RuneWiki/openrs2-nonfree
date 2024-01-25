import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jj")
public final class Class179 implements Interface2 {

	@OriginalMember(owner = "client!jj", name = "f", descriptor = "Lclient!ha;")
	private Class133 aClass133_6;

	@OriginalMember(owner = "client!jj", name = "h", descriptor = "Z")
	private boolean aBoolean339;

	@OriginalMember(owner = "client!jj", name = "l", descriptor = "Lclient!qa;")
	private final Class282 aClass282_1;

	@OriginalMember(owner = "client!jj", name = "j", descriptor = "[Lclient!ug;")
	private final Interface25[] anInterface25Array1;

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Lclient!qa;Lclient!haa;)V")
	public Class179(@OriginalArg(0) Class282 arg0, @OriginalArg(1) Class134 arg1) {
		this.aClass282_1 = arg0;
		this.anInterface25Array1 = new Interface25[this.aClass282_1.anInterface9Array1.length];
		for (@Pc(15) int local15 = 0; local15 < this.anInterface25Array1.length; local15++) {
			this.anInterface25Array1[local15] = arg1.method3031(this.aClass282_1.anInterface9Array1[local15]);
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)I")
	@Override
	public int method8793() {
		@Pc(7) int local7 = 0;
		@Pc(10) Interface25[] local10 = this.anInterface25Array1;
		for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
			@Pc(18) Interface25 local18 = local10[local12];
			if (local18 == null || local18.method8109()) {
				local7++;
			}
		}
		return local7 * 100 / this.anInterface25Array1.length;
	}

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "(B)V")
	@Override
	public void method8795() {
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(B)V")
	@Override
	public void method8794() {
		if (Static213.aClass133_5 != this.aClass133_6) {
			this.aClass133_6 = Static213.aClass133_5;
			this.aBoolean339 = true;
		}
		this.aClass133_6.GA(0);
		@Pc(28) Interface25[] local28 = this.anInterface25Array1;
		for (@Pc(30) int local30 = 0; local30 < local28.length; local30++) {
			@Pc(36) Interface25 local36 = local28[local30];
			if (local36 != null) {
				local36.method8111();
			}
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8797(@OriginalArg(0) boolean arg0) {
		@Pc(14) Interface25[] local14 = this.anInterface25Array1;
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(22) Interface25 local22 = local14[local16];
			if (local22 != null) {
				local22.method8110();
			}
		}
		this.aBoolean339 = false;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Z)I")
	@Override
	public int method8796() {
		return this.aClass282_1.anInt7568;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IJ)Z")
	@Override
	public boolean method8792(@OriginalArg(1) long arg0) {
		return arg0 + (long) this.aClass282_1.anInt7567 <= Static95.method1587();
	}
}
