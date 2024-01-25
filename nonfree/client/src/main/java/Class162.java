import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jw")
public final class Class162 implements Interface6 {

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "Z")
	private boolean aBoolean347;

	@OriginalMember(owner = "client!jw", name = "e", descriptor = "Lclient!oa;")
	private Class90 aClass90_8;

	@OriginalMember(owner = "client!jw", name = "i", descriptor = "Lclient!wq;")
	private final Class352 aClass352_1;

	@OriginalMember(owner = "client!jw", name = "j", descriptor = "[Lclient!qt;")
	private final Interface19[] anInterface19Array1;

	@OriginalMember(owner = "client!jw", name = "<init>", descriptor = "(Lclient!wq;Lclient!mk;)V")
	public Class162(@OriginalArg(0) Class352 arg0, @OriginalArg(1) Class203 arg1) {
		this.aClass352_1 = arg0;
		this.anInterface19Array1 = new Interface19[this.aClass352_1.anInterface12Array1.length];
		for (@Pc(15) int local15 = 0; local15 < this.anInterface19Array1.length; local15++) {
			this.anInterface19Array1[local15] = arg1.method4980(this.aClass352_1.anInterface12Array1[local15]);
		}
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(B)I")
	@Override
	public int method3966() {
		@Pc(13) int local13 = 0;
		@Pc(16) Interface19[] local16 = this.anInterface19Array1;
		for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
			@Pc(24) Interface19 local24 = local16[local18];
			if (local24 == null || local24.method6772()) {
				local13++;
			}
		}
		return local13 * 100 / this.anInterface19Array1.length;
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method3967() {
		return Static473.anInt8332 >= this.aClass352_1.anInt9933;
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(IZ)V")
	@Override
	public void method3965(@OriginalArg(1) boolean arg0) {
		@Pc(10) Interface19[] local10 = this.anInterface19Array1;
		for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
			@Pc(24) Interface19 local24 = local10[local12];
			if (local24 != null) {
				local24.method6771();
			}
		}
		this.aBoolean347 = false;
	}

	@OriginalMember(owner = "client!jw", name = "c", descriptor = "(I)V")
	@Override
	public void method3969() {
		if (Static554.aClass90_12 != this.aClass90_8) {
			this.aClass90_8 = Static554.aClass90_12;
			this.aBoolean347 = true;
		}
		this.aClass90_8.D(0);
		@Pc(29) Interface19[] local29 = this.anInterface19Array1;
		for (@Pc(31) int local31 = 0; local31 < local29.length; local31++) {
			@Pc(37) Interface19 local37 = local29[local31];
			if (local37 != null) {
				local37.method6770();
			}
		}
	}

	@OriginalMember(owner = "client!jw", name = "b", descriptor = "(I)V")
	@Override
	public void method3968() {
	}
}
