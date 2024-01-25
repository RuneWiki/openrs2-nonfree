import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rea")
public final class Class288 {

	@OriginalMember(owner = "client!rea", name = "w", descriptor = "I")
	public int anInt7759;

	@OriginalMember(owner = "client!rea", name = "s", descriptor = "Z")
	public boolean aBoolean543 = false;

	@OriginalMember(owner = "client!rea", name = "q", descriptor = "Lclient!mga;")
	private Class223 aClass223_52 = new Class223(64);

	@OriginalMember(owner = "client!rea", name = "t", descriptor = "Lclient!mga;")
	public final Class223 aClass223_53 = new Class223(500);

	@OriginalMember(owner = "client!rea", name = "u", descriptor = "Lclient!mga;")
	public final Class223 aClass223_54 = new Class223(30);

	@OriginalMember(owner = "client!rea", name = "v", descriptor = "Lclient!mga;")
	public final Class223 aClass223_55 = new Class223(50);

	@OriginalMember(owner = "client!rea", name = "n", descriptor = "Lclient!bi;")
	public final Class31 aClass31_100;

	@OriginalMember(owner = "client!rea", name = "h", descriptor = "Z")
	public boolean aBoolean542;

	@OriginalMember(owner = "client!rea", name = "d", descriptor = "Lclient!bi;")
	private final Class31 aClass31_99;

	@OriginalMember(owner = "client!rea", name = "<init>", descriptor = "(Lclient!pca;IZLclient!bi;Lclient!bi;)V")
	public Class288(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class31 arg3, @OriginalArg(4) Class31 arg4) {
		this.aClass31_100 = arg4;
		this.aBoolean542 = arg2;
		this.aClass31_99 = arg3;
		if (this.aClass31_99 != null) {
			@Pc(47) int local47 = this.aClass31_99.method675() - 1;
			this.aClass31_99.method657(local47);
		}
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(IB)Lclient!bd;")
	public Class25 method6419(@OriginalArg(0) int arg0) {
		@Pc(6) Class223 local6 = this.aClass223_52;
		@Pc(16) Class25 local16;
		synchronized (this.aClass223_52) {
			local16 = (Class25) this.aClass223_52.method4943((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class31 local29 = this.aClass31_99;
		@Pc(48) byte[] local48;
		synchronized (this.aClass31_99) {
			local48 = this.aClass31_99.method667(Static316.method4828(arg0), Static440.method6235(arg0));
		}
		local16 = new Class25();
		local16.aClass288_1 = this;
		local16.anInt605 = arg0;
		if (local48 != null) {
			local16.method568(new Class4_Sub9(local48));
		}
		local16.method577();
		if (!this.aBoolean542 && local16.aBoolean53) {
			local16.aStringArray2 = null;
			local16.anIntArray113 = null;
		}
		if (local16.aBoolean62) {
			local16.anInt607 = 0;
			local16.aBoolean56 = false;
		}
		@Pc(100) Class223 local100 = this.aClass223_52;
		synchronized (this.aClass223_52) {
			this.aClass223_52.method4938((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(BI)V")
	public void method6420(@OriginalArg(1) int arg0) {
		this.aClass223_52 = new Class223(arg0);
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(IZ)V")
	public void method6421(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean543 != arg0) {
			this.aBoolean543 = arg0;
			this.method6422();
		}
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(I)V")
	public void method6422() {
		@Pc(6) Class223 local6 = this.aClass223_52;
		synchronized (this.aClass223_52) {
			this.aClass223_52.method4932();
		}
		local6 = this.aClass223_53;
		synchronized (this.aClass223_53) {
			this.aClass223_53.method4932();
		}
		local6 = this.aClass223_54;
		synchronized (this.aClass223_54) {
			this.aClass223_54.method4932();
		}
		local6 = this.aClass223_55;
		synchronized (this.aClass223_55) {
			this.aClass223_55.method4932();
		}
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(ZI)V")
	public void method6423(@OriginalArg(1) int arg0) {
		this.anInt7759 = arg0;
		@Pc(9) Class223 local9 = this.aClass223_53;
		synchronized (this.aClass223_53) {
			this.aClass223_53.method4932();
		}
		local9 = this.aClass223_54;
		synchronized (this.aClass223_54) {
			this.aClass223_54.method4932();
		}
		local9 = this.aClass223_55;
		synchronized (this.aClass223_55) {
			this.aClass223_55.method4932();
		}
	}

	@OriginalMember(owner = "client!rea", name = "b", descriptor = "(BI)V")
	public void method6424() {
		@Pc(13) Class223 local13 = this.aClass223_52;
		synchronized (this.aClass223_52) {
			this.aClass223_52.method4933(5);
		}
		local13 = this.aClass223_53;
		synchronized (this.aClass223_53) {
			this.aClass223_53.method4933(5);
		}
		local13 = this.aClass223_54;
		synchronized (this.aClass223_54) {
			this.aClass223_54.method4933(5);
		}
		local13 = this.aClass223_55;
		synchronized (this.aClass223_55) {
			this.aClass223_55.method4933(5);
		}
	}

	@OriginalMember(owner = "client!rea", name = "b", descriptor = "(I)V")
	public void method6425() {
		@Pc(2) Class223 local2 = this.aClass223_52;
		synchronized (this.aClass223_52) {
			this.aClass223_52.method4941();
		}
		local2 = this.aClass223_53;
		synchronized (this.aClass223_53) {
			this.aClass223_53.method4941();
		}
		local2 = this.aClass223_54;
		synchronized (this.aClass223_54) {
			this.aClass223_54.method4941();
		}
		local2 = this.aClass223_55;
		synchronized (this.aClass223_55) {
			this.aClass223_55.method4941();
		}
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(ZB)V")
	public void method6427(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean542) {
			this.aBoolean542 = arg0;
			this.method6422();
		}
	}
}
