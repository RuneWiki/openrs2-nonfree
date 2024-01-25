import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!k")
public final class Class182 {

	@OriginalMember(owner = "client!k", name = "u", descriptor = "I")
	public int anInt4766;

	@OriginalMember(owner = "client!k", name = "r", descriptor = "Lclient!uf;")
	private final Class326 aClass326_19 = new Class326(64);

	@OriginalMember(owner = "client!k", name = "s", descriptor = "Lclient!uf;")
	public final Class326 aClass326_20 = new Class326(50);

	@OriginalMember(owner = "client!k", name = "t", descriptor = "Lclient!uf;")
	public final Class326 aClass326_21 = new Class326(5);

	@OriginalMember(owner = "client!k", name = "j", descriptor = "Z")
	public boolean aBoolean366;

	@OriginalMember(owner = "client!k", name = "l", descriptor = "Lclient!nq;")
	public final Class230 aClass230_1;

	@OriginalMember(owner = "client!k", name = "i", descriptor = "Lclient!ga;")
	public final Class111 aClass111_56;

	@OriginalMember(owner = "client!k", name = "k", descriptor = "Lclient!ga;")
	private final Class111 aClass111_57;

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Lclient!nq;IZLclient!ga;Lclient!ga;)V")
	public Class182(@OriginalArg(0) Class230 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class111 arg3, @OriginalArg(4) Class111 arg4) {
		this.aBoolean366 = arg2;
		this.aClass230_1 = arg0;
		this.aClass111_56 = arg4;
		this.aClass111_57 = arg3;
		if (this.aClass111_57 != null) {
			@Pc(41) int local41 = this.aClass111_57.method2436() - 1;
			this.aClass111_57.method2442(local41);
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(II)V")
	public void method4057(@OriginalArg(1) int arg0) {
		this.anInt4766 = arg0;
		@Pc(17) Class326 local17 = this.aClass326_20;
		synchronized (this.aClass326_20) {
			this.aClass326_20.method7230();
		}
		local17 = this.aClass326_21;
		synchronized (this.aClass326_21) {
			this.aClass326_21.method7230();
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(BI)V")
	public void method4060() {
		@Pc(6) Class326 local6 = this.aClass326_19;
		synchronized (this.aClass326_19) {
			this.aClass326_19.method7241(5);
		}
		local6 = this.aClass326_20;
		synchronized (this.aClass326_20) {
			this.aClass326_20.method7241(5);
		}
		local6 = this.aClass326_21;
		synchronized (this.aClass326_21) {
			this.aClass326_21.method7241(5);
		}
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(I)V")
	public void method4061() {
		@Pc(2) Class326 local2 = this.aClass326_20;
		synchronized (this.aClass326_20) {
			this.aClass326_20.method7230();
		}
		@Pc(29) Class326 local29 = this.aClass326_21;
		synchronized (this.aClass326_21) {
			this.aClass326_21.method7230();
		}
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(II)Lclient!iv;")
	public Class162 method4062(@OriginalArg(0) int arg0) {
		@Pc(6) Class326 local6 = this.aClass326_19;
		@Pc(16) Class162 local16;
		synchronized (this.aClass326_19) {
			local16 = (Class162) this.aClass326_19.method7238((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class111 local29 = this.aClass111_57;
		@Pc(44) byte[] local44;
		synchronized (this.aClass111_57) {
			local44 = this.aClass111_57.method2441(Static549.method7479(arg0), Static218.method3615(arg0));
		}
		local16 = new Class162();
		local16.anInt4413 = arg0;
		local16.aClass182_2 = this;
		if (local44 != null) {
			local16.method3794(new Class1_Sub20(local44));
		}
		local16.method3795();
		@Pc(79) Class326 local79 = this.aClass326_19;
		synchronized (this.aClass326_19) {
			this.aClass326_19.method7236(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!k", name = "c", descriptor = "(I)V")
	public void method4063() {
		@Pc(6) Class326 local6 = this.aClass326_19;
		synchronized (this.aClass326_19) {
			this.aClass326_19.method7230();
		}
		local6 = this.aClass326_20;
		synchronized (this.aClass326_20) {
			this.aClass326_20.method7230();
		}
		local6 = this.aClass326_21;
		synchronized (this.aClass326_21) {
			this.aClass326_21.method7230();
		}
	}

	@OriginalMember(owner = "client!k", name = "d", descriptor = "(I)V")
	public void method4064() {
		@Pc(6) Class326 local6 = this.aClass326_19;
		synchronized (this.aClass326_19) {
			this.aClass326_19.method7234();
		}
		local6 = this.aClass326_20;
		synchronized (this.aClass326_20) {
			this.aClass326_20.method7234();
		}
		local6 = this.aClass326_21;
		synchronized (this.aClass326_21) {
			this.aClass326_21.method7234();
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IZ)V")
	public void method4065(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean366 != arg0) {
			this.aBoolean366 = arg0;
			this.method4063();
		}
	}
}
