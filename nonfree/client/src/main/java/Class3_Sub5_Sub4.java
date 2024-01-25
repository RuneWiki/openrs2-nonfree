import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sv")
public final class Class3_Sub5_Sub4 extends Class3_Sub5 {

	@OriginalMember(owner = "client!sv", name = "t", descriptor = "Lclient!tu;")
	private final Class229 aClass229_42 = new Class229();

	@OriginalMember(owner = "client!sv", name = "u", descriptor = "Lclient!tu;")
	private final Class229 aClass229_43 = new Class229();

	@OriginalMember(owner = "client!sv", name = "w", descriptor = "I")
	private int anInt6621 = 0;

	@OriginalMember(owner = "client!sv", name = "v", descriptor = "I")
	private int anInt6620 = -1;

	@OriginalMember(owner = "client!sv", name = "e", descriptor = "()I")
	public synchronized int method5192() {
		return this.aClass229_42.method5324();
	}

	@OriginalMember(owner = "client!sv", name = "d", descriptor = "(I)V")
	private void method5193(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class3_Sub5 local5 = (Class3_Sub5) this.aClass229_42.method5328(); local5 != null; local5 = (Class3_Sub5) this.aClass229_42.method5325()) {
			local5.method5190(arg0);
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lclient!kb;)V")
	private void method5194(@OriginalArg(0) Class3_Sub24 arg0) {
		arg0.method5987();
		arg0.method3370();
		@Pc(9) Class3 local9 = this.aClass229_43.aClass3_233.aClass3_261;
		if (local9 == this.aClass229_43.aClass3_233) {
			this.anInt6620 = -1;
		} else {
			this.anInt6620 = ((Class3_Sub24) local9).anInt4111;
		}
	}

	@OriginalMember(owner = "client!sv", name = "f", descriptor = "()V")
	private void method5195() {
		if (this.anInt6621 <= 0) {
			return;
		}
		for (@Pc(8) Class3_Sub24 local8 = (Class3_Sub24) this.aClass229_43.method5328(); local8 != null; local8 = (Class3_Sub24) this.aClass229_43.method5325()) {
			local8.anInt4111 -= this.anInt6621;
		}
		this.anInt6620 -= this.anInt6621;
		this.anInt6621 = 0;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "()I")
	@Override
	public int method5185() {
		return 0;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lclient!ar;)V")
	public synchronized void method5196(@OriginalArg(0) Class3_Sub5 arg0) {
		arg0.method5987();
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method5189(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt6620 < 0) {
				this.method5198(arg0, arg1, arg2);
				return;
			}
			if (this.anInt6621 + arg2 < this.anInt6620) {
				this.anInt6621 += arg2;
				this.method5198(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt6620 - this.anInt6621;
			this.method5198(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt6621 += local33;
			this.method5195();
			@Pc(60) Class3_Sub24 local60 = (Class3_Sub24) this.aClass229_43.method5328();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method3369(this);
				if (local68 < 0) {
					local60.anInt4111 = 0;
					this.method5194(local60);
				} else {
					local60.anInt4111 = local68;
					this.method5199(local60.aClass3_261, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "(Lclient!ar;)V")
	public synchronized void method5197(@OriginalArg(0) Class3_Sub5 arg0) {
		this.aClass229_42.method5320(arg0);
	}

	@OriginalMember(owner = "client!sv", name = "d", descriptor = "()Lclient!ar;")
	@Override
	public Class3_Sub5 method5188() {
		return (Class3_Sub5) this.aClass229_42.method5325();
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method5190(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt6620 < 0) {
				this.method5193(arg0);
				return;
			}
			if (this.anInt6621 + arg0 < this.anInt6620) {
				this.anInt6621 += arg0;
				this.method5193(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt6620 - this.anInt6621;
			this.method5193(local29);
			arg0 -= local29;
			this.anInt6621 += local29;
			this.method5195();
			@Pc(50) Class3_Sub24 local50 = (Class3_Sub24) this.aClass229_43.method5328();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method3369(this);
				if (local58 < 0) {
					local50.anInt4111 = 0;
					this.method5194(local50);
				} else {
					local50.anInt4111 = local58;
					this.method5199(local50.aClass3_261, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!sv", name = "c", descriptor = "([III)V")
	private void method5198(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class3_Sub5 local5 = (Class3_Sub5) this.aClass229_42.method5328(); local5 != null; local5 = (Class3_Sub5) this.aClass229_42.method5325()) {
			local5.method5191(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!sv", name = "c", descriptor = "()Lclient!ar;")
	@Override
	public Class3_Sub5 method5187() {
		return (Class3_Sub5) this.aClass229_42.method5328();
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lclient!lf;Lclient!kb;)V")
	private void method5199(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3_Sub24 arg1) {
		while (arg0 != this.aClass229_43.aClass3_233 && ((Class3_Sub24) arg0).anInt4111 <= arg1.anInt4111) {
			arg0 = arg0.aClass3_261;
		}
		Static359.method5093(arg0, arg1);
		this.anInt6620 = ((Class3_Sub24) this.aClass229_43.aClass3_233.aClass3_261).anInt4111;
	}
}
