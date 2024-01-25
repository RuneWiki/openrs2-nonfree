import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vo")
public final class Class253 {

	@OriginalMember(owner = "client!vo", name = "d", descriptor = "Lclient!dc;")
	private final Class44 aClass44_54 = new Class44(64);

	@OriginalMember(owner = "client!vo", name = "m", descriptor = "I")
	public int anInt7604 = 0;

	@OriginalMember(owner = "client!vo", name = "l", descriptor = "Lclient!he;")
	private final Class100 aClass100_92;

	@OriginalMember(owner = "client!vo", name = "i", descriptor = "I")
	public final int anInt7602;

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(Lclient!ci;ILclient!he;)V")
	public Class253(@OriginalArg(0) Class36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100 arg2) {
		this.aClass100_92 = arg2;
		this.anInt7602 = this.aClass100_92.method2523(4);
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(II)V")
	public void method6226() {
		@Pc(6) Class44 local6 = this.aClass44_54;
		synchronized (this.aClass44_54) {
			this.aClass44_54.method1352(5);
		}
	}

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "(II)Lclient!vp;")
	public Class254 method6228(@OriginalArg(1) int arg0) {
		@Pc(6) Class44 local6 = this.aClass44_54;
		@Pc(18) Class254 local18;
		synchronized (this.aClass44_54) {
			local18 = (Class254) this.aClass44_54.method1353((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(42) byte[] local42 = this.aClass100_92.method2520(arg0, 4);
		local18 = new Class254();
		local18.anInt7606 = arg0;
		local18.aClass253_6 = this;
		if (local42 != null) {
			local18.method6237(new Class6_Sub1(local42));
		}
		local18.method6238();
		@Pc(69) Class44 local69 = this.aClass44_54;
		synchronized (this.aClass44_54) {
			this.aClass44_54.method1349(local18, (long) arg0);
			return local18;
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)V")
	public void method6229() {
		@Pc(6) Class44 local6 = this.aClass44_54;
		synchronized (this.aClass44_54) {
			this.aClass44_54.method1351();
		}
	}

	@OriginalMember(owner = "client!vo", name = "c", descriptor = "(I)V")
	public void method6232() {
		@Pc(6) Class44 local6 = this.aClass44_54;
		synchronized (this.aClass44_54) {
			this.aClass44_54.method1348();
		}
	}
}
