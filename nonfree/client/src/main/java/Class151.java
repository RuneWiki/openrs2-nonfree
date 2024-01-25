import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ml")
public final class Class151 {

	@OriginalMember(owner = "client!ml", name = "t", descriptor = "I")
	public int anInt4066;

	@OriginalMember(owner = "client!ml", name = "g", descriptor = "Lclient!mq;")
	private final Class154 aClass154_27 = new Class154(64);

	@OriginalMember(owner = "client!ml", name = "r", descriptor = "Lclient!mq;")
	public final Class154 aClass154_28 = new Class154(50);

	@OriginalMember(owner = "client!ml", name = "s", descriptor = "Lclient!mq;")
	public final Class154 aClass154_29 = new Class154(5);

	@OriginalMember(owner = "client!ml", name = "n", descriptor = "Lclient!fc;")
	public final Class71 aClass71_54;

	@OriginalMember(owner = "client!ml", name = "e", descriptor = "Lclient!fc;")
	private final Class71 aClass71_53;

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "I")
	public final int anInt4057;

	@OriginalMember(owner = "client!ml", name = "k", descriptor = "Z")
	public boolean aBoolean306;

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lclient!dk;IZLclient!fc;Lclient!fc;)V")
	public Class151(@OriginalArg(0) Class48 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class71 arg3, @OriginalArg(4) Class71 arg4) {
		this.aClass71_54 = arg4;
		this.aClass71_53 = arg3;
		this.anInt4057 = arg1;
		this.aBoolean306 = arg2;
		if (this.aClass71_53 != null) {
			@Pc(41) int local41 = this.aClass71_53.method1553() - 1;
			this.aClass71_53.method1580(local41);
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZI)V")
	public void method3702(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean306 != arg0) {
			this.aBoolean306 = arg0;
			this.method3706();
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)V")
	public void method3704(@OriginalArg(1) int arg0) {
		this.anInt4066 = arg0;
		@Pc(12) Class154 local12 = this.aClass154_28;
		synchronized (this.aClass154_28) {
			this.aClass154_28.method3748();
		}
		local12 = this.aClass154_29;
		synchronized (this.aClass154_29) {
			this.aClass154_29.method3748();
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IZ)Lclient!vl;")
	public Class240 method3705(@OriginalArg(0) int arg0) {
		@Pc(6) Class154 local6 = this.aClass154_27;
		@Pc(16) Class240 local16;
		synchronized (this.aClass154_27) {
			local16 = (Class240) this.aClass154_27.method3751((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass71_53.method1555(Static200.method3344(arg0), Static271.method4255(arg0));
		local16 = new Class240();
		local16.aClass151_5 = this;
		local16.anInt6482 = arg0;
		if (local37 != null) {
			local16.method5578(new Class2_Sub13(local37));
		}
		local16.method5571();
		@Pc(62) Class154 local62 = this.aClass154_27;
		synchronized (this.aClass154_27) {
			this.aClass154_27.method3745((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V")
	public void method3706() {
		@Pc(6) Class154 local6 = this.aClass154_27;
		synchronized (this.aClass154_27) {
			this.aClass154_27.method3748();
		}
		local6 = this.aClass154_28;
		synchronized (this.aClass154_28) {
			this.aClass154_28.method3748();
		}
		local6 = this.aClass154_29;
		synchronized (this.aClass154_29) {
			this.aClass154_29.method3748();
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)V")
	public void method3708() {
		@Pc(2) Class154 local2 = this.aClass154_27;
		synchronized (this.aClass154_27) {
			this.aClass154_27.method3746();
		}
		local2 = this.aClass154_28;
		synchronized (this.aClass154_28) {
			this.aClass154_28.method3746();
		}
		local2 = this.aClass154_29;
		synchronized (this.aClass154_29) {
			this.aClass154_29.method3746();
		}
	}

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "(I)V")
	public void method3709() {
		@Pc(8) Class154 local8 = this.aClass154_28;
		synchronized (this.aClass154_28) {
			this.aClass154_28.method3748();
		}
		local8 = this.aClass154_29;
		synchronized (this.aClass154_29) {
			this.aClass154_29.method3748();
		}
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(II)V")
	public void method3711() {
		@Pc(2) Class154 local2 = this.aClass154_27;
		synchronized (this.aClass154_27) {
			this.aClass154_27.method3758(5);
		}
		local2 = this.aClass154_28;
		synchronized (this.aClass154_28) {
			this.aClass154_28.method3758(5);
		}
		local2 = this.aClass154_29;
		synchronized (this.aClass154_29) {
			this.aClass154_29.method3758(5);
		}
	}
}
