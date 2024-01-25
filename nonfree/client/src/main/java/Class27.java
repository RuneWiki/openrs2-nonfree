import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class27 implements Interface16 {

	@OriginalMember(owner = "client!b", name = "a", descriptor = "Z")
	private boolean aBoolean58;

	@OriginalMember(owner = "client!b", name = "c", descriptor = "Lclient!ha;")
	private Class13 aClass13_8;

	@OriginalMember(owner = "client!b", name = "h", descriptor = "Lclient!jca;")
	private final Class173 aClass173_1;

	@OriginalMember(owner = "client!b", name = "b", descriptor = "[Lclient!nea;")
	private final Interface17[] anInterface17Array1;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lclient!jca;Lclient!er;)V")
	public Class27(@OriginalArg(0) Class173 arg0, @OriginalArg(1) Class102 arg1) {
		this.aClass173_1 = arg0;
		this.anInterface17Array1 = new Interface17[this.aClass173_1.anInterface12Array1.length];
		for (@Pc(15) int local15 = 0; local15 < this.anInterface17Array1.length; local15++) {
			this.anInterface17Array1[local15] = arg1.method2562(this.aClass173_1.anInterface12Array1[local15]);
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IZ)V")
	@Override
	public void method6301(@OriginalArg(1) boolean arg0) {
		@Pc(14) Interface17[] local14 = this.anInterface17Array1;
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(22) Interface17 local22 = local14[local16];
			if (local22 != null) {
				local22.method8064();
			}
		}
		this.aBoolean58 = false;
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(I)I")
	@Override
	public int method6300() {
		return this.aClass173_1.anInt4848;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IJ)Z")
	@Override
	public boolean method6303(@OriginalArg(1) long arg0) {
		return (long) this.aClass173_1.anInt4850 + arg0 <= Static48.method1203();
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V")
	@Override
	public void method6298() {
		if (this.aClass13_8 != Static141.aClass13_27) {
			this.aClass13_8 = Static141.aClass13_27;
			this.aBoolean58 = true;
		}
		this.aClass13_8.GA(0);
		@Pc(28) Interface17[] local28 = this.anInterface17Array1;
		for (@Pc(30) int local30 = 0; local30 < local28.length; local30++) {
			@Pc(36) Interface17 local36 = local28[local30];
			if (local36 != null) {
				local36.method8062();
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "d", descriptor = "(I)I")
	@Override
	public int method6302() {
		@Pc(7) int local7 = 0;
		@Pc(10) Interface17[] local10 = this.anInterface17Array1;
		for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
			@Pc(24) Interface17 local24 = local10[local12];
			if (local24 == null || local24.method8063()) {
				local7++;
			}
		}
		return local7 * 100 / this.anInterface17Array1.length;
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(I)V")
	@Override
	public void method6299() {
	}
}
