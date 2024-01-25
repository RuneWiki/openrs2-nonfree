import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sda")
public final class Class315 {

	@OriginalMember(owner = "client!sda", name = "v", descriptor = "I")
	public int anInt8854;

	@OriginalMember(owner = "client!sda", name = "j", descriptor = "Z")
	public boolean aBoolean751 = false;

	@OriginalMember(owner = "client!sda", name = "h", descriptor = "Lclient!tq;")
	private Class340 aClass340_53 = new Class340(64);

	@OriginalMember(owner = "client!sda", name = "s", descriptor = "Lclient!tq;")
	public final Class340 aClass340_54 = new Class340(500);

	@OriginalMember(owner = "client!sda", name = "t", descriptor = "Lclient!tq;")
	public final Class340 aClass340_55 = new Class340(30);

	@OriginalMember(owner = "client!sda", name = "u", descriptor = "Lclient!tq;")
	public final Class340 aClass340_56 = new Class340(50);

	@OriginalMember(owner = "client!sda", name = "o", descriptor = "Lclient!wm;")
	public final Class390 aClass390_103;

	@OriginalMember(owner = "client!sda", name = "e", descriptor = "Z")
	public boolean aBoolean750;

	@OriginalMember(owner = "client!sda", name = "d", descriptor = "Lclient!wm;")
	private final Class390 aClass390_102;

	@OriginalMember(owner = "client!sda", name = "<init>", descriptor = "(Lclient!ega;IZLclient!wm;Lclient!wm;)V")
	public Class315(@OriginalArg(0) Class98 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class390 arg3, @OriginalArg(4) Class390 arg4) {
		this.aClass390_103 = arg4;
		this.aBoolean750 = arg2;
		this.aClass390_102 = arg3;
		if (this.aClass390_102 != null) {
			@Pc(47) int local47 = this.aClass390_102.method8918() - 1;
			this.aClass390_102.method8913(local47);
		}
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(II)V")
	public void method7506(@OriginalArg(0) int arg0) {
		this.aClass340_53 = new Class340(arg0);
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(I)V")
	public void method7507() {
		@Pc(2) Class340 local2 = this.aClass340_53;
		synchronized (this.aClass340_53) {
			this.aClass340_53.method8000();
		}
		local2 = this.aClass340_54;
		synchronized (this.aClass340_54) {
			this.aClass340_54.method8000();
		}
		local2 = this.aClass340_55;
		synchronized (this.aClass340_55) {
			this.aClass340_55.method8000();
		}
		local2 = this.aClass340_56;
		synchronized (this.aClass340_56) {
			this.aClass340_56.method8000();
		}
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(BZ)V")
	public void method7508(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean750 != arg0) {
			this.aBoolean750 = arg0;
			this.method7510();
		}
	}

	@OriginalMember(owner = "client!sda", name = "b", descriptor = "(II)V")
	public void method7509() {
		@Pc(2) Class340 local2 = this.aClass340_53;
		synchronized (this.aClass340_53) {
			this.aClass340_53.method7996(5);
		}
		local2 = this.aClass340_54;
		synchronized (this.aClass340_54) {
			this.aClass340_54.method7996(5);
		}
		local2 = this.aClass340_55;
		synchronized (this.aClass340_55) {
			this.aClass340_55.method7996(5);
		}
		local2 = this.aClass340_56;
		synchronized (this.aClass340_56) {
			this.aClass340_56.method7996(5);
		}
	}

	@OriginalMember(owner = "client!sda", name = "b", descriptor = "(I)V")
	public void method7510() {
		@Pc(6) Class340 local6 = this.aClass340_53;
		synchronized (this.aClass340_53) {
			this.aClass340_53.method7987();
		}
		local6 = this.aClass340_54;
		synchronized (this.aClass340_54) {
			this.aClass340_54.method7987();
		}
		local6 = this.aClass340_55;
		synchronized (this.aClass340_55) {
			this.aClass340_55.method7987();
		}
		local6 = this.aClass340_56;
		synchronized (this.aClass340_56) {
			this.aClass340_56.method7987();
		}
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(IB)Lclient!ih;")
	public Class164 method7511(@OriginalArg(0) int arg0) {
		@Pc(6) Class340 local6 = this.aClass340_53;
		@Pc(16) Class164 local16;
		synchronized (this.aClass340_53) {
			local16 = (Class164) this.aClass340_53.method7999((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class390 local29 = this.aClass390_102;
		@Pc(42) byte[] local42;
		synchronized (this.aClass390_102) {
			local42 = this.aClass390_102.method8914(Static100.method1973(arg0), Static569.method7785(arg0));
		}
		local16 = new Class164();
		local16.aClass315_3 = this;
		local16.anInt4670 = arg0;
		if (local42 != null) {
			local16.method3911(new Class5_Sub41(local42));
		}
		local16.method3919();
		if (!this.aBoolean750 && local16.aBoolean387) {
			local16.aStringArray27 = null;
			local16.anIntArray244 = null;
		}
		if (local16.aBoolean384) {
			local16.aBoolean380 = false;
			local16.anInt4632 = 0;
		}
		@Pc(99) Class340 local99 = this.aClass340_53;
		synchronized (this.aClass340_53) {
			this.aClass340_53.method7986((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!sda", name = "b", descriptor = "(IB)V")
	public void method7512(@OriginalArg(0) int arg0) {
		this.anInt8854 = arg0;
		@Pc(15) Class340 local15 = this.aClass340_54;
		synchronized (this.aClass340_54) {
			this.aClass340_54.method7987();
		}
		local15 = this.aClass340_55;
		synchronized (this.aClass340_55) {
			this.aClass340_55.method7987();
		}
		local15 = this.aClass340_56;
		synchronized (this.aClass340_56) {
			this.aClass340_56.method7987();
		}
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(ZZ)V")
	public void method7513(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean751 != arg0) {
			this.aBoolean751 = arg0;
			this.method7510();
		}
	}
}
