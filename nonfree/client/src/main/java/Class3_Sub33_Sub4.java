import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ufa")
public final class Class3_Sub33_Sub4 extends Class3_Sub33 {

	@OriginalMember(owner = "client!ufa", name = "n", descriptor = "Lclient!sja;")
	private final Class342 aClass342_78 = new Class342();

	@OriginalMember(owner = "client!ufa", name = "m", descriptor = "Lclient!sja;")
	private final Class342 aClass342_79 = new Class342();

	@OriginalMember(owner = "client!ufa", name = "o", descriptor = "I")
	private int anInt10021 = -1;

	@OriginalMember(owner = "client!ufa", name = "p", descriptor = "I")
	private int anInt10022 = 0;

	@OriginalMember(owner = "client!ufa", name = "b", descriptor = "(Lclient!oga;)V")
	public synchronized void method8544(@OriginalArg(0) Class3_Sub33 arg0) {
		arg0.method9596();
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(Lclient!oga;)V")
	public synchronized void method8545(@OriginalArg(0) Class3_Sub33 arg0) {
		this.aClass342_78.method7651(arg0);
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(Lclient!pw;)V")
	private void method8546(@OriginalArg(0) Class3_Sub49 arg0) {
		arg0.method9596();
		arg0.method6948();
		@Pc(9) Class3 local9 = this.aClass342_79.aClass3_291.aClass3_346;
		if (local9 == this.aClass342_79.aClass3_291) {
			this.anInt10021 = -1;
		} else {
			this.anInt10021 = ((Class3_Sub49) local9).anInt8117;
		}
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method8710(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt10021 < 0) {
				this.method8548(arg0);
				return;
			}
			if (this.anInt10022 + arg0 < this.anInt10021) {
				this.anInt10022 += arg0;
				this.method8548(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt10021 - this.anInt10022;
			this.method8548(local29);
			arg0 -= local29;
			this.anInt10022 += local29;
			this.method8549();
			@Pc(50) Class3_Sub49 local50 = (Class3_Sub49) this.aClass342_79.method7644();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method6949(this);
				if (local58 < 0) {
					local50.anInt8117 = 0;
					this.method8546(local50);
				} else {
					local50.anInt8117 = local58;
					this.method8550(local50.aClass3_346, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!ufa", name = "f", descriptor = "()I")
	public synchronized int method8547() {
		return this.aClass342_78.method7647();
	}

	@OriginalMember(owner = "client!ufa", name = "b", descriptor = "(I)V")
	private void method8548(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class3_Sub33 local5 = (Class3_Sub33) this.aClass342_78.method7644(); local5 != null; local5 = (Class3_Sub33) this.aClass342_78.method7650()) {
			local5.method8710(arg0);
		}
	}

	@OriginalMember(owner = "client!ufa", name = "e", descriptor = "()V")
	private void method8549() {
		if (this.anInt10022 <= 0) {
			return;
		}
		for (@Pc(8) Class3_Sub49 local8 = (Class3_Sub49) this.aClass342_79.method7644(); local8 != null; local8 = (Class3_Sub49) this.aClass342_79.method7650()) {
			local8.anInt8117 -= this.anInt10022;
		}
		this.anInt10021 -= this.anInt10022;
		this.anInt10022 = 0;
	}

	@OriginalMember(owner = "client!ufa", name = "c", descriptor = "()Lclient!oga;")
	@Override
	public Class3_Sub33 method8706() {
		return (Class3_Sub33) this.aClass342_78.method7644();
	}

	@OriginalMember(owner = "client!ufa", name = "b", descriptor = "()Lclient!oga;")
	@Override
	public Class3_Sub33 method8708() {
		return (Class3_Sub33) this.aClass342_78.method7650();
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "()I")
	@Override
	public int method8705() {
		return 0;
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(Lclient!tfa;Lclient!pw;)V")
	private void method8550(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3_Sub49 arg1) {
		while (arg0 != this.aClass342_79.aClass3_291 && ((Class3_Sub49) arg0).anInt8117 <= arg1.anInt8117) {
			arg0 = arg0.aClass3_346;
		}
		Static650.method8555(arg1, arg0);
		this.anInt10021 = ((Class3_Sub49) this.aClass342_79.aClass3_291.aClass3_346).anInt8117;
	}

	@OriginalMember(owner = "client!ufa", name = "c", descriptor = "([III)V")
	private void method8551(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class3_Sub33 local5 = (Class3_Sub33) this.aClass342_78.method7644(); local5 != null; local5 = (Class3_Sub33) this.aClass342_78.method7650()) {
			local5.method8704(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ufa", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method8709(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt10021 < 0) {
				this.method8551(arg0, arg1, arg2);
				return;
			}
			if (this.anInt10022 + arg2 < this.anInt10021) {
				this.anInt10022 += arg2;
				this.method8551(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt10021 - this.anInt10022;
			this.method8551(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt10022 += local33;
			this.method8549();
			@Pc(60) Class3_Sub49 local60 = (Class3_Sub49) this.aClass342_79.method7644();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method6949(this);
				if (local68 < 0) {
					local60.anInt8117 = 0;
					this.method8546(local60);
				} else {
					local60.anInt8117 = local68;
					this.method8550(local60.aClass3_346, local60);
				}
			}
		} while (arg2 != 0);
	}
}
