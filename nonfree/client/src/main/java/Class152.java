import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ica")
public final class Class152 implements Interface5 {

	@OriginalMember(owner = "client!ica", name = "b", descriptor = "Lclient!ha;")
	private Class132 aClass132_6;

	@OriginalMember(owner = "client!ica", name = "i", descriptor = "Z")
	private boolean aBoolean267;

	@OriginalMember(owner = "client!ica", name = "d", descriptor = "Lclient!eu;")
	private final Class96 aClass96_1;

	@OriginalMember(owner = "client!ica", name = "e", descriptor = "[Lclient!rd;")
	private final Interface24[] anInterface24Array1;

	@OriginalMember(owner = "client!ica", name = "<init>", descriptor = "(Lclient!eu;Lclient!bd;)V")
	public Class152(@OriginalArg(0) Class96 arg0, @OriginalArg(1) Class33 arg1) {
		this.aClass96_1 = arg0;
		this.anInterface24Array1 = new Interface24[this.aClass96_1.anInterface13Array1.length];
		for (@Pc(15) int local15 = 0; local15 < this.anInterface24Array1.length; local15++) {
			this.anInterface24Array1[local15] = arg1.method854(this.aClass96_1.anInterface13Array1[local15]);
		}
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(I)V")
	@Override
	public void method7067() {
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(BJ)Z")
	@Override
	public boolean method7068(@OriginalArg(1) long arg0) {
		return Static566.method7936() >= (long) this.aClass96_1.anInt2438 + arg0;
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7072(@OriginalArg(0) boolean arg0) {
		@Pc(10) Interface24[] local10 = this.anInterface24Array1;
		for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
			@Pc(18) Interface24 local18 = local10[local12];
			if (local18 != null) {
				local18.method8706();
			}
		}
		this.aBoolean267 = false;
	}

	@OriginalMember(owner = "client!ica", name = "b", descriptor = "(I)I")
	@Override
	public int method7069() {
		return this.aClass96_1.anInt2437;
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(Z)V")
	@Override
	public void method7070() {
		if (this.aClass132_6 != Static546.aClass132_13) {
			this.aClass132_6 = Static546.aClass132_13;
			this.aBoolean267 = true;
		}
		this.aClass132_6.GA(0);
		@Pc(26) Interface24[] local26 = this.anInterface24Array1;
		for (@Pc(28) int local28 = 0; local28 < local26.length; local28++) {
			@Pc(34) Interface24 local34 = local26[local28];
			if (local34 != null) {
				local34.method8705();
			}
		}
	}

	@OriginalMember(owner = "client!ica", name = "c", descriptor = "(I)I")
	@Override
	public int method7071() {
		@Pc(7) int local7 = 0;
		@Pc(16) Interface24[] local16 = this.anInterface24Array1;
		for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
			@Pc(24) Interface24 local24 = local16[local18];
			if (local24 == null || local24.method8704()) {
				local7++;
			}
		}
		return local7 * 100 / this.anInterface24Array1.length;
	}
}
