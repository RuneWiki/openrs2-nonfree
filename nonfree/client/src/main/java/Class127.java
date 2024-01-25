import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public final class Class127 {

	@OriginalMember(owner = "client!jf", name = "A", descriptor = "I")
	public int anInt3148;

	@OriginalMember(owner = "client!jf", name = "l", descriptor = "Z")
	public boolean aBoolean224 = false;

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "Lclient!rp;")
	private Class220 aClass220_21 = new Class220(64);

	@OriginalMember(owner = "client!jf", name = "x", descriptor = "Lclient!rp;")
	public final Class220 aClass220_22 = new Class220(500);

	@OriginalMember(owner = "client!jf", name = "y", descriptor = "Lclient!rp;")
	public final Class220 aClass220_23 = new Class220(30);

	@OriginalMember(owner = "client!jf", name = "z", descriptor = "Lclient!rp;")
	public final Class220 aClass220_24 = new Class220(50);

	@OriginalMember(owner = "client!jf", name = "p", descriptor = "Lclient!lt;")
	private final Class158 aClass158_39;

	@OriginalMember(owner = "client!jf", name = "u", descriptor = "Z")
	public boolean aBoolean225;

	@OriginalMember(owner = "client!jf", name = "k", descriptor = "Lclient!lt;")
	public final Class158 aClass158_38;

	static {
		new Class231("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
	}

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lclient!cm;IZLclient!lt;Lclient!lt;)V")
	public Class127(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class158 arg3, @OriginalArg(4) Class158 arg4) {
		this.aClass158_39 = arg3;
		this.aBoolean225 = arg2;
		this.aClass158_38 = arg4;
		if (this.aClass158_39 != null) {
			@Pc(47) int local47 = this.aClass158_39.method3695() - 1;
			this.aClass158_39.method3683(local47);
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZI)V")
	public void method2813(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean225 != arg0) {
			this.aBoolean225 = arg0;
			this.method2823();
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
	public void method2814() {
		@Pc(2) Class220 local2 = this.aClass220_21;
		synchronized (this.aClass220_21) {
			this.aClass220_21.method4987();
		}
		local2 = this.aClass220_22;
		synchronized (this.aClass220_22) {
			this.aClass220_22.method4987();
		}
		local2 = this.aClass220_23;
		synchronized (this.aClass220_23) {
			this.aClass220_23.method4987();
		}
		local2 = this.aClass220_24;
		synchronized (this.aClass220_24) {
			this.aClass220_24.method4987();
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IB)V")
	public void method2817(@OriginalArg(0) int arg0) {
		this.anInt3148 = arg0;
		@Pc(9) Class220 local9 = this.aClass220_22;
		synchronized (this.aClass220_22) {
			this.aClass220_22.method4999();
		}
		local9 = this.aClass220_23;
		synchronized (this.aClass220_23) {
			this.aClass220_23.method4999();
		}
		local9 = this.aClass220_24;
		synchronized (this.aClass220_24) {
			this.aClass220_24.method4999();
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(BI)Lclient!in;")
	public Class118 method2820(@OriginalArg(1) int arg0) {
		@Pc(12) Class220 local12 = this.aClass220_21;
		@Pc(22) Class118 local22;
		synchronized (this.aClass220_21) {
			local22 = (Class118) this.aClass220_21.method4990((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(43) byte[] local43 = this.aClass158_39.method3672(Static260.method4006(arg0), Static88.method1550(arg0));
		local22 = new Class118();
		local22.anInt3021 = arg0;
		local22.aClass127_4 = this;
		if (local43 != null) {
			local22.method2717(new Class6_Sub15(local43));
		}
		local22.method2721();
		if (local22.aBoolean220) {
			local22.aBoolean214 = false;
			local22.anInt2978 = 0;
		}
		if (!this.aBoolean225 && local22.aBoolean219) {
			local22.anIntArray272 = null;
			local22.aStringArray22 = null;
		}
		@Pc(91) Class220 local91 = this.aClass220_21;
		synchronized (this.aClass220_21) {
			this.aClass220_21.method4996(local22, (long) arg0);
			return local22;
		}
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(BI)V")
	public void method2821() {
		@Pc(6) Class220 local6 = this.aClass220_21;
		synchronized (this.aClass220_21) {
			this.aClass220_21.method4998(5);
		}
		local6 = this.aClass220_22;
		synchronized (this.aClass220_22) {
			this.aClass220_22.method4998(5);
		}
		local6 = this.aClass220_23;
		synchronized (this.aClass220_23) {
			this.aClass220_23.method4998(5);
		}
		local6 = this.aClass220_24;
		synchronized (this.aClass220_24) {
			this.aClass220_24.method4998(5);
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZB)V")
	public void method2822(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean224) {
			this.aBoolean224 = arg0;
			this.method2823();
		}
	}

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "(I)V")
	public void method2823() {
		@Pc(2) Class220 local2 = this.aClass220_21;
		synchronized (this.aClass220_21) {
			this.aClass220_21.method4999();
		}
		local2 = this.aClass220_22;
		synchronized (this.aClass220_22) {
			this.aClass220_22.method4999();
		}
		local2 = this.aClass220_23;
		synchronized (this.aClass220_23) {
			this.aClass220_23.method4999();
		}
		local2 = this.aClass220_24;
		synchronized (this.aClass220_24) {
			this.aClass220_24.method4999();
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)V")
	public void method2826(@OriginalArg(0) int arg0) {
		this.aClass220_21 = new Class220(arg0);
	}
}
