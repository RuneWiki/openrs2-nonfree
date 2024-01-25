import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!no")
public final class Class173 {

	@OriginalMember(owner = "client!no", name = "s", descriptor = "I")
	public int anInt4167;

	@OriginalMember(owner = "client!no", name = "c", descriptor = "Lclient!mo;")
	private final Class160 aClass160_34 = new Class160(64);

	@OriginalMember(owner = "client!no", name = "r", descriptor = "Lclient!mo;")
	public final Class160 aClass160_35 = new Class160(30);

	@OriginalMember(owner = "client!no", name = "d", descriptor = "Lclient!nl;")
	private final Class171 aClass171_55;

	@OriginalMember(owner = "client!no", name = "o", descriptor = "Lclient!nl;")
	public final Class171 aClass171_57;

	static {
		new Class32("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
	}

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "(Lclient!lo;ILclient!nl;Lclient!nl;)V")
	public Class173(@OriginalArg(0) Class150 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class171 arg2, @OriginalArg(3) Class171 arg3) {
		this.aClass171_55 = arg2;
		this.aClass171_57 = arg3;
		@Pc(26) int local26 = this.aClass171_55.method3770() - 1;
		this.aClass171_55.method3750(local26);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(II)V")
	public void method3796() {
		@Pc(2) Class160 local2 = this.aClass160_34;
		synchronized (this.aClass160_34) {
			this.aClass160_34.method3606(5);
		}
		local2 = this.aClass160_35;
		synchronized (this.aClass160_35) {
			this.aClass160_35.method3606(5);
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(I)V")
	public void method3797() {
		@Pc(2) Class160 local2 = this.aClass160_34;
		synchronized (this.aClass160_34) {
			this.aClass160_34.method3595();
		}
		local2 = this.aClass160_35;
		synchronized (this.aClass160_35) {
			this.aClass160_35.method3595();
		}
	}

	@OriginalMember(owner = "client!no", name = "c", descriptor = "(I)V")
	public void method3799() {
		@Pc(6) Class160 local6 = this.aClass160_34;
		synchronized (this.aClass160_34) {
			this.aClass160_34.method3605();
		}
		local6 = this.aClass160_35;
		synchronized (this.aClass160_35) {
			this.aClass160_35.method3605();
		}
	}

	@OriginalMember(owner = "client!no", name = "b", descriptor = "(II)Lclient!cl;")
	public Class34 method3800(@OriginalArg(0) int arg0) {
		@Pc(6) Class160 local6 = this.aClass160_34;
		@Pc(16) Class34 local16;
		synchronized (this.aClass160_34) {
			local16 = (Class34) this.aClass160_34.method3599((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass171_55.method3745(Static40.method703(arg0), Static308.method4505(arg0));
		local16 = new Class34();
		local16.aClass173_3 = this;
		local16.anInt861 = arg0;
		if (local37 != null) {
			local16.method737(new Class2_Sub16(local37));
		}
		@Pc(59) Class160 local59 = this.aClass160_34;
		synchronized (this.aClass160_34) {
			this.aClass160_34.method3602((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!no", name = "c", descriptor = "(II)V")
	public void method3801(@OriginalArg(0) int arg0) {
		this.anInt4167 = arg0;
		@Pc(9) Class160 local9 = this.aClass160_35;
		synchronized (this.aClass160_35) {
			this.aClass160_35.method3595();
		}
	}
}
