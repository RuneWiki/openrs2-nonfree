import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vn")
public final class Class3_Sub22_Sub4 extends Class3_Sub22 {

	@OriginalMember(owner = "client!vn", name = "o", descriptor = "Lclient!tj;")
	private final Class357 aClass357_63 = new Class357();

	@OriginalMember(owner = "client!vn", name = "p", descriptor = "Lclient!tj;")
	private final Class357 aClass357_64 = new Class357();

	@OriginalMember(owner = "client!vn", name = "n", descriptor = "I")
	private int anInt10842 = -1;

	@OriginalMember(owner = "client!vn", name = "q", descriptor = "I")
	private int anInt10843 = 0;

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)V")
	private void method9057(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class3_Sub22 local5 = (Class3_Sub22) this.aClass357_63.method8391(); local5 != null; local5 = (Class3_Sub22) this.aClass357_63.method8392()) {
			local5.method9304(arg0);
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lclient!fga;)V")
	public synchronized void method9058(@OriginalArg(0) Class3_Sub22 arg0) {
		this.aClass357_63.method8400(arg0);
	}

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "([III)V")
	private void method9059(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class3_Sub22 local5 = (Class3_Sub22) this.aClass357_63.method8391(); local5 != null; local5 = (Class3_Sub22) this.aClass357_63.method8392()) {
			local5.method9301(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!vn", name = "d", descriptor = "()Lclient!fga;")
	@Override
	public Class3_Sub22 method9305() {
		return (Class3_Sub22) this.aClass357_63.method8391();
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method9302(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt10842 < 0) {
				this.method9059(arg0, arg1, arg2);
				return;
			}
			if (this.anInt10843 + arg2 < this.anInt10842) {
				this.anInt10843 += arg2;
				this.method9059(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt10842 - this.anInt10843;
			this.method9059(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt10843 += local33;
			this.method9064();
			@Pc(60) Class3_Sub34 local60 = (Class3_Sub34) this.aClass357_64.method8391();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method5934(this);
				if (local68 < 0) {
					local60.anInt7074 = 0;
					this.method9063(local60);
				} else {
					local60.anInt7074 = local68;
					this.method9060(local60.aClass3_341, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lclient!an;Lclient!mia;)V")
	private void method9060(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3_Sub34 arg1) {
		while (arg0 != this.aClass357_64.aClass3_303 && ((Class3_Sub34) arg0).anInt7074 <= arg1.anInt7074) {
			arg0 = arg0.aClass3_341;
		}
		Static416.method6190(arg1, arg0);
		this.anInt10842 = ((Class3_Sub34) this.aClass357_64.aClass3_303.aClass3_341).anInt7074;
	}

	@OriginalMember(owner = "client!vn", name = "f", descriptor = "()I")
	public synchronized int method9061() {
		return this.aClass357_63.method8397();
	}

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "()Lclient!fga;")
	@Override
	public Class3_Sub22 method9303() {
		return (Class3_Sub22) this.aClass357_63.method8392();
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method9304(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt10842 < 0) {
				this.method9057(arg0);
				return;
			}
			if (this.anInt10843 + arg0 < this.anInt10842) {
				this.anInt10843 += arg0;
				this.method9057(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt10842 - this.anInt10843;
			this.method9057(local29);
			arg0 -= local29;
			this.anInt10843 += local29;
			this.method9064();
			@Pc(50) Class3_Sub34 local50 = (Class3_Sub34) this.aClass357_64.method8391();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method5934(this);
				if (local58 < 0) {
					local50.anInt7074 = 0;
					this.method9063(local50);
				} else {
					local50.anInt7074 = local58;
					this.method9060(local50.aClass3_341, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(Lclient!fga;)V")
	public synchronized void method9062(@OriginalArg(0) Class3_Sub22 arg0) {
		arg0.method9446();
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lclient!mia;)V")
	private void method9063(@OriginalArg(0) Class3_Sub34 arg0) {
		arg0.method9446();
		arg0.method5933();
		@Pc(9) Class3 local9 = this.aClass357_64.aClass3_303.aClass3_341;
		if (local9 == this.aClass357_64.aClass3_303) {
			this.anInt10842 = -1;
		} else {
			this.anInt10842 = ((Class3_Sub34) local9).anInt7074;
		}
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "()I")
	@Override
	public int method9307() {
		return 0;
	}

	@OriginalMember(owner = "client!vn", name = "e", descriptor = "()V")
	private void method9064() {
		if (this.anInt10843 <= 0) {
			return;
		}
		for (@Pc(8) Class3_Sub34 local8 = (Class3_Sub34) this.aClass357_64.method8391(); local8 != null; local8 = (Class3_Sub34) this.aClass357_64.method8392()) {
			local8.anInt7074 -= this.anInt10843;
		}
		this.anInt10842 -= this.anInt10843;
		this.anInt10843 = 0;
	}
}
