import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lu")
public final class Class199 {

	@OriginalMember(owner = "client!lu", name = "t", descriptor = "I")
	public int anInt6512;

	@OriginalMember(owner = "client!lu", name = "h", descriptor = "Z")
	public boolean aBoolean453 = false;

	@OriginalMember(owner = "client!lu", name = "i", descriptor = "Lclient!of;")
	private Class236 aClass236_60 = new Class236(64);

	@OriginalMember(owner = "client!lu", name = "q", descriptor = "Lclient!of;")
	public final Class236 aClass236_61 = new Class236(500);

	@OriginalMember(owner = "client!lu", name = "r", descriptor = "Lclient!of;")
	public final Class236 aClass236_62 = new Class236(30);

	@OriginalMember(owner = "client!lu", name = "s", descriptor = "Lclient!of;")
	public final Class236 aClass236_63 = new Class236(50);

	@OriginalMember(owner = "client!lu", name = "o", descriptor = "Z")
	public boolean aBoolean454;

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "Lclient!oh;")
	public final Class237 aClass237_84;

	@OriginalMember(owner = "client!lu", name = "b", descriptor = "Lclient!oh;")
	private final Class237 aClass237_85;

	@OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(Lclient!nb;IZLclient!oh;Lclient!oh;)V")
	public Class199(@OriginalArg(0) Class217 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class237 arg3, @OriginalArg(4) Class237 arg4) {
		this.aBoolean454 = arg2;
		this.aClass237_84 = arg4;
		this.aClass237_85 = arg3;
		if (this.aClass237_85 != null) {
			@Pc(47) int local47 = this.aClass237_85.method6311() - 1;
			this.aClass237_85.method6315(local47);
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(ZI)V")
	public void method5341(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean454) {
			this.aBoolean454 = arg0;
			this.method5344();
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(BI)Lclient!vc;")
	public Class352 method5342(@OriginalArg(1) int arg0) {
		@Pc(6) Class236 local6 = this.aClass236_60;
		@Pc(16) Class352 local16;
		synchronized (this.aClass236_60) {
			local16 = (Class352) this.aClass236_60.method6242((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class237 local29 = this.aClass237_85;
		@Pc(42) byte[] local42;
		synchronized (this.aClass237_85) {
			local42 = this.aClass237_85.method6314(Static568.method7885(arg0), Static599.method8249(arg0));
		}
		local16 = new Class352();
		local16.anInt10077 = arg0;
		local16.aClass199_4 = this;
		if (local42 != null) {
			local16.method8162(new Class8_Sub8(local42));
		}
		local16.method8178();
		if (local16.aBoolean726) {
			local16.aBoolean717 = false;
			local16.anInt10130 = 0;
		}
		if (!this.aBoolean454 && local16.aBoolean714) {
			local16.anIntArray590 = null;
			local16.aStringArray37 = null;
		}
		@Pc(100) Class236 local100 = this.aClass236_60;
		synchronized (this.aClass236_60) {
			this.aClass236_60.method6241((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IZ)V")
	public void method5343(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean453) {
			this.aBoolean453 = arg0;
			this.method5344();
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(I)V")
	public void method5344() {
		@Pc(2) Class236 local2 = this.aClass236_60;
		synchronized (this.aClass236_60) {
			this.aClass236_60.method6253();
		}
		@Pc(29) Class236 local29 = this.aClass236_61;
		synchronized (this.aClass236_61) {
			this.aClass236_61.method6253();
		}
		local29 = this.aClass236_62;
		synchronized (this.aClass236_62) {
			this.aClass236_62.method6253();
		}
		local29 = this.aClass236_63;
		synchronized (this.aClass236_63) {
			this.aClass236_63.method6253();
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(II)V")
	public void method5345(@OriginalArg(1) int arg0) {
		this.anInt6512 = arg0;
		@Pc(9) Class236 local9 = this.aClass236_61;
		synchronized (this.aClass236_61) {
			this.aClass236_61.method6253();
		}
		local9 = this.aClass236_62;
		synchronized (this.aClass236_62) {
			this.aClass236_62.method6253();
		}
		local9 = this.aClass236_63;
		synchronized (this.aClass236_63) {
			this.aClass236_63.method6253();
		}
	}

	@OriginalMember(owner = "client!lu", name = "b", descriptor = "(II)V")
	public void method5347(@OriginalArg(1) int arg0) {
		this.aClass236_60 = new Class236(arg0);
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(B)V")
	public void method5349() {
		@Pc(2) Class236 local2 = this.aClass236_60;
		synchronized (this.aClass236_60) {
			this.aClass236_60.method6245();
		}
		local2 = this.aClass236_61;
		synchronized (this.aClass236_61) {
			this.aClass236_61.method6245();
		}
		local2 = this.aClass236_62;
		synchronized (this.aClass236_62) {
			this.aClass236_62.method6245();
		}
		local2 = this.aClass236_63;
		synchronized (this.aClass236_63) {
			this.aClass236_63.method6245();
		}
	}

	@OriginalMember(owner = "client!lu", name = "b", descriptor = "(IZ)V")
	public void method5350() {
		@Pc(8) Class236 local8 = this.aClass236_60;
		synchronized (this.aClass236_60) {
			this.aClass236_60.method6243(5);
		}
		local8 = this.aClass236_61;
		synchronized (this.aClass236_61) {
			this.aClass236_61.method6243(5);
		}
		local8 = this.aClass236_62;
		synchronized (this.aClass236_62) {
			this.aClass236_62.method6243(5);
		}
		local8 = this.aClass236_63;
		synchronized (this.aClass236_63) {
			this.aClass236_63.method6243(5);
		}
	}
}
