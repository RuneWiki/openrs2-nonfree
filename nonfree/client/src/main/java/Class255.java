import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nba")
public final class Class255 implements Interface24 {

	@OriginalMember(owner = "client!nba", name = "b", descriptor = "Z")
	private boolean aBoolean441;

	@OriginalMember(owner = "client!nba", name = "m", descriptor = "Lclient!ha;")
	private Class22 aClass22_8;

	@OriginalMember(owner = "client!nba", name = "k", descriptor = "Lclient!bk;")
	private final Class39 aClass39_1;

	@OriginalMember(owner = "client!nba", name = "d", descriptor = "[Lclient!cha;")
	private final Interface2[] anInterface2Array1;

	@OriginalMember(owner = "client!nba", name = "<init>", descriptor = "(Lclient!bk;Lclient!fk;)V")
	public Class255(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class119 arg1) {
		this.aClass39_1 = arg0;
		this.anInterface2Array1 = new Interface2[this.aClass39_1.anInterface3Array1.length];
		for (@Pc(15) int local15 = 0; local15 < this.anInterface2Array1.length; local15++) {
			this.anInterface2Array1[local15] = arg1.method2869(this.aClass39_1.anInterface3Array1[local15]);
		}
	}

	@OriginalMember(owner = "client!nba", name = "c", descriptor = "(I)V")
	@Override
	public void method7123() {
		if (Static153.aClass22_4 != this.aClass22_8) {
			this.aBoolean441 = true;
			this.aClass22_8 = Static153.aClass22_4;
		}
		this.aClass22_8.GA(0);
		@Pc(32) Interface2[] local32 = this.anInterface2Array1;
		for (@Pc(34) int local34 = 0; local34 < local32.length; local34++) {
			@Pc(40) Interface2 local40 = local32[local34];
			if (local40 != null) {
				local40.method9316();
			}
		}
	}

	@OriginalMember(owner = "client!nba", name = "b", descriptor = "(I)I")
	@Override
	public int method7124() {
		@Pc(5) int local5 = 0;
		@Pc(8) Interface2[] local8 = this.anInterface2Array1;
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(20) Interface2 local20 = local8[local10];
			if (local20 == null || local20.method9318()) {
				local5++;
			}
		}
		return local5 * 100 / this.anInterface2Array1.length;
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(ZJ)Z")
	@Override
	public boolean method7120(@OriginalArg(1) long arg0) {
		return Static517.method6965() >= arg0 + (long) this.aClass39_1.anInt1335;
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(I)V")
	@Override
	public void method7121() {
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7119(@OriginalArg(1) boolean arg0) {
		@Pc(10) Interface2[] local10 = this.anInterface2Array1;
		for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
			@Pc(18) Interface2 local18 = local10[local12];
			if (local18 != null) {
				local18.method9317();
			}
		}
		this.aBoolean441 = false;
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(B)I")
	@Override
	public int method7122() {
		return this.aClass39_1.anInt1331;
	}
}
