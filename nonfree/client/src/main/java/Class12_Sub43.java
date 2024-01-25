import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public abstract class Class12_Sub43 extends Class12 {

	@OriginalMember(owner = "client!pq", name = "u", descriptor = "Z")
	public boolean aBoolean618;

	@OriginalMember(owner = "client!pq", name = "p", descriptor = "Lclient!gi;")
	protected final Class42_Sub3 aClass42_Sub3_37;

	static {
		new Class88("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
	}

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(Lclient!gi;)V")
	public Class12_Sub43(@OriginalArg(0) Class42_Sub3 arg0) {
		this.aClass42_Sub3_37 = arg0;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(I)Z")
	public final boolean method7225() {
		return this.aBoolean618;
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(I)V")
	public abstract void method7226();

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(B)I")
	public final int method7227() {
		return 1;
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(III)V")
	public abstract void method7228(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(B)Z")
	public abstract boolean method7230();

	@OriginalMember(owner = "client!pq", name = "c", descriptor = "(I)I")
	public int method7231() {
		return 0;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(II)V")
	public abstract void method7232(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(Z)Z")
	public final boolean method7233() {
		return false;
	}

	@OriginalMember(owner = "client!pq", name = "d", descriptor = "(I)Z")
	public abstract boolean method7234();

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lclient!ob;IILclient!ob;)V")
	public abstract void method7235(@OriginalArg(0) Class79_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class79_Sub2 arg2);
}
