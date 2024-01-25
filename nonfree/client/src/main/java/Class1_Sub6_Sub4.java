import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public final class Class1_Sub6_Sub4 extends Class1_Sub6 {

	@OriginalMember(owner = "client!fa", name = "q", descriptor = "Lclient!tc;")
	private final Class195 aClass195_12 = new Class195();

	@OriginalMember(owner = "client!fa", name = "r", descriptor = "Lclient!tc;")
	private final Class195 aClass195_13 = new Class195();

	@OriginalMember(owner = "client!fa", name = "s", descriptor = "I")
	private int anInt1713 = 0;

	@OriginalMember(owner = "client!fa", name = "t", descriptor = "I")
	private int anInt1714 = -1;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method1658(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt1714 < 0) {
				this.method1667(arg0, arg1, arg2);
				return;
			}
			if (this.anInt1713 + arg2 < this.anInt1714) {
				this.anInt1713 += arg2;
				this.method1667(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt1714 - this.anInt1713;
			this.method1667(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt1713 += local33;
			this.method1666();
			@Pc(60) Class1_Sub43 local60 = (Class1_Sub43) this.aClass195_13.method5029();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method5712(this);
				if (local68 < 0) {
					local60.anInt6550 = 0;
					this.method1669(local60);
				} else {
					local60.anInt6550 = local68;
					this.method1671(local60.aClass1_247, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method1661(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt1714 < 0) {
				this.method1668(arg0);
				return;
			}
			if (this.anInt1713 + arg0 < this.anInt1714) {
				this.anInt1713 += arg0;
				this.method1668(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt1714 - this.anInt1713;
			this.method1668(local29);
			arg0 -= local29;
			this.anInt1713 += local29;
			this.method1666();
			@Pc(50) Class1_Sub43 local50 = (Class1_Sub43) this.aClass195_13.method5029();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method5712(this);
				if (local58 < 0) {
					local50.anInt6550 = 0;
					this.method1669(local50);
				} else {
					local50.anInt6550 = local58;
					this.method1671(local50.aClass1_247, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!pn;)V")
	public synchronized void method1665(@OriginalArg(0) Class1_Sub6 arg0) {
		arg0.method5710();
	}

	@OriginalMember(owner = "client!fa", name = "e", descriptor = "()V")
	private void method1666() {
		if (this.anInt1713 <= 0) {
			return;
		}
		for (@Pc(8) Class1_Sub43 local8 = (Class1_Sub43) this.aClass195_13.method5029(); local8 != null; local8 = (Class1_Sub43) this.aClass195_13.method5021()) {
			local8.anInt6550 -= this.anInt1713;
		}
		this.anInt1714 -= this.anInt1713;
		this.anInt1713 = 0;
	}

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "([III)V")
	private void method1667(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class1_Sub6 local5 = (Class1_Sub6) this.aClass195_12.method5029(); local5 != null; local5 = (Class1_Sub6) this.aClass195_12.method5021()) {
			local5.method1663(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "(I)V")
	private void method1668(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class1_Sub6 local5 = (Class1_Sub6) this.aClass195_12.method5029(); local5 != null; local5 = (Class1_Sub6) this.aClass195_12.method5021()) {
			local5.method1661(arg0);
		}
	}

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "()Lclient!pn;")
	@Override
	public Class1_Sub6 method1664() {
		return (Class1_Sub6) this.aClass195_12.method5029();
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!wo;)V")
	private void method1669(@OriginalArg(0) Class1_Sub43 arg0) {
		arg0.method5710();
		arg0.method5713();
		@Pc(9) Class1 local9 = this.aClass195_13.aClass1_207.aClass1_247;
		if (local9 == this.aClass195_13.aClass1_207) {
			this.anInt1714 = -1;
		} else {
			this.anInt1714 = ((Class1_Sub43) local9).anInt6550;
		}
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(Lclient!pn;)V")
	public synchronized void method1670(@OriginalArg(0) Class1_Sub6 arg0) {
		this.aClass195_12.method5024(arg0);
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "()I")
	@Override
	public int method1659() {
		return 0;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!mh;Lclient!wo;)V")
	private void method1671(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1_Sub43 arg1) {
		while (arg0 != this.aClass195_13.aClass1_207 && ((Class1_Sub43) arg0).anInt6550 <= arg1.anInt6550) {
			arg0 = arg0.aClass1_247;
		}
		Static113.method2081(arg0, arg1);
		this.anInt1714 = ((Class1_Sub43) this.aClass195_13.aClass1_207.aClass1_247).anInt6550;
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "()Lclient!pn;")
	@Override
	public Class1_Sub6 method1660() {
		return (Class1_Sub6) this.aClass195_12.method5021();
	}
}
