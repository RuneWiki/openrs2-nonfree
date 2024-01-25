import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iba")
public final class Class139 {

	@OriginalMember(owner = "client!iba", name = "y", descriptor = "I")
	public int anInt5137;

	@OriginalMember(owner = "client!iba", name = "h", descriptor = "Lclient!gg;")
	private final Class112 aClass112_26 = new Class112(64);

	@OriginalMember(owner = "client!iba", name = "w", descriptor = "Lclient!gg;")
	public final Class112 aClass112_27 = new Class112(50);

	@OriginalMember(owner = "client!iba", name = "x", descriptor = "Lclient!gg;")
	public final Class112 aClass112_28 = new Class112(5);

	@OriginalMember(owner = "client!iba", name = "s", descriptor = "Z")
	public boolean aBoolean451;

	@OriginalMember(owner = "client!iba", name = "t", descriptor = "Lclient!dh;")
	public final Class62 aClass62_8;

	@OriginalMember(owner = "client!iba", name = "v", descriptor = "Lclient!kha;")
	public final Class181 aClass181_50;

	@OriginalMember(owner = "client!iba", name = "o", descriptor = "Lclient!kha;")
	private final Class181 aClass181_48;

	@OriginalMember(owner = "client!iba", name = "<init>", descriptor = "(Lclient!dh;IZLclient!kha;Lclient!kha;)V")
	public Class139(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class181 arg3, @OriginalArg(4) Class181 arg4) {
		this.aBoolean451 = arg2;
		this.aClass62_8 = arg0;
		this.aClass181_50 = arg4;
		this.aClass181_48 = arg3;
		if (this.aClass181_48 != null) {
			@Pc(41) int local41 = this.aClass181_48.method5029() - 1;
			this.aClass181_48.method5025(local41);
		}
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(II)V")
	public void method4338() {
		@Pc(2) Class112 local2 = this.aClass112_26;
		synchronized (this.aClass112_26) {
			this.aClass112_26.method3637(5);
		}
		local2 = this.aClass112_27;
		synchronized (this.aClass112_27) {
			this.aClass112_27.method3637(5);
		}
		local2 = this.aClass112_28;
		synchronized (this.aClass112_28) {
			this.aClass112_28.method3637(5);
		}
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(B)V")
	public void method4339() {
		@Pc(10) Class112 local10 = this.aClass112_27;
		synchronized (this.aClass112_27) {
			this.aClass112_27.method3638();
		}
		local10 = this.aClass112_28;
		synchronized (this.aClass112_28) {
			this.aClass112_28.method3638();
		}
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(I)V")
	public void method4340() {
		@Pc(2) Class112 local2 = this.aClass112_26;
		synchronized (this.aClass112_26) {
			this.aClass112_26.method3643();
		}
		local2 = this.aClass112_27;
		synchronized (this.aClass112_27) {
			this.aClass112_27.method3643();
		}
		local2 = this.aClass112_28;
		synchronized (this.aClass112_28) {
			this.aClass112_28.method3643();
		}
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(BI)V")
	public void method4341(@OriginalArg(1) int arg0) {
		this.anInt5137 = arg0;
		@Pc(9) Class112 local9 = this.aClass112_27;
		synchronized (this.aClass112_27) {
			this.aClass112_27.method3638();
		}
		local9 = this.aClass112_28;
		synchronized (this.aClass112_28) {
			this.aClass112_28.method3638();
		}
	}

	@OriginalMember(owner = "client!iba", name = "c", descriptor = "(II)Lclient!at;")
	public Class22 method4345(@OriginalArg(0) int arg0) {
		@Pc(6) Class112 local6 = this.aClass112_26;
		@Pc(16) Class22 local16;
		synchronized (this.aClass112_26) {
			local16 = (Class22) this.aClass112_26.method3640((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class181 local29 = this.aClass181_48;
		@Pc(44) byte[] local44;
		synchronized (this.aClass181_48) {
			local44 = this.aClass181_48.method5023(Static346.method5688(arg0), Static526.method6819(arg0));
		}
		local16 = new Class22();
		local16.aClass139_1 = this;
		local16.anInt397 = arg0;
		if (local44 != null) {
			local16.method420(new Class3_Sub15(local44));
		}
		local16.method421();
		@Pc(75) Class112 local75 = this.aClass112_26;
		synchronized (this.aClass112_26) {
			this.aClass112_26.method3636((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!iba", name = "b", descriptor = "(I)V")
	public void method4346() {
		@Pc(6) Class112 local6 = this.aClass112_26;
		synchronized (this.aClass112_26) {
			this.aClass112_26.method3638();
		}
		local6 = this.aClass112_27;
		synchronized (this.aClass112_27) {
			this.aClass112_27.method3638();
		}
		local6 = this.aClass112_28;
		synchronized (this.aClass112_28) {
			this.aClass112_28.method3638();
		}
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(ZI)V")
	public void method4347(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean451 != arg0) {
			this.aBoolean451 = arg0;
			this.method4346();
		}
	}
}
