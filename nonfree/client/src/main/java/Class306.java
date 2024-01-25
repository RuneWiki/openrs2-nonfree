import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class306 implements Interface8 {

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "Lclient!ha;")
	private Class145 aClass145_10;

	@OriginalMember(owner = "client!qd", name = "j", descriptor = "Z")
	private boolean aBoolean695;

	@OriginalMember(owner = "client!qd", name = "g", descriptor = "Lclient!bh;")
	private final Class38 aClass38_1;

	@OriginalMember(owner = "client!qd", name = "o", descriptor = "[Lclient!jla;")
	private final Interface10[] anInterface10Array1;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lclient!bh;Lclient!th;)V")
	public Class306(@OriginalArg(0) Class38 arg0, @OriginalArg(1) Class354 arg1) {
		this.aClass38_1 = arg0;
		this.anInterface10Array1 = new Interface10[this.aClass38_1.anInterface17Array1.length];
		for (@Pc(15) int local15 = 0; local15 < this.anInterface10Array1.length; local15++) {
			this.anInterface10Array1[local15] = arg1.method8344(this.aClass38_1.anInterface17Array1[local15]);
		}
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(Z)V")
	@Override
	public void method7190() {
		if (Static396.aClass145_6 != this.aClass145_10) {
			this.aBoolean695 = true;
			this.aClass145_10 = Static396.aClass145_6;
		}
		this.aClass145_10.GA(0);
		@Pc(31) Interface10[] local31 = this.anInterface10Array1;
		for (@Pc(33) int local33 = 0; local33 < local31.length; local33++) {
			@Pc(39) Interface10 local39 = local31[local33];
			if (local39 != null) {
				local39.method9561();
			}
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7192(@OriginalArg(1) boolean arg0) {
		@Pc(10) Interface10[] local10 = this.anInterface10Array1;
		for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
			@Pc(27) Interface10 local27 = local10[local12];
			if (local27 != null) {
				local27.method9560();
			}
		}
		this.aBoolean695 = false;
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)I")
	@Override
	public int method7191() {
		return this.aClass38_1.anInt638;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)I")
	@Override
	public int method7193() {
		@Pc(15) int local15 = 0;
		@Pc(18) Interface10[] local18 = this.anInterface10Array1;
		for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
			@Pc(26) Interface10 local26 = local18[local20];
			if (local26 == null || local26.method9562()) {
				local15++;
			}
		}
		return local15 * 100 / this.anInterface10Array1.length;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)V")
	@Override
	public void method7188() {
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(BJ)Z")
	@Override
	public boolean method7189(@OriginalArg(1) long arg0) {
		return arg0 + (long) this.aClass38_1.anInt640 <= Static567.method7863();
	}
}
