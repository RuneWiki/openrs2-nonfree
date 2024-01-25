import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!w")
public final class Class257 {

	@OriginalMember(owner = "client!w", name = "i", descriptor = "Lclient!dc;")
	private final Class44 aClass44_55 = new Class44(64);

	@OriginalMember(owner = "client!w", name = "b", descriptor = "Lclient!he;")
	private final Class100 aClass100_93;

	@OriginalMember(owner = "client!w", name = "g", descriptor = "I")
	public final int anInt7692;

	static {
		new Class267("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.");
	}

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Lclient!ci;ILclient!he;)V")
	public Class257(@OriginalArg(0) Class36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100 arg2) {
		this.aClass100_93 = arg2;
		if (this.aClass100_93 == null) {
			this.anInt7692 = 0;
		} else {
			this.anInt7692 = this.aClass100_93.method2523(16);
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V")
	public void method6294() {
		@Pc(6) Class44 local6 = this.aClass44_55;
		synchronized (this.aClass44_55) {
			this.aClass44_55.method1348();
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
	public void method6295() {
		@Pc(2) Class44 local2 = this.aClass44_55;
		synchronized (this.aClass44_55) {
			this.aClass44_55.method1351();
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(II)Lclient!dm;")
	public Class52 method6296(@OriginalArg(1) int arg0) {
		@Pc(6) Class44 local6 = this.aClass44_55;
		@Pc(18) Class52 local18;
		synchronized (this.aClass44_55) {
			local18 = (Class52) this.aClass44_55.method1353((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(35) byte[] local35 = this.aClass100_93.method2520(arg0, 16);
		local18 = new Class52();
		if (local35 != null) {
			local18.method1461(new Class6_Sub1(local35));
		}
		@Pc(51) Class44 local51 = this.aClass44_55;
		synchronized (this.aClass44_55) {
			this.aClass44_55.method1349(local18, (long) arg0);
			return local18;
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(BI)V")
	public void method6298() {
		@Pc(11) Class44 local11 = this.aClass44_55;
		synchronized (this.aClass44_55) {
			this.aClass44_55.method1352(5);
		}
	}
}
